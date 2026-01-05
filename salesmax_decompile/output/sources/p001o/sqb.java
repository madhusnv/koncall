package p001o;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import p001o.sqb;

/* loaded from: classes6.dex */
public class sqb extends bdf implements nqb {

    /* renamed from: i */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f45777i = AtomicReferenceFieldUpdater.newUpdater(sqb.class, Object.class, "owner$volatile");

    /* renamed from: h */
    public final ql7 f45778h;
    private volatile /* synthetic */ Object owner$volatile;

    /* renamed from: o.sqb$a */
    public final class C16894a implements xb2, x3j {

        /* renamed from: a */
        public final zb2 f45779a;

        /* renamed from: b */
        public final Object f45780b;

        public C16894a(zb2 zb2Var, Object obj) {
            this.f45779a = zb2Var;
            this.f45780b = obj;
        }

        /* renamed from: h */
        public static final y3i m48682h(sqb sqbVar, C16894a c16894a, Throwable th) {
            sqbVar.mo40923c(c16894a.f45780b);
            return y3i.f54824a;
        }

        /* renamed from: k */
        public static final y3i m48683k(sqb sqbVar, C16894a c16894a, Throwable th, y3i y3iVar, q74 q74Var) {
            sqb.m48674x().set(sqbVar, c16894a.f45780b);
            sqbVar.mo40923c(c16894a.f45780b);
            return y3i.f54824a;
        }

        @Override // p001o.xb2
        /* renamed from: F */
        public void mo48686F(Object obj) {
            this.f45779a.mo48686F(obj);
        }

        @Override // p001o.xb2
        /* renamed from: a */
        public boolean mo48687a() {
            return this.f45779a.mo48687a();
        }

        @Override // p001o.x3j
        /* renamed from: c */
        public void mo23483c(ibf ibfVar, int i) {
            this.f45779a.mo23483c(ibfVar, i);
        }

        @Override // p001o.xb2
        public boolean cancel(Throwable th) {
            return this.f45779a.cancel(th);
        }

        @Override // p001o.xb2
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public void mo48685B(y3i y3iVar, xk7 xk7Var) {
            this.f45779a.mo48685B(y3iVar, xk7Var);
        }

        @Override // p001o.xb2
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public void mo48684A(y3i y3iVar, ql7 ql7Var) {
            sqb.m48674x().set(sqb.this, this.f45780b);
            zb2 zb2Var = this.f45779a;
            final sqb sqbVar = sqb.this;
            zb2Var.mo48685B(y3iVar, new xk7() { // from class: o.qqb
                @Override // p001o.xk7
                public final Object invoke(Object obj) {
                    return sqb.C16894a.m48682h(sqbVar, this, (Throwable) obj);
                }
            });
        }

        @Override // p001o.n64
        public q74 getContext() {
            return this.f45779a.getContext();
        }

        @Override // p001o.xb2
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public void mo48688e(z74 z74Var, y3i y3iVar) {
            this.f45779a.mo48688e(z74Var, y3iVar);
        }

        @Override // p001o.xb2
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public Object mo48693p(y3i y3iVar, Object obj, ql7 ql7Var) {
            final sqb sqbVar = sqb.this;
            Object objMo48693p = this.f45779a.mo48693p(y3iVar, obj, new ql7() { // from class: o.rqb
                @Override // p001o.ql7
                public final Object invoke(Object obj2, Object obj3, Object obj4) {
                    return sqb.C16894a.m48683k(sqbVar, this, (Throwable) obj2, (y3i) obj3, (q74) obj4);
                }
            });
            if (objMo48693p != null) {
                sqb.m48674x().set(sqb.this, this.f45780b);
            }
            return objMo48693p;
        }

        @Override // p001o.n64
        public void resumeWith(Object obj) {
            this.f45779a.resumeWith(obj);
        }

        @Override // p001o.xb2
        /* renamed from: y */
        public void mo48694y(xk7 xk7Var) {
            this.f45779a.mo48694y(xk7Var);
        }
    }

