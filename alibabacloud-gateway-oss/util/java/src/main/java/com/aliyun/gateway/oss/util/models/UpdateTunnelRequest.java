// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gateway.oss.util.models;

import com.aliyun.tea.*;

public class UpdateTunnelRequest extends TeaModel {
    @NameInMap("ImportTunnel")
    public UpdateTunnelInfo importTunnel;

    public static UpdateTunnelRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateTunnelRequest self = new UpdateTunnelRequest();
        return TeaModel.build(map, self);
    }

    public UpdateTunnelRequest setImportTunnel(UpdateTunnelInfo importTunnel) {
        this.importTunnel = importTunnel;
        return this;
    }
    public UpdateTunnelInfo getImportTunnel() {
        return this.importTunnel;
    }

}
