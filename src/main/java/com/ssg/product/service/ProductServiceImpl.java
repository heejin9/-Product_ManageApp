package com.ssg.product.service;

import com.ssg.product.domain.ProductVO;
import com.ssg.product.dto.PageRequestDTO;
import com.ssg.product.dto.PageResponseDTO;
import com.ssg.product.dto.ProductDTO;
import com.ssg.product.mapper.ProductMapper;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@Log4j2
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService {

    private final ProductMapper productMapper;
    private final ModelMapper modelMapper;

    @Override
    public void register(ProductDTO productDTO) {
        log.info(modelMapper);
        ProductVO productVO = modelMapper.map(productDTO, ProductVO.class);
        log.info(productVO);
        productMapper.insert(productVO);
    }

    @Override
    public ProductDTO getOne(Long pno) {
        ProductVO productVO = productMapper.selectOne(pno);
        ProductDTO productDTO = modelMapper.map(productVO, ProductDTO.class);

        return productDTO;
    }

    @Override
    public void remove(Long pno) {
        productMapper.delete(pno);
    }

    @Override
    public void modify(ProductDTO productDTO) {
        ProductVO productVO = modelMapper.map(productDTO, ProductVO.class);
        productMapper.update(productVO);
    }

    @Override
    public PageResponseDTO<ProductDTO> getList(PageRequestDTO pageRequestDTO) {

        List<ProductVO> voList = productMapper.selectList(pageRequestDTO);
        List<ProductDTO> dtos = voList.stream()
                .map(vo -> modelMapper.map(vo, ProductDTO.class))
                .collect(Collectors.toList());

        int total = productMapper.getCount(pageRequestDTO);

        PageResponseDTO<ProductDTO> pageResponseDTO = PageResponseDTO.<ProductDTO>All()
                .dtoList(dtos)
                .total(total)
                .pageRequestDTO(pageRequestDTO)
                .build();

        return pageResponseDTO;
    }
}
