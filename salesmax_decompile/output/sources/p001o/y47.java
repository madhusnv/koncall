package p001o;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes6.dex */
public final class y47 extends o7 {

    /* renamed from: c */
    public final rl7 f54836c;

    /* renamed from: d */
    public final int f54837d;

    /* renamed from: e */
    public final lj6 f54838e;

    /* renamed from: o.y47$a */
    public static /* synthetic */ class C18310a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f54839a;

        static {
            int[] iArr = new int[lj6.values().length];
            f54839a = iArr;
            try {
                iArr[lj6.BOUNDARY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f54839a[lj6.END.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* renamed from: o.y47$b */
    public static abstract class AbstractC18311b extends AtomicInteger implements h67, InterfaceC18315f, rag {

        /* renamed from: b */
        public final rl7 f54841b;

        /* renamed from: c */
        public final int f54842c;

        /* renamed from: d */
        public final int f54843d;

        /* renamed from: e */
        public rag f54844e;

        /* renamed from: f */
        public int f54845f;

        /* renamed from: g */
        public rtf f54846g;

        /* renamed from: h */
        public volatile boolean f54847h;

        /* renamed from: q */
        public volatile boolean f54848q;

        /* renamed from: x */
        public volatile boolean f54850x;

        /* renamed from: y */
        public int f54851y;

        /* renamed from: a */
        public final C18314e f54840a = new C18314e(this);

        /* renamed from: s */
        public final ns0 f54849s = new ns0();

        public AbstractC18311b(rl7 rl7Var, int i) {
            this.f54841b = rl7Var;
            this.f54842c = i;
            this.f54843d = i - (i >> 2);
        }

        @Override // p001o.y47.InterfaceC18315f
        /* renamed from: a */
        public final void mo57191a() {
            this.f54850x = false;
            mo57192g();
        }

        @Override // p001o.h67, p001o.qag
        /* renamed from: b */
        public final void mo18165b(rag ragVar) {
            if (wag.validate(this.f54844e, ragVar)) {
                this.f54844e = ragVar;
                if (ragVar instanceof g5e) {
                    g5e g5eVar = (g5e) ragVar;
                    int iRequestFusion = g5eVar.requestFusion(7);
                    if (iRequestFusion == 1) {
                        this.f54851y = iRequestFusion;
                        this.f54846g = g5eVar;
                        this.f54847h = true;
                        mo57193h();
                        mo57192g();
                        return;
                    }
                    if (iRequestFusion == 2) {
                        this.f54851y = iRequestFusion;
                        this.f54846g = g5eVar;
                        mo57193h();
                        ragVar.request(this.f54842c);
                        return;
                    }
                }
                this.f54846g = new b1g(this.f54842c);
                mo57193h();
                ragVar.request(this.f54842c);
            }
        }

        @Override // p001o.qag
        /* renamed from: e */
        public final void mo18166e(Object obj) {
            if (this.f54851y == 2 || this.f54846g.offer(obj)) {
                mo57192g();
            } else {
                this.f54844e.cancel();
                onError(new IllegalStateException("Queue full?!"));
            }
        }

        /* renamed from: g */
        public abstract void mo57192g();

        /* renamed from: h */
        public abstract void mo57193h();

        @Override // p001o.qag
        public final void onComplete() {
            this.f54847h = true;
            mo57192g();
        }
    }

    /* renamed from: o.y47$c */
    public static final class C18312c extends AbstractC18311b {

        /* renamed from: H */
        public final qag f54852H;

        /* renamed from: L */
        public final boolean f54853L;

        public C18312c(qag qagVar, rl7 rl7Var, int i, boolean z) {
            super(rl7Var, i);
            this.f54852H = qagVar;
            this.f54853L = z;
        }

        @Override // p001o.y47.InterfaceC18315f
        /* renamed from: c */
        public void mo57194c(Throwable th) {
            if (this.f54849s.m41017c(th)) {
                if (!this.f54853L) {
                    this.f54844e.cancel();
                    this.f54847h = true;
                }
                this.f54850x = false;
                mo57192g();
            }
        }

        @Override // p001o.rag
        public void cancel() {
            if (this.f54848q) {
                return;
            }
            this.f54848q = true;
            this.f54840a.cancel();
            this.f54844e.cancel();
            this.f54849s.m41018d();
        }

        @Override // p001o.y47.InterfaceC18315f
        /* renamed from: d */
        public void mo57195d(Object obj) {
            this.f54852H.mo18166e(obj);
        }

        @Override // p001o.y47.AbstractC18311b
        /* renamed from: g */
        public void mo57192g() {
            Object obj;
            if (getAndIncrement() == 0) {
                while (!this.f54848q) {
                    if (!this.f54850x) {
                        boolean z = this.f54847h;
                        if (z && !this.f54853L && ((Throwable) this.f54849s.get()) != null) {
                            this.f54849s.m41021g(this.f54852H);
                            return;
                        }
                        try {
                            Object objPoll = this.f54846g.poll();
                            boolean z2 = objPoll == null;
                            if (z && z2) {
                                this.f54849s.m41021g(this.f54852H);
                                return;
                            }
                            if (!z2) {
                                try {
                                    Object objApply = this.f54841b.apply(objPoll);
                                    Objects.requireNonNull(objApply, "The mapper returned a null Publisher");
                                    g3e g3eVar = (g3e) objApply;
                                    if (this.f54851y != 1) {
                                        int i = this.f54845f + 1;
                                        if (i == this.f54843d) {
                                            this.f54845f = 0;
                                            this.f54844e.request(i);
                                        } else {
                                            this.f54845f = i;
                                        }
                                    }
                                    if (g3eVar instanceof idg) {
                                        try {
                                            obj = ((idg) g3eVar).get();
                                        } catch (Throwable th) {
                                            zk6.m59526b(th);
                                            this.f54849s.m41017c(th);
                                            if (!this.f54853L) {
                                                this.f54844e.cancel();
                                                this.f54849s.m41021g(this.f54852H);
                                                return;
                                            }
                                            obj = null;
                                        }
                                        if (obj == null) {
                                            continue;
                                        } else if (this.f54840a.m48098g()) {
                                            this.f54852H.mo18166e(obj);
                                        } else {
                                            this.f54850x = true;
                                            C18314e c18314e = this.f54840a;
                                            c18314e.m48100i(new C18316g(obj, c18314e));
                                        }
                                    } else {
                                        this.f54850x = true;
                                        g3eVar.mo28025a(this.f54840a);
                                    }
                                } catch (Throwable th2) {
                                    zk6.m59526b(th2);
                                    this.f54844e.cancel();
                                    this.f54849s.m41017c(th2);
                                    this.f54849s.m41021g(this.f54852H);
                                    return;
                                }
                            }
                        } catch (Throwable th3) {
                            zk6.m59526b(th3);
                            this.f54844e.cancel();
                            this.f54849s.m41017c(th3);
                            this.f54849s.m41021g(this.f54852H);
                            return;
                        }
                    }
                    if (decrementAndGet() == 0) {
                        return;
                    }
                }
            }
        }

        @Override // p001o.y47.AbstractC18311b
        /* renamed from: h */
        public void mo57193h() {
            this.f54852H.mo18165b(this);
        }

        @Override // p001o.qag
        public void onError(Throwable th) {
            if (this.f54849s.m41017c(th)) {
                this.f54847h = true;
                mo57192g();
            }
        }

        @Override // p001o.rag
        public void request(long j) {
            this.f54840a.request(j);
        }
    }

    /* renamed from: o.y47$d */
    public static final class C18313d extends AbstractC18311b {

        /* renamed from: H */
        public final qag f54854H;

        /* renamed from: L */
        public final AtomicInteger f54855L;

        public C18313d(qag qagVar, rl7 rl7Var, int i) {
            super(rl7Var, i);
            this.f54854H = qagVar;
            this.f54855L = new AtomicInteger();
        }

        @Override // p001o.y47.InterfaceC18315f
        /* renamed from: c */
        public void mo57194c(Throwable th) {
            this.f54844e.cancel();
            aw7.m17892d(this.f54854H, th, this, this.f54849s);
        }

        @Override // p001o.rag
        public void cancel() {
            if (this.f54848q) {
                return;
            }
            this.f54848q = true;
            this.f54840a.cancel();
            this.f54844e.cancel();
            this.f54849s.m41018d();
        }

        @Override // p001o.y47.InterfaceC18315f
        /* renamed from: d */
        public void mo57195d(Object obj) {
            aw7.m17894f(this.f54854H, obj, this, this.f54849s);
        }

        @Override // p001o.y47.AbstractC18311b
        /* renamed from: g */
        public void mo57192g() {
            if (this.f54855L.getAndIncrement() == 0) {
                while (!this.f54848q) {
                    if (!this.f54850x) {
                        boolean z = this.f54847h;
                        try {
                            Object objPoll = this.f54846g.poll();
                            boolean z2 = objPoll == null;
                            if (z && z2) {
                                this.f54854H.onComplete();
                                return;
                            }
                            if (!z2) {
                                try {
                                    Object objApply = this.f54841b.apply(objPoll);
                                    Objects.requireNonNull(objApply, "The mapper returned a null Publisher");
                                    g3e g3eVar = (g3e) objApply;
                                    if (this.f54851y != 1) {
                                        int i = this.f54845f + 1;
                                        if (i == this.f54843d) {
                                            this.f54845f = 0;
                                            this.f54844e.request(i);
                                        } else {
                                            this.f54845f = i;
                                        }
                                    }
                                    if (g3eVar instanceof idg) {
                                        try {
                                            Object obj = ((idg) g3eVar).get();
                                            if (obj == null) {
                                                continue;
                                            } else if (!this.f54840a.m48098g()) {
                                                this.f54850x = true;
                                                C18314e c18314e = this.f54840a;
                                                c18314e.m48100i(new C18316g(obj, c18314e));
                                            } else if (!aw7.m17894f(this.f54854H, obj, this, this.f54849s)) {
                                                return;
                                            }
                                        } catch (Throwable th) {
                                            zk6.m59526b(th);
                                            this.f54844e.cancel();
                                            this.f54849s.m41017c(th);
                                            this.f54849s.m41021g(this.f54854H);
                                            return;
                                        }
                                    } else {
                                        this.f54850x = true;
                                        g3eVar.mo28025a(this.f54840a);
                                    }
                                } catch (Throwable th2) {
                                    zk6.m59526b(th2);
                                    this.f54844e.cancel();
                                    this.f54849s.m41017c(th2);
                                    this.f54849s.m41021g(this.f54854H);
                                    return;
                                }
                            }
                        } catch (Throwable th3) {
                            zk6.m59526b(th3);
                            this.f54844e.cancel();
                            this.f54849s.m41017c(th3);
                            this.f54849s.m41021g(this.f54854H);
                            return;
                        }
                    }
                    if (this.f54855L.decrementAndGet() == 0) {
                        return;
                    }
                }
            }
        }

        @Override // p001o.y47.AbstractC18311b
        /* renamed from: h */
        public void mo57193h() {
            this.f54854H.mo18165b(this);
        }

        @Override // p001o.qag
        public void onError(Throwable th) {
            this.f54840a.cancel();
            aw7.m17892d(this.f54854H, th, this, this.f54849s);
        }

        @Override // p001o.rag
        public void request(long j) {
            this.f54840a.request(j);
        }
    }

    /* renamed from: o.y47$e */
    public static final class C18314e extends sag implements h67 {

        /* renamed from: q */
        public final InterfaceC18315f f54856q;

        /* renamed from: s */
        public long f54857s;

        public C18314e(InterfaceC18315f interfaceC18315f) {
            super(false);
            this.f54856q = interfaceC18315f;
        }

        @Override // p001o.h67, p001o.qag
        /* renamed from: b */
        public void mo18165b(rag ragVar) {
            m48100i(ragVar);
        }

        @Override // p001o.qag
        /* renamed from: e */
        public void mo18166e(Object obj) {
            this.f54857s++;
            this.f54856q.mo57195d(obj);
        }

        @Override // p001o.qag
        public void onComplete() {
            long j = this.f54857s;
            if (j != 0) {
                this.f54857s = 0L;
                m48099h(j);
            }
            this.f54856q.mo57191a();
        }

        @Override // p001o.qag
        public void onError(Throwable th) {
            long j = this.f54857s;
            if (j != 0) {
                this.f54857s = 0L;
                m48099h(j);
            }
            this.f54856q.mo57194c(th);
        }
    }

    /* renamed from: o.y47$f */
    public interface InterfaceC18315f {
        /* renamed from: a */
        void mo57191a();

        /* renamed from: c */
        void mo57194c(Throwable th);

        /* renamed from: d */
        void mo57195d(Object obj);
    }

    /* renamed from: o.y47$g */
    public static final class C18316g implements rag {

        /* renamed from: a */
        public final qag f54858a;

        /* renamed from: b */
        public final Object f54859b;

        /* renamed from: c */
        public boolean f54860c;

        public C18316g(Object obj, qag qagVar) {
            this.f54859b = obj;
            this.f54858a = qagVar;
        }

        @Override // p001o.rag
        public void cancel() {
        }

        @Override // p001o.rag
        public void request(long j) {
            if (j <= 0 || this.f54860c) {
                return;
            }
            this.f54860c = true;
            qag qagVar = this.f54858a;
            qagVar.mo18166e(this.f54859b);
            qagVar.onComplete();
        }
    }

    public y47(s47 s47Var, rl7 rl7Var, int i, lj6 lj6Var) {
        super(s47Var);
        this.f54836c = rl7Var;
        this.f54837d = i;
        this.f54838e = lj6Var;
    }

    public static qag i0(qag qagVar, rl7 rl7Var, int i, lj6 lj6Var) {
        int i2 = C18310a.f54839a[lj6Var.ordinal()];
        return i2 != 1 ? i2 != 2 ? new C18313d(qagVar, rl7Var, i) : new C18312c(qagVar, rl7Var, i, true) : new C18312c(qagVar, rl7Var, i, false);
    }

    @Override // p001o.s47
    public void c0(qag qagVar) {
        if (d67.m22360b(this.f37840b, qagVar, this.f54836c)) {
            return;
        }
        this.f37840b.mo28025a(i0(qagVar, this.f54836c, this.f54837d, this.f54838e));
    }
}
