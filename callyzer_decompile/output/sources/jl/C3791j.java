package jl;

import com.google.android.gms.internal.mlkit_vision_barcode_bundled.a2;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.e1;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.t1;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: jl.j */
/* loaded from: classes.dex */
public final class C3791j extends e1 implements t1 {
    private static final C3791j zzb;
    private int zzd;
    private int zzf;
    private boolean zzh;
    private byte zzi = 2;
    private String zze = "";
    private String zzg = "";

    static {
        C3791j c3791j = new C3791j();
        zzb = c3791j;
        e1.m3833h(C3791j.class, c3791j);
    }

    /* renamed from: n */
    public static C3791j m8321n() {
        return zzb;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.e1
    /* renamed from: m */
    public final Object mo3803m(int i10, e1 e1Var) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return Byte.valueOf(this.zzi);
        }
        if (i11 == 2) {
            return new a2(zzb, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0001\u0001ᔈ\u0000\u0002᠌\u0001\u0003ဈ\u0002\u0004ဇ\u0003", new Object[]{"zzd", "zze", "zzf", C3789h.f19687c, "zzg", "zzh"});
        }
        if (i11 == 3) {
            return new C3791j();
        }
        if (i11 == 4) {
            return new C3783b(zzb);
        }
        if (i11 == 5) {
            return zzb;
        }
        this.zzi = e1Var == null ? (byte) 0 : (byte) 1;
        return null;
    }

    /* renamed from: o */
    public final String m8322o() {
        return this.zzg;
    }

    /* renamed from: p */
    public final String m8323p() {
        return this.zze;
    }

    /* renamed from: q */
    public final int m8324q() {
        int i10;
        int i11 = this.zzf;
        if (i11 != 0) {
            i10 = 2;
            if (i11 != 1) {
                if (i11 != 2) {
                    i10 = 4;
                    if (i11 != 3) {
                        i10 = i11 != 4 ? 0 : 5;
                    }
                } else {
                    i10 = 3;
                }
            }
        } else {
            i10 = 1;
        }
        if (i10 == 0) {
            return 1;
        }
        return i10;
    }
}
