package wh;

import com.google.android.gms.internal.mlkit_vision_barcode_bundled.a2;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.e1;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.k0;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.k1;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.t1;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.z1;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: wh.g */
/* loaded from: classes.dex */
public final class C8042g extends e1 implements t1 {
    private static final C8042g zzb;
    private k1 zzd = z1.f6706d;

    static {
        C8042g c8042g = new C8042g();
        zzb = c8042g;
        e1.m3833h(C8042g.class, c8042g);
    }

    /* renamed from: n */
    public static C8041f m15180n() {
        return (C8041f) zzb.m3837d();
    }

    /* renamed from: o */
    public static void m15181o(C8042g c8042g, C8040e c8040e) {
        k1 k1Var = c8042g.zzd;
        if (!((k0) k1Var).f6588a) {
            int size = k1Var.size();
            c8042g.zzd = k1Var.mo3854f(size == 0 ? 10 : size + size);
        }
        c8042g.zzd.add(c8040e);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.e1
    /* renamed from: m */
    public final Object mo3803m(int i10, e1 e1Var) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return new a2(zzb, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzd", C8040e.class});
        }
        if (i11 == 3) {
            return new C8042g();
        }
        if (i11 == 4) {
            return new C8041f(zzb);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
