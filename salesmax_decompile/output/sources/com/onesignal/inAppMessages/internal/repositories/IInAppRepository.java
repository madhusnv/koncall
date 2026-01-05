package com.onesignal.inAppMessages.internal.repositories;

import com.onesignal.inAppMessages.internal.InAppMessage;
import p001o.n64;

/* loaded from: classes6.dex */
public interface IInAppRepository {
    Object cleanCachedInAppMessages(n64 n64Var);

    Object listInAppMessages(n64 n64Var);

    Object saveInAppMessage(InAppMessage inAppMessage, n64 n64Var);
}
