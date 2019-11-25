package com.lfpsoft.front.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author lifuping
 * @version 1.0.0
 * @package com.lfpsoft.front.controller
 * @description 文件说明
 * @date 2019/11/22 16:20
 * @Copyright © 2000-2019 深圳证券信息有限公司版权所有
 * @link http://www.chinahtz.com/
 */
@Controller
@RequestMapping(value = "/")
public class IndexController {

    @RequestMapping(value = "index")
    public String Index(){
        return "index";
    }
}
