/*
 * Copyright 2018 Alfresco, Inc. and/or its affiliates.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.activiti.cloud.organization.core.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

/**
 * Organization Test Configuration
 */
@EnableAutoConfiguration
@ComponentScan("org.activiti.cloud.organization.core")
@EnableFeignClients("org.activiti.cloud.organization.core.rest.client.feign")
@EntityScan("org.activiti.cloud.organization.core.model")
@SpringBootApplication
public class OrganizationCoreApplication {

    public static void main(String[] args) {
        SpringApplication.run(OrganizationCoreApplication.class,
                              args);
    }
}
