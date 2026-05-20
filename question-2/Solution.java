public class Solution{
   public class Bottle{
    private double capacity;
     private double waters;
     public Bottle(double fill){
      capacity = fill;
       waters = fill;
     }

     public double updateAmount(double newFill){
     waters -= newFill;
       if(waters < 0.25 * capacity){
         waters = capacity;
       }
       return waters;
     }
   }
}
