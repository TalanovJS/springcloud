package ru.vdcom.restfull.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.vdcom.restfull.versioning.Name;
import ru.vdcom.restfull.versioning.Person_1;
import ru.vdcom.restfull.versioning.Person_2;

@RestController
public class PersonVersionController {

    @GetMapping("/v1/person")
    public Person_1 person1() {
        return new Person_1("Roman Talanov");
    }

    @GetMapping("/v2/person")
    public Person_2 person2() {
        return new Person_2(new Name("Roman", "Talanov"));
    }

    @GetMapping(value = "/person/param", params = "version=1")
    public Person_1 param1() {
        return new Person_1("Roman Talanov");
    }

    @GetMapping(value = "/person/param", params = "version=2")
    public Person_2 param2() {
        return new Person_2(new Name("Roman", "Talanov"));
    }

    @GetMapping(value = "/person/header", headers = "X-API-VERSION=1")
    public Person_1 header1() {
        return new Person_1("Roman Talanov");
    }

    @GetMapping(value = "/person/header", headers = "X-API-VERSION=2")
    public Person_2 header2() {
        return new Person_2(new Name("Roman", "Talanov"));
    }

    @GetMapping(value = "/person/prod", produces = "application/vnd.company.app-v1+json")
    public Person_1 prod1() {
        return new Person_1("Roman Talanov");
    }

    @GetMapping(value = "/person/prod", produces = "application/vnd.company.app-v2+json")
    public Person_2 prod2() {
        return new Person_2(new Name("Roman", "Talanov"));
    }
}
