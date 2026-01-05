package wh;

import com.google.android.gms.internal.mlkit_vision_barcode_bundled.a2;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.e1;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.r0;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.s2;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.t1;
import org.bouncycastle.pqc.crypto.crystals.dilithium.DilithiumEngine;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: wh.i */
/* loaded from: classes.dex */
public final class C8044i extends e1 implements t1 {
    private static final C8044i zzb;
    private int zzd;
    private C8042g zzj;
    private s2 zzl;
    private String zze = "";
    private r0 zzf = r0.f6641b;
    private int zzg = 10;
    private float zzh = 0.5f;
    private float zzi = 0.05f;
    private int zzk = 1;
    private int zzm = DilithiumEngine.DilithiumPolyT1PackedBytes;
    private int zzn = 4;
    private int zzo = 2;

    static {
        C8044i c8044i = new C8044i();
        zzb = c8044i;
        e1.m3833h(C8044i.class, c8044i);
    }

    /* renamed from: n */
    public static C8043h m15182n() {
        return (C8043h) zzb.m3837d();
    }

    /* renamed from: o */
    public static /* synthetic */ void m15183o(C8044i c8044i, C8042g c8042g) {
        c8044i.zzj = c8042g;
        c8044i.zzd |= 32;
    }

    /* renamed from: p */
    public static /* synthetic */ void m15184p(C8044i c8044i, r0 r0Var) {
        r0Var.getClass();
        c8044i.zzd |= 2;
        c8044i.zzf = r0Var;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.e1
    /* renamed from: m */
    public final Object mo3803m(int i10, e1 e1Var) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return new a2(zzb, "\u0004\u000b\u0000\u0001\u0001\f\u000b\u0000\u0000\u0000\u0001ဈ\u0000\u0002ည\u0001\u0003ဋ\u0002\u0004ခ\u0003\u0005ခ\u0004\u0006ဉ\u0005\bင\u0006\tဉ\u0007\nင\b\u000bင\t\fင\n", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm", "zzn", "zzo"});
        }
        if (i11 == 3) {
            return new C8044i();
        }
        if (i11 == 4) {
            return new C8043h(zzb);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
