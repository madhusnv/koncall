package p001o;

import java.util.Iterator;
import java.util.Objects;

/* loaded from: classes6.dex */
public final class c8c extends x6c {

    /* renamed from: a */
    public final Iterable f17504a;

    /* renamed from: o.c8c$a */
    public static final class C12589a extends sf1 {

        /* renamed from: a */
        public final m9c f17505a;

        /* renamed from: b */
        public final Iterator f17506b;

        /* renamed from: c */
        public volatile boolean f17507c;

        /* renamed from: d */
        public boolean f17508d;

        /* renamed from: e */
        public boolean f17509e;

        /* renamed from: f */
        public boolean f17510f;

        public C12589a(m9c m9cVar, Iterator it) {
            this.f17505a = m9cVar;
            this.f17506b = it;
        }

        /* renamed from: a */
        public void m20494a() {
            while (!isDisposed()) {
                try {
                    Object next = this.f17506b.next();
                    Objects.requireNonNull(next, "The iterator returned a null value");
                    this.f17505a.mo16560e(next);
                    if (isDisposed()) {
                        return;
                    }
                    try {
                        if (!this.f17506b.hasNext()) {
                            if (isDisposed()) {
                                return;
                            }
                            this.f17505a.onComplete();
                            return;
                        }
                    } catch (Throwable th) {
                        zk6.m59526b(th);
                        this.f17505a.onError(th);
                        return;
                    }
                } catch (Throwable th2) {
                    zk6.m59526b(th2);
                    this.f17505a.onError(th2);
                    return;
                }
            }
        }

        @Override // p001o.rtf
        public void clear() {
            this.f17509e = true;
        }

        @Override // p001o.su5
        public void dispose() {
            this.f17507c = true;
        }

        @Override // p001o.su5
        public boolean isDisposed() {
            return this.f17507c;
        }

        @Override // p001o.rtf
        public boolean isEmpty() {
            return this.f17509e;
        }

        @Override // p001o.rtf
        public Object poll() {
            if (this.f17509e) {
                return null;
            }
            if (!this.f17510f) {
                this.f17510f = true;
            } else if (!this.f17506b.hasNext()) {
                this.f17509e = true;
                return null;
            }
            Object next = this.f17506b.next();
            Objects.requireNonNull(next, "The iterator returned a null value");
            return next;
        }

        @Override // p001o.f5e
        public int requestFusion(int i) {
            if ((i & 1) == 0) {
                return 0;
            }
            this.f17508d = true;
            return 1;
        }
    }

    public c8c(Iterable iterable) {
        this.f17504a = iterable;
    }

    @Override // p001o.x6c
    public void x0(m9c m9cVar) {
        try {
            Iterator it = this.f17504a.iterator();
            try {
                if (!it.hasNext()) {
                    h66.complete(m9cVar);
                    return;
                }
                C12589a c12589a = new C12589a(m9cVar, it);
                m9cVar.mo16559a(c12589a);
                if (c12589a.f17508d) {
                    return;
                }
                c12589a.m20494a();
            } catch (Throwable th) {
                zk6.m59526b(th);
                h66.error(th, m9cVar);
            }
        } catch (Throwable th2) {
            zk6.m59526b(th2);
            h66.error(th2, m9cVar);
        }
    }
}
