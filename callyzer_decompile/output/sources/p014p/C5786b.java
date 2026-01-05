package p014p;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import c0.ThreadFactoryC0820m;
import c6.AbstractC0879i;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import og.gb;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: p.b */
/* loaded from: classes.dex */
public final class C5786b extends gb {

    /* renamed from: a */
    public final Object f28365a = new Object();

    /* renamed from: b */
    public final ExecutorService f28366b = Executors.newFixedThreadPool(4, new ThreadFactoryC0820m(3));

    /* renamed from: c */
    public volatile Handler f28367c;

    /* renamed from: g */
    public static Handler m11336g(Looper looper) {
        if (Build.VERSION.SDK_INT >= 28) {
            return AbstractC0879i.m2390b(looper);
        }
        try {
            return (Handler) Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(looper, null, Boolean.TRUE);
        } catch (IllegalAccessException | InstantiationException | NoSuchMethodException unused) {
            return new Handler(looper);
        } catch (InvocationTargetException unused2) {
            return new Handler(looper);
        }
    }
}
