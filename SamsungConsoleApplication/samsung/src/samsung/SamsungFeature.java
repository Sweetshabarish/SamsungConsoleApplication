package samsung;


/* Samsung feature class which show the feature of the current phone*/
abstract class SamsungFeature{
	
	void  ChipModel() {  //method created to override in all class ,becuase all samsuns s20 serioes contains same proceesor
		System.out.println( "Samsung Exynos 990 or Qualcomm Snapdragon 865");
    	
    }
    
    abstract void Power(); //all mobile contains batterycapacity ,so abstract method were we can use in all the classes

}