package androidx.lifecycle;

import androidx.lifecycle.AbstractC2139h;
import p001o.eu5;
import p001o.gge;
import p001o.h84;
import p001o.i84;
import p001o.jgg;
import p001o.jpa;
import p001o.n64;
import p001o.n75;
import p001o.nl7;
import p001o.nqb;
import p001o.p69;
import p001o.pm1;
import p001o.rm1;
import p001o.sq8;
import p001o.tq8;
import p001o.tqb;
import p001o.uq8;
import p001o.vre;
import p001o.wre;
import p001o.xb2;
import p001o.xca;
import p001o.y3i;
import p001o.zb2;

/* renamed from: androidx.lifecycle.r */
/* loaded from: classes2.dex */
public abstract class AbstractC2149r {

    /* renamed from: androidx.lifecycle.r$a */
    public static final class a extends jgg implements nl7 {

        /* renamed from: a */
        public int f7716a;

        /* renamed from: b */
        public /* synthetic */ Object f7717b;

        /* renamed from: c */
        public final /* synthetic */ AbstractC2139h f7718c;

        /* renamed from: d */
        public final /* synthetic */ AbstractC2139h.b f7719d;

        /* renamed from: e */
        public final /* synthetic */ nl7 f7720e;

        /* renamed from: androidx.lifecycle.r$a$a, reason: collision with other inner class name */
        public static final class C19563a extends jgg implements nl7 {

            /* renamed from: a */
            public Object f7721a;

            /* renamed from: b */
            public Object f7722b;

            /* renamed from: c */
            public Object f7723c;

            /* renamed from: d */
            public Object f7724d;

            /* renamed from: e */
            public Object f7725e;

            /* renamed from: f */
            public Object f7726f;

            /* renamed from: g */
            public int f7727g;

            /* renamed from: h */
            public final /* synthetic */ AbstractC2139h f7728h;

            /* renamed from: q */
            public final /* synthetic */ AbstractC2139h.b f7729q;

            /* renamed from: s */
            public final /* synthetic */ h84 f7730s;

            /* renamed from: x */
            public final /* synthetic */ nl7 f7731x;

            /* renamed from: androidx.lifecycle.r$a$a$a, reason: collision with other inner class name */
            public static final class C19564a implements InterfaceC2142k {

                /* renamed from: a */
                public final /* synthetic */ AbstractC2139h.a f7732a;

                /* renamed from: b */
                public final /* synthetic */ gge f7733b;

                /* renamed from: c */
                public final /* synthetic */ h84 f7734c;

                /* renamed from: d */
                public final /* synthetic */ AbstractC2139h.a f7735d;

                /* renamed from: e */
                public final /* synthetic */ xb2 f7736e;

                /* renamed from: f */
                public final /* synthetic */ nqb f7737f;

                /* renamed from: g */
                public final /* synthetic */ nl7 f7738g;

                /* renamed from: androidx.lifecycle.r$a$a$a$a, reason: collision with other inner class name */
                public static final class C19565a extends jgg implements nl7 {

                    /* renamed from: a */
                    public Object f7739a;

                    /* renamed from: b */
                    public Object f7740b;

                    /* renamed from: c */
                    public int f7741c;

                    /* renamed from: d */
                    public final /* synthetic */ nqb f7742d;

                    /* renamed from: e */
                    public final /* synthetic */ nl7 f7743e;

                    /* renamed from: androidx.lifecycle.r$a$a$a$a$a, reason: collision with other inner class name */
                    public static final class C19566a extends jgg implements nl7 {

                        /* renamed from: a */
                        public int f7744a;

                        /* renamed from: b */
                        public /* synthetic */ Object f7745b;

                        /* renamed from: c */
                        public final /* synthetic */ nl7 f7746c;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        public C19566a(nl7 nl7Var, n64 n64Var) {
                            super(2, n64Var);
                            this.f7746c = nl7Var;
                        }

                        @Override // p001o.vb1
                        public final n64 create(Object obj, n64 n64Var) {
                            C19566a c19566a = new C19566a(this.f7746c, n64Var);
                            c19566a.f7745b = obj;
                            return c19566a;
                        }

