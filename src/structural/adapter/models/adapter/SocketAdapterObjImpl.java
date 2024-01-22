package structural.adapter.models.adapter;

import structural.adapter.models.Socket;
import structural.adapter.models.Volt;

// Object adapter
public class SocketAdapterObjImpl implements SocketAdapter {
    private Socket socket;

    public SocketAdapterObjImpl(Socket socket) {
        this.socket = socket;
    }

    @Override
    public Volt get220Volt() {
        return socket.getVolt();
    }

    @Override
    public Volt get110Volt() {
        return convert(socket.getVolt(), 2);
    }

    @Override
    public Volt get11Volt() {
        return convert(socket.getVolt(), 20);
    }

    private Volt convert(Volt volt, int value) {
        return new Volt(volt.getVolts() / value);
    }
}
