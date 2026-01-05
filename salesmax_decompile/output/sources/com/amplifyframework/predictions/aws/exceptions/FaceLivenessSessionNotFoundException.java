package com.amplifyframework.predictions.aws.exceptions;

import com.amplifyframework.annotations.InternalAmplifyApi;
import com.amplifyframework.predictions.PredictionsException;
import com.onesignal.core.internal.database.impl.OneSignalDbContract;
import p001o.id5;
import p001o.sq8;

@InternalAmplifyApi
/* loaded from: classes5.dex */
public final class FaceLivenessSessionNotFoundException extends PredictionsException {
    public FaceLivenessSessionNotFoundException() {
        this(null, null, null, 7, null);
    }

    public /* synthetic */ FaceLivenessSessionNotFoundException(String str, Throwable th, String str2, int i, id5 id5Var) {
        this((i & 1) != 0 ? "Face Liveness session not found." : str, (i & 2) != 0 ? null : th, (i & 4) != 0 ? "Enter a valid session ID." : str2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FaceLivenessSessionNotFoundException(String str, Throwable th, String str2) {
        super(str, th, str2);
        sq8.m48649h(str, OneSignalDbContract.NotificationTable.COLUMN_NAME_MESSAGE);
        sq8.m48649h(str2, "recoverySuggestion");
    }
}
