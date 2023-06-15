public class Main {
    public static void main(String[] args) {
        Charger charger = new Charger();
        Power adapter = new Power(charger);

        int voltage = adapter.getVoltage();
        System.out.println("Напряжение: " + voltage + " вольт");
    }
}