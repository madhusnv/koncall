package com.google.crypto.tink.shaded.protobuf;

import com.skydoves.balloon.internals.DefinitionKt;

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
/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class h0 {
    private static final /* synthetic */ h0[] $VALUES;
    public static final h0 BOOLEAN;
    public static final h0 BYTE_STRING;
    public static final h0 DOUBLE;
    public static final h0 ENUM;
    public static final h0 FLOAT;
    public static final h0 INT;
    public static final h0 LONG;
    public static final h0 MESSAGE;
    public static final h0 STRING;
    public static final h0 VOID;
    private final Class<?> boxedType;
    private final Object defaultDefault;
    private final Class<?> type;

    static {
        h0 h0Var = new h0("VOID", 0, Void.class, Void.class, null);
        VOID = h0Var;
        Class cls = Integer.TYPE;
        h0 h0Var2 = new h0("INT", 1, cls, Integer.class, 0);
        INT = h0Var2;
        h0 h0Var3 = new h0("LONG", 2, Long.TYPE, Long.class, 0L);
        LONG = h0Var3;
        h0 h0Var4 = new h0("FLOAT", 3, Float.TYPE, Float.class, Float.valueOf(DefinitionKt.NO_Float_VALUE));
        FLOAT = h0Var4;
        h0 h0Var5 = new h0("DOUBLE", 4, Double.TYPE, Double.class, Double.valueOf(0.0d));
        DOUBLE = h0Var5;
        h0 h0Var6 = new h0("BOOLEAN", 5, Boolean.TYPE, Boolean.class, Boolean.FALSE);
        BOOLEAN = h0Var6;
        h0 h0Var7 = new h0("STRING", 6, String.class, String.class, "");
        STRING = h0Var7;
        h0 h0Var8 = new h0("BYTE_STRING", 7, AbstractC1382i.class, AbstractC1382i.class, AbstractC1382i.f7044b);
        BYTE_STRING = h0Var8;
        h0 h0Var9 = new h0("ENUM", 8, cls, Integer.class, null);
        ENUM = h0Var9;
        h0 h0Var10 = new h0("MESSAGE", 9, Object.class, Object.class, null);
        MESSAGE = h0Var10;
        $VALUES = new h0[]{h0Var, h0Var2, h0Var3, h0Var4, h0Var5, h0Var6, h0Var7, h0Var8, h0Var9, h0Var10};
    }

    private h0(String str, int i10, Class cls, Class cls2, Object obj) {
        this.type = cls;
        this.boxedType = cls2;
        this.defaultDefault = obj;
    }

    public static h0 valueOf(String str) {
        return (h0) Enum.valueOf(h0.class, str);
    }

    public static h0[] values() {
        return (h0[]) $VALUES.clone();
    }

    public Class<?> getBoxedType() {
        return this.boxedType;
    }

    public Object getDefaultDefault() {
        return this.defaultDefault;
    }

    public Class<?> getType() {
        return this.type;
    }

    public boolean isValidType(Class<?> cls) {
        return this.type.isAssignableFrom(cls);
    }
}
