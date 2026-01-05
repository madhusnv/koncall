package com.google.crypto.tink.shaded.protobuf;

import java.lang.reflect.Field;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.List;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'DOUBLE' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: com.google.crypto.tink.shaded.protobuf.u */
/* loaded from: classes.dex */
public final class EnumC1394u {
    private static final /* synthetic */ EnumC1394u[] $VALUES;
    public static final EnumC1394u BOOL;
    public static final EnumC1394u BOOL_LIST;
    public static final EnumC1394u BOOL_LIST_PACKED;
    public static final EnumC1394u BYTES;
    public static final EnumC1394u BYTES_LIST;
    public static final EnumC1394u DOUBLE;
    public static final EnumC1394u DOUBLE_LIST;
    public static final EnumC1394u DOUBLE_LIST_PACKED;
    private static final Type[] EMPTY_TYPES;
    public static final EnumC1394u ENUM;
    public static final EnumC1394u ENUM_LIST;
    public static final EnumC1394u ENUM_LIST_PACKED;
    public static final EnumC1394u FIXED32;
    public static final EnumC1394u FIXED32_LIST;
    public static final EnumC1394u FIXED32_LIST_PACKED;
    public static final EnumC1394u FIXED64;
    public static final EnumC1394u FIXED64_LIST;
    public static final EnumC1394u FIXED64_LIST_PACKED;
    public static final EnumC1394u FLOAT;
    public static final EnumC1394u FLOAT_LIST;
    public static final EnumC1394u FLOAT_LIST_PACKED;
    public static final EnumC1394u GROUP;
    public static final EnumC1394u GROUP_LIST;
    public static final EnumC1394u INT32;
    public static final EnumC1394u INT32_LIST;
    public static final EnumC1394u INT32_LIST_PACKED;
    public static final EnumC1394u INT64;
    public static final EnumC1394u INT64_LIST;
    public static final EnumC1394u INT64_LIST_PACKED;
    public static final EnumC1394u MAP;
    public static final EnumC1394u MESSAGE;
    public static final EnumC1394u MESSAGE_LIST;
    public static final EnumC1394u SFIXED32;
    public static final EnumC1394u SFIXED32_LIST;
    public static final EnumC1394u SFIXED32_LIST_PACKED;
    public static final EnumC1394u SFIXED64;
    public static final EnumC1394u SFIXED64_LIST;
    public static final EnumC1394u SFIXED64_LIST_PACKED;
    public static final EnumC1394u SINT32;
    public static final EnumC1394u SINT32_LIST;
    public static final EnumC1394u SINT32_LIST_PACKED;
    public static final EnumC1394u SINT64;
    public static final EnumC1394u SINT64_LIST;
    public static final EnumC1394u SINT64_LIST_PACKED;
    public static final EnumC1394u STRING;
    public static final EnumC1394u STRING_LIST;
    public static final EnumC1394u UINT32;
    public static final EnumC1394u UINT32_LIST;
    public static final EnumC1394u UINT32_LIST_PACKED;
    public static final EnumC1394u UINT64;
    public static final EnumC1394u UINT64_LIST;
    public static final EnumC1394u UINT64_LIST_PACKED;
    private static final EnumC1394u[] VALUES;
    private final a collection;
    private final Class<?> elementType;

    /* renamed from: id, reason: collision with root package name */
    private final int f43914id;
    private final h0 javaType;
    private final boolean primitiveScalar;

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    /* renamed from: com.google.crypto.tink.shaded.protobuf.u$a */
    public enum a {
        SCALAR(false),
        VECTOR(true),
        PACKED_VECTOR(true),
        MAP(false);

        private final boolean isList;

        a(boolean z6) {
            this.isList = z6;
        }

        public boolean isList() {
            return this.isList;
        }
    }

