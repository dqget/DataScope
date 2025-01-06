package com.hole.hs.service;

import com.hole.hs.domain.Account;
import com.baomidou.mybatisplus.extension.service.IService;
import com.hole.hs.model.AccountVO;

/**
* @author PC
* @description 针对表【ds_account(账户表)】的数据库操作Service
* @createDate 2024-12-30 16:26:21
*/
public interface AccountService extends IService<Account> {

    AccountVO login(AccountVO accountVO);


    AccountVO queryById(Long id);

    void cache(String token, AccountVO accountVO);

    void logout();
}
