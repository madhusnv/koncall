package p001o;

import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes6.dex */
public abstract class ouf extends AtomicLong implements h67, rag {

    /* renamed from: a */
    public final qag f38942a;

    /* renamed from: b */
    public rag f38943b;

    /* renamed from: c */
    public Object f38944c;

    /* renamed from: d */
    public long f38945d;

    public ouf(qag qagVar) {
        this.f38942a = qagVar;
    }

    /* renamed from: a */
    public final void m42708a(Object obj) {
        long j = this.f38945d;
        if (j != 0) {
            ka1.m35218c(this, j);
        }
        while (true) {
            long j2 = get();
            if ((j2 & Long.MIN_VALUE) != 0) {
                mo42709c(obj);
                return;
            }
            if ((j2 & Long.MAX_VALUE) != 0) {
                lazySet(-9223372036854775807L);
                this.f38942a.mo18166e(obj);
                this.f38942a.onComplete();
                return;
            } else {
                this.f38944c = obj;
                if (compareAndSet(0L, Long.MIN_VALUE)) {
                    return;
                } else {
                    this.f38944c = null;
                }
            }
        }
    }

    @Override // p001o.h67, p001o.qag
    /* renamed from: b */
    public void mo18165b(rag ragVar) {
        if (wag.validate(this.f38943b, ragVar)) {
            this.f38943b = ragVar;
            this.f38942a.mo18165b(this);
        }
    }

    /* renamed from: c */
    public abstract void mo42709c(Object obj);

    @Override // p001o.rag
    public void cancel() {
        this.f38943b.cancel();
    }

    @Override // p001o.rag
    public final void request(long j) {
        long j2;
        if (wag.validate(j)) {
            do {
                j2 = get();
                if ((j2 & Long.MIN_VALUE) != 0) {
                    if (compareAndSet(Long.MIN_VALUE, -9223372036854775807L)) {
                        this.f38942a.mo18166e(this.f38944c);
                        this.f38942a.onComplete();
                        return;
                    }
                    return;
                }
            } while (!compareAndSet(j2, ka1.m35217b(j2, j)));
            this.f38943b.request(j);
        }
    }
}
