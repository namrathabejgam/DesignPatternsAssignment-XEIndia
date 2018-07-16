package ObserverPatternXEIndia;

import java.util.Scanner;

public class AskPerson {
    public static void main(String[] args)
    {
        Converter converter=new Converter();
        ConversionViewer conversionViewer1=new ConversionViewer(converter);
        System.out.println("Enter the value to be converted in INR");
        double value=(new Scanner(System.in)).nextDouble();
        converter.setValues(value);
        ConversionViewer conversionViewer2=new ConversionViewer(converter);
        double value1=(new Scanner(System.in)).nextDouble();
        converter.setValues(value1);
        converter.unregister(conversionViewer1);
    }

}
