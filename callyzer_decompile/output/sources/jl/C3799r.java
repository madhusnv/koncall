package jl;

import com.google.android.gms.internal.mlkit_vision_barcode_bundled.a2;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.e1;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.t1;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: jl.r */
/* loaded from: classes.dex */
public final class C3799r extends e1 implements t1 {
    private static final C3799r zzb;
    private int zzd;
    private int zze;
    private String zzf = "";
    private String zzg = "";
    private String zzh = "";

    static {
        C3799r c3799r = new C3799r();
        zzb = c3799r;
        e1.m3833h(C3799r.class, c3799r);
    }

    /* renamed from: n */
    public static C3799r m8389n() {
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
            return new a2(zzb, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001᠌\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003", new Object[]{"zzd", "zze", C3789h.f19690f, "zzf", "zzg", "zzh"});
        }
        if (i11 == 3) {
            return new C3799r();
        }
        if (i11 == 4) {
            return new C3783b(zzb);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }

    /* renamed from: o */
    public final String m8390o() {
        return this.zzf;
    }

    /* renamed from: p */
    public final String m8391p() {
        return this.zzh;
    }

    /* renamed from: q */
    public final String m8392q() {
        return this.zzg;
    }

    /* renamed from: r */
    public final int m8393r() {
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
