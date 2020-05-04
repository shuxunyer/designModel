package code68.release1;

/**
 * @author shuxun
 */
public abstract class ResourceFile {
    private String filePath;

    public ResourceFile(String filePath) {
        this.filePath = filePath;
    }

    public abstract void extract2txt();
}
