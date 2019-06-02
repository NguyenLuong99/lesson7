package com.k001.Basic;
import java.util.Scanner;
public class Main {
	private static Scanner in;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book b1= new Book();
		System.out.println("Add idBook : ");
		b1.idBook= in.nextLine();
		System.out.println("Add nameBook : ");
		b1.nameBook=in.nextLine();
		System.out.println("Add Athur: ");
		b1.Author= in.nextLine();
		System.out.println("Add Public : ");
		b1.Public=in.nextLine();
		System.out.println("Add Speciality : ");
		System.out.println("1. Cong Nghe Thong Tin.");
		System.out.println("2. Khoa Hoc- Doi Song. ");
		System.out.println("3. Van hoc - Nghe Thuat.");
		int choice=in.nextInt();
		switch(choice){
		case 1 : {
			b1.setSpeciality("Cong Nghe Thong tin");
			break;
		}
		case 2:{
			b1.setSpeciality("Khoa Hoc- Doi Song");
			break;
		}
		case 3:{
			b1.setSpeciality("Van Hoc- Nghe Thuat");
			break;
		}
		}
		System.out.println("Add page Number ");
		b1.pageNumber=in.nextLine();
	}

}
