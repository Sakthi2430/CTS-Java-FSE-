class Product {

    int productId;
    String productName;
    String category;

    Product(int productId, String productName, String category) {
        this.productId = productId;
        this.productName = productName;
        this.category = category;
    }

    void display() {
        System.out.println(
                "ID: " + productId +
                ", Name: " + productName +
                ", Category: " + category);
    }
}

class LinearSearch {

    static Product search(Product[] products, int targetId) {

        for (Product p : products) {

            if (p.productId == targetId) {
                return p;
            }
        }

        return null;
    }
}

class BinarySearch {

    static Product search(Product[] products, int targetId) {

        int low = 0;
        int high = products.length - 1;

        while (low <= high) {

            int mid = (low + high) / 2;

            if (products[mid].productId == targetId)
                return products[mid];

            else if (targetId < products[mid].productId)
                high = mid - 1;

            else
                low = mid + 1;
        }

        return null;
    }
}

public class Ecommerce {

    public static void main(String[] args) {

        Product[] products = {
            new Product(101, "Laptop", "Electronics"),
            new Product(102, "Mouse", "Electronics"),
            new Product(103, "Keyboard", "Electronics"),
            new Product(104, "Chair", "Furniture"),
            new Product(105, "Table", "Furniture")
        };

        int searchId = 104;

        System.out.println("Linear Search:");

        Product result1 =
                LinearSearch.search(products, searchId);

        if (result1 != null)
            result1.display();
        else
            System.out.println("Product not found");

        System.out.println();

        System.out.println("Binary Search:");

        Product result2 =
                BinarySearch.search(products, searchId);

        if (result2 != null)
            result2.display();
        else
            System.out.println("Product not found");
    }
}