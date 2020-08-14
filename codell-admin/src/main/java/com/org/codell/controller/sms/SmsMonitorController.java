package com.org.codell.controller.sms;

import com.org.codell.common.tools.CommonResult;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SmsMonitorController {

    @GetMapping(value = "/brand/hasPrem")
    @ResponseBody
    public CommonResult hasPrm(){
        return CommonResult.success("访问到了brand");
    }

    @GetMapping(value = "/sku/hasPrem")
    @ResponseBody
    public CommonResult skuhasPrm(){
        return CommonResult.success("访问到了sku");
    }

    @GetMapping(value = "/order/hasPrem")
    @ResponseBody
    public CommonResult orderPrm(){
        return CommonResult.success("访问到了order");
    }



}
