package code53.release2;

import java.util.ArrayList;
import java.util.List;

public class Directory extends FileSystemNode {
    public List<FileSystemNode> subNodes = new ArrayList<FileSystemNode>();

    public Directory(String path) {
        super(path);
    }

    @Override
    public int countNumOfFile() {
        int countNumOfFile = 0;
        for (FileSystemNode fileOrDir : subNodes) {
            countNumOfFile += fileOrDir.countNumOfFile();
        }
        return countNumOfFile;
    }

    @Override
    public long countSizeOfFile() {
        int countSizeOfFile = 0;
        for (FileSystemNode fileOrDir : subNodes) {
            countSizeOfFile += fileOrDir.countNumOfFile();
        }
        return countSizeOfFile;
    }

    public void addSubNode(FileSystemNode fileOrDir) {
        subNodes.add(fileOrDir);
    }

    public void removeSubNode(FileSystemNode fileOrDir) {
        int size = subNodes.size();
        int i = 0;
        for (; i < size; i++) {
            if (subNodes.get(i).path.equalsIgnoreCase(fileOrDir.getPath())) {
                break;
            }
        }
        if (i < size) {
            subNodes.remove(fileOrDir);
        }
    }
}
