package i00;

import com.sun.mail.util.AbstractC1452a;
import ey.C2147b;
import java.lang.annotation.Annotation;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.Arrays;
import java.util.Map;
import java.util.Objects;
import org.bouncycastle.jcajce.provider.digest.AbstractC5601a;
import pg.n6;
import tx.C7251k;
import uw.InterfaceC7559c;
import vw.EnumC7794a;
import zk.C8989c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public abstract class w0 {

    /* renamed from: a */
    public static final Type[] f16761a = new Type[0];

    /* renamed from: b */
    public static boolean f16762b = true;

    /* renamed from: b */
    public static final Object m7463b(InterfaceC3099d interfaceC3099d, InterfaceC7559c interfaceC7559c) {
        C7251k c7251k = new C7251k(1, n6.m11797c(interfaceC7559c));
        c7251k.m13540p();
        c7251k.m13542t(new C3114s(interfaceC3099d, 0));
        interfaceC3099d.mo7442j(new C2147b(c7251k));
        Object objM13539o = c7251k.m13539o();
        EnumC7794a enumC7794a = EnumC7794a.COROUTINE_SUSPENDED;
        return objM13539o;
    }

    /* renamed from: c */
    public static final Object m7464c(InterfaceC3099d interfaceC3099d, InterfaceC7559c interfaceC7559c) {
        C7251k c7251k = new C7251k(1, n6.m11797c(interfaceC7559c));
        c7251k.m13540p();
        c7251k.m13542t(new C3114s(interfaceC3099d, 1));
        interfaceC3099d.mo7442j(new C8989c(21, c7251k));
        Object objM13539o = c7251k.m13539o();
        EnumC7794a enumC7794a = EnumC7794a.COROUTINE_SUSPENDED;
        return objM13539o;
    }

    /* renamed from: d */
    public static void m7465d(Type type) {
        if ((type instanceof Class) && ((Class) type).isPrimitive()) {
            throw new IllegalArgumentException();
        }
    }

    /* renamed from: e */
    public static boolean m7466e(Type type, Type type2) {
        if (type == type2) {
            return true;
        }
        if (type instanceof Class) {
            return type.equals(type2);
        }
        if (type instanceof ParameterizedType) {
            if (!(type2 instanceof ParameterizedType)) {
                return false;
            }
            ParameterizedType parameterizedType = (ParameterizedType) type;
            ParameterizedType parameterizedType2 = (ParameterizedType) type2;
            Type ownerType = parameterizedType.getOwnerType();
            Type ownerType2 = parameterizedType2.getOwnerType();
            return (ownerType == ownerType2 || (ownerType != null && ownerType.equals(ownerType2))) && parameterizedType.getRawType().equals(parameterizedType2.getRawType()) && Arrays.equals(parameterizedType.getActualTypeArguments(), parameterizedType2.getActualTypeArguments());
        }
        if (type instanceof GenericArrayType) {
            if (type2 instanceof GenericArrayType) {
                return m7466e(((GenericArrayType) type).getGenericComponentType(), ((GenericArrayType) type2).getGenericComponentType());
            }
            return false;
        }
        if (type instanceof WildcardType) {
            if (!(type2 instanceof WildcardType)) {
                return false;
            }
            WildcardType wildcardType = (WildcardType) type;
            WildcardType wildcardType2 = (WildcardType) type2;
            return Arrays.equals(wildcardType.getUpperBounds(), wildcardType2.getUpperBounds()) && Arrays.equals(wildcardType.getLowerBounds(), wildcardType2.getLowerBounds());
        }
        if (!(type instanceof TypeVariable) || !(type2 instanceof TypeVariable)) {
            return false;
        }
        TypeVariable typeVariable = (TypeVariable) type;
        TypeVariable typeVariable2 = (TypeVariable) type2;
        return typeVariable.getGenericDeclaration() == typeVariable2.getGenericDeclaration() && typeVariable.getName().equals(typeVariable2.getName());
    }

    /* renamed from: f */
    public static Type m7467f(Type type, Class cls, Class cls2) {
        if (cls2 == cls) {
            return type;
        }
        if (cls2.isInterface()) {
            Class<?>[] interfaces = cls.getInterfaces();
            int length = interfaces.length;
            for (int i10 = 0; i10 < length; i10++) {
                Class<?> cls3 = interfaces[i10];
                if (cls3 == cls2) {
                    return cls.getGenericInterfaces()[i10];
                }
                if (cls2.isAssignableFrom(cls3)) {
                    return m7467f(cls.getGenericInterfaces()[i10], interfaces[i10], cls2);
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
                    return m7467f(cls.getGenericSuperclass(), superclass, cls2);
                }
                cls = superclass;
            }
        }
        return cls2;
    }

    /* renamed from: g */
    public static Type m7468g(int i10, ParameterizedType parameterizedType) {
        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
        if (i10 >= 0 && i10 < actualTypeArguments.length) {
            Type type = actualTypeArguments[i10];
            return type instanceof WildcardType ? ((WildcardType) type).getUpperBounds()[0] : type;
        }
        StringBuilder sbM4567n = AbstractC1452a.m4567n(i10, "Index ", " not in range [0,");
        sbM4567n.append(actualTypeArguments.length);
        sbM4567n.append(") for ");
        sbM4567n.append(parameterizedType);
        throw new IllegalArgumentException(sbM4567n.toString());
    }

    /* renamed from: h */
    public static Class m7469h(Type type) {
        Objects.requireNonNull(type, "type == null");
        if (type instanceof Class) {
            return (Class) type;
        }
        if (type instanceof ParameterizedType) {
            Type rawType = ((ParameterizedType) type).getRawType();
            if (rawType instanceof Class) {
                return (Class) rawType;
            }
            throw new IllegalArgumentException();
        }
        if (type instanceof GenericArrayType) {
            return Array.newInstance((Class<?>) m7469h(((GenericArrayType) type).getGenericComponentType()), 0).getClass();
        }
        if (type instanceof TypeVariable) {
            return Object.class;
        }
        if (type instanceof WildcardType) {
            return m7469h(((WildcardType) type).getUpperBounds()[0]);
        }
        throw new IllegalArgumentException("Expected a Class, ParameterizedType, or GenericArrayType, but <" + type + "> is of type " + type.getClass().getName());
    }

    /* renamed from: i */
    public static Type m7470i(Type type, Class cls) {
        if (Map.class.isAssignableFrom(cls)) {
            return m7476o(type, cls, m7467f(type, cls, Map.class));
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: j */
    public static boolean m7471j(Type type) {
        if (type instanceof Class) {
            return false;
        }
        if (type instanceof ParameterizedType) {
            for (Type type2 : ((ParameterizedType) type).getActualTypeArguments()) {
                if (m7471j(type2)) {
                    return true;
                }
            }
            return false;
        }
        if (type instanceof GenericArrayType) {
            return m7471j(((GenericArrayType) type).getGenericComponentType());
        }
        if ((type instanceof TypeVariable) || (type instanceof WildcardType)) {
            return true;
        }
        throw new IllegalArgumentException("Expected a Class, ParameterizedType, or GenericArrayType, but <" + type + "> is of type " + (type == null ? "null" : type.getClass().getName()));
    }

    /* renamed from: k */
    public static boolean m7472k(Annotation[] annotationArr, Class cls) {
        for (Annotation annotation : annotationArr) {
            if (cls.isInstance(annotation)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: l */
    public static IllegalArgumentException m7473l(Method method, Exception exc, String str, Object... objArr) {
        StringBuilder sbM11245p = AbstractC5601a.m11245p(String.format(str, objArr), "\n    for method ");
        sbM11245p.append(method.getDeclaringClass().getSimpleName());
        sbM11245p.append(".");
        sbM11245p.append(method.getName());
        return new IllegalArgumentException(sbM11245p.toString(), exc);
    }

    /* renamed from: m */
    public static IllegalArgumentException m7474m(Method method, int i10, String str, Object... objArr) {
        return m7473l(method, null, str + " (" + i0.f16667b.mo7435d(i10, method) + ")", objArr);
    }

    /* renamed from: n */
    public static IllegalArgumentException m7475n(Method method, Exception exc, int i10, String str, Object... objArr) {
        return m7473l(method, exc, str + " (" + i0.f16667b.mo7435d(i10, method) + ")", objArr);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x003f  */
    /* renamed from: o */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.reflect.Type m7476o(java.lang.reflect.Type r8, java.lang.Class r9, java.lang.reflect.Type r10) {
        /*
            Method dump skipped, instructions count: 256
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: i00.w0.m7476o(java.lang.reflect.Type, java.lang.Class, java.lang.reflect.Type):java.lang.reflect.Type");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: p */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final vw.EnumC7794a m7477p(java.lang.Throwable r5, uw.InterfaceC7559c r6) {
        /*
            boolean r0 = r6 instanceof i00.C3115t
            if (r0 == 0) goto L13
            r0 = r6
            i00.t r0 = (i00.C3115t) r0
            int r1 = r0.f16747b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f16747b = r1
            goto L18
        L13:
            i00.t r0 = new i00.t
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f16746a
            vw.a r1 = vw.EnumC7794a.COROUTINE_SUSPENDED
            int r2 = r0.f16747b
            r3 = 1
            if (r2 == 0) goto L34
            if (r2 == r3) goto L2b
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2b:
            og.od.m10798c(r6)
            kotlin.KotlinNothingValueException r5 = new kotlin.KotlinNothingValueException
            r5.<init>()
            throw r5
        L34:
            og.od.m10798c(r6)
            r0.f16747b = r3
            ay.f r6 = tx.m0.f34659a
            uw.h r2 = r0.getContext()
            zh.c r3 = new zh.c
            r4 = 6
            r3.<init>(r4, r0, r5)
            r6.B0(r2, r3)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: i00.w0.m7477p(java.lang.Throwable, uw.c):vw.a");
    }

    /* renamed from: q */
    public static void m7478q(Throwable th2) {
        if (th2 instanceof VirtualMachineError) {
            throw ((VirtualMachineError) th2);
        }
        if (th2 instanceof ThreadDeath) {
            throw ((ThreadDeath) th2);
        }
        if (th2 instanceof LinkageError) {
            throw ((LinkageError) th2);
        }
    }

    /* renamed from: r */
    public static String m7479r(Type type) {
        return type instanceof Class ? ((Class) type).getName() : type.toString();
    }

    /* renamed from: a */
    public abstract void mo7438a(m0 m0Var, Object obj);
}
