package p001o;

import java.util.Iterator;
import java.util.Objects;

/* loaded from: classes6.dex */
public final class m57 extends s47 {

    /* renamed from: b */
    public final Iterable f34822b;

    /* renamed from: o.m57$a */
    public static abstract class AbstractC15225a extends tf1 {

        /* renamed from: a */
        public Iterator f34823a;

        /* renamed from: b */
        public volatile boolean f34824b;

        /* renamed from: c */
        public boolean f34825c;

        public AbstractC15225a(Iterator it) {
            this.f34823a = it;
        }

        /* renamed from: a */
        public abstract void mo38398a();

        /* renamed from: b */
        public abstract void mo38399b(long j);

        @Override // p001o.rag
        public final void cancel() {
            this.f34824b = true;
        }

        @Override // p001o.rtf
        public final void clear() {
            this.f34823a = null;
        }

        @Override // p001o.rtf
        public final boolean isEmpty() {
            Iterator it = this.f34823a;
            if (it == null) {
                return true;
            }
            if (!this.f34825c || it.hasNext()) {
                return false;
            }
            clear();
            return true;
        }

        @Override // p001o.rtf
        public final Object poll() {
            Iterator it = this.f34823a;
            if (it == null) {
                return null;
            }
            if (!this.f34825c) {
                this.f34825c = true;
            } else if (!it.hasNext()) {
                return null;
            }
            Object next = this.f34823a.next();
            Objects.requireNonNull(next, "Iterator.next() returned a null value");
            return next;
        }

        @Override // p001o.rag
        public final void request(long j) {
            if (wag.validate(j) && ka1.m35216a(this, j) == 0) {
                if (j == Long.MAX_VALUE) {
                    mo38398a();
                } else {
                    mo38399b(j);
                }
            }
        }

        @Override // p001o.f5e
        public final int requestFusion(int i) {
            return i & 1;
        }
    }

    /* renamed from: o.m57$b */
    public static final class C15226b extends AbstractC15225a {

        /* renamed from: d */
        public final kq3 f34826d;

        public C15226b(kq3 kq3Var, Iterator it) {
            super(it);
            this.f34826d = kq3Var;
        }

