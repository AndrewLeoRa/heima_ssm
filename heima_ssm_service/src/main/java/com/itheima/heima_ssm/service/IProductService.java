package com.itheima.heima_ssm.service;

import com.itheima.heima_ssm.domain.Product;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ClassName IProductService
 * @Description TODO
 * @Author andrew
 * @Date 2021/6/19 22:57
 * @Version 1.0
 */
public interface IProductService {

    public List<Product> findAll() throws Exception;
}
