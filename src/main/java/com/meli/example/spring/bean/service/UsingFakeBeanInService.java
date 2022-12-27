package com.meli.example.spring.bean.service;

import com.meli.example.spring.bean.FakeBeanProperty;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import javax.annotation.PostConstruct;

@Service
public class UsingFakeBeanInService {

    private static final Logger LOGGER = LoggerFactory.getLogger(UsingFakeBeanInService.class);

    private final FakeBeanProperty fakeBeanProperty;

    public UsingFakeBeanInService(FakeBeanProperty fakeBeanProperty) {
        this.fakeBeanProperty = fakeBeanProperty;
    }

    @PostConstruct
    public void usingFakeBeanWithPostConstruct() {
        LOGGER.info("FakeBeanProperty result of set bean: \n\n{}\n", fakeBeanProperty);
    }
}
