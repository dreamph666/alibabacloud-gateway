// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gateway.oss.util.models;

import com.aliyun.tea.*;

public class CreateAgentRequest extends TeaModel {
    @NameInMap("ImportAgent")
    public CreateAgentInfo importAgent;

    public static CreateAgentRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateAgentRequest self = new CreateAgentRequest();
        return TeaModel.build(map, self);
    }

    public CreateAgentRequest setImportAgent(CreateAgentInfo importAgent) {
        this.importAgent = importAgent;
        return this;
    }
    public CreateAgentInfo getImportAgent() {
        return this.importAgent;
    }

}
