package com.onesignal.inAppMessages.internal.state;

import com.onesignal.inAppMessages.internal.prompt.impl.InAppMessagePrompt;

/* loaded from: classes6.dex */
public final class InAppStateService {
    private InAppMessagePrompt currentPrompt;
    private String inAppMessageIdShowing;
    private Long lastTimeInAppDismissed;
    private boolean paused;

    public final InAppMessagePrompt getCurrentPrompt() {
        return this.currentPrompt;
    }

    public final String getInAppMessageIdShowing() {
        return this.inAppMessageIdShowing;
    }

    public final Long getLastTimeInAppDismissed() {
        return this.lastTimeInAppDismissed;
    }

    public final boolean getPaused() {
        return this.paused;
    }

    public final void setCurrentPrompt(InAppMessagePrompt inAppMessagePrompt) {
        this.currentPrompt = inAppMessagePrompt;
    }

    public final void setInAppMessageIdShowing(String str) {
        this.inAppMessageIdShowing = str;
    }

    public final void setLastTimeInAppDismissed(Long l) {
        this.lastTimeInAppDismissed = l;
    }

    public final void setPaused(boolean z) {
        this.paused = z;
    }
}
