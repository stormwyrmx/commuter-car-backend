package com.weng.commutercarbackend.service;


import com.baomidou.mybatisplus.extension.service.IService;
import com.weng.commutercarbackend.model.dto.LocationAddRequest;
import com.weng.commutercarbackend.model.dto.LoginRequest;
import com.weng.commutercarbackend.model.dto.PasswordChangeRequest;
import com.weng.commutercarbackend.model.dto.RegisterRequest;
import com.weng.commutercarbackend.model.entity.Driver;
import com.weng.commutercarbackend.model.vo.LoginVO;

import java.io.IOException;

/**
* @author weng
* @description 针对表【driver(乘客表)】的数据库操作Service
* @createDate 2024-03-30 18:30:23
*/
public interface DriverService extends IService<Driver> {
    LoginVO login(LoginRequest loginRequest);

    Long register(RegisterRequest registerRequest);

    void checkStop(Long id, LocationAddRequest locationAddRequest) throws IOException;

    void changePassword(PasswordChangeRequest passwordChangeRequest);

    void updateRouteId(Long routeId);
}
