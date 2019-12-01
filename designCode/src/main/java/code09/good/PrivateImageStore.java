package code09.good;

import code09.good.Image;

public class PrivateImageStore implements ImageStore {
    @Override
    public String upload(Image image) {
        //...往私有云上传图片...
        return null;
    }

    @Override
    public Image dowlaod(String url) {
        //...从私有云下载图片...
        return null;
    }

}
