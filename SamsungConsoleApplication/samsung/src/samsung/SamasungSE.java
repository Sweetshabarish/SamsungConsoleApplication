package samsung;

/*
 * here hierchical inheritance is used were samsungs20plus is exttended by both samsungse and sasmusngs20plusultra
 */
class SamasungSE extends Smasungs20plus{
	
	/*
	 * user name + phone number ,created because to ask about the phone stuas
	 */
	private String UserName = "abinaya";
	private String Phonenumber="9361451152";

    @Override
    public String getUserName() {
        return UserName;
    }

    public int Ram(){
        return 12;
    }
//method overriding
   void ChipModel() {
	   super.ChipModel();
   }
   //method overloading
   public static int price(int Ram,int Storage,int Procesosor) {
    	return (Ram+Storage+Procesosor)*6;
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
    
}