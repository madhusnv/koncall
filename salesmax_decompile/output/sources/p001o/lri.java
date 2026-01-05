package p001o;

import java.lang.annotation.Annotation;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.Arrays;
import java.util.NoSuchElementException;
import java.util.Objects;

/* loaded from: classes6.dex */
public abstract class lri {

    /* renamed from: a */
    public static final Type[] f34322a = new Type[0];

    /* renamed from: o.lri$a */
    public static final class C15145a implements GenericArrayType {

        /* renamed from: a */
        public final Type f34323a;

        public C15145a(Type type2) {
            this.f34323a = type2;
        }

        public boolean equals(Object obj) {
            return (obj instanceof GenericArrayType) && lri.m37835d(this, (GenericArrayType) obj);
        }

        @Override // java.lang.reflect.GenericArrayType
        public Type getGenericComponentType() {
            return this.f34323a;
        }

        public int hashCode() {
            return this.f34323a.hashCode();
        }

        public String toString() {
            return lri.m37851t(this.f34323a) + "[]";
        }
    }

    /* renamed from: o.lri$b */
    public static final class C15146b implements ParameterizedType {

        /* renamed from: a */
        public final Type f34324a;

        /* renamed from: b */
        public final Type f34325b;

        /* renamed from: c */
        public final Type[] f34326c;

        public C15146b(Type type2, Type type3, Type... typeArr) {
            if (type3 instanceof Class) {
                if ((type2 == null) != (((Class) type3).getEnclosingClass() == null)) {
                    throw new IllegalArgumentException();
                }
            }
            for (Type type4 : typeArr) {
                Objects.requireNonNull(type4, "typeArgument == null");
                lri.m37833b(type4);
            }
            this.f34324a = type2;
            this.f34325b = type3;
            this.f34326c = (Type[]) typeArr.clone();
        }

        public boolean equals(Object obj) {
            return (obj instanceof ParameterizedType) && lri.m37835d(this, (ParameterizedType) obj);
        }

        @Override // java.lang.reflect.ParameterizedType
        public Type[] getActualTypeArguments() {
            return (Type[]) this.f34326c.clone();
        }

        @Override // java.lang.reflect.ParameterizedType
        public Type getOwnerType() {
            return this.f34324a;
        }

        @Override // java.lang.reflect.ParameterizedType
        public Type getRawType() {
            return this.f34325b;
        }

        public int hashCode() {
            int iHashCode = Arrays.hashCode(this.f34326c) ^ this.f34325b.hashCode();
            Type type2 = this.f34324a;
            return iHashCode ^ (type2 != null ? type2.hashCode() : 0);
        }

        public String toString() {
            Type[] typeArr = this.f34326c;
            if (typeArr.length == 0) {
                return lri.m37851t(this.f34325b);
            }
            StringBuilder sb = new StringBuilder((typeArr.length + 1) * 30);
            sb.append(lri.m37851t(this.f34325b));
            sb.append("<");
            sb.append(lri.m37851t(this.f34326c[0]));
            for (int i = 1; i < this.f34326c.length; i++) {
                sb.append(", ");
                sb.append(lri.m37851t(this.f34326c[i]));
            }
            sb.append(">");
            return sb.toString();
        }
    }

    /* renamed from: o.lri$c */
    public static final class C15147c implements WildcardType {

        /* renamed from: a */
        public final Type f34327a;

        /* renamed from: b */
        public final Type f34328b;

        public C15147c(Type[] typeArr, Type[] typeArr2) {
            if (typeArr2.length > 1) {
                throw new IllegalArgumentException();
            }
            if (typeArr.length != 1) {
                throw new IllegalArgumentException();
            }
            if (typeArr2.length != 1) {
                Type type2 = typeArr[0];
                type2.getClass();
                lri.m37833b(type2);
                this.f34328b = null;
                this.f34327a = typeArr[0];
                return;
            }
            Type type3 = typeArr2[0];
            type3.getClass();
            lri.m37833b(type3);
            if (typeArr[0] != Object.class) {
                throw new IllegalArgumentException();
            }
            this.f34328b = typeArr2[0];
            this.f34327a = Object.class;
        }

        public boolean equals(Object obj) {
            return (obj instanceof WildcardType) && lri.m37835d(this, (WildcardType) obj);
        }

