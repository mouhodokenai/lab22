public class Power implements Voltage {
    private final Charger charger;
    public Power(Charger charger){
        this.charger = charger;
    }
    @Override
    public int getVoltage() {
        System.out.println("Адаптер преобразует напряжение 380 вольт в 220 вольт");
        charger.charge();
        return 220;
    }
}
