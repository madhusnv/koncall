package jl;

import com.google.android.gms.internal.mlkit_vision_barcode_bundled.a2;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.e1;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.t1;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: jl.o */
/* loaded from: classes.dex */
public final class C3796o extends e1 implements t1 {
    private static final C3796o zzb;
    private int zzd;
    private String zze = "";
    private String zzf = "";
    private String zzg = "";
    private String zzh = "";
    private String zzi = "";
    private C3795n zzj;
    private C3795n zzk;

    static {
        C3796o c3796o = new C3796o();
        zzb = c3796o;
        e1.m3833h(C3796o.class, c3796o);
    }

    /* renamed from: p */
    public static C3796o m8358p() {
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
            return new a2(zzb, "\u0004\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဉ\u0005\u0007ဉ\u0006", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk"});
        }
        if (i11 == 3) {
            return new C3796o();
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
    public final C3795n m8359n() {
        C3795n c3795n = this.zzk;
        return c3795n == null ? C3795n.m8350t() : c3795n;
    }

    /* renamed from: o */
    public final C3795n m8360o() {
        C3795n c3795n = this.zzj;
        return c3795n == null ? C3795n.m8350t() : c3795n;
    }

    /* renamed from: q */
    public final String m8361q() {
        return this.zzf;
    }

    /* renamed from: r */
    public final String m8362r() {
        return this.zzg;
    }

    /* renamed from: s */
    public final String m8363s() {
        return this.zzh;
    }

    /* renamed from: t */
    public final String m8364t() {
        return this.zzi;
    }

    /* renamed from: u */
    public final String m8365u() {
        return this.zze;
    }
}