        @Override // java.lang.reflect.WildcardType
        public Type[] getLowerBounds() {
            Type type2 = this.f34328b;
            return type2 != null ? new Type[]{type2} : lri.f34322a;
        }

        @Override // java.lang.reflect.WildcardType
        public Type[] getUpperBounds() {
            return new Type[]{this.f34327a};
        }

        public int hashCode() {
            Type type2 = this.f34328b;
            return (type2 != null ? type2.hashCode() + 31 : 1) ^ (this.f34327a.hashCode() + 31);
        }

        public String toString() {
            if (this.f34328b != null) {
                return "? super " + lri.m37851t(this.f34328b);
            }
            if (this.f34327a == Object.class) {
                return "?";
            }
            return "? extends " + lri.m37851t(this.f34327a);
        }
    }

    /* renamed from: a */
    public static cre m37832a(cre creVar) {
        rl1 rl1Var = new rl1();
        creVar.mo21619o().T2(rl1Var);
        return cre.m21612k(creVar.mo21618h(), creVar.mo21617g(), rl1Var);
    }

    /* renamed from: b */
    public static void m37833b(Type type2) {
        if ((type2 instanceof Class) && ((Class) type2).isPrimitive()) {
            throw new IllegalArgumentException();
        }
    }

    /* renamed from: c */
    public static Class m37834c(TypeVariable typeVariable) {
        GenericDeclaration genericDeclaration = typeVariable.getGenericDeclaration();
        if (genericDeclaration instanceof Class) {
            return (Class) genericDeclaration;
        }
        return null;
    }

    /* renamed from: d */
    public static boolean m37835d(Type type2, Type type3) {
        if (type2 == type3) {
            return true;
        }
        if (type2 instanceof Class) {
            return type2.equals(type3);
        }
        if (type2 instanceof ParameterizedType) {
            if (!(type3 instanceof ParameterizedType)) {
                return false;
            }
            ParameterizedType parameterizedType = (ParameterizedType) type2;
            ParameterizedType parameterizedType2 = (ParameterizedType) type3;
            Type ownerType = parameterizedType.getOwnerType();
            Type ownerType2 = parameterizedType2.getOwnerType();
            return (ownerType == ownerType2 || (ownerType != null && ownerType.equals(ownerType2))) && parameterizedType.getRawType().equals(parameterizedType2.getRawType()) && Arrays.equals(parameterizedType.getActualTypeArguments(), parameterizedType2.getActualTypeArguments());
        }
        if (type2 instanceof GenericArrayType) {
            if (type3 instanceof GenericArrayType) {
                return m37835d(((GenericArrayType) type2).getGenericComponentType(), ((GenericArrayType) type3).getGenericComponentType());
            }
            return false;
        }
        if (type2 instanceof WildcardType) {
            if (!(type3 instanceof WildcardType)) {
                return false;
            }
            WildcardType wildcardType = (WildcardType) type2;
            WildcardType wildcardType2 = (WildcardType) type3;
            return Arrays.equals(wildcardType.getUpperBounds(), wildcardType2.getUpperBounds()) && Arrays.equals(wildcardType.getLowerBounds(), wildcardType2.getLowerBounds());
        }
        if (!(type2 instanceof TypeVariable) || !(type3 instanceof TypeVariable)) {
            return false;
        }
        TypeVariable typeVariable = (TypeVariable) type2;
        TypeVariable typeVariable2 = (TypeVariable) type3;
        return typeVariable.getGenericDeclaration() == typeVariable2.getGenericDeclaration() && typeVariable.getName().equals(typeVariable2.getName());
    }

    /* renamed from: e */
    public static Type m37836e(Type type2, Class cls, Class cls2) {
        if (cls2 == cls) {
            return type2;
        }
        if (cls2.isInterface()) {
            Class<?>[] interfaces = cls.getInterfaces();
            int length = interfaces.length;
            for (int i = 0; i < length; i++) {
                Class<?> cls3 = interfaces[i];
                if (cls3 == cls2) {
                    return cls.getGenericInterfaces()[i];
                }
                if (cls2.isAssignableFrom(cls3)) {
                    return m37836e(cls.getGenericInterfaces()[i], interfaces[i], cls2);
                }
            }
        }
        if (!cls.isInterface()) {
            while (cls != Object.class) {
                Class<?> superclass = cls.getSuperclass();
                if (superclass == cls2) {
                    return cls.getGenericSuperclass();
                }
                if (cls2.isAssignableFrom(superclass)) {
                    return m37836e(cls.getGenericSuperclass(), superclass, cls2);
                }
                cls = superclass;
            }
        }
        return cls2;
    }

