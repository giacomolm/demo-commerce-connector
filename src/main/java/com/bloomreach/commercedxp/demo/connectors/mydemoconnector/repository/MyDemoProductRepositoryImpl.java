/**
 * Copyright 2019 BloomReach Inc. (https://www.bloomreach.com/)
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package com.bloomreach.commercedxp.demo.connectors.mydemoconnector.repository;

import com.bloomreach.commercedxp.api.v2.connector.ConnectorException;
import com.bloomreach.commercedxp.api.v2.connector.form.CategoryForm;
import com.bloomreach.commercedxp.api.v2.connector.model.ItemModel;
import com.bloomreach.commercedxp.api.v2.connector.model.PageResult;
import com.bloomreach.commercedxp.api.v2.connector.repository.AbstractProductRepository;
import com.bloomreach.commercedxp.api.v2.connector.repository.QuerySpec;
import com.bloomreach.commercedxp.starterstore.connectors.CommerceConnector;

public class MyDemoProductRepositoryImpl extends AbstractProductRepository {

    public MyDemoProductRepositoryImpl() {
        // TODO Auto-generated constructor stub
    }

    public PageResult<ItemModel> findAllByCategory(CommerceConnector connector, CategoryForm categoryForm,
            QuerySpec querySpec) throws ConnectorException {
        // TODO Auto-generated method stub
        return null;
    }

    public ItemModel findOne(CommerceConnector connector, String id, QuerySpec querySpec) throws ConnectorException {
        // TODO Auto-generated method stub
        return null;
    }

    public PageResult<ItemModel> findAll(CommerceConnector connector, QuerySpec querySpec) throws ConnectorException {
        // TODO Auto-generated method stub
        return null;
    }

}