        @Override // p001o.m57.AbstractC15225a
        /* renamed from: a */
        public void mo38398a() {
            Iterator it = this.f34823a;
            kq3 kq3Var = this.f34826d;
            while (!this.f34824b) {
                try {
                    Object next = it.next();
                    if (this.f34824b) {
                        return;
                    }
                    if (next == null) {
                        kq3Var.onError(new NullPointerException("Iterator.next() returned a null value"));
                        return;
                    }
                    kq3Var.mo20248f(next);
                    if (this.f34824b) {
                        return;
                    }
                    try {
                        if (!it.hasNext()) {
                            if (this.f34824b) {
                                return;
                            }
                            kq3Var.onComplete();
                            return;
                        }
                    } catch (Throwable th) {
                        zk6.m59526b(th);
                        kq3Var.onError(th);
                        return;
                    }
                } catch (Throwable th2) {
                    zk6.m59526b(th2);
                    kq3Var.onError(th2);
                    return;
                }
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:35:0x005b, code lost:
        
            r9 = addAndGet(-r4);
         */
        @Override // p001o.m57.AbstractC15225a
        /* renamed from: b */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void mo38399b(long j) {
            Iterator it = this.f34823a;
            kq3 kq3Var = this.f34826d;
            do {
                long j2 = 0;
                while (true) {
                    if (j2 == j) {
                        j = get();
                        if (j2 == j) {
                            break;
                        }
                    } else {
                        if (this.f34824b) {
                            return;
                        }
                        try {
                            Object next = it.next();
                            if (this.f34824b) {
                                return;
                            }
                            if (next == null) {
                                kq3Var.onError(new NullPointerException("Iterator.next() returned a null value"));
                                return;
                            }
                            boolean zMo20248f = kq3Var.mo20248f(next);
                            if (this.f34824b) {
                                return;
                            }
                            try {
                                if (!it.hasNext()) {
                                    if (this.f34824b) {
                                        return;
                                    }
                                    kq3Var.onComplete();
                                    return;
                                } else if (zMo20248f) {
                                    j2++;
                                }
                            } catch (Throwable th) {
                                zk6.m59526b(th);
                                kq3Var.onError(th);
                                return;
                            }
                        } catch (Throwable th2) {
                            zk6.m59526b(th2);
                            kq3Var.onError(th2);
                            return;
                        }
                    }
                }
            } while (j != 0);
        }
    }

    /* renamed from: o.m57$c */
    public static final class C15227c extends AbstractC15225a {

        /* renamed from: d */
        public final qag f34827d;

        public C15227c(qag qagVar, Iterator it) {
            super(it);
            this.f34827d = qagVar;
        }

        @Override // p001o.m57.AbstractC15225a
        /* renamed from: a */
        public void mo38398a() {
            Iterator it = this.f34823a;
            qag qagVar = this.f34827d;
            while (!this.f34824b) {
                try {
                    Object next = it.next();
                    if (this.f34824b) {
                        return;
                    }
                    if (next == null) {
                        qagVar.onError(new NullPointerException("Iterator.next() returned a null value"));
                        return;
                    }
                    qagVar.mo18166e(next);
                    if (this.f34824b) {
                        return;
                    }
                    try {
                        if (!it.hasNext()) {
                            if (this.f34824b) {
                                return;
                            }
                            qagVar.onComplete();
                            return;
                        }
                    } catch (Throwable th) {
                        zk6.m59526b(th);
                        qagVar.onError(th);
                        return;
                    }
                } catch (Throwable th2) {
                    zk6.m59526b(th2);
                    qagVar.onError(th2);
                    return;
                }
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:34:0x0058, code lost:
        
            r9 = addAndGet(-r4);
         */
        @Override // p001o.m57.AbstractC15225a
        /* renamed from: b */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void mo38399b(long j) {
            Iterator it = this.f34823a;
            qag qagVar = this.f34827d;
            do {
                long j2 = 0;
                while (true) {
                    if (j2 == j) {
                        j = get();
                        if (j2 == j) {
                            break;
                        }
                    } else {
                        if (this.f34824b) {
                            return;
                        }
                        try {
                            Object next = it.next();
                            if (this.f34824b) {
                                return;
                            }
                            if (next == null) {
                                qagVar.onError(new NullPointerException("Iterator.next() returned a null value"));
                                return;
                            }
                            qagVar.mo18166e(next);
                            if (this.f34824b) {
                                return;
                            }
                            try {
                                if (!it.hasNext()) {
                                    if (this.f34824b) {
                                        return;
                                    }
                                    qagVar.onComplete();
                                    return;
                                }
                                j2++;
                            } catch (Throwable th) {
                                zk6.m59526b(th);
                                qagVar.onError(th);
                                return;
                            }
                        } catch (Throwable th2) {
                            zk6.m59526b(th2);
                            qagVar.onError(th2);
                            return;
                        }
                    }
                }
            } while (j != 0);
        }
    }

    public m57(Iterable iterable) {
        this.f34822b = iterable;
    }

    public static void i0(qag qagVar, Iterator it) {
        try {
            if (!it.hasNext()) {
                u66.complete(qagVar);
            } else if (qagVar instanceof kq3) {
                qagVar.mo18165b(new C15226b((kq3) qagVar, it));
            } else {
                qagVar.mo18165b(new C15227c(qagVar, it));
            }
        } catch (Throwable th) {
            zk6.m59526b(th);
            u66.error(th, qagVar);
        }
    }

    @Override // p001o.s47
    public void c0(qag qagVar) {
        try {
            i0(qagVar, this.f34822b.iterator());
        } catch (Throwable th) {
            zk6.m59526b(th);
            u66.error(th, qagVar);
        }
    }
}
