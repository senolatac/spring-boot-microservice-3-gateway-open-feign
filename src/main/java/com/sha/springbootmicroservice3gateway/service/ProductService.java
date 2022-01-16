package com.sha.springbootmicroservice3gateway.service;

import com.sha.springbootmicroservice3gateway.request.IProductServiceRequest;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author sa
 * @date 18.04.2021
 * @time 14:08
 */
@Slf4j
@Service
public class ProductService implements IProductService
{
    @Autowired
    private IProductServiceRequest productServiceRequest;

    @Override
    public Object saveProduct(Object requestBody)
    {
        return productServiceRequest.saveProduct(requestBody);
    }

    @Override
    public void deleteProduct(Long productId)
    {
        productServiceRequest.deleteProduct(productId);
    }

    @Override
    public List<Object> getAllProducts()
    {
        return productServiceRequest.getAllProducts();
    }
}
