package springboo.example.taliapro.utils;

import com.aliyun.oss.ClientException;
import com.aliyun.oss.OSS;
import com.aliyun.oss.OSSClientBuilder;
import com.aliyun.oss.OSSException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.UUID;
@Component
public class OssUploadExample {
//    @Value("${aliyun.oss.endpoint}")
//    private String endpoint ;
//    // 阿里云账号AccessKey拥有所有API的访问权限，风险很高。强烈建议您创建并使用RAM用户进行API访问或日常运维
//    @Value("${aliyun.oss.accessKeyId}")
//    private String accessKeyId ;
//    @Value("${aliyun.oss.accessKeySecrett}")
//    private   String accessKeySecret ;
//    @Value("${aliyun.oss.bucketName}")
//    private   String bucketName ;
    @Autowired
    private ossproperties osspropertie;

    public String upload(MultipartFile file) throws IOException {
        // 1. 获取文件输入流

        InputStream inputStream = file.getInputStream();

        // 2. 处理文件名（UUID防止重复 + 原文件后缀）
        String originalFilename = file.getOriginalFilename();
        String fileSuffix = originalFilename.substring(originalFilename.lastIndexOf("."));
        String fileName = UUID.randomUUID().toString() + fileSuffix;

        // 3. 初始化OSS客户端
        String endpoint=osspropertie.getEndpoint();
        String accessKeyId= osspropertie.getAccessKeyId();
        String accessKeySecret= osspropertie.getAccessKeySecret();
        String bucketName=osspropertie.getBucketName();
        OSS ossClient = new OSSClientBuilder().build(endpoint, accessKeyId, accessKeySecret);
        try {
            // 4. 上传文件到OSS
            ossClient.putObject(bucketName, fileName, inputStream);
        } finally {
            // 5. 关闭资源（输入流 + OSS客户端）
            inputStream.close();
            if (ossClient != null) {
                ossClient.shutdown();
            }
        }

        // 6. 拼接文件访问URL（格式：https://桶名.Endpoint/文件名）
        String url = "https://" + bucketName + "." + endpoint + "/" + fileName;

        return url;
    }
//    public static void main(String[] args) throws Exception {
//
//    }
}