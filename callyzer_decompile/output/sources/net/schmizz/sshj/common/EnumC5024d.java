package net.schmizz.sshj.common;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: net.schmizz.sshj.common.d */
/* loaded from: classes3.dex */
public enum EnumC5024d {
    SECP256R1("secp256r1"),
    SECP384R1("secp384r1"),
    SECP521R1("secp521r1");

    private final String curveName;

    EnumC5024d(String str) {
        this.curveName = str;
    }

    public String getCurveName() {
        return this.curveName;
    }
}