    static {
        a aVar = a.SCALAR;
        h0 h0Var = h0.DOUBLE;
        EnumC1394u enumC1394u = new EnumC1394u("DOUBLE", 0, 0, aVar, h0Var);
        DOUBLE = enumC1394u;
        h0 h0Var2 = h0.FLOAT;
        EnumC1394u enumC1394u2 = new EnumC1394u("FLOAT", 1, 1, aVar, h0Var2);
        FLOAT = enumC1394u2;
        h0 h0Var3 = h0.LONG;
        EnumC1394u enumC1394u3 = new EnumC1394u("INT64", 2, 2, aVar, h0Var3);
        INT64 = enumC1394u3;
        EnumC1394u enumC1394u4 = new EnumC1394u("UINT64", 3, 3, aVar, h0Var3);
        UINT64 = enumC1394u4;
        h0 h0Var4 = h0.INT;
        EnumC1394u enumC1394u5 = new EnumC1394u("INT32", 4, 4, aVar, h0Var4);
        INT32 = enumC1394u5;
        EnumC1394u enumC1394u6 = new EnumC1394u("FIXED64", 5, 5, aVar, h0Var3);
        FIXED64 = enumC1394u6;
        EnumC1394u enumC1394u7 = new EnumC1394u("FIXED32", 6, 6, aVar, h0Var4);
        FIXED32 = enumC1394u7;
        h0 h0Var5 = h0.BOOLEAN;
        EnumC1394u enumC1394u8 = new EnumC1394u("BOOL", 7, 7, aVar, h0Var5);
        BOOL = enumC1394u8;
        h0 h0Var6 = h0.STRING;
        EnumC1394u enumC1394u9 = new EnumC1394u("STRING", 8, 8, aVar, h0Var6);
        STRING = enumC1394u9;
        h0 h0Var7 = h0.MESSAGE;
        EnumC1394u enumC1394u10 = new EnumC1394u("MESSAGE", 9, 9, aVar, h0Var7);
        MESSAGE = enumC1394u10;
        h0 h0Var8 = h0.BYTE_STRING;
        EnumC1394u enumC1394u11 = new EnumC1394u("BYTES", 10, 10, aVar, h0Var8);
        BYTES = enumC1394u11;
        EnumC1394u enumC1394u12 = new EnumC1394u("UINT32", 11, 11, aVar, h0Var4);
        UINT32 = enumC1394u12;
        h0 h0Var9 = h0.ENUM;
        EnumC1394u enumC1394u13 = new EnumC1394u("ENUM", 12, 12, aVar, h0Var9);
        ENUM = enumC1394u13;
        EnumC1394u enumC1394u14 = new EnumC1394u("SFIXED32", 13, 13, aVar, h0Var4);
        SFIXED32 = enumC1394u14;
        EnumC1394u enumC1394u15 = new EnumC1394u("SFIXED64", 14, 14, aVar, h0Var3);
        SFIXED64 = enumC1394u15;
        EnumC1394u enumC1394u16 = new EnumC1394u("SINT32", 15, 15, aVar, h0Var4);
        SINT32 = enumC1394u16;
        EnumC1394u enumC1394u17 = new EnumC1394u("SINT64", 16, 16, aVar, h0Var3);
        SINT64 = enumC1394u17;
        EnumC1394u enumC1394u18 = new EnumC1394u("GROUP", 17, 17, aVar, h0Var7);
        GROUP = enumC1394u18;
        a aVar2 = a.VECTOR;
        EnumC1394u enumC1394u19 = new EnumC1394u("DOUBLE_LIST", 18, 18, aVar2, h0Var);
        DOUBLE_LIST = enumC1394u19;
        EnumC1394u enumC1394u20 = new EnumC1394u("FLOAT_LIST", 19, 19, aVar2, h0Var2);
        FLOAT_LIST = enumC1394u20;
        EnumC1394u enumC1394u21 = new EnumC1394u("INT64_LIST", 20, 20, aVar2, h0Var3);
        INT64_LIST = enumC1394u21;
        EnumC1394u enumC1394u22 = new EnumC1394u("UINT64_LIST", 21, 21, aVar2, h0Var3);
        UINT64_LIST = enumC1394u22;
        EnumC1394u enumC1394u23 = new EnumC1394u("INT32_LIST", 22, 22, aVar2, h0Var4);
        INT32_LIST = enumC1394u23;
        EnumC1394u enumC1394u24 = new EnumC1394u("FIXED64_LIST", 23, 23, aVar2, h0Var3);
        FIXED64_LIST = enumC1394u24;
        EnumC1394u enumC1394u25 = new EnumC1394u("FIXED32_LIST", 24, 24, aVar2, h0Var4);
        FIXED32_LIST = enumC1394u25;
        EnumC1394u enumC1394u26 = new EnumC1394u("BOOL_LIST", 25, 25, aVar2, h0Var5);
        BOOL_LIST = enumC1394u26;
        EnumC1394u enumC1394u27 = new EnumC1394u("STRING_LIST", 26, 26, aVar2, h0Var6);
        STRING_LIST = enumC1394u27;
        EnumC1394u enumC1394u28 = new EnumC1394u("MESSAGE_LIST", 27, 27, aVar2, h0Var7);
        MESSAGE_LIST = enumC1394u28;
        EnumC1394u enumC1394u29 = new EnumC1394u("BYTES_LIST", 28, 28, aVar2, h0Var8);
        BYTES_LIST = enumC1394u29;
        EnumC1394u enumC1394u30 = new EnumC1394u("UINT32_LIST", 29, 29, aVar2, h0Var4);
        UINT32_LIST = enumC1394u30;
        EnumC1394u enumC1394u31 = new EnumC1394u("ENUM_LIST", 30, 30, aVar2, h0Var9);
        ENUM_LIST = enumC1394u31;
        EnumC1394u enumC1394u32 = new EnumC1394u("SFIXED32_LIST", 31, 31, aVar2, h0Var4);
        SFIXED32_LIST = enumC1394u32;
        EnumC1394u enumC1394u33 = new EnumC1394u("SFIXED64_LIST", 32, 32, aVar2, h0Var3);
        SFIXED64_LIST = enumC1394u33;
        EnumC1394u enumC1394u34 = new EnumC1394u("SINT32_LIST", 33, 33, aVar2, h0Var4);
        SINT32_LIST = enumC1394u34;
        EnumC1394u enumC1394u35 = new EnumC1394u("SINT64_LIST", 34, 34, aVar2, h0Var3);
        SINT64_LIST = enumC1394u35;
        a aVar3 = a.PACKED_VECTOR;
        EnumC1394u enumC1394u36 = new EnumC1394u("DOUBLE_LIST_PACKED", 35, 35, aVar3, h0Var);
        DOUBLE_LIST_PACKED = enumC1394u36;
        EnumC1394u enumC1394u37 = new EnumC1394u("FLOAT_LIST_PACKED", 36, 36, aVar3, h0Var2);
        FLOAT_LIST_PACKED = enumC1394u37;
        EnumC1394u enumC1394u38 = new EnumC1394u("INT64_LIST_PACKED", 37, 37, aVar3, h0Var3);
        INT64_LIST_PACKED = enumC1394u38;
        EnumC1394u enumC1394u39 = new EnumC1394u("UINT64_LIST_PACKED", 38, 38, aVar3, h0Var3);
        UINT64_LIST_PACKED = enumC1394u39;
        EnumC1394u enumC1394u40 = new EnumC1394u("INT32_LIST_PACKED", 39, 39, aVar3, h0Var4);
        INT32_LIST_PACKED = enumC1394u40;
        EnumC1394u enumC1394u41 = new EnumC1394u("FIXED64_LIST_PACKED", 40, 40, aVar3, h0Var3);
        FIXED64_LIST_PACKED = enumC1394u41;
        EnumC1394u enumC1394u42 = new EnumC1394u("FIXED32_LIST_PACKED", 41, 41, aVar3, h0Var4);
        FIXED32_LIST_PACKED = enumC1394u42;
        EnumC1394u enumC1394u43 = new EnumC1394u("BOOL_LIST_PACKED", 42, 42, aVar3, h0Var5);
        BOOL_LIST_PACKED = enumC1394u43;
        EnumC1394u enumC1394u44 = new EnumC1394u("UINT32_LIST_PACKED", 43, 43, aVar3, h0Var4);
        UINT32_LIST_PACKED = enumC1394u44;
        EnumC1394u enumC1394u45 = new EnumC1394u("ENUM_LIST_PACKED", 44, 44, aVar3, h0Var9);
        ENUM_LIST_PACKED = enumC1394u45;
        EnumC1394u enumC1394u46 = new EnumC1394u("SFIXED32_LIST_PACKED", 45, 45, aVar3, h0Var4);
        SFIXED32_LIST_PACKED = enumC1394u46;
        EnumC1394u enumC1394u47 = new EnumC1394u("SFIXED64_LIST_PACKED", 46, 46, aVar3, h0Var3);
        SFIXED64_LIST_PACKED = enumC1394u47;
        EnumC1394u enumC1394u48 = new EnumC1394u("SINT32_LIST_PACKED", 47, 47, aVar3, h0Var4);
        SINT32_LIST_PACKED = enumC1394u48;
        EnumC1394u enumC1394u49 = new EnumC1394u("SINT64_LIST_PACKED", 48, 48, aVar3, h0Var3);
        SINT64_LIST_PACKED = enumC1394u49;
        EnumC1394u enumC1394u50 = new EnumC1394u("GROUP_LIST", 49, 49, aVar2, h0Var7);
        GROUP_LIST = enumC1394u50;
        EnumC1394u enumC1394u51 = new EnumC1394u("MAP", 50, 50, a.MAP, h0.VOID);
        MAP = enumC1394u51;
        $VALUES = new EnumC1394u[]{enumC1394u, enumC1394u2, enumC1394u3, enumC1394u4, enumC1394u5, enumC1394u6, enumC1394u7, enumC1394u8, enumC1394u9, enumC1394u10, enumC1394u11, enumC1394u12, enumC1394u13, enumC1394u14, enumC1394u15, enumC1394u16, enumC1394u17, enumC1394u18, enumC1394u19, enumC1394u20, enumC1394u21, enumC1394u22, enumC1394u23, enumC1394u24, enumC1394u25, enumC1394u26, enumC1394u27, enumC1394u28, enumC1394u29, enumC1394u30, enumC1394u31, enumC1394u32, enumC1394u33, enumC1394u34, enumC1394u35, enumC1394u36, enumC1394u37, enumC1394u38, enumC1394u39, enumC1394u40, enumC1394u41, enumC1394u42, enumC1394u43, enumC1394u44, enumC1394u45, enumC1394u46, enumC1394u47, enumC1394u48, enumC1394u49, enumC1394u50, enumC1394u51};
        EMPTY_TYPES = new Type[0];
        EnumC1394u[] enumC1394uArrValues = values();
        VALUES = new EnumC1394u[enumC1394uArrValues.length];
        for (EnumC1394u enumC1394u52 : enumC1394uArrValues) {
            VALUES[enumC1394u52.f43914id] = enumC1394u52;
        }
    }

