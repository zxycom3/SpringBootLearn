package springboo.example.lessionproject.common;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/*
@author zhang
@Date   2025/10/18 16:15
@description
*/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ApiResponse<T> {
    private int code;
    private String msg;
    private Object data;

    public static <T> ApiResponse<T> success()
    {
        return new ApiResponse<>(200,"操作成功",null);
    }
    public static <T> ApiResponse<T> success(T data)
    {
        return new ApiResponse<>(200,"操作成功",data);
    }
    public static <T> ApiResponse<T> error(String msg)
    {
        return new ApiResponse<>(500,msg,null);
    }
    public static <T> ApiResponse<T> error(String msg,int code)
    {
        return new ApiResponse<>(500,msg,null);
    }



}
