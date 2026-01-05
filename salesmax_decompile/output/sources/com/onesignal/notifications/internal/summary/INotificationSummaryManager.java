package com.onesignal.notifications.internal.summary;

import p001o.n64;

/* loaded from: classes6.dex */
public interface INotificationSummaryManager {
    Object clearNotificationOnSummaryClick(String str, n64 n64Var);

    Object updatePossibleDependentSummaryOnDismiss(int i, n64 n64Var);

    Object updateSummaryNotificationAfterChildRemoved(String str, boolean z, n64 n64Var);
}
