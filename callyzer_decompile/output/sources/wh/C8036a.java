package wh;

import com.google.android.gms.internal.mlkit_vision_barcode_bundled.a2;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.e1;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.t1;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: wh.a */
/* loaded from: classes.dex */
public final class C8036a extends e1 implements t1 {
    private static final C8036a zzb;
    private int zzd;
    private C8044i zze;
    private C8038c zzf;
    private C8047l zzg;

    static {
        C8036a c8036a = new C8036a();
        zzb = c8036a;
        e1.m3833h(C8036a.class, c8036a);
    }

    /* renamed from: n */
    public static C8045j m15169n() {
        return (C8045j) zzb.m3837d();
    }

    /* renamed from: o */
    public static /* synthetic */ void m15170o(C8036a c8036a, C8044i c8044i) {
        c8036a.zze = c8044i;
        c8036a.zzd |= 1;
    }

    /* renamed from: p */
    public static /* synthetic */ void m15171p(C8036a c8036a, C8038c c8038c) {
        c8036a.zzf = c8038c;
        c8036a.zzd |= 2;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.e1
    /* renamed from: m */
    public final Object mo3803m(int i10, e1 e1Var) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return new a2(zzb, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new Object[]{"zzd", "zze", "zzf", "zzg"});
        }
        if (i11 == 3) {
            return new C8036a();
        }
        if (i11 == 4) {
            return new C8045j(zzb);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
