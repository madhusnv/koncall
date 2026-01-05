package com.amplifyframework.core.model.auth;

import com.amplifyframework.api.aws.AuthorizationType;
import java.util.Iterator;

/* loaded from: classes5.dex */
public interface AuthorizationTypeIterator extends Iterator<AuthorizationType> {
    boolean isOwnerBasedRule();
}
