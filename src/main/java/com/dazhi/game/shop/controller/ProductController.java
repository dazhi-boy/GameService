package com.dazhi.game.shop.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dazhi.game.common.BaseController;
import com.dazhi.game.shop.entity.Product;
import com.dazhi.game.shop.service.IProductService;

import io.swagger.annotations.Api;

/**
 * <p>
 * 商品表 前端控制器
 * </p>
 *
 * @author dazhi
 * @since 2020-05-25
 */
@RestController
@RequestMapping("/shop/product")
@Api(value = "/shop/product", tags = "ProductController", description = "商品管理接口")
public class ProductController extends BaseController<Product> {
	@Autowired
	public void setiService(IProductService iProductService) {
		super.setiService(iProductService);
	}
}
