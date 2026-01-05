package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class g0 extends e1 implements t1 {
    private static final g0 zzb;
    private int zzd;
    private int zze;
    private n1 zzg;
    private byte zzh = 2;
    private k1 zzf = z1.f6706d;

    static {
        g0 g0Var = new g0();
        zzb = g0Var;
        e1.m3833h(g0.class, g0Var);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.e1
    /* renamed from: m */
    public final Object mo3803m(int i10, e1 e1Var) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return Byte.valueOf(this.zzh);
        }
        if (i11 == 2) {
            return new a2(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0001\u0001᠌\u0000\u0002\u001a\u0003ᐉ\u0001", new Object[]{"zzd", "zze", C1313c.f6488c, "zzf", "zzg"});
        }
        if (i11 == 3) {
            return new g0();
        }
        if (i11 == 4) {
            return new q3(4, zzb);
        }
        if (i11 == 5) {
            return zzb;
        }
        this.zzh = e1Var == null ? (byte) 0 : (byte) 1;
        return null;
    }

    /* renamed from: n */
    public final k1 m3882n() {
        return this.zzf;
    }

    /* renamed from: o */
    public final int m3883o() {
        int i10;
        int i11 = this.zze;
        if (i11 != 0) {
            i10 = 2;
            if (i11 != 1) {
                i10 = i11 != 2 ? 0 : 3;
            }
        } else {
            i10 = 1;
        }
        if (i10 == 0) {
            return 1;
        }
        return i10;
    }
}
