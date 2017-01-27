package fr.ul.rollingball.models;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Vector2;

/**
 * Created by mattei4u on 27/01/17.
 */

public class MoveableElement extends GameElement {

    protected Vector2 vitesse;

    public MoveableElement(World wld, Vector2 v){
        super(wld, v);
        this.vitesse = new Vector2(0,0);
    }

    @Override
    public void draw(SpriteBatch sb) {

    }

    public Vector2 getVitesse() {
        return vitesse;
    }

    public void setVitesse(Vector2 vitesse) {
        this.vitesse = vitesse;
    }

    public void majPos(Vector2 vitesse){
        this.getPos().add(vitesse);
    }
}
