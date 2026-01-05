package p001o;

import android.util.SparseArray;
import p001o.a51;

/* loaded from: classes5.dex */
public abstract class ltb {

    /* renamed from: o.ltb$a */
    public static abstract class AbstractC15150a {
        /* renamed from: a */
        public abstract ltb mo16421a();

        /* renamed from: b */
        public abstract AbstractC15150a mo16422b(EnumC15151b enumC15151b);

        /* renamed from: c */
        public abstract AbstractC15150a mo16423c(EnumC15152c enumC15152c);
    }

    /* renamed from: o.ltb$b */
    public enum EnumC15151b {
        UNKNOWN_MOBILE_SUBTYPE(0),
        GPRS(1),
        EDGE(2),
        UMTS(3),
        CDMA(4),
        /* JADX INFO: Fake field, exist only in values array */
        EVDO_0(5),
        /* JADX INFO: Fake field, exist only in values array */
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

        public static final EnumC15151b EVDO_0;
        public static final EnumC15151b EVDO_A;
        private static final SparseArray<EnumC15151b> valueMap;
        private final int value;

        static {
            EnumC15151b enumC15151b = UNKNOWN_MOBILE_SUBTYPE;
            EnumC15151b enumC15151b2 = GPRS;
            EnumC15151b enumC15151b3 = EDGE;
            EnumC15151b enumC15151b4 = UMTS;
            EnumC15151b enumC15151b5 = CDMA;
            EnumC15151b enumC15151b6 = EVDO_0;
            EVDO_0 = enumC15151b6;
            EnumC15151b enumC15151b7 = EVDO_A;
            EVDO_A = enumC15151b7;
            EnumC15151b enumC15151b8 = RTT;
            EnumC15151b enumC15151b9 = HSDPA;
            EnumC15151b enumC15151b10 = HSUPA;
            EnumC15151b enumC15151b11 = HSPA;
            EnumC15151b enumC15151b12 = IDEN;
            EnumC15151b enumC15151b13 = EVDO_B;
            EnumC15151b enumC15151b14 = LTE;
            EnumC15151b enumC15151b15 = EHRPD;
            EnumC15151b enumC15151b16 = HSPAP;
            EnumC15151b enumC15151b17 = GSM;
            EnumC15151b enumC15151b18 = TD_SCDMA;
            EnumC15151b enumC15151b19 = IWLAN;
            EnumC15151b enumC15151b20 = LTE_CA;
            SparseArray<EnumC15151b> sparseArray = new SparseArray<>();
            valueMap = sparseArray;
            sparseArray.put(0, enumC15151b);
            sparseArray.put(1, enumC15151b2);
            sparseArray.put(2, enumC15151b3);
            sparseArray.put(3, enumC15151b4);
            sparseArray.put(4, enumC15151b5);
            sparseArray.put(5, enumC15151b6);
            sparseArray.put(6, enumC15151b7);
            sparseArray.put(7, enumC15151b8);
            sparseArray.put(8, enumC15151b9);
            sparseArray.put(9, enumC15151b10);
            sparseArray.put(10, enumC15151b11);
            sparseArray.put(11, enumC15151b12);
            sparseArray.put(12, enumC15151b13);
            sparseArray.put(13, enumC15151b14);
            sparseArray.put(14, enumC15151b15);
            sparseArray.put(15, enumC15151b16);
            sparseArray.put(16, enumC15151b17);
            sparseArray.put(17, enumC15151b18);
            sparseArray.put(18, enumC15151b19);
            sparseArray.put(19, enumC15151b20);
        }

        EnumC15151b(int i) {
            this.value = i;
        }

        public static EnumC15151b forNumber(int i) {
            return valueMap.get(i);
        }

        public int getValue() {
            return this.value;
        }
    }

    /* renamed from: o.ltb$c */
    public enum EnumC15152c {
        MOBILE(0),
        WIFI(1),
        MOBILE_MMS(2),
        MOBILE_SUPL(3),
        MOBILE_DUN(4),
        /* JADX INFO: Fake field, exist only in values array */
        MOBILE_HIPRI(5),
        /* JADX INFO: Fake field, exist only in values array */
        WIMAX(6),
        BLUETOOTH(7),
        DUMMY(8),
        ETHERNET(9),
        MOBILE_FOTA(10),
        MOBILE_IMS(11),
        MOBILE_CBS(12),
        WIFI_P2P(13),
        MOBILE_IA(14),
        MOBILE_EMERGENCY(15),
        PROXY(16),
        VPN(17),
        NONE(-1);

        public static final EnumC15152c MOBILE_HIPRI;
        public static final EnumC15152c WIMAX;
        private static final SparseArray<EnumC15152c> valueMap;
        private final int value;

        static {
            EnumC15152c enumC15152c = MOBILE;
            EnumC15152c enumC15152c2 = WIFI;
            EnumC15152c enumC15152c3 = MOBILE_MMS;
            EnumC15152c enumC15152c4 = MOBILE_SUPL;
            EnumC15152c enumC15152c5 = MOBILE_DUN;
            EnumC15152c enumC15152c6 = MOBILE_HIPRI;
            MOBILE_HIPRI = enumC15152c6;
            EnumC15152c enumC15152c7 = WIMAX;
            WIMAX = enumC15152c7;
            EnumC15152c enumC15152c8 = BLUETOOTH;
            EnumC15152c enumC15152c9 = DUMMY;
            EnumC15152c enumC15152c10 = ETHERNET;
            EnumC15152c enumC15152c11 = MOBILE_FOTA;
            EnumC15152c enumC15152c12 = MOBILE_IMS;
            EnumC15152c enumC15152c13 = MOBILE_CBS;
            EnumC15152c enumC15152c14 = WIFI_P2P;
            EnumC15152c enumC15152c15 = MOBILE_IA;
            EnumC15152c enumC15152c16 = MOBILE_EMERGENCY;
            EnumC15152c enumC15152c17 = PROXY;
            EnumC15152c enumC15152c18 = VPN;
            EnumC15152c enumC15152c19 = NONE;
            SparseArray<EnumC15152c> sparseArray = new SparseArray<>();
            valueMap = sparseArray;
            sparseArray.put(0, enumC15152c);
            sparseArray.put(1, enumC15152c2);
            sparseArray.put(2, enumC15152c3);
            sparseArray.put(3, enumC15152c4);
            sparseArray.put(4, enumC15152c5);
            sparseArray.put(5, enumC15152c6);
            sparseArray.put(6, enumC15152c7);
            sparseArray.put(7, enumC15152c8);
            sparseArray.put(8, enumC15152c9);
            sparseArray.put(9, enumC15152c10);
            sparseArray.put(10, enumC15152c11);
            sparseArray.put(11, enumC15152c12);
            sparseArray.put(12, enumC15152c13);
            sparseArray.put(13, enumC15152c14);
            sparseArray.put(14, enumC15152c15);
            sparseArray.put(15, enumC15152c16);
            sparseArray.put(16, enumC15152c17);
            sparseArray.put(17, enumC15152c18);
            sparseArray.put(-1, enumC15152c19);
        }

        EnumC15152c(int i) {
            this.value = i;
        }

        public static EnumC15152c forNumber(int i) {
            return valueMap.get(i);
        }

        public int getValue() {
            return this.value;
        }
    }

    /* renamed from: a */
    public static AbstractC15150a m37881a() {
        return new a51.C12084b();
    }

    /* renamed from: b */
    public abstract EnumC15151b mo16419b();

    /* renamed from: c */
    public abstract EnumC15152c mo16420c();
}
