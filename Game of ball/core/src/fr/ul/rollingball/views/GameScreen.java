package fr.ul.rollingball.views;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.ScreenAdapter;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Vector2;

import fr.ul.rollingball.RollingBall;
import fr.ul.rollingball.dataFactories.TextureFactory;
import fr.ul.rollingball.models.World;

/**
 * Created by mattei4u on 26/01/17.
 */

public class GameScreen extends ScreenAdapter {

    protected RollingBall rollball;
    protected SpriteBatch batch;
    protected World monde;

    public GameScreen(RollingBall rb){

        batch = new SpriteBatch();
        rollball = rb;
        monde = new World(this);
    }

    @Override
    public void render(float delta){
        update();
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT | GL20.GL_DEPTH_BUFFER_BIT);
        batch.begin();
        batch.draw(TextureFactory.getInstance().getDecor(), 0, 0, Gdx.graphics.getWidth(), Gdx.graphics.getHeight());
        monde.getBoule().draw(batch);
        batch.end();


    }

    private void update() {
        float accX = Gdx.input.getAccelerometerX()/100;
        float accY = Gdx.input.getAccelerometerY()/100;

        monde.getBoule().addVitesse(new Vector2(accY,-accX));
        monde.getBoule().majPos();

    }

    public void dispose(){
        batch.dispose();

    }

}
