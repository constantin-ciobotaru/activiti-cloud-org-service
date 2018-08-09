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

package org.activiti.cloud.organization.repository;

import java.util.Optional;

import org.activiti.cloud.organization.api.Application;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

/**
 * Interface for {@link Application} entities repository
 */
public interface ApplicationRepository<A extends Application> {

    Page<A> getApplications(Pageable pageable);

    Optional<A> findApplicationById(String applicationId);

    A createApplication(A application);

    A updateApplication(A applicationToUpdate);

    void deleteApplication(A application);

    default A updateApplication(A applicationToUpdate,
                                A newApplication) {
        applicationToUpdate.setName(newApplication.getName());
        return updateApplication(applicationToUpdate);
    }
}