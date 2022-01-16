package com.sha.springbootmicroservice3gateway.service;

import java.util.List;

/**
 * @author sa
 * @date 18.04.2021
 * @time 14:08
 */
public interface IProductService
{
    Object saveProduct(Object requestBody);

    void deleteProduct(Long productId);

    List<Object> getAllProducts();
}
