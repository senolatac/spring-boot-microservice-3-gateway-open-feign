package com.sha.springbootmicroservice3gateway.request;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author sa
 * @date 18.04.2021
 * @time 14:22
 */
@FeignClient(value = "transaction-service"//Name of transaction-service application
        , path = "/api/transaction"//Pre-path for transaction-service
        ,url = "${transaction.service.url}"
        ,configuration = FeignConfiguration.class
)
public interface ITransactionServiceRequest
{
    @PostMapping
    Object saveTransaction(@RequestBody Object requestBody);

    @DeleteMapping("{transactionId}")
    void deleteTransaction(@PathVariable("transactionId") Long transactionId);

    @GetMapping("{userId}")
    List<Object> getAllTransactionsOfAuthorizedUser(@PathVariable("userId") Long userId);
}
