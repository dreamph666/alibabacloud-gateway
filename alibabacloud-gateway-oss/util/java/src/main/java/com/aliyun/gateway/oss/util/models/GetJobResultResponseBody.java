// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gateway.oss.util.models;

import com.aliyun.tea.*;

public class GetJobResultResponseBody extends TeaModel {
    /**
     * <p>1</p>
     */
    @NameInMap("ImportJobResult")
    public GetJobResultResp importJobResult;

    public static GetJobResultResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetJobResultResponseBody self = new GetJobResultResponseBody();
        return TeaModel.build(map, self);
    }

    public GetJobResultResponseBody setImportJobResult(GetJobResultResp importJobResult) {
        this.importJobResult = importJobResult;
        return this;
    }
    public GetJobResultResp getImportJobResult() {
        return this.importJobResult;
    }

}
