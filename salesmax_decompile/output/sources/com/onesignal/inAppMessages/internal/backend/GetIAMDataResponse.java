package com.onesignal.inAppMessages.internal.backend;

import com.onesignal.inAppMessages.internal.InAppMessageContent;

/* loaded from: classes6.dex */
public final class GetIAMDataResponse {
    private final InAppMessageContent content;
    private final boolean shouldRetry;

    public GetIAMDataResponse(InAppMessageContent inAppMessageContent, boolean z) {
        this.content = inAppMessageContent;
        this.shouldRetry = z;
    }

    public final InAppMessageContent getContent() {
        return this.content;
    }

    public final boolean getShouldRetry() {
        return this.shouldRetry;
    }
}
