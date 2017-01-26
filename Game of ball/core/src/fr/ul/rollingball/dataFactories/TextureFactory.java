package fr.ul.rollingball.dataFactories;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;

/**
 * Created by mattei4u on 24/01/17.
 */
public class TextureFactory {

    protected static final Texture intro = new Texture(Gdx.files.internal("Intro.jpg"));
    protected static final Texture decor = new Texture(Gdx.files.internal("Deco.jpg"));

    private static TextureFactory ourInstance = new TextureFactory();

    public static TextureFactory getInstance() {
        return ourInstance;
    }

    private TextureFactory() {
    }

    public static Texture getIntro() {
        return intro;
    }

    public static Texture getDecor() {
        return decor;
    }
}
