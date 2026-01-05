package com.google.android.gms.internal.cast;

/* loaded from: classes3.dex */
public final class zznv extends zzsh implements zztq {
    private static final zznv zzb;
    private int zzd;
    private int zze;
    private int zzf;
    private zznr zzg;

    static {
        zznv zznvVar = new zznv();
        zzb = zznvVar;
        zzsh.zzG(zznv.class, zznvVar);
    }

    private zznv() {
    }

    @Override // com.google.android.gms.internal.cast.zzsh
    public final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzsh.zzD(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003ဉ\u0002", new Object[]{"zzd", "zze", "zzf", "zzg"});
        }
        if (i2 == 3) {
            return new zznv();
        }
        zzlu zzluVar = null;
        if (i2 == 4) {
            return new zznu(zzluVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
