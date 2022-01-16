package com.sha.springbootmicroservice3gateway.service;

import com.sha.springbootmicroservice3gateway.request.ITransactionServiceRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author sa
 * @date 18.04.2021
 * @time 14:27
 */
@Service
public class TransactionService implements ITransactionService
{
    @Autowired
    private ITransactionServiceRequest transactionServiceRequest;

    @Override
    public Object saveTransaction(Object transaction)
    {
        return transactionServiceRequest.saveTransaction(transaction);
    }

    @Override
    public void deleteTransaction(Long transactionId)
    {
        transactionServiceRequest.deleteTransaction(transactionId);
    }

    @Override
    public List<Object> getAllTransactionsOfUser(Long userId)
    {
        return transactionServiceRequest.getAllTransactionsOfAuthorizedUser(userId);
    }
}
