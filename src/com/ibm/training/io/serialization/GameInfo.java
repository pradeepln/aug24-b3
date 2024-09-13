package com.ibm.training.io.serialization;

import java.io.Serializable;

public class GameInfo implements Serializable {
	
	private String avatarName;
	private int level = 1;
	private int livesLeft = 10;
	private int points;
	
	public String getAvatarName() {
		return avatarName;
	}
	public void setAvatarName(String avatarName) {
		this.avatarName = avatarName;
	}
	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		this.level = level;
	}
	public int getLivesLeft() {
		return livesLeft;
	}
	public void setLivesLeft(int livesLeft) {
		this.livesLeft = livesLeft;
	}
	public int getPoints() {
		return points;
	}
	public void setPoints(int points) {
		this.points = points;
	}
	
	@Override
	public String toString() {
		return "GameInfo [avatarName=" + avatarName + ", level=" + level + ", livesLeft=" + livesLeft + ", points="
				+ points + "]";
	}
	
	

}
