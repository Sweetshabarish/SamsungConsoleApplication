package samsung;

/*
 * here single level ihnertiace is used samsungs20plus extends samsung20 class
 */

/*
 * Samsungs20 extends features class ,to get feature of the mobile and implements the phone and features act as a inhertiance and interface
 */
class Samsungs20 extends SamsungFeature implements Phone,Fetauress{

    private String userName = "shetty";
    private String phonenumber="9361451152";
    
    

    public String getUserName() {
        return userName;
    }
    public String getphonenumber() {
    	return phonenumber;
    }

   // chipModel();

    public  String  Storage() {
    	return "128/256/512 gb";
    }
    

    public int Ram(){
        return 8;
    }

    public String CameraSetUp(){
        return "Triple Camera SetUp";
    }

    public String Notch(){
        return "TopSquare Notch";
    }
    static Samsungs20 op=new Samsungs20();
    
    public static int price(int storage) {
		return op.Ram()+storage;
	}
    

	@Override
	public String Screendisplay() {
		// TODO Auto-generated method stub
		return "6.7inch";
	}

	@Override
	public String Networktype() {
		// TODO Auto-generated method stub
		return "5g/4glte";
	}

	@Override
	public String Revloution() {
		// TODO Auto-generated method stub
		return "720p 860ps or 1080p 560ps";
	}

	@Override
	void Power() {
		// TODO Auto-generated method stub
		System.out.println("4700mah battery");
		
	}
	
	


}

