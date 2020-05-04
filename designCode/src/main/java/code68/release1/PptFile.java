package code68.release1;

/**
 * @author shuxun
 */
public class PptFile extends ResourceFile {
    public PptFile(String filePath) {
        super(filePath);
    }

    @Override
    public void extract2txt() {
        System.out.println("extract PPTFile to txt");
    }
}
