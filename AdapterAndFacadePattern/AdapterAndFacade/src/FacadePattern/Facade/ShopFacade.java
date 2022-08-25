package Facade;

import Subsystem.AccountService;
import Subsystem.EmailService;
import Subsystem.PaymentService;
import Subsystem.ShippingService;
import Subsystem.SmsService;

public class ShopFacade {
    private static ShopFacade instance;

    private AccountService accountService;
    private PaymentService paymentService;
    private ShippingService shippingService;
    private EmailService emailService;
    private SmsService smsService;

    private ShopFacade(){
        accountService = new AccountService();
        paymentService = new PaymentService();
        shippingService = new ShippingService();
        emailService = new EmailService();
        smsService = new SmsService();
    }

    public static ShopFacade getInstance(){
        if (instance == null){
            instance = new ShopFacade();
        }
        return instance;
        
    }

    public void  buyProductByCashWithFreeShipping(String email){
        accountService.getAccount(email);
        paymentService.PaymentByCash();
        shippingService.FreeShipping();
        emailService.sendMail(email);
        System.out.println("Done!");
    }

    public void buyProductByPaypalWithStandardShipping(String email, String mobilePhone){
        accountService.getAccount(email);
        paymentService.PaymentByPaypal();
        shippingService.StandardShipping();
        emailService.sendMail(email);
        smsService.sendSMS(mobilePhone);
        System.out.println("Done!");

    }
}
