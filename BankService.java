public class BankService{
public static void main(String[] args){
    int balance = 1000;
    int deposit = 500;
    int withdraw = 20;

    balance = balance + deposit;
    balance = balance - withdraw;
    System.out.println("Current Balance: " + balance);

}
}
