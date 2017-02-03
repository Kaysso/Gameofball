package fr.ul.rollingball.models;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Vector2;

import fr.ul.rollingball.dataFactories.TextureFactory;

/**
 * Created by mattei4u on 03/02/17.
 */

public /*abstract*/ class Pill extends GameElement {

    public static float rayon = 5;

    public Pill(World wld, Vector2 v){
        super(wld,v);
    }

    public static float getRayon() {
        return rayon;
    }

    public void draw(SpriteBatch sb) {
        sb.draw(TextureFactory.getInstance().getPastilleNormal(),getPos().x,getPos().y, rayon, rayon);
    }

    //public abstract void effect();



}
