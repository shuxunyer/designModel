package code09.bad;

/**
 * 基于接口而非实现编程的原则：
 * 1 函数的命名不能具体的实现细节，如uploadToAliyun、downloadFromAliyun
 *  应该去掉Aliyun，改为更为抽象的upload、download
 * 2 封装具体的细节，
 *  比如跟阿里云相关的特殊上传或下载流程(创建token,创建bucket目录)不应该暴露给调用者
 *  我们对上传流程就行封装，仅仅对外提供一个包裹了所有实现细节的方法供外部调用
 * 3 为实现类定义抽象的接口，具体的实现类都依赖统一的接口定义，遵从相同的上传功能协议，
 *  使用者依赖接口，而不是具体的实现编程。
 */
public class AliyunImageStore {
    //...省略属性、构造函数等...
    String defaultStr = "";
    public void createBucketIfNotExisting(String bucketName) {
        // ...创建bucket代码逻辑...
        // ...失败会抛出异常..
    }

    public String generateAccessToken() {
        // ...根据accesskey/secrectkey等生成access token
        return defaultStr;
    }

    public String uploadToAliyun(Image image, String bucketName, String accessToken) {
        //...上传图片到阿里云...
        //...返回图片存储在阿里云上的地址(url）...
        return defaultStr;
    }

    public Image downloadFromAliyun(String url, String accessToken) {
        //...从阿里云下载图片...
        return new Image();
    }
}


