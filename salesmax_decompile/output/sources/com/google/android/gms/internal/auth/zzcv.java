package com.google.android.gms.internal.auth;

/* loaded from: classes3.dex */
final class zzcv extends zzdc {
    public zzcv(zzcz zzczVar, String str, Long l, boolean z) {
        super(zzczVar, str, l, true, null);
    }

    @Override // com.google.android.gms.internal.auth.zzdc
    public final /* bridge */ /* synthetic */ Object zza(Object obj) {
        try {
            return Long.valueOf(Long.parseLong((String) obj));
        } catch (NumberFormatException unused) {
            String strZzc = super.zzc();
            StringBuilder sb = new StringBuilder();
            sb.append("Invalid long value for ");
            sb.append(strZzc);
            sb.append(": ");
            sb.append((String) obj);
            return null;
        }
    }
}
