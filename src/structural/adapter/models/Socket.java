package structural.adapter.models;

import structural.adapter.models.Volt;

public class Socket {

    public Volt getVolt() {
        return new Volt(220);
    }
}
