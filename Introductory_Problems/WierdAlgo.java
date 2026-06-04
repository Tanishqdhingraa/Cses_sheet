package Introductory_Problems;
import java.util.ArrayList;

class WierdAlgo {

    public ArrayList<Integer> WierdAlgorithum(int n) {
        ArrayList<Integer> list= new ArrayList<>(); 
        list.add(n);
        while( n != 1){
            if(n % 2 == 0){
                n = n/2;
            }else {
                n = 3 * n+1;
            }
            list.add(n);
        }
        return list;
    }

    public static void main(String[] args) {
        WierdAlgo r = new WierdAlgo();
        System.out.println(r.WierdAlgorithum(3));
    }
}