    /* renamed from: f */
    public static Type m37837f(int i, ParameterizedType parameterizedType) {
        Type type2 = parameterizedType.getActualTypeArguments()[i];
        return type2 instanceof WildcardType ? ((WildcardType) type2).getLowerBounds()[0] : type2;
    }

    /* renamed from: g */
    public static Type m37838g(int i, ParameterizedType parameterizedType) {
        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
        if (i >= 0 && i < actualTypeArguments.length) {
            Type type2 = actualTypeArguments[i];
            return type2 instanceof WildcardType ? ((WildcardType) type2).getUpperBounds()[0] : type2;
        }
        throw new IllegalArgumentException("Index " + i + " not in range [0," + actualTypeArguments.length + ") for " + parameterizedType);
    }

    /* renamed from: h */
    public static Class m37839h(Type type2) {
        Objects.requireNonNull(type2, "type == null");
        if (type2 instanceof Class) {
            return (Class) type2;
        }
        if (type2 instanceof ParameterizedType) {
            Type rawType = ((ParameterizedType) type2).getRawType();
            if (rawType instanceof Class) {
                return (Class) rawType;
            }
            throw new IllegalArgumentException();
        }
        if (type2 instanceof GenericArrayType) {
            return Array.newInstance((Class<?>) m37839h(((GenericArrayType) type2).getGenericComponentType()), 0).getClass();
        }
        if (type2 instanceof TypeVariable) {
            return Object.class;
        }
        if (type2 instanceof WildcardType) {
            return m37839h(((WildcardType) type2).getUpperBounds()[0]);
        }
        throw new IllegalArgumentException("Expected a Class, ParameterizedType, or GenericArrayType, but <" + type2 + "> is of type " + type2.getClass().getName());
    }

