package gg;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: gg.p */
/* loaded from: classes.dex */
public enum EnumC2601p implements InterfaceC2586a {
    RS256(-257),
    RS384(-258),
    RS512(-259),
    LEGACY_RS1(-262),
    PS256(-37),
    PS384(-38),
    PS512(-39),
    RS1(-65535);

    private final int zzb;

    EnumC2601p(int i10) {
        this.zzb = i10;
    }

    @Override // gg.InterfaceC2586a
    public int getAlgoValue() {
        return this.zzb;
    }
}
