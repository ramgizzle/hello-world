public class Parcel {
private int id;
private double acres;
private String zoning;
private Building building;

public Parcel(int id, double acres, String zoning, Building building) {
this.id = id;
this.acres = acres;
this.zoning = zoning;
this.building = building;
}
public double calculateTax() {
   double baseTax;
   double extraTax;
   double size = building.getSize();
   
   if (zoning.equalsIgnoreCase("residential")) {
       baseTax = acres * 500;
   
       if (size < 2000) {
           extraTax = size * 0.5;
       } else { 
            extraTax = size * 0.75;
       }
   } else {
       baseTax = acres * 2000;
       
       if (size < 4000) {
           extraTax = size * 1.0;
       } else {
           extraTax = size * 1.5;
       }
   }
   
   return baseTax + extraTax;
  
}

public String toString() {
    return "Parcel ID: " + id +
           "\nAcres: " + acres +
           "\nZoning: " + zoning +
           "/n" + building +
           "/nTax: $" + calculateTax();
 }

}