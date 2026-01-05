package gg;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: gg.i */
/* loaded from: classes.dex */
public enum EnumC2594i implements InterfaceC2586a {
    ED256(-260),
    ED512(-261),
    ED25519(-8),
    ES256(-7),
    ECDH_HKDF_256(-25),
    ES384(-35),
    ES512(-36);

    private final int zzb;

    EnumC2594i(int i10) {
        this.zzb = i10;
    }

    @Override // gg.InterfaceC2586a
    public int getAlgoValue() {
        return this.zzb;
    }
}
