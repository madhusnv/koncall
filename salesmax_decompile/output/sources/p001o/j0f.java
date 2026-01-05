package p001o;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
public abstract class j0f {

    /* renamed from: o.j0f$a */
    public class RunnableC14419a implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ Runnable f29522a;

        public RunnableC14419a(Runnable runnable) {
            this.f29522a = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f29522a.run();
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: d */
    public static /* synthetic */ void m33003d(Runnable runnable) {
        try {
            runnable.run();
        } catch (Throwable unused) {
        }
    }

    /* renamed from: e */
    public static /* synthetic */ void m33004e(Throwable th) {
    }

    /* renamed from: f */
    public static /* synthetic */ void m33005f() {
    }

    /* renamed from: g */
    public static su5 m33006g(x6c x6cVar, gu3 gu3Var, gu3 gu3Var2, jm jmVar) {
        if (x6cVar != null) {
            return x6cVar.h0(of0.m42164c()).w0(gu3Var, gu3Var2, jmVar);
        }
        return null;
    }

    /* renamed from: h */
    public static void m33007h(Runnable runnable, long j) {
        new Handler(Looper.getMainLooper()).postDelayed(new RunnableC14419a(runnable), j);
    }

    /* renamed from: i */
    public static void m33008i(final Runnable runnable) {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: o.g0f
                @Override // java.lang.Runnable
                public final void run() {
                    j0f.m33003d(runnable);
                }
            });
        } else {
            try {
                runnable.run();
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: j */
    public static su5 m33009j(Callable callable, gu3 gu3Var) {
        return m33010k(callable, gu3Var, new gu3() { // from class: o.h0f
            @Override // p001o.gu3
            public final void accept(Object obj) {
                j0f.m33004e((Throwable) obj);
            }
        }, new jm() { // from class: o.i0f
            @Override // p001o.jm
            public final void run() {
                j0f.m33005f();
            }
        });
    }

    /* renamed from: k */
    public static su5 m33010k(Callable callable, gu3 gu3Var, gu3 gu3Var2, jm jmVar) {
        return m33006g(x6c.m55697U(callable).y0(i5f.m31599c()), gu3Var, gu3Var2, jmVar);
    }

    /* renamed from: l */
    public static su5 m33011l(x6c x6cVar, gu3 gu3Var, gu3 gu3Var2, jm jmVar) {
        return m33006g(x6cVar.y0(i5f.m31599c()), gu3Var, gu3Var2, jmVar);
    }
}
