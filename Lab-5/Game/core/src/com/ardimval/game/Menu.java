package com.ardimval.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.maps.tiled.TiledMapRenderer;
import com.badlogic.gdx.maps.tiled.TmxMapLoader;
import com.badlogic.gdx.maps.tiled.renderers.OrthogonalTiledMapRenderer;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.physics.box2d.*;

import static com.ardimval.game.B2DValues.*;
import static com.ardimval.game.B2DValues.world;


public class Menu extends GameState {

    Box2DDebugRenderer b2dRenderer;
    TiledMapRenderer tmapRenderer;
    Player player;
    Texture texture,play;
    float time;
    boolean border;
    int width,playWidth;

    public Menu(){
        world = new World(new Vector2(0,-9.81f),true);
        world.setContactListener(cl);
        Gdx.input.setInputProcessor(new MyInputAdapter());
        tmap = new TmxMapLoader().load("res/maps/main.tmx");
        b2dRenderer = new Box2DDebugRenderer();
        tmapRenderer = new OrthogonalTiledMapRenderer(tmap);
        texture = new Texture(Gdx.files.internal("res/PNG/font/font.png"));
        play = new Texture(Gdx.files.internal("res/PNG/font/newPlay.png"));
        play.setFilter(Texture.TextureFilter.Linear, Texture.TextureFilter.Linear);
        width = texture.getWidth();
        playWidth = play.getWidth();
        border = false;
        new Ground();
        player = new Player(null);
    }


    @Override
    public void update() {
        handleInput();
        world.step(1 / 60f, 6, 2);

    }

    private void handleInput() {
        //  left = false;
        //  right = false;
        //  jumpButton = false;



        if(onGround > 0) {

            if (player.player.getPosition().x*PPM <1100 && player.player.getPosition().x*PPM > 1090 ){
                border = true;
            }

            if (player.player.getPosition().x*PPM <220 && player.player.getPosition().x*PPM > 210 ){
                border = false;
            }
            if (!border) {
                player.player.setLinearVelocity(200/PPM,0);
                //player.applyLinearImpulse(0.1f, 0, 0, 0, true);
                right = true;
                left = false;
                previous = false;
            }

            else {
                player.player.setLinearVelocity(-200/PPM,0);
                // player.applyLinearImpulse(-0.1f, 0, 0, 0, true);
                left = true;
                right = false;
                previous = true;
            }
        }
    }

    public void checkCamera(OrthographicCamera cam){
        int mapLeft =0;
        int mapRight =tmap.getProperties().get("width",Integer.class)*70;
        int mapBottom = 0;
        int mapUp = tmap.getProperties().get("height",Integer.class)*70;
        if(cam.position.x <= mapLeft + cam.viewportWidth/2){
            cam.position.x = mapLeft + cam.viewportWidth/2;

        }
        else if(cam.position.x >= mapRight - cam.viewportWidth/2){
            cam.position.x = mapRight - cam.viewportWidth/2;

        }
        if(cam.position.y <= mapBottom + cam.viewportHeight/2){
            cam.position.y = mapBottom + cam.viewportHeight/2;
        }
        if(cam.position.y >= mapUp - cam.viewportHeight/2){
            cam.position.y = mapUp - cam.viewportHeight/2;
        }
    }
    @Override
    public void draw() {
        tmapRenderer.setView(camera);
        tmapRenderer.render();
        time += Gdx.graphics.getDeltaTime();
        player.draw(batch,time,camera);
        batch.setProjectionMatrix(camera.combined);
        camera.position.set(player.player.getPosition().x * PPM + Main.Width / 4, Main.Heigth / 2, 0);
        checkCamera(camera);
        camera.update();
        batch.begin();
        batch.draw(texture,camera.position.x-width/2,camera.position.y*3/2);
        batch.draw(play,camera.position.x-playWidth/4,camera.position.y-50,336,168);
        batch.end();
        b2dRenderer.render(world,b2dCamera.combined);
    }
}
