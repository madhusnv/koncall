package wh;

import com.google.android.gms.internal.mlkit_vision_barcode_bundled.a2;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.e1;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.i1;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.k0;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.t1;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.y0;
import java.util.Arrays;
import java.util.RandomAccess;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: wh.e */
/* loaded from: classes.dex */
public final class C8040e extends e1 implements t1 {
    private static final C8040e zzb;
    private int zzd;
    private i1 zze;
    private i1 zzf;
    private int zzg;
    private int zzh;
    private int zzi;
    private int zzj;

    static {
        C8040e c8040e = new C8040e();
        zzb = c8040e;
        e1.m3833h(C8040e.class, c8040e);
    }

    public C8040e() {
        y0 y0Var = y0.f6698d;
        this.zze = y0Var;
        this.zzf = y0Var;
    }

    /* renamed from: n */
    public static C8039d m15175n() {
        return (C8039d) zzb.m3837d();
    }

    /* renamed from: o */
    public static /* synthetic */ void m15176o(C8040e c8040e, int i10) {
        c8040e.zzd |= 2;
        c8040e.zzh = i10;
    }

    /* renamed from: p */
    public static void m15177p(C8040e c8040e, float f6) {
        RandomAccess randomAccess = c8040e.zze;
        if (!((k0) randomAccess).f6588a) {
            y0 y0Var = (y0) randomAccess;
            int i10 = y0Var.f6700c;
            int i11 = i10 == 0 ? 10 : i10 + i10;
            if (i11 < i10) {
                throw new IllegalArgumentException();
            }
            c8040e.zze = new y0(Arrays.copyOf(y0Var.f6699b, i11), y0Var.f6700c, true);
        }
        ((y0) c8040e.zze).m4005b(f6);
    }

    /* renamed from: q */
    public static void m15178q(C8040e c8040e, float f6) {
        RandomAccess randomAccess = c8040e.zzf;
        if (!((k0) randomAccess).f6588a) {
            y0 y0Var = (y0) randomAccess;
            int i10 = y0Var.f6700c;
            int i11 = i10 == 0 ? 10 : i10 + i10;
            if (i11 < i10) {
                throw new IllegalArgumentException();
            }
            c8040e.zzf = new y0(Arrays.copyOf(y0Var.f6699b, i11), y0Var.f6700c, true);
        }
        ((y0) c8040e.zzf).m4005b(f6);
    }

    /* renamed from: r */
    public static /* synthetic */ void m15179r(C8040e c8040e, int i10) {
        c8040e.zzd |= 1;
        c8040e.zzg = i10;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.e1
    /* renamed from: m */
    public final Object mo3803m(int i10, e1 e1Var) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return new a2(zzb, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0002\u0000\u0001\u0013\u0002\u0013\u0003ဋ\u0000\u0004ဋ\u0001\u0005ဋ\u0002\u0006ဋ\u0003", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj"});
        }
        if (i11 == 3) {
            return new C8040e();
        }
        if (i11 == 4) {
            return new C8039d(zzb);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
