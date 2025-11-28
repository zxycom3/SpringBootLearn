package springboo.example.taliapro.exception;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.resource.NoResourceFoundException;
import springboo.example.taliapro.pojo.Result;

/*
@author zzhang
@Date   2025/11/26 22:57
@description
*/
@Slf4j
@RestControllerAdvice
public class GlobalException {

    @ExceptionHandler(Exception.class)
    public Result ex(Exception ex)
    {
        ex.printStackTrace();
//        System.out.println("问题");
        return Result.error("操作有误，请重试或联系管理员。");
    }
    @ExceptionHandler(NoResourceFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND) // 明确返回 HTTP 404 状态码
    public Result noResourceEx(NoResourceFoundException ex) {
        log.warn("资源不存在：{}", ex.getResourcePath()); // warn 级别，打印资源路径
        return Result.error("请求的资源不存在");
    }
}
