package by.gsu.pmslab;

import java.util.ArrayList;
import java.util.List;

public class ClaculatorThread extends Thread {
    private int a;
    private double result=1;
    private List<Integer> res=new ArrayList<>();
    public ClaculatorThread(int a){
        this.a=a;
    }
    public List<Integer> getResult() {
        for(int i=1;i<=a;i++){
            if (i*4%10==0) {
                res.add(i);
            }
        }
        return res;
    }
}


