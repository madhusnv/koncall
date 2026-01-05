package jl;

import com.google.android.gms.internal.mlkit_vision_barcode_bundled.a2;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.e1;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.t1;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: jl.t */
/* loaded from: classes.dex */
public final class C3801t extends e1 implements t1 {
    private static final C3801t zzb;
    private int zzd;
    private double zze;
    private double zzf;
    private byte zzg = 2;

    static {
        C3801t c3801t = new C3801t();
        zzb = c3801t;
        e1.m3833h(C3801t.class, c3801t);
    }

    /* renamed from: p */
    public static C3801t m8394p() {
        return zzb;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.e1
    /* renamed from: m */
    public final Object mo3803m(int i10, e1 e1Var) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return Byte.valueOf(this.zzg);
        }
        if (i11 == 2) {
            return new a2(zzb, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0002\u0001ᔀ\u0000\u0002ᔀ\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i11 == 3) {
            return new C3801t();
        }
        if (i11 == 4) {
            return new C3783b(zzb);
        }
        if (i11 == 5) {
            return zzb;
        }
        this.zzg = e1Var == null ? (byte) 0 : (byte) 1;
        return null;
    }

    /* renamed from: n */
    public final double m8395n() {
        return this.zze;
    }

    /* renamed from: o */
    public final double m8396o() {
        return this.zzf;
    }
}
