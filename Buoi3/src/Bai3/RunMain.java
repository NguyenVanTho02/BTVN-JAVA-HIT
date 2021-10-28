package Bai3;

import java.util.Random;

public class RunMain {
	public static void main(String[] args) {
		Random rand = new Random();
		Guns AnhDiep = new Guns();
		Guns AnhDoan = new Guns();
		
		AnhDiep.setWeaponName("AK");
		AnhDiep.setAmmoNumber(100);
		
		AnhDoan.setWeaponName("Luc ghe");
		AnhDoan.setAmmoNumber(100);
		
		while(AnhDiep.getAmmoNumber() != 0 && AnhDoan.getAmmoNumber() != 0) {
			AnhDiep.Shoot(rand.nextInt(10) + 1);
			AnhDoan.Shoot(rand.nextInt(10) + 1);
			
			if (AnhDiep.getAmmoNumber() == 0 && AnhDoan.getAmmoNumber() == 0) {
				AnhDiep.Load(rand.nextInt(10) + 1);
				AnhDoan.Load(rand.nextInt(10) + 1);
			} else if (AnhDiep.getAmmoNumber() == 0 && AnhDoan.getAmmoNumber() != 0) {
				System.out.println("Anh Doan Win");
			} else if (AnhDiep.getAmmoNumber() != 0 && AnhDoan.getAmmoNumber() == 0) {
				System.out.println("Anh Diep Win");
			}
		}
		
	}
}
