package com.google.android.gms.internal.auth;

/* loaded from: classes3.dex */
final class zzcw extends zzdc {
    public zzcw(zzcz zzczVar, String str, Boolean bool, boolean z) {
        super(zzczVar, str, bool, true, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.auth.zzdc
    public final /* bridge */ /* synthetic */ Object zza(Object obj) {
        if (zzcb.zzc.matcher(obj).matches()) {
            return Boolean.TRUE;
        }
        if (zzcb.zzd.matcher(obj).matches()) {
            return Boolean.FALSE;
        }
        String strZzc = super.zzc();
        StringBuilder sb = new StringBuilder();
        sb.append("Invalid boolean value for ");
        sb.append(strZzc);
        sb.append(": ");
        sb.append((String) obj);
        return null;
    }
}
