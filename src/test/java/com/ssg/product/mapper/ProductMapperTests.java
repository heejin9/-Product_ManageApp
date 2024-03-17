package com.ssg.product.mapper;


import com.ssg.product.domain.ProductVO;
import com.ssg.product.mapper.ProductMapper;
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
public class ProductMapperTests {

    @Autowired(required = false)
    private ProductMapper productMapper;


//    @Test
//    public void testInsert() {
//        ProductVO productVO = ProductVO.builder()
//                .pname("todotest")
//                .price(10000)
//                .quantity(3)
//                .build();
//        productMapper.insert(productVO);
//
//    }

//    @Test
//    public void testSelectAll() {
//
//        List<TodoVO> list = todoMapper.selectAll();
//        list.forEach(vo -> log.info(vo));
//
//    }
//
//    @Test
//    public void testSelectOne() {
//        TodoVO vo = todoMapper.selectOne(3L);
//        log.info(vo);
//    }
//
//    @Test
//    public void testRemove() {
//        Long tno = 3L;
//        todoMapper.delete(tno);
//    }
//
//    @Test
//    public void testUpdate() throws Exception {
//        Long tno = 3L;
//        TodoVO vo = TodoVO.builder()
//                .tno(tno)
//                .title("test Update")
//                .dueDate(LocalDate.now())
//                .writer("ssg")
//                .finished(false)
//                .build();
//        todoMapper.update(vo);
//    }
//
//    @Test
//    public void testSelectList() {
//        PageRequestDTO pageRequestDTO = PageRequestDTO.builder()
//                .page(2)
//                .size(10)
//                .build();
//
//        List<TodoVO> voList = todoMapper.selectList(pageRequestDTO);
//
//        voList.forEach(vo -> log.info(vo));
//    }


}
