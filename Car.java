class Car
{
    String brand;
    String model;
    double price;

    Car(String brand, String model, double price)
    {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    void displayDetails()
    {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Price: " + price);
    }

    public static void main(String args[])
    {
        Car c1 = new Car("Toyota", "Fortuner", 3500000);
        Car c2 = new Car("BMW", "X5", 7500000);
        Car c3 = new Car("Mahindra", "Thar", 1800000);

        c1.displayDetails();
        c2.displayDetails();
        c3.displayDetails();
    }
}