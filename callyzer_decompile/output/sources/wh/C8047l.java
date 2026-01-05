package wh;

import com.google.android.gms.internal.mlkit_vision_barcode_bundled.a2;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.e1;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.k1;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.t1;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.z1;
import jl.C3783b;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: wh.l */
/* loaded from: classes.dex */
public final class C8047l extends e1 implements t1 {
    private static final C8047l zzb;
    private k1 zzd;
    private k1 zze;

    static {
        C8047l c8047l = new C8047l();
        zzb = c8047l;
        e1.m3833h(C8047l.class, c8047l);
    }

    public C8047l() {
        z1 z1Var = z1.f6706d;
        this.zzd = z1Var;
        this.zze = z1Var;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.e1
    /* renamed from: m */
    public final Object mo3803m(int i10, e1 e1Var) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return new a2(zzb, "\u0004\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0002\u0000\u0001\u001b\u0002\u001b", new Object[]{"zzd", C8046k.class, "zze", C8046k.class});
        }
        if (i11 == 3) {
            return new C8047l();
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
