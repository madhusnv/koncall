package com.google.android.gms.internal.auth;

/* loaded from: classes3.dex */
final class zzcx extends zzdc {
    public zzcx(zzcz zzczVar, String str, Double d, boolean z) {
        super(zzczVar, str, d, true, null);
    }

    @Override // com.google.android.gms.internal.auth.zzdc
    public final /* bridge */ /* synthetic */ Object zza(Object obj) {
        try {
            return Double.valueOf(Double.parseDouble((String) obj));
        } catch (NumberFormatException unused) {
            String strZzc = super.zzc();
            StringBuilder sb = new StringBuilder();
            sb.append("Invalid double value for ");
            sb.append(strZzc);
            sb.append(": ");
            sb.append((String) obj);
            return null;
        }
    }
}
