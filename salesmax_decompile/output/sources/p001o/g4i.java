package p001o;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes5.dex */
public final class g4i {

    /* renamed from: a */
    public static final g4i f24576a = new g4i();

    /* renamed from: b */
    public static final String f24577b = g4i.class.getCanonicalName();

    /* renamed from: c */
    public static Class f24578c;

    /* renamed from: a */
    public static final void m28043a() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        m28045d("UnityFacebookSDKPlugin", "CaptureViewHierarchy", "");
    }

    /* renamed from: c */
    public static final void m28044c(String str) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        m28045d("UnityFacebookSDKPlugin", "OnReceiveMapping", str);
    }

    /* renamed from: d */
    public static final void m28045d(String str, String str2, String str3) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        try {
            if (f24578c == null) {
                f24578c = f24576a.m28046b();
            }
            Class cls = f24578c;
            Class cls2 = null;
            if (cls == null) {
                sq8.m48667z("unityPlayer");
                cls = null;
            }
            Method method = cls.getMethod("UnitySendMessage", String.class, String.class, String.class);
            Class cls3 = f24578c;
            if (cls3 == null) {
                sq8.m48667z("unityPlayer");
            } else {
                cls2 = cls3;
            }
            method.invoke(cls2, str, str2, str3);
        } catch (Exception unused) {
        }
    }

    /* renamed from: b */
    public final Class m28046b() throws ClassNotFoundException {
        Class<?> cls = Class.forName("com.unity3d.player.UnityPlayer");
        sq8.m48648g(cls, "forName(UNITY_PLAYER_CLASS)");
        return cls;
    }
}
