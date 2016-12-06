package com.funky.line.mypatterns.observer;

/**
 * Created by Rudniev Oleksandr on 05.12.2016.
 */
public class Main {

    public static void main(String[] args) {
        ISubject subject = new SubjectImpl();
        subject.setState(0);

        IObserver observer1 = new ObserverImpl("observer1");
        observer1.setSubject(subject);

        IObserver observer2 = new ObserverImpl("observer2");
        observer2.setSubject(subject);

        IObserver observer3 = new ObserverImpl("observer3");
        observer3.setSubject(subject);

        System.out.println("Changing state to 1, plz wait loading...");
        subject.setState(1);

        System.out.println();

        System.out.println("Changign state to 2, plz wait loading...");
        subject.setState(2);

        System.out.println();

        System.out.println("Hmm... observer2");
        subject.unregister(observer2);

        System.out.println();

        System.out.println("Changing state to 3, plz wait loading...");
        subject.setState(3);

        System.out.println("State observer2 " + subject.getState());

        System.out.println(subject.hashCode());
        System.out.println(observer1.hashCode());
        System.out.println(observer2.hashCode());
        System.out.println(observer3.hashCode());
        System.out.println(observer1.equals(observer1));
        System.out.println();
        System.out.println(subject.getState(observer2));




    }
}
