// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gateway.oss.util.models;

import com.aliyun.tea.*;

public class IndexDocument extends TeaModel {
    @NameInMap("Suffix")
    public String suffix;

    @NameInMap("SupportSubDir")
    public Boolean supportSubDir;

    @NameInMap("Type")
    public Long type;

    public static IndexDocument build(java.util.Map<String, ?> map) throws Exception {
        IndexDocument self = new IndexDocument();
        return TeaModel.build(map, self);
    }

    public IndexDocument setSuffix(String suffix) {
        this.suffix = suffix;
        return this;
    }
    public String getSuffix() {
        return this.suffix;
    }

    public IndexDocument setSupportSubDir(Boolean supportSubDir) {
        this.supportSubDir = supportSubDir;
        return this;
    }
    public Boolean getSupportSubDir() {
        return this.supportSubDir;
    }

    public IndexDocument setType(Long type) {
        this.type = type;
        return this;
    }
    public Long getType() {
        return this.type;
    }

}
