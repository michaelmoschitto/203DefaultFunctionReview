// usually would have this in another folder

interface Vehicle{


    // abstract methods
    public void vehicleMake();
    public void vehicleModel();

    // default method
    default int numberWheels()
    {
        System.out.println("This vehicle has 4 wheels");

        return 4;
    }

}

interface Container{

    // default method
    default void storageVolume(double l, double w, double h)
    {
        System.out.println("This container has a volume of " +  l*w*h + " cubic feet");
    }
}


// The Ford 150 IS-A Vehicle and Truck
 class FordF150 implements Vehicle, Container{

    // implement abstract methods
    public void vehicleMake(){
        System.out.println("Ford");
    }
    public void vehicleModel(){
        System.out.println("F-150");
    }
    public void is4wd(){
        System.out.println("Yes, this vehicle has 4 wheel drive");
    }

}

class StorageContainer implements Container{
    public void maxCapacity(){
        System.out.println("This storage container has a max capacity of 4 tons");
    }
}

class Composition{
    public static void main(String[] args) throws Exception {
        // instantiate our class
        System.out.println("------------------------------Ford F150------------------------------");
        FordF150 new_truck = new FordF150();
        
        // use our abstract methods
        System.out.println("\n-----Abstract Methods-----");
        new_truck.vehicleMake();
        new_truck.vehicleModel();
        new_truck.is4wd();
        
        // use our default methods
        System.out.println("\n\n-----Default Methods-----");
        new_truck.storageVolume(5,4.7,2.3 );
        new_truck.numberWheels();
        
        System.out.println("\n\nThis F150 IS-A container and a vehicle");
        
        System.out.println("\n------------------------------Storage Container------------------------------");
        
        StorageContainer storage_container = new StorageContainer();
        storage_container.maxCapacity();
        storage_container.storageVolume(10, 20, 10);
        
        System.out.println("\n\nThis Storage Container IS-A container");
        System.out.println("------------------------------------------------------------");
    }
}



