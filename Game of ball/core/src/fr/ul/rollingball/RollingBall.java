package fr.ul.rollingball;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

import fr.ul.rollingball.views.GameScreen;
import fr.ul.rollingball.views.SplashScreen;

public class RollingBall extends Game {
	SpriteBatch batch;
	Texture img;
	SplashScreen intro;
	GameScreen jeu;
	
	@Override
	public void create () {
		batch = new SpriteBatch();
		img = new Texture("badlogic.jpg");
		intro = new SplashScreen(this);
		jeu = new GameScreen(this);
		this.setScreen(intro);
	}

	
	@Override
	public void dispose () {
		batch.dispose();
		img.dispose();
		intro.dispose();
		jeu.dispose();
	}

	public void setScreenJeu() {
		this.setScreen(jeu);
	}
}
