package com.ssg.product.mapper;


import com.ssg.product.domain.ProductVO;
import com.ssg.product.dto.PageRequestDTO;
import com.ssg.product.mapper.ProductMapper;
import lombok.extern.log4j.Log4j2;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.time.LocalDate;
import java.util.List;


@ExtendWith(SpringExtension.class)
@ContextConfiguration(locations = "file:src/main/webapp/WEB-INF/root-context.xml")
@Log4j2
public class ProductMapperTests {

    @Autowired(required = false)
    private ProductMapper productMapper;


    @Test
    public void testInsert() {
        ProductVO productVO = ProductVO.builder()
                .pname("producttest")
                .price(10000)
                .quantity(3)
                .build();
        productMapper.insert(productVO);

    }


    @Test
    public void testSelectOne() {
        ProductVO vo = productMapper.selectOne(3L);
        log.info(vo);
    }

    @Test
    public void testRemove() {
        Long tno = 3L;
        productMapper.delete(tno);
    }

    @Test
    public void testUpdate() throws Exception {
        Long pno = 3L;
        ProductVO vo = ProductVO.builder()
                .pno(pno)
                .pname("test Update")
                .price(1000)
                .quantity(5)
                .build();
        productMapper.update(vo);
    }

    @Test
    public void testSelectList() {
        PageRequestDTO pageRequestDTO = PageRequestDTO.builder()
                .page(2)
                .size(10)
                .build();

        List<ProductVO> voList = productMapper.selectList(pageRequestDTO);

        voList.forEach(vo -> log.info(vo));
    }

}
