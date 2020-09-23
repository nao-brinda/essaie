package TP1;

import java.util.ArrayList;

public class Test {
	static int nbNavigateur = 4, nbPosition = 5;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Navigateur[] tabNav = new Navigateur[nbNavigateur];
		Position[][] tabPos = new Position[nbNavigateur][nbPosition];
		
		tabNav[0]= new Navigateur("Grincheux");
		tabNav[1]= new Navigateur("Simplet");
		tabNav[2]= new Navigateur("Atchoum");
		tabNav[3]= new Navigateur("Joyeux");
		
		for(int i=0;i<nbNavigateur;i++) {
			tabNav[i].toString();
			for(int j=0;j<nbPosition;j++) {
				tabPos[i][j] = new Position(i,j);
				tabNav[i].Ajout(tabPos[i][j]);
				
				tabPos[i][j].toString();
			}
			System.out.println("\n");
		}
	}

}
