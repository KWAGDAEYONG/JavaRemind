package network;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * Created by user on 2017-03-30.
 */
public class InetAddressExample {
    public static void main(String[]args){
        try{
            InetAddress local = InetAddress.getLocalHost();
            System.out.println("내컴퓨터 ip주소:"+local.getHostAddress());

            InetAddress[] iaArr = InetAddress.getAllByName("www.naver.com");
            for(InetAddress remote : iaArr){
                System.out.println("네이버 ip:"+remote.getHostAddress());
            }
        }catch(UnknownHostException e){
            e.printStackTrace();
        }
    }
}
