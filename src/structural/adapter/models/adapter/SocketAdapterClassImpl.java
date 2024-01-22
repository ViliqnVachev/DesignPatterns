package structural.adapter.models.adapter;

import structural.adapter.models.Volt;
import structural.adapter.models.Socket;

//Class adapter
public class SocketAdapterClassImpl extends Socket implements SocketAdapter {
    @Override
    public Volt get220Volt() {
        return getVolt();
    }

    @Override
    public Volt get110Volt() {
        return convert(getVolt(), 2);
    }

    @Override
    public Volt get11Volt() {
        return convert(getVolt(), 20);
    }

    private Volt convert(Volt volt, int value) {
        return new Volt(volt.getVolts() / value);
    }
}
