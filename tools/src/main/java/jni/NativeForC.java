
public class NativeForC {

    public native void test();
    static {
        //设置查找路径为当前项目路径
//        System.setProperty("java.library.path", ".");
        //加载动态库的名称
        System.loadLibrary("test");
    }

    public static void main(String[] args) {
        new NativeForC().test();
    }
}
