package p001o;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewTreeObserver;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import p001o.txi;

/* loaded from: classes5.dex */
public final class pxi implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: d */
    public static final C16209a f40713d = new C16209a(null);

    /* renamed from: e */
    public static final Map f40714e = new HashMap();

    /* renamed from: a */
    public final WeakReference f40715a;

    /* renamed from: b */
    public final Handler f40716b;

    /* renamed from: c */
    public final AtomicBoolean f40717c;

    /* renamed from: o.pxi$a */
    public static final class C16209a {
        public C16209a() {
        }

        public /* synthetic */ C16209a(id5 id5Var) {
            this();
        }

        /* renamed from: a */
        public final void m44278a(Activity activity) {
            sq8.m48649h(activity, "activity");
            int iHashCode = activity.hashCode();
            Map mapM44271b = pxi.m44271b();
            Integer numValueOf = Integer.valueOf(iHashCode);
            Object pxiVar = mapM44271b.get(numValueOf);
            if (pxiVar == null) {
                pxiVar = new pxi(activity, null);
                mapM44271b.put(numValueOf, pxiVar);
            }
            pxi.m44272c((pxi) pxiVar);
        }

        /* renamed from: b */
        public final void m44279b(Activity activity) {
            sq8.m48649h(activity, "activity");
            pxi pxiVar = (pxi) pxi.m44271b().remove(Integer.valueOf(activity.hashCode()));
            if (pxiVar != null) {
                pxi.m44273d(pxiVar);
            }
        }
    }

    public /* synthetic */ pxi(Activity activity, id5 id5Var) {
        this(activity);
    }

    /* renamed from: b */
    public static final /* synthetic */ Map m44271b() {
        if (a94.m16694d(pxi.class)) {
            return null;
        }
        try {
            return f40714e;
        } catch (Throwable th) {
            a94.m16692b(th, pxi.class);
            return null;
        }
    }

    /* renamed from: c */
    public static final /* synthetic */ void m44272c(pxi pxiVar) {
        if (a94.m16694d(pxi.class)) {
            return;
        }
        try {
            pxiVar.m44276g();
        } catch (Throwable th) {
            a94.m16692b(th, pxi.class);
        }
    }

    /* renamed from: d */
    public static final /* synthetic */ void m44273d(pxi pxiVar) {
        if (a94.m16694d(pxi.class)) {
            return;
        }
        try {
            pxiVar.m44277h();
        } catch (Throwable th) {
            a94.m16692b(th, pxi.class);
        }
    }

    /* renamed from: f */
    public static final void m44274f(pxi pxiVar) {
        if (a94.m16694d(pxi.class)) {
            return;
        }
        try {
            sq8.m48649h(pxiVar, "this$0");
            try {
                View viewM28970d = gl0.m28970d((Activity) pxiVar.f40715a.get());
                Activity activity = (Activity) pxiVar.f40715a.get();
                if (viewM28970d != null && activity != null) {
                    for (View view : zbg.m59165a(viewM28970d)) {
                        if (!cef.m21087g(view)) {
                            String strM59167d = zbg.m59167d(view);
                            if ((strM59167d.length() > 0) && strM59167d.length() <= 300) {
                                txi.C17249a c17249a = txi.f48012e;
                                String localClassName = activity.getLocalClassName();
                                sq8.m48648g(localClassName, "activity.localClassName");
                                c17249a.m50766d(view, viewM28970d, localClassName);
                            }
                        }
                    }
                }
            } catch (Exception unused) {
            }
        } catch (Throwable th) {
            a94.m16692b(th, pxi.class);
        }
    }

    /* renamed from: e */
    public final void m44275e() {
        if (a94.m16694d(this)) {
            return;
        }
        try {
            Runnable runnable = new Runnable() { // from class: o.oxi
                @Override // java.lang.Runnable
                public final void run() {
                    pxi.m44274f(this.f39033a);
                }
            };
            if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
                runnable.run();
            } else {
                this.f40716b.post(runnable);
            }
        } catch (Throwable th) {
            a94.m16692b(th, this);
        }
    }

    /* renamed from: g */
    public final void m44276g() {
        View viewM28970d;
        if (a94.m16694d(this)) {
            return;
        }
        try {
            if (this.f40717c.getAndSet(true) || (viewM28970d = gl0.m28970d((Activity) this.f40715a.get())) == null) {
                return;
            }
            ViewTreeObserver viewTreeObserver = viewM28970d.getViewTreeObserver();
            if (viewTreeObserver.isAlive()) {
                viewTreeObserver.addOnGlobalLayoutListener(this);
                m44275e();
            }
        } catch (Throwable th) {
            a94.m16692b(th, this);
        }
    }

    /* renamed from: h */
    public final void m44277h() {
        View viewM28970d;
        if (a94.m16694d(this)) {
            return;
        }
        try {
            if (this.f40717c.getAndSet(false) && (viewM28970d = gl0.m28970d((Activity) this.f40715a.get())) != null) {
                ViewTreeObserver viewTreeObserver = viewM28970d.getViewTreeObserver();
                if (viewTreeObserver.isAlive()) {
                    viewTreeObserver.removeOnGlobalLayoutListener(this);
                }
            }
        } catch (Throwable th) {
            a94.m16692b(th, this);
        }
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        if (a94.m16694d(this)) {
            return;
        }
        try {
            m44275e();
        } catch (Throwable th) {
            a94.m16692b(th, this);
        }
    }

    public pxi(Activity activity) {
        this.f40715a = new WeakReference(activity);
        this.f40716b = new Handler(Looper.getMainLooper());
        this.f40717c = new AtomicBoolean(false);
    }
}
