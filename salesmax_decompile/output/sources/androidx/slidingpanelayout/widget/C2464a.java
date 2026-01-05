package androidx.slidingpanelayout.widget;

import android.app.Activity;
import java.util.Iterator;
import java.util.concurrent.Executor;
import p001o.a9j;
import p001o.e47;
import p001o.h84;
import p001o.i84;
import p001o.jgg;
import p001o.l77;
import p001o.n64;
import p001o.nl7;
import p001o.o64;
import p001o.ou5;
import p001o.p69;
import p001o.rm1;
import p001o.sq8;
import p001o.taj;
import p001o.uq8;
import p001o.v37;
import p001o.vl6;
import p001o.wre;
import p001o.y3i;
import p001o.z37;

/* renamed from: androidx.slidingpanelayout.widget.a */
/* loaded from: classes2.dex */
public final class C2464a {

    /* renamed from: a */
    public final a9j f10235a;

    /* renamed from: b */
    public final Executor f10236b;

    /* renamed from: c */
    public p69 f10237c;

    /* renamed from: d */
    public a f10238d;

    /* renamed from: androidx.slidingpanelayout.widget.a$a */
    public interface a {
        /* renamed from: a */
        void mo9764a(l77 l77Var);
    }

    /* renamed from: androidx.slidingpanelayout.widget.a$b */
    public static final class b extends jgg implements nl7 {

        /* renamed from: a */
        public int f10239a;

        /* renamed from: c */
        public final /* synthetic */ Activity f10241c;

        /* renamed from: androidx.slidingpanelayout.widget.a$b$a */
        public static final class a implements z37 {

            /* renamed from: a */
            public final /* synthetic */ C2464a f10242a;

            public a(C2464a c2464a) {
                this.f10242a = c2464a;
            }

            @Override // p001o.z37
            public Object emit(Object obj, n64 n64Var) {
                y3i y3iVar;
                l77 l77Var = (l77) obj;
                a aVar = this.f10242a.f10238d;
                if (aVar == null) {
                    y3iVar = null;
                } else {
                    aVar.mo9764a(l77Var);
                    y3iVar = y3i.f54824a;
                }
                return y3iVar == uq8.m51918f() ? y3iVar : y3i.f54824a;
            }
        }

        /* renamed from: androidx.slidingpanelayout.widget.a$b$b, reason: collision with other inner class name */
        public static final class C19577b implements v37 {

            /* renamed from: a */
            public final /* synthetic */ v37 f10243a;

            /* renamed from: b */
            public final /* synthetic */ C2464a f10244b;

            /* renamed from: androidx.slidingpanelayout.widget.a$b$b$a */
            public static final class a implements z37 {

                /* renamed from: a */
                public final /* synthetic */ z37 f10245a;

                /* renamed from: b */
                public final /* synthetic */ C2464a f10246b;

                /* renamed from: androidx.slidingpanelayout.widget.a$b$b$a$a, reason: collision with other inner class name */
                public static final class C19578a extends o64 {

                    /* renamed from: a */
                    public /* synthetic */ Object f10247a;

                    /* renamed from: b */
                    public int f10248b;

                    public C19578a(n64 n64Var) {
                        super(n64Var);
                    }

                    @Override // p001o.vb1
                    public final Object invokeSuspend(Object obj) {
                        this.f10247a = obj;
                        this.f10248b |= Integer.MIN_VALUE;
                        return a.this.emit(null, this);
                    }
                }

                public a(z37 z37Var, C2464a c2464a) {
                    this.f10245a = z37Var;
                    this.f10246b = c2464a;
                }

                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                @Override // p001o.z37
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public Object emit(Object obj, n64 n64Var) {
                    C19578a c19578a;
                    if (n64Var instanceof C19578a) {
                        c19578a = (C19578a) n64Var;
                        int i = c19578a.f10248b;
                        if ((i & Integer.MIN_VALUE) != 0) {
                            c19578a.f10248b = i - Integer.MIN_VALUE;
                        } else {
                            c19578a = new C19578a(n64Var);
                        }
                    }
                    Object obj2 = c19578a.f10247a;
                    Object objM51918f = uq8.m51918f();
                    int i2 = c19578a.f10248b;
                    if (i2 == 0) {
                        wre.m54934b(obj2);
                        z37 z37Var = this.f10245a;
                        l77 l77VarM9771d = this.f10246b.m9771d((taj) obj);
                        if (l77VarM9771d != null) {
                            c19578a.f10248b = 1;
                            if (z37Var.emit(l77VarM9771d, c19578a) == objM51918f) {
                                return objM51918f;
                            }
                        }
                    } else {
                        if (i2 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        wre.m54934b(obj2);
                    }
                    return y3i.f54824a;
                }
            }

            public C19577b(v37 v37Var, C2464a c2464a) {
                this.f10243a = v37Var;
                this.f10244b = c2464a;
            }

            @Override // p001o.v37
            /* renamed from: a */
            public Object mo9775a(z37 z37Var, n64 n64Var) {
                Object objMo9775a = this.f10243a.mo9775a(new a(z37Var, this.f10244b), n64Var);
                return objMo9775a == uq8.m51918f() ? objMo9775a : y3i.f54824a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Activity activity, n64 n64Var) {
            super(2, n64Var);
            this.f10241c = activity;
        }

        @Override // p001o.vb1
        public final n64 create(Object obj, n64 n64Var) {
            return C2464a.this.new b(this.f10241c, n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            Object objM51918f = uq8.m51918f();
            int i = this.f10239a;
            if (i == 0) {
                wre.m54934b(obj);
                v37 v37VarM24274h = e47.m24274h(new C19577b(C2464a.this.f10235a.mo16704b(this.f10241c), C2464a.this));
                a aVar = new a(C2464a.this);
                this.f10239a = 1;
                if (v37VarM24274h.mo9775a(aVar, this) == objM51918f) {
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
            return ((b) create(h84Var, n64Var)).invokeSuspend(y3i.f54824a);
        }
    }

    public C2464a(a9j a9jVar, Executor executor) {
        sq8.m48649h(a9jVar, "windowInfoTracker");
        sq8.m48649h(executor, "executor");
        this.f10235a = a9jVar;
        this.f10236b = executor;
    }

    /* renamed from: d */
    public final l77 m9771d(taj tajVar) {
        Object next;
        Iterator it = tajVar.m49662a().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((ou5) next) instanceof l77) {
                break;
            }
        }
        if (next instanceof l77) {
            return (l77) next;
        }
        return null;
    }

    /* renamed from: e */
    public final void m9772e(Activity activity) {
        sq8.m48649h(activity, "activity");
        p69 p69Var = this.f10237c;
        if (p69Var != null) {
            p69.C15966a.m42999a(p69Var, null, 1, null);
        }
        this.f10237c = rm1.m46952d(i84.m31707a(vl6.m52908a(this.f10236b)), null, null, new b(activity, null), 3, null);
    }

    /* renamed from: f */
    public final void m9773f(a aVar) {
        sq8.m48649h(aVar, "onFoldingFeatureChangeListener");
        this.f10238d = aVar;
    }

    /* renamed from: g */
    public final void m9774g() {
        p69 p69Var = this.f10237c;
        if (p69Var == null) {
            return;
        }
        p69.C15966a.m42999a(p69Var, null, 1, null);
    }
}
