package p001o;

import android.content.Context;
import com.google.android.gms.fido.fido2.api.common.DevicePublicKeyStringDef;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;

/* loaded from: classes5.dex */
public final class kh8 {

    /* renamed from: a */
    public static final kh8 f32250a = new kh8();

    /* renamed from: o.kh8$a */
    public enum EnumC14835a {
        NONE(DevicePublicKeyStringDef.NONE),
        V1("Android-GPBL-V1"),
        V2_V4("Android-GPBL-V2-V4"),
        V5_V7("Android-GPBL-V5-V7");


        /* renamed from: type, reason: collision with root package name */
        private final String f58177type;

        EnumC14835a(String str) {
            this.f58177type = str;
        }

        public final String getType() {
            return this.f58177type;
        }
    }

    /* renamed from: o.kh8$b */
    public enum EnumC14836b {
        INAPP("inapp"),
        SUBS("subs");


        /* renamed from: type, reason: collision with root package name */
        private final String f58178type;

        EnumC14836b(String str) {
            this.f58178type = str;
        }

        public final String getType() {
            return this.f58178type;
        }
    }

    /* renamed from: a */
    public static final Class m35712a(String str) {
        if (a94.m16694d(kh8.class)) {
            return null;
        }
        try {
            sq8.m48649h(str, "className");
            try {
                return Class.forName(str);
            } catch (ClassNotFoundException unused) {
                return null;
            }
        } catch (Throwable th) {
            a94.m16692b(th, kh8.class);
            return null;
        }
    }

    /* renamed from: b */
    public static final Class m35713b(Context context, String str) {
        if (a94.m16694d(kh8.class)) {
            return null;
        }
        try {
            sq8.m48649h(context, "context");
            sq8.m48649h(str, "className");
            try {
                return context.getClassLoader().loadClass(str);
            } catch (ClassNotFoundException unused) {
                return null;
            }
        } catch (Throwable th) {
            a94.m16692b(th, kh8.class);
            return null;
        }
    }

    /* renamed from: c */
    public static final Method m35714c(Class cls, String str, Class... clsArr) {
        if (a94.m16694d(kh8.class)) {
            return null;
        }
        try {
            sq8.m48649h(cls, "clazz");
            sq8.m48649h(str, "methodName");
            sq8.m48649h(clsArr, "args");
            try {
                return cls.getDeclaredMethod(str, (Class[]) Arrays.copyOf(clsArr, clsArr.length));
            } catch (NoSuchMethodException unused) {
                return null;
            }
        } catch (Throwable th) {
            a94.m16692b(th, kh8.class);
            return null;
        }
    }

    /* renamed from: d */
    public static final Method m35715d(Class cls, String str, Class... clsArr) {
        if (a94.m16694d(kh8.class)) {
            return null;
        }
        try {
            sq8.m48649h(cls, "clazz");
            sq8.m48649h(str, "methodName");
            sq8.m48649h(clsArr, "args");
            try {
                return cls.getMethod(str, (Class[]) Arrays.copyOf(clsArr, clsArr.length));
            } catch (NoSuchMethodException unused) {
                return null;
            }
        } catch (Throwable th) {
            a94.m16692b(th, kh8.class);
            return null;
        }
    }

    /* renamed from: e */
    public static final Object m35716e(Class cls, Method method, Object obj, Object... objArr) {
        if (a94.m16694d(kh8.class)) {
            return null;
        }
        try {
            sq8.m48649h(cls, "clazz");
            sq8.m48649h(method, FirebaseAnalytics.Param.METHOD);
            sq8.m48649h(objArr, "args");
            if (obj != null) {
                obj = cls.cast(obj);
            }
            try {
                return method.invoke(obj, Arrays.copyOf(objArr, objArr.length));
            } catch (IllegalAccessException | InvocationTargetException unused) {
                return null;
            }
        } catch (Throwable th) {
            a94.m16692b(th, kh8.class);
            return null;
        }
    }
}
