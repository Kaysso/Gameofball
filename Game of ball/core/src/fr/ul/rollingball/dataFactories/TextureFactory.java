package fr.ul.rollingball.dataFactories;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.files.FileHandle;
import com.badlogic.gdx.graphics.Pixmap;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Animation;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.TextureAtlas;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.utils.Array;

import java.io.File;
import java.io.FileFilter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/**
 * Created by mattei4u on 24/01/17.
 */
public class TextureFactory {

    private static final Texture intro = new Texture(Gdx.files.internal("images/Intro.jpg"));
    private static final Texture decor = new Texture(Gdx.files.internal("images/Deco.jpg"));
    private static final Texture badlogic = new Texture(Gdx.files.internal("images/badlogic.jpg"));
    private static final Texture bravo = new Texture(Gdx.files.internal("images/Bravo.bmp"));
    private static final Texture boule = new Texture(Gdx.files.internal("images/boule.bmp"));
    private static final Texture pastilleNormal = new Texture(Gdx.files.internal("images/pastilleNormale.bmp"));
    private static final Texture pastilleTaille = new Texture(Gdx.files.internal("images/pastilleTaille.bmp"));
    private static final Texture pastilleTemps = new Texture(Gdx.files.internal("images/pastilleTemps.bmp"));
    private static final Texture pastilleTempsanim = new Texture(Gdx.files.internal("images/pastilleTemps.png"));
    private static final Texture pastilleNormalanim = new Texture(Gdx.files.internal("images/pastilleNormale.png"));
    private static final Texture perte = new Texture(Gdx.files.internal("images/Perte.bmp"));

    private static Array<Sprite> spritePillnorm = new TextureAtlas(new FileHandle("images/pastilleNormale.pack")).createSprites();
    private static Array<Sprite> spritePilltaille = new TextureAtlas(new FileHandle("images/pastilleTaille.pack")).createSprites();

    //private static Animation spritePilltemp = new TextureRegion(pastilleTempsanim);

    private static final FileHandle[] listLaby = Gdx.files.internal("images/").list(new FileFilter() {

        @Override
        public boolean accept(File file) {
            if(file.getPath().matches("images/Laby.*[.]png"))
                return true;
            else
                return false;
        }
    });



    private static TextureFactory ourInstance = new TextureFactory();

    public static TextureFactory getInstance() {
        return ourInstance;
    }

    private TextureFactory() {

        Array<String> AlistLaby = new Array<String>();

        for(FileHandle f : listLaby){

            AlistLaby.add(f.toString());
        }

        AlistLaby.sort();
        int i = 0;
        for(String s : AlistLaby){
            listLaby[i] = new FileHandle(s);
            i++;
        }


    }

    public static Pixmap getPixLaby(int i){

        Pixmap pix = new Pixmap(listLaby[i]);

        return pix;
    }

    public static int getNbLaby(){
        return listLaby.length;
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

    public static Texture getPastilleTempsanim() { return pastilleTempsanim; }

    public static Texture getPastilleNormalanim() { return pastilleNormalanim; }
}
