package code68.release3;

/**
 * @author shuxun
 */
public class PptFile extends ResourceFile {
    public PptFile(String filePath) {
        super(filePath);
    }

    @Override
    public void accept(Extractor extractor) {
        extractor.extract2txt(this);
    }


}
