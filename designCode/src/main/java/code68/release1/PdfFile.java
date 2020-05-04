package code68.release1;

/**
 * @author shuxun
 */
public class PdfFile extends ResourceFile {
    public PdfFile(String filePath) {
        super(filePath);
    }

    @Override
    public void extract2txt() {
        System.out.println("extract PDFFile to txt");
    }
}