    private EnumC1394u(String str, int i10, int i11, a aVar, h0 h0Var) {
        int i12;
        this.f43914id = i11;
        this.collection = aVar;
        this.javaType = h0Var;
        int i13 = AbstractC1393t.f7103a[aVar.ordinal()];
        if (i13 == 1 || i13 == 2) {
            this.elementType = h0Var.getBoxedType();
        } else {
            this.elementType = null;
        }
        this.primitiveScalar = (aVar != a.SCALAR || (i12 = AbstractC1393t.f7104b[h0Var.ordinal()]) == 1 || i12 == 2 || i12 == 3) ? false : true;
    }

    public static EnumC1394u forId(int i10) {
        if (i10 < 0) {
            return null;
        }
        EnumC1394u[] enumC1394uArr = VALUES;
        if (i10 >= enumC1394uArr.length) {
            return null;
        }
        return enumC1394uArr[i10];
    }

    private static Type getGenericSuperList(Class<?> cls) {
        for (Type type : cls.getGenericInterfaces()) {
            if ((type instanceof ParameterizedType) && List.class.isAssignableFrom((Class) ((ParameterizedType) type).getRawType())) {
                return type;
            }
        }
        Type genericSuperclass = cls.getGenericSuperclass();
        if ((genericSuperclass instanceof ParameterizedType) && List.class.isAssignableFrom((Class) ((ParameterizedType) genericSuperclass).getRawType())) {
            return genericSuperclass;
        }
        return null;
    }

