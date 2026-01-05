package com.google.android.gms.internal.measurement;

/* loaded from: classes3.dex */
final class zzhv extends zzib {
    public zzhv(zzhy zzhyVar, String str, Boolean bool, boolean z) {
        super(zzhyVar, str, bool, true, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.measurement.zzib
    public final /* bridge */ /* synthetic */ Object zza(Object obj) {
        if (zzha.zzc.matcher(obj).matches()) {
            return Boolean.TRUE;
        }
        if (zzha.zzd.matcher(obj).matches()) {
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
