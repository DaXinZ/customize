package org.Bo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(value = "用户对象BO", description = "从客户端，由用户传入的数据封装在此entity中")
public class UsernewBo {

    @ApiModelProperty(value = "id", name = "id", example = "BO", required = true)
    private  String id;
    @ApiModelProperty(value = "用户名称", name = "name", example = "123456", required = true)
    private  String name;
    @ApiModelProperty(value = "用户昵称", name = "nickname", example = "yyds", required = true)
    private  String nickname;
    @ApiModelProperty(value = "年龄", name = "age", example = "@xx.com", required = false)
    private  Integer age;



    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
