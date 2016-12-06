package com.funky.line.mypatterns.observer;

/**
 * Created by Rudniev Oleksandr on 05.12.2016.
 */
public class ObserverImpl implements IObserver {

    private ISubject subject;
    private String observerName;

    public ObserverImpl(String observerName) {
        this.observerName = observerName;
    }

    @Override
    public void update() {
        System.out.println("Update method invoked on " + observerName + " from change on subject " + subject);
    }

    @Override
    public void setSubject(ISubject subject) {
        this.subject = subject;
        this.subject.register(this);
    }

    public boolean equals (Object o) {
        if (this == o)
            return true;
        if (!(o instanceof ObserverImpl))
            return false;

        ObserverImpl observer = (ObserverImpl) o;

        if (subject != null ? !subject.equals(observer.subject) : observer.subject != null) return false;
        return observerName != null ? observerName.equals(observer.observerName) : observer.observerName == null;

    }

    public int hashCode() {
        int result = subject != null ? subject.hashCode() : 0;
        result = 31 * result + (observerName != null ? observerName.hashCode() : 0);
        return result;
    }

}
