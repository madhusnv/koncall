package w3;

import java.lang.reflect.Method;
import k4.InterfaceC3986g;
import uw.InterfaceC7563g;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class s1 implements InterfaceC7563g, InterfaceC3986g {

    /* renamed from: a */
    public static final /* synthetic */ s1 f37955a = new s1();

    /* renamed from: b */
    public static final y2 f37956b = new y2();

    /* renamed from: a */
    public static final boolean m15003a() throws ClassNotFoundException {
        Class cls = C7904v.J1;
        try {
            if (C7904v.J1 == null) {
                Class<?> cls2 = Class.forName("android.os.SystemProperties");
                C7904v.J1 = cls2;
                C7904v.K1 = cls2.getDeclaredMethod("getBoolean", String.class, Boolean.TYPE);
            }
            Method method = C7904v.K1;
            Object objInvoke = method != null ? method.invoke(null, "debug.layout", Boolean.FALSE) : null;
            Boolean bool = objInvoke instanceof Boolean ? (Boolean) objInvoke : null;
            if (bool != null) {
                return bool.booleanValue();
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }
}
