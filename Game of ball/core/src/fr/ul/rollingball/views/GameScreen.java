package fr.ul.rollingball.views;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.ScreenAdapter;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

import fr.ul.rollingball.RollingBall;
import fr.ul.rollingball.dataFactories.TextureFactory;

/**
 * Created by mattei4u on 26/01/17.
 */

public class GameScreen extends ScreenAdapter {

    protected RollingBall rollball;
    protected SpriteBatch batch;

    public GameScreen(RollingBall rb){

        batch = new SpriteBatch();
        rollball = rb;
    }

    @Override
    public void render(float delta){
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT | GL20.GL_DEPTH_BUFFER_BIT);
        batch.begin();
        batch.draw(TextureFactory.getInstance().getDecor(), 0, 0, Gdx.graphics.getWidth(), Gdx.graphics.getHeight());
        batch.end();

    }

    public void dispose(){
        batch.dispose();
    }

}
