package com.google.android.gms.internal.measurement;

import java.io.Serializable;

/* loaded from: classes3.dex */
final class zzij implements Serializable, zzii {
    final zzii zza;
    volatile transient boolean zzb;
    transient Object zzc;

    public zzij(zzii zziiVar) {
        zziiVar.getClass();
        this.zza = zziiVar;
    }

    public final String toString() {
        Object obj;
        StringBuilder sb = new StringBuilder();
        sb.append("Suppliers.memoize(");
        if (this.zzb) {
            obj = "<supplier that returned " + this.zzc + ">";
        } else {
            obj = this.zza;
        }
        sb.append(obj);
        sb.append(")");
        return sb.toString();
    }

    @Override // com.google.android.gms.internal.measurement.zzii
    public final Object zza() {
        if (!this.zzb) {
            synchronized (this) {
                if (!this.zzb) {
                    Object objZza = this.zza.zza();
                    this.zzc = objZza;
                    this.zzb = true;
                    return objZza;
                }
            }
        }
        return this.zzc;
    }
}
