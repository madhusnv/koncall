package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class v3 extends e1 implements t1 {
    private static final v3 zzb;
    private int zzd;
    private long zze;
    private long zzf;
    private r3 zzg;
    private byte zzh = 2;

    static {
        v3 v3Var = new v3();
        zzb = v3Var;
        e1.m3833h(v3.class, v3Var);
        r3 r3VarM3950n = r3.m3950n();
        q2 q2Var = q2.zza;
        if (r3VarM3950n == null) {
            throw new IllegalArgumentException("Null containingTypeDefaultInstance");
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.e1
    /* renamed from: m */
    public final Object mo3803m(int i10, e1 e1Var) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return Byte.valueOf(this.zzh);
        }
        if (i11 == 2) {
            return new a2(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0003\u0001ᔅ\u0000\u0002ᔅ\u0001\u0003ᐉ\u0002", new Object[]{"zzd", "zze", "zzf", "zzg"});
        }
        if (i11 == 3) {
            return new v3();
        }
        if (i11 == 4) {
            return new o3(zzb);
        }
        if (i11 == 5) {
            return zzb;
        }
        this.zzh = e1Var == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
