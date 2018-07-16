package ObserverPatternXEIndia;

import java.util.ArrayList;

public class Converter implements ISubject {

    private ArrayList<Observer> observers;

    private double INR;
    private double USD;
    private double GBP;
    private double EURO;

    public Converter()
    {
        observers=new ArrayList<Observer>();
    }
    @Override
    public void register(Observer o) {
        observers.add(o);
    }

    @Override
    public void unregister(Observer o) {
        int index=observers.indexOf(o);
        System.out.println("Removed observer "+(index+1));
        observers.remove(index);
        System.out.println("Current size:"+observers.size());
    }

    @Override
    public void notifyObserver() {
        for (Observer o:observers)
        {
            o.update(INR,USD,GBP,EURO);
        }
        System.out.println(observers.size());
    }
    public void setValues(double newINR)
    {
        this.INR=newINR;
        this.USD=Math.round((newINR/65)*100)/100.0;
        this.GBP=Math.round((newINR/80)*100)/100.0;
        this.EURO=Math.round((newINR/69)*100)/100.0;
        notifyObserver();
    }

}
