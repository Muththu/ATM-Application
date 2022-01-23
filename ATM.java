import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println(" Welcome !!");
        System.out.println("1.Admin");
        System.out.println("2.User");
        System.out.println("3.Exit");
        System.out.println("Press any option 1,2 or 3");
        int a=sc.nextInt();
        if(a==1){
            System.out.println("Welcome to Admin");
            System.out.println("Login");
            System.out.print("Enter Username : ");
            String Username=sc.nextLine();
            System.out.print("Enter Password : ");
            int Password=sc.nextInt();
            if(Username.equals("Admin")&&Password==6383){
              System.out.println("Welcome Admin !");
              System.out.print("Enter no.of 100 : ");
              int noOf100=sc.nextInt();
              System.out.print("Enter no.of 200 : ");
              int noOf200=sc.nextInt();
              System.out.print("Enter no.of 500 : ");
              int noOf500=sc.nextInt();
              System.out.print("Enter no.of 2000 : ");
              int noOf2000=sc.nextInt();
            }
        }
        else if(a==2){
            System.out.println("Login");
            System.out.println("Enter your name : ");
            String name1=sc.nextLine();
            System.out.print("Enter Password : ");
            int pass=sc.nextInt();
            int d=2114;
            if(name1.equals("Muthu") && pass==d){
                System.out.println("Welcome"+name1);
                System.out.println("1.Cash Withdrawl");
                System.out.println("2.To Check Balance");
                System.out.println("3.Pin Change");
                System.out.println("4.Direct Deposit");
                System.out.println("5.Amount Transaction");
                System.out.print("Press any option 1,2,3,4 or 5 : ");
                int us=sc.nextInt();
                int balance=50000;
                if(us==1 || us==2 || us==3 || us==4 || us==5){
                    if(us==1){
                        System.out.print("Please enter the amount details !");
                    }
                    if(us==2){
                        System.out.println("To check the balance,press 2");
                        int ef=sc.nextInt();
                        if(ef==2){
                            System.out.print("Your Current Balance is "+balance);
                        }
                        else{
                            System.out.print("Please press the valid number ");
                        }
                    }
                    if(us==3){
                        System.out.println("To change the pin,press 3");
                        int pi=sc.nextInt();
                        if(pi==3){
                            System.out.print("If your pin is known press 1");
                            int p=sc.nextInt();
                            if(p==1){
                                System.out.print("Enter your old pin number : ");
                                int e=sc.nextInt();
                                if(e==2114){
                                    System.out.print("Enter your new pin number : ");
                                    int newpass=sc.nextInt();
                                }
                            }
                        }
                    }
                }
                else{
                    System.out.println("Press valid option ");
                }
            }
            else if(name1.equals("Muthu") && pass!=2114){
                System.out.println("Invalid Password ! Please check your password.");
            }
            else{
                System.out.println("Invalid Username");
            }
        }
        else if(a==3){
            System.out.println("Logout Success");
            sc.close();
        }
              
    } 
}