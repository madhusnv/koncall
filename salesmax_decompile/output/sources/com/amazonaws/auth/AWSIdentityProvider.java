package com.amazonaws.auth;

/* loaded from: classes4.dex */
public interface AWSIdentityProvider {
    String getToken();

    String refresh();
}
