/*
 * Copyright (c) 2008-2019 Haulmont.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.haulmont.addon.restapi.api.controllers;

import com.haulmont.addon.restapi.api.service.filter.data.UserInfo;
import com.haulmont.addon.restapi.api.service.UserInfoControllerManager;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.inject.Inject;

/**
 * REST controller that is used for getting an information about the current user
 */
@RestController("restapi_UserInfoController")
@RequestMapping(value = "/v2/userInfo", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
public class UserInfoController {

    @Inject
    protected UserInfoControllerManager userInfoControllerManager;

    @GetMapping
    public UserInfo getUserInfo() {
        return userInfoControllerManager.getUserInfo();
    }
}