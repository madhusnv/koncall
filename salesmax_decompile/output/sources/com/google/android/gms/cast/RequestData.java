package com.google.android.gms.cast;

import com.google.android.gms.common.annotation.KeepForSdk;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public interface RequestData {
    JSONObject getCustomData();

    @KeepForSdk
    long getRequestId();
}
