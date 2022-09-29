package samsung;


/*
 * here hierchical inheritance is used were samsungs20plus is exttended by both samsungse and sasmusngs20plusultra
 */
class Smasungs20plusultra extends Smasungs20plus{

    private String UserName = "shabarish";
    private String Phonenumber="9361451152";

    @Override
    public String getUserName() {
        return UserName;
    }

   

   void chipModel() {
	   super.ChipModel();
   }
   
   public static int price(int Ram,int Storage,int Procesosor) {
    	return (Ram+Storage+Procesosor)*8;
    }

    public String CameraSetUp(){
        return super.CameraSetUp(5);
    }

    public String notch(){
        return "squaree notch";
    }
    
    @Override
	void Power() {
		// TODO Auto-generated method stub
		System.out.println("6000mah battery");
		
	}
    void ChipModel1() {
		   super.ChipModel();
	   }

}