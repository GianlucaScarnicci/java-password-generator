package org.generation.italy.security;

public class PasswordGenerator {
		public static void main(String[] args) {
			String userFirstName="Gianluca";
			String userLastName="Scarnicci";
			String favouriteColor="Black";
			int birthDay=6;
			int birthMonth=5;
			int birthYear=1998;
			int birthDate=birthDay+birthMonth+birthYear;
			String password=userFirstName+"-"+ userLastName+"-" +favouriteColor+"-"+ birthDate;
			System.out.println("La password inserità è:");
			System.out.println(password);
			
			
		}

	}

