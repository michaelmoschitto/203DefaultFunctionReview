// usually would have this in another folder

interface Vehicle{


    // abstract methods
    public void vehicle_make();
    public void vehicle_model();

    // default method
    default int number_wheels()
    {
        System.out.println("This vehicle has 4 wheels");

        return 4;
    }

}

interface Truck{
    // abstract methods 
    public void is_4wd();

    // default method
    default boolean has_truck_bed()
    {
        System.out.println("This truck has a truck bed!");

        return true;
    }
}


// The Ford 150 IS-A Vehicle and Truck
 class Ford150 implements Vehicle, Truck{
    public static void main(String[] args) throws Exception {
        System.out.println("this is michaels app");
    }
}
