package com.google.android.gms.internal.measurement;

/* loaded from: classes3.dex */
final class zzhw extends zzib {
    public zzhw(zzhy zzhyVar, String str, Double d, boolean z) {
        super(zzhyVar, "measurement.test.double_flag", d, true, null);
    }

    @Override // com.google.android.gms.internal.measurement.zzib
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
