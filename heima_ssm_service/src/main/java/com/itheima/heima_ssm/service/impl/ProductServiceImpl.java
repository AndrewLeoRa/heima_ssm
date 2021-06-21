package com.itheima.heima_ssm.service.impl;

import com.itheima.heima_ssm.dao.IProductDao;
import com.itheima.heima_ssm.domain.Product;
import com.itheima.heima_ssm.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


import java.util.List;

/**
 * @ClassName ProductServiceImpl
 * @Description TODO
 * @Author andrew
 * @Date 2021/6/19 23:04
 * @Version 1.0
 */
@Repository
public class ProductServiceImpl implements IProductService {

    @Autowired
    private IProductDao productDao;

    @Override
    public List<Product> findAll() {
        return null;
    }
}
