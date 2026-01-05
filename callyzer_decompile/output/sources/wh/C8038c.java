package wh;

import com.google.android.gms.internal.mlkit_vision_barcode_bundled.a2;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.e1;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.q0;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.r0;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.t1;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: wh.c */
/* loaded from: classes.dex */
public final class C8038c extends e1 implements t1 {
    private static final C8038c zzb;
    private int zzd;
    private String zze = "";
    private r0 zzf;
    private String zzg;
    private r0 zzh;
    private float zzi;
    private float zzj;
    private float zzk;
    private float zzl;
    private int zzm;

    static {
        C8038c c8038c = new C8038c();
        zzb = c8038c;
        e1.m3833h(C8038c.class, c8038c);
    }

    public C8038c() {
        q0 q0Var = r0.f6641b;
        this.zzf = q0Var;
        this.zzg = "";
        this.zzh = q0Var;
        this.zzi = 0.25f;
        this.zzj = 0.25f;
        this.zzk = 0.5f;
        this.zzl = 0.85f;
        this.zzm = 1;
    }

    /* renamed from: n */
    public static C8037b m15172n() {
        return (C8037b) zzb.m3837d();
    }

    /* renamed from: o */
    public static /* synthetic */ void m15173o(C8038c c8038c, r0 r0Var) {
        r0Var.getClass();
        c8038c.zzd |= 2;
        c8038c.zzf = r0Var;
    }

    /* renamed from: p */
    public static /* synthetic */ void m15174p(C8038c c8038c, r0 r0Var) {
        r0Var.getClass();
        c8038c.zzd |= 8;
        c8038c.zzh = r0Var;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.e1
    /* renamed from: m */
    public final Object mo3803m(int i10, e1 e1Var) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return new a2(zzb, "\u0004\t\u0000\u0001\u0001\t\t\u0000\u0000\u0000\u0001ဈ\u0000\u0002ည\u0001\u0003ဈ\u0002\u0004ည\u0003\u0005ခ\u0004\u0006ခ\u0005\u0007ခ\u0006\bခ\u0007\tင\b", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm"});
        }
        if (i11 == 3) {
            return new C8038c();
        }
        if (i11 == 4) {
            return new C8037b(zzb);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
