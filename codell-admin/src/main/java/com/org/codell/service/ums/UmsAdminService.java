package com.org.codell.service.ums;

import com.org.codell.dto.UmsAdminParam;
import com.org.dmg.model.UmsAdmin;
import com.org.dmg.model.UmsPermission;
import com.org.dmg.model.UmsResource;
import com.org.dmg.model.UmsRole;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * 后台管理员Service
 * Created by macro on 2018/4/26.
 */
public interface UmsAdminService {
    /**
     * 登录功能
     * @param username 用户名
     * @param password 密码
     * @return 生成的JWT的token
     */
    String login(String username, String password);

    /**
     * 获取用户信息
     */
    UserDetails loadUserByUsername(String username);

    UmsAdmin getAdminByUsername(String username);

    List<UmsResource> getResourceList(Long adminId);
}
