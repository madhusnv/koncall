package com.amplifyframework.api.aws;

import com.amplifyframework.core.model.ModelOperation;
import com.amplifyframework.core.model.ModelSchema;
import com.amplifyframework.core.model.auth.AuthorizationTypeIterator;

/* loaded from: classes5.dex */
interface AuthModeStrategy {
    AuthorizationTypeIterator authTypesFor(ModelSchema modelSchema, ModelOperation modelOperation);
}
