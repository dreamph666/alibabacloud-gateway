// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gateway.oss.util.models;

import com.aliyun.tea.*;

public class GetTunnelResponseBody extends TeaModel {
    @NameInMap("ImportTunnel")
    public GetTunnelResp importTunnel;

    public static GetTunnelResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetTunnelResponseBody self = new GetTunnelResponseBody();
        return TeaModel.build(map, self);
    }

    public GetTunnelResponseBody setImportTunnel(GetTunnelResp importTunnel) {
        this.importTunnel = importTunnel;
        return this;
    }
    public GetTunnelResp getImportTunnel() {
        return this.importTunnel;
    }

}
