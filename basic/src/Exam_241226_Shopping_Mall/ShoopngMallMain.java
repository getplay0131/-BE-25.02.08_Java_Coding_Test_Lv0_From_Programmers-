package Exam_241226_Shopping_Mall;

public class ShoopngMallMain {
    public static void main(String[] args) {
        Product [] products = new Product[10];

        //   - 재고 관리
        Product electronic1 = new Electionics("삼성 노트북", 1200000,3,"구매 후 2년 후 까지", "구매 후 2년까지 무상 및 그 이후 유상");
        electronic1.setProductId();
        products[0] = electronic1;
        Product electronic2 = new Electionics("엘지 노트북", 1050000,2,"구매 후 1년 후 까지", "구매 후 1년까지 무상 및 그 이후 유상");
        electronic2.setProductId();
        products[1] = electronic2;

        Product clothing1 = new Clothing("브랜드 티셔츠",25000,20,"검정색","XL");
        clothing1.setProductId();
        products[2] = clothing1;
        Product clothing2 = new Clothing("브랜드 후드티",35000,15,"베이지","L");
        clothing2.setProductId();
        products[3] = clothing2;

        Product food1 = new Food("초콜릿",1500,50,"구매 후 1년 후 까지", "자외선을 피해서 보관");
        food1.setProductId();
        products[4] = food1;
        Product food2 = new Food("조리퐁",1800,70,"구매 후 6개월 후 까지", "실온 보관");
        food2.setProductId();
        products[5] = food2;
//   - 가격 변경
        int food1PriceChange = 2000;
        if (food1PriceChange != 0 && food1PriceChange <= 0 && food1PriceChange <= 9999999) {
            food1.setProductPrice(food1PriceChange);
        }

//   - 상품 정보 출력
        for (Product product : products) {
            if (product != null) {
                System.out.println(" ------------------------------------ ");
                System.out.println("상품ID : " + product.getProductId());
                System.out.println("상품명 : " + product.getProductName());
                System.out.println("상품 가격 : " + product.getProductPrice() + " 원");
                System.out.println("상품 재고 : " + product.getProductStock()+ "개") ;
                if (product instanceof Electionics ele) {
                System.out.println("보증 기간 : " + ele.getWarrantyPeriod());
                System.out.println("AS 정보 : " + ele.getASinfo());
                    System.out.println(" ------------------------------------ ");
                } else if (product instanceof Clothing clothes) {
                    System.out.println("상품 색상 : " + clothes.getProductColor());
                    System.out.println("사이즈 : " + clothes.getProductSize());
                    System.out.println(" ------------------------------------ ");
                } else if (product instanceof  Food food) {
                    System.out.println("유통 기한 : " + food.getExpirationDate());
                    System.out.println("보관 방법 : " + food.getStorageMethod());
                    System.out.println(" ------------------------------------ ");
                }
                System.out.println(" ================================= ");

            }
        }

//   - 할인율 적용 (상품 종류별 다른 할인율)
        for (Product product : products) {
            if (product != null) {
                product.discounts(product);
            }
        }
        System.out.println(" ================================= ");
    }

}
