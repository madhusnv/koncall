package com.google.android.gms.internal.cast;

import sun.misc.Unsafe;

/* loaded from: classes3.dex */
final class zzuy extends zzva {
    public zzuy(Unsafe unsafe) {
        super(unsafe);
    }

    @Override // com.google.android.gms.internal.cast.zzva
    public final double zza(Object obj, long j) {
        return Double.longBitsToDouble(this.zza.getLong(obj, j));
    }

    @Override // com.google.android.gms.internal.cast.zzva
    public final float zzb(Object obj, long j) {
        return Float.intBitsToFloat(this.zza.getInt(obj, j));
    }

    @Override // com.google.android.gms.internal.cast.zzva
    public final void zzc(Object obj, long j, boolean z) {
        if (zzvb.zzb) {
            zzvb.zzD(obj, j, z ? (byte) 1 : (byte) 0);
        } else {
            zzvb.zzE(obj, j, z ? (byte) 1 : (byte) 0);
        }
    }

    @Override // com.google.android.gms.internal.cast.zzva
    public final void zzd(Object obj, long j, byte b) {
        if (zzvb.zzb) {
            zzvb.zzD(obj, j, b);
        } else {
            zzvb.zzE(obj, j, b);
        }
    }

    @Override // com.google.android.gms.internal.cast.zzva
    public final void zze(Object obj, long j, double d) {
        this.zza.putLong(obj, j, Double.doubleToLongBits(d));
    }

    @Override // com.google.android.gms.internal.cast.zzva
    public final void zzf(Object obj, long j, float f) {
        this.zza.putInt(obj, j, Float.floatToIntBits(f));
    }

    @Override // com.google.android.gms.internal.cast.zzva
    public final boolean zzg(Object obj, long j) {
        return zzvb.zzb ? zzvb.zzt(obj, j) : zzvb.zzu(obj, j);
    }
}
