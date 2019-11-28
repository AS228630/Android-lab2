package Tasks;

public class MoneyConvertor {
    public Ruble convertToRubli(Euro euro) {
       return new Ruble(euro.getValue());
    }

    public Ruble convertToRubli(Dollar dollar) {
        return new Ruble(dollar.getValue());
    }

    public Ruble convertToRubli(Yuan yuan) {
        return new Ruble(yuan.getValue());
    }
}
