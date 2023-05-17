public class Main {
    public static void main(String[] args) {
        HospitalBedsAvailability hospitalBedsAvailability = new HospitalBedsAvailability();
        PatientObserver patientObserver = new PatientObserver(hospitalBedsAvailability);
        hospitalBedsAvailability.add(patientObserver);
        hospitalBedsAvailability.NotifyAllObservers();
        hospitalBedsAvailability.add(patientObserver);
        hospitalBedsAvailability.NotifyAllObservers();
        hospitalBedsAvailability.add(patientObserver);
        hospitalBedsAvailability.NotifyAllObservers();
        hospitalBedsAvailability.add(patientObserver);
        hospitalBedsAvailability.NotifyAllObservers();
        hospitalBedsAvailability.remove(patientObserver);
        hospitalBedsAvailability.NotifyAllObservers();
        patientObserver.BedsAvailable(); //should return 7


    }
}
