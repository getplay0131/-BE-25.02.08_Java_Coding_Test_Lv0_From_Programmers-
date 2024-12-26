//super 호출로 부모 클래스 호출 필요

package Exam_241226_Shopping_Mall;

public class Clothing extends Product {
private String productSize;
private String productColor;


public Clothing(String productName,int productPrice, int productStock,String productColor, String productSize){
    super(productName,productPrice,productStock);
    this.productColor = productColor;
    this.productSize = productSize;
}

    public String getProductColor() {
        return productColor;
    }

    public String getProductSize() {
        return productSize;
    }

    public void setProductColor(String productColor) {
        this.productColor = productColor;
    }

    public void setProductSize(String productSize) {
        this.productSize = productSize;
    }
}