package main.java;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Created by zhangzl on 2017/9/12.
 */
public class ListAddAll {

    public static void main(String[] args) {
        List<Demo> oneArr = new ArrayList<Demo>(){
            {
                add(new Demo(1, "a", null));
                add(new Demo(2, "a", null));
                add(new Demo(3, "a", null));
            }
        };
        List<Demo> twoArr = new ArrayList<Demo>(){
            {
                add(new Demo(1, null, "b"));
                add(new Demo(2, null, "b"));
                add(new Demo(3, null, "b"));
            }
        };

        Map<Integer, Demo> oneArrMap = oneArr.stream().collect(Collectors.toMap(o -> o.getFlag(), o -> o));

        System.out.print(oneArrMap.toString());

    }

    public static class Demo {

        public Demo(int flag, String value, String code){
            this.flag = flag;
            this.code = code;
            this.value = value;
        }

        private int flag;

        private String value;

        private String code;

        public int getFlag() {
            return flag;
        }

        public void setFlag(int flag) {
            this.flag = flag;
        }

        public String getValue() {
            return value;
        }

        public void setValue(String value) {
            this.value = value;
        }

        public String getCode() {
            return code;
        }

        public void setCode(String code) {
            this.code = code;
        }
    }
}

