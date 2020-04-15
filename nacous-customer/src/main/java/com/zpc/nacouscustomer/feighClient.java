package com.zpc.nacouscustomer;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("nacos-provider")
public interface feighClient {

    @GetMapping("provider/say")
    public String say();
}
