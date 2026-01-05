package jl;

import com.google.android.gms.internal.mlkit_vision_barcode_bundled.a2;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.e1;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.t1;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: jl.n */
/* loaded from: classes.dex */
public final class C3795n extends e1 implements t1 {
    private static final C3795n zzb;
    private int zzd;
    private int zze;
    private int zzf;
    private int zzg;
    private int zzh;
    private int zzi;
    private int zzj;
    private boolean zzk;

    static {
        C3795n c3795n = new C3795n();
        zzb = c3795n;
        e1.m3833h(C3795n.class, c3795n);
    }

    /* renamed from: t */
    public static C3795n m8350t() {
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
            return new a2(zzb, "\u0004\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0002\u0004င\u0003\u0005င\u0004\u0006င\u0005\u0007ဇ\u0006", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk"});
        }
        if (i11 == 3) {
            return new C3795n();
        }
        if (i11 == 4) {
            return new C3783b(zzb);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }

    /* renamed from: n */
    public final int m8351n() {
        return this.zzg;
    }

    /* renamed from: o */
    public final int m8352o() {
        return this.zzh;
    }

    /* renamed from: p */
    public final int m8353p() {
        return this.zzi;
    }

    /* renamed from: q */
    public final int m8354q() {
        return this.zzf;
    }

    /* renamed from: r */
    public final int m8355r() {
        return this.zzj;
    }

    /* renamed from: s */
    public final int m8356s() {
        return this.zze;
    }

    /* renamed from: u */
    public final boolean m8357u() {
        return this.zzk;
    }
}
