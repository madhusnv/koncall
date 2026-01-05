package com.amplifyframework.predictions.aws.request;

import java.util.Objects;

/* loaded from: classes5.dex */
public final class AWSComprehendRequest {
    private final String text;

    public AWSComprehendRequest(String str) {
        Objects.requireNonNull(str);
        this.text = str;
    }

    public String getText() {
        return this.text;
    }
}
