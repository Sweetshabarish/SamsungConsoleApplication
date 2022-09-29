package samsung;


/*
 * Ensculaption method is used to check the username and password
 */

	class User{

	    private String  Name = "shabarish";
	    private int id = 19130;
	   
	    private String Password="shetty101";


	    public String getName() {
	        return Name;
	    }

	    public void setName(String name) {
	        this.Name = name;
	    }

	    public int getId() {
	        return id;
	    }

	    public void setId(int id) {
	        this.id = id;
	    }

	   

	    public String getPass() {
	        return Password;
	    }

	    public void setPass(String pass) {
	        this.Password = pass;
	    }

	    public boolean usernamestatuas(String name, String pass) {
			 if(name.equals(this.Name) && pass.equals(this.Password)){
		            System.out.print("ID : " );
		            System.out.println(id);
		            return true;
		        }
		        
		            System.out.println("Username or Password incorrect!!");
		            
		        return false;
		}

	}


	public class SamsungUser {
	
	    void user(String name, String pass){
	       User object = new User();
	        object.usernamestatuas(name,pass);
	    }
	}



	
