package p001o;

import com.google.firebase.remoteconfig.FirebaseRemoteConfig;

/* loaded from: classes6.dex */
public abstract class fbj {

    /* renamed from: a */
    public static final int f23120a = m26427c(1, 3);

    /* renamed from: b */
    public static final int f23121b = m26427c(1, 4);

    /* renamed from: c */
    public static final int f23122c = m26427c(2, 0);

    /* renamed from: d */
    public static final int f23123d = m26427c(3, 2);

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
    /* renamed from: o.fbj$b */
    public static class EnumC13396b {
        private static final /* synthetic */ EnumC13396b[] $VALUES;
        public static final EnumC13396b BOOL;
        public static final EnumC13396b BYTES;
        public static final EnumC13396b DOUBLE;
        public static final EnumC13396b ENUM;
        public static final EnumC13396b FIXED32;
        public static final EnumC13396b FIXED64;
        public static final EnumC13396b FLOAT;
        public static final EnumC13396b GROUP;
        public static final EnumC13396b INT32;
        public static final EnumC13396b INT64;
        public static final EnumC13396b MESSAGE;
        public static final EnumC13396b SFIXED32;
        public static final EnumC13396b SFIXED64;
        public static final EnumC13396b SINT32;
        public static final EnumC13396b SINT64;
        public static final EnumC13396b STRING;
        public static final EnumC13396b UINT32;
        public static final EnumC13396b UINT64;
        private final EnumC13397c javaType;
        private final int wireType;

        /* renamed from: o.fbj$b$a */
        public enum a extends EnumC13396b {
            public a(String str, int i, EnumC13397c enumC13397c, int i2) {
                super(str, i, enumC13397c, i2);
            }

            @Override // p001o.fbj.EnumC13396b
            public boolean isPackable() {
                return false;
            }
        }

        /* renamed from: o.fbj$b$b */
        public enum b extends EnumC13396b {
            public b(String str, int i, EnumC13397c enumC13397c, int i2) {
                super(str, i, enumC13397c, i2);
            }

            @Override // p001o.fbj.EnumC13396b
            public boolean isPackable() {
                return false;
            }
        }

        /* renamed from: o.fbj$b$c */
        public enum c extends EnumC13396b {
            public c(String str, int i, EnumC13397c enumC13397c, int i2) {
                super(str, i, enumC13397c, i2);
            }

            @Override // p001o.fbj.EnumC13396b
            public boolean isPackable() {
                return false;
            }
        }

        /* renamed from: o.fbj$b$d */
        public enum d extends EnumC13396b {
            public d(String str, int i, EnumC13397c enumC13397c, int i2) {
                super(str, i, enumC13397c, i2);
            }

            @Override // p001o.fbj.EnumC13396b
            public boolean isPackable() {
                return false;
            }
        }

        static {
            EnumC13396b enumC13396b = new EnumC13396b("DOUBLE", 0, EnumC13397c.DOUBLE, 1);
            DOUBLE = enumC13396b;
            EnumC13396b enumC13396b2 = new EnumC13396b("FLOAT", 1, EnumC13397c.FLOAT, 5);
            FLOAT = enumC13396b2;
            EnumC13397c enumC13397c = EnumC13397c.LONG;
            EnumC13396b enumC13396b3 = new EnumC13396b("INT64", 2, enumC13397c, 0);
            INT64 = enumC13396b3;
            EnumC13396b enumC13396b4 = new EnumC13396b("UINT64", 3, enumC13397c, 0);
            UINT64 = enumC13396b4;
            EnumC13397c enumC13397c2 = EnumC13397c.INT;
            EnumC13396b enumC13396b5 = new EnumC13396b("INT32", 4, enumC13397c2, 0);
            INT32 = enumC13396b5;
            EnumC13396b enumC13396b6 = new EnumC13396b("FIXED64", 5, enumC13397c, 1);
            FIXED64 = enumC13396b6;
            EnumC13396b enumC13396b7 = new EnumC13396b("FIXED32", 6, enumC13397c2, 5);
            FIXED32 = enumC13396b7;
            EnumC13396b enumC13396b8 = new EnumC13396b("BOOL", 7, EnumC13397c.BOOLEAN, 0);
            BOOL = enumC13396b8;
            a aVar = new a("STRING", 8, EnumC13397c.STRING, 2);
            STRING = aVar;
            EnumC13397c enumC13397c3 = EnumC13397c.MESSAGE;
            b bVar = new b("GROUP", 9, enumC13397c3, 3);
            GROUP = bVar;
            c cVar = new c("MESSAGE", 10, enumC13397c3, 2);
            MESSAGE = cVar;
            d dVar = new d("BYTES", 11, EnumC13397c.BYTE_STRING, 2);
            BYTES = dVar;
            EnumC13396b enumC13396b9 = new EnumC13396b("UINT32", 12, enumC13397c2, 0);
            UINT32 = enumC13396b9;
            EnumC13396b enumC13396b10 = new EnumC13396b("ENUM", 13, EnumC13397c.ENUM, 0);
            ENUM = enumC13396b10;
            EnumC13396b enumC13396b11 = new EnumC13396b("SFIXED32", 14, enumC13397c2, 5);
            SFIXED32 = enumC13396b11;
            EnumC13396b enumC13396b12 = new EnumC13396b("SFIXED64", 15, enumC13397c, 1);
            SFIXED64 = enumC13396b12;
            EnumC13396b enumC13396b13 = new EnumC13396b("SINT32", 16, enumC13397c2, 0);
            SINT32 = enumC13396b13;
            EnumC13396b enumC13396b14 = new EnumC13396b("SINT64", 17, enumC13397c, 0);
            SINT64 = enumC13396b14;
            $VALUES = new EnumC13396b[]{enumC13396b, enumC13396b2, enumC13396b3, enumC13396b4, enumC13396b5, enumC13396b6, enumC13396b7, enumC13396b8, aVar, bVar, cVar, dVar, enumC13396b9, enumC13396b10, enumC13396b11, enumC13396b12, enumC13396b13, enumC13396b14};
        }

        public static EnumC13396b valueOf(String str) {
            return (EnumC13396b) Enum.valueOf(EnumC13396b.class, str);
        }

        public static EnumC13396b[] values() {
            return (EnumC13396b[]) $VALUES.clone();
        }

        public EnumC13397c getJavaType() {
            return this.javaType;
        }

        public int getWireType() {
            return this.wireType;
        }

        public boolean isPackable() {
            return true;
        }

        private EnumC13396b(String str, int i, EnumC13397c enumC13397c, int i2) {
            this.javaType = enumC13397c;
            this.wireType = i2;
        }
    }

    /* renamed from: o.fbj$c */
    public enum EnumC13397c {
        INT(0),
        LONG(0L),
        FLOAT(Float.valueOf(0.0f)),
        DOUBLE(Double.valueOf(FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE)),
        BOOLEAN(Boolean.FALSE),
        STRING(""),
        BYTE_STRING(xq1.f54049b),
        ENUM(null),
        MESSAGE(null);

        private final Object defaultDefault;

        EnumC13397c(Object obj) {
            this.defaultDefault = obj;
        }

        public Object getDefaultDefault() {
            return this.defaultDefault;
        }
    }

    /* renamed from: a */
    public static int m26425a(int i) {
        return i >>> 3;
    }

    /* renamed from: b */
    public static int m26426b(int i) {
        return i & 7;
    }

    /* renamed from: c */
    public static int m26427c(int i, int i2) {
        return (i << 3) | i2;
    }
}
