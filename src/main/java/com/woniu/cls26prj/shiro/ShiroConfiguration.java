package com.woniu.cls26prj.shiro;

import com.woniu.cls26prj.entity.Tree;
import com.woniu.cls26prj.service.ITreeService;
import org.apache.shiro.mgt.DefaultSecurityManager;
import org.apache.shiro.mgt.SecurityManager;
import org.apache.shiro.realm.Realm;
import org.apache.shiro.spring.security.interceptor.AuthorizationAttributeSourceAdvisor;
import org.apache.shiro.spring.web.ShiroFilterFactoryBean;
import org.apache.shiro.web.mgt.DefaultWebSecurityManager;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@Configuration
public class ShiroConfiguration {
    @Resource
    private ITreeService treeServiceImpl;
    @Bean
    public ShiroFilterFactoryBean shiroFilterFactoryBean(SecurityManager securityManager){
        ShiroFilterFactoryBean factoryBean = new ShiroFilterFactoryBean();
        factoryBean.setLoginUrl("/index.jsp");
        factoryBean.setSuccessUrl("/admin/index.jsp");
        factoryBean.setUnauthorizedUrl("/unauthorized.jsp");
        factoryBean.setSecurityManager(securityManager);

        Map map = new LinkedHashMap();

        map.put("/*", "anon");
        map.put("/login", "anon");
        map.put("/index.jsp", "anon");
        map.put("/static/**", "anon");
        map.put("/css/**", "anon");
        map.put("/js/**", "anon");

        List<Tree> trees = treeServiceImpl.findAll();
        for (Tree tree : trees) {
            if(tree.getFile()!=null){
                String file = tree.getFile();//  /admin/userinfo/index.jsp
                file = file.substring(0, file.lastIndexOf("/")+1); //    /admin/userinfo/
                map.put(file+"**", "perms["+file+":**]");
            }
        }

        map.put("/admin/**", "authc");

        factoryBean.setFilterChainDefinitionMap(map);
        return factoryBean;
    }

    @Bean
    public SecurityManager securityManager(MyRealm realm){
        DefaultWebSecurityManager securityManager = new DefaultWebSecurityManager();
        securityManager.setRealm(realm);
        return securityManager;
    }

    @Bean
    public AuthorizationAttributeSourceAdvisor authorizationAttributeSourceAdvisor(SecurityManager securityManager){
        AuthorizationAttributeSourceAdvisor aaa = new AuthorizationAttributeSourceAdvisor();
        aaa.setSecurityManager(securityManager);
        return aaa;
    }

}
