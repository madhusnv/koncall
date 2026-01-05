package p001o;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes6.dex */
public final class x47 extends s47 {

    /* renamed from: b */
    public final g3e[] f53168b;

    /* renamed from: c */
    public final boolean f53169c;

    /* renamed from: o.x47$a */
    public static final class C18046a extends sag implements h67 {

        /* renamed from: H */
        public int f53170H;

        /* renamed from: L */
        public List f53171L;

        /* renamed from: M */
        public long f53172M;

        /* renamed from: q */
        public final qag f53173q;

        /* renamed from: s */
        public final g3e[] f53174s;

        /* renamed from: x */
        public final boolean f53175x;

        /* renamed from: y */
        public final AtomicInteger f53176y;

        public C18046a(g3e[] g3eVarArr, boolean z, qag qagVar) {
            super(false);
            this.f53173q = qagVar;
            this.f53174s = g3eVarArr;
            this.f53175x = z;
            this.f53176y = new AtomicInteger();
        }

        @Override // p001o.h67, p001o.qag
        /* renamed from: b */
        public void mo18165b(rag ragVar) {
            m48100i(ragVar);
        }

        @Override // p001o.qag
        /* renamed from: e */
        public void mo18166e(Object obj) {
            this.f53172M++;
            this.f53173q.mo18166e(obj);
        }

        @Override // p001o.qag
        public void onComplete() {
            if (this.f53176y.getAndIncrement() == 0) {
                g3e[] g3eVarArr = this.f53174s;
                int length = g3eVarArr.length;
                int i = this.f53170H;
                while (i != length) {
                    g3e g3eVar = g3eVarArr[i];
                    if (g3eVar == null) {
                        NullPointerException nullPointerException = new NullPointerException("A Publisher entry is null");
                        if (!this.f53175x) {
                            this.f53173q.onError(nullPointerException);
                            return;
                        }
                        List arrayList = this.f53171L;
                        if (arrayList == null) {
                            arrayList = new ArrayList((length - i) + 1);
                            this.f53171L = arrayList;
                        }
                        arrayList.add(nullPointerException);
                        i++;
                    } else {
                        long j = this.f53172M;
                        if (j != 0) {
                            this.f53172M = 0L;
                            m48099h(j);
                        }
                        g3eVar.mo28025a(this);
                        i++;
                        this.f53170H = i;
                        if (this.f53176y.decrementAndGet() == 0) {
                            return;
                        }
                    }
                }
                List list = this.f53171L;
                if (list == null) {
                    this.f53173q.onComplete();
                } else if (list.size() == 1) {
                    this.f53173q.onError((Throwable) list.get(0));
                } else {
                    this.f53173q.onError(new mo3(list));
                }
            }
        }

        @Override // p001o.qag
        public void onError(Throwable th) {
            if (!this.f53175x) {
                this.f53173q.onError(th);
                return;
            }
            List arrayList = this.f53171L;
            if (arrayList == null) {
                arrayList = new ArrayList((this.f53174s.length - this.f53170H) + 1);
                this.f53171L = arrayList;
            }
            arrayList.add(th);
            onComplete();
        }
    }

    public x47(g3e[] g3eVarArr, boolean z) {
        this.f53168b = g3eVarArr;
        this.f53169c = z;
    }

    @Override // p001o.s47
    public void c0(qag qagVar) {
        C18046a c18046a = new C18046a(this.f53168b, this.f53169c, qagVar);
        qagVar.mo18165b(c18046a);
        c18046a.onComplete();
    }
}
