/**
 * Program to calculate varioius values and
 * do various tasks relating to loaning
 * money from a bank.
 *
 * @author Jack Cwynar COMP 1210-006
 * @version 3/16/20
 */
public class BankLoan {
	// constant fields
   private static final int MAX_LOAN_AMOUNT = 100000;
   private static int loansCreated = 0;

   // instance variables (can be used within the class)
   private String customerName;
   private double balance, interestRate;
   /**
    * Constructor for BankLoan.
    *
    * @param customerNameIn for customer's name
    * @param interestRateIn for interest rate
    */
   public BankLoan(String customerNameIn, double interestRateIn) { 
      customerName = customerNameIn;
      interestRate = interestRateIn;
      balance = 0;
      loansCreated++;
   }
   /**
    * Method to determine if a loan was made.
    *
    * @param amount for amount loaned
    * @return true or false, depending on condition
    */
   public boolean borrowFromBank(double amount) {
      
      boolean wasLoanMade = false;
      
      if (balance + amount < MAX_LOAN_AMOUNT) {
         wasLoanMade = true;
         balance += amount;
      }
   
      return wasLoanMade;
   }
   /**
    * Method to pay the bank for loan and interest.
    *
    * @param amountPaid for amount paid
    * @return newBalance
    */
   public double payBank(double amountPaid) {
      double newBalance = balance - amountPaid;
      if (newBalance < 0) {
         balance = 0;
         // paid too much, return the overcharge
         return Math.abs(newBalance);
      }
      else {
         balance = newBalance;
         return 0;
      }
   }
   /**
    * Method to get the balance.
    *
    * @return balance
    */
   public double getBalance() {
      return balance;
   }
   /**
    * Method to set the interest rate.
    *
    * @param interestRateIn for interest rate
    * @return true or false depending on conditions
    */
   public boolean setInterestRate(double interestRateIn) {
   
      if (interestRateIn >= 0 && interestRateIn <= 1) {
         interestRate = interestRateIn;
         return true;
      }
      else {
         return false;
      }
   }
   /**
    * Method to get interest rate.
    *
    * @return interestRate
    */
   public double getInterestRate() {
      return interestRate;
   }
   /**
    * Method to charge interest on loan.
    */
   public void chargeInterest() {
      balance = balance * (1 + interestRate);
   }
   /**
    * Method to convert data to String output.
    *
    * @return String output
    */
   public String toString() {
      String output = "Name: " + customerName + "\r\n" 
         + "Interest rate: " + interestRate + "%\r\n" 
         + "Balance: $" + balance + "\r\n";
      return output;
   }
   /**
    * Method to determine if a loan amount
    * is greater than or equal to 0, or vice versa.
    *
    * @param amount of type double
    * @return true if >=, false otherwise
    */
   public static boolean isAmountValid(double amount)  {
      return amount >= 0;
   }
   /**
    * Method to determine if a user is in debt.
    *
    * @param loan of type BankLoan
    * @return true if in debt, false otherwise
    */
   public static boolean isInDebt(BankLoan loan) {
      if (loan.getBalance() > 0) {
         return true;
      }
      return false;
   }
   /**
    * Method to access loansCreated variable.
    *
    * @return loansCreated to determine the amount of loans created
    */
   public static int getLoansCreated()   {
      return loansCreated;
   }
   /**
    * Method to reset number of loans created to 0.
    */
   public static void resetLoansCreated() {
      loansCreated = 0;
   }
}
