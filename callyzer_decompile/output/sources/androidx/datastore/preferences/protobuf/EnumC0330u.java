package androidx.datastore.preferences.protobuf;

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
/* renamed from: androidx.datastore.preferences.protobuf.u */
/* loaded from: classes.dex */
public final class EnumC0330u {
    private static final /* synthetic */ EnumC0330u[] $VALUES;
    public static final EnumC0330u BOOL;
    public static final EnumC0330u BOOL_LIST;
    public static final EnumC0330u BOOL_LIST_PACKED;
    public static final EnumC0330u BYTES;
    public static final EnumC0330u BYTES_LIST;
    public static final EnumC0330u DOUBLE;
    public static final EnumC0330u DOUBLE_LIST;
    public static final EnumC0330u DOUBLE_LIST_PACKED;
    private static final Type[] EMPTY_TYPES;
    public static final EnumC0330u ENUM;
    public static final EnumC0330u ENUM_LIST;
    public static final EnumC0330u ENUM_LIST_PACKED;
    public static final EnumC0330u FIXED32;
    public static final EnumC0330u FIXED32_LIST;
    public static final EnumC0330u FIXED32_LIST_PACKED;
    public static final EnumC0330u FIXED64;
    public static final EnumC0330u FIXED64_LIST;
    public static final EnumC0330u FIXED64_LIST_PACKED;
    public static final EnumC0330u FLOAT;
    public static final EnumC0330u FLOAT_LIST;
    public static final EnumC0330u FLOAT_LIST_PACKED;
    public static final EnumC0330u GROUP;
    public static final EnumC0330u GROUP_LIST;
    public static final EnumC0330u INT32;
    public static final EnumC0330u INT32_LIST;
    public static final EnumC0330u INT32_LIST_PACKED;
    public static final EnumC0330u INT64;
    public static final EnumC0330u INT64_LIST;
    public static final EnumC0330u INT64_LIST_PACKED;
    public static final EnumC0330u MAP;
    public static final EnumC0330u MESSAGE;
    public static final EnumC0330u MESSAGE_LIST;
    public static final EnumC0330u SFIXED32;
    public static final EnumC0330u SFIXED32_LIST;
    public static final EnumC0330u SFIXED32_LIST_PACKED;
    public static final EnumC0330u SFIXED64;
    public static final EnumC0330u SFIXED64_LIST;
    public static final EnumC0330u SFIXED64_LIST_PACKED;
    public static final EnumC0330u SINT32;
    public static final EnumC0330u SINT32_LIST;
    public static final EnumC0330u SINT32_LIST_PACKED;
    public static final EnumC0330u SINT64;
    public static final EnumC0330u SINT64_LIST;
    public static final EnumC0330u SINT64_LIST_PACKED;
    public static final EnumC0330u STRING;
    public static final EnumC0330u STRING_LIST;
    public static final EnumC0330u UINT32;
    public static final EnumC0330u UINT32_LIST;
    public static final EnumC0330u UINT32_LIST_PACKED;
    public static final EnumC0330u UINT64;
    public static final EnumC0330u UINT64_LIST;
    public static final EnumC0330u UINT64_LIST_PACKED;
    private static final EnumC0330u[] VALUES;
    private final a collection;
    private final Class<?> elementType;

