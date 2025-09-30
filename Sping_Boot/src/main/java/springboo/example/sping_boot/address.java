package springboo.example.sping_boot;

/*
@author zhang
@Date   2025/9/11 20:43
@description
*/public class address {
    public address(String province, String city) {
        this.province = province;
        this.city = city;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "address{" +
                "province='" + province + '\'' +
                ", city='" + city + '\'' +
                '}';
    }

    private String province;
    private  String  city;
    public address(){}

}
