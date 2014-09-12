package monster.view;

import javax.swing.JOptionPane;

import monster.controller.MonsterAppController;

public class MonsterView
{
	private MonsterAppController baseController;
	
	public MonsterView(MonsterAppController baseController)
	{
		this.baseController = baseController;
	}
	
	public void displayInformation()
	{
		JOptionPane.showMessageDialog(null, "I made a monster.");
		JOptionPane.showMessageDialog(null, "His name is " + baseController.getMyMonster().getName()+ ".");
		JOptionPane.showMessageDialog(null, "He has " + baseController.getMyMonster().getEyeCount() + " eyes.");
		JOptionPane.showMessageDialog(null, "He only has " + baseController.getMyMonster().getHairCount() + " hairs on his head.");
		JOptionPane.showMessageDialog(null, "He walks on " + baseController.getMyMonster().getNumberofLegs() + " long legs.");
		JOptionPane.showMessageDialog(null, "He has " + baseController.getMyMonster().getNoseCount() + " adorable nose!");
	}
}
