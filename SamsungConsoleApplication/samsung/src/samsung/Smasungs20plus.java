package samsung;

/*
 * here multi level ihnertiace is used samsungs20plus extends samsung20 class
 */
class Smasungs20plus extends Samsungs20{
	

/*
 * Samsungs20 extends features class ,to get feature of the mobile and implements the phone and features act as a inhertiance and interface
 */
    private String UserName = "samsudeen";
    private String Phonenumber="9361451152";

    public String getUserName() {
        return UserName;
    }

    public int Rsam(){
        return 12;
    }
    
    

    @Override
    public String CameraSetUp(){
        return "Double Camera SetUp";
    }
    @Override
    public String Revloution() {
    	return "4k/2k/1080hd with 960ps";
    }
    
    @Override
	public String Screendisplay() {
		return "7.1inch";
	}

    String CameraSetUp(int a){
        return super.CameraSetUp();
    }
    static Smasungs20plus p=new Smasungs20plus();
    /*
     * by default we can add ram by user.
     */
   // public static int price(int ram,int storage,int procesosor) {
    //	return (ram+storage+procesosor)*4;
    //}
    
    /*
     * or here ram value set by the defult
     */
    public static int price(int storage,int procesosor) {
    	return (p.ram()+storage+procesosor)*4;
    }
    
    void ChipModel() {
	   super.ChipModel();
   }
    
    @Override
	void Power() {
		// TODO Auto-generated method stub
		System.out.println("5000mah battery");
		
	}

}

