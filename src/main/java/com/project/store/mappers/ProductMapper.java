package com.project.store.mappers;

import com.project.store.dtos.ProductDto;
import com.project.store.entities.Product;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;

@Mapper(componentModel = "spring")
public interface ProductMapper {
   @Mapping(target = "categoryId", source = "category.id" )
    ProductDto toDto(Product product);

   Product toEntity(ProductDto dto);

   @Mapping(target = "id", ignore = true )
   void update(ProductDto productDto, @MappingTarget Product product);
}
