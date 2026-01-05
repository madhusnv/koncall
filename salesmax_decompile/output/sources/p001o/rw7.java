package p001o;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import java.lang.reflect.InvocationTargetException;
import p001o.vre;

/* loaded from: classes6.dex */
public abstract class rw7 {

    /* renamed from: a */
    public static final qw7 f44149a;
    private static volatile Choreographer choreographer;

    static {
        Object objM53351b;
        try {
            vre.C17665a c17665a = vre.f50797b;
            objM53351b = vre.m53351b(new pw7(m47208a(Looper.getMainLooper(), true), null, 2, null));
        } catch (Throwable th) {
            vre.C17665a c17665a2 = vre.f50797b;
            objM53351b = vre.m53351b(wre.m54933a(th));
        }
        f44149a = (qw7) (vre.m53356g(objM53351b) ? null : objM53351b);
    }

    /* renamed from: a */
    public static final Handler m47208a(Looper looper, boolean z) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        if (!z) {
            return new Handler(looper);
        }
        if (Build.VERSION.SDK_INT < 28) {
            try {
                return (Handler) Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(looper, null, Boolean.TRUE);
            } catch (NoSuchMethodException unused) {
                return new Handler(looper);
            }
        }
        Object objInvoke = Handler.class.getDeclaredMethod("createAsync", Looper.class).invoke(null, looper);
        sq8.m48647f(objInvoke, "null cannot be cast to non-null type android.os.Handler");
        return (Handler) objInvoke;
    }

    /* renamed from: b */
    public static final qw7 m47209b(Handler handler, String str) {
        return new pw7(handler, str);
    }
}
