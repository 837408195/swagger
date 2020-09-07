package com.test.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class User {
    private int id;
    @ApiModelProperty("姓名")
    private String name;
    @ApiModelProperty(value="年龄",required = true)
    private String age;

}
