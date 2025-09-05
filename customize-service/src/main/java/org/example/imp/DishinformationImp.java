package org.example.imp;

import org.example.DishinformationService;
import org.mapper.DishinformationMapperCustom;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 */
@Service
public class DishinformationImp implements DishinformationService {
    @Autowired
    private DishinformationMapperCustom dishinformationCustom;
}
