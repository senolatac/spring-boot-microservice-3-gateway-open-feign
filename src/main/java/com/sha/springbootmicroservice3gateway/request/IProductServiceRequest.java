package com.sha.springbootmicroservice3gateway.request;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author sa
 * @date 18.04.2021
 * @time 14:02
 */
@FeignClient(value = "product-service"//Name of product-service application
        , path = "/api/product"//Pre-path for product-service
        ,url = "${product.service.url}"
        ,configuration = FeignConfiguration.class
)
public interface IProductServiceRequest
{
    @PostMapping
    Object saveProduct(@RequestBody Object requestBody);

    @DeleteMapping("{productId}")
    void deleteProduct(@PathVariable("productId") Long productId);

    @GetMapping
    List<Object> getAllProducts();
}
