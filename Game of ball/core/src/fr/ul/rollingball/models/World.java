package fr.ul.rollingball.models;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.math.Vector2;

import fr.ul.rollingball.views.GameScreen;

/**
 * Created by mattei4u on 27/01/17.
 */

public class World {

    protected GameScreen ecran;
    protected Boule boule;

    public World(GameScreen gs){
        ecran = gs;
        boule = new Boule(this, new Vector2(Gdx.graphics.getWidth()/2,Gdx.graphics.getHeight()/2));
    }

    public Boule getBoule() {
        return boule;
    }
}
