public class Donuts {
    //class blue prints for the things we want to make

    // Instance variable
    //todo: make the three comments into variables
    //frosting type
    public String frostingType;
    //is there filling
    public boolean hasFilling;
    //how many donuts
    public int numberOfDonuts;






    //Constructor
    //Constructor is a method - special
    //No void needed
    //Has to follow the name of the class exactly
    public Donuts(int pNumberOfDonuts) {
        frostingType = "boston cream";
        numberOfDonuts = pNumberOfDonuts;
        hasFilling = true;
    }


    //todo: make a method called printInfo

    public void printInfo () {
        //todo: use souts to print the instance variables

        System.out.println( "the type of cream is"+ frostingType);
        System.out.println("hasFilliong: " + hasFilling);
        System.out.println(numberOfDonuts +  "donuts");
    }

}