    private static Type getListParameter(Class<?> cls, Type[] typeArr) {
        while (true) {
            int i10 = 0;
            if (cls == List.class) {
                if (typeArr.length == 1) {
                    return typeArr[0];
                }
                throw new RuntimeException("Unable to identify parameter type for List<T>");
            }
            Type genericSuperList = getGenericSuperList(cls);
            if (!(genericSuperList instanceof ParameterizedType)) {
                typeArr = EMPTY_TYPES;
                Class<?>[] interfaces = cls.getInterfaces();
                int length = interfaces.length;
                while (true) {
                    if (i10 >= length) {
                        cls = cls.getSuperclass();
                        break;
                    }
                    Class<?> cls2 = interfaces[i10];
                    if (List.class.isAssignableFrom(cls2)) {
                        cls = cls2;
                        break;
                    }
                    i10++;
                }
            } else {
                ParameterizedType parameterizedType = (ParameterizedType) genericSuperList;
                Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
                for (int i11 = 0; i11 < actualTypeArguments.length; i11++) {
                    Type type = actualTypeArguments[i11];
                    if (type instanceof TypeVariable) {
                        TypeVariable<Class<?>>[] typeParameters = cls.getTypeParameters();
                        if (typeArr.length != typeParameters.length) {
                            throw new RuntimeException("Type array mismatch");
                        }
                        for (int i12 = 0; i12 < typeParameters.length; i12++) {
                            if (type == typeParameters[i12]) {
                                actualTypeArguments[i11] = typeArr[i12];
                            }
                        }
                        throw new RuntimeException("Unable to find replacement for " + type);
                    }
                }
                cls = (Class) parameterizedType.getRawType();
                typeArr = actualTypeArguments;
            }
        }
    }

