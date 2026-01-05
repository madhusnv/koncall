package jl;

import com.google.android.gms.internal.mlkit_vision_barcode_bundled.a2;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.e1;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.k1;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.t1;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.z1;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: jl.d */
/* loaded from: classes.dex */
public final class C3785d extends e1 implements t1 {
    private static final C3785d zzb;
    private k1 zzd = z1.f6706d;

    static {
        C3785d c3785d = new C3785d();
        zzb = c3785d;
        e1.m3833h(C3785d.class, c3785d);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.e1
    /* renamed from: m */
    public final Object mo3803m(int i10, e1 e1Var) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return new a2(zzb, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzd", C3784c.class});
        }
        if (i11 == 3) {
            return new C3785d();
        }
        if (i11 == 4) {
            return new C3783b(zzb);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
