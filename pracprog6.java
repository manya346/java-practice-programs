class myexception extends Exception{
    public myexception(String s){
        super(s);
    }
}

public class pracprog6 {
    public static void checkBal(double bal) throws myexception{
        if(bal>1000){
            throw new myexception("Balance sufficient");
        }
        else{
            throw new myexception("Balance insufficient");
        }
    }
    public static void main(String[] args){
        double bal=1000;
        try{
            checkBal(bal);
        }
        catch(myexception e){
            System.out.println(e.getMessage());
        }
    }
}
