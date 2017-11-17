package main.java;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zhangzl on 2017/3/20.
 */
public class CommonException extends RuntimeException {
    private List<String> causes = new ArrayList<String>();

    public CommonException(List<? extends String> _causes){
        causes.addAll(_causes);
    }

    public List<String> getException(){
        return causes;
    }
}
