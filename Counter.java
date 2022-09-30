/**
 * @author Rene Fuhry
 */
public class Counter {
    private int limit;
    private int maxLimit;
    private int value;
    
    public Counter() {
        setMaxLimit(9999);
        setLimit(9999);
        setValue(0);
    }
    
    public Counter(int newMaxLimit) {
        setMaxLimit(newMaxLimit);
        setLimit(newMaxLimit);
        setValue(0);
    }
    
    /**
     * sets the max limit
     */
    public void setMaxLimit(int newMaxLimit) {
        maxLimit = newMaxLimit;
    }
    
    /**
     * you can set a sublimit if you wanna count to a specific value thats below the max limit
     * limit needs to be larger than zero and cannot be larger than the max limit
     */
    public void setLimit(int newLimit) {
        if(newLimit > 0 && newLimit <= maxLimit) {
            limit = newLimit;   
        }
        else {
            System.out.println("limit needs to be smaller than your max limit");
        }
    }
    
    /**
     * you can set the value to anything
     * value needs to be positive and within limit
     */
    public void setValue(int newValue) {
        if(newValue >= 0 && newValue <= limit) {
            value = newValue;            
        }
        else {
            System.out.println("value can't be bigger than limit");
        }
    }
    
    public int getLimit() {
        return limit;
    }
    
    public int getMaxLimit() {
        return maxLimit;
    }
    
    public int getValue() {
        return value;
    }
    
    /**
     * adds 1 to value and rolls over to 0 when it reaches the limit
     */
    public void count() {
        if(value < limit) {
            setValue(value + 1);
        }
        else {
            reset();
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
        System.out.println(maxLimit);
    }
    
    /**
     * counts and returns the new Value
     */
    public int countReturnNew() {
        count();
        return value;
    }
    
    /**
     * resets and outputs the old Value
     */
    public int resetGetOld() {
        int oldValue;
        
        oldValue = value;
        reset();
        return oldValue;
    }
}