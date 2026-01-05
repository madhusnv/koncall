package p001o;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes6.dex */
public class g8g extends AtomicInteger implements h67, rag {

    /* renamed from: a */
    public final qag f24738a;

    /* renamed from: b */
    public final ns0 f24739b = new ns0();

    /* renamed from: c */
    public final AtomicLong f24740c = new AtomicLong();

    /* renamed from: d */
    public final AtomicReference f24741d = new AtomicReference();

    /* renamed from: e */
    public final AtomicBoolean f24742e = new AtomicBoolean();

    /* renamed from: f */
    public volatile boolean f24743f;

    public g8g(qag qagVar) {
        this.f24738a = qagVar;
    }

    @Override // p001o.h67, p001o.qag
    /* renamed from: b */
    public void mo18165b(rag ragVar) {
        if (this.f24742e.compareAndSet(false, true)) {
            this.f24738a.mo18165b(this);
            wag.deferredSetOnce(this.f24741d, this.f24740c, ragVar);
        } else {
            ragVar.cancel();
            cancel();
            onError(new IllegalStateException("§2.12 violated: onSubscribe must be called at most once"));
        }
    }

    @Override // p001o.rag
    public void cancel() {
        if (this.f24743f) {
            return;
        }
        wag.cancel(this.f24741d);
    }

    @Override // p001o.qag
    /* renamed from: e */
    public void mo18166e(Object obj) {
        aw7.m17894f(this.f24738a, obj, this, this.f24739b);
    }

    @Override // p001o.qag
    public void onComplete() {
        this.f24743f = true;
        aw7.m17890b(this.f24738a, this, this.f24739b);
    }

    @Override // p001o.qag
    public void onError(Throwable th) {
        this.f24743f = true;
        aw7.m17892d(this.f24738a, th, this, this.f24739b);
    }

    @Override // p001o.rag
    public void request(long j) {
        if (j > 0) {
            wag.deferredRequest(this.f24741d, this.f24740c, j);
            return;
        }
        cancel();
        onError(new IllegalArgumentException("§3.9 violated: positive request amount required but it was " + j));
    }
}
