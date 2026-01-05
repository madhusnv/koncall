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
/* loaded from: classes6.dex */
public final class ju6 {
    private static final /* synthetic */ ju6[] $VALUES;
    public static final ju6 BOOL;
    public static final ju6 BOOL_LIST;
    public static final ju6 BOOL_LIST_PACKED;
    public static final ju6 BYTES;
    public static final ju6 BYTES_LIST;
    public static final ju6 DOUBLE;
    public static final ju6 DOUBLE_LIST;
    public static final ju6 DOUBLE_LIST_PACKED;
    private static final Type[] EMPTY_TYPES;
    public static final ju6 ENUM;
    public static final ju6 ENUM_LIST;
    public static final ju6 ENUM_LIST_PACKED;
    public static final ju6 FIXED32;
    public static final ju6 FIXED32_LIST;
    public static final ju6 FIXED32_LIST_PACKED;
    public static final ju6 FIXED64;
    public static final ju6 FIXED64_LIST;
    public static final ju6 FIXED64_LIST_PACKED;
    public static final ju6 FLOAT;
    public static final ju6 FLOAT_LIST;
    public static final ju6 FLOAT_LIST_PACKED;
    public static final ju6 GROUP;
    public static final ju6 GROUP_LIST;
    public static final ju6 INT32;
    public static final ju6 INT32_LIST;
    public static final ju6 INT32_LIST_PACKED;
    public static final ju6 INT64;
    public static final ju6 INT64_LIST;
    public static final ju6 INT64_LIST_PACKED;
    public static final ju6 MAP;
    public static final ju6 MESSAGE;
    public static final ju6 MESSAGE_LIST;
    public static final ju6 SFIXED32;
    public static final ju6 SFIXED32_LIST;
    public static final ju6 SFIXED32_LIST_PACKED;
    public static final ju6 SFIXED64;
    public static final ju6 SFIXED64_LIST;
    public static final ju6 SFIXED64_LIST_PACKED;
    public static final ju6 SINT32;
    public static final ju6 SINT32_LIST;
    public static final ju6 SINT32_LIST_PACKED;
    public static final ju6 SINT64;
    public static final ju6 SINT64_LIST;
    public static final ju6 SINT64_LIST_PACKED;
    public static final ju6 STRING;
    public static final ju6 STRING_LIST;
    public static final ju6 UINT32;
    public static final ju6 UINT32_LIST;
    public static final ju6 UINT32_LIST_PACKED;
    public static final ju6 UINT64;
    public static final ju6 UINT64_LIST;
    public static final ju6 UINT64_LIST_PACKED;
    private static final ju6[] VALUES;
    private final EnumC14660b collection;
    private final Class<?> elementType;
    private final int id;
    private final j69 javaType;
    private final boolean primitiveScalar;

    /* renamed from: o.ju6$a */
    public static /* synthetic */ class C14659a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f31092a;

        /* renamed from: b */
        public static final /* synthetic */ int[] f31093b;

