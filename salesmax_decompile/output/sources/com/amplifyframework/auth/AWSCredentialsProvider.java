package com.amplifyframework.auth;

import com.amplifyframework.auth.AWSCredentials;
import com.amplifyframework.core.Consumer;

/* loaded from: classes5.dex */
public interface AWSCredentialsProvider<T extends AWSCredentials> {
    void fetchAWSCredentials(Consumer<T> consumer, Consumer<AuthException> consumer2);
}
