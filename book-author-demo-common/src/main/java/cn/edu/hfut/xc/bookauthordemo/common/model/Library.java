package cn.edu.hfut.xc.bookauthordemo.common.model;

public class Library {
    private String id;

    private String libraryName;

    private String libraryAddress;

    private String libraryNationalityId;

    private String libraryBulidTime;

    private String libraryLife;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getLibraryName() {
        return libraryName;
    }

    public void setLibraryName(String libraryName) {
        this.libraryName = libraryName == null ? null : libraryName.trim();
    }

    public String getLibraryAddress() {
        return libraryAddress;
    }

    public void setLibraryAddress(String libraryAddress) {
        this.libraryAddress = libraryAddress == null ? null : libraryAddress.trim();
    }

    public String getLibraryNationalityId() {
        return libraryNationalityId;
    }

    public void setLibraryNationalityId(String libraryNationalityId) {
        this.libraryNationalityId = libraryNationalityId == null ? null : libraryNationalityId.trim();
    }

    public String getLibraryBulidTime() {
        return libraryBulidTime;
    }

    public void setLibraryBulidTime(String libraryBulidTime) {
        this.libraryBulidTime = libraryBulidTime == null ? null : libraryBulidTime.trim();
    }

    public String getLibraryLife() {
        return libraryLife;
    }

    public void setLibraryLife(String libraryLife) {
        this.libraryLife = libraryLife == null ? null : libraryLife.trim();
    }
}