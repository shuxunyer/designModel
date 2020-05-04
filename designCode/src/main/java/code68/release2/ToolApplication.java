package code68.release2;

import java.util.ArrayList;
import java.util.List;

/**
 * @author shuxun
 */
public class ToolApplication {
    public static void main(String[] args) {
        Extractor extractor =new Extractor();
        List<ResourceFile> files =getAllFiles();
        for(ResourceFile file:files){
//            extractor.extract2txt(file);
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
