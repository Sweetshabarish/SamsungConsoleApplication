package samsung;

import java.util.InputMismatchException;
import java.util.Scanner;


/*
 *  interface class where all the samsung s series phone contains some same features.
 */
interface Phone{
    
    int Ram();
    String CameraSetUp();
    String Notch();
}
interface Fetauress{
	public String Screendisplay() ;
	public String Storage();
	public String Networktype();
	public String Revloution() ;

	public static int price(int ram,int storage) {
		return ram+storage;
	}

}
/*
 * singleton class ,were s series contains same version at starting time in all phones, we can change version or update
 */
class Version{
    String version1 = "oxygen";
    int versionnumber = 10;
    private static Version obj;

    private Version(){}

    public static Version getInstance(){
        if(obj==null)
            obj = new Version();
        return obj;
    }
}
       
public class SamssungMain {
		
	public static void main(String[] args) {
		int choise =0;	
		
		Scanner input=new Scanner(System.in) ;// scanner class to get input from the user
		System.out.println("Enter user name");	// user name from the user
		String username=input.next();
		System.out.println("Enter user password");	//password from the userr
		String password=input.next();
		User UserObject=new User();// samsung user class is invoked to check the user name and password
		boolean process=true;
		/*
		 * here the main fetures of the mobile will be displayed
		 */
		if(UserObject.usernamestatuas(username, password)) {
			while(process) {
			System.out.println("Continue to see the fetaures reg");
			System.out.println("1. Samsung s20");
			System.out.println("2. Samsung s20plus");
			System.out.println("3. Samsung s20plusUltra");
			System.out.println("4. Sasmsung se");
			System.out.println("5. Exit");
			
			try {                                     //this try catch is used bec., to check the userinput wheather he entered string or integer,he need to enter in in format
				choise=input.nextInt();
			}catch(InputMismatchException e) {
				System.out.println("enter the correct suitable case");
			}
			
			if(choise==1) {
				/*
				 * display the samsungs20 features
				 */
				Samsungs20 samsungs20object=new Samsungs20();
				Version samsungs20VersionObject=Version.getInstance();
				System.out.println("==================================================================");
				System.out.println();
				
				System.out.println("USer name:"+samsungs20object.getUserName());
				System.out.println("User Phone Number:"+samsungs20object.getphonenumber());
				System.out.println("Storage:"+samsungs20object.Storage());
				System.out.println("Ram size:"+samsungs20object.Ram());
				System.out.println("Camera set up:"+samsungs20object.CameraSetUp());
				System.out.println("Notch:"+samsungs20object.Notch());
				System.out.println("Screen Display:"+samsungs20object.Screendisplay());
				System.out.println("NetworkType:"+samsungs20object.Networktype());
				System.out.println("Revolution:"+samsungs20object.Revloution());
				samsungs20object.Power();
				samsungs20object.ChipModel();
				System.out.println("Version:"+samsungs20VersionObject.version1+"  Version number:"+samsungs20VersionObject.versionnumber);
				System.out.println("Total price of the set:"+samsungs20object.price(512));
				System.out.println();
				System.out.println("==================================================================");
				
				
			}
			else if(choise==2) {
				/*
				 * display the samsungs20plus features
				 */
				Smasungs20plus smasungs20plusobject=new Smasungs20plus();
				Version samsungs20plusVersionObject2=Version.getInstance();
				System.out.println("==================================================================");
				System.out.println();
				System.out.println("USer name:"+smasungs20plusobject.getUserName());
				System.out.println("User Phone Number:"+smasungs20plusobject.getphonenumber());
				System.out.println("Storage:"+smasungs20plusobject.Storage());
				System.out.println("Ram size:"+smasungs20plusobject.Ram());
				System.out.println("Camera set up:"+smasungs20plusobject.CameraSetUp());
				System.out.println("Notch:"+smasungs20plusobject.Notch());
				System.out.println("Screen Display:"+smasungs20plusobject.Screendisplay());
				System.out.println("NetworkType:"+smasungs20plusobject.Networktype());
				System.out.println("Revolution:"+smasungs20plusobject.Revloution());
				smasungs20plusobject.Power();
				smasungs20plusobject.ChipModel();
				System.out.println("Version:"+samsungs20plusVersionObject2.version1+"  Version number:"+samsungs20plusVersionObject2.versionnumber);
				System.out.println("Total price of the set:"+smasungs20plusobject.price(128));
				System.out.println();
				System.out.println("==================================================================");
				
			}else if(choise==3) {
				/*
				 * display the samsungs20plusultra features
				 */
				Smasungs20plusultra smasungs20plusultraobject=new Smasungs20plusultra();
				Version smasungs20plusultraVersionObject=Version.getInstance();
				System.out.println("==================================================================");
				System.out.println();
				System.out.println("USer name:"+smasungs20plusultraobject.getUserName());
				System.out.println("User Phone Number:"+smasungs20plusultraobject.getphonenumber());
				System.out.println("Storage:"+smasungs20plusultraobject.Storage());
				System.out.println("Ram size:"+smasungs20plusultraobject.Ram());
				System.out.println("Camera set up:"+smasungs20plusultraobject.CameraSetUp());
				System.out.println("Notch:"+smasungs20plusultraobject.Notch());
				System.out.println("Screen Display:"+smasungs20plusultraobject.Screendisplay());
				System.out.println("NetworkType:"+smasungs20plusultraobject.Networktype());
				System.out.println("Revolution:"+smasungs20plusultraobject.Revloution());
				smasungs20plusultraobject.ChipModel();
				smasungs20plusultraobject.Power();
				System.out.println("Version:"+smasungs20plusultraVersionObject.version1+"  Version number:"+smasungs20plusultraVersionObject.versionnumber);
				System.out.println("Total price of the set:"+smasungs20plusultraobject.price(128,99,128));
				System.out.println();
				System.out.println("==================================================================");
				
			}else if(choise==4) {
				/*
				 * display the samsungsse features
				 */
				SamasungSE samasungseobject=new SamasungSE();
                Version samasungseVersionObject=Version.getInstance();
				System.out.println("==================================================================");
				System.out.println();
				System.out.println("User Phone Number:"+samasungseobject.getphonenumber());
				System.out.println("Storage:"+samasungseobject.Storage());
				System.out.println("Ram size:"+samasungseobject.Ram());
				System.out.println("Camera set up:"+samasungseobject.CameraSetUp());
				System.out.println("Notch:"+samasungseobject.Notch());
				System.out.println("Screen Display:"+samasungseobject.Screendisplay());
				System.out.println("NetworkType:"+samasungseobject.Networktype());
				System.out.println("Revolution:"+samasungseobject.Revloution());
				samasungseobject.ChipModel();
				samasungseobject.Power();
				System.out.println("Version:"+samasungseVersionObject.version1+"  Version number:"+samasungseVersionObject.versionnumber);
				samasungseVersionObject.versionnumber=13;//here singleton class is used to change the past version to current version
				System.out.println("Total price of the set:"+samasungseobject.price(128));
				System.out.println();
				System.out.println("==================================================================");
				
			}else if(choise ==5) {
				process=false;
			}
			else {
				System.out.println("Choose valid option");
			}
			
		}
		
	
	
		
		
		
		}else {
			System.out.println("enter correct user name and password");
		}
	}
	}


