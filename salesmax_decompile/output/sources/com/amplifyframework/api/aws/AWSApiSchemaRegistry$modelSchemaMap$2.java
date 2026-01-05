package com.amplifyframework.api.aws;

import com.amplifyframework.core.model.ModelSchema;
import java.util.Map;
import p001o.kf9;
import p001o.uk7;

/* loaded from: classes5.dex */
public final class AWSApiSchemaRegistry$modelSchemaMap$2 extends kf9 implements uk7 {
    public static final AWSApiSchemaRegistry$modelSchemaMap$2 INSTANCE = new AWSApiSchemaRegistry$modelSchemaMap$2();

    public AWSApiSchemaRegistry$modelSchemaMap$2() {
        super(0);
    }

    @Override // p001o.uk7
    public final Map<String, ModelSchema> invoke() {
        return ModelProviderLocator.locate().modelSchemas();
    }
}
