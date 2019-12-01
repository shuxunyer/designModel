package code09.good;

import code09.good.Image;

public class AliyunImageStore implements ImageStore {
    //...省略属性、构造函数等...
    String defaultStr = "";

    @Override
    public String upload(Image image) {
        String bucketName = createBucketIfNotExisting("");
        String accessToken = generateAccessToken();
        return uploadToAliyun(image, bucketName, accessToken);
    }

    @Override
    public Image dowlaod(String url) {
        String accessToken = generateAccessToken();
        return downloadFromAliyun(url,accessToken);
    }


    private String createBucketIfNotExisting(String bucketName) {
        // ...创建bucket代码逻辑...
        // ...失败会抛出异常..
        return defaultStr.concat(bucketName);
    }

    private String generateAccessToken() {
        // ...根据accesskey/secrectkey等生成access token
        return defaultStr;
    }

    private String uploadToAliyun(Image image, String bucketName, String accessToken) {
        //...上传图片到阿里云...
        //...返回图片存储在阿里云上的地址(url）...
        return defaultStr;
    }

    private Image downloadFromAliyun(String url, String accessToken) {
        //...从阿里云下载图片...
        return new Image();
    }
}
