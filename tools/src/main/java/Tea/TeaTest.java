package main.java.Tea;

public class TeaTest {

    int[] KEY = new int[]{//加密解密所用的KEY
            0x01,0x02,0x03,0x04,0x05,0x06,0x07,0x08,
            0x09,0x0A,0x0B,0x0C,0x0D,0x0E,0x0F,0x10
    };
    Tea tea = new Tea();

    private byte[] encryptByTea(String info){
        byte[] temp = info.getBytes();
        int n = 8 - temp.length % 8;//若temp的位数不足8的倍数,需要填充的位数
        byte[] encryptStr = new byte[temp.length + n];
        encryptStr[0] = (byte)n;
        System.arraycopy(temp, 0, encryptStr, n, temp.length);
        byte[] result = new byte[encryptStr.length];
        for(int offset = 0; offset < result.length; offset += 8){
            byte[] tempEncrpt = tea.encrypt(encryptStr, offset, KEY, 32);
            System.arraycopy(tempEncrpt, 0, result, offset, 8);
        }
        return result;
    }
    //通过TEA算法解密信息
    private String decryptByTea(byte[] secretInfo){
        byte[] decryptStr = null;
        byte[] tempDecrypt = new byte[secretInfo.length];
        for(int offset = 0; offset < secretInfo.length; offset += 8){
            decryptStr = tea.decrypt(secretInfo, offset, KEY, 32);
            System.arraycopy(decryptStr, 0, tempDecrypt, offset, 8);
        }

        int n = tempDecrypt[0];
        return new String(tempDecrypt, n, decryptStr.length - n);

    }

    public static void main(String[] args) {
        String info = "pro:1234567";
        System.out.println("原数据：" + info);
        for(byte i : info.getBytes()) {
            System.out.print(i + " ");
        }
        TeaTest io = new TeaTest();

        byte[] encryptInfo = io.encryptByTea(info);
        System.out.println();
        System.out.println("加密后的数据：");
        for(byte i : encryptInfo){
            System.out.print(String.format("%02x ", new Integer(i & 0xff)));
        }
        System.out.println();

        String decryptInfo = io.decryptByTea(encryptInfo);
        System.out.print("解密后的数据：");
        System.out.println(decryptInfo);
        for(byte i : decryptInfo.getBytes())
            System.out.print(i + " ");
        System.out.println();
    }
}
