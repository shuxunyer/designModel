package code53.release1;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class FileSystemNode {
    private String path;
    private boolean isFile;

    private List<FileSystemNode> subNodes = new ArrayList<FileSystemNode>();

    public FileSystemNode(String path, boolean isFile) {
        this.path = path;
        this.isFile = isFile;
    }

    public String getPath() {
        return path;
    }

    public int countNumOfFiles() {
        if (isFile) {
            return 1;
        }
        int numOfFiles = 0;
        for (FileSystemNode node : subNodes) {
            numOfFiles += node.countNumOfFiles();
        }
        return numOfFiles;
    }

    public long countSizeOfFiles() {
        if (isFile) {
            File file = new File(this.path);
            if (!file.exists()) {
                return 0;
            }
            return file.length();
        }
        int sizeOfFile = 0;
        for (FileSystemNode node : subNodes) {
            sizeOfFile += node.countSizeOfFiles();
        }
        return sizeOfFile;
    }

    public void addSubNode(FileSystemNode fileOrDir) {
        this.subNodes.add(fileOrDir);
    }

    public void removeSubNode(FileSystemNode fileOrDir) {
        int size = subNodes.size();
        int i = 0;
        for (; i < size; i++) {
            if (fileOrDir.getPath().equalsIgnoreCase(subNodes.get(i).getPath())) {
                break;
            }
        }
        if (i < size) {
            subNodes.remove(fileOrDir);
        }
    }
}
