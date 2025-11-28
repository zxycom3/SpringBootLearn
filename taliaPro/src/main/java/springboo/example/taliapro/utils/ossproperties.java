package springboo.example.taliapro.utils;

/*
@author zhang
@Date   2025/11/22 10:29
@description
*/

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import javax.swing.*;
@Data
@Component
@ConfigurationProperties(prefix = "aliyun.oss")
public class ossproperties
{
   private String endpoint;
   private String accessKeyId;
   private String accessKeySecret;
   private String bucketName;
}