                        @Override // p001o.vb1
                        public final Object invokeSuspend(Object obj) {
                            Object objM51918f = uq8.m51918f();
                            int i = this.f7744a;
                            if (i == 0) {
                                wre.m54934b(obj);
                                h84 h84Var = (h84) this.f7745b;
                                nl7 nl7Var = this.f7746c;
                                this.f7744a = 1;
                                if (nl7Var.invoke(h84Var, this) == objM51918f) {
                                    return objM51918f;
                                }
                            } else {
                                if (i != 1) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                wre.m54934b(obj);
                            }
                            return y3i.f54824a;
                        }

                        @Override // p001o.nl7
                        public final Object invoke(h84 h84Var, n64 n64Var) {
                            return ((C19566a) create(h84Var, n64Var)).invokeSuspend(y3i.f54824a);
                        }
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public C19565a(nqb nqbVar, nl7 nl7Var, n64 n64Var) {
                        super(2, n64Var);
                        this.f7742d = nqbVar;
                        this.f7743e = nl7Var;
                    }

                    @Override // p001o.vb1
                    public final n64 create(Object obj, n64 n64Var) {
                        return new C19565a(this.f7742d, this.f7743e, n64Var);
                    }

                    @Override // p001o.vb1
                    public final Object invokeSuspend(Object obj) throws Throwable {
                        nqb nqbVar;
                        nl7 nl7Var;
                        nqb nqbVar2;
                        Throwable th;
                        Object objM51918f = uq8.m51918f();
                        int i = this.f7741c;
                        try {
                            if (i == 0) {
                                wre.m54934b(obj);
                                nqbVar = this.f7742d;
                                nl7Var = this.f7743e;
                                this.f7739a = nqbVar;
                                this.f7740b = nl7Var;
                                this.f7741c = 1;
                                if (nqbVar.mo40922b(null, this) == objM51918f) {
                                    return objM51918f;
                                }
                            } else {
                                if (i != 1) {
                                    if (i != 2) {
                                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                    }
                                    nqbVar2 = (nqb) this.f7739a;
                                    try {
                                        wre.m54934b(obj);
                                        y3i y3iVar = y3i.f54824a;
                                        nqbVar2.mo40923c(null);
                                        return y3i.f54824a;
                                    } catch (Throwable th2) {
                                        th = th2;
                                        nqbVar2.mo40923c(null);
                                        throw th;
                                    }
                                }
                                nl7Var = (nl7) this.f7740b;
                                nqb nqbVar3 = (nqb) this.f7739a;
                                wre.m54934b(obj);
                                nqbVar = nqbVar3;
                            }
                            C19566a c19566a = new C19566a(nl7Var, null);
                            this.f7739a = nqbVar;
                            this.f7740b = null;
                            this.f7741c = 2;
                            if (i84.m31711e(c19566a, this) == objM51918f) {
                                return objM51918f;
                            }
                            nqbVar2 = nqbVar;
                            y3i y3iVar2 = y3i.f54824a;
                            nqbVar2.mo40923c(null);
                            return y3i.f54824a;
                        } catch (Throwable th3) {
                            nqbVar2 = nqbVar;
                            th = th3;
                            nqbVar2.mo40923c(null);
                            throw th;
                        }
                    }

                    @Override // p001o.nl7
                    public final Object invoke(h84 h84Var, n64 n64Var) {
                        return ((C19565a) create(h84Var, n64Var)).invokeSuspend(y3i.f54824a);
                    }
                }

                public C19564a(AbstractC2139h.a aVar, gge ggeVar, h84 h84Var, AbstractC2139h.a aVar2, xb2 xb2Var, nqb nqbVar, nl7 nl7Var) {
                    this.f7732a = aVar;
                    this.f7733b = ggeVar;
                    this.f7734c = h84Var;
                    this.f7735d = aVar2;
                    this.f7736e = xb2Var;
                    this.f7737f = nqbVar;
                    this.f7738g = nl7Var;
                }

