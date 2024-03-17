package com.ssg.product.service;

import com.ssg.product.dto.PageRequestDTO;
import com.ssg.product.dto.PageResponseDTO;
import com.ssg.product.dto.ProductDTO;
import lombok.extern.log4j.Log4j2;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.time.LocalDate;

@Log4j2
@ExtendWith(SpringExtension.class)
@ContextConfiguration(locations = "file:src/main/webapp/WEB-INF/root-context.xml")
public class ProductServiceTests {

    @Autowired
    private ProductService productService;

    @Test
    public void testRegister(){
        ProductDTO productDTO = ProductDTO.builder()
                .pname("registerTest")
                .price(10000)
                .quantity(3)
                .build();
        productService.register(productDTO);
    }
    @Test
    public void testPaging() {
        PageRequestDTO pageRequestDTO = PageRequestDTO.builder()
                .page(1)
                .size(2)
                .build();

        PageResponseDTO<ProductDTO> responseDTO = productService.getList(pageRequestDTO);
        log.info(responseDTO);
        responseDTO.getDtoList().stream().forEach(productDTO -> log.info(productDTO));
    }
}
