/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mortgage.calculator;

/**
 * Morgage Calculator to calculate the monthly repayments for a mortgage.
 * @studentNumber x14127733
 * @author Talita Silva Lima
 * @date 30/05/2016
 */

public class MortgageCalculator {

    /**
     * @param args the command line arguments
     */
    
    //instance variables
    private double interestRate,
            mpd;
    private int pa, lengthYears;
    
    //constructor
    public MortgageCalculator(){}
    
    	//setter method for principle amount
	public void setPa(int pa){
		this.pa = pa;
	}
	
	
	//setter method for the value of the length of the loan
	public void setLengthYears(int lengthYears){
		this.lengthYears = lengthYears;
	}
        
	//setter method for the value of the interest rate
	public void setInterestRate(double interestRate){
		this.interestRate = interestRate;
	}
	
	//processing/computation methods
	//method to run the calculation
	public void calculation(){
		//processing
            
                //converting interest rate to a decimal and dividing by months
                double mi = interestRate/100.0/12.0;
                
                //length in months
                int lm = lengthYears*12;
                
                //final result
                double mp = (pa*mi)/(1-Math.pow(1+mi,-lm));
                
                //rounding
                mpd =(double)Math.round(mp);
	}
    	
	//getter method for getting/retrieving computation
	public double getMpd(){
		return mpd;
	}	
    
    public static void main(String[] args) {      
        //instance for the GUI
        MortgageGUI gui = new MortgageGUI();
        gui.setVisible(true); //if false, the gui does not appear
    }
    
}
