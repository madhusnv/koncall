package com.google.android.gms.internal.measurement;

/* loaded from: classes3.dex */
final class zzhu extends zzib {
    public zzhu(zzhy zzhyVar, String str, Long l, boolean z) {
        super(zzhyVar, str, l, true, null);
    }

    @Override // com.google.android.gms.internal.measurement.zzib
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
