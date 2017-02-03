package fr.ul.rollingball.models;


import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Vector2;

import fr.ul.rollingball.dataFactories.TextureFactory;

/**
 * Created by mattei4u on 27/01/17.
 */

public class Boule extends MoveableElement {

    protected static float rayon_defaut = 50;
    protected float rayon;

    public Boule(World wld, Vector2 v){
        super(wld,v);
        this.rayon = rayon_defaut;
    }

    public void draw(SpriteBatch sb){
       sb.draw(TextureFactory.getInstance().getBadlogic(), getPos().x,getPos().y, rayon, rayon);
    }

}
