package springboo.example.sping_boot.commom;

/*
@author zhang
@Date   2025/9/26 15:44
@description
*/
public enum Rest1 {
    // 1. 成功场景
    OK(200, "请求成功，服务器正常返回资源（如网页、数据）"),
    // 2. 重定向场景
    FOUND(302, "临时重定向，资源临时移动到新地址（如未登录跳登录页）"),
    // 3. 客户端错误场景
    NOT_FOUND(404, "请求资源不存在（如URL写错、资源已删除）"),
    BAD_REQUEST(400, "客户端请求参数错误（如表单字段格式不对）"),
    // 4. 服务器错误场景
    INTERNAL_SERVER_ERROR(500, "服务器内部错误（如代码bug、数据库连接失败）");

    Rest1(){}
    Rest1(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public Integer getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }

    private Integer code;
    private String msg;
}
