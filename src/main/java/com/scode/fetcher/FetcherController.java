package com.scode.fetcher;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FetcherController {

    @RequestMapping("/fetch")
    public String fetch() {
        System.out.println("Do some job");
        return "Fetching Something soon";
    }

}
