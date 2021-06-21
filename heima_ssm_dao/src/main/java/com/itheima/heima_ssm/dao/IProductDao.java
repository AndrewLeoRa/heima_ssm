package com.itheima.heima_ssm.dao;

import com.itheima.heima_ssm.domain.Product;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface IProductDao {

    @Select("select * from product")
    public List<Product> findAll() throws Exception;

}
