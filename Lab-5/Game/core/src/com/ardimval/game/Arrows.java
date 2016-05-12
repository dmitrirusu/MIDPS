package com.ardimval.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureAtlas;
import com.badlogic.gdx.graphics.g2d.TextureRegion;


public class Arrows {

    TextureRegion arrowLeft,arrowRight,arrowUp;

    public Arrows(){
        TextureAtlas atlas = new TextureAtlas(Gdx.files.internal("res/PNG/character/arrows/arrows.atlas"));
        arrowLeft = atlas.findRegion("arrowLeft");
        arrowRight = atlas.findRegion("arrowRight");
        arrowUp = atlas.findRegion("arrowUp");
    }

    public void draw(SpriteBatch batch,OrthographicCamera camera){
        batch.begin();
        batch.draw(arrowLeft,camera.position.x-450,camera.position.y-250);
        batch.draw(arrowRight,camera.position.x-280,camera.position.y-250);
        batch.draw(arrowUp,camera.position.x+310,camera.position.y-250);
        batch.end();
    }
}
