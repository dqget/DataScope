package com.hole.hs.controller;

import com.hole.hs.model.AccountVO;
import com.hole.hs.response.Result;
import com.hole.hs.response.ResultGenerator;
import com.hole.hs.service.AccountService;
import org.dromara.hutool.core.data.id.IdUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 */
@RestController
@RequestMapping
public class LoginController {
    @Autowired
    private AccountService accountService;


    @PostMapping("/login")
    public Result login(@RequestBody AccountVO accountVO) {
        accountVO = accountService.login(accountVO);
        // 通过 account 信息构建token
        String token = IdUtil.fastUUID();
        accountService.cache(token, accountVO);
        return ResultGenerator.genOkResult("登录成功", token);
    }

    @PostMapping("/logout")
    public Result logout() {
        accountService.logout();
        return ResultGenerator.genOkResult();
    }

}