    /* renamed from: i */
    public static Type m37840i(Type type2, Class cls, Class cls2) {
        if (cls2.isAssignableFrom(cls)) {
            return m37848q(type2, cls, m37836e(type2, cls, cls2));
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: j */
    public static boolean m37841j(Type type2) {
        if (type2 instanceof Class) {
            return false;
        }
        if (type2 instanceof ParameterizedType) {
            for (Type type3 : ((ParameterizedType) type2).getActualTypeArguments()) {
                if (m37841j(type3)) {
                    return true;
                }
            }
            return false;
        }
        if (type2 instanceof GenericArrayType) {
            return m37841j(((GenericArrayType) type2).getGenericComponentType());
        }
        if ((type2 instanceof TypeVariable) || (type2 instanceof WildcardType)) {
            return true;
        }
        throw new IllegalArgumentException("Expected a Class, ParameterizedType, or GenericArrayType, but <" + type2 + "> is of type " + (type2 == null ? "null" : type2.getClass().getName()));
    }

    /* renamed from: k */
    public static int m37842k(Object[] objArr, Object obj) {
        for (int i = 0; i < objArr.length; i++) {
            if (obj.equals(objArr[i])) {
                return i;
            }
        }
        throw new NoSuchElementException();
    }

    /* renamed from: l */
    public static boolean m37843l(Annotation[] annotationArr, Class cls) {
        for (Annotation annotation : annotationArr) {
            if (cls.isInstance(annotation)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: m */
    public static RuntimeException m37844m(Method method, String str, Object... objArr) {
        return m37845n(method, null, str, objArr);
    }

    /* renamed from: n */
    public static RuntimeException m37845n(Method method, Throwable th, String str, Object... objArr) {
        return new IllegalArgumentException(String.format(str, objArr) + "\n    for method " + method.getDeclaringClass().getSimpleName() + "." + method.getName(), th);
    }

    /* renamed from: o */
    public static RuntimeException m37846o(Method method, int i, String str, Object... objArr) {
        return m37844m(method, str + " (parameter #" + (i + 1) + ")", objArr);
    }

    /* renamed from: p */
    public static RuntimeException m37847p(Method method, Throwable th, int i, String str, Object... objArr) {
        return m37845n(method, th, str + " (parameter #" + (i + 1) + ")", objArr);
    }

    /* renamed from: q */
    public static Type m37848q(Type type2, Class cls, Type type3) {
        Type type4 = type3;
        while (type4 instanceof TypeVariable) {
            TypeVariable typeVariable = (TypeVariable) type4;
            Type typeM37849r = m37849r(type2, cls, typeVariable);
            if (typeM37849r == typeVariable) {
                return typeM37849r;
            }
            type4 = typeM37849r;
        }
        if (type4 instanceof Class) {
            Class cls2 = (Class) type4;
            if (cls2.isArray()) {
                Class<?> componentType = cls2.getComponentType();
                Type typeM37848q = m37848q(type2, cls, componentType);
                return componentType == typeM37848q ? cls2 : new C15145a(typeM37848q);
            }
        }
        if (type4 instanceof GenericArrayType) {
            GenericArrayType genericArrayType = (GenericArrayType) type4;
            Type genericComponentType = genericArrayType.getGenericComponentType();
            Type typeM37848q2 = m37848q(type2, cls, genericComponentType);
            return genericComponentType == typeM37848q2 ? genericArrayType : new C15145a(typeM37848q2);
        }
        if (type4 instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) type4;
            Type ownerType = parameterizedType.getOwnerType();
            Type typeM37848q3 = m37848q(type2, cls, ownerType);
            boolean z = typeM37848q3 != ownerType;
            Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
            int length = actualTypeArguments.length;
            for (int i = 0; i < length; i++) {
                Type typeM37848q4 = m37848q(type2, cls, actualTypeArguments[i]);
                if (typeM37848q4 != actualTypeArguments[i]) {
                    if (!z) {
                        actualTypeArguments = (Type[]) actualTypeArguments.clone();
                        z = true;
                    }
                    actualTypeArguments[i] = typeM37848q4;
                }
            }
            return z ? new C15146b(typeM37848q3, parameterizedType.getRawType(), actualTypeArguments) : parameterizedType;
        }
        boolean z2 = type4 instanceof WildcardType;
        Type type5 = type4;
        if (z2) {
            WildcardType wildcardType = (WildcardType) type4;
            Type[] lowerBounds = wildcardType.getLowerBounds();
            Type[] upperBounds = wildcardType.getUpperBounds();
            if (lowerBounds.length == 1) {
                Type typeM37848q5 = m37848q(type2, cls, lowerBounds[0]);
                type5 = wildcardType;
                if (typeM37848q5 != lowerBounds[0]) {
                    return new C15147c(new Type[]{Object.class}, new Type[]{typeM37848q5});
                }
            } else {
                type5 = wildcardType;
                if (upperBounds.length == 1) {
                    Type typeM37848q6 = m37848q(type2, cls, upperBounds[0]);
                    type5 = wildcardType;
                    if (typeM37848q6 != upperBounds[0]) {
                        return new C15147c(new Type[]{typeM37848q6}, f34322a);
                    }
                }
            }
        }
        return type5;
    }

    /* renamed from: r */
    public static Type m37849r(Type type2, Class cls, TypeVariable typeVariable) {
        Class clsM37834c = m37834c(typeVariable);
        if (clsM37834c == null) {
            return typeVariable;
        }
        Type typeM37836e = m37836e(type2, cls, clsM37834c);
        if (!(typeM37836e instanceof ParameterizedType)) {
            return typeVariable;
        }
        return ((ParameterizedType) typeM37836e).getActualTypeArguments()[m37842k(clsM37834c.getTypeParameters(), typeVariable)];
    }

    /* renamed from: s */
    public static void m37850s(Throwable th) {
        if (th instanceof VirtualMachineError) {
            throw ((VirtualMachineError) th);
        }
        if (th instanceof ThreadDeath) {
            throw ((ThreadDeath) th);
        }
        if (th instanceof LinkageError) {
            throw ((LinkageError) th);
        }
    }

    /* renamed from: t */
    public static String m37851t(Type type2) {
        return type2 instanceof Class ? ((Class) type2).getName() : type2.toString();
    }
}
