package behavioral.template_method;

public class CSLoader extends BaseGameLoader{
    @Override
    void loadLocalData() {
        System.out.println("Loading local CS files...");
    }

    @Override
    void createObjects() {
        System.out.println("Creating CS objects...");
    }

    @Override
    void downloadFiles() {
        System.out.println("Downloading CS files...");
    }

    @Override
    void init() {
        System.out.println("CS is loaded...");
    }
}
