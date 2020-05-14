package com.dazhi.game.shop.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.dazhi.game.common.Result;
import com.dazhi.game.shop.entity.Goods;
import com.dazhi.game.shop.service.IGoodsService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

/**
 * <p>
 * 商品表 前端控制器
 * </p>
 *
 * @author dazhi
 * @since 2020-05-14
 */
@RestController
@RequestMapping("/shop/goods")
@Api(value = "/goods", tags = "GoodsController", description = "商品管理接口")
public class GoodsController {
	@Autowired
	IGoodsService iGoodsService;

	@ApiOperation(value = "添加商品")
	@PostMapping("/add")
	public Result save(@RequestBody Goods goods) {
		boolean res = iGoodsService.save(goods);
		return Result.ok("OK", res);
	}

	@ApiOperation(value = "更新商品")
	@PutMapping
	public Result update(@RequestBody Goods goods) {
		boolean res = iGoodsService.updateById(goods);
		return Result.ok("OK", res);
	}

	@ApiOperation(value = "通过id删除指定商品")
	@DeleteMapping("/{id}")
	public Result delete(@PathVariable("id") Long id) {
		boolean res = iGoodsService.removeById(id);
		return Result.ok("OK", res);
	}

	@ApiOperation(value = "通过id获取指定商品")
	@GetMapping("/{id}")
	public Result<Goods> get(@PathVariable("id") Long id) {
		Goods goods = iGoodsService.getById(id);
		Result<Goods> result = Result.ok("OK");
		result.setData(goods);
		return result;
	}

	@ApiOperation(value = "获取商品列表")
	@GetMapping
	public Result<IPage<Goods>> list() {
		IPage<Goods> page = new Page<>();
		IPage<Goods> userPage = iGoodsService.page(page);
		Result<IPage<Goods>> result = Result.ok("OK");
		result.setData(userPage);
		return result;
	}
}
