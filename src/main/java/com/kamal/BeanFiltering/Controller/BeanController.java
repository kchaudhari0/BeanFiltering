package com.kamal.BeanFiltering.Controller;

import com.fasterxml.jackson.databind.ser.FilterProvider;
import com.fasterxml.jackson.databind.ser.impl.SimpleBeanPropertyFilter;
import com.fasterxml.jackson.databind.ser.impl.SimpleFilterProvider;
import com.kamal.BeanFiltering.Beans.TestBean;
import org.springframework.http.converter.json.MappingJacksonValue;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BeanController {

    @GetMapping("/filtering")
    public MappingJacksonValue filtering(){

        TestBean bean=new TestBean("Bean1", "Bean2" , "Bean3");

        MappingJacksonValue mappingJacksonValue=new MappingJacksonValue(bean);

        SimpleBeanPropertyFilter filter=SimpleBeanPropertyFilter.filterOutAllExcept("Bean1");

        FilterProvider filters=new SimpleFilterProvider().addFilter("BeanFilter",filter);

        mappingJacksonValue.setFilters(filters);

        return mappingJacksonValue;

    }
}
