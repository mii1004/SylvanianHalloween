package com.example.sylvanianhalloween.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.context.request.NativeWebRequest;
import java.util.Optional;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-10-31T00:07:21.774983+09:00[Asia/Tokyo]")
@Controller
@RequestMapping("${openapi.sylvanianHalloween.base-path:}")
public class FoodApiController implements FoodApi {

    private final NativeWebRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public FoodApiController(NativeWebRequest request) {
        this.request = request;
    }

    @Override
    public Optional<NativeWebRequest> getRequest() {
        return Optional.ofNullable(request);
    }

}