    /* renamed from: id, reason: collision with root package name */
    private final int f43687id;
    private final c0 javaType;
    private final boolean primitiveScalar;

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    /* renamed from: androidx.datastore.preferences.protobuf.u$a */
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
        c0 c0Var = c0.DOUBLE;
        EnumC0330u enumC0330u = new EnumC0330u("DOUBLE", 0, 0, aVar, c0Var);
        DOUBLE = enumC0330u;
        c0 c0Var2 = c0.FLOAT;
        EnumC0330u enumC0330u2 = new EnumC0330u("FLOAT", 1, 1, aVar, c0Var2);
        FLOAT = enumC0330u2;
        c0 c0Var3 = c0.LONG;
        EnumC0330u enumC0330u3 = new EnumC0330u("INT64", 2, 2, aVar, c0Var3);
        INT64 = enumC0330u3;
        EnumC0330u enumC0330u4 = new EnumC0330u("UINT64", 3, 3, aVar, c0Var3);
        UINT64 = enumC0330u4;
        c0 c0Var4 = c0.INT;
        EnumC0330u enumC0330u5 = new EnumC0330u("INT32", 4, 4, aVar, c0Var4);
        INT32 = enumC0330u5;
        EnumC0330u enumC0330u6 = new EnumC0330u("FIXED64", 5, 5, aVar, c0Var3);
        FIXED64 = enumC0330u6;
        EnumC0330u enumC0330u7 = new EnumC0330u("FIXED32", 6, 6, aVar, c0Var4);
        FIXED32 = enumC0330u7;
        c0 c0Var5 = c0.BOOLEAN;
        EnumC0330u enumC0330u8 = new EnumC0330u("BOOL", 7, 7, aVar, c0Var5);
        BOOL = enumC0330u8;
        c0 c0Var6 = c0.STRING;
        EnumC0330u enumC0330u9 = new EnumC0330u("STRING", 8, 8, aVar, c0Var6);
        STRING = enumC0330u9;
        c0 c0Var7 = c0.MESSAGE;
        EnumC0330u enumC0330u10 = new EnumC0330u("MESSAGE", 9, 9, aVar, c0Var7);
        MESSAGE = enumC0330u10;
        c0 c0Var8 = c0.BYTE_STRING;
        EnumC0330u enumC0330u11 = new EnumC0330u("BYTES", 10, 10, aVar, c0Var8);
        BYTES = enumC0330u11;
        EnumC0330u enumC0330u12 = new EnumC0330u("UINT32", 11, 11, aVar, c0Var4);
        UINT32 = enumC0330u12;
        c0 c0Var9 = c0.ENUM;
        EnumC0330u enumC0330u13 = new EnumC0330u("ENUM", 12, 12, aVar, c0Var9);
        ENUM = enumC0330u13;
        EnumC0330u enumC0330u14 = new EnumC0330u("SFIXED32", 13, 13, aVar, c0Var4);
        SFIXED32 = enumC0330u14;
        EnumC0330u enumC0330u15 = new EnumC0330u("SFIXED64", 14, 14, aVar, c0Var3);
        SFIXED64 = enumC0330u15;
        EnumC0330u enumC0330u16 = new EnumC0330u("SINT32", 15, 15, aVar, c0Var4);
        SINT32 = enumC0330u16;
        EnumC0330u enumC0330u17 = new EnumC0330u("SINT64", 16, 16, aVar, c0Var3);
        SINT64 = enumC0330u17;
        EnumC0330u enumC0330u18 = new EnumC0330u("GROUP", 17, 17, aVar, c0Var7);
        GROUP = enumC0330u18;
        a aVar2 = a.VECTOR;
        EnumC0330u enumC0330u19 = new EnumC0330u("DOUBLE_LIST", 18, 18, aVar2, c0Var);
        DOUBLE_LIST = enumC0330u19;
        EnumC0330u enumC0330u20 = new EnumC0330u("FLOAT_LIST", 19, 19, aVar2, c0Var2);
        FLOAT_LIST = enumC0330u20;
        EnumC0330u enumC0330u21 = new EnumC0330u("INT64_LIST", 20, 20, aVar2, c0Var3);
        INT64_LIST = enumC0330u21;
        EnumC0330u enumC0330u22 = new EnumC0330u("UINT64_LIST", 21, 21, aVar2, c0Var3);
        UINT64_LIST = enumC0330u22;
        EnumC0330u enumC0330u23 = new EnumC0330u("INT32_LIST", 22, 22, aVar2, c0Var4);
        INT32_LIST = enumC0330u23;
        EnumC0330u enumC0330u24 = new EnumC0330u("FIXED64_LIST", 23, 23, aVar2, c0Var3);
        FIXED64_LIST = enumC0330u24;
        EnumC0330u enumC0330u25 = new EnumC0330u("FIXED32_LIST", 24, 24, aVar2, c0Var4);
        FIXED32_LIST = enumC0330u25;
        EnumC0330u enumC0330u26 = new EnumC0330u("BOOL_LIST", 25, 25, aVar2, c0Var5);
        BOOL_LIST = enumC0330u26;
        EnumC0330u enumC0330u27 = new EnumC0330u("STRING_LIST", 26, 26, aVar2, c0Var6);
        STRING_LIST = enumC0330u27;
        EnumC0330u enumC0330u28 = new EnumC0330u("MESSAGE_LIST", 27, 27, aVar2, c0Var7);
        MESSAGE_LIST = enumC0330u28;
        EnumC0330u enumC0330u29 = new EnumC0330u("BYTES_LIST", 28, 28, aVar2, c0Var8);
        BYTES_LIST = enumC0330u29;
        EnumC0330u enumC0330u30 = new EnumC0330u("UINT32_LIST", 29, 29, aVar2, c0Var4);
        UINT32_LIST = enumC0330u30;
        EnumC0330u enumC0330u31 = new EnumC0330u("ENUM_LIST", 30, 30, aVar2, c0Var9);
        ENUM_LIST = enumC0330u31;
        EnumC0330u enumC0330u32 = new EnumC0330u("SFIXED32_LIST", 31, 31, aVar2, c0Var4);
        SFIXED32_LIST = enumC0330u32;
        EnumC0330u enumC0330u33 = new EnumC0330u("SFIXED64_LIST", 32, 32, aVar2, c0Var3);
        SFIXED64_LIST = enumC0330u33;
        EnumC0330u enumC0330u34 = new EnumC0330u("SINT32_LIST", 33, 33, aVar2, c0Var4);
        SINT32_LIST = enumC0330u34;
        EnumC0330u enumC0330u35 = new EnumC0330u("SINT64_LIST", 34, 34, aVar2, c0Var3);
        SINT64_LIST = enumC0330u35;
        a aVar3 = a.PACKED_VECTOR;
        EnumC0330u enumC0330u36 = new EnumC0330u("DOUBLE_LIST_PACKED", 35, 35, aVar3, c0Var);
        DOUBLE_LIST_PACKED = enumC0330u36;
        EnumC0330u enumC0330u37 = new EnumC0330u("FLOAT_LIST_PACKED", 36, 36, aVar3, c0Var2);
        FLOAT_LIST_PACKED = enumC0330u37;
        EnumC0330u enumC0330u38 = new EnumC0330u("INT64_LIST_PACKED", 37, 37, aVar3, c0Var3);
        INT64_LIST_PACKED = enumC0330u38;
        EnumC0330u enumC0330u39 = new EnumC0330u("UINT64_LIST_PACKED", 38, 38, aVar3, c0Var3);
        UINT64_LIST_PACKED = enumC0330u39;
        EnumC0330u enumC0330u40 = new EnumC0330u("INT32_LIST_PACKED", 39, 39, aVar3, c0Var4);
        INT32_LIST_PACKED = enumC0330u40;
        EnumC0330u enumC0330u41 = new EnumC0330u("FIXED64_LIST_PACKED", 40, 40, aVar3, c0Var3);
        FIXED64_LIST_PACKED = enumC0330u41;
        EnumC0330u enumC0330u42 = new EnumC0330u("FIXED32_LIST_PACKED", 41, 41, aVar3, c0Var4);
        FIXED32_LIST_PACKED = enumC0330u42;
        EnumC0330u enumC0330u43 = new EnumC0330u("BOOL_LIST_PACKED", 42, 42, aVar3, c0Var5);
        BOOL_LIST_PACKED = enumC0330u43;
        EnumC0330u enumC0330u44 = new EnumC0330u("UINT32_LIST_PACKED", 43, 43, aVar3, c0Var4);
        UINT32_LIST_PACKED = enumC0330u44;
        EnumC0330u enumC0330u45 = new EnumC0330u("ENUM_LIST_PACKED", 44, 44, aVar3, c0Var9);
        ENUM_LIST_PACKED = enumC0330u45;
        EnumC0330u enumC0330u46 = new EnumC0330u("SFIXED32_LIST_PACKED", 45, 45, aVar3, c0Var4);
        SFIXED32_LIST_PACKED = enumC0330u46;
        EnumC0330u enumC0330u47 = new EnumC0330u("SFIXED64_LIST_PACKED", 46, 46, aVar3, c0Var3);
        SFIXED64_LIST_PACKED = enumC0330u47;
        EnumC0330u enumC0330u48 = new EnumC0330u("SINT32_LIST_PACKED", 47, 47, aVar3, c0Var4);
        SINT32_LIST_PACKED = enumC0330u48;
        EnumC0330u enumC0330u49 = new EnumC0330u("SINT64_LIST_PACKED", 48, 48, aVar3, c0Var3);
        SINT64_LIST_PACKED = enumC0330u49;
        EnumC0330u enumC0330u50 = new EnumC0330u("GROUP_LIST", 49, 49, aVar2, c0Var7);
        GROUP_LIST = enumC0330u50;
        EnumC0330u enumC0330u51 = new EnumC0330u("MAP", 50, 50, a.MAP, c0.VOID);
        MAP = enumC0330u51;
        $VALUES = new EnumC0330u[]{enumC0330u, enumC0330u2, enumC0330u3, enumC0330u4, enumC0330u5, enumC0330u6, enumC0330u7, enumC0330u8, enumC0330u9, enumC0330u10, enumC0330u11, enumC0330u12, enumC0330u13, enumC0330u14, enumC0330u15, enumC0330u16, enumC0330u17, enumC0330u18, enumC0330u19, enumC0330u20, enumC0330u21, enumC0330u22, enumC0330u23, enumC0330u24, enumC0330u25, enumC0330u26, enumC0330u27, enumC0330u28, enumC0330u29, enumC0330u30, enumC0330u31, enumC0330u32, enumC0330u33, enumC0330u34, enumC0330u35, enumC0330u36, enumC0330u37, enumC0330u38, enumC0330u39, enumC0330u40, enumC0330u41, enumC0330u42, enumC0330u43, enumC0330u44, enumC0330u45, enumC0330u46, enumC0330u47, enumC0330u48, enumC0330u49, enumC0330u50, enumC0330u51};
        EMPTY_TYPES = new Type[0];
        EnumC0330u[] enumC0330uArrValues = values();
        VALUES = new EnumC0330u[enumC0330uArrValues.length];
        for (EnumC0330u enumC0330u52 : enumC0330uArrValues) {
            VALUES[enumC0330u52.f43687id] = enumC0330u52;
        }
    }

    private EnumC0330u(String str, int i10, int i11, a aVar, c0 c0Var) {
        int i12;
        this.f43687id = i11;
        this.collection = aVar;
        this.javaType = c0Var;
        int i13 = AbstractC0329t.f2416a[aVar.ordinal()];
        if (i13 == 1 || i13 == 2) {
            this.elementType = c0Var.getBoxedType();
        } else {
            this.elementType = null;
        }
        this.primitiveScalar = (aVar != a.SCALAR || (i12 = AbstractC0329t.f2417b[c0Var.ordinal()]) == 1 || i12 == 2 || i12 == 3) ? false : true;
    }

    public static EnumC0330u forId(int i10) {
        if (i10 < 0) {
            return null;
        }
        EnumC0330u[] enumC0330uArr = VALUES;
        if (i10 >= enumC0330uArr.length) {
            return null;
        }
        return enumC0330uArr[i10];
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

    public static EnumC0330u valueOf(String str) {
        return (EnumC0330u) Enum.valueOf(EnumC0330u.class, str);
    }

    public static EnumC0330u[] values() {
        return (EnumC0330u[]) $VALUES.clone();
    }

    public c0 getJavaType() {
        return this.javaType;
    }

    public int id() {
        return this.f43687id;
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
