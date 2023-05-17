import java.util.ArrayList;
import java.util.List;

public class HospitalBedsAvailability implements IObservable{

    List<IObserver> patientList = new ArrayList<>();

    static Integer Beds = 10;

    @Override
    public void add(IObserver observer) {
        patientList.add(observer);
        Beds--;
    }

    @Override
    public void remove(IObserver observer) {
        patientList.remove(observer);
        Beds++;
    }

    @Override
    public void NotifyAllObservers() {
        for (IObserver ob: patientList
             ) {
            ob.update();
        }
    }

    public int getNumberOfBedsAvailable(){
        return Beds;
    }
}
