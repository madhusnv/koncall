package p001o;

import com.google.firebase.remoteconfig.FirebaseRemoteConfig;

/* loaded from: classes4.dex */
public abstract class ebj {

    /* renamed from: a */
    public static final int f21345a = m24743c(1, 3);

    /* renamed from: b */
    public static final int f21346b = m24743c(1, 4);

    /* renamed from: c */
    public static final int f21347c = m24743c(2, 0);

    /* renamed from: d */
    public static final int f21348d = m24743c(3, 2);

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'INT64' uses external variables
    	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
    	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* renamed from: o.ebj$b */
    public static class EnumC13155b {
        private static final /* synthetic */ EnumC13155b[] $VALUES;
        public static final EnumC13155b BOOL;
        public static final EnumC13155b BYTES;
        public static final EnumC13155b DOUBLE;
        public static final EnumC13155b ENUM;
        public static final EnumC13155b FIXED32;
        public static final EnumC13155b FIXED64;
        public static final EnumC13155b FLOAT;
        public static final EnumC13155b GROUP;
        public static final EnumC13155b INT32;
        public static final EnumC13155b INT64;
        public static final EnumC13155b MESSAGE;
        public static final EnumC13155b SFIXED32;
        public static final EnumC13155b SFIXED64;
        public static final EnumC13155b SINT32;
        public static final EnumC13155b SINT64;
        public static final EnumC13155b STRING;
        public static final EnumC13155b UINT32;
        public static final EnumC13155b UINT64;
        private final EnumC13156c javaType;
        private final int wireType;

        /* renamed from: o.ebj$b$a */
        public enum a extends EnumC13155b {
            public a(String str, int i, EnumC13156c enumC13156c, int i2) {
                super(str, i, enumC13156c, i2);
            }

            @Override // p001o.ebj.EnumC13155b
            public boolean isPackable() {
                return false;
            }
        }

        /* renamed from: o.ebj$b$b */
        public enum b extends EnumC13155b {
            public b(String str, int i, EnumC13156c enumC13156c, int i2) {
                super(str, i, enumC13156c, i2);
            }

            @Override // p001o.ebj.EnumC13155b
            public boolean isPackable() {
                return false;
            }
        }

        /* renamed from: o.ebj$b$c */
        public enum c extends EnumC13155b {
            public c(String str, int i, EnumC13156c enumC13156c, int i2) {
                super(str, i, enumC13156c, i2);
            }

            @Override // p001o.ebj.EnumC13155b
            public boolean isPackable() {
                return false;
            }
        }

        /* renamed from: o.ebj$b$d */
        public enum d extends EnumC13155b {
            public d(String str, int i, EnumC13156c enumC13156c, int i2) {
                super(str, i, enumC13156c, i2);
            }

            @Override // p001o.ebj.EnumC13155b
            public boolean isPackable() {
                return false;
            }
        }

        static {
            EnumC13155b enumC13155b = new EnumC13155b("DOUBLE", 0, EnumC13156c.DOUBLE, 1);
            DOUBLE = enumC13155b;
            EnumC13155b enumC13155b2 = new EnumC13155b("FLOAT", 1, EnumC13156c.FLOAT, 5);
            FLOAT = enumC13155b2;
            EnumC13156c enumC13156c = EnumC13156c.LONG;
            EnumC13155b enumC13155b3 = new EnumC13155b("INT64", 2, enumC13156c, 0);
            INT64 = enumC13155b3;
            EnumC13155b enumC13155b4 = new EnumC13155b("UINT64", 3, enumC13156c, 0);
            UINT64 = enumC13155b4;
            EnumC13156c enumC13156c2 = EnumC13156c.INT;
            EnumC13155b enumC13155b5 = new EnumC13155b("INT32", 4, enumC13156c2, 0);
            INT32 = enumC13155b5;
            EnumC13155b enumC13155b6 = new EnumC13155b("FIXED64", 5, enumC13156c, 1);
            FIXED64 = enumC13155b6;
            EnumC13155b enumC13155b7 = new EnumC13155b("FIXED32", 6, enumC13156c2, 5);
            FIXED32 = enumC13155b7;
            EnumC13155b enumC13155b8 = new EnumC13155b("BOOL", 7, EnumC13156c.BOOLEAN, 0);
            BOOL = enumC13155b8;
            a aVar = new a("STRING", 8, EnumC13156c.STRING, 2);
            STRING = aVar;
            EnumC13156c enumC13156c3 = EnumC13156c.MESSAGE;
            b bVar = new b("GROUP", 9, enumC13156c3, 3);
            GROUP = bVar;
            c cVar = new c("MESSAGE", 10, enumC13156c3, 2);
            MESSAGE = cVar;
            d dVar = new d("BYTES", 11, EnumC13156c.BYTE_STRING, 2);
            BYTES = dVar;
            EnumC13155b enumC13155b9 = new EnumC13155b("UINT32", 12, enumC13156c2, 0);
            UINT32 = enumC13155b9;
            EnumC13155b enumC13155b10 = new EnumC13155b("ENUM", 13, EnumC13156c.ENUM, 0);
            ENUM = enumC13155b10;
            EnumC13155b enumC13155b11 = new EnumC13155b("SFIXED32", 14, enumC13156c2, 5);
            SFIXED32 = enumC13155b11;
            EnumC13155b enumC13155b12 = new EnumC13155b("SFIXED64", 15, enumC13156c, 1);
            SFIXED64 = enumC13155b12;
            EnumC13155b enumC13155b13 = new EnumC13155b("SINT32", 16, enumC13156c2, 0);
            SINT32 = enumC13155b13;
            EnumC13155b enumC13155b14 = new EnumC13155b("SINT64", 17, enumC13156c, 0);
            SINT64 = enumC13155b14;
            $VALUES = new EnumC13155b[]{enumC13155b, enumC13155b2, enumC13155b3, enumC13155b4, enumC13155b5, enumC13155b6, enumC13155b7, enumC13155b8, aVar, bVar, cVar, dVar, enumC13155b9, enumC13155b10, enumC13155b11, enumC13155b12, enumC13155b13, enumC13155b14};
        }

        public static EnumC13155b valueOf(String str) {
            return (EnumC13155b) Enum.valueOf(EnumC13155b.class, str);
        }

        public static EnumC13155b[] values() {
            return (EnumC13155b[]) $VALUES.clone();
        }

        public EnumC13156c getJavaType() {
            return this.javaType;
        }

        public int getWireType() {
            return this.wireType;
        }

        public boolean isPackable() {
            return true;
        }

        private EnumC13155b(String str, int i, EnumC13156c enumC13156c, int i2) {
            this.javaType = enumC13156c;
            this.wireType = i2;
        }
    }

    /* renamed from: o.ebj$c */
    public enum EnumC13156c {
        INT(0),
        LONG(0L),
        FLOAT(Float.valueOf(0.0f)),
        DOUBLE(Double.valueOf(FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE)),
        BOOLEAN(Boolean.FALSE),
        STRING(""),
        BYTE_STRING(yq1.f55802b),
        ENUM(null),
        MESSAGE(null);

        private final Object defaultDefault;

        EnumC13156c(Object obj) {
            this.defaultDefault = obj;
        }

        public Object getDefaultDefault() {
            return this.defaultDefault;
        }
    }

    /* renamed from: a */
    public static int m24741a(int i) {
        return i >>> 3;
    }

    /* renamed from: b */
    public static int m24742b(int i) {
        return i & 7;
    }

    /* renamed from: c */
    public static int m24743c(int i, int i2) {
        return (i << 3) | i2;
    }
}
