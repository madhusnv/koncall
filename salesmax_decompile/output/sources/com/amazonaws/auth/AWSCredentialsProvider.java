package com.amazonaws.auth;

/* loaded from: classes4.dex */
public interface AWSCredentialsProvider {
    AWSCredentials getCredentials();

    void refresh();
}
