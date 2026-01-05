package androidx.datastore.preferences.protobuf;

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
/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public class s1 {
    private static final /* synthetic */ s1[] $VALUES;
    public static final s1 BOOL;
    public static final s1 BYTES;
    public static final s1 DOUBLE;
    public static final s1 ENUM;
    public static final s1 FIXED32;
    public static final s1 FIXED64;
    public static final s1 FLOAT;
    public static final s1 GROUP;
    public static final s1 INT32;
    public static final s1 INT64;
    public static final s1 MESSAGE;
    public static final s1 SFIXED32;
    public static final s1 SFIXED64;
    public static final s1 SINT32;
    public static final s1 SINT64;
    public static final s1 STRING;
    public static final s1 UINT32;
    public static final s1 UINT64;
    private final t1 javaType;
    private final int wireType;

    static {
        s1 s1Var = new s1("DOUBLE", 0, t1.DOUBLE, 1);
        DOUBLE = s1Var;
        s1 s1Var2 = new s1("FLOAT", 1, t1.FLOAT, 5);
        FLOAT = s1Var2;
        t1 t1Var = t1.LONG;
        s1 s1Var3 = new s1("INT64", 2, t1Var, 0);
        INT64 = s1Var3;
        s1 s1Var4 = new s1("UINT64", 3, t1Var, 0);
        UINT64 = s1Var4;
        t1 t1Var2 = t1.INT;
        s1 s1Var5 = new s1("INT32", 4, t1Var2, 0);
        INT32 = s1Var5;
        s1 s1Var6 = new s1("FIXED64", 5, t1Var, 1);
        FIXED64 = s1Var6;
        s1 s1Var7 = new s1("FIXED32", 6, t1Var2, 5);
        FIXED32 = s1Var7;
        s1 s1Var8 = new s1("BOOL", 7, t1.BOOLEAN, 0);
        BOOL = s1Var8;
        s1 s1Var9 = new s1("STRING", 8, t1.STRING, 2) { // from class: androidx.datastore.preferences.protobuf.s1.a
            @Override // androidx.datastore.preferences.protobuf.s1
            public boolean isPackable() {
                return false;
            }
        };
        STRING = s1Var9;
        t1 t1Var3 = t1.MESSAGE;
        s1 s1Var10 = new s1("GROUP", 9, t1Var3, 3) { // from class: androidx.datastore.preferences.protobuf.s1.b
            @Override // androidx.datastore.preferences.protobuf.s1
            public boolean isPackable() {
                return false;
            }
        };
        GROUP = s1Var10;
        int i10 = 2;
        s1 s1Var11 = new s1("MESSAGE", 10, t1Var3, i10) { // from class: androidx.datastore.preferences.protobuf.s1.c
            @Override // androidx.datastore.preferences.protobuf.s1
            public boolean isPackable() {
                return false;
            }
        };
        MESSAGE = s1Var11;
        s1 s1Var12 = new s1("BYTES", 11, t1.BYTE_STRING, i10) { // from class: androidx.datastore.preferences.protobuf.s1.d
            @Override // androidx.datastore.preferences.protobuf.s1
            public boolean isPackable() {
                return false;
            }
        };
        BYTES = s1Var12;
        s1 s1Var13 = new s1("UINT32", 12, t1Var2, 0);
        UINT32 = s1Var13;
        s1 s1Var14 = new s1("ENUM", 13, t1.ENUM, 0);
        ENUM = s1Var14;
        s1 s1Var15 = new s1("SFIXED32", 14, t1Var2, 5);
        SFIXED32 = s1Var15;
        s1 s1Var16 = new s1("SFIXED64", 15, t1Var, 1);
        SFIXED64 = s1Var16;
        s1 s1Var17 = new s1("SINT32", 16, t1Var2, 0);
        SINT32 = s1Var17;
        s1 s1Var18 = new s1("SINT64", 17, t1Var, 0);
        SINT64 = s1Var18;
        $VALUES = new s1[]{s1Var, s1Var2, s1Var3, s1Var4, s1Var5, s1Var6, s1Var7, s1Var8, s1Var9, s1Var10, s1Var11, s1Var12, s1Var13, s1Var14, s1Var15, s1Var16, s1Var17, s1Var18};
    }

    public static s1 valueOf(String str) {
        return (s1) Enum.valueOf(s1.class, str);
    }

    public static s1[] values() {
        return (s1[]) $VALUES.clone();
    }

    public t1 getJavaType() {
        return this.javaType;
    }

    public int getWireType() {
        return this.wireType;
    }

    public boolean isPackable() {
        return true;
    }

    private s1(String str, int i10, t1 t1Var, int i11) {
        this.javaType = t1Var;
        this.wireType = i11;
    }
}
