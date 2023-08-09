package com.clorevItemservice.serviceImpl;

import com.clorevItemservice.entities.Man;
import com.clorevItemservice.repository.ManItemRepository;
import com.clorevItemservice.service.ManItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ManItemServiceImpl implements ManItemService {

    @Autowired
    ManItemRepository manItemRepository;

    @Override
    public Man getManItemById(int id) {
        return manItemRepository.findById(id).get() ;
    }
}
