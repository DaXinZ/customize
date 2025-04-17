package org.Bo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.pojo.Usertable;

import java.util.Date;
@ApiModel(value = "用户对象BO", description = "从客户端，由用户传入的数据封装在此entity中")
public class UserBo {
    @ApiModelProperty(value = "确认密码", name = "confirmpassword", example = "123456", required = true)
    private  String confirmpassword;
    @ApiModelProperty(value = "密码", name = "password", example = "123456", required = true)
    private  String password;
    @ApiModelProperty(value = "用户名", name = "name", example = "yyds", required = true)
    private  String name;
    @ApiModelProperty(value = "昵称", name = "nicknema", example = "yyds", required = false)
    private  String nicknema;



    public String getNicknema() {
        return nicknema;
    }

    public void setNicknema(String nicknema) {
        this.nicknema = nicknema;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getConfirmpassword() {
        return confirmpassword;
    }

    public void setConfirmpassword(String confirmpassword) {
        this.confirmpassword = confirmpassword;
    }



}
