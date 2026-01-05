package we;

import android.util.SparseArray;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public enum g0 {
    UNKNOWN_MOBILE_SUBTYPE(0),
    GPRS(1),
    EDGE(2),
    UMTS(3),
    CDMA(4),
    EVDO_0(5),
    EVDO_A(6),
    RTT(7),
    HSDPA(8),
    HSUPA(9),
    HSPA(10),
    IDEN(11),
    EVDO_B(12),
    LTE(13),
    EHRPD(14),
    HSPAP(15),
    GSM(16),
    TD_SCDMA(17),
    IWLAN(18),
    LTE_CA(19),
    COMBINED(100);

    private static final SparseArray<g0> valueMap;
    private final int value;

    static {
        g0 g0Var = UNKNOWN_MOBILE_SUBTYPE;
        g0 g0Var2 = GPRS;
        g0 g0Var3 = EDGE;
        g0 g0Var4 = UMTS;
        g0 g0Var5 = CDMA;
        g0 g0Var6 = EVDO_0;
        g0 g0Var7 = EVDO_A;
        g0 g0Var8 = RTT;
        g0 g0Var9 = HSDPA;
        g0 g0Var10 = HSUPA;
        g0 g0Var11 = HSPA;
        g0 g0Var12 = IDEN;
        g0 g0Var13 = EVDO_B;
        g0 g0Var14 = LTE;
        g0 g0Var15 = EHRPD;
        g0 g0Var16 = HSPAP;
        g0 g0Var17 = GSM;
        g0 g0Var18 = TD_SCDMA;
        g0 g0Var19 = IWLAN;
        g0 g0Var20 = LTE_CA;
        SparseArray<g0> sparseArray = new SparseArray<>();
        valueMap = sparseArray;
        sparseArray.put(0, g0Var);
        sparseArray.put(1, g0Var2);
        sparseArray.put(2, g0Var3);
        sparseArray.put(3, g0Var4);
        sparseArray.put(4, g0Var5);
        sparseArray.put(5, g0Var6);
        sparseArray.put(6, g0Var7);
        sparseArray.put(7, g0Var8);
        sparseArray.put(8, g0Var9);
        sparseArray.put(9, g0Var10);
        sparseArray.put(10, g0Var11);
        sparseArray.put(11, g0Var12);
        sparseArray.put(12, g0Var13);
        sparseArray.put(13, g0Var14);
        sparseArray.put(14, g0Var15);
        sparseArray.put(15, g0Var16);
        sparseArray.put(16, g0Var17);
        sparseArray.put(17, g0Var18);
        sparseArray.put(18, g0Var19);
        sparseArray.put(19, g0Var20);
    }

    g0(int i10) {
        this.value = i10;
    }

    public static g0 forNumber(int i10) {
        return valueMap.get(i10);
    }

    public int getValue() {
        return this.value;
    }
}
