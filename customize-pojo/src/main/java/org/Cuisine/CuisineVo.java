package org.Cuisine;

import javax.persistence.Id;

public class CuisineVo {


    /**
     * 用户id
     */
    @Id
    private int id;

    /**
     * 菜系名称
     */
    private String Cuisinename;

    /**
     * 用户id
     */
    private String uid;

    private String classify;

    public String getClassify() {
        return classify;
    }

    public void setClassify(String classify) {
        this.classify = classify;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCuisinename() {
        return Cuisinename;
    }

    public void setCuisinename(String cuisinename) {
        Cuisinename = cuisinename;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }
}

