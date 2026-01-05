package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class i0 extends e1 implements t1 {
    private static final i0 zzb;
    private int zzd;
    private int zze;
    private String zzf = "";

    static {
        i0 i0Var = new i0();
        zzb = i0Var;
        e1.m3833h(i0.class, i0Var);
    }

    /* renamed from: n */
    public static i0 m3899n() {
        return zzb;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.e1
    /* renamed from: m */
    public final Object mo3803m(int i10, e1 e1Var) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return new a2(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002ဈ\u0001", new Object[]{"zzd", "zze", C1313c.f6489d, "zzf"});
        }
        if (i11 == 3) {
            return new i0();
        }
        if (i11 == 4) {
            return new q3(6, zzb);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }

    /* renamed from: o */
    public final String m3900o() {
        return this.zzf;
    }

    /* renamed from: p */
    public final int m3901p() {
        int i10;
        int i11 = this.zze;
        if (i11 != 0) {
            i10 = 2;
            if (i11 != 1) {
                if (i11 != 2) {
                    i10 = 4;
                    if (i11 != 3) {
                        i10 = i11 != 4 ? 0 : 5;
                    }
                } else {
                    i10 = 3;
                }
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
