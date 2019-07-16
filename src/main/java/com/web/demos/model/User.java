package com.web.demos.model;

import com.github.houbb.sensitive.annotation.Sensitive;
import com.github.houbb.sensitive.core.api.strategory.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@ToString
@NoArgsConstructor
public class User {

    @Sensitive(strategy = StrategyChineseName.class)
    private String username;

    @Sensitive(strategy = StrategyCardId.class)
    private String idCard;

    @Sensitive(strategy = StrategyPassword.class)
    private String password;

    @Sensitive(strategy = StrategyEmail.class)
    private String email;

    @Sensitive(strategy = StrategyPhone.class)
    private String phone;

    //Getter & Setter
    //toString()
}