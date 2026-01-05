package com.amazonaws.internal;

import com.google.android.gms.common.api.Api;

/* loaded from: classes4.dex */
public class DynamoDBBackoffStrategy extends CustomBackoffStrategy {
    public static final CustomBackoffStrategy DEFAULT = new DynamoDBBackoffStrategy();

    @Override // com.amazonaws.internal.CustomBackoffStrategy
    public int getBackoffPeriod(int i) {
        if (i <= 0) {
            return 0;
        }
        int iPow = ((int) Math.pow(2.0d, i - 1)) * 50;
        return iPow < 0 ? Api.BaseClientBuilder.API_PRIORITY_OTHER : iPow;
    }
}
