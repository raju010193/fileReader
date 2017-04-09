/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package readExel;

/**
 *
 * @author sidhu munagala
 */
public class FileProperties {
    private String basePaperTitle;
    private String publishedTitle;
    private String technology;
    private long contactNumber;
    private boolean isAbstract;
    private String code;

    public String getBasePaperTitle() {
        return basePaperTitle;
    }

    public void setBasePaperTitle(String basePaperTitle) {
        this.basePaperTitle = basePaperTitle;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public long getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(long contactNumber) {
        this.contactNumber = contactNumber;
    }

    public boolean isIsAbstract() {
        return isAbstract;
    }

    public void setIsAbstract(boolean isAbstract) {
        this.isAbstract = isAbstract;
    }

    public String getPublishedTitle() {
        return publishedTitle;
    }

    public void setPublishedTitle(String publishedTitle) {
        this.publishedTitle = publishedTitle;
    }

    public String getTechnology() {
        return technology;
    }

    public void setTechnology(String technology) {
        this.technology = technology;
    }
    
    
}
