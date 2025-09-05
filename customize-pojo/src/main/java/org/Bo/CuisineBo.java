package org.Bo;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(value = "菜系对象BO", description = "从客户端，由用户传入的数据封装在此Bo中")
public class CuisineBo {
    @ApiModelProperty(value = "菜品类型", name = "classify", example = "", required = true)
    private String classify;
    @ApiModelProperty(value = "是否推荐菜系", name = "MenuCommand", example = "", required = false)
    private Integer MenuCommand;
    @ApiModelProperty(value = "page", name = "page", example = "", required = true)
    private Integer page;
    @ApiModelProperty(value = "pageSize", name = "pageSize", example = "", required = true)
    private Integer pageSize;


    public String getClassify() {
        return classify;
    }

    public void setClassify(String classify) {
        this.classify = classify;
    }

    public Integer getMenuCommand() {
        return MenuCommand;
    }

    public void setMenuCommand(Integer menuCommand) {
        MenuCommand = menuCommand;
    }

    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }
}
