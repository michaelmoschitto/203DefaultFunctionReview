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
 class FordF150 implements Vehicle, Truck{

    // implement abstract methods
    public void vehicle_make(){
        System.out.println("Ford");
    }
    public void vehicle_model(){
        System.out.println("F-150");
    }
    public void is_4wd(){
        System.out.println("Yes, this vehicle has 4 wheel drive");
    }

    public static void main(String[] args) throws Exception {
        // instantiate our class
        FordF150 new_truck = new FordF150();

        // use our abstract methods
        System.out.println("\n-----Abstract Methods-----");
        new_truck.vehicle_make();
        new_truck.vehicle_model();
        new_truck.is_4wd();
        
        // use our default methods
        System.out.println("\n\n-----Default Methods-----");
        new_truck.has_truck_bed();
        new_truck.number_wheels();

    }
}



