import java.util.Scanner;

 class BankAccount{
    Scanner s=new Scanner(System.in);
String name, username,password,accountno,transecth="";
float balance=1000;
int transection=0;
float [] A=new float[5];
  int i=0;
public void reg(){
    
    System.out.println("Enter your name\n");
    this.name=s.nextLine();
    System.out.println("Enter your username\n");
    this.username=s.nextLine();
    System.out.println("Enter your password\n");
    this.password=s.nextLine();
    System.out.println("Enter your Account Number\n");
    this.accountno=s.nextLine();
    System.out.println("\n Registration Succcesfully.\n Please log in.......");
  
}
public boolean login(){
    boolean login=false;
    while(!login){
        System.out.println("Enter username ....\n");
        String userna=s.nextLine();
        System.out.println("\n");
        if(userna.equals(username)){
            while (!login) {
                System.out.println("Enter password....");
                String usepss=s.nextLine();
                if(usepss.equals(password)){
                    System.out.println("Login successefully");

                    login=true;
                }
                else
                System.out.println("incorrect password....");
            }
        }
        else
        System.out.println("username not found..");
        }
    
        return login;
    }
    public void withdrw(){
        System.out.println("Enter amount for withdraw....");
    
        float amount = s.nextFloat();
        try{
            if(balance>=amount){
                A[i]=-amount;
                if(i==5){
                    i=0;
                }
                else
                i++;
            transection++;
        balance-=amount;
    System.out.println("Withdraw successesful....");
String st=amount+" Rs withdraw\n"; 
transecth=transecth.concat(st);}
else {
    System.out.println("Insufficient balance");
}
        }catch(Exception e){
            e.getStackTrace();
        }
      
    }

    public void deposit(){
        System.out.println("Enter amount for deposit...");
       
        float amount = s.nextFloat();
        try{
            // if(amount<=1000){
            transection++;
            A[i]=+amount;
            if(i==5){
                i=0;
            }
            else
            i++;
        balance+=amount;
    System.out.println("Deposited successesful....");
String st=amount+" Rs Deposited\n"; 
transecth=transecth.concat(st);
// }
// else {
//     System.out.println("Balance limit is 1000");
// }
        }catch(Exception e){
            e.getStackTrace();
        }
    }

    public void Transfer(){
        System.out.println("Enter Account Number for transfer money..");
        int a=s.nextInt();
          
     
         System.out.println("Enter amount for transfer");
        float amount = s.nextFloat();
        try{
            if(balance>1000){
                float b=balance-1000;
            if(b>=amount){
                A[i]=-amount;
                if(i==5){
                    i=0;
                }
                else
                i++;
            transection++;
        balance-=amount;
    System.out.println("Transection successesful....");
String st=amount+" Rs trasfered in Account "+a+"\n"; 
transecth=transecth.concat(st);}
else {
    System.out.println("Balance limit is 1000");
}}
else
System.out.println("insuficeint balance");

        }catch(Exception e){
            e.getStackTrace();
        }
    
    }

    public void checkb(){
        System.out.println("your balance is :"+ balance);
    }
    public void trnH(){
        if(transection==0){
      
            System.out.println("No transection done");
        }
        else
        System.out.println("Previous 5 Transection History");
        for(i=0;i<5;i++){
            System.out.println( A[i]); 
        }
        System.out.println(transection +" Transection is done\n");
        
    }

}

public class atm {

    public static void main(String[] a){
        try (Scanner v = new Scanner(System.in)) {
            BankAccount b=new BankAccount();
            System.out.println("Welcome in ATM...");
            System.out.println("choose an option..\n\n1.Register\n 2. Exit");
            int d=v.nextInt();
            
            switch (d) {
                case 1:
                    b.reg();
                    System.out.println("choose an option..\n\n1.login\n 2. Exit");
   
                  int c=v.nextInt();
                    if(c==1){ 
                    if(b.login()==true){
                     boolean t=true;
                     
                     int g;
                        do{
                        System.out.println("choose an option..\n\n1.Deposit\n2.Withdraw\n3.Tranfer Amount\n4.Check balance\n5.Transection History\n6.Exit");
                       
                        g=v.nextInt();
                      
                        if(g==1){
                            b.deposit();
                        }
                        else if(g==2){
                            b.withdrw();
                        }
                        else if(g==3)
                        b.Transfer();
                        else if(g==4)
                        b.checkb();
                        else if(g==5)
                        b.trnH();
                        else if(g==6){
                            t=false;
                        break;}
                        else
                        System.out.println("choose right option\n");
                        } while(t);
                    }  
                    }
                    else if(c==2){System.out.println("Exit successfully\n");
                break;}
                   break;
                    case 2:
                    System.out.println("Exit succesesfully");
                    break;
            
                default:
                System.out.println("Choose right option\n");
                    break;
            }
        }
        
    }
}