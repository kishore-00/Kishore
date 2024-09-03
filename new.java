import java.util.Scanner; 
class InvestmentGrowth { 
public static void main(String[] args) { 
Scanner scanner = new Scanner(System.in); 
 
System.out.print("Enter initial investment amount: $");  
double initialAmount = scanner.nextDouble();  
System.out.print("Enter annual interest rate (as a decimal): "); 
double annualInterestRate = scanner.nextDouble();  
System.out.print("Enter the number of years: ");  
int numYears = scanner.nextInt(); 
scanner.close(); 
double[] growth = new double[numYears]; 


for (int i = 0; i<numYears; i++) {  
if (i == 0 || i == 1) { 
growth[i] = initialAmount * annualInterestRate; 
} else { 
growth[i] = growth[i - 1] + growth[i - 2]; 
} 
} 


System.out.println("\nInvestment Growth Over " + 
numYears + " Years:"); 
for (int year = 0; year <numYears; year++) {  
System.out.printf("Year %d: $%.2f\n", year + 1, 
initialAmount + growth[year]); 
} 
} }
