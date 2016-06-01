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
            mp;
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
            
                //converting interest rate to a decimal
                double ir = interestRate/100.0;
                 System.out.println(ir);
                
                //interest rate by month and length in months
                double mi = ir/12.0;
                int lm = lengthYears*12;
                System.out.println(lm);
                
                //final result
                //118.50307
                //double bump = (mi*Math.pow(1+mi, lm))/(Math.pow(1+mi, lm)-1);
                //System.out.println(bump); //0.0165728878934725
                //mp = pa*bump;
                mp = (pa*mi)/(1-Math.pow(1+mi,-lm));
	}
    	
	//getter method for getting/retrieving computation
	public double getMp(){
		return mp;
	}	
    
    public static void main(String[] args) {      
        //instance for the GUI
        MortgageGUI gui = new MortgageGUI();
        gui.setVisible(true); //if false, the gui does not appear
    }
    
}
