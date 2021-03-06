package fr.ul.rollingball.views;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.ScreenAdapter;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Gdx2DPixmap;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

import fr.ul.rollingball.RollingBall;
import fr.ul.rollingball.dataFactories.SoundFactory;
import fr.ul.rollingball.dataFactories.TextureFactory;

/**
 * Created by mattei4u on 24/01/17.
 */

public class SplashScreen extends ScreenAdapter {

    protected RollingBall rollball;
    protected SpriteBatch batch;
    protected float duree;


    public SplashScreen(RollingBall rb){

        batch = new SpriteBatch();
        rollball = rb;
        SoundFactory.getInstance().playVictoire(20);
    }

    public void show(){
        duree = 0;
    }



    @Override
    public void render(float delta){
        duree += delta;
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT | GL20.GL_DEPTH_BUFFER_BIT);
        batch.begin();
        batch.draw(TextureFactory.getInstance().getIntro(), 0, 0, Gdx.graphics.getWidth(), Gdx.graphics.getHeight());
        batch.end();

        if(duree > 5){
            rollball.setScreenJeu();
        }



    }

    public void dispose(){
        batch.dispose();
    }



}
