/**
 * @author Rene Fuhry
 * @version 23-09-2022
 */
public class Counter {
    private int limit;
    private int max_limit;
    private int value;
    
    public Counter() {
        setMaxLimit(9999);
        setLimit(9999);
        setValue(0);
    }
    
    public Counter(int set_max_limit) {
        setMaxLimit(set_max_limit);
        setLimit(set_max_limit);
        setValue(0);
    }
    
    public void setMaxLimit(int set_max_limit) {
        max_limit = set_max_limit;
    }
    
    public void setLimit(int set_limit) {
        if(set_limit > 0 && set_limit <= max_limit) {
            limit = set_limit;   
        }
        else {
            System.out.println("limit needs to be smaller than your max limit");
        }
    }
    
    public void setValue(int set_value) {
        if(set_value >= 0 && set_value <= limit) {
            value = set_value;            
        }
        else {
            System.out.println("value can't be bigger than limit");
        }
    }
    
    public int getLimit() {
        return limit;
    }
    
    public int getMaxLimit() {
        return max_limit;
    }
    
    public int getValue() {
        return value;
    }
    
    public void count() {
        if(value < limit) {
            setValue(value + 1);
        }
        else {
            setValue(0);
        }
    }
    
    public void reset() {
        setValue(0);
    }
    
    public void show() {
        System.out.println(value);
    }
    
    public void showLimits() {
        System.out.println(limit);
        System.out.println(max_limit);
    }
}
