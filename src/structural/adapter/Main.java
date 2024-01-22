package structural.adapter;

import structural.adapter.models.Socket;
import structural.adapter.models.Volt;
import structural.adapter.models.adapter.SocketAdapter;
import structural.adapter.models.adapter.SocketAdapterClassImpl;
import structural.adapter.models.adapter.SocketAdapterObjImpl;

public class Main {
    public static void main(String[] args) {
        Socket socket = new Socket();
        SocketAdapter socketAdapterObj = new SocketAdapterObjImpl(socket);
        Volt volt11 = getVolt(socketAdapterObj, 11);
        Volt volt110 = getVolt(socketAdapterObj, 110);
        Volt volt220 = getVolt(socketAdapterObj, 220);

        System.out.println("Object adapter " + volt11.getVolts());
        System.out.println("Object adapter " + volt110.getVolts());
        System.out.println("Object adapter " + volt220.getVolts());
        System.out.println("============");

        SocketAdapter socketAdapterClass = new SocketAdapterClassImpl();
        volt11 = getVolt(socketAdapterClass, 11);
        volt110 = getVolt(socketAdapterClass, 110);
        volt220 = getVolt(socketAdapterClass, 220);
        System.out.println("Class adapter " + volt11.getVolts());
        System.out.println("Class adapter " + volt110.getVolts());
        System.out.println("Class adapter " + volt220.getVolts());
    }

    private static Volt getVolt(SocketAdapter socketAdapter, int i) {
        switch (i) {
        case 11:
            return socketAdapter.get11Volt();
        case 110:
            return socketAdapter.get110Volt();
        case 220:
            return socketAdapter.get220Volt();
        default:
            return null;
        }
    }
}
