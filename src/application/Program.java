package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.PF;
import entities.PJ;
import entities.Payer;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double taxSum = 0;
		
		System.out.print("Enter the number of tax payers: ");
		int n = sc.nextInt();
		
		List<Payer> list = new ArrayList<>();
		
		for(int i = 1; i <= n; i++) {
			System.out.println("Tax payer #" + i + " data:");
			System.out.print("Individual or company (i/c)? ");
			char ch = sc.next().charAt(0);
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Anual income: ");
			double anualIncome = sc.nextDouble();
			if (ch == 'i') {
				System.out.print("Health expenses: ");
				double healthExpeses = sc.nextDouble();
				list.add(new PF(name, anualIncome, healthExpeses));
			}
			else {
				System.out.print("Number of employees: ");
				int employeesNumber = sc.nextInt();
				list.add(new PJ(name, anualIncome, employeesNumber));
			}

		}
		System.out.println("\nTAXES PAID:");
		for (Payer payer : list) {
			System.out.println(
					payer.getName() 
					+ ": $ " 
					+ String.format("%.2f", payer.totalTax()));
			taxSum += payer.totalTax();
			
		}
		System.out.printf("\nTOTAL TAXES: $ %.2f", taxSum);		
		
		sc.close();
	}

}
