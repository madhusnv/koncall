package p001o;

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
/* loaded from: classes4.dex */
public final class iu6 {
    private static final /* synthetic */ iu6[] $VALUES;
    public static final iu6 BOOL;
    public static final iu6 BOOL_LIST;
    public static final iu6 BOOL_LIST_PACKED;
    public static final iu6 BYTES;
    public static final iu6 BYTES_LIST;
    public static final iu6 DOUBLE;
    public static final iu6 DOUBLE_LIST;
    public static final iu6 DOUBLE_LIST_PACKED;
    private static final Type[] EMPTY_TYPES;
    public static final iu6 ENUM;
    public static final iu6 ENUM_LIST;
    public static final iu6 ENUM_LIST_PACKED;
    public static final iu6 FIXED32;
    public static final iu6 FIXED32_LIST;
    public static final iu6 FIXED32_LIST_PACKED;
    public static final iu6 FIXED64;
    public static final iu6 FIXED64_LIST;
    public static final iu6 FIXED64_LIST_PACKED;
    public static final iu6 FLOAT;
    public static final iu6 FLOAT_LIST;
    public static final iu6 FLOAT_LIST_PACKED;
    public static final iu6 GROUP;
    public static final iu6 GROUP_LIST;
    public static final iu6 INT32;
    public static final iu6 INT32_LIST;
    public static final iu6 INT32_LIST_PACKED;
    public static final iu6 INT64;
    public static final iu6 INT64_LIST;
    public static final iu6 INT64_LIST_PACKED;
    public static final iu6 MAP;
    public static final iu6 MESSAGE;
    public static final iu6 MESSAGE_LIST;
    public static final iu6 SFIXED32;
    public static final iu6 SFIXED32_LIST;
    public static final iu6 SFIXED32_LIST_PACKED;
    public static final iu6 SFIXED64;
    public static final iu6 SFIXED64_LIST;
    public static final iu6 SFIXED64_LIST_PACKED;
    public static final iu6 SINT32;
    public static final iu6 SINT32_LIST;
    public static final iu6 SINT32_LIST_PACKED;
    public static final iu6 SINT64;
    public static final iu6 SINT64_LIST;
    public static final iu6 SINT64_LIST_PACKED;
    public static final iu6 STRING;
    public static final iu6 STRING_LIST;
    public static final iu6 UINT32;
    public static final iu6 UINT32_LIST;
    public static final iu6 UINT32_LIST_PACKED;
    public static final iu6 UINT64;
    public static final iu6 UINT64_LIST;
    public static final iu6 UINT64_LIST_PACKED;
    private static final iu6[] VALUES;
    private final EnumC14372b collection;
    private final Class<?> elementType;
    private final int id;
    private final k69 javaType;
    private final boolean primitiveScalar;

    /* renamed from: o.iu6$a */
    public static /* synthetic */ class C14371a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f29233a;

        /* renamed from: b */
        public static final /* synthetic */ int[] f29234b;

