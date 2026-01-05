package p001o;

/* loaded from: classes6.dex */
public class jk5 extends of1 {

    /* renamed from: a */
    public final qag f30542a;

    /* renamed from: b */
    public Object f30543b;

    public jk5(qag qagVar) {
        this.f30542a = qagVar;
    }

    /* renamed from: c */
    public final void m33899c(Object obj) {
        int i = get();
        while (i != 8) {
            if ((i & (-3)) != 0) {
                return;
            }
            if (i == 2) {
                lazySet(3);
                qag qagVar = this.f30542a;
                qagVar.mo18166e(obj);
                if (get() != 4) {
                    qagVar.onComplete();
                    return;
                }
                return;
            }
            this.f30543b = obj;
            if (compareAndSet(0, 1)) {
                return;
            }
            i = get();
            if (i == 4) {
                this.f30543b = null;
                return;
            }
        }
        this.f30543b = obj;
        lazySet(16);
        qag qagVar2 = this.f30542a;
        qagVar2.mo18166e(obj);
        if (get() != 4) {
            qagVar2.onComplete();
        }
    }

    public void cancel() {
        set(4);
        this.f30543b = null;
    }

    @Override // p001o.rtf
    public final void clear() {
        lazySet(32);
        this.f30543b = null;
    }

    /* renamed from: d */
    public final boolean m33900d() {
        return get() == 4;
    }

    @Override // p001o.rtf
    public final boolean isEmpty() {
        return get() != 16;
    }

    @Override // p001o.rtf
    public final Object poll() {
        if (get() != 16) {
            return null;
        }
        lazySet(32);
        Object obj = this.f30543b;
        this.f30543b = null;
        return obj;
    }

    @Override // p001o.rag
    public final void request(long j) {
        Object obj;
        if (wag.validate(j)) {
            do {
                int i = get();
                if ((i & (-2)) != 0) {
                    return;
                }
                if (i == 1) {
                    if (!compareAndSet(1, 3) || (obj = this.f30543b) == null) {
                        return;
                    }
                    this.f30543b = null;
                    qag qagVar = this.f30542a;
                    qagVar.mo18166e(obj);
                    if (get() != 4) {
                        qagVar.onComplete();
                        return;
                    }
                    return;
                }
            } while (!compareAndSet(0, 2));
        }
    }

    @Override // p001o.f5e
    public final int requestFusion(int i) {
        if ((i & 2) == 0) {
            return 0;
        }
        lazySet(8);
        return 2;
    }
}