        static {
            int[] iArr = new int[j69.values().length];
            f31093b = iArr;
            try {
                iArr[j69.BYTE_STRING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f31093b[j69.MESSAGE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f31093b[j69.STRING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[EnumC14660b.values().length];
            f31092a = iArr2;
            try {
                iArr2[EnumC14660b.MAP.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f31092a[EnumC14660b.VECTOR.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f31092a[EnumC14660b.SCALAR.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    /* renamed from: o.ju6$b */
    public enum EnumC14660b {
        SCALAR(false),
        VECTOR(true),
        PACKED_VECTOR(true),
        MAP(false);

        private final boolean isList;

        EnumC14660b(boolean z) {
            this.isList = z;
        }

        public boolean isList() {
            return this.isList;
        }
    }

    static {
        EnumC14660b enumC14660b = EnumC14660b.SCALAR;
        j69 j69Var = j69.DOUBLE;
        ju6 ju6Var = new ju6("DOUBLE", 0, 0, enumC14660b, j69Var);
        DOUBLE = ju6Var;
        j69 j69Var2 = j69.FLOAT;
        ju6 ju6Var2 = new ju6("FLOAT", 1, 1, enumC14660b, j69Var2);
        FLOAT = ju6Var2;
        j69 j69Var3 = j69.LONG;
        ju6 ju6Var3 = new ju6("INT64", 2, 2, enumC14660b, j69Var3);
        INT64 = ju6Var3;
        ju6 ju6Var4 = new ju6("UINT64", 3, 3, enumC14660b, j69Var3);
        UINT64 = ju6Var4;
        j69 j69Var4 = j69.INT;
        ju6 ju6Var5 = new ju6("INT32", 4, 4, enumC14660b, j69Var4);
        INT32 = ju6Var5;
        ju6 ju6Var6 = new ju6("FIXED64", 5, 5, enumC14660b, j69Var3);
        FIXED64 = ju6Var6;
        ju6 ju6Var7 = new ju6("FIXED32", 6, 6, enumC14660b, j69Var4);
        FIXED32 = ju6Var7;
        j69 j69Var5 = j69.BOOLEAN;
        ju6 ju6Var8 = new ju6("BOOL", 7, 7, enumC14660b, j69Var5);
        BOOL = ju6Var8;
        j69 j69Var6 = j69.STRING;
        ju6 ju6Var9 = new ju6("STRING", 8, 8, enumC14660b, j69Var6);
        STRING = ju6Var9;
        j69 j69Var7 = j69.MESSAGE;
        ju6 ju6Var10 = new ju6("MESSAGE", 9, 9, enumC14660b, j69Var7);
        MESSAGE = ju6Var10;
        j69 j69Var8 = j69.BYTE_STRING;
        ju6 ju6Var11 = new ju6("BYTES", 10, 10, enumC14660b, j69Var8);
        BYTES = ju6Var11;
        ju6 ju6Var12 = new ju6("UINT32", 11, 11, enumC14660b, j69Var4);
        UINT32 = ju6Var12;
        j69 j69Var9 = j69.ENUM;
        ju6 ju6Var13 = new ju6("ENUM", 12, 12, enumC14660b, j69Var9);
        ENUM = ju6Var13;
        ju6 ju6Var14 = new ju6("SFIXED32", 13, 13, enumC14660b, j69Var4);
        SFIXED32 = ju6Var14;
        ju6 ju6Var15 = new ju6("SFIXED64", 14, 14, enumC14660b, j69Var3);
        SFIXED64 = ju6Var15;
        ju6 ju6Var16 = new ju6("SINT32", 15, 15, enumC14660b, j69Var4);
        SINT32 = ju6Var16;
        ju6 ju6Var17 = new ju6("SINT64", 16, 16, enumC14660b, j69Var3);
        SINT64 = ju6Var17;
        ju6 ju6Var18 = new ju6("GROUP", 17, 17, enumC14660b, j69Var7);
        GROUP = ju6Var18;
        EnumC14660b enumC14660b2 = EnumC14660b.VECTOR;
        ju6 ju6Var19 = new ju6("DOUBLE_LIST", 18, 18, enumC14660b2, j69Var);
        DOUBLE_LIST = ju6Var19;
        ju6 ju6Var20 = new ju6("FLOAT_LIST", 19, 19, enumC14660b2, j69Var2);
        FLOAT_LIST = ju6Var20;
        ju6 ju6Var21 = new ju6("INT64_LIST", 20, 20, enumC14660b2, j69Var3);
        INT64_LIST = ju6Var21;
        ju6 ju6Var22 = new ju6("UINT64_LIST", 21, 21, enumC14660b2, j69Var3);
        UINT64_LIST = ju6Var22;
        ju6 ju6Var23 = new ju6("INT32_LIST", 22, 22, enumC14660b2, j69Var4);
        INT32_LIST = ju6Var23;
        ju6 ju6Var24 = new ju6("FIXED64_LIST", 23, 23, enumC14660b2, j69Var3);
        FIXED64_LIST = ju6Var24;
        ju6 ju6Var25 = new ju6("FIXED32_LIST", 24, 24, enumC14660b2, j69Var4);
        FIXED32_LIST = ju6Var25;
        ju6 ju6Var26 = new ju6("BOOL_LIST", 25, 25, enumC14660b2, j69Var5);
        BOOL_LIST = ju6Var26;
        ju6 ju6Var27 = new ju6("STRING_LIST", 26, 26, enumC14660b2, j69Var6);
        STRING_LIST = ju6Var27;
        ju6 ju6Var28 = new ju6("MESSAGE_LIST", 27, 27, enumC14660b2, j69Var7);
        MESSAGE_LIST = ju6Var28;
        ju6 ju6Var29 = new ju6("BYTES_LIST", 28, 28, enumC14660b2, j69Var8);
        BYTES_LIST = ju6Var29;
        ju6 ju6Var30 = new ju6("UINT32_LIST", 29, 29, enumC14660b2, j69Var4);
        UINT32_LIST = ju6Var30;
        ju6 ju6Var31 = new ju6("ENUM_LIST", 30, 30, enumC14660b2, j69Var9);
        ENUM_LIST = ju6Var31;
        ju6 ju6Var32 = new ju6("SFIXED32_LIST", 31, 31, enumC14660b2, j69Var4);
        SFIXED32_LIST = ju6Var32;
        ju6 ju6Var33 = new ju6("SFIXED64_LIST", 32, 32, enumC14660b2, j69Var3);
        SFIXED64_LIST = ju6Var33;
        ju6 ju6Var34 = new ju6("SINT32_LIST", 33, 33, enumC14660b2, j69Var4);
        SINT32_LIST = ju6Var34;
        ju6 ju6Var35 = new ju6("SINT64_LIST", 34, 34, enumC14660b2, j69Var3);
        SINT64_LIST = ju6Var35;
        EnumC14660b enumC14660b3 = EnumC14660b.PACKED_VECTOR;
        ju6 ju6Var36 = new ju6("DOUBLE_LIST_PACKED", 35, 35, enumC14660b3, j69Var);
        DOUBLE_LIST_PACKED = ju6Var36;
        ju6 ju6Var37 = new ju6("FLOAT_LIST_PACKED", 36, 36, enumC14660b3, j69Var2);
        FLOAT_LIST_PACKED = ju6Var37;
        ju6 ju6Var38 = new ju6("INT64_LIST_PACKED", 37, 37, enumC14660b3, j69Var3);
        INT64_LIST_PACKED = ju6Var38;
        ju6 ju6Var39 = new ju6("UINT64_LIST_PACKED", 38, 38, enumC14660b3, j69Var3);
        UINT64_LIST_PACKED = ju6Var39;
        ju6 ju6Var40 = new ju6("INT32_LIST_PACKED", 39, 39, enumC14660b3, j69Var4);
        INT32_LIST_PACKED = ju6Var40;
        ju6 ju6Var41 = new ju6("FIXED64_LIST_PACKED", 40, 40, enumC14660b3, j69Var3);
        FIXED64_LIST_PACKED = ju6Var41;
        ju6 ju6Var42 = new ju6("FIXED32_LIST_PACKED", 41, 41, enumC14660b3, j69Var4);
        FIXED32_LIST_PACKED = ju6Var42;
        ju6 ju6Var43 = new ju6("BOOL_LIST_PACKED", 42, 42, enumC14660b3, j69Var5);
        BOOL_LIST_PACKED = ju6Var43;
        ju6 ju6Var44 = new ju6("UINT32_LIST_PACKED", 43, 43, enumC14660b3, j69Var4);
        UINT32_LIST_PACKED = ju6Var44;
        ju6 ju6Var45 = new ju6("ENUM_LIST_PACKED", 44, 44, enumC14660b3, j69Var9);
        ENUM_LIST_PACKED = ju6Var45;
        ju6 ju6Var46 = new ju6("SFIXED32_LIST_PACKED", 45, 45, enumC14660b3, j69Var4);
        SFIXED32_LIST_PACKED = ju6Var46;
        ju6 ju6Var47 = new ju6("SFIXED64_LIST_PACKED", 46, 46, enumC14660b3, j69Var3);
        SFIXED64_LIST_PACKED = ju6Var47;
        ju6 ju6Var48 = new ju6("SINT32_LIST_PACKED", 47, 47, enumC14660b3, j69Var4);
        SINT32_LIST_PACKED = ju6Var48;
        ju6 ju6Var49 = new ju6("SINT64_LIST_PACKED", 48, 48, enumC14660b3, j69Var3);
        SINT64_LIST_PACKED = ju6Var49;
        ju6 ju6Var50 = new ju6("GROUP_LIST", 49, 49, enumC14660b2, j69Var7);
        GROUP_LIST = ju6Var50;
        ju6 ju6Var51 = new ju6("MAP", 50, 50, EnumC14660b.MAP, j69.VOID);
        MAP = ju6Var51;
        $VALUES = new ju6[]{ju6Var, ju6Var2, ju6Var3, ju6Var4, ju6Var5, ju6Var6, ju6Var7, ju6Var8, ju6Var9, ju6Var10, ju6Var11, ju6Var12, ju6Var13, ju6Var14, ju6Var15, ju6Var16, ju6Var17, ju6Var18, ju6Var19, ju6Var20, ju6Var21, ju6Var22, ju6Var23, ju6Var24, ju6Var25, ju6Var26, ju6Var27, ju6Var28, ju6Var29, ju6Var30, ju6Var31, ju6Var32, ju6Var33, ju6Var34, ju6Var35, ju6Var36, ju6Var37, ju6Var38, ju6Var39, ju6Var40, ju6Var41, ju6Var42, ju6Var43, ju6Var44, ju6Var45, ju6Var46, ju6Var47, ju6Var48, ju6Var49, ju6Var50, ju6Var51};
        EMPTY_TYPES = new Type[0];
        ju6[] ju6VarArrValues = values();
        VALUES = new ju6[ju6VarArrValues.length];
        for (ju6 ju6Var52 : ju6VarArrValues) {
            VALUES[ju6Var52.id] = ju6Var52;
        }
    }

    private ju6(String str, int i, int i2, EnumC14660b enumC14660b, j69 j69Var) {
        int i3;
        this.id = i2;
        this.collection = enumC14660b;
        this.javaType = j69Var;
        int i4 = C14659a.f31092a[enumC14660b.ordinal()];
        if (i4 == 1 || i4 == 2) {
            this.elementType = j69Var.getBoxedType();
        } else {
            this.elementType = null;
        }
        this.primitiveScalar = (enumC14660b != EnumC14660b.SCALAR || (i3 = C14659a.f31093b[j69Var.ordinal()]) == 1 || i3 == 2 || i3 == 3) ? false : true;
    }

    public static ju6 forId(int i) {
        if (i < 0) {
            return null;
        }
        ju6[] ju6VarArr = VALUES;
        if (i >= ju6VarArr.length) {
            return null;
        }
        return ju6VarArr[i];
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

    public static ju6 valueOf(String str) {
        return (ju6) Enum.valueOf(ju6.class, str);
    }

    public static ju6[] values() {
        return (ju6[]) $VALUES.clone();
    }

    public j69 getJavaType() {
        return this.javaType;
    }

    public int id() {
        return this.id;
    }

    public boolean isList() {
        return this.collection.isList();
    }

    public boolean isMap() {
        return this.collection == EnumC14660b.MAP;
    }

    public boolean isPacked() {
        return EnumC14660b.PACKED_VECTOR.equals(this.collection);
    }

    public boolean isPrimitiveScalar() {
        return this.primitiveScalar;
    }

    public boolean isScalar() {
        return this.collection == EnumC14660b.SCALAR;
    }

    public boolean isValidForField(Field field) {
        return EnumC14660b.VECTOR.equals(this.collection) ? isValidForList(field) : this.javaType.getType().isAssignableFrom(field.getType());
    }
}
