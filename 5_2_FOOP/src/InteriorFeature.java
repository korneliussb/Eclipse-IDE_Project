
public class InteriorFeature implements Feature
{
	private String interiorFeature;

	//Deklarasi constructor 
	public InteriorFeature() {
		this.interiorFeature = "Generic"; 
	}

	//Deklarasi constructor dengan parameter
	public InteriorFeature(String interiorFeature) {
		this.interiorFeature = interiorFeature; 
	}

	//Implementasi method pada interface
	public String getFeature() {
		return this.interiorFeature; 
	}
	
	public void setFeature(String feature) {
		this.interiorFeature = feature; 
	}
	
	//Override method toString
	public String toString() {
		return "Interior [" + this.interiorFeature + "]"; 
	}

	//Cetak Driver
	public static void main(String[] args) {
		//Default constructor
		System.out.println("------------------------------------");
		InteriorFeature if1 = new InteriorFeature();
		System.out.println(if1);

		//Overload constructor
		System.out.println("------------------------------------");
		InteriorFeature if2 = new InteriorFeature("Climate Control");
		System.out.println(if2);

		//Tes untuk equal() method
		System.out.println("------------------------------------");
	}
}
