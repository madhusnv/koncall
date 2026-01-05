package jl;

import com.google.android.gms.internal.mlkit_vision_barcode_bundled.a2;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.e1;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.t1;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: jl.f */
/* loaded from: classes.dex */
public final class C3787f extends e1 implements t1 {
    private static final C3787f zzb;
    private int zzd;
    private int zze;
    private int zzf;
    private byte zzg = 2;

    static {
        C3787f c3787f = new C3787f();
        zzb = c3787f;
        e1.m3833h(C3787f.class, c3787f);
    }

    /* renamed from: p */
    public static C3786e m8310p() {
        return (C3786e) zzb.m3837d();
    }

    /* renamed from: q */
    public static /* synthetic */ void m8311q(C3787f c3787f, int i10) {
        c3787f.zzd |= 1;
        c3787f.zze = i10;
    }

    /* renamed from: r */
    public static /* synthetic */ void m8312r(C3787f c3787f, int i10) {
        c3787f.zzd |= 2;
        c3787f.zzf = i10;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.e1
    /* renamed from: m */
    public final Object mo3803m(int i10, e1 e1Var) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return Byte.valueOf(this.zzg);
        }
        if (i11 == 2) {
            return new a2(zzb, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0002\u0001ᔄ\u0000\u0002ᔄ\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i11 == 3) {
            return new C3787f();
        }
        if (i11 == 4) {
            return new C3786e(zzb);
        }
        if (i11 == 5) {
            return zzb;
        }
        this.zzg = e1Var == null ? (byte) 0 : (byte) 1;
        return null;
    }

    /* renamed from: n */
    public final int m8313n() {
        return this.zze;
    }

    /* renamed from: o */
    public final int m8314o() {
        return this.zzf;
    }
}
