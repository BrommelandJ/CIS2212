public class MediaItem {
	
	//fields
	String title;
	String format;
	boolean onLoan;
	String loanedTo;
	String dateLoaned;
	
	MediaItem(){
		
		String title = null;
        String format = null;
        
        boolean onLoan = false;
        
        String loanedTo = null;
        String dateLoaned = null;
	}
	
	MediaItem(String title, String format){
		
		this.title = title;
        this.format = format;
        
        onLoan = false;
        
        loanedTo = " ";
        dateLoaned = " ";
	}
	
	//setters
	public void setTitle(String title){
		
        this.title = title;
    }
    public void setFormat(String format){
    	
        this.format = format;
    }
    public void setBoolean(boolean onLoan){
    	
        this.onLoan = onLoan;
    }
    public void setLoanedTo(String loanedTo){
    	
        this.loanedTo = loanedTo;
    }
    public void setDateLoaned(String dateLoaned){
    	
        this.dateLoaned = dateLoaned;
    }
	
	//getters
	public String getTitle (String title){
		
        return title;
    }
    public String getFormat (String format){
    	
        return format;
    }
    public boolean getOnLoan (boolean onLoan){
    	
        return onLoan;
    }
    public String getLoanedTo (String loanedTo){
    	
        return loanedTo;
    }
    public String getDateLoaned(String dateLoaned){
    	
        return dateLoaned;
    }
 
	void markOnLoan(String name, String date) {
		
		if(onLoan == false){
			
            onLoan = true;
            
            loanedTo = name;
            dateLoaned = date;
        }
        else {
            System.out.println("ERROR: this item is already loaned out");
        }
        
	}
	void markReturned() {
		if(onLoan == false){
            System.out.println("ERROR: this item is not currently loaned out.");
        }
		loanedTo = "";
		dateLoaned = "";
		onLoan = false;
		
	}
}