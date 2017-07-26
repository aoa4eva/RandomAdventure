package notdefaultpackage;

public class AdventureOptions {
	private String toDisplay; 
	
	public void whereToStart(String startOption)
	{
		if(startOption.equalsIgnoreCase("k"))
		{
			this.setToDisplay("You're in the kitchen. Look around");
			
		}else if(startOption.equalsIgnoreCase("b")){
			this.setToDisplay("Going upstairs is a great option. You might want to open the window.");
		}
		else{
			this.setToDisplay("You started in the hallway. It's dingy. Go somewhere else.");
		}
	}

	/**
	 * @return the toDisplay
	 */
	public String getToDisplay() {
		return toDisplay;
	}

	/**
	 * @param toDisplay the toDisplay to set
	 */
	public void setToDisplay(String toDisplay) {
		this.toDisplay = toDisplay;
	}
	
}
