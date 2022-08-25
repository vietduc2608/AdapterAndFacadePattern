package Facade;

public class Client {
    public static void main(String[] args) {
        ShopFacade.getInstance().buyProductByCashWithFreeShipping("vietduc2608@gmail.com");
        ShopFacade.getInstance().buyProductByPaypalWithStandardShipping("huynhtin0501@gmal.com", "0707458017");
    }
}
