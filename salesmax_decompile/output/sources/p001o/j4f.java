package p001o;

import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes6.dex */
public final class j4f extends AtomicInteger implements g5e {

    /* renamed from: a */
    public final Object f29784a;

    /* renamed from: b */
    public final qag f29785b;

    public j4f(qag qagVar, Object obj) {
        this.f29785b = qagVar;
        this.f29784a = obj;
    }

    @Override // p001o.rag
    public void cancel() {
        lazySet(2);
    }

    @Override // p001o.rtf
    public void clear() {
        lazySet(1);
    }

    @Override // p001o.rtf
    public boolean isEmpty() {
        return get() != 0;
    }

    @Override // p001o.rtf
    public boolean offer(Object obj) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    @Override // p001o.rtf
    public Object poll() {
        if (get() != 0) {
            return null;
        }
        lazySet(1);
        return this.f29784a;
    }

    @Override // p001o.rag
    public void request(long j) {
        if (wag.validate(j) && compareAndSet(0, 1)) {
            qag qagVar = this.f29785b;
            qagVar.mo18166e(this.f29784a);
            if (get() != 2) {
                qagVar.onComplete();
            }
        }
    }

    @Override // p001o.f5e
    public int requestFusion(int i) {
        return i & 1;
    }
}
