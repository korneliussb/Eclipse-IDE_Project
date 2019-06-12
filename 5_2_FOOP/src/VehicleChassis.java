
public class VehicleChassis implements Chassis {
	private String chassisName;

	//Membuat constructor VehicleChassis
	public VehicleChassis() {
		this.chassisName = Chassis.chassis; 
	}
		
	public VehicleChassis(String chassisName) {
		this.chassisName = chassisName; 
	}
	
	//implementasi method getChassisType dari interface
	public Chassis getChassisType() {
		return this; 
	}
		
	//implementasi method setChassisType dari interface
	public void setChassisType(String vehicleChassis) {
		this.chassisName = vehicleChassis; 
	}
			
	public String toString() {
		return "Chassis Name : " + this.chassisName; 
	}
			
	public static void main(String[] args) {
		System.out.println("------------------------------------");
		VehicleChassis vc1 = new VehicleChassis();
		System.out.println(vc1);
						
		//Test overloaded constructor
		System.out.println("------------------------------------");
		VehicleChassis vc2 = new VehicleChassis("Test Chassis");
		System.out.println(vc2);
		System.out.println("------------------------------------");
	}

}
