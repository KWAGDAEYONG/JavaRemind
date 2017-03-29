package IOStream;

import java.io.FileInputStream;
import java.io.FileOutputStream;

/**
 * Created by user on 2017-03-29.
 */
public class CopyExample {
    public static void main(String[]args)throws Exception{
        String originFileName = "C:/Temp/Dir/6.png";
        String targetFileName = "C:/Temp/copy6.png";

        FileInputStream fis = new FileInputStream(originFileName);
        FileOutputStream fos = new FileOutputStream(targetFileName);

        int readByteNo;
        byte[]readBytes = new byte[100];
        while((readByteNo = fis.read(readBytes))!=-1){
            fos.write(readBytes,0,readByteNo);
        }

        fos.flush();
        fos.close();
        fis.close();

        System.out.println("복사 완료");

    }
}
