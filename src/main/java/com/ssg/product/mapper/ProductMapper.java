package com.ssg.product.mapper;


import com.ssg.product.domain.ProductVO;
import com.ssg.product.dto.PageRequestDTO;

import java.util.List;

public interface ProductMapper { 

    void insert(ProductVO productVO);

    List<ProductVO> selectAll();

    ProductVO selectOne(Long pno);

    void delete(Long pno);

    void update(ProductVO productVO);

    List<ProductVO> selectList(PageRequestDTO pageRequestDTO);

    int getCount(PageRequestDTO pageRequestDTO);
}
