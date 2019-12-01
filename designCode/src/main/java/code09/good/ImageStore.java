package code09.good;

import code09.good.Image;

public interface ImageStore {
    String upload(Image image);
    Image dowlaod(String url);
}
