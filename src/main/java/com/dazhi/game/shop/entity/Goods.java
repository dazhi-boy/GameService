package com.dazhi.game.shop.entity;

import java.math.BigDecimal;
import com.dazhi.game.common.BaseEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * <p>
 * 商品表
 * </p>
 *
 * @author dazhi
 * @since 2020-05-14
 */
@ApiModel(value="Goods对象", description="商品表")
public class Goods extends BaseEntity {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "商品分类id")
    private Long cateid;

    @ApiModelProperty(value = "商品标题")
    private String title;

    @ApiModelProperty(value = "商品描述")
    private String description;

    @ApiModelProperty(value = "库存")
    private Long num;

    @ApiModelProperty(value = "价格")
    private BigDecimal price;

    @ApiModelProperty(value = "封面图")
    private String cover;

    @ApiModelProperty(value = "图片集合")
    private String pics;

    @ApiModelProperty(value = "是否促销")
    private String issale;

    @ApiModelProperty(value = "促销价格")
    private BigDecimal saleprice;

    @ApiModelProperty(value = "是否热卖")
    private String ishot;

    @ApiModelProperty(value = "是否上架")
    private String ison;

    @ApiModelProperty(value = "是否推荐")
    private String istui;

    @ApiModelProperty(value = "创建时间")
    private Integer createtime;

    public Long getCateid() {
        return cateid;
    }

    public void setCateid(Long cateid) {
        this.cateid = cateid;
    }
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    public Long getNum() {
        return num;
    }

    public void setNum(Long num) {
        this.num = num;
    }
    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }
    public String getCover() {
        return cover;
    }

    public void setCover(String cover) {
        this.cover = cover;
    }
    public String getPics() {
        return pics;
    }

    public void setPics(String pics) {
        this.pics = pics;
    }
    public String getIssale() {
        return issale;
    }

    public void setIssale(String issale) {
        this.issale = issale;
    }
    public BigDecimal getSaleprice() {
        return saleprice;
    }

    public void setSaleprice(BigDecimal saleprice) {
        this.saleprice = saleprice;
    }
    public String getIshot() {
        return ishot;
    }

    public void setIshot(String ishot) {
        this.ishot = ishot;
    }
    public String getIson() {
        return ison;
    }

    public void setIson(String ison) {
        this.ison = ison;
    }
    public String getIstui() {
        return istui;
    }

    public void setIstui(String istui) {
        this.istui = istui;
    }
    public Integer getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Integer createtime) {
        this.createtime = createtime;
    }

    @Override
    public String toString() {
        return "Goods{" +
            "cateid=" + cateid +
            ", title=" + title +
            ", description=" + description +
            ", num=" + num +
            ", price=" + price +
            ", cover=" + cover +
            ", pics=" + pics +
            ", issale=" + issale +
            ", saleprice=" + saleprice +
            ", ishot=" + ishot +
            ", ison=" + ison +
            ", istui=" + istui +
            ", createtime=" + createtime +
        "}";
    }
}
