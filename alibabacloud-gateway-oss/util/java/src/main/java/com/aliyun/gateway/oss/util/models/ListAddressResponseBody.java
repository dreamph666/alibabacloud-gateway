// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gateway.oss.util.models;

import com.aliyun.tea.*;

public class ListAddressResponseBody extends TeaModel {
    @NameInMap("ImportAddressList")
    public ListAddressResp importAddressList;

    public static ListAddressResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListAddressResponseBody self = new ListAddressResponseBody();
        return TeaModel.build(map, self);
    }

    public ListAddressResponseBody setImportAddressList(ListAddressResp importAddressList) {
        this.importAddressList = importAddressList;
        return this;
    }
    public ListAddressResp getImportAddressList() {
        return this.importAddressList;
    }

}
