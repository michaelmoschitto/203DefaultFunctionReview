// ---------------------------------------------------
// TODO: Fix the errors and decouple this OOP project.
// * StorageContainers are Containers
// * FordF150's are Vehicle's AND StorageContainers
// ---------------------------------------------------

abstract class Vehicle{


    // abstract methods
    abstract void vehicle_make();
    abstract void vehicle_model();

    int number_wheels()
    {
        System.out.println("This vehicle has 4 wheels");

        return 4;
    }

}

class Container{
    void storage_volume(double l, double w, double h)
    {
        System.out.println("This container has a volume of " +  l*w*h + " cubic feet");
    }
}


//! Why is this a problem?
class FordF150 extends Vehicle, Container{

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

}

class StorageContainer extends Container{
    public void max_capacity(){
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
        new_truck.vehicle_make();
        new_truck.vehicle_model();
        new_truck.is_4wd();
        
        // use our default methods
        System.out.println("\n\n-----Default Methods-----");
        
        //! Why is this an error? 
        new_truck.storage_volume(5,4.7,2.3 );
        new_truck.number_wheels();
        
        System.out.println("\n\nThis F150 IS-A container and a vehicle");
        
        System.out.println("\n------------------------------Storage Container------------------------------");
        
        StorageContainer storage_container = new StorageContainer();
        storage_container.max_capacity();
        storage_container.storage_volume(10, 20, 10);
        
        System.out.println("\n\nThis Storage Container IS-A container");
        System.out.println("------------------------------------------------------------");
    }
}



