//super 사용으로 부모 클래스 호출 필요
package Exam_241226_Shopping_Mall;

public class Food extends  Product{
    private String expirationDate;
    private String storageMethod;
    

    public Food(String productName,int productPrice, int productStock,String expirationDate, String storageMethod) {
        super(productName,productPrice,productStock);
        this.expirationDate = expirationDate;
        this.storageMethod = storageMethod;
    }

    public String getExpirationDate() {
        return expirationDate;
    }

    public String getStorageMethod() {
        return storageMethod;
    }

    public void setExpirationDate(String expirationDate) {
        this.expirationDate = expirationDate;
    }

    public void setStorageMethod(String storageMethod) {
        this.storageMethod = storageMethod;
    }
}