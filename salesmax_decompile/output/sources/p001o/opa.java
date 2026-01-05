package p001o;

import android.os.Looper;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes6.dex */
public abstract class opa implements su5 {

    /* renamed from: a */
    public final AtomicBoolean f38701a = new AtomicBoolean();

    /* renamed from: a */
    public abstract void mo32216a();

    @Override // p001o.su5
    public final void dispose() {
        if (this.f38701a.compareAndSet(false, true)) {
            if (Looper.myLooper() == Looper.getMainLooper()) {
                mo32216a();
            } else {
                of0.m42164c().mo20302c(new Runnable() { // from class: o.npa
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f37137a.mo32216a();
                    }
                });
            }
        }
    }

    @Override // p001o.su5
    public final boolean isDisposed() {
        return this.f38701a.get();
    }
}
