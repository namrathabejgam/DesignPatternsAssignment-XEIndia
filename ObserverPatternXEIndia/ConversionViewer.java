package ObserverPatternXEIndia;

public class ConversionViewer implements Observer {
    private double INR;
    private double USD;
    private double GBP;
    private double EURO;

    private static int observerIDTracker=0;

    private int observerID;

    private ISubject person;

    public ConversionViewer(ISubject person)
    {
        this.person=person;
        observerID=++observerIDTracker;
        person.register(this);
    }

    @Override
    public void update(double INR, double USD, double GBP, double EURO) {
        this.INR=INR;
        this.USD=USD;
        this.GBP=GBP;
        this.EURO=EURO;
        printValues();
    }

    public void printValues()
    {
        System.out.println("Conversions for the value "+INR+" INR:");
        System.out.println("USD: "+USD);
        System.out.println("GBP: "+GBP);
        System.out.println("EURO: "+EURO);

    }
}

