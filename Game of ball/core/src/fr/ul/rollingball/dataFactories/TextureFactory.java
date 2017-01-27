package fr.ul.rollingball.dataFactories;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.files.FileHandle;
import com.badlogic.gdx.graphics.Texture;

/**
 * Created by mattei4u on 24/01/17.
 */
public class TextureFactory {

    private static final Texture intro = new Texture(Gdx.files.internal("images/Intro.jpg"));
    private static final Texture decor = new Texture(Gdx.files.internal("images/Deco.jpg"));
    private static final Texture badlogic = new Texture(Gdx.files.internal("images/badlogic.jpg"));
    private static final Texture bravo = new Texture(Gdx.files.internal("images/Bravo.jpg"));
    private static final Texture boule = new Texture(Gdx.files.internal("images/boule.bmp"));
    private static final Texture pastilleNormal = new Texture(Gdx.files.internal("images/pastilleNormale.bmp"));
    private static final Texture pastilleTaille = new Texture(Gdx.files.internal("images/pastilleTaille.bmp"));
    private static final Texture pastilleTemps = new Texture(Gdx.files.internal("images/pastilleTemps.bmp"));
    private static final Texture perte = new Texture(Gdx.files.internal("images/Perte.bmp"));

    //private static final FileHandle listLaby = new FileHandle("images/Laby");

    private static TextureFactory ourInstance = new TextureFactory();

    public static TextureFactory getInstance() {
        return ourInstance;
    }

    private TextureFactory() {
    }

    public static Texture getBadlogic() { return badlogic; }

    public static Texture getBravo() { return bravo; }

    public static Texture getPerte() { return perte; }

    public static Texture getPastilleTemps() { return pastilleTemps; }

    public static Texture getPastilleTaille() { return pastilleTaille; }

    public static Texture getPastilleNormal() { return pastilleNormal; }

    public static Texture getBoule() { return boule; }

    public static Texture getIntro() {
        return intro;
    }

    public static Texture getDecor() {
        return decor;
    }
}
