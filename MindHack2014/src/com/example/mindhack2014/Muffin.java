package com.example.mindhack2014;

public class Muffin {
	
	
	private int muffinHP, muffinDmg;
	private String muffinImgURL;
	
	public Muffin(int HP, int Dmg, String URL)
	{
		muffinHP = HP;
		muffinDmg = Dmg;
		muffinImgURL = URL;
	}
	
	
	public void setMuffinHP(int hp)
	{
		this.muffinHP += hp;
	}
	
	public int getMuffinHP()
	{
		return muffinHP;
	}
	
	public void setMuffinDmg(int dmg)
	{
		this.muffinDmg = dmg;
	}
	
	public int getMuffinDmg()
	{
		return muffinDmg;
	}
	
	public void setMuffinImgURL(String URL)
	{
		this.muffinImgURL = URL;
	}
	
	public String getMuffinImgURL()
	{
		return muffinImgURL;
	}

}
