package com.google.android.gms.internal.auth;

import android.net.Uri;
import p001o.vo0;

/* loaded from: classes3.dex */
public final class zzcr {
    private static final vo0 zza = new vo0();

    public static synchronized Uri zza(String str) {
        vo0 vo0Var = zza;
        Uri uri = (Uri) vo0Var.get("com.google.android.gms.auth_account");
        if (uri != null) {
            return uri;
        }
        Uri uri2 = Uri.parse("content://com.google.android.gms.phenotype/".concat(String.valueOf(Uri.encode("com.google.android.gms.auth_account"))));
        vo0Var.put("com.google.android.gms.auth_account", uri2);
        return uri2;
    }
}
