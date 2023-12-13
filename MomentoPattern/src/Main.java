public class Main {
    public static void main(String[] args) {
        CareTaker careTaker = new CareTaker();
        Originator originator = new Originator(5,10);

        careTaker.addMomento(originator.createMomento());
        originator.setHeight(7);
        originator.setWeight(12);
        careTaker.addMomento(originator.createMomento());
        originator.setHeight(9);
        originator.setWeight(14);
        System.out.println(originator.toString());
        originator.restoreMomento(careTaker.undo());
        System.out.println(originator.toString());
        originator.restoreMomento(careTaker.undo());
        System.out.println(originator.toString());
    }
}