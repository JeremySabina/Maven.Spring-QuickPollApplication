package io.zipcoder.tc_spring_poll_application.configuration;

import io.zipcoder.tc_spring_poll_application.domain.Option;
import io.zipcoder.tc_spring_poll_application.repositories.OptionRepository;
import io.zipcoder.tc_spring_poll_application.repositories.PollRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

import javax.annotation.PostConstruct;
import java.util.Arrays;

@Configuration
public class PollConfig {

    @Autowired
    private PollRepository repository;

    @Autowired
    private OptionRepository optionRepository;

    @PostConstruct
    public void setup() {
        optionRepository.save(Arrays.asList(new Option(2L, "Orange is the new Black")));
    }
}
