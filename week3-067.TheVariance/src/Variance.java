import java.util.ArrayList;

public class Variance { 
    public static int sum(ArrayList<Integer> list) {    
        int sum = 0;
        for (int git : list) {
            sum += git;
        }
        return sum;
    }
    
    public static double average(ArrayList<Integer> list) {
        
        double sumbert = sum(list);
        return sumbert / list.size();
        
    }

    public static double variance(ArrayList<Integer> list) {
        // write code here
        
        double average = average(list);
        double varianceBuffer = 0.0;
        double varianceResult;
        
        for (int i : list) {
            varianceBuffer = varianceBuffer + Math.pow((i - average), 2);
        
        }
        
        varianceResult = varianceBuffer / (list.size() - 1);
        
        return varianceResult;
    }
    
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(3);
        list.add(2);
        list.add(7);
        list.add(2);
        
        System.out.println("The variance is: " + variance(list));
    }

}
