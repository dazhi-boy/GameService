package com.dazhi.game.shop.service.impl;

import com.dazhi.game.shop.entity.Product;
import com.dazhi.game.shop.mapper.ProductMapper;
import com.dazhi.game.shop.service.IProductService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 商品表 服务实现类
 * </p>
 *
 * @author dazhi
 * @since 2020-05-25
 */
@Service
public class ProductServiceImpl extends ServiceImpl<ProductMapper, Product> implements IProductService {

}
