import java.text.NumberFormat;
import java.util.Scanner;

public class TaxBrackets2020 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int option;
		double salary;
		double tax = 0;
		NumberFormat money = NumberFormat.getCurrencyInstance();
		System.out.println("If filing single or married seperatly enter 1. If filing married jointly, enter 2.");
		option= scan.nextInt();
		System.out.println("Enter how much you made this year");
		salary= scan.nextDouble();
		
		if (option==1) {
			if (salary <= 9875) {
				tax=salary * 0.1;
			}
			else if(salary > 9875 && salary <= 40125) {
				tax= (9875* 0.1) +((salary-9875)*0.12);
			}
			else if(salary > 40125 && salary <= 85525) {
				tax= (9875* 0.1) +((40125-9875)*0.12) + ((salary-40125)*0.22);
			}
			else if(salary > 85525 && salary <= 163300) {
				tax= (9875* 0.1) +((40125-9875)*0.12) + ((85525-40125)*0.22) +((salary-85525)*0.24);
			}
			else if(salary > 163300 && salary <= 207350) {
				tax= (9875* 0.1) +((40125-9875)*0.12) + ((85525-40125)*0.22) + ((163300-85525)*0.24) + ((salary-163300)*0.32);
			}
			else if(salary >207350 && salary <= 518400) {
				tax= (9875* 0.1) +((40125-9875)*0.12) + ((85525-40125)*0.22) + ((163300-85525)*0.24) + ((207350-163300)*0.32) + ((salary-207350)*0.35);
			}
			else if(salary >518400) {
				tax= (9875* 0.1) +((40125-9875)*0.12) + ((85525-40125)*0.22) + ((163300-85525)*0.24) + ((207350-163300)*0.32) + ((518400-207350)*0.35) + ((salary-518400)*0.37);
			}
		}
		if (option==2) {
			if (salary <= 19750) {
				tax=salary * 0.1;
			}
			else if(salary > 19750 && salary <= 80250) {
				tax= (19750* 0.1) +((salary-19750)*0.12);
			}
			else if(salary > 80250 && salary <= 171050) {
				tax= (19750* 0.1) +((80250-19750)*0.12) + ((salary-80250)*0.22);
			}
			else if(salary > 171050 && salary <= 326600) {
				tax= (19750* 0.1) +((80250-19750)*0.12) + ((171050-80250)*0.22) +((salary-171050)*0.24);
			}
			else if(salary > 326600 && salary <= 414700) {
				tax= (19750* 0.1) +((80250-19750)*0.12) + ((171050-80250)*0.22) + ((326600-171050)*0.24) + ((salary-326600)*0.32);
			}
			else if(salary >414700 && salary <= 622050) {
				tax= (19750* 0.1) +((80250-19750)*0.12) + ((171050-80250)*0.22) + ((326600-171050)*0.24) + ((414700-326600)*0.32) + ((salary-414700)*0.35);
			}
			else if(salary >622050) {
				tax= (19750* 0.1) +((80250-19750)*0.12) + ((171050-80250)*0.22) + ((326600-171050)*0.24) + ((414700-326600)*0.32) + ((622050-414700)*0.35) + ((salary-622050)*0.37);
			}
		}
		System.out.println("You are paying " + money.format(tax) + " in taxes this year");
	}

}