        static {
            int[] iArr = new int[k69.values().length];
            f29234b = iArr;
            try {
                iArr[k69.BYTE_STRING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f29234b[k69.MESSAGE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f29234b[k69.STRING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[EnumC14372b.values().length];
            f29233a = iArr2;
            try {
                iArr2[EnumC14372b.MAP.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f29233a[EnumC14372b.VECTOR.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f29233a[EnumC14372b.SCALAR.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    /* renamed from: o.iu6$b */
    public enum EnumC14372b {
        SCALAR(false),
        VECTOR(true),
        PACKED_VECTOR(true),
        MAP(false);

        private final boolean isList;

        EnumC14372b(boolean z) {
            this.isList = z;
        }

        public boolean isList() {
            return this.isList;
        }
    }

    static {
        EnumC14372b enumC14372b = EnumC14372b.SCALAR;
        k69 k69Var = k69.DOUBLE;
        iu6 iu6Var = new iu6("DOUBLE", 0, 0, enumC14372b, k69Var);
        DOUBLE = iu6Var;
        k69 k69Var2 = k69.FLOAT;
        iu6 iu6Var2 = new iu6("FLOAT", 1, 1, enumC14372b, k69Var2);
        FLOAT = iu6Var2;
        k69 k69Var3 = k69.LONG;
        iu6 iu6Var3 = new iu6("INT64", 2, 2, enumC14372b, k69Var3);
        INT64 = iu6Var3;
        iu6 iu6Var4 = new iu6("UINT64", 3, 3, enumC14372b, k69Var3);
        UINT64 = iu6Var4;
        k69 k69Var4 = k69.INT;
        iu6 iu6Var5 = new iu6("INT32", 4, 4, enumC14372b, k69Var4);
        INT32 = iu6Var5;
        iu6 iu6Var6 = new iu6("FIXED64", 5, 5, enumC14372b, k69Var3);
        FIXED64 = iu6Var6;
        iu6 iu6Var7 = new iu6("FIXED32", 6, 6, enumC14372b, k69Var4);
        FIXED32 = iu6Var7;
        k69 k69Var5 = k69.BOOLEAN;
        iu6 iu6Var8 = new iu6("BOOL", 7, 7, enumC14372b, k69Var5);
        BOOL = iu6Var8;
        k69 k69Var6 = k69.STRING;
        iu6 iu6Var9 = new iu6("STRING", 8, 8, enumC14372b, k69Var6);
        STRING = iu6Var9;
        k69 k69Var7 = k69.MESSAGE;
        iu6 iu6Var10 = new iu6("MESSAGE", 9, 9, enumC14372b, k69Var7);
        MESSAGE = iu6Var10;
        k69 k69Var8 = k69.BYTE_STRING;
        iu6 iu6Var11 = new iu6("BYTES", 10, 10, enumC14372b, k69Var8);
        BYTES = iu6Var11;
        iu6 iu6Var12 = new iu6("UINT32", 11, 11, enumC14372b, k69Var4);
        UINT32 = iu6Var12;
        k69 k69Var9 = k69.ENUM;
        iu6 iu6Var13 = new iu6("ENUM", 12, 12, enumC14372b, k69Var9);
        ENUM = iu6Var13;
        iu6 iu6Var14 = new iu6("SFIXED32", 13, 13, enumC14372b, k69Var4);
        SFIXED32 = iu6Var14;
        iu6 iu6Var15 = new iu6("SFIXED64", 14, 14, enumC14372b, k69Var3);
        SFIXED64 = iu6Var15;
        iu6 iu6Var16 = new iu6("SINT32", 15, 15, enumC14372b, k69Var4);
        SINT32 = iu6Var16;
        iu6 iu6Var17 = new iu6("SINT64", 16, 16, enumC14372b, k69Var3);
        SINT64 = iu6Var17;
        iu6 iu6Var18 = new iu6("GROUP", 17, 17, enumC14372b, k69Var7);
        GROUP = iu6Var18;
        EnumC14372b enumC14372b2 = EnumC14372b.VECTOR;
        iu6 iu6Var19 = new iu6("DOUBLE_LIST", 18, 18, enumC14372b2, k69Var);
        DOUBLE_LIST = iu6Var19;
        iu6 iu6Var20 = new iu6("FLOAT_LIST", 19, 19, enumC14372b2, k69Var2);
        FLOAT_LIST = iu6Var20;
        iu6 iu6Var21 = new iu6("INT64_LIST", 20, 20, enumC14372b2, k69Var3);
        INT64_LIST = iu6Var21;
        iu6 iu6Var22 = new iu6("UINT64_LIST", 21, 21, enumC14372b2, k69Var3);
        UINT64_LIST = iu6Var22;
        iu6 iu6Var23 = new iu6("INT32_LIST", 22, 22, enumC14372b2, k69Var4);
        INT32_LIST = iu6Var23;
        iu6 iu6Var24 = new iu6("FIXED64_LIST", 23, 23, enumC14372b2, k69Var3);
        FIXED64_LIST = iu6Var24;
        iu6 iu6Var25 = new iu6("FIXED32_LIST", 24, 24, enumC14372b2, k69Var4);
        FIXED32_LIST = iu6Var25;
        iu6 iu6Var26 = new iu6("BOOL_LIST", 25, 25, enumC14372b2, k69Var5);
        BOOL_LIST = iu6Var26;
        iu6 iu6Var27 = new iu6("STRING_LIST", 26, 26, enumC14372b2, k69Var6);
        STRING_LIST = iu6Var27;
        iu6 iu6Var28 = new iu6("MESSAGE_LIST", 27, 27, enumC14372b2, k69Var7);
        MESSAGE_LIST = iu6Var28;
        iu6 iu6Var29 = new iu6("BYTES_LIST", 28, 28, enumC14372b2, k69Var8);
        BYTES_LIST = iu6Var29;
        iu6 iu6Var30 = new iu6("UINT32_LIST", 29, 29, enumC14372b2, k69Var4);
        UINT32_LIST = iu6Var30;
        iu6 iu6Var31 = new iu6("ENUM_LIST", 30, 30, enumC14372b2, k69Var9);
        ENUM_LIST = iu6Var31;
        iu6 iu6Var32 = new iu6("SFIXED32_LIST", 31, 31, enumC14372b2, k69Var4);
        SFIXED32_LIST = iu6Var32;
        iu6 iu6Var33 = new iu6("SFIXED64_LIST", 32, 32, enumC14372b2, k69Var3);
        SFIXED64_LIST = iu6Var33;
        iu6 iu6Var34 = new iu6("SINT32_LIST", 33, 33, enumC14372b2, k69Var4);
        SINT32_LIST = iu6Var34;
        iu6 iu6Var35 = new iu6("SINT64_LIST", 34, 34, enumC14372b2, k69Var3);
        SINT64_LIST = iu6Var35;
        EnumC14372b enumC14372b3 = EnumC14372b.PACKED_VECTOR;
        iu6 iu6Var36 = new iu6("DOUBLE_LIST_PACKED", 35, 35, enumC14372b3, k69Var);
        DOUBLE_LIST_PACKED = iu6Var36;
        iu6 iu6Var37 = new iu6("FLOAT_LIST_PACKED", 36, 36, enumC14372b3, k69Var2);
        FLOAT_LIST_PACKED = iu6Var37;
        iu6 iu6Var38 = new iu6("INT64_LIST_PACKED", 37, 37, enumC14372b3, k69Var3);
        INT64_LIST_PACKED = iu6Var38;
        iu6 iu6Var39 = new iu6("UINT64_LIST_PACKED", 38, 38, enumC14372b3, k69Var3);
        UINT64_LIST_PACKED = iu6Var39;
        iu6 iu6Var40 = new iu6("INT32_LIST_PACKED", 39, 39, enumC14372b3, k69Var4);
        INT32_LIST_PACKED = iu6Var40;
        iu6 iu6Var41 = new iu6("FIXED64_LIST_PACKED", 40, 40, enumC14372b3, k69Var3);
        FIXED64_LIST_PACKED = iu6Var41;
        iu6 iu6Var42 = new iu6("FIXED32_LIST_PACKED", 41, 41, enumC14372b3, k69Var4);
        FIXED32_LIST_PACKED = iu6Var42;
        iu6 iu6Var43 = new iu6("BOOL_LIST_PACKED", 42, 42, enumC14372b3, k69Var5);
        BOOL_LIST_PACKED = iu6Var43;
        iu6 iu6Var44 = new iu6("UINT32_LIST_PACKED", 43, 43, enumC14372b3, k69Var4);
        UINT32_LIST_PACKED = iu6Var44;
        iu6 iu6Var45 = new iu6("ENUM_LIST_PACKED", 44, 44, enumC14372b3, k69Var9);
        ENUM_LIST_PACKED = iu6Var45;
        iu6 iu6Var46 = new iu6("SFIXED32_LIST_PACKED", 45, 45, enumC14372b3, k69Var4);
        SFIXED32_LIST_PACKED = iu6Var46;
        iu6 iu6Var47 = new iu6("SFIXED64_LIST_PACKED", 46, 46, enumC14372b3, k69Var3);
        SFIXED64_LIST_PACKED = iu6Var47;
        iu6 iu6Var48 = new iu6("SINT32_LIST_PACKED", 47, 47, enumC14372b3, k69Var4);
        SINT32_LIST_PACKED = iu6Var48;
        iu6 iu6Var49 = new iu6("SINT64_LIST_PACKED", 48, 48, enumC14372b3, k69Var3);
        SINT64_LIST_PACKED = iu6Var49;
        iu6 iu6Var50 = new iu6("GROUP_LIST", 49, 49, enumC14372b2, k69Var7);
        GROUP_LIST = iu6Var50;
        iu6 iu6Var51 = new iu6("MAP", 50, 50, EnumC14372b.MAP, k69.VOID);
        MAP = iu6Var51;
        $VALUES = new iu6[]{iu6Var, iu6Var2, iu6Var3, iu6Var4, iu6Var5, iu6Var6, iu6Var7, iu6Var8, iu6Var9, iu6Var10, iu6Var11, iu6Var12, iu6Var13, iu6Var14, iu6Var15, iu6Var16, iu6Var17, iu6Var18, iu6Var19, iu6Var20, iu6Var21, iu6Var22, iu6Var23, iu6Var24, iu6Var25, iu6Var26, iu6Var27, iu6Var28, iu6Var29, iu6Var30, iu6Var31, iu6Var32, iu6Var33, iu6Var34, iu6Var35, iu6Var36, iu6Var37, iu6Var38, iu6Var39, iu6Var40, iu6Var41, iu6Var42, iu6Var43, iu6Var44, iu6Var45, iu6Var46, iu6Var47, iu6Var48, iu6Var49, iu6Var50, iu6Var51};
        EMPTY_TYPES = new Type[0];
        iu6[] iu6VarArrValues = values();
        VALUES = new iu6[iu6VarArrValues.length];
        for (iu6 iu6Var52 : iu6VarArrValues) {
            VALUES[iu6Var52.id] = iu6Var52;
        }
    }

    private iu6(String str, int i, int i2, EnumC14372b enumC14372b, k69 k69Var) {
        int i3;
        this.id = i2;
        this.collection = enumC14372b;
        this.javaType = k69Var;
        int i4 = C14371a.f29233a[enumC14372b.ordinal()];
        if (i4 == 1 || i4 == 2) {
            this.elementType = k69Var.getBoxedType();
        } else {
            this.elementType = null;
        }
        this.primitiveScalar = (enumC14372b != EnumC14372b.SCALAR || (i3 = C14371a.f29234b[k69Var.ordinal()]) == 1 || i3 == 2 || i3 == 3) ? false : true;
    }

    public static iu6 forId(int i) {
        if (i < 0) {
            return null;
        }
        iu6[] iu6VarArr = VALUES;
        if (i >= iu6VarArr.length) {
            return null;
        }
        return iu6VarArr[i];
    }

    private static Type getGenericSuperList(Class<?> cls) {
        for (Type type2 : cls.getGenericInterfaces()) {
            if ((type2 instanceof ParameterizedType) && List.class.isAssignableFrom((Class) ((ParameterizedType) type2).getRawType())) {
                return type2;
            }
        }
        Type genericSuperclass = cls.getGenericSuperclass();
        if ((genericSuperclass instanceof ParameterizedType) && List.class.isAssignableFrom((Class) ((ParameterizedType) genericSuperclass).getRawType())) {
            return genericSuperclass;
        }
        return null;
    }

    private static Type getListParameter(Class<?> cls, Type[] typeArr) {
        boolean z;
        while (true) {
            int i = 0;
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
                    if (i >= length) {
                        cls = cls.getSuperclass();
                        break;
                    }
                    Class<?> cls2 = interfaces[i];
                    if (List.class.isAssignableFrom(cls2)) {
                        cls = cls2;
                        break;
                    }
                    i++;
                }
            } else {
                ParameterizedType parameterizedType = (ParameterizedType) genericSuperList;
                Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
                for (int i2 = 0; i2 < actualTypeArguments.length; i2++) {
                    Type type2 = actualTypeArguments[i2];
                    if (type2 instanceof TypeVariable) {
                        TypeVariable<Class<?>>[] typeParameters = cls.getTypeParameters();
                        if (typeArr.length != typeParameters.length) {
                            throw new RuntimeException("Type array mismatch");
                        }
                        int i3 = 0;
                        while (true) {
                            if (i3 >= typeParameters.length) {
                                z = false;
                                break;
                            }
                            if (type2 == typeParameters[i3]) {
                                actualTypeArguments[i2] = typeArr[i3];
                                z = true;
                                break;
                            }
                            i3++;
                        }
                        if (!z) {
                            throw new RuntimeException("Unable to find replacement for " + type2);
                        }
                    }
                }
                cls = (Class) parameterizedType.getRawType();
                typeArr = actualTypeArguments;
            }
        }
    }

    private boolean isValidForList(Field field) {
        Class<?> type2 = field.getType();
        if (!this.javaType.getType().isAssignableFrom(type2)) {
            return false;
        }
        Type[] actualTypeArguments = EMPTY_TYPES;
        if (field.getGenericType() instanceof ParameterizedType) {
            actualTypeArguments = ((ParameterizedType) field.getGenericType()).getActualTypeArguments();
        }
        Type listParameter = getListParameter(type2, actualTypeArguments);
        if (listParameter instanceof Class) {
            return this.elementType.isAssignableFrom((Class) listParameter);
        }
        return true;
    }

    public static iu6 valueOf(String str) {
        return (iu6) Enum.valueOf(iu6.class, str);
    }

    public static iu6[] values() {
        return (iu6[]) $VALUES.clone();
    }

    public k69 getJavaType() {
        return this.javaType;
    }

    public int id() {
        return this.id;
    }

    public boolean isList() {
        return this.collection.isList();
    }

    public boolean isMap() {
        return this.collection == EnumC14372b.MAP;
    }

    public boolean isPacked() {
        return EnumC14372b.PACKED_VECTOR.equals(this.collection);
    }

    public boolean isPrimitiveScalar() {
        return this.primitiveScalar;
    }

    public boolean isScalar() {
        return this.collection == EnumC14372b.SCALAR;
    }

    public boolean isValidForField(Field field) {
        return EnumC14372b.VECTOR.equals(this.collection) ? isValidForList(field) : this.javaType.getType().isAssignableFrom(field.getType());
    }
}
