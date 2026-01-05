package com.google.android.gms.internal.measurement;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class s3 extends i5 {
    private static final s3 zzg;
    private int zzb;
    private int zzd;
    private int zze;
    private int zzf;

    static {
        s3 s3Var = new s3();
        zzg = s3Var;
        i5.m3332m(s3.class, s3Var);
    }

    /* renamed from: q */
    public static q3 m3656q() {
        return (q3) zzg.m3339h();
    }

    /* renamed from: r */
    public static s3 m3657r() {
        return zzg;
    }

    @Override // com.google.android.gms.internal.measurement.i5
    /* renamed from: o */
    public final Object mo3102o(int i10) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return new h6(zzg, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001\u0003᠌\u0002", new Object[]{"zzb", "zzd", t1.f6390n, "zze", t1.f6388l, "zzf", t1.f6389m});
        }
        if (i11 == 3) {
            return new s3();
        }
        if (i11 == 4) {
            return new q3(zzg);
        }
        if (i11 == 5) {
            return zzg;
        }
        throw null;
    }

    /* renamed from: p */
    public final r3 m3658p() {
        r3 r3VarZzb = r3.zzb(this.zze);
        return r3VarZzb == null ? r3.CLIENT_UPLOAD_ELIGIBILITY_UNKNOWN : r3VarZzb;
    }

    /* renamed from: s */
    public final /* synthetic */ void m3659s(r3 r3Var) {
        this.zze = r3Var.zza();
        this.zzb |= 2;
    }

    /* renamed from: t */
    public final int m3660t() {
        int i10;
        int i11 = this.zzd;
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

    /* JADX WARN: Removed duplicated region for block: B:15:0x0017 A[PHI: r3
      0x0017: PHI (r3v1 int) = (r3v0 int), (r3v2 int) binds: [B:7:0x0009, B:11:0x000f] A[DONT_GENERATE, DONT_INLINE]] */
    /* renamed from: u */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int m3661u() {
        /*
            r4 = this;
            int r0 = r4.zzf
            r1 = 1
            if (r0 == 0) goto L19
            r2 = 2
            if (r0 == r1) goto L1a
            r3 = 3
            if (r0 == r2) goto L17
            r2 = 4
            if (r0 == r3) goto L1a
            r3 = 5
            if (r0 == r2) goto L17
            if (r0 == r3) goto L15
            r2 = 0
            goto L1a
        L15:
            r2 = 6
            goto L1a
        L17:
            r2 = r3
            goto L1a
        L19:
            r2 = r1
        L1a:
            if (r2 != 0) goto L1d
            return r1
        L1d:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.s3.m3661u():int");
    }

    /* renamed from: v */
    public final /* synthetic */ void m3662v(int i10) {
        this.zzd = i10 - 1;
        this.zzb |= 1;
    }

    /* renamed from: w */
    public final /* synthetic */ void m3663w(int i10) {
        this.zzf = i10 - 1;
        this.zzb |= 4;
    }
}