    public sqb(boolean z) {
        super(1, z ? 1 : 0);
        this.owner$volatile = z ? null : tqb.f47615a;
        this.f45778h = new ql7() { // from class: o.oqb
            @Override // p001o.ql7
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return sqb.m48669C(this.f38729a, (xbf) obj, obj2, obj3);
            }
        };
    }

    /* renamed from: A */
    public static /* synthetic */ Object m48668A(sqb sqbVar, Object obj, n64 n64Var) {
        if (sqbVar.m48676E(obj)) {
            return y3i.f54824a;
        }
        Object objM48675B = sqbVar.m48675B(obj, n64Var);
        return objM48675B == uq8.m51918f() ? objM48675B : y3i.f54824a;
    }

    /* renamed from: C */
    public static final ql7 m48669C(final sqb sqbVar, xbf xbfVar, final Object obj, Object obj2) {
        return new ql7() { // from class: o.pqb
            @Override // p001o.ql7
            public final Object invoke(Object obj3, Object obj4, Object obj5) {
                return sqb.m48670D(this.f40417a, obj, (Throwable) obj3, obj4, (q74) obj5);
            }
        };
    }

    /* renamed from: D */
    public static final y3i m48670D(sqb sqbVar, Object obj, Throwable th, Object obj2, q74 q74Var) {
        sqbVar.mo40923c(obj);
        return y3i.f54824a;
    }

    /* renamed from: x */
    public static final /* synthetic */ AtomicReferenceFieldUpdater m48674x() {
        return f45777i;
    }

    /* renamed from: B */
    public final Object m48675B(Object obj, n64 n64Var) {
        zb2 zb2VarM18561b = bc2.m18561b(tq8.m50336c(n64Var));
        try {
            m18675f(new C16894a(zb2VarM18561b, obj));
            Object objM59140v = zb2VarM18561b.m59140v();
            if (objM59140v == uq8.m51918f()) {
                n75.m40201c(n64Var);
            }
            return objM59140v == uq8.m51918f() ? objM59140v : y3i.f54824a;
        } catch (Throwable th) {
            zb2VarM18561b.m59124O();
            throw th;
        }
    }

    /* renamed from: E */
    public boolean m48676E(Object obj) {
        int iM48677F = m48677F(obj);
        if (iM48677F == 0) {
            return true;
        }
        if (iM48677F == 1) {
            return false;
        }
        if (iM48677F != 2) {
            throw new IllegalStateException("unexpected".toString());
        }
        throw new IllegalStateException(("This mutex is already locked by the specified owner: " + obj).toString());
    }

    /* renamed from: F */
    public final int m48677F(Object obj) {
        while (!m18681r()) {
            if (obj == null) {
                return 1;
            }
            int iM48678y = m48678y(obj);
            if (iM48678y == 1) {
                return 2;
            }
            if (iM48678y == 2) {
                return 1;
            }
        }
        f45777i.set(this, obj);
        return 0;
    }

    @Override // p001o.nqb
    /* renamed from: b */
    public Object mo40922b(Object obj, n64 n64Var) {
        return m48668A(this, obj, n64Var);
    }

    @Override // p001o.nqb
    /* renamed from: c */
    public void mo40923c(Object obj) {
        while (m48679z()) {
            Object obj2 = f45777i.get(this);
            if (obj2 != tqb.f47615a) {
                if (!(obj2 == obj || obj == null)) {
                    throw new IllegalStateException(("This mutex is locked by " + obj2 + ", but " + obj + " is expected").toString());
                }
                if (j9.m33417a(f45777i, this, obj2, tqb.f47615a)) {
                    release();
                    return;
                }
            }
        }
        throw new IllegalStateException("This mutex is not locked".toString());
    }

    public String toString() {
        return "Mutex@" + o75.m41658b(this) + "[isLocked=" + m48679z() + ",owner=" + f45777i.get(this) + ']';
    }

    /* renamed from: y */
    public final int m48678y(Object obj) {
        while (m48679z()) {
            Object obj2 = f45777i.get(this);
            if (obj2 != tqb.f47615a) {
                return obj2 == obj ? 1 : 2;
            }
        }
        return 0;
    }

    /* renamed from: z */
    public boolean m48679z() {
        return m18680k() == 0;
    }
}
