package Exam_241226_Shopping_Mall;

public class Product {
    private final String productId;
    private String productName;
    private int productPrice;
    private int productStock;
    private static int idCounter = 1;

    public Product(String productName, int productPrice, int productStock) {
        this.productId = setProductId() + idCounter++;
        this.productName = productName;
        this.productPrice = productPrice;
        this.productStock = productStock;
    }


    public String setProductId() {
        return "Product";
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public void setProductPrice(int productPrice) {
        this.productPrice = productPrice;
    }

    public void setProductStock(int productStock) {
        this.productStock = productStock;
    }

    public String getProductId() {
        return productId;
    }

    public int getProductPrice() {
        return productPrice;
    }

    public int getProductStock() {
        return productStock;
    }

    public String getProductName() {
        return productName;
    }

    public void discounts(Product product){
        final  double ELETIONICS_DISCOUNT = 0.1;
        final  double CLOTHES_DISCOUNT = 0.05;
        final  double FOOD_DISCOUNT = 0.025;
        int originalPrice = product.getProductPrice();
        int discountPrice = 0;
        int calculatedPrice = 0;
        if (product != null) {
            if (product instanceof Electionics) {
                discountPrice = (int)((originalPrice * ELETIONICS_DISCOUNT));
                calculatedPrice = originalPrice - discountPrice;
            } else if (product instanceof Clothing) {
                discountPrice = (int)((originalPrice * CLOTHES_DISCOUNT));
                calculatedPrice = originalPrice - discountPrice;
            } else if (product instanceof Food) {
                discountPrice = (int)((originalPrice * FOOD_DISCOUNT));
                calculatedPrice = originalPrice - discountPrice;
            }
        }
        System.out.println(" ------------------------------------ ");
        System.out.println("상품 ID : " + product.getProductId());
        System.out.println("상품명 : " + product.getProductName());
        System.out.println("원래 가격 : " + originalPrice + "원");
        System.out.println("할인 가격 : " + discountPrice + "원");
        System.out.println("최종 가격 : " + calculatedPrice + " 원");
    }
}