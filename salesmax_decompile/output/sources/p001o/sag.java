package p001o;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes6.dex */
public class sag extends AtomicInteger implements rag {

    /* renamed from: a */
    public rag f45089a;

    /* renamed from: b */
    public long f45090b;

    /* renamed from: c */
    public final AtomicReference f45091c = new AtomicReference();

    /* renamed from: d */
    public final AtomicLong f45092d = new AtomicLong();

    /* renamed from: e */
    public final AtomicLong f45093e = new AtomicLong();

    /* renamed from: f */
    public final boolean f45094f;

    /* renamed from: g */
    public volatile boolean f45095g;

    /* renamed from: h */
    public boolean f45096h;

    public sag(boolean z) {
        this.f45094f = z;
    }

    /* renamed from: a */
    final void m48095a() {
        if (getAndIncrement() != 0) {
            return;
        }
        m48096c();
    }

    /* renamed from: c */
    final void m48096c() {
        int iAddAndGet = 1;
        long jM35217b = 0;
        rag ragVar = null;
        do {
            rag ragVar2 = (rag) this.f45091c.get();
            if (ragVar2 != null) {
                ragVar2 = (rag) this.f45091c.getAndSet(null);
            }
            long andSet = this.f45092d.get();
            if (andSet != 0) {
                andSet = this.f45092d.getAndSet(0L);
            }
            long andSet2 = this.f45093e.get();
            if (andSet2 != 0) {
                andSet2 = this.f45093e.getAndSet(0L);
            }
            rag ragVar3 = this.f45089a;
            if (this.f45095g) {
                if (ragVar3 != null) {
                    ragVar3.cancel();
                    this.f45089a = null;
                }
                if (ragVar2 != null) {
                    ragVar2.cancel();
                }
            } else {
                long jM35217b2 = this.f45090b;
                if (jM35217b2 != Long.MAX_VALUE) {
                    jM35217b2 = ka1.m35217b(jM35217b2, andSet);
                    if (jM35217b2 != Long.MAX_VALUE) {
                        jM35217b2 -= andSet2;
                        if (jM35217b2 < 0) {
                            wag.reportMoreProduced(jM35217b2);
                            jM35217b2 = 0;
                        }
                    }
                    this.f45090b = jM35217b2;
                }
                if (ragVar2 != null) {
                    if (ragVar3 != null && this.f45094f) {
                        ragVar3.cancel();
                    }
                    this.f45089a = ragVar2;
                    if (jM35217b2 != 0) {
                        jM35217b = ka1.m35217b(jM35217b, jM35217b2);
                        ragVar = ragVar2;
                    }
                } else if (ragVar3 != null && andSet != 0) {
                    jM35217b = ka1.m35217b(jM35217b, andSet);
                    ragVar = ragVar3;
                }
            }
            iAddAndGet = addAndGet(-iAddAndGet);
        } while (iAddAndGet != 0);
        if (jM35217b != 0) {
            ragVar.request(jM35217b);
        }
    }

    @Override // p001o.rag
    public void cancel() {
        if (this.f45095g) {
            return;
        }
        this.f45095g = true;
        m48095a();
    }

    /* renamed from: d */
    public final boolean m48097d() {
        return this.f45095g;
    }

    /* renamed from: g */
    public final boolean m48098g() {
        return this.f45096h;
    }

    /* renamed from: h */
    public final void m48099h(long j) {
        if (this.f45096h) {
            return;
        }
        if (get() != 0 || !compareAndSet(0, 1)) {
            ka1.m35216a(this.f45093e, j);
            m48095a();
            return;
        }
        long j2 = this.f45090b;
        if (j2 != Long.MAX_VALUE) {
            long j3 = j2 - j;
            if (j3 < 0) {
                wag.reportMoreProduced(j3);
                j3 = 0;
            }
            this.f45090b = j3;
        }
        if (decrementAndGet() == 0) {
            return;
        }
        m48096c();
    }

    /* renamed from: i */
    public final void m48100i(rag ragVar) {
        if (this.f45095g) {
            ragVar.cancel();
            return;
        }
        Objects.requireNonNull(ragVar, "s is null");
        if (get() != 0 || !compareAndSet(0, 1)) {
            rag ragVar2 = (rag) this.f45091c.getAndSet(ragVar);
            if (ragVar2 != null && this.f45094f) {
                ragVar2.cancel();
            }
            m48095a();
            return;
        }
        rag ragVar3 = this.f45089a;
        if (ragVar3 != null && this.f45094f) {
            ragVar3.cancel();
        }
        this.f45089a = ragVar;
        long j = this.f45090b;
        if (decrementAndGet() != 0) {
            m48096c();
        }
        if (j != 0) {
            ragVar.request(j);
        }
    }

    @Override // p001o.rag
    public final void request(long j) {
        if (!wag.validate(j) || this.f45096h) {
            return;
        }
        if (get() != 0 || !compareAndSet(0, 1)) {
            ka1.m35216a(this.f45092d, j);
            m48095a();
            return;
        }
        long j2 = this.f45090b;
        if (j2 != Long.MAX_VALUE) {
            long jM35217b = ka1.m35217b(j2, j);
            this.f45090b = jM35217b;
            if (jM35217b == Long.MAX_VALUE) {
                this.f45096h = true;
            }
        }
        rag ragVar = this.f45089a;
        if (decrementAndGet() != 0) {
            m48096c();
        }
        if (ragVar != null) {
            ragVar.request(j);
        }
    }
}
