package com.hope.controller;

import com.hope.utils.ResultHopeUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @program:hope-plus
 * @author:aodeng
 * @blog:低调小熊猫(https://aodeng.cc)
 * @微信公众号:低调小熊猫
 * @create:2018-12-31 13:59
 **/
@Api(value = "错误", description = "错误页面处理")
@Controller
public class ErrorController {
    private static final Logger log = LoggerFactory.getLogger(HopeController.class);

    /***
     * 错误页面
     * @param model
     * @return
     */
    @ApiOperation(
            value = "错误页面",
            notes = "错误页面",
            produces = "application/json, application/xml",
            consumes = "application/json, application/xml")
    @RequestMapping("/error1")
    public ModelAndView error1(Model model, HttpServletResponse response, HttpServletRequest request) {
        log.info("[hope-error1-page]-[{}]", "错误页面");
        response.setStatus(HttpStatus.FORBIDDEN.value());
        return ResultHopeUtil.view("common/error/010");
    }
}
