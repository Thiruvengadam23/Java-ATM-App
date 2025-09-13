import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int pin=1234;
        System.out.print("Enter the Pin Number : ");
        int userPinNumber=s.nextInt();
        if(userPinNumber==pin){
            int amount=100000;
            System.out.println("!!!Welcome to our ATM!!!!");
            int choice=0;
            do{
                System.out.println("-------------------------");
                System.out.println("Enter 1 to Check Balance");
                System.out.println("Enter 2 to Deposit Amount");
                System.out.println("Enter 3 to Withdraw Amount");
                System.out.println("Enter 4 to Exit");
                System.out.println("-------------------------");
                
                System.out.print("Enter the Choice : ");
                choice=s.nextInt();
            
                switch(choice){
                    case 1:
                        System.out.println("Your Balance is :"+amount);
                        break;
                    case 2:
                        System.out.print("Enter the Deposit Amount :");
                        int a=s.nextInt();
                        amount+=a;
                        System.out.println("Your amount Added Successfully");
                        break;
                    case 3:
                        System.out.print("Enter the amount need to Withdraw :");
                        int b=s.nextInt();
                        if(b<=amount){
                            amount-=b;
                            System.out.println("Collect Your Amount "+b);
                        }else{
                            System.out.println("Insufficient Balance");
                        }
                        break;
                }
            }while(choice!=4);
            System.out.println("Thankyou for using our ATM!!!");
        }else{
            System.out.println("Invalid Pin Number");
        }
    }
}