package structural.adapter.models.adapter;

import structural.adapter.models.Volt;

public interface SocketAdapter {

    Volt get220Volt();

    Volt get110Volt();

    Volt get11Volt();

}
