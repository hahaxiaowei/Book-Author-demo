package cn.edu.hfut.xc.bookauthordemo.common.model;

public class Author {
    /**
     * 作者的id
     */
    private String id;

    /**
     * 作者的手机号
     */
    private String phoneNumber;

    /**
     * 作者的账号密码
     */
    private String password;

    /**
     * 作者的名字
     */
    private String authorName;

    /**
     * 作者的年龄
     */
    private String age;

    /**
     * 作者的性别
     */
    private String sex;

    /**
     * 作者的所在地
     */
    private String address;

    /**
     * 作者的身份证号
     */
    private String idCode;

    /**
     * 作者的个人个人简介
     */
    private String personalRemark;

    /**
     * 作者的国籍
     */
    private String nationalityId;

    /**
     * 作者的民族
     */
    private String nation;

    /**
     * 作者的头像存放位置
     */
    private String headPortrait;

    /**
     * 作者的QQ号
     */
    private String qqNumber;

    /**
     * 作者的微信号
     */
    private String wechatNumber;

    /**
     * 作者的新浪微博账号
     */
    private String sinaMicroblogNumber;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber == null ? null : phoneNumber.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName == null ? null : authorName.trim();
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age == null ? null : age.trim();
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getIdCode() {
        return idCode;
    }

    public void setIdCode(String idCode) {
        this.idCode = idCode == null ? null : idCode.trim();
    }

    public String getPersonalRemark() {
        return personalRemark;
    }

    public void setPersonalRemark(String personalRemark) {
        this.personalRemark = personalRemark == null ? null : personalRemark.trim();
    }

    public String getNationalityId() {
        return nationalityId;
    }

    public void setNationalityId(String nationalityId) {
        this.nationalityId = nationalityId == null ? null : nationalityId.trim();
    }

    public String getNation() {
        return nation;
    }

    public void setNation(String nation) {
        this.nation = nation == null ? null : nation.trim();
    }

    public String getHeadPortrait() {
        return headPortrait;
    }

    public void setHeadPortrait(String headPortrait) {
        this.headPortrait = headPortrait == null ? null : headPortrait.trim();
    }

    public String getQqNumber() {
        return qqNumber;
    }

    public void setQqNumber(String qqNumber) {
        this.qqNumber = qqNumber == null ? null : qqNumber.trim();
    }

    public String getWechatNumber() {
        return wechatNumber;
    }

    public void setWechatNumber(String wechatNumber) {
        this.wechatNumber = wechatNumber == null ? null : wechatNumber.trim();
    }

    public String getSinaMicroblogNumber() {
        return sinaMicroblogNumber;
    }

    public void setSinaMicroblogNumber(String sinaMicroblogNumber) {
        this.sinaMicroblogNumber = sinaMicroblogNumber == null ? null : sinaMicroblogNumber.trim();
    }
}