    private boolean isValidForList(Field field) {
        Class<?> type = field.getType();
        if (!this.javaType.getType().isAssignableFrom(type)) {
            return false;
        }
        Type[] actualTypeArguments = EMPTY_TYPES;
        if (field.getGenericType() instanceof ParameterizedType) {
            actualTypeArguments = ((ParameterizedType) field.getGenericType()).getActualTypeArguments();
        }
        Type listParameter = getListParameter(type, actualTypeArguments);
        if (listParameter instanceof Class) {
            return this.elementType.isAssignableFrom((Class) listParameter);
        }
        return true;
    }

    public static EnumC1394u valueOf(String str) {
        return (EnumC1394u) Enum.valueOf(EnumC1394u.class, str);
    }

    public static EnumC1394u[] values() {
        return (EnumC1394u[]) $VALUES.clone();
    }

    public h0 getJavaType() {
        return this.javaType;
    }

    public int id() {
        return this.f43914id;
    }

    public boolean isList() {
        return this.collection.isList();
    }

    public boolean isMap() {
        return this.collection == a.MAP;
    }

    public boolean isPacked() {
        return a.PACKED_VECTOR.equals(this.collection);
    }

    public boolean isPrimitiveScalar() {
        return this.primitiveScalar;
    }

    public boolean isScalar() {
        return this.collection == a.SCALAR;
    }

    public boolean isValidForField(Field field) {
        return a.VECTOR.equals(this.collection) ? isValidForList(field) : this.javaType.getType().isAssignableFrom(field.getType());
    }
}
