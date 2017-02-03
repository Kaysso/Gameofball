package fr.ul.rollingball.dataFactories;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.audio.Sound;
import com.badlogic.gdx.files.FileHandle;

/**
 * Created by mattei4u on 03/02/17.
 */
public class SoundFactory {


    private static final Sound alerte = Gdx.audio.newSound(new FileHandle("sounds/alerte.mp3"));
    private static final Sound collision = Gdx.audio.newSound(new FileHandle("sounds/collision.wav"));
    private static final Sound pastille = Gdx.audio.newSound(new FileHandle("sounds/pastille.wav"));
    private static final Sound perte = Gdx.audio.newSound(new FileHandle("sounds/perte.mp3"));
    private static final Sound ptaille = Gdx.audio.newSound(new FileHandle("sounds/ptaille.wav"));
    private static final Sound ptemps = Gdx.audio.newSound(new FileHandle("sounds/ptemps.wav"));
    private static final Sound victoire = Gdx.audio.newSound(new FileHandle("sounds/victoire.mp3"));

    private static SoundFactory ourInstance = new SoundFactory();


    public static void playAlerte(float vol) {
        alerte.play(vol);
    }

    public static void playCollision(float vol) {
        collision.play(vol);
    }

    public static void playPastille(float vol) {
        pastille.play(vol);
    }

    public static void playPerte(float vol) {
        perte.play(vol);
    }

    public static void playPtaille(float vol) {
        ptaille.play(vol);
    }

    public static void playPtemps(float vol) {
        ptemps.play(vol);
    }

    public static void playVictoire(float vol) {
        victoire.play(vol);
    }

    public static SoundFactory getInstance() {
        return ourInstance;
    }

    private SoundFactory() {
    }
}
