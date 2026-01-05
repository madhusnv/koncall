package com.google.android.gms.internal.auth;

import android.util.Base64;
import java.io.IOException;

/* loaded from: classes3.dex */
final class zzcy extends zzdc {
    final /* synthetic */ zzhu zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzcy(zzcz zzczVar, String str, Object obj, boolean z, zzhu zzhuVar, byte[] bArr) {
        super(zzczVar, "getTokenRefactor__blocked_packages", obj, true, null);
        this.zza = zzhuVar;
    }

    @Override // com.google.android.gms.internal.auth.zzdc
    public final Object zza(Object obj) {
        try {
            return zzhr.zzk(Base64.decode((String) obj, 3));
        } catch (IOException | IllegalArgumentException unused) {
            String strZzc = super.zzc();
            StringBuilder sb = new StringBuilder();
            sb.append("Invalid byte[] value for ");
            sb.append(strZzc);
            sb.append(": ");
            sb.append((String) obj);
            return null;
        }
    }
}
