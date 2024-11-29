class myException extends Exception{
    public myException(String s){
        super(s);
    }
}

public class exceptionHandling{
    public static void checkBalance(double balance) throws myException{
        if(balance<1000){
            throw new myException("Balance Insufficient");
        }
        else{
            System.out.println("Balance is sufficient.");
        }
    }
    public static void main(String[] args){
        double balance = 100;
        try{
            checkBalance(balance);
        }catch(myException e){
            System.out.println(e.getMessage());
        }
    }
}