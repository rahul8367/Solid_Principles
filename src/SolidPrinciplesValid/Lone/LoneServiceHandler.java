package SolidPrinciplesValid.Lone;

public class LoneServiceHandler {
    public static LonePlan getPlan(String select){
        if("one".equalsIgnoreCase(select)){
            return new OneMonth();
        }
        else if("six".equalsIgnoreCase(select)){
            return new SixMonths();
        }
        else if("oneyear".equalsIgnoreCase(select)){
            return new OneYear();
        }
        else
            return new DefultL();
    }
}
