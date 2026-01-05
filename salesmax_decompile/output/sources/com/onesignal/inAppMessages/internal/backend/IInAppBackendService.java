package com.onesignal.inAppMessages.internal.backend;

import com.onesignal.common.consistency.RywData;
import p001o.n64;
import p001o.uk7;

/* loaded from: classes6.dex */
public interface IInAppBackendService {
    Object getIAMData(String str, String str2, String str3, n64 n64Var);

    Object getIAMPreviewData(String str, String str2, n64 n64Var);

    Object listInAppMessages(String str, String str2, RywData rywData, uk7 uk7Var, n64 n64Var);

    Object sendIAMClick(String str, String str2, String str3, String str4, String str5, boolean z, n64 n64Var);

    Object sendIAMImpression(String str, String str2, String str3, String str4, n64 n64Var);

    Object sendIAMPageImpression(String str, String str2, String str3, String str4, String str5, n64 n64Var);
}
