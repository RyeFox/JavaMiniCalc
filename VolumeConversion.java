/** Reece Mathieson 15/10/2014
 * A Volume conversion class
 */

public class VolumeConversion 
{
    //1 Gallon = 4.546 litres
    public final static double GALLONS_CONVERSION = 4.546;
    
    public static void main(String [] args) 
    {
        //Define varialbes
        int gallons;
        double litres;
        
        //initialize gallons variable to 14
        gallons = 14;
        
        //gallons multiplied by the conversion variable is equal to amount in litres
        litres = gallons*GALLONS_CONVERSION;
        
        //Print to screen
        System.out.println("The number of litres in "+ gallons + " gallons is "+litres);
    }
}
