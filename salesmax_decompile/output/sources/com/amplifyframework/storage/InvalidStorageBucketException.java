package com.amplifyframework.storage;

import com.amplifyframework.AmplifyException;
import com.onesignal.core.internal.database.impl.OneSignalDbContract;
import p001o.id5;
import p001o.sq8;

/* loaded from: classes5.dex */
public final class InvalidStorageBucketException extends AmplifyException {
    /* JADX WARN: Multi-variable type inference failed */
    public InvalidStorageBucketException() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public /* synthetic */ InvalidStorageBucketException(String str, String str2, int i, id5 id5Var) {
        this((i & 1) != 0 ? "Unable to find bucket from name in Amplify Outputs." : str, (i & 2) != 0 ? "Ensure the bucket name used is available in Amplify Outputs." : str2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InvalidStorageBucketException(String str, String str2) {
        super(str, str2);
        sq8.m48649h(str, OneSignalDbContract.NotificationTable.COLUMN_NAME_MESSAGE);
        sq8.m48649h(str2, "recoverySuggestion");
    }
}
