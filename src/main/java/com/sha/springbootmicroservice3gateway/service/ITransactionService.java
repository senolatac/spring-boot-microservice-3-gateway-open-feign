package com.sha.springbootmicroservice3gateway.service;

import java.util.List;

/**
 * @author sa
 * @date 18.04.2021
 * @time 14:27
 */
public interface ITransactionService
{
    Object saveTransaction(Object transaction);

    void deleteTransaction(Long transactionId);

    List<Object> getAllTransactionsOfUser(Long userId);
}
