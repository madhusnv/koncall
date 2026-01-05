package jl;

import com.google.android.gms.internal.mlkit_vision_barcode_bundled.a2;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.e1;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.f1;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.i0;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.j1;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.k0;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.k1;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.q0;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.r0;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.t1;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.z1;
import org.bouncycastle.pqc.crypto.newhope.NewHope;
import pg.j8;
import pg.k8;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: jl.l */
/* loaded from: classes.dex */
public final class C3793l extends e1 implements t1 {
    private static final C3793l zzb;
    private byte zzA = 2;
    private int zzd;
    private int zze;
    private r0 zzf;
    private String zzg;
    private C3785d zzh;
    private int zzi;
    private C3797p zzj;
    private C3799r zzk;
    private i0 zzl;
    private C3788g zzm;
    private C3791j zzn;
    private C3790i zzo;
    private C3801t zzp;
    private C3796o zzq;
    private C3798q zzr;
    private C3794m zzs;
    private k1 zzt;
    private j1 zzu;
    private String zzv;
    private k1 zzw;
    private boolean zzx;
    private double zzy;
    private r0 zzz;

    static {
        C3793l c3793l = new C3793l();
        zzb = c3793l;
        e1.m3833h(C3793l.class, c3793l);
    }

    public C3793l() {
        q0 q0Var = r0.f6641b;
        this.zzf = q0Var;
        this.zzg = "";
        z1 z1Var = z1.f6706d;
        this.zzt = z1Var;
        this.zzu = f1.f6530d;
        this.zzv = "";
        this.zzw = z1Var;
        this.zzx = true;
        this.zzz = q0Var;
    }

    /* renamed from: B */
    public static void m8325B(C3793l c3793l, int i10, C3787f c3787f) {
        k1 k1Var = c3793l.zzt;
        if (!((k0) k1Var).f6588a) {
            int size = k1Var.size();
            c3793l.zzt = k1Var.mo3854f(size == 0 ? 10 : size + size);
        }
        c3793l.zzt.set(i10, c3787f);
    }

    /* renamed from: A */
    public final k1 m8326A() {
        return this.zzt;
    }

    /* renamed from: C */
    public final boolean m8327C() {
        return (this.zzd & 4096) != 0;
    }

    /* renamed from: D */
    public final boolean m8328D() {
        return (this.zzd & 32) != 0;
    }

    /* renamed from: E */
    public final boolean m8329E() {
        return (this.zzd & 8192) != 0;
    }

    /* renamed from: F */
    public final boolean m8330F() {
        return (this.zzd & 64) != 0;
    }

    /* renamed from: G */
    public final boolean m8331G() {
        return (this.zzd & NewHope.SENDB_BYTES) != 0;
    }

    /* renamed from: H */
    public final boolean m8332H() {
        return (this.zzd & 128) != 0;
    }

    /* renamed from: I */
    public final boolean m8333I() {
        return (this.zzd & 256) != 0;
    }

    /* renamed from: J */
    public final boolean m8334J() {
        return (this.zzd & 1024) != 0;
    }

    /* renamed from: K */
    public final boolean m8335K() {
        return (this.zzd & 512) != 0;
    }

    /* renamed from: L */
    public final int m8336L() {
        int iM11715b = j8.m11715b(this.zze);
        if (iM11715b == 0) {
            return 1;
        }
        return iM11715b;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.e1
    /* renamed from: m */
    public final Object mo3803m(int i10, e1 e1Var) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return Byte.valueOf(this.zzA);
        }
        if (i11 == 2) {
            return new a2(zzb, "\u0004\u0016\u0000\u0001\u0001\u0017\u0016\u0000\u0003\u000b\u0001ᴌ\u0000\u0002ᔊ\u0001\u0003ᔈ\u0002\u0004ᴌ\u0004\u0005ᐉ\u0005\u0006ဉ\u0006\u0007ဉ\u0007\bᐉ\b\tᐉ\t\nᐉ\n\u000bЛ\fဈ\u000f\rЛ\u000eည\u0012\u000fᐉ\u000b\u0010ဉ\f\u0011ဉ\r\u0012\u0016\u0013ဉ\u000e\u0014ဇ\u0010\u0015က\u0011\u0017ဉ\u0003", new Object[]{"zzd", "zze", C3789h.f19688d, "zzf", "zzg", "zzi", C3789h.f19689e, "zzj", "zzk", "zzl", "zzm", "zzn", "zzo", "zzt", C3787f.class, "zzv", "zzw", C3787f.class, "zzz", "zzp", "zzq", "zzr", "zzu", "zzs", "zzx", "zzy", "zzh"});
        }
        if (i11 == 3) {
            return new C3793l();
        }
        if (i11 == 4) {
            return new C3792k(zzb);
        }
        if (i11 == 5) {
            return zzb;
        }
        this.zzA = e1Var == null ? (byte) 0 : (byte) 1;
        return null;
    }

    /* renamed from: n */
    public final int m8337n() {
        int iM11733a = k8.m11733a(this.zzi);
        if (iM11733a == 0) {
            return 1;
        }
        return iM11733a;
    }

    /* renamed from: o */
    public final int m8338o() {
        return this.zzt.size();
    }

    /* renamed from: p */
    public final i0 m8339p() {
        i0 i0Var = this.zzl;
        return i0Var == null ? i0.m3899n() : i0Var;
    }

    /* renamed from: q */
    public final C3796o m8340q() {
        C3796o c3796o = this.zzq;
        return c3796o == null ? C3796o.m8358p() : c3796o;
    }

    /* renamed from: r */
    public final C3797p m8341r() {
        C3797p c3797p = this.zzj;
        return c3797p == null ? C3797p.m8366o() : c3797p;
    }

    /* renamed from: s */
    public final C3798q m8342s() {
        C3798q c3798q = this.zzr;
        return c3798q == null ? C3798q.m8374n() : c3798q;
    }

    /* renamed from: t */
    public final C3799r m8343t() {
        C3799r c3799r = this.zzk;
        return c3799r == null ? C3799r.m8389n() : c3799r;
    }

    /* renamed from: u */
    public final C3801t m8344u() {
        C3801t c3801t = this.zzp;
        return c3801t == null ? C3801t.m8394p() : c3801t;
    }

    /* renamed from: v */
    public final C3788g m8345v() {
        C3788g c3788g = this.zzm;
        return c3788g == null ? C3788g.m8315n() : c3788g;
    }

    /* renamed from: w */
    public final C3790i m8346w() {
        C3790i c3790i = this.zzo;
        return c3790i == null ? C3790i.m8318n() : c3790i;
    }

    /* renamed from: x */
    public final C3791j m8347x() {
        C3791j c3791j = this.zzn;
        return c3791j == null ? C3791j.m8321n() : c3791j;
    }

    /* renamed from: y */
    public final r0 m8348y() {
        return this.zzf;
    }

    /* renamed from: z */
    public final String m8349z() {
        return this.zzg;
    }
}
