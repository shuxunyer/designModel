package code53.release2;

public abstract class FileSystemNode {
    protected String path;

    public FileSystemNode(String path) {
        this.path = path;
    }

    public abstract int countNumOfFile();

    public abstract long countSizeOfFile();

    public String getPath() {
        return path;
    }
}
