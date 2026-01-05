package com.google.android.gms.internal.cast;

/* loaded from: classes3.dex */
final class zzrz {
    private static final zzrx zza = new zzry();
    private static final zzrx zzb;

    static {
        zzrx zzrxVar;
        try {
            zzrxVar = (zzrx) Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            zzrxVar = null;
        }
        zzb = zzrxVar;
    }

    public static zzrx zza() {
        zzrx zzrxVar = zzb;
        if (zzrxVar != null) {
            return zzrxVar;
        }
        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    }

    public static zzrx zzb() {
        return zza;
    }
}
