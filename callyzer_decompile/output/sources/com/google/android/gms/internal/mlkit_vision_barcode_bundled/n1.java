package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class n1 extends e1 implements t1 {
    private static final n1 zzb;
    private int zzd;
    private k1 zzf;
    private k1 zzg;
    private k1 zzh;
    private r3 zzi;
    private n1 zzj;
    private w3 zzk;
    private byte zzl = 2;
    private String zze = "";

    static {
        n1 n1Var = new n1();
        zzb = n1Var;
        e1.m3833h(n1.class, n1Var);
        r3 r3VarM3950n = r3.m3950n();
        q2 q2Var = q2.zza;
        if (r3VarM3950n == null) {
            throw new IllegalArgumentException("Null containingTypeDefaultInstance");
        }
    }

    public n1() {
        z1 z1Var = z1.f6706d;
        this.zzf = z1Var;
        this.zzg = z1Var;
        this.zzh = z1Var;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.e1
    /* renamed from: m */
    public final Object mo3803m(int i10, e1 e1Var) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return Byte.valueOf(this.zzl);
        }
        if (i11 == 2) {
            return new a2(zzb, "\u0001\u0007\u0000\u0001\u0002Ǵ\u0007\u0000\u0003\u0004\u0002Л\u0005Л\u0006\u001b\bᐉ\u0001\nဈ\u0000\u000bᐉ\u0002Ǵဉ\u0003", new Object[]{"zzd", "zzf", g3.class, "zzh", g3.class, "zzg", s3.class, "zzi", "zze", "zzj", "zzk"});
        }
        if (i11 == 3) {
            return new n1();
        }
        if (i11 == 4) {
            return new q3(7, zzb);
        }
        if (i11 == 5) {
            return zzb;
        }
        this.zzl = e1Var == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
