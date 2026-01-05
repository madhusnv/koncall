package org.bouncycastle.pqc.crypto.crystals.kyber;

/* loaded from: classes3.dex */
class Reduce {
    public static short barretReduce(short s5) {
        return (short) (s5 - ((short) (((short) ((((short) 20159) * s5) >> 26)) * 3329)));
    }

    public static short conditionalSubQ(short s5) {
        short s10 = (short) (s5 - 3329);
        return (short) (s10 + ((s10 >> 15) & KyberEngine.KyberQ));
    }

    public static short montgomeryReduce(int i10) {
        return (short) ((i10 - (((short) (KyberEngine.KyberQinv * i10)) * 3329)) >> 16);
    }
}
