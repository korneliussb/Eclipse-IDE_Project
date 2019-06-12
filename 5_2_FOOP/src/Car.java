
import java.util.Date;

public final class Car extends Vehicle {
	private Feature[] feature = new Feature[10];
	private int carAxle;
	
	//Constructor Car
	public Car() {
		super();
		Feature[] f = {new InteriorFeature("No Interior Features")
				, new ExteriorFeature("No Exterior Features")};
		this.feature = f;
		this.carAxle = 2;
	}

	//Constructor Car dengan parameter
	public Car( String vehicleManufacturer
		, Date vehicleManufacturedDate
		, String vehicleMake
		, String vehicleModel
		, String vehicleType
		, Chassis vehicleFrame
		, Engine vehicleEngine
		, Feature[] feature
		, int carAxle) {
			super( vehicleManufacturer, vehicleManufacturedDate, vehicleMake
					, vehicleModel, vehicleType, vehicleFrame, vehicleEngine);
				this.feature = feature;
				this.carAxle = carAxle;
	}

	public String getExteriorFeatures() {
		String list = "";
		for (int i = 0; i < this.feature.length; i++) {
			if (this.feature[i] instanceof ExteriorFeature) {
				if (list.length() == 0) {
					list += this.feature[i]; 
				}
			else {
				list += "\n : " + this.feature[i]; 
			}
		}
	}
	return list; }
/**
* Declare local get list of InteriorFeatures.
*/
	//Deklarasi list interiorfeatures
	public String getInteriorFeatures() {
		String list = "";
		for (int i = 0; i < this.feature.length; i++) {
			if (this.feature[i] instanceof InteriorFeature) {
				if (list.length() == 0) {
					list += this.feature[i]; 
				}
			else {
				list += "\n : " + this.feature[i]; 
			}
		}
	}
	
	return list; 
	}

	public String toString() {
		String list = "";
		for (int i = 0; i < this.feature.length; i++) {
			if (list.length() == 0) {
				list += this.feature[i];
			}
		else {
			list += "\n : " + this.feature[i]; 
		}
	}
			
	return super.toString() + "\n" + "Features : " + list + "\n" + "Car Axle : " + carAxle;
	}
	
	public static void main(String[] args) {
		//Default Constructor 
		Car c1 = new Car();
		System.out.println("-----------------------------");
		System.out.println(c1);

		//Overloaded constructor
		System.out.println("-----------------------------");
		
		Feature[] f = { new InteriorFeature("AM/FM Radio"), new ExteriorFeature("Wood Panels")
				, new InteriorFeature("Air Conditioning"), new ExteriorFeature("Moonroof")
						};
		
		//Overloaded constructor car
		Car c2 = new Car( "Honda", new Date(1325599999999L), "Honda", "Prelude", "Coupe"
				, new VehicleChassis("Unibody"), new ManufacturedEngine("Honda", new Date(), 
						"H-Series", "H23A1", "2WD: Two-Wheel Drive", 4, "88 AKI"), f, 2);
		System.out.println(c2);
		System.out.println("-----------------------------");
		
		Vehicle v = (Vehicle) new Car( "Honda", new Date(1325599999999L), "Honda", "Prelude", "Coupe"
				, new VehicleChassis("Unibody"), new ManufacturedEngine("Honda", new Date(),
						"H-Series", "H23A1", "2WD: Two-Wheel Drive", 4, "88 AKI"), f, 2);
		
		System.out.println(((Car) v).getExteriorFeatures());

		System.out.println("-----------------------------");
		System.out.println("Exterior Features : " + c2.getExteriorFeatures());
		System.out.println("Interior Features : " + c2.getInteriorFeatures());
		System.out.println("-----------------------------");
	}
}