                @Override // androidx.lifecycle.InterfaceC2142k
                /* renamed from: o */
                public final void mo3717o(xca xcaVar, AbstractC2139h.a aVar) {
                    sq8.m48649h(xcaVar, "<anonymous parameter 0>");
                    sq8.m48649h(aVar, "event");
                    if (aVar == this.f7732a) {
                        this.f7733b.f25106a = rm1.m46952d(this.f7734c, null, null, new C19565a(this.f7737f, this.f7738g, null), 3, null);
                        return;
                    }
                    if (aVar == this.f7735d) {
                        p69 p69Var = (p69) this.f7733b.f25106a;
                        if (p69Var != null) {
                            p69.C15966a.m42999a(p69Var, null, 1, null);
                        }
                        this.f7733b.f25106a = null;
                    }
                    if (aVar == AbstractC2139h.a.ON_DESTROY) {
                        xb2 xb2Var = this.f7736e;
                        vre.C17665a c17665a = vre.f50797b;
                        xb2Var.resumeWith(vre.m53351b(y3i.f54824a));
                    }
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C19563a(AbstractC2139h abstractC2139h, AbstractC2139h.b bVar, h84 h84Var, nl7 nl7Var, n64 n64Var) {
                super(2, n64Var);
                this.f7728h = abstractC2139h;
                this.f7729q = bVar;
                this.f7730s = h84Var;
                this.f7731x = nl7Var;
            }

            @Override // p001o.vb1
            public final n64 create(Object obj, n64 n64Var) {
                return new C19563a(this.f7728h, this.f7729q, this.f7730s, this.f7731x, n64Var);
            }

            /* JADX WARN: Removed duplicated region for block: B:25:0x00b2  */
            /* JADX WARN: Removed duplicated region for block: B:28:0x00bc  */
            /* JADX WARN: Removed duplicated region for block: B:35:0x00cd  */
            /* JADX WARN: Removed duplicated region for block: B:38:0x00d7  */
            @Override // p001o.vb1
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invokeSuspend(Object obj) throws Throwable {
                gge ggeVar;
                gge ggeVar2;
                p69 p69Var;
                InterfaceC2142k interfaceC2142k;
                p69 p69Var2;
                InterfaceC2142k interfaceC2142k2;
                Object objM51918f = uq8.m51918f();
                int i = this.f7727g;
                if (i != 0) {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ggeVar2 = (gge) this.f7722b;
                    ggeVar = (gge) this.f7721a;
                    try {
                        wre.m54934b(obj);
                        p69Var2 = (p69) ggeVar.f25106a;
                        if (p69Var2 != null) {
                            p69.C15966a.m42999a(p69Var2, null, 1, null);
                        }
                        interfaceC2142k2 = (InterfaceC2142k) ggeVar2.f25106a;
                        if (interfaceC2142k2 != null) {
                            this.f7728h.mo6524d(interfaceC2142k2);
                        }
                        return y3i.f54824a;
                    } catch (Throwable th) {
                        th = th;
                        p69Var = (p69) ggeVar.f25106a;
                        if (p69Var != null) {
                        }
                        interfaceC2142k = (InterfaceC2142k) ggeVar2.f25106a;
                        if (interfaceC2142k != null) {
                        }
                        throw th;
                    }
                }
                wre.m54934b(obj);
                if (this.f7728h.mo6522b() == AbstractC2139h.b.DESTROYED) {
                    return y3i.f54824a;
                }
                gge ggeVar3 = new gge();
                gge ggeVar4 = new gge();
                try {
                    AbstractC2139h.b bVar = this.f7729q;
                    AbstractC2139h abstractC2139h = this.f7728h;
                    h84 h84Var = this.f7730s;
                    nl7 nl7Var = this.f7731x;
                    this.f7721a = ggeVar3;
                    this.f7722b = ggeVar4;
                    this.f7723c = bVar;
                    this.f7724d = abstractC2139h;
                    this.f7725e = h84Var;
                    this.f7726f = nl7Var;
                    this.f7727g = 1;
                    zb2 zb2Var = new zb2(tq8.m50336c(this), 1);
                    zb2Var.m59116E();
                    AbstractC2139h.a.C19561a c19561a = AbstractC2139h.a.Companion;
                    C19564a c19564a = new C19564a(c19561a.m6528d(bVar), ggeVar3, h84Var, c19561a.m6525a(bVar), zb2Var, tqb.m50340b(false, 1, null), nl7Var);
                    ggeVar4.f25106a = c19564a;
                    sq8.m48647f(c19564a, "null cannot be cast to non-null type androidx.lifecycle.LifecycleEventObserver");
                    abstractC2139h.mo6521a(c19564a);
                    Object objM59140v = zb2Var.m59140v();
                    if (objM59140v == uq8.m51918f()) {
                        n75.m40201c(this);
                    }
                    if (objM59140v == objM51918f) {
                        return objM51918f;
                    }
                    ggeVar = ggeVar3;
                    ggeVar2 = ggeVar4;
                    p69Var2 = (p69) ggeVar.f25106a;
                    if (p69Var2 != null) {
                    }
                    interfaceC2142k2 = (InterfaceC2142k) ggeVar2.f25106a;
                    if (interfaceC2142k2 != null) {
                    }
                    return y3i.f54824a;
                } catch (Throwable th2) {
                    th = th2;
                    ggeVar = ggeVar3;
                    ggeVar2 = ggeVar4;
                    p69Var = (p69) ggeVar.f25106a;
                    if (p69Var != null) {
                        p69.C15966a.m42999a(p69Var, null, 1, null);
                    }
                    interfaceC2142k = (InterfaceC2142k) ggeVar2.f25106a;
                    if (interfaceC2142k != null) {
                        this.f7728h.mo6524d(interfaceC2142k);
                    }
                    throw th;
                }
            }

            @Override // p001o.nl7
            public final Object invoke(h84 h84Var, n64 n64Var) {
                return ((C19563a) create(h84Var, n64Var)).invokeSuspend(y3i.f54824a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(AbstractC2139h abstractC2139h, AbstractC2139h.b bVar, nl7 nl7Var, n64 n64Var) {
            super(2, n64Var);
            this.f7718c = abstractC2139h;
            this.f7719d = bVar;
            this.f7720e = nl7Var;
        }

        @Override // p001o.vb1
        public final n64 create(Object obj, n64 n64Var) {
            a aVar = new a(this.f7718c, this.f7719d, this.f7720e, n64Var);
            aVar.f7717b = obj;
            return aVar;
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            Object objM51918f = uq8.m51918f();
            int i = this.f7716a;
            if (i == 0) {
                wre.m54934b(obj);
                h84 h84Var = (h84) this.f7717b;
                jpa jpaVarV0 = eu5.m25612c().v0();
                C19563a c19563a = new C19563a(this.f7718c, this.f7719d, h84Var, this.f7720e, null);
                this.f7716a = 1;
                if (pm1.m43867g(jpaVarV0, c19563a, this) == objM51918f) {
                    return objM51918f;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                wre.m54934b(obj);
            }
            return y3i.f54824a;
        }

        @Override // p001o.nl7
        public final Object invoke(h84 h84Var, n64 n64Var) {
            return ((a) create(h84Var, n64Var)).invokeSuspend(y3i.f54824a);
        }
    }

    /* renamed from: a */
    public static final Object m6568a(AbstractC2139h abstractC2139h, AbstractC2139h.b bVar, nl7 nl7Var, n64 n64Var) {
        if (!(bVar != AbstractC2139h.b.INITIALIZED)) {
            throw new IllegalArgumentException("repeatOnLifecycle cannot start work with the INITIALIZED lifecycle state.".toString());
        }
        if (abstractC2139h.mo6522b() == AbstractC2139h.b.DESTROYED) {
            return y3i.f54824a;
        }
        Object objM31711e = i84.m31711e(new a(abstractC2139h, bVar, nl7Var, null), n64Var);
        return objM31711e == uq8.m51918f() ? objM31711e : y3i.f54824a;
    }

    /* renamed from: b */
    public static final Object m6569b(xca xcaVar, AbstractC2139h.b bVar, nl7 nl7Var, n64 n64Var) {
        Object objM6568a = m6568a(xcaVar.getLifecycle(), bVar, nl7Var, n64Var);
        return objM6568a == uq8.m51918f() ? objM6568a : y3i.f54824a;
    }
}
