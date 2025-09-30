package springboo.example.sping_boot;

/*
@author zhang
@Date   2025/9/14 21:29
@description
*/public class Result
{
    public Result(Integer code, String msg, Object data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }
    public Result(){}
    public static Result succese()
    {
        return new Result(1,"成功",null);
    }
    public static Result succese(Object data)
    {
        return new Result(1,"成功",data);
    }
    public static Result error()
    {
        return new Result(0,"失败",null);
    }

    public String getMsg() {
        return msg;
    }

    public Integer getCode() {
        return code;
    }

    public Object getData() {
        return data;
    }


    public void setMsg(String msg) {
        this.msg = msg;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public void setData(Object data) {
        this.data = data;
    }


    @Override
    public String toString() {
        return "Result{" +
                "code=" + code +
                ", msg='" + msg + '\'' +
                ", data=" + data +
                '}';
    }
    private Integer code;
    private String msg;
    private Object data;


}
