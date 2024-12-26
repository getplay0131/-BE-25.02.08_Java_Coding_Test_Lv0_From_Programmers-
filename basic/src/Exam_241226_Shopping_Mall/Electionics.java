//super로 부모 호출 필요함

package Exam_241226_Shopping_Mall;

public class Electionics extends Product {
private String warrantyPeriod;
private String ASinfo;

public Electionics (String productName,int productPrice, int productStock, String warrantyPeriod, String ASinfo){
    super(productName,productPrice, productStock);
    this.warrantyPeriod = warrantyPeriod;
    this.ASinfo = ASinfo;
}

    public String getASinfo() {
        return ASinfo;
    }

    public String getWarrantyPeriod() {
        return warrantyPeriod;
    }

    public void setASinfo(String ASinfo) {
        this.ASinfo = ASinfo;
    }

    public void setWarrantyPeriod(String warrantyPeriod) {
        this.warrantyPeriod = warrantyPeriod;
    }
}