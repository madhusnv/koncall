package com.google.android.gms.internal.cast;

/* loaded from: classes3.dex */
final class zztl {
    private static final zztk zza;
    private static final zztk zzb;

    static {
        zztk zztkVar;
        try {
            zztkVar = (zztk) Class.forName("com.google.protobuf.MapFieldSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            zztkVar = null;
        }
        zza = zztkVar;
        zzb = new zztk();
    }

    public static zztk zza() {
        return zza;
    }

    public static zztk zzb() {
        return zzb;
    }
}
