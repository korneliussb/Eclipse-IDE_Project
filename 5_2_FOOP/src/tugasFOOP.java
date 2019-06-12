
public class tugasFOOP {
	static void validate(int age) throws myException{  
		if(age<18) {  
	      throw new myException("Umur Tidak Mencukupi");
		}
	    else {  
	      System.out.println("Selamat Datang \n Umur Anda Cukup");  
	    }
	}  
	     
	public static void main(String args[]){  
		try{ 
			int umur = 21;
	        validate(umur);  
	        System.out.println("Umur Anda :" + umur );
	    }
	    catch(Exception m){
	    	System.out.println("Terjadi Eksepsi: "+m);
	    }  
	    System.out.println("Selesai");  
	}  
}
// ________________________________________________________
// Internal Invariant
//public class tugasFOOP {
//	public static void main(String args[]){  
//		int i = 21;
//		if (i % 4 == 0) {
//			System.out.println("mod 0");
//		} 
//		else if (i % 4 == 1) {
//			System.out.println("mod 1");
//		} 
//	    else{
//	    	assert i % 4 == 2 : i;
//	    	System.out.println("mod 2");
//	    }
//	}  
//}
// _________________________________________________________

//Control Flow Invariant
//public class tugasFOOP {
//	void foo() {
//	    for (...) {
//	      if (...)
//	        return;
//	    }
//	    assert false; // Execution should never reach this point!
//	}
//
//}

//______________________________________________________________
// Class Invariant
//public class tugasFOOP {
//	int size = this.getElementCount();
//    if (size == 0){
//        throw new RuntimeException ("Percobaan dari stack yang kosong");
//        
//    }
//    
//   Object result = "Coba Lagi";
//   assert (this.getElementCount() == size -1);
//   
//   return result;
//
//}

