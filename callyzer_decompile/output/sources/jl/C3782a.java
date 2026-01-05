package jl;

import com.google.android.gms.internal.mlkit_vision_barcode_bundled.a2;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.e1;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.k1;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.m0;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.r0;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.t1;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.u0;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.y1;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.z1;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzer;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzgr;
import java.io.IOException;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: jl.a */
/* loaded from: classes.dex */
public final class C3782a extends e1 implements t1 {
    private static final C3782a zzb;
    private int zzd;
    private int zzf;
    private byte zzi = 2;
    private k1 zze = z1.f6706d;
    private String zzg = "";
    private r0 zzh = r0.f6641b;

    static {
        C3782a c3782a = new C3782a();
        zzb = c3782a;
        e1.m3833h(C3782a.class, c3782a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [com.google.android.gms.internal.mlkit_vision_barcode_bundled.e2] */
    /* JADX WARN: Type inference failed for: r2v2, types: [com.google.android.gms.internal.mlkit_vision_barcode_bundled.e1, java.lang.Object] */
    /* renamed from: n */
    public static C3782a m8308n(byte[] bArr, u0 u0Var) throws zzer {
        C3782a c3782a = zzb;
        int length = bArr.length;
        if (length != 0) {
            ?? r22 = (e1) c3782a.mo3803m(4, null);
            try {
                ?? M4007a = y1.f6701c.m4007a(r22.getClass());
                M4007a.mo3845d(r22, bArr, 0, length, new m0(u0Var));
                M4007a.mo3844c(r22);
                c3782a = r22;
            } catch (zzer e2) {
                throw e2;
            } catch (zzgr e10) {
                throw new zzer(e10.getMessage());
            } catch (IOException e11) {
                if (e11.getCause() instanceof zzer) {
                    throw ((zzer) e11.getCause());
                }
                throw new zzer(e11.getMessage(), e11);
            } catch (IndexOutOfBoundsException unused) {
                throw new zzer("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            }
        }
        if (c3782a == null || e1.m3834j(c3782a, true)) {
            return c3782a;
        }
        throw new zzer(new zzgr().getMessage());
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.e1
    /* renamed from: m */
    public final Object mo3803m(int i10, e1 e1Var) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return Byte.valueOf(this.zzi);
        }
        if (i11 == 2) {
            return new a2(zzb, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0002\u0001Л\u0002ᴌ\u0000\u0003ဈ\u0001\u0004ည\u0002", new Object[]{"zzd", "zze", C3793l.class, "zzf", C3789h.f19686b, "zzg", "zzh"});
        }
        if (i11 == 3) {
            return new C3782a();
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
    public final k1 m8309o() {
        return this.zze;
    }
}
