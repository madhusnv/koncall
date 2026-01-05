package com.onesignal.inAppMessages.internal.display;

import com.onesignal.inAppMessages.internal.InAppMessage;
import p001o.n64;

/* loaded from: classes6.dex */
public interface IInAppDisplayer {
    void dismissCurrentInAppMessage();

    Object displayMessage(InAppMessage inAppMessage, n64 n64Var);

    Object displayPreviewMessage(String str, n64 n64Var);
}
