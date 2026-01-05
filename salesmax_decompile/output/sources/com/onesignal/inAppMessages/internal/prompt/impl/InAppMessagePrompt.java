package com.onesignal.inAppMessages.internal.prompt.impl;

import p001o.n64;

/* loaded from: classes6.dex */
public abstract class InAppMessagePrompt {
    private boolean prompted;

    public interface OSPromptActionCompletionCallback {
        void onCompleted(PromptActionResult promptActionResult);
    }

    public enum PromptActionResult {
        PERMISSION_GRANTED,
        PERMISSION_DENIED,
        LOCATION_PERMISSIONS_MISSING_MANIFEST,
        ERROR
    }

    public abstract String getPromptKey();

    public abstract Object handlePrompt(n64 n64Var);

    public final boolean hasPrompted() {
        return this.prompted;
    }

    public final void setPrompted(boolean z) {
        this.prompted = z;
    }

    public String toString() {
        return "OSInAppMessagePrompt{key=" + getPromptKey() + " prompted=" + this.prompted + '}';
    }
}
