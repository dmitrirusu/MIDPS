package com.ardimval.game;

import com.badlogic.gdx.InputProcessor;


public class MyInputAdapter implements InputProcessor {
    @Override
    public boolean keyDown(int keycode) {
        return false;
    }

    @Override
    public boolean keyUp(int keycode) {
        return false;
    }

    @Override
    public boolean keyTyped(char character) {
        return false;
    }

    @Override
    public boolean touchDown(int screenX, int screenY, int pointer, int button) {
        System.out.println("X : "+screenX);
        System.out.println("Y : "+screenY);

        if(screenX <610 && screenX >342 && screenY <320 && screenY > 160 && B2DValues.currentState ==1) {
            B2DValues.currentState = 2;
            B2DValues.gsm.setState(2);
        }
        if(screenX <175 && screenX > 20 && screenY <160 && screenY > 290 && B2DValues.currentState == 0) {
            B2DValues.left = true;
        }
        if(screenX <175 && screenX > 20 && screenY <530 && screenY > 440&& B2DValues.currentState == 0) {
            B2DValues.left = true;
        }
        if(screenX <340 && screenX > 185 && screenY <530 && screenY > 440&& B2DValues.currentState == 0)
            B2DValues.right = true;
        if(screenX <915 && screenX > 800 && screenY <525 && screenY > 380&& B2DValues.currentState == 0)
            B2DValues.jumpButton = true;

        return true;
    }

    @Override
    public boolean touchUp(int screenX, int screenY, int pointer, int button) {
        if(screenX <175 && screenX > 20 && screenY <530 && screenY > 440&& B2DValues.currentState == 0)
            B2DValues.left = false;
        if(screenX <340 && screenX > 185 && screenY <530 && screenY > 440&& B2DValues.currentState == 0)
            B2DValues.right = false;
        if(screenX <915 && screenX > 800 && screenY <525 && screenY > 380&& B2DValues.currentState == 0)
            B2DValues.jumpButton = false;
        return true;
    }

    @Override
    public boolean touchDragged(int screenX, int screenY, int pointer) {
        return false;
    }

    @Override
    public boolean mouseMoved(int screenX, int screenY) {
        return false;
    }

    @Override
    public boolean scrolled(int amount) {
        return false;
    }
}
