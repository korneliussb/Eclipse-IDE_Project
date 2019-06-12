import java.util.Date;

public class ManufacturedEngine implements Engine {
	private String engineManufacturer;
	private Date engineManufacturedDate;
	private String engineMake;
	private String engineModel;
	private int engineCylinders;
	private String engineType;
	private String driveTrain;

	//Memuat constructor nya
	public ManufacturedEngine() {
		//Inisialisasi constructor
		this.engineManufacturer = "Generic";
		this.engineManufacturedDate = new Date();
		this.engineMake = "Generic";
		this.engineModel = "Generic";
		this.engineCylinders = 0;
		this.engineType = "85 AKI";
		this.driveTrain = "2WD: Two-Wheel Drive"; 
	}

	public ManufacturedEngine( String engineManufacturer, Date engineManufacturedDate, String engineMake,
			String engineModel, String driveTrain, int engineCylinders, String engineType ) {
		//Inisialisasi vehicle nya
		this.engineManufacturer = engineManufacturer;
		this.engineManufacturedDate = engineManufacturedDate;
		this.engineMake = engineMake;
		this.engineModel = engineModel;
		this.driveTrain = driveTrain;
		this.engineCylinders = engineCylinders;
		this.engineType = engineType; 
	}

	//Deklarasi Setter untuk masing2 method pada interface
	public final void setEngineManufacturedDate(Date date) {
		this.engineManufacturedDate = date; 
	}
	
	public final void setEngineManufacturer(String manufacturer) {
		this.engineManufacturer = manufacturer;
	}
	
	public void setEngineMake(String engineMake) {
		this.engineMake = engineMake; 
	}
	
	public void setEngineModel(String engineModel) {
		this.engineModel = engineModel; 
	}
	
	public final void setEngineType(String fuel) {
		this.engineType = fuel; 
	}
	
	public void setEngineCylinders(int engineCylinders) {
		this.engineCylinders = engineCylinders; 
	}
	
	public void setDriveTrain(String driveTrain) {
		this.driveTrain = driveTrain; 
	}

	//Override method toString
	public String toString() {
		return "Engine Manufacturer : " + this.engineManufacturer + "\n" +
			"Engine Manufactured : " + this.engineManufacturedDate.toString() + "\n" +
			"Engine Make : " + this.engineMake + "\n" +
			"Engine Model : " + this.engineModel + "\n" +
			"Engine Type : " + this.engineType + "\n" +
			"Engine Cylinders : " + this.engineCylinders + "\n" +
			"Drive Train : " + this.driveTrain; 
	}
	
	//Main code untuk mencetak tampilan
	public static void main(String[] args) {
		//Default constructor
		System.out.println("------------------------------------");
		ManufacturedEngine me1 = new ManufacturedEngine();
		System.out.println(me1);
		
		//Overloaded Constructor 
		System.out.println("------------------------------------");
		ManufacturedEngine me2 = new ManufacturedEngine( "Honda", new Date(1325599999999L)
				, "H-Series", "H23A1"
				, "2WD: Two-Wheel Drive", 4
				, "88 AKI");
		System.out.println(me2);
		System.out.println("------------------------------------");
	}
}
