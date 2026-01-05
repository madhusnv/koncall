package p004e;

import a1.RunnableC0024w;
import android.os.Looper;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewTreeObserver;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: e.j */
/* loaded from: classes.dex */
public final class ViewTreeObserverOnDrawListenerC1875j implements InterfaceExecutorC1874i, ViewTreeObserver.OnDrawListener, Runnable {

    /* renamed from: a */
    public final long f8886a = SystemClock.uptimeMillis() + 10000;

    /* renamed from: b */
    public Runnable f8887b;

    /* renamed from: c */
    public boolean f8888c;

    /* renamed from: d */
    public final /* synthetic */ AbstractActivityC1878m f8889d;

    public ViewTreeObserverOnDrawListenerC1875j(AbstractActivityC1878m abstractActivityC1878m) {
        this.f8889d = abstractActivityC1878m;
    }

    /* renamed from: a */
    public final void m5505a(View view) {
        if (this.f8888c) {
            return;
        }
        this.f8888c = true;
        view.getViewTreeObserver().addOnDrawListener(this);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        AbstractC4154l.m8923f(runnable, "runnable");
        this.f8887b = runnable;
        View decorView = this.f8889d.getWindow().getDecorView();
        AbstractC4154l.m8922e(decorView, "window.decorView");
        if (!this.f8888c) {
            decorView.postOnAnimation(new RunnableC0024w(13, this));
        } else if (AbstractC4154l.m8918a(Looper.myLooper(), Looper.getMainLooper())) {
            decorView.invalidate();
        } else {
            decorView.postInvalidate();
        }
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public final void onDraw() {
        boolean z6;
        Runnable runnable = this.f8887b;
        if (runnable == null) {
            if (SystemClock.uptimeMillis() > this.f8886a) {
                this.f8888c = false;
                this.f8889d.getWindow().getDecorView().post(this);
                return;
            }
            return;
        }
        runnable.run();
        this.f8887b = null;
        C1886u fullyDrawnReporter = this.f8889d.getFullyDrawnReporter();
        synchronized (fullyDrawnReporter.f8898a) {
            z6 = fullyDrawnReporter.f8899b;
        }
        if (z6) {
            this.f8888c = false;
            this.f8889d.getWindow().getDecorView().post(this);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f8889d.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(this);
    }
}
