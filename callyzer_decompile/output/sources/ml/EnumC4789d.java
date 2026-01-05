package ml;

import org.bouncycastle.asn1.BERTags;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ml.d */
/* loaded from: classes.dex */
public enum EnumC4789d {
    UNIVERSAL(0),
    APPLICATION(64),
    CONTEXT_SPECIFIC(128),
    PRIVATE(BERTags.PRIVATE);

    private int value;

    EnumC4789d(int i10) {
        this.value = i10;
    }

    public static EnumC4789d parseClass(byte b10) {
        int i10 = b10 & 192;
        for (EnumC4789d enumC4789d : values()) {
            if (enumC4789d.value == i10) {
                return enumC4789d;
            }
        }
        throw new IllegalStateException("Could not parse ASN.1 Tag Class (should be impossible)");
    }

    public int getValue() {
        return this.value;
    }
}
