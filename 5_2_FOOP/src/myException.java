
public class myException extends Exception{
    public myException(String s){
        super(s);
        System.out.println("Maaf, anda belum cukup umur!");
    }
}
