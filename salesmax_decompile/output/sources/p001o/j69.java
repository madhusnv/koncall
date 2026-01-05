package p001o;

import com.google.firebase.remoteconfig.FirebaseRemoteConfig;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'INT' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: classes6.dex */
public final class j69 {
    private static final /* synthetic */ j69[] $VALUES;
    public static final j69 BOOLEAN;
    public static final j69 BYTE_STRING;
    public static final j69 DOUBLE;
    public static final j69 ENUM;
    public static final j69 FLOAT;
    public static final j69 INT;
    public static final j69 LONG;
    public static final j69 MESSAGE;
    public static final j69 STRING;
    public static final j69 VOID;
    private final Class<?> boxedType;
    private final Object defaultDefault;

    /* renamed from: type, reason: collision with root package name */
    private final Class<?> f58175type;

    static {
        j69 j69Var = new j69("VOID", 0, Void.class, Void.class, null);
        VOID = j69Var;
        Class cls = Integer.TYPE;
        j69 j69Var2 = new j69("INT", 1, cls, Integer.class, 0);
        INT = j69Var2;
        j69 j69Var3 = new j69("LONG", 2, Long.TYPE, Long.class, 0L);
        LONG = j69Var3;
        j69 j69Var4 = new j69("FLOAT", 3, Float.TYPE, Float.class, Float.valueOf(0.0f));
        FLOAT = j69Var4;
        j69 j69Var5 = new j69("DOUBLE", 4, Double.TYPE, Double.class, Double.valueOf(FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE));
        DOUBLE = j69Var5;
        j69 j69Var6 = new j69("BOOLEAN", 5, Boolean.TYPE, Boolean.class, Boolean.FALSE);
        BOOLEAN = j69Var6;
        j69 j69Var7 = new j69("STRING", 6, String.class, String.class, "");
        STRING = j69Var7;
        j69 j69Var8 = new j69("BYTE_STRING", 7, xq1.class, xq1.class, xq1.f54049b);
        BYTE_STRING = j69Var8;
        j69 j69Var9 = new j69("ENUM", 8, cls, Integer.class, null);
        ENUM = j69Var9;
        j69 j69Var10 = new j69("MESSAGE", 9, Object.class, Object.class, null);
        MESSAGE = j69Var10;
        $VALUES = new j69[]{j69Var, j69Var2, j69Var3, j69Var4, j69Var5, j69Var6, j69Var7, j69Var8, j69Var9, j69Var10};
    }

    private j69(String str, int i, Class cls, Class cls2, Object obj) {
        this.f58175type = cls;
        this.boxedType = cls2;
        this.defaultDefault = obj;
    }

    public static j69 valueOf(String str) {
        return (j69) Enum.valueOf(j69.class, str);
    }

    public static j69[] values() {
        return (j69[]) $VALUES.clone();
    }

    public Class<?> getBoxedType() {
        return this.boxedType;
    }

    public Object getDefaultDefault() {
        return this.defaultDefault;
    }

    public Class<?> getType() {
        return this.f58175type;
    }

    public boolean isValidType(Class<?> cls) {
        return this.f58175type.isAssignableFrom(cls);
    }
}
