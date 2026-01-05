package jl;

import com.google.android.gms.internal.mlkit_vision_barcode_bundled.a2;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.e1;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.t1;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: jl.g */
/* loaded from: classes.dex */
public final class C3788g extends e1 implements t1 {
    private static final C3788g zzb;
    private int zzd;
    private byte zzg = 2;
    private String zze = "";
    private String zzf = "";

    static {
        C3788g c3788g = new C3788g();
        zzb = c3788g;
        e1.m3833h(C3788g.class, c3788g);
    }

    /* renamed from: n */
    public static C3788g m8315n() {
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
            return new a2(zzb, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001ဈ\u0000\u0002ᔈ\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i11 == 3) {
            return new C3788g();
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

    /* renamed from: o */
    public final String m8316o() {
        return this.zze;
    }

    /* renamed from: p */
    public final String m8317p() {
        return this.zzf;
    }
}
