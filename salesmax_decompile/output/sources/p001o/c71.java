package p001o;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes3.dex */
public final class c71 {

    /* renamed from: b */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f17427b = AtomicReferenceFieldUpdater.newUpdater(c71.class, Object.class, "a");

    /* renamed from: a */
    public volatile /* synthetic */ Object f17428a = null;

    /* renamed from: o.c71$a */
    public static final class C12582a extends o64 {

        /* renamed from: a */
        public Object f17429a;

        /* renamed from: b */
        public /* synthetic */ Object f17430b;

        /* renamed from: d */
        public int f17432d;

        public C12582a(n64 n64Var) {
            super(n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            this.f17430b = obj;
            this.f17432d |= Integer.MIN_VALUE;
            return c71.this.m20360d(null, this);
        }
    }

    /* renamed from: o.c71$b */
    public static final class C12583b extends o64 {

        /* renamed from: a */
        public int f17433a;

        /* renamed from: b */
        public /* synthetic */ Object f17434b;

        /* renamed from: d */
        public int f17436d;

        public C12583b(n64 n64Var) {
            super(n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            this.f17434b = obj;
            this.f17436d |= Integer.MIN_VALUE;
            return c71.this.m20361e(null, this);
        }
    }

    /* renamed from: b */
    public final void m20358b(Throwable th) {
        kl3 kl3Var = (kl3) f17427b.getAndSet(this, null);
        if (kl3Var == null) {
            return;
        }
        if (th != null) {
            kl3Var.mo35825d(th);
        } else {
            kl3Var.mo35824c();
        }
    }

    /* renamed from: c */
    public final void m20359c() {
        kl3 kl3Var = (kl3) f17427b.getAndSet(this, null);
        if (kl3Var != null) {
            kl3Var.mo35824c();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m20360d(uk7 uk7Var, n64 n64Var) {
        C12582a c12582a;
        c71 c71Var;
        if (n64Var instanceof C12582a) {
            c12582a = (C12582a) n64Var;
            int i = c12582a.f17432d;
            if ((i & Integer.MIN_VALUE) != 0) {
                c12582a.f17432d = i - Integer.MIN_VALUE;
            } else {
                c12582a = new C12582a(n64Var);
            }
        }
        Object objM20361e = c12582a.f17430b;
        Object objM51918f = uq8.m51918f();
        int i2 = c12582a.f17432d;
        if (i2 == 0) {
            wre.m54934b(objM20361e);
            c12582a.f17429a = this;
            c12582a.f17432d = 1;
            objM20361e = m20361e(uk7Var, c12582a);
            if (objM20361e == objM51918f) {
                return objM51918f;
            }
            c71Var = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c71Var = (c71) c12582a.f17429a;
            wre.m54934b(objM20361e);
        }
        if (((Boolean) objM20361e).booleanValue()) {
            return y3i.f54824a;
        }
        c71Var.m20359c();
        return y3i.f54824a;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m20361e(uk7 uk7Var, n64 n64Var) {
        C12583b c12583b;
        int i;
        if (n64Var instanceof C12583b) {
            c12583b = (C12583b) n64Var;
            int i2 = c12583b.f17436d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c12583b.f17436d = i2 - Integer.MIN_VALUE;
            } else {
                c12583b = new C12583b(n64Var);
            }
        }
        Object obj = c12583b.f17434b;
        Object objM51918f = uq8.m51918f();
        int i3 = c12583b.f17436d;
        if (i3 == 0) {
            wre.m54934b(obj);
            kl3 kl3VarM16544b = a79.m16544b(null, 1, null);
            if (j9.m33417a(f17427b, this, null, kl3VarM16544b) && ((Boolean) uk7Var.invoke()).booleanValue()) {
                c12583b.f17433a = 1;
                c12583b.f17436d = 1;
                if (kl3VarM16544b.d0(c12583b) == objM51918f) {
                    return objM51918f;
                }
                i = 1;
            } else {
                i = 0;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i = c12583b.f17433a;
            wre.m54934b(obj);
        }
        return ml1.m39301a(i != 0);
    }
}
