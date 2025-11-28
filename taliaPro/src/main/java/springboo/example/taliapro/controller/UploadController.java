package springboo.example.taliapro.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import springboo.example.taliapro.pojo.Result;
import springboo.example.taliapro.utils.OssUploadExample;

import java.io.File;
import java.io.IOException;
import java.util.UUID;

/*
@author zhag1
@Date   2025/11/21 10:38
@description
*/
@Slf4j
@RestController
public class UploadController
{
    @Autowired
    private OssUploadExample ossUploadExample;
//    @PostMapping("/upload")
//    public Result upload (String name, Integer age, MultipartFile image) throws IOException {
//        log.info("文件上传");
//        String filename=image.getOriginalFilename();
//        int idx=-1;
//        if (filename != null) {
//             idx=filename.lastIndexOf(".");
//        }
//        String idxl="";
//        if (filename != null) {
//            idxl=filename.substring(idx);
//        }
//        String newfilename=UUID.randomUUID().toString()+idxl;
//        image.transferTo(new File("C:\\Users\\Zxy\\Desktop\\"+newfilename));
//        return Result.success();
//    }
@PostMapping("/upload")
public Result upload(MultipartFile image) throws IOException {
//    log.info("文件上传{}{}","文件名:{}",image.getOriginalFilename());
    String url= ossUploadExample.upload(image);
    log.info("文件上传");
    log.info("文件上传及其url{}",url);
    return Result.success(url);
}


}
