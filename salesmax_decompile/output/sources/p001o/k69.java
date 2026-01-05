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
/* loaded from: classes4.dex */
public final class k69 {
    private static final /* synthetic */ k69[] $VALUES;
    public static final k69 BOOLEAN;
    public static final k69 BYTE_STRING;
    public static final k69 DOUBLE;
    public static final k69 ENUM;
    public static final k69 FLOAT;
    public static final k69 INT;
    public static final k69 LONG;
    public static final k69 MESSAGE;
    public static final k69 STRING;
    public static final k69 VOID;
    private final Class<?> boxedType;
    private final Object defaultDefault;

    /* renamed from: type, reason: collision with root package name */
    private final Class<?> f58176type;

    static {
        k69 k69Var = new k69("VOID", 0, Void.class, Void.class, null);
        VOID = k69Var;
        Class cls = Integer.TYPE;
        k69 k69Var2 = new k69("INT", 1, cls, Integer.class, 0);
        INT = k69Var2;
        k69 k69Var3 = new k69("LONG", 2, Long.TYPE, Long.class, 0L);
        LONG = k69Var3;
        k69 k69Var4 = new k69("FLOAT", 3, Float.TYPE, Float.class, Float.valueOf(0.0f));
        FLOAT = k69Var4;
        k69 k69Var5 = new k69("DOUBLE", 4, Double.TYPE, Double.class, Double.valueOf(FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE));
        DOUBLE = k69Var5;
        k69 k69Var6 = new k69("BOOLEAN", 5, Boolean.TYPE, Boolean.class, Boolean.FALSE);
        BOOLEAN = k69Var6;
        k69 k69Var7 = new k69("STRING", 6, String.class, String.class, "");
        STRING = k69Var7;
        k69 k69Var8 = new k69("BYTE_STRING", 7, yq1.class, yq1.class, yq1.f55802b);
        BYTE_STRING = k69Var8;
        k69 k69Var9 = new k69("ENUM", 8, cls, Integer.class, null);
        ENUM = k69Var9;
        k69 k69Var10 = new k69("MESSAGE", 9, Object.class, Object.class, null);
        MESSAGE = k69Var10;
        $VALUES = new k69[]{k69Var, k69Var2, k69Var3, k69Var4, k69Var5, k69Var6, k69Var7, k69Var8, k69Var9, k69Var10};
    }

    private k69(String str, int i, Class cls, Class cls2, Object obj) {
        this.f58176type = cls;
        this.boxedType = cls2;
        this.defaultDefault = obj;
    }

    public static k69 valueOf(String str) {
        return (k69) Enum.valueOf(k69.class, str);
    }

    public static k69[] values() {
        return (k69[]) $VALUES.clone();
    }

    public Class<?> getBoxedType() {
        return this.boxedType;
    }

    public Object getDefaultDefault() {
        return this.defaultDefault;
    }

    public Class<?> getType() {
        return this.f58176type;
    }

    public boolean isValidType(Class<?> cls) {
        return this.f58176type.isAssignableFrom(cls);
    }
}
