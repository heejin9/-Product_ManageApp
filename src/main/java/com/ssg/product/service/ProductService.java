package com.ssg.product.service;

import com.ssg.product.dto.PageRequestDTO;
import com.ssg.product.dto.PageResponseDTO;
import com.ssg.product.dto.ProductDTO;

public interface ProductService {

    void register(ProductDTO productDTO);

    ProductDTO getOne(Long pno);

    void remove(Long pno);

    void modify(ProductDTO productDTO);

    PageResponseDTO<ProductDTO> getList(PageRequestDTO pageRequestDTO);
}
