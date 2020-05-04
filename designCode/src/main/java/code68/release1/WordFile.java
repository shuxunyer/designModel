package code68.release1;

/**
 * @author shuxun
 */
public class WordFile extends ResourceFile {
    public WordFile(String filePath) {
        super(filePath);
    }

    @Override
    public void extract2txt() {
        System.out.println("extract WordFile to txt");
    }
}
