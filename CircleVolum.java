public class CircleVolum implements ISubscriber{
    public void notifySubscriber(String input){
        Integer radius = Integer.parseInt(input);
        System.out.println ("Circlevolum: "+4/3*Math.PI*Math.pow(radius,3));
    }
}
