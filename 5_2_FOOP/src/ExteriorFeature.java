
public class ExteriorFeature implements Feature {
	
	private String exteriorFeature;
	
	//Constructor
	public ExteriorFeature() {
		this.exteriorFeature = "Generic"; 
	}
	
	//Constructor dengan parameter
	public ExteriorFeature(String exteriorFeature) {
		this.exteriorFeature = exteriorFeature; 
	}
	
	//Implementasi method pada interface
	public String getFeature() {
		return this.exteriorFeature; 
	}
	
	public void setFeature(String feature) {
		this.exteriorFeature = feature; 
	}
	
	//Override method toString
	public String toString() {
		return "Exterior [" + this.exteriorFeature + "]"; 
	}
	
	public static void main(String[] args) {
		//Default Constructor
		System.out.println("------------------------------------");
		ExteriorFeature ef1 = new ExteriorFeature();
		System.out.println(ef1);

		//Overloaded Constructor
		System.out.println("------------------------------------");
		ExteriorFeature ef2 = new ExteriorFeature("Fog Lamps");
		System.out.println(ef2);
		System.out.println("------------------------------------");
	}
}
