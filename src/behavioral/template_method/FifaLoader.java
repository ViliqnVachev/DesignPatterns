package behavioral.template_method;

public class FifaLoader extends BaseGameLoader{
    @Override
    void loadLocalData() {
        System.out.println("Loading local Fifa files...");
    }

    @Override
    void createObjects() {
        System.out.println("Creating Fifa objects...");
    }

    @Override
    void downloadFiles() {
        System.out.println("Downloading Fifa files...");
    }

    @Override
    void init() {
        System.out.println("Fifa is loaded...");
    }
}
