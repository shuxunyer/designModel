package code09.good;

import code09.good.AliyunImageStore;
import code09.good.Image;

// AliyunImageStore类的使用举例
public class ImageProcessingJob {
    private static final String BUCKET_NAME = "ai_images_bucket";
    //...省略其他无关代码...

    /**
     *  1 创建bucket存储目录
     *  2 生成access token访问凭证
     *  3 携带access token 上传图片到指定的bucket中
     */
    public void process() {
        Image image = new Image(); //处理图片，并封装为Image对象
        ImageStore imageStore = new AliyunImageStore(/*省略参数*/);
        imageStore.upload(image);
        imageStore.dowlaod("");
    }

}
