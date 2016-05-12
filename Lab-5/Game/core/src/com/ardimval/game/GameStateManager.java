package com.ardimval.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.assets.AssetManager;
import com.badlogic.gdx.audio.Music;
import com.badlogic.gdx.audio.Sound;

public class GameStateManager {

    public static final int PLAY = 0;
    public static  final int MENU = 1;
    public static  final  int LEVEL_SELECT =2;

    GameState state;
    Music backgroundMusic;

    public GameStateManager(){
        backgroundMusic = Gdx.audio.newMusic(Gdx.files.internal("res/sounds/background.ogg"));
        setState(MENU);
    }

    public void setMusic(){
        if(!backgroundMusic.isPlaying()) {
            backgroundMusic.setVolume(0.5f);
            backgroundMusic.play();
            backgroundMusic.setLooping(true);
        }
    }

    public void setState(int state){
        if(state == PLAY)
            this.state = new PlayState();
        if(state == MENU)
            this.state = new Menu();
        if(state == LEVEL_SELECT)
            this.state = new LevelSelectState();
    }

    public void update(){
            setMusic();
        state.update();
    }

    public void draw(){
        state.draw();
    }
}
