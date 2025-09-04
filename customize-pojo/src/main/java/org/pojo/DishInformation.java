package org.pojo;

import javax.persistence.Column;

public class Dishinformation {
    /**
     * id
     */
    private Integer id;

    /**
     * 用户id
     */
    private String uid;

    /**
     * 菜品名称
     */
    @Column(name = "DishName")
    private String dishname;

    /**
     * 菜品描述
     */
    @Column(name = "DishDescription")
    private String dishdescription;

    /**
     * 是否收藏
     */
    private Integer collect;

    /**
     * 购买次数
     */
    @Column(name = "purchaseTime")
    private Integer purchasetime;

    /**
     * 菜品图片
     */
    @Column(name = "FoodPictures")
    private String foodpictures;

    /**
     * 菜品分类
     */
    private String classify;

    /**
     * 获取id
     *
     * @return id - id
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置id
     *
     * @param id id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取用户id
     *
     * @return uid - 用户id
     */
    public String getUid() {
        return uid;
    }

    /**
     * 设置用户id
     *
     * @param uid 用户id
     */
    public void setUid(String uid) {
        this.uid = uid;
    }

    /**
     * 获取菜品名称
     *
     * @return DishName - 菜品名称
     */
    public String getDishname() {
        return dishname;
    }

    /**
     * 设置菜品名称
     *
     * @param dishname 菜品名称
     */
    public void setDishname(String dishname) {
        this.dishname = dishname;
    }

    /**
     * 获取菜品描述
     *
     * @return DishDescription - 菜品描述
     */
    public String getDishdescription() {
        return dishdescription;
    }

    /**
     * 设置菜品描述
     *
     * @param dishdescription 菜品描述
     */
    public void setDishdescription(String dishdescription) {
        this.dishdescription = dishdescription;
    }

    /**
     * 获取是否收藏
     *
     * @return collect - 是否收藏
     */
    public Integer getCollect() {
        return collect;
    }

    /**
     * 设置是否收藏
     *
     * @param collect 是否收藏
     */
    public void setCollect(Integer collect) {
        this.collect = collect;
    }

    /**
     * 获取购买次数
     *
     * @return purchaseTime - 购买次数
     */
    public Integer getPurchasetime() {
        return purchasetime;
    }

    /**
     * 设置购买次数
     *
     * @param purchasetime 购买次数
     */
    public void setPurchasetime(Integer purchasetime) {
        this.purchasetime = purchasetime;
    }

    /**
     * 获取菜品图片
     *
     * @return FoodPictures - 菜品图片
     */
    public String getFoodpictures() {
        return foodpictures;
    }

    /**
     * 设置菜品图片
     *
     * @param foodpictures 菜品图片
     */
    public void setFoodpictures(String foodpictures) {
        this.foodpictures = foodpictures;
    }

    /**
     * 获取菜品分类
     *
     * @return classify - 菜品分类
     */
    public String getClassify() {
        return classify;
    }

    /**
     * 设置菜品分类
     *
     * @param classify 菜品分类
     */
    public void setClassify(String classify) {
        this.classify = classify;
    }
}