package seminar2.cw2;

public class Human {

    private Transport lustTransport;

    public void drive(Transport transport) {
        if (lustTransport == null) {
            transport.start();
            lustTransport = transport;
        } else {
            System.out.println("уже еду");
        }
    }

    public void stop() {
        if (lustTransport != null) {
            lustTransport.stop();
            lustTransport = null;
        } else {
            System.out.println("уже стою");
        }
    }
}