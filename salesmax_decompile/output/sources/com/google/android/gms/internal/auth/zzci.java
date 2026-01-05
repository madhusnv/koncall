package com.google.android.gms.internal.auth;

import android.net.Uri;
import p001o.ktf;

/* loaded from: classes3.dex */
public final class zzci {
    private final ktf zza;

    public zzci(ktf ktfVar) {
        this.zza = ktfVar;
    }

    public final String zza(Uri uri, String str, String str2, String str3) {
        if (uri == null) {
            return null;
        }
        ktf ktfVar = (ktf) this.zza.get(uri.toString());
        if (ktfVar == null) {
            return null;
        }
        return (String) ktfVar.get("".concat(String.valueOf(str3)));
    }
}
