package springboo.example.taliapro;

import com.aliyun.oss.ClientException;
import com.aliyun.oss.OSS;
import com.aliyun.oss.OSSClientBuilder;
import com.aliyun.oss.OSSException;

import java.io.FileInputStream;
import java.io.InputStream;

public class OssUploadExample {
    public static void main(String[] args) throws Exception {
        // Endpoint以华东1（杭州）为例，其它Region请按实际情况填写。
        String endpoint = "https://oss-cn-beijing.aliyuncs.com";
        // 阿里云账号AccessKey拥有所有API的访问权限，风险很高。强烈建议您创建并使用RAM用户进行API访问或日常运维
        String accessKeyId = "LTAI5t7tBSsYg58GxCrEeWtJ";
        String accessKeySecret = "QyYQMMfQBa7lf3hpDMxPJP96zd32fV";
        // 填写Bucket名称，例如examplebucket
        String bucketName = "web-taliszxy";
        // 填写Object完整路径，完整路径中不能包含Bucket名称，例如exampledir/exampleobject.txt
        String objectName = "1.png";
        // 填写本地文件的完整路径，例如D:\\localpath\\examplefile.txt
        String filePath= "C:\\Users\\Zxy\\Pictures\\pear.png";

        // 创建OSSClient实例
        OSS ossClient = new OSSClientBuilder().build(endpoint, accessKeyId, accessKeySecret);

        try {
            InputStream inputStream = new FileInputStream(filePath);
            // 执行文件上传操作
            ossClient.putObject(bucketName, objectName, inputStream);
        } catch (OSSException oe) {
            System.out.println("Caught an OSSException, which means your request made it to OSS, "
                    + "but was rejected with an error response for some reason.");
            System.out.println("Error Message:" + oe.getErrorMessage());
            System.out.println("Error Code:" + oe.getErrorCode());
            System.out.println("Request ID:" + oe.getRequestId());
            System.out.println("Host ID:" + oe.getHostId());
        } catch (ClientException ce) {
            System.out.println("Caught an ClientException, which means the client encountered "
                    + "a serious internal problem while trying to communicate with OSS, "
                    + "such as not being able to access the network.");
            System.out.println("Error Message:" + ce.getMessage());
        } finally {
            // 关闭OSSClient
            if (ossClient != null) {
                ossClient.shutdown();
            }
        }
    }
}