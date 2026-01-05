package jl;

import com.google.android.gms.internal.mlkit_vision_barcode_bundled.a2;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.e1;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.r0;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.t1;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: jl.c */
/* loaded from: classes.dex */
public final class C3784c extends e1 implements t1 {
    private static final C3784c zzb;
    private int zzd;
    private int zze;
    private r0 zzf = r0.f6641b;

    static {
        C3784c c3784c = new C3784c();
        zzb = c3784c;
        e1.m3833h(C3784c.class, c3784c);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.e1
    /* renamed from: m */
    public final Object mo3803m(int i10, e1 e1Var) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return new a2(zzb, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002ည\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i11 == 3) {
            return new C3784c();
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
