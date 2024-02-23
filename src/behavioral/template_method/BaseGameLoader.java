package behavioral.template_method;

public abstract class BaseGameLoader {
    public final void load() {
        loadLocalData();
        createObjects();
        downloadFiles();
        cleanTempFiles();
        init();
    }

    private void cleanTempFiles() {
        System.out.println("Cleaning temporary files....");
    }

    abstract void loadLocalData();

    abstract void createObjects();

    abstract void downloadFiles();
    abstract void init();
}
