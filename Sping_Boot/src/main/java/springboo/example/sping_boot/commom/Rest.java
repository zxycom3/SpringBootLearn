package springboo.example.sping_boot.commom;

/*
@author zhang
@Date   2025/9/26 15:09
@description
*/
public class Rest<T>
{
    @Override
    public String toString() {
        return "Rest{" +
                "code='" + code + '\'' +
                ", msg='" + msg + '\'' +
                ", data=" + data +
                '}';
    }

    public  Rest(){}
    public Rest(Integer code, String msg, Object data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }
    public Rest(Object data)
    {
        this.data=data;
    }
    public static Rest Fail(Integer code)
    {
        Rest1 Re = null;
        for(Rest1 r:Rest1.values())
        {
            if(r.getCode().equals(code))
            {
                Re=r;
            }
        }
        if (Re != null) {
            return new Rest(Re.getCode(), Re.getMsg(),null);
        }
        return null;
    }
    public static Rest succese1(Object data)
    {
        return new Rest(Rest1.OK.getCode(), Rest1.OK.getMsg(),data);
    }
    public static Rest succese2(Object data)
    {
        return new Rest(Rest1.OK.getCode(), Rest1.OK.getMsg(), null);
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
    private Integer code;
    private String msg;
    private Object data;
}