package ug;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public enum w2 {
    GOOGLE_ANALYTICS(0),
    GOOGLE_SIGNAL(1),
    SGTM(2),
    SGTM_CLIENT(3),
    GOOGLE_SIGNAL_PENDING(4),
    UNKNOWN(99);

    private final int zzg;

    w2(int i10) {
        this.zzg = i10;
    }

    public static w2 zzb(int i10) {
        for (w2 w2Var : values()) {
            if (w2Var.zzg == i10) {
                return w2Var;
            }
        }
        return UNKNOWN;
    }

    public final int zza() {
        return this.zzg;
    }
}
