class ElectronicsProduct {
    
    private int productId;
    private String name;
    private double price;

    
    public ElectronicsProduct(int productId, String name, double price) {
        this.productId = productId;
        this.name = name;
        this.price = price;
    }

    
    public void applyDiscount(double discountPercentage) {
        if (discountPercentage > 0 && discountPercentage <= 100) {
            price -= price * (discountPercentage / 100);
        } else {
            System.out.println("Invalid discount percentage.");
        }
    }

    
    public double getFinalPrice() {
        return price;
    }

    
    public void displayProductDetails() {
        System.out.println("Product ID: " + productId);
        System.out.println("Product Name: " + name);
        System.out.println("Price: " + price);
    }
}


class WashingMachine extends ElectronicsProduct {
    
    private int warrantyPeriod; // in years

    
    public WashingMachine(int productId, String name, double price, int warrantyPeriod) {
        super(productId, name, price);
        this.warrantyPeriod = warrantyPeriod;
    }

    
    public void extendWarranty(int extraYears) {
        if (extraYears > 0) {
            warrantyPeriod += extraYears;
        } else {
            System.out.println("Invalid warranty extension.");
        }
    }

    
    public void displayWashingMachineDetails() {
        displayProductDetails();
        System.out.println("Warranty Period: " + warrantyPeriod + " years");
    }
}


public class Electric {
    public static void main(String[] args) {
        
        WashingMachine wm = new WashingMachine(101, "Front Load Washing Machine", 25000, 2);

        
        System.out.println("Before applying discount:");
        wm.displayWashingMachineDetails();

        
        wm.applyDiscount(10);
        System.out.println("\nAfter applying 10% discount:");
        wm.displayWashingMachineDetails();

        
        wm.extendWarranty(1);
        System.out.println("\nAfter extending warranty:");
        wm.displayWashingMachineDetails();
    }
}

