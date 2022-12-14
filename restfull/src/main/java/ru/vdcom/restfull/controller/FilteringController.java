package ru.vdcom.restfull.controller;

import com.fasterxml.jackson.databind.ser.FilterProvider;
import com.fasterxml.jackson.databind.ser.impl.SimpleBeanPropertyFilter;
import com.fasterxml.jackson.databind.ser.impl.SimpleFilterProvider;
import org.springframework.http.converter.json.MappingJacksonValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.vdcom.restfull.entity.SomeBean;

import java.util.List;

@RestController
public class FilteringController {

    @GetMapping("/filter")
    public MappingJacksonValue retrieveSomeBean() {
        SomeBean someBean = new SomeBean("value1", "value2", "value3");

        FilterProvider filters = new SimpleFilterProvider()
                .addFilter("someBeanFilter", SimpleBeanPropertyFilter.filterOutAllExcept("field1", "field2"));

        MappingJacksonValue mapping = new MappingJacksonValue(someBean);

        mapping.setFilters(filters);

        return mapping;
    }

    @GetMapping("/filter-list")
    public MappingJacksonValue retrieveList() {
        List<SomeBean> beans = List.of(new SomeBean("value1", "value2", "value3"), new SomeBean("value11", "value22", "value33"));

        FilterProvider filters = new SimpleFilterProvider()
                .addFilter("someBeanFilter", SimpleBeanPropertyFilter.filterOutAllExcept("field2", "field3"));

        MappingJacksonValue mapping = new MappingJacksonValue(beans);

        mapping.setFilters(filters);

        return mapping;
    }
}
