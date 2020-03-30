package com.youfan.vo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @ProjectName: youfanshop
 * @package: com.youfan.vo
 * @ClassName: ProductTypeVo
 * @description: TODO
 * @author: Jianfeng Li
 * @CreateDateAndTime: 2020/3/26 1:14
 * @version: v1.0
 */
@Component
public class ProductTypeVo {

    @Autowired
    ConstomProductType constomProductType;

    public ConstomProductType getConstomProductType() {
        return constomProductType;
    }

    public void setConstomProductType(ConstomProductType constomProductType) {
        this.constomProductType = constomProductType;
    }
}
