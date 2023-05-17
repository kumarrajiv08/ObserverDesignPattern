public class PatientObserver implements IObserver {

    HospitalBedsAvailability hospitalBedsAvailability;

    private int BedsAvailable;

    public PatientObserver(HospitalBedsAvailability hospitalBeds) {
        this.hospitalBedsAvailability = hospitalBeds;
    }

    @Override
    public void update() {
       BedsAvailable = this.hospitalBedsAvailability.getNumberOfBedsAvailable();
    }

    public void BedsAvailable(){
        System.out.println("Current Availability of beds:" + BedsAvailable);
    }
}
