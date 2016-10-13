class Chick implements Animal
{     
    //your code here
	private String myType;     
    private String mySound;      
    public Chick(String type, String sound, String sound2)     
    {         
        myType = type;
        String soundG;
        if(Math.random() < 0.5)
        {
        	soundG = sound;
        }
        else
        {
        	soundG = sound2;
        }         
        mySound = soundG;     
    }           
    public String getSound(){return mySound;}     
    public String getType(){return myType;}
}
