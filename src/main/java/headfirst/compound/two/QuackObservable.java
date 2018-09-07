package headfirst.compound.two;

public interface QuackObservable {
    public void registerObserver(Observer observer);

    public void notifyObservers();
}
