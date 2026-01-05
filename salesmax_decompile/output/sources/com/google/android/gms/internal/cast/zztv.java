package com.google.android.gms.internal.cast;

/* loaded from: classes3.dex */
final class zztv {
    private static final zztu zza;
    private static final zztu zzb;

    static {
        zztu zztuVar;
        try {
            zztuVar = (zztu) Class.forName("com.google.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            zztuVar = null;
        }
        zza = zztuVar;
        zzb = new zztu();
    }

    public static zztu zza() {
        return zza;
    }

    public static zztu zzb() {
        return zzb;
    }
}
