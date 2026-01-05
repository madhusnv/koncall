package jl;

import com.google.android.gms.internal.mlkit_vision_barcode_bundled.a2;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.e1;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.g0;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.h0;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.i0;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.k1;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.t1;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.z1;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: jl.p */
/* loaded from: classes.dex */
public final class C3797p extends e1 implements t1 {
    private static final C3797p zzb;
    private int zzd;
    private h0 zze;
    private k1 zzh;
    private k1 zzi;
    private k1 zzj;
    private k1 zzk;
    private String zzl;
    private byte zzm = 2;
    private String zzf = "";
    private String zzg = "";

    static {
        C3797p c3797p = new C3797p();
        zzb = c3797p;
        e1.m3833h(C3797p.class, c3797p);
    }

    public C3797p() {
        z1 z1Var = z1.f6706d;
        this.zzh = z1Var;
        this.zzi = z1Var;
        this.zzj = z1Var;
        this.zzk = z1Var;
        this.zzl = "";
    }

    /* renamed from: o */
    public static C3797p m8366o() {
        return zzb;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.e1
    /* renamed from: m */
    public final Object mo3803m(int i10, e1 e1Var) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return Byte.valueOf(this.zzm);
        }
        if (i11 == 2) {
            return new a2(zzb, "\u0004\b\u0000\u0001\u0001\b\b\u0000\u0004\u0001\u0001ဉ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004\u001b\u0005\u001b\u0006\u001a\u0007Л\bဈ\u0003", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", i0.class, "zzi", C3799r.class, "zzj", "zzk", g0.class, "zzl"});
        }
        if (i11 == 3) {
            return new C3797p();
        }
        if (i11 == 4) {
            return new C3783b(zzb);
        }
        if (i11 == 5) {
            return zzb;
        }
        this.zzm = e1Var == null ? (byte) 0 : (byte) 1;
        return null;
    }

    /* renamed from: n */
    public final h0 m8367n() {
        h0 h0Var = this.zze;
        return h0Var == null ? h0.m3891n() : h0Var;
    }

    /* renamed from: p */
    public final String m8368p() {
        return this.zzf;
    }

    /* renamed from: q */
    public final String m8369q() {
        return this.zzg;
    }

    /* renamed from: r */
    public final k1 m8370r() {
        return this.zzk;
    }

    /* renamed from: s */
    public final k1 m8371s() {
        return this.zzi;
    }

    /* renamed from: t */
    public final k1 m8372t() {
        return this.zzh;
    }

    /* renamed from: u */
    public final k1 m8373u() {
        return this.zzj;
    }
}
