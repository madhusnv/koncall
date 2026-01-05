package com.google.android.gms.internal.auth;

import com.google.android.gms.common.server.response.FastSafeParcelableJsonResponse;
import java.io.UnsupportedEncodingException;
import org.apache.http.protocol.HTTP;

/* loaded from: classes3.dex */
public abstract class zzbz extends FastSafeParcelableJsonResponse {
    @Override // com.google.android.gms.common.server.response.FastSafeParcelableJsonResponse
    public final byte[] toByteArray() {
        try {
            return toString().getBytes(HTTP.UTF_8);
        } catch (UnsupportedEncodingException unused) {
            return null;
        }
    }
}
