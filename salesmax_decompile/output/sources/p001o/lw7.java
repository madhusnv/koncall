package p001o;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes2.dex */
public abstract class lw7 {

    /* renamed from: o.lw7$a */
    public static class C15161a {
        /* renamed from: a */
        public static Handler m37996a(Looper looper) {
            return Handler.createAsync(looper);
        }

        /* renamed from: b */
        public static boolean m37997b(Handler handler, Runnable runnable, Object obj, long j) {
            return handler.postDelayed(runnable, obj, j);
        }
    }

    /* renamed from: a */
    public static Handler m37994a(Looper looper) {
        if (Build.VERSION.SDK_INT >= 28) {
            return C15161a.m37996a(looper);
        }
        try {
            return (Handler) Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(looper, null, Boolean.TRUE);
        } catch (IllegalAccessException | InstantiationException | NoSuchMethodException unused) {
            return new Handler(looper);
        } catch (InvocationTargetException e) {
            Throwable cause = e.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            throw new RuntimeException(cause);
        }
    }

    /* renamed from: b */
    public static boolean m37995b(Handler handler, Runnable runnable, Object obj, long j) {
        if (Build.VERSION.SDK_INT >= 28) {
            return C15161a.m37997b(handler, runnable, obj, j);
        }
        Message messageObtain = Message.obtain(handler, runnable);
        messageObtain.obj = obj;
        return handler.sendMessageDelayed(messageObtain, j);
    }
}
