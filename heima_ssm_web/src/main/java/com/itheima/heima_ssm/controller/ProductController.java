package com.itheima.heima_ssm.controller;


import com.itheima.heima_ssm.domain.Product;
import com.itheima.heima_ssm.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * @ClassName ProductController
 * @Description TODO
 * @Author andrew
 * @Date 2021/6/20 10:09
 * @Version 1.0
 */
@Controller
@RequestMapping("/product")
public class ProductController {


    @Autowired
    private IProductService productService;

    @RequestMapping("findAll.do")
    public ModelAndView findAll() throws Exception {
        ModelAndView modelAndView = new ModelAndView();
        List<Product> productList = productService.findAll();
        modelAndView.addObject("",productList);
        return modelAndView;
    }

}
