package fr.ul.rollingball.models;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Pixmap;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Vector2;

import fr.ul.rollingball.dataFactories.TextureFactory;
import fr.ul.rollingball.views.GameScreen;

/**
 * Created by mattei4u on 27/01/17.
 */

public class World {

    protected GameScreen ecran;
    protected Boule boule;
    protected Pill pastille;
    protected int numLaby;
    protected Pixmap pixLaby;
    protected Texture textLaby;

    public World(GameScreen gs){
        ecran = gs;
        boule = new Boule(this, new Vector2(Gdx.graphics.getWidth()/2,Gdx.graphics.getHeight()/2));
        pastille = new Pill(this,new Vector2(100,200));
        numLaby = 1;
        pixLaby = TextureFactory.getInstance().getPixLaby(numLaby);
        textLaby = new Texture(pixLaby);

    }


    public void draw(SpriteBatch sb){

        sb.draw(TextureFactory.getInstance().getDecor(), 0, 0, Gdx.graphics.getWidth(), Gdx.graphics.getHeight());
        sb.draw(textLaby, 0, 0, Gdx.graphics.getWidth(), Gdx.graphics.getHeight());
        boule.draw(sb);
        pastille.draw(sb);

    }

    public Boule getBoule() {
        return boule;
    }


}
