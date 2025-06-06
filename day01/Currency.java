
import java.util.HashMap;
import java.util.Map;

public class Currency {
    private Map<String, Double> conversionRates = new HashMap<>();

    public void set_rate(String from_currency, String to_currency, double rate) {
        conversionRates.put(from_currency + "_" + to_currency, rate);

    }

    public void Convert_currency(String from_currency, String to_currency,double amount){
        String key = from_currency +"_"+ to_currency
        double rate=conversionRates.get(key)
    
        if(rate!=null){
            System.out.println("convert currency:"+amount*rate);

        }

    }

    public static void main(String[] args) {
        Currency currency = new Currency();
        currency.set_rate(indian, AUB, 0.85);
        currency.set_rate(YEN, AUB, 0.89);
        currency.set_rate(Doller, indianRS, 250);
        Currency convert = new Currency();
        convert.Convert_currency(YEN, AUB, 100);
    }

}
