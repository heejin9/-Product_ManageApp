package com.ssg.product.mapper;


import com.ssg.product.domain.ProductVO;
import com.ssg.product.dto.PageRequestDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ProductMapper { 

    void insert(ProductVO productVO);

    ProductVO selectOne(Long pno);

    void delete(Long pno);

    void update(ProductVO productVO);

    List<ProductVO> selectList(PageRequestDTO pageRequestDTO);

    int getCount(PageRequestDTO pageRequestDTO);
}
