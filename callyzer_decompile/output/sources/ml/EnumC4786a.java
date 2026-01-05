package ml;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ml.a */
/* loaded from: classes.dex */
public enum EnumC4786a {
    PRIMITIVE(0),
    CONSTRUCTED(32);

    private int value;

    EnumC4786a(int i10) {
        this.value = i10;
    }

    public static EnumC4786a parseEncoding(byte b10) {
        return (b10 & 32) == 0 ? PRIMITIVE : CONSTRUCTED;
    }

    public int getValue() {
        return this.value;
    }
}
