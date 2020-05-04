package code68.release1;

import java.util.ArrayList;
import java.util.List;

/**
 * @author shuxun
 */
public class ToolApplication {
    public static void main(String[] args) {
        List<ResourceFile> files =getAllFiles();
        for(ResourceFile file:files){
            file.extract2txt();
        }
    }

    public static  List<ResourceFile> getAllFiles() {
        List<ResourceFile> files = new ArrayList<>();
        files.add(new PdfFile("1.pdf"));
        files.add(new PptFile("1.ppt"));
        files.add(new WordFile("1.word"));
        return files;
    }
}
