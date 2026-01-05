package ux;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import java.lang.reflect.InvocationTargetException;
import kotlin.jvm.internal.AbstractC4154l;
import og.od;
import qw.C6363m;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ux.d */
/* loaded from: classes3.dex */
public abstract class AbstractC7570d {

    /* renamed from: a */
    public static final /* synthetic */ int f36447a = 0;
    private static volatile Choreographer choreographer;

    static {
        Object objM10796a;
        try {
            objM10796a = new C7569c(m14304a(Looper.getMainLooper()));
        } catch (Throwable th2) {
            objM10796a = od.m10796a(th2);
        }
        if (objM10796a instanceof C6363m) {
            objM10796a = null;
        }
    }

    /* renamed from: a */
    public static final Handler m14304a(Looper looper) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        if (Build.VERSION.SDK_INT >= 28) {
            Object objInvoke = Handler.class.getDeclaredMethod("createAsync", Looper.class).invoke(null, looper);
            AbstractC4154l.m8921d(objInvoke, "null cannot be cast to non-null type android.os.Handler");
            return (Handler) objInvoke;
        }
        try {
            return (Handler) Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(looper, null, Boolean.TRUE);
        } catch (NoSuchMethodException unused) {
            return new Handler(looper);
        }
    }
}
