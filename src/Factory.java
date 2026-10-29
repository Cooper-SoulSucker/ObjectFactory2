public class Factory {
    public String owner = "Cooper";
    //todo: make 2 more variables called isOpen and yearFounded. what data
    //type do you need? and give the variable values
    public boolean isOpen = true;
    public int yearFounded = 2026;
    public Donuts donutOrder1;
    //todo: make a new donut called donutsOrder2
    public Donuts donutOrder2;

    //class = blueprints
    //object = is the house

    public int randomNumber;
    public int randomNumber2;


    public static void main(String[] args) {

        Factory a = new Factory();
    }

    //special method: constructor
    //name of constructer has to be the same name as class
    //you do not say void
    public Factory(){
        System.out.println("welcome to cooper's factory");
        System.out.println( "the factory was founded in");
        System.out.println(yearFounded);
        System.out.println("it is" + isOpen + "that the factory is open");

        randomNumber = (int)(Math.random() * 100) + 1; //1-100 donuts

        donutOrder1 = new Donuts(randomNumber);
        System.out.println(donutOrder1.numberOfDonuts);
         //todo: print all of the instance varible of donuts
        //extra challange : have words print what the variables are
        System.out.println(donutOrder1.numberOfDonuts+"donuts please");
        System.out.println("all"+donutOrder1.frostingType);
        System.out.println("it is"+donutOrder1.hasFilling+ "that I want filling");
        donutOrder1.numberOfDonuts = donutOrder1.numberOfDonuts + 1;
        System.out.println(donutOrder1.numberOfDonuts +"order 1 #donuts");

        randomNumber2 = (int)(Math.random() * 45) + 1;
        //todo: make the 2nd order have a range of 1-45
        donutOrder2 = new Donuts(randomNumber2);
        //todo: sout the donutsOrder2 instance vars

        System.out.println(donutOrder2.numberOfDonuts);
        System.out.println(donutOrder2.numberOfDonuts+"donuts please");
        System.out.println("all"+donutOrder2.frostingType);
        System.out.println("it is"+donutOrder2.hasFilling+ "that I want filling");
        donutOrder2.numberOfDonuts = donutOrder1.numberOfDonuts;
        System.out.println(donutOrder2.numberOfDonuts);

        System.out.println("welcome to cooper's factory 2");
        System.out.println( "the factory was founded in");
        System.out.println(yearFounded);
        System.out.println("it is" + isOpen + "that the factory is open");


        donutOrder2.printInfo();


    }


}
