
public class VehicleFrame implements Chassis {
	
	private String vehicleFrameType;

	//Membuat constructor
	public VehicleFrame() {
		this.vehicleFrameType = "Unibody"; 
	}

	//Overload constructor untuk objek baru
	public VehicleFrame(String vehicleFrameType) {
		this.vehicleFrameType = vehicleFrameType; 
	}
	
	//Memakai method getChassisType dari Interface Chassis
	public Chassis getChassisType() {
		return this; 
	}
	
	public void setChassisType(String vehicleFrameType) {
		this.vehicleFrameType = vehicleFrameType; 
	}
	
	//Overload method toString
	public String toString() {
		// Print instance description.
		return "Chassis : " + Chassis.chassis + "\n" + "Vehicle Frame : " + this.vehicleFrameType;
	}
	
	//coba untuk print
	public static void main(String[] args) {
		//default constructor dan atribut objek 
		System.out.println("------------------------------------");
		VehicleFrame vf1 = new VehicleFrame();
		System.out.println(vf1);
		
		//tes overload constructor dan atribut objek
		System.out.println("------------------------------------");
		VehicleFrame vf2 = new VehicleFrame("Ladder Frame");
		System.out.println(vf2);
		System.out.println("------------------------------------");
	}
}