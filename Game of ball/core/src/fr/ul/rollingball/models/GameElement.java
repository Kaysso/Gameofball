package fr.ul.rollingball.models;


import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Vector2;


/**
 * Created by mattei4u on 27/01/17.
 */

public abstract class GameElement {

    protected World monde;
    protected Vector2 pos;

    public GameElement(World wld, Vector2 v){

        this.monde = wld;
        this.pos = v;
    }

    public Vector2 getPos() {
        return pos;
    }

    public abstract void draw(SpriteBatch sb);
}
