package monster.controller;

import monster.model.MarshmallowMonster;
import monster.view.MonsterView;

public class MonsterAppController
{
	private MonsterView myAppView;
	private MarshmallowMonster myMonster;
	private MarshmallowMonster otherMonster;
	
	public MonsterAppController()
	{
		myAppView = new MonsterView(this);
		myMonster = new MarshmallowMonster("Vladimir", 4.0, 4.0, 4, 1, 2, true);
		otherMonster = new MarshmallowMonster("John Jacob Jingleheimer Schmidt", 0.001, 0.2, 5, 0, 0, true);
		
		//create your monster here
	}
	public MarshmallowMonster getMyMonster()
	{
		return myMonster;
	}
	
	public void start()
	{
		myAppView.displayInformation();
	}
}
