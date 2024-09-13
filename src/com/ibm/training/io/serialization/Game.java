package com.ibm.training.io.serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class Game {
	
	GameInfo info = new GameInfo();
	
	public void play() {
		info.setPoints(info.getPoints()+1);
		info.setLivesLeft(info.getLivesLeft()-1);
		//lots of other playing
	}

	public void saveGame() {
		try {
			FileOutputStream fos = new FileOutputStream("D:/temp/Aug24/b3/game.ser");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(info); //serialization
			oos.close();
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void restoreGame() {
		try {
			FileInputStream fis = new FileInputStream("D:/temp/Aug24/b3/game.ser");
			ObjectInputStream ois = new ObjectInputStream(fis);
			info = (GameInfo) ois.readObject(); //deserialization
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		
		Scanner kb = new Scanner(System.in);
		
		Game game = new Game();
		game.restoreGame();
		System.out.println("Current state of the game : "+game.info);
		
		System.out.println("Further playing....");
		game.play();
		
		System.out.println("Current state of the game : "+game.info);
		System.out.println("hit any key to end...");
		kb.nextLine();
		
		game.saveGame();
	}

}
