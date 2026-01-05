package p001o;

/* loaded from: classes6.dex */
public class ik5 extends nf1 {

    /* renamed from: a */
    public final m9c f28776a;

    /* renamed from: b */
    public Object f28777b;

    public ik5(m9c m9cVar) {
        this.f28776a = m9cVar;
    }

    /* renamed from: b */
    public final void m32238b() {
        if ((get() & 54) != 0) {
            return;
        }
        lazySet(2);
        this.f28776a.onComplete();
    }

    @Override // p001o.rtf
    public final void clear() {
        lazySet(32);
        this.f28777b = null;
    }

    /* renamed from: d */
    public final void m32239d(Object obj) {
        int i = get();
        if ((i & 54) != 0) {
            return;
        }
        m9c m9cVar = this.f28776a;
        if (i == 8) {
            this.f28777b = obj;
            lazySet(16);
            m9cVar.mo16560e(null);
        } else {
            lazySet(2);
            m9cVar.mo16560e(obj);
        }
        if (get() != 4) {
            m9cVar.onComplete();
        }
    }

    public void dispose() {
        set(4);
        this.f28777b = null;
    }

    /* renamed from: f */
    public final void m32240f(Throwable th) {
        if ((get() & 54) != 0) {
            fwe.m27599r(th);
        } else {
            lazySet(2);
            this.f28776a.onError(th);
        }
    }

    @Override // p001o.su5
    public final boolean isDisposed() {
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
        Object obj = this.f28777b;
        this.f28777b = null;
        lazySet(32);
        return obj;
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
