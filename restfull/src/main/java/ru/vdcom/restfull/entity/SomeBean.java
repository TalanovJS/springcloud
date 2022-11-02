package ru.vdcom.restfull.entity;

import com.fasterxml.jackson.annotation.JsonFilter;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonFilter(value = "someBeanFilter")
//@JsonIgnoreProperties(ignoreUnknown = true, value = {"filed2"})
public class SomeBean {
    private String field1;
    private String field2;
//    @JsonIgnore
    private String field3;
}
