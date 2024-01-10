package week4.c07_Interface;

import java.util.SplittableRandom;

public interface IBanka {
    final String hostIpAdress = "127.0.0.1";
 boolean connect (String ipAddress);
 boolean payment (double price, String cardNumber, String expiryDate, String cvv);

}
