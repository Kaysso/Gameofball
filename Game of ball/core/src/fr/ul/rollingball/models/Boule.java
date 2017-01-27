package fr.ul.rollingball.models;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Vector2;

/**
 * Created by mattei4u on 27/01/17.
 */

public class Boule extends MoveableElement {

    protected static float rayon_defaut = 100;
    protected float rayon;

    public Boule(World wld, Vector2 v){
        super(wld,v);
        this.rayon = rayon_defaut;
    }

    public void draw(SpriteBatch sb){
       sb.draw(new Texture(Gdx.files.internal("images/badlogic.jpg")),getPos().x,getPos().y, rayon, rayon);
    }

}
