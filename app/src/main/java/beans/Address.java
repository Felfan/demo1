package beans;

/**
 * Created by Administrator on 2016/11/9 0009.
 */
public class Address {
    private String name;
    private String phone;
    private String province;
    private String address;
    private int isChoose;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getIsChoose() {
        return isChoose;
    }

    public void setIsChoose(int isChoose) {
        this.isChoose = isChoose;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public  String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }
}
