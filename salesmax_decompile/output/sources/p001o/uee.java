package p001o;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;
import p001o.p69;
import p001o.vre;
import p001o.xb2;
import p001o.xwf;
import p001o.ywf;

/* loaded from: classes2.dex */
public final class uee extends bp3 {

    /* renamed from: a */
    public long f48777a;

    /* renamed from: b */
    public final pl1 f48778b;

    /* renamed from: c */
    public final Object f48779c;

    /* renamed from: d */
    public p69 f48780d;

    /* renamed from: e */
    public Throwable f48781e;

    /* renamed from: f */
    public final List f48782f;

    /* renamed from: g */
    public lb8 f48783g;

    /* renamed from: h */
    public final List f48784h;

    /* renamed from: i */
    public final List f48785i;

    /* renamed from: j */
    public final List f48786j;

    /* renamed from: k */
    public final Map f48787k;

    /* renamed from: l */
    public final Map f48788l;

    /* renamed from: m */
    public List f48789m;

    /* renamed from: n */
    public Set f48790n;

    /* renamed from: o */
    public xb2 f48791o;

    /* renamed from: p */
    public int f48792p;

    /* renamed from: q */
    public boolean f48793q;

    /* renamed from: r */
    public C17358b f48794r;

    /* renamed from: s */
    public boolean f48795s;

    /* renamed from: t */
    public final cqb f48796t;

    /* renamed from: u */
    public final kl3 f48797u;

    /* renamed from: v */
    public final q74 f48798v;

    /* renamed from: w */
    public final C17359c f48799w;

    /* renamed from: x */
    public static final C17357a f48774x = new C17357a(null);

    /* renamed from: y */
    public static final int f48775y = 8;

    /* renamed from: z */
    public static final cqb f48776z = s4g.m47838a(bq6.m19556b());

    /* renamed from: A */
    public static final AtomicReference f48773A = new AtomicReference(Boolean.FALSE);

    /* renamed from: o.uee$a */
    public static final class C17357a {
        public C17357a() {
        }

        public /* synthetic */ C17357a(id5 id5Var) {
            this();
        }

        /* renamed from: c */
        public final void m51443c(C17359c c17359c) {
            j6d j6dVar;
            j6d j6dVarAdd;
            do {
                j6dVar = (j6d) uee.f48776z.getValue();
                j6dVarAdd = j6dVar.add((Object) c17359c);
                if (j6dVar == j6dVarAdd) {
                    return;
                }
            } while (!uee.f48776z.compareAndSet(j6dVar, j6dVarAdd));
        }

        /* renamed from: d */
        public final void m51444d(C17359c c17359c) {
            j6d j6dVar;
            j6d j6dVarRemove;
            do {
                j6dVar = (j6d) uee.f48776z.getValue();
                j6dVarRemove = j6dVar.remove((Object) c17359c);
                if (j6dVar == j6dVarRemove) {
                    return;
                }
            } while (!uee.f48776z.compareAndSet(j6dVar, j6dVarRemove));
        }
    }

    /* renamed from: o.uee$b */
    public static final class C17358b {

        /* renamed from: a */
        public final boolean f48800a;

        /* renamed from: b */
        public final Exception f48801b;

        public C17358b(boolean z, Exception exc) {
            sq8.m48649h(exc, "cause");
            this.f48800a = z;
            this.f48801b = exc;
        }
    }

    /* renamed from: o.uee$c */
    public final class C17359c {
        public C17359c() {
        }
    }

    /* renamed from: o.uee$d */
    public enum EnumC17360d {
        ShutDown,
        ShuttingDown,
        Inactive,
        InactivePendingWork,
        Idle,
        PendingWork
    }

    /* renamed from: o.uee$e */
    public static final class C17361e extends kf9 implements uk7 {
        public C17361e() {
            super(0);
        }

        @Override // p001o.uk7
        public /* bridge */ /* synthetic */ Object invoke() {
            m69037invoke();
            return y3i.f54824a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m69037invoke() {
            xb2 xb2VarM51434T;
            Object obj = uee.this.f48779c;
            uee ueeVar = uee.this;
            synchronized (obj) {
                xb2VarM51434T = ueeVar.m51434T();
                if (((EnumC17360d) ueeVar.f48796t.getValue()).compareTo(EnumC17360d.ShuttingDown) <= 0) {
                    throw al6.m17345a("Recomposer shutdown; frame clock awaiter will never resume", ueeVar.f48781e);
                }
            }
            if (xb2VarM51434T != null) {
                vre.C17665a c17665a = vre.f50797b;
                xb2VarM51434T.resumeWith(vre.m53351b(y3i.f54824a));
            }
        }
    }

    /* renamed from: o.uee$f */
    public static final class C17362f extends kf9 implements xk7 {

        /* renamed from: o.uee$f$a */
        public static final class a extends kf9 implements xk7 {

            /* renamed from: a */
            public final /* synthetic */ uee f48805a;

            /* renamed from: b */
            public final /* synthetic */ Throwable f48806b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(uee ueeVar, Throwable th) {
                super(1);
                this.f48805a = ueeVar;
                this.f48806b = th;
            }

            @Override // p001o.xk7
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Throwable) obj);
                return y3i.f54824a;
            }

            public final void invoke(Throwable th) {
                Object obj = this.f48805a.f48779c;
                uee ueeVar = this.f48805a;
                Throwable th2 = this.f48806b;
                synchronized (obj) {
                    if (th2 != null) {
                        if (th != null) {
                            if (!(!(th instanceof CancellationException))) {
                                th = null;
                            }
                            if (th != null) {
                                cl6.m21376a(th2, th);
                            }
                        }
                    }
                    th2 = null;
                    ueeVar.f48781e = th2;
                    ueeVar.f48796t.setValue(EnumC17360d.ShutDown);
                    y3i y3iVar = y3i.f54824a;
                }
            }
        }

        public C17362f() {
            super(1);
        }

        @Override // p001o.xk7
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return y3i.f54824a;
        }

        public final void invoke(Throwable th) {
            xb2 xb2Var;
            xb2 xb2Var2;
            CancellationException cancellationExceptionM17345a = al6.m17345a("Recomposer effect job completed", th);
            Object obj = uee.this.f48779c;
            uee ueeVar = uee.this;
            synchronized (obj) {
                p69 p69Var = ueeVar.f48780d;
                xb2Var = null;
                if (p69Var != null) {
                    ueeVar.f48796t.setValue(EnumC17360d.ShuttingDown);
                    if (ueeVar.f48793q) {
                        if (ueeVar.f48791o != null) {
                            xb2Var2 = ueeVar.f48791o;
                        }
                        ueeVar.f48791o = null;
                        p69Var.j0(new a(ueeVar, th));
                        xb2Var = xb2Var2;
                    } else {
                        p69Var.mo22429f(cancellationExceptionM17345a);
                    }
                    xb2Var2 = null;
                    ueeVar.f48791o = null;
                    p69Var.j0(new a(ueeVar, th));
                    xb2Var = xb2Var2;
                } else {
                    ueeVar.f48781e = cancellationExceptionM17345a;
                    ueeVar.f48796t.setValue(EnumC17360d.ShutDown);
                    y3i y3iVar = y3i.f54824a;
                }
            }
            if (xb2Var != null) {
                vre.C17665a c17665a = vre.f50797b;
                xb2Var.resumeWith(vre.m53351b(y3i.f54824a));
            }
        }
    }

    /* renamed from: o.uee$g */
    public static final class C17363g extends jgg implements nl7 {

        /* renamed from: a */
        public int f48807a;

        /* renamed from: b */
        public /* synthetic */ Object f48808b;

        public C17363g(n64 n64Var) {
            super(2, n64Var);
        }

        @Override // p001o.vb1
        public final n64 create(Object obj, n64 n64Var) {
            C17363g c17363g = new C17363g(n64Var);
            c17363g.f48808b = obj;
            return c17363g;
        }

        @Override // p001o.nl7
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(EnumC17360d enumC17360d, n64 n64Var) {
            return ((C17363g) create(enumC17360d, n64Var)).invokeSuspend(y3i.f54824a);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            uq8.m51918f();
            if (this.f48807a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            wre.m54934b(obj);
            return ml1.m39301a(((EnumC17360d) this.f48808b) == EnumC17360d.ShutDown);
        }
    }

    /* renamed from: o.uee$h */
    public static final class C17364h extends kf9 implements uk7 {

        /* renamed from: a */
        public final /* synthetic */ lb8 f48809a;

        /* renamed from: b */
        public final /* synthetic */ u64 f48810b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C17364h(lb8 lb8Var, u64 u64Var) {
            super(0);
            this.f48809a = lb8Var;
            this.f48810b = u64Var;
        }

        @Override // p001o.uk7
        public /* bridge */ /* synthetic */ Object invoke() {
            m69038invoke();
            return y3i.f54824a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m69038invoke() {
            lb8 lb8Var = this.f48809a;
            u64 u64Var = this.f48810b;
            Object[] objArrM36856p = lb8Var.m36856p();
            int size = lb8Var.size();
            for (int i = 0; i < size; i++) {
                Object obj = objArrM36856p[i];
                sq8.m48647f(obj, "null cannot be cast to non-null type T of androidx.compose.runtime.collection.IdentityArraySet");
                u64Var.mo27299q(obj);
            }
        }
    }

    /* renamed from: o.uee$i */
    public static final class C17365i extends kf9 implements xk7 {

        /* renamed from: a */
        public final /* synthetic */ u64 f48811a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C17365i(u64 u64Var) {
            super(1);
            this.f48811a = u64Var;
        }

        @Override // p001o.xk7
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m69039invoke(obj);
            return y3i.f54824a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m69039invoke(Object obj) {
            sq8.m48649h(obj, "value");
            this.f48811a.mo27284a(obj);
        }
    }

    /* renamed from: o.uee$j */
    public static final class C17366j extends jgg implements nl7 {

        /* renamed from: a */
        public Object f48812a;

        /* renamed from: b */
        public int f48813b;

        /* renamed from: c */
        public /* synthetic */ Object f48814c;

        /* renamed from: e */
        public final /* synthetic */ ql7 f48816e;

        /* renamed from: f */
        public final /* synthetic */ plb f48817f;

        /* renamed from: o.uee$j$a */
        public static final class a extends jgg implements nl7 {

            /* renamed from: a */
            public int f48818a;

            /* renamed from: b */
            public /* synthetic */ Object f48819b;

            /* renamed from: c */
            public final /* synthetic */ ql7 f48820c;

            /* renamed from: d */
            public final /* synthetic */ plb f48821d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(ql7 ql7Var, plb plbVar, n64 n64Var) {
                super(2, n64Var);
                this.f48820c = ql7Var;
                this.f48821d = plbVar;
            }

            @Override // p001o.vb1
            public final n64 create(Object obj, n64 n64Var) {
                a aVar = new a(this.f48820c, this.f48821d, n64Var);
                aVar.f48819b = obj;
                return aVar;
            }

            @Override // p001o.vb1
            public final Object invokeSuspend(Object obj) {
                Object objM51918f = uq8.m51918f();
                int i = this.f48818a;
                if (i == 0) {
                    wre.m54934b(obj);
                    h84 h84Var = (h84) this.f48819b;
                    ql7 ql7Var = this.f48820c;
                    plb plbVar = this.f48821d;
                    this.f48818a = 1;
                    if (ql7Var.invoke(h84Var, plbVar, this) == objM51918f) {
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

        /* renamed from: o.uee$j$b */
        public static final class b extends kf9 implements nl7 {

            /* renamed from: a */
            public final /* synthetic */ uee f48822a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(uee ueeVar) {
                super(2);
                this.f48822a = ueeVar;
            }

            /* renamed from: a */
            public final void m51446a(Set set, xwf xwfVar) {
                xb2 xb2VarM51434T;
                sq8.m48649h(set, "changed");
                sq8.m48649h(xwfVar, "<anonymous parameter 1>");
                Object obj = this.f48822a.f48779c;
                uee ueeVar = this.f48822a;
                synchronized (obj) {
                    if (((EnumC17360d) ueeVar.f48796t.getValue()).compareTo(EnumC17360d.Idle) >= 0) {
                        ueeVar.f48783g.m36852e(set);
                        xb2VarM51434T = ueeVar.m51434T();
                    } else {
                        xb2VarM51434T = null;
                    }
                }
                if (xb2VarM51434T != null) {
                    vre.C17665a c17665a = vre.f50797b;
                    xb2VarM51434T.resumeWith(vre.m53351b(y3i.f54824a));
                }
            }

            @Override // p001o.nl7
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                m51446a((Set) obj, (xwf) obj2);
                return y3i.f54824a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C17366j(ql7 ql7Var, plb plbVar, n64 n64Var) {
            super(2, n64Var);
            this.f48816e = ql7Var;
            this.f48817f = plbVar;
        }

        @Override // p001o.vb1
        public final n64 create(Object obj, n64 n64Var) {
            C17366j c17366j = uee.this.new C17366j(this.f48816e, this.f48817f, n64Var);
            c17366j.f48814c = obj;
            return c17366j;
        }

        /* JADX WARN: Removed duplicated region for block: B:53:0x00c8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:55:0x0097 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        @Override // p001o.vb1
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) throws Throwable {
            p69 p69VarM58846k;
            o9c o9cVar;
            Throwable th;
            List listT0;
            Object obj2;
            Object obj3;
            Object objM51918f = uq8.m51918f();
            int i = this.f48813b;
            if (i == 0) {
                wre.m54934b(obj);
                p69VarM58846k = z69.m58846k(((h84) this.f48814c).mo6529D());
                uee.this.n0(p69VarM58846k);
                o9c o9cVarM56931e = xwf.f54441e.m56931e(new b(uee.this));
                uee.f48774x.m51443c(uee.this.f48799w);
                try {
                    Object obj4 = uee.this.f48779c;
                    uee ueeVar = uee.this;
                    synchronized (obj4) {
                        listT0 = kh3.T0(ueeVar.f48782f);
                    }
                    int size = listT0.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        ((u64) listT0.get(i2)).mo27289f();
                    }
                    a aVar = new a(this.f48816e, this.f48817f, null);
                    this.f48814c = p69VarM58846k;
                    this.f48812a = o9cVarM56931e;
                    this.f48813b = 1;
                    if (i84.m31711e(aVar, this) == objM51918f) {
                        return objM51918f;
                    }
                    o9cVar = o9cVarM56931e;
                    o9cVar.dispose();
                    obj3 = uee.this.f48779c;
                    uee ueeVar2 = uee.this;
                    synchronized (obj3) {
                    }
                } catch (Throwable th2) {
                    o9cVar = o9cVarM56931e;
                    th = th2;
                    o9cVar.dispose();
                    obj2 = uee.this.f48779c;
                    uee ueeVar3 = uee.this;
                    synchronized (obj2) {
                        if (ueeVar3.f48780d == p69VarM58846k) {
                            ueeVar3.f48780d = null;
                        }
                        ueeVar3.m51434T();
                    }
                    uee.f48774x.m51444d(uee.this.f48799w);
                    throw th;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o9cVar = (o9c) this.f48812a;
                p69VarM58846k = (p69) this.f48814c;
                try {
                    wre.m54934b(obj);
                    o9cVar.dispose();
                    obj3 = uee.this.f48779c;
                    uee ueeVar22 = uee.this;
                    synchronized (obj3) {
                        if (ueeVar22.f48780d == p69VarM58846k) {
                            ueeVar22.f48780d = null;
                        }
                        ueeVar22.m51434T();
                    }
                    uee.f48774x.m51444d(uee.this.f48799w);
                    return y3i.f54824a;
                } catch (Throwable th3) {
                    th = th3;
                    o9cVar.dispose();
                    obj2 = uee.this.f48779c;
                    uee ueeVar32 = uee.this;
                    synchronized (obj2) {
                    }
                }
            }
        }

        @Override // p001o.nl7
        public final Object invoke(h84 h84Var, n64 n64Var) {
            return ((C17366j) create(h84Var, n64Var)).invokeSuspend(y3i.f54824a);
        }
    }

    /* renamed from: o.uee$k */
    public static final class C17367k extends jgg implements ql7 {

        /* renamed from: a */
        public Object f48823a;

        /* renamed from: b */
        public Object f48824b;

        /* renamed from: c */
        public Object f48825c;

        /* renamed from: d */
        public Object f48826d;

        /* renamed from: e */
        public Object f48827e;

        /* renamed from: f */
        public int f48828f;

        /* renamed from: g */
        public /* synthetic */ Object f48829g;

        /* renamed from: o.uee$k$a */
        public static final class a extends kf9 implements xk7 {

            /* renamed from: a */
            public final /* synthetic */ uee f48831a;

            /* renamed from: b */
            public final /* synthetic */ List f48832b;

            /* renamed from: c */
            public final /* synthetic */ List f48833c;

            /* renamed from: d */
            public final /* synthetic */ Set f48834d;

            /* renamed from: e */
            public final /* synthetic */ List f48835e;

            /* renamed from: f */
            public final /* synthetic */ Set f48836f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(uee ueeVar, List list, List list2, Set set, List list3, Set set2) {
                super(1);
                this.f48831a = ueeVar;
                this.f48832b = list;
                this.f48833c = list2;
                this.f48834d = set;
                this.f48835e = list3;
                this.f48836f = set2;
            }

            /* JADX WARN: Removed duplicated region for block: B:144:0x00ea A[EXC_TOP_SPLITTER, SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:146:0x012f A[EXC_TOP_SPLITTER, SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:161:0x0166 A[EXC_TOP_SPLITTER, SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:64:0x0124 A[Catch: all -> 0x021a, TRY_LEAVE, TryCatch #11 {all -> 0x021a, blocks: (B:11:0x0043, B:12:0x004a, B:17:0x006c, B:18:0x006d, B:19:0x0077, B:21:0x007f, B:24:0x0089, B:26:0x0091, B:34:0x00c0, B:44:0x00db, B:45:0x00de, B:41:0x00d2, B:46:0x00df, B:54:0x010a, B:64:0x0124, B:72:0x0146, B:82:0x0161, B:83:0x0165, B:85:0x0169, B:86:0x016a, B:91:0x017d, B:92:0x017e, B:80:0x015d, B:81:0x0160, B:79:0x0158, B:62:0x0120, B:63:0x0123, B:61:0x011c, B:99:0x019b, B:101:0x01a4, B:102:0x01a8, B:112:0x01ce, B:115:0x01d1, B:116:0x01d2, B:117:0x01d3, B:119:0x01d9, B:120:0x01dc, B:122:0x01e4, B:126:0x01f8, B:134:0x0213, B:135:0x0216, B:133:0x020e, B:137:0x0218, B:138:0x0219, B:93:0x017f, B:95:0x0186, B:97:0x0195, B:132:0x0208, B:27:0x009b, B:29:0x00a2, B:30:0x00ae, B:32:0x00b4, B:40:0x00cc, B:67:0x012f, B:68:0x0136, B:70:0x013c, B:78:0x0152, B:49:0x00ea, B:50:0x00fa, B:52:0x0100, B:60:0x0116, B:103:0x01a9, B:105:0x01b4, B:107:0x01c0, B:109:0x01c6, B:110:0x01c9, B:111:0x01cc, B:13:0x004b, B:15:0x0057, B:16:0x0063, B:84:0x0166), top: B:160:0x0043, inners: #0, #3, #5, #6, #7, #8, #9, #12 }] */
            /* renamed from: a */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final void m51452a(long j) {
                Object objM54953a;
                int i;
                if (this.f48831a.m51438X()) {
                    uee ueeVar = this.f48831a;
                    wsh wshVar = wsh.f52622a;
                    objM54953a = wshVar.m54953a("Recomposer:animation");
                    try {
                        ueeVar.f48778b.m43823n(j);
                        xwf.f54441e.m56933g();
                        y3i y3iVar = y3i.f54824a;
                        wshVar.m54954b(objM54953a);
                    } finally {
                    }
                }
                uee ueeVar2 = this.f48831a;
                List list = this.f48832b;
                List list2 = this.f48833c;
                Set set = this.f48834d;
                List list3 = this.f48835e;
                Set set2 = this.f48836f;
                objM54953a = wsh.f52622a.m54953a("Recomposer:recompose");
                try {
                    ueeVar2.m0();
                    synchronized (ueeVar2.f48779c) {
                        List list4 = ueeVar2.f48784h;
                        int size = list4.size();
                        for (int i2 = 0; i2 < size; i2++) {
                            list.add((u64) list4.get(i2));
                        }
                        ueeVar2.f48784h.clear();
                        y3i y3iVar2 = y3i.f54824a;
                    }
                    lb8 lb8Var = new lb8();
                    lb8 lb8Var2 = new lb8();
                    while (true) {
                        if (!(!list.isEmpty()) && !(!list2.isEmpty())) {
                            break;
                        }
                        try {
                            try {
                                int size2 = list.size();
                                for (int i3 = 0; i3 < size2; i3++) {
                                    u64 u64Var = (u64) list.get(i3);
                                    lb8Var2.add(u64Var);
                                    u64 u64VarH0 = ueeVar2.h0(u64Var, lb8Var);
                                    if (u64VarH0 != null) {
                                        list3.add(u64VarH0);
                                    }
                                }
                                list.clear();
                                if (lb8Var.m36857r()) {
                                    synchronized (ueeVar2.f48779c) {
                                        List list5 = ueeVar2.f48782f;
                                        int size3 = list5.size();
                                        for (int i4 = 0; i4 < size3; i4++) {
                                            u64 u64Var2 = (u64) list5.get(i4);
                                            if (!lb8Var2.contains(u64Var2) && u64Var2.mo27294k(lb8Var)) {
                                                list.add(u64Var2);
                                            }
                                        }
                                        y3i y3iVar3 = y3i.f54824a;
                                    }
                                }
                                if (list.isEmpty()) {
                                    try {
                                        C17367k.m51450k(list2, ueeVar2);
                                        while (!list2.isEmpty()) {
                                            hh3.m30441A(set, ueeVar2.g0(list2, lb8Var));
                                            C17367k.m51450k(list2, ueeVar2);
                                        }
                                    } catch (Exception e) {
                                        uee.j0(ueeVar2, e, null, true, 2, null);
                                        C17367k.m51449i(list, list2, list3, set, set2);
                                    }
                                }
                            } catch (Throwable th) {
                                list.clear();
                                throw th;
                            }
                        } catch (Exception e2) {
                            uee.j0(ueeVar2, e2, null, true, 2, null);
                            C17367k.m51449i(list, list2, list3, set, set2);
                            list.clear();
                        }
                    }
                    if (!list3.isEmpty()) {
                        ueeVar2.f48777a = ueeVar2.m51436V() + 1;
                        try {
                            int size4 = list3.size();
                            for (int i5 = 0; i5 < size4; i5++) {
                                set2.add((u64) list3.get(i5));
                            }
                            int size5 = list3.size();
                            for (i = 0; i < size5; i++) {
                                ((u64) list3.get(i)).mo27296n();
                            }
                            if (!set.isEmpty()) {
                                if (!set2.isEmpty()) {
                                }
                                synchronized (ueeVar2.f48779c) {
                                }
                            } else {
                                try {
                                    try {
                                        hh3.m30441A(set2, set);
                                        Iterator it = set.iterator();
                                        while (it.hasNext()) {
                                            ((u64) it.next()).mo27286c();
                                        }
                                        if (!set2.isEmpty()) {
                                            try {
                                                try {
                                                    Iterator it2 = set2.iterator();
                                                    while (it2.hasNext()) {
                                                        ((u64) it2.next()).mo27300r();
                                                    }
                                                } catch (Exception e3) {
                                                    uee.j0(ueeVar2, e3, null, false, 6, null);
                                                    C17367k.m51449i(list, list2, list3, set, set2);
                                                    set2.clear();
                                                }
                                            } finally {
                                                set2.clear();
                                            }
                                        }
                                        synchronized (ueeVar2.f48779c) {
                                            ueeVar2.m51434T();
                                        }
                                        xwf.f54441e.m56929c();
                                        ueeVar2.f48790n = null;
                                        y3i y3iVar4 = y3i.f54824a;
                                    } catch (Exception e4) {
                                        uee.j0(ueeVar2, e4, null, false, 6, null);
                                        C17367k.m51449i(list, list2, list3, set, set2);
                                        set.clear();
                                    }
                                } finally {
                                    set.clear();
                                }
                            }
                        } catch (Exception e5) {
                            uee.j0(ueeVar2, e5, null, false, 6, null);
                            C17367k.m51449i(list, list2, list3, set, set2);
                        } finally {
                            list3.clear();
                        }
                    } else if (!set.isEmpty()) {
                    }
                } finally {
                }
            }

            @Override // p001o.xk7
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                m51452a(((Number) obj).longValue());
                return y3i.f54824a;
            }
        }

        public C17367k(n64 n64Var) {
            super(3, n64Var);
        }

        /* renamed from: i */
        public static final void m51449i(List list, List list2, List list3, Set set, Set set2) {
            list.clear();
            list2.clear();
            list3.clear();
            set.clear();
            set2.clear();
        }

        /* renamed from: k */
        public static final void m51450k(List list, uee ueeVar) {
            list.clear();
            synchronized (ueeVar.f48779c) {
                List list2 = ueeVar.f48786j;
                int size = list2.size();
                for (int i = 0; i < size; i++) {
                    list.add((zmb) list2.get(i));
                }
                ueeVar.f48786j.clear();
                y3i y3iVar = y3i.f54824a;
            }
        }

        @Override // p001o.ql7
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public final Object invoke(h84 h84Var, plb plbVar, n64 n64Var) {
            C17367k c17367k = uee.this.new C17367k(n64Var);
            c17367k.f48829g = plbVar;
            return c17367k.invokeSuspend(y3i.f54824a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:13:0x008e  */
        /* JADX WARN: Removed duplicated region for block: B:19:0x00b3  */
        /* JADX WARN: Removed duplicated region for block: B:24:0x00eb  */
        /* JADX WARN: Removed duplicated region for block: B:25:0x00f5  */
        /* JADX WARN: Type inference failed for: r2v11, types: [java.util.Set] */
        /* JADX WARN: Type inference failed for: r2v7, types: [java.util.Set] */
        /* JADX WARN: Type inference failed for: r5v11, types: [java.util.Set] */
        /* JADX WARN: Type inference failed for: r5v13, types: [java.util.Set] */
        /* JADX WARN: Type inference failed for: r6v7, types: [java.util.List] */
        /* JADX WARN: Type inference failed for: r6v9, types: [java.util.List] */
        /* JADX WARN: Type inference failed for: r7v7, types: [java.util.List] */
        /* JADX WARN: Type inference failed for: r7v9, types: [java.util.List] */
        /* JADX WARN: Type inference failed for: r8v10, types: [java.util.List] */
        /* JADX WARN: Type inference failed for: r8v8, types: [java.util.List] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x00dd -> B:23:0x00e1). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x00eb -> B:11:0x0086). Please report as a decompilation issue!!! */
        @Override // p001o.vb1
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            plb plbVar;
            ArrayList arrayList;
            ArrayList arrayList2;
            ArrayList arrayList3;
            LinkedHashSet linkedHashSet;
            LinkedHashSet linkedHashSet2;
            C17367k c17367k;
            LinkedHashSet linkedHashSet3;
            ArrayList arrayList4;
            ArrayList arrayList5;
            ArrayList arrayList6;
            C17367k c17367k2;
            LinkedHashSet linkedHashSet4;
            Object objM51918f = uq8.m51918f();
            int i = this.f48828f;
            char c = 2;
            int i2 = 1;
            if (i == 0) {
                wre.m54934b(obj);
                plbVar = (plb) this.f48829g;
                arrayList = new ArrayList();
                arrayList2 = new ArrayList();
                arrayList3 = new ArrayList();
                linkedHashSet = new LinkedHashSet();
                linkedHashSet2 = new LinkedHashSet();
                c17367k = this;
                if (!uee.this.b0()) {
                }
            } else if (i == 1) {
                ?? r2 = (Set) this.f48827e;
                ?? r5 = (Set) this.f48826d;
                ?? r6 = (List) this.f48825c;
                ?? r7 = (List) this.f48824b;
                ?? r8 = (List) this.f48823a;
                plb plbVar2 = (plb) this.f48829g;
                wre.m54934b(obj);
                c17367k2 = this;
                linkedHashSet4 = r2;
                linkedHashSet3 = r5;
                arrayList4 = r6;
                arrayList5 = r7;
                arrayList6 = r8;
                plbVar = plbVar2;
                if (uee.this.m0()) {
                }
            } else {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ?? r22 = (Set) this.f48827e;
                ?? r52 = (Set) this.f48826d;
                ?? r62 = (List) this.f48825c;
                ?? r72 = (List) this.f48824b;
                ?? r82 = (List) this.f48823a;
                plb plbVar3 = (plb) this.f48829g;
                wre.m54934b(obj);
                c17367k = this;
                linkedHashSet3 = r52;
                char c2 = 2;
                linkedHashSet2 = r22;
                plbVar = plbVar3;
                arrayList3 = r62;
                arrayList2 = r72;
                ArrayList arrayList7 = r82;
                uee.this.m51435U();
                c = c2;
                arrayList = arrayList7;
                linkedHashSet = linkedHashSet3;
                i2 = 1;
                if (!uee.this.b0()) {
                    uee ueeVar = uee.this;
                    c17367k.f48829g = plbVar;
                    c17367k.f48823a = arrayList;
                    c17367k.f48824b = arrayList2;
                    c17367k.f48825c = arrayList3;
                    c17367k.f48826d = linkedHashSet;
                    c17367k.f48827e = linkedHashSet2;
                    c17367k.f48828f = i2;
                    if (ueeVar.m51432R(c17367k) == objM51918f) {
                        return objM51918f;
                    }
                    arrayList6 = arrayList;
                    arrayList5 = arrayList2;
                    arrayList4 = arrayList3;
                    linkedHashSet3 = linkedHashSet;
                    c17367k2 = c17367k;
                    linkedHashSet4 = linkedHashSet2;
                    if (uee.this.m0()) {
                        linkedHashSet2 = linkedHashSet4;
                        c17367k = c17367k2;
                        c = c;
                        arrayList = arrayList6;
                        arrayList2 = arrayList5;
                        arrayList3 = arrayList4;
                        linkedHashSet = linkedHashSet3;
                        if (!uee.this.b0()) {
                        }
                    } else {
                        LinkedHashSet linkedHashSet5 = linkedHashSet4;
                        C17367k c17367k3 = c17367k2;
                        a aVar = new a(uee.this, arrayList6, arrayList5, linkedHashSet3, arrayList4, linkedHashSet5);
                        c17367k3.f48829g = plbVar;
                        c17367k3.f48823a = arrayList6;
                        c17367k3.f48824b = arrayList5;
                        c17367k3.f48825c = arrayList4;
                        c17367k3.f48826d = linkedHashSet3;
                        linkedHashSet2 = linkedHashSet5;
                        c17367k3.f48827e = linkedHashSet2;
                        c2 = 2;
                        c17367k3.f48828f = 2;
                        if (plbVar.mo29725h(aVar, c17367k3) == objM51918f) {
                            return objM51918f;
                        }
                        c17367k = c17367k3;
                        arrayList7 = arrayList6;
                        arrayList2 = arrayList5;
                        arrayList3 = arrayList4;
                        uee.this.m51435U();
                        c = c2;
                        arrayList = arrayList7;
                        linkedHashSet = linkedHashSet3;
                        i2 = 1;
                        if (!uee.this.b0()) {
                            return y3i.f54824a;
                        }
                    }
                }
            }
        }
    }

    /* renamed from: o.uee$l */
    public static final class C17368l extends kf9 implements xk7 {

        /* renamed from: a */
        public final /* synthetic */ u64 f48837a;

        /* renamed from: b */
        public final /* synthetic */ lb8 f48838b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C17368l(u64 u64Var, lb8 lb8Var) {
            super(1);
            this.f48837a = u64Var;
            this.f48838b = lb8Var;
        }

        @Override // p001o.xk7
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m69040invoke(obj);
            return y3i.f54824a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m69040invoke(Object obj) {
            sq8.m48649h(obj, "value");
            this.f48837a.mo27299q(obj);
            lb8 lb8Var = this.f48838b;
            if (lb8Var != null) {
                lb8Var.add(obj);
            }
        }
    }

    public uee(q74 q74Var) {
        sq8.m48649h(q74Var, "effectCoroutineContext");
        pl1 pl1Var = new pl1(new C17361e());
        this.f48778b = pl1Var;
        this.f48779c = new Object();
        this.f48782f = new ArrayList();
        this.f48783g = new lb8();
        this.f48784h = new ArrayList();
        this.f48785i = new ArrayList();
        this.f48786j = new ArrayList();
        this.f48787k = new LinkedHashMap();
        this.f48788l = new LinkedHashMap();
        this.f48796t = s4g.m47838a(EnumC17360d.Inactive);
        kl3 kl3VarM58836a = z69.m58836a((p69) q74Var.get(p69.f39399t));
        kl3VarM58836a.j0(new C17362f());
        this.f48797u = kl3VarM58836a;
        this.f48798v = q74Var.plus(pl1Var).plus(kl3VarM58836a);
        this.f48799w = new C17359c();
    }

    public static final void f0(List list, uee ueeVar, u64 u64Var) {
        list.clear();
        synchronized (ueeVar.f48779c) {
            Iterator it = ueeVar.f48786j.iterator();
            while (it.hasNext()) {
                zmb zmbVar = (zmb) it.next();
                if (sq8.m48644c(zmbVar.m59617b(), u64Var)) {
                    list.add(zmbVar);
                    it.remove();
                }
            }
            y3i y3iVar = y3i.f54824a;
        }
    }

    public static /* synthetic */ void j0(uee ueeVar, Exception exc, u64 u64Var, boolean z, int i, Object obj) throws Exception {
        if ((i & 2) != 0) {
            u64Var = null;
        }
        if ((i & 4) != 0) {
            z = false;
        }
        ueeVar.i0(exc, u64Var, z);
    }

    /* renamed from: Q */
    public final void m51431Q(aqb aqbVar) {
        try {
            if (aqbVar.mo17663C() instanceof ywf.C18516a) {
                throw new IllegalStateException("Unsupported concurrent change during composition. A state object was modified by composition as well as being modified outside composition.".toString());
            }
        } finally {
            aqbVar.mo17680d();
        }
    }

    /* renamed from: R */
    public final Object m51432R(n64 n64Var) {
        zb2 zb2Var;
        if (a0()) {
            return y3i.f54824a;
        }
        zb2 zb2Var2 = new zb2(tq8.m50336c(n64Var), 1);
        zb2Var2.m59116E();
        synchronized (this.f48779c) {
            if (a0()) {
                zb2Var = zb2Var2;
            } else {
                this.f48791o = zb2Var2;
                zb2Var = null;
            }
        }
        if (zb2Var != null) {
            vre.C17665a c17665a = vre.f50797b;
            zb2Var.resumeWith(vre.m53351b(y3i.f54824a));
        }
        Object objM59140v = zb2Var2.m59140v();
        if (objM59140v == uq8.m51918f()) {
            n75.m40201c(n64Var);
        }
        return objM59140v == uq8.m51918f() ? objM59140v : y3i.f54824a;
    }

    /* renamed from: S */
    public final void m51433S() {
        synchronized (this.f48779c) {
            if (((EnumC17360d) this.f48796t.getValue()).compareTo(EnumC17360d.Idle) >= 0) {
                this.f48796t.setValue(EnumC17360d.ShuttingDown);
            }
            y3i y3iVar = y3i.f54824a;
        }
        p69.C15966a.m42999a(this.f48797u, null, 1, null);
    }

    /* renamed from: T */
    public final xb2 m51434T() {
        EnumC17360d enumC17360d;
        if (((EnumC17360d) this.f48796t.getValue()).compareTo(EnumC17360d.ShuttingDown) <= 0) {
            this.f48782f.clear();
            this.f48783g = new lb8();
            this.f48784h.clear();
            this.f48785i.clear();
            this.f48786j.clear();
            this.f48789m = null;
            xb2 xb2Var = this.f48791o;
            if (xb2Var != null) {
                xb2.C18097a.m55920a(xb2Var, null, 1, null);
            }
            this.f48791o = null;
            this.f48794r = null;
            return null;
        }
        if (this.f48794r != null) {
            enumC17360d = EnumC17360d.Inactive;
        } else if (this.f48780d == null) {
            this.f48783g = new lb8();
            this.f48784h.clear();
            enumC17360d = m51439Y() ? EnumC17360d.InactivePendingWork : EnumC17360d.Inactive;
        } else {
            enumC17360d = ((this.f48784h.isEmpty() ^ true) || this.f48783g.m36857r() || (this.f48785i.isEmpty() ^ true) || (this.f48786j.isEmpty() ^ true) || this.f48792p > 0 || m51439Y()) ? EnumC17360d.PendingWork : EnumC17360d.Idle;
        }
        this.f48796t.setValue(enumC17360d);
        if (enumC17360d != EnumC17360d.PendingWork) {
            return null;
        }
        xb2 xb2Var2 = this.f48791o;
        this.f48791o = null;
        return xb2Var2;
    }

    /* renamed from: U */
    public final void m51435U() {
        int i;
        List listM21246k;
        synchronized (this.f48779c) {
            if (!this.f48787k.isEmpty()) {
                List listM23090x = dh3.m23090x(this.f48787k.values());
                this.f48787k.clear();
                listM21246k = new ArrayList(listM23090x.size());
                int size = listM23090x.size();
                for (int i2 = 0; i2 < size; i2++) {
                    zmb zmbVar = (zmb) listM23090x.get(i2);
                    listM21246k.add(vyh.m53620a(zmbVar, this.f48788l.get(zmbVar)));
                }
                this.f48788l.clear();
            } else {
                listM21246k = ch3.m21246k();
            }
        }
        int size2 = listM21246k.size();
        for (i = 0; i < size2; i++) {
            hwc hwcVar = (hwc) listM21246k.get(i);
            zmb zmbVar2 = (zmb) hwcVar.m31227a();
            ymb ymbVar = (ymb) hwcVar.m31228b();
            if (ymbVar != null) {
                zmbVar2.m59617b().mo27293j(ymbVar);
            }
        }
    }

    /* renamed from: V */
    public final long m51436V() {
        return this.f48777a;
    }

    /* renamed from: W */
    public final q4g m51437W() {
        return this.f48796t;
    }

    /* renamed from: X */
    public final boolean m51438X() {
        boolean zM51439Y;
        synchronized (this.f48779c) {
            zM51439Y = m51439Y();
        }
        return zM51439Y;
    }

    /* renamed from: Y */
    public final boolean m51439Y() {
        return !this.f48795s && this.f48778b.m43822m();
    }

    /* renamed from: Z */
    public final boolean m51440Z() {
        return (this.f48784h.isEmpty() ^ true) || m51439Y();
    }

    @Override // p001o.bp3
    /* renamed from: a */
    public void mo19502a(u64 u64Var, nl7 nl7Var) throws Exception {
        sq8.m48649h(u64Var, "composition");
        sq8.m48649h(nl7Var, FirebaseAnalytics.Param.CONTENT);
        boolean zMo27298p = u64Var.mo27298p();
        try {
            xwf.C18260a c18260a = xwf.f54441e;
            aqb aqbVarM56934h = c18260a.m56934h(k0(u64Var), q0(u64Var, null));
            try {
                xwf xwfVarM56921l = aqbVarM56934h.m56921l();
                try {
                    u64Var.mo27292i(nl7Var);
                    y3i y3iVar = y3i.f54824a;
                    if (!zMo27298p) {
                        c18260a.m56929c();
                    }
                    synchronized (this.f48779c) {
                        if (((EnumC17360d) this.f48796t.getValue()).compareTo(EnumC17360d.ShuttingDown) > 0 && !this.f48782f.contains(u64Var)) {
                            this.f48782f.add(u64Var);
                        }
                    }
                    try {
                        e0(u64Var);
                        try {
                            u64Var.mo27296n();
                            u64Var.mo27286c();
                            if (zMo27298p) {
                                return;
                            }
                            c18260a.m56929c();
                        } catch (Exception e) {
                            j0(this, e, null, false, 6, null);
                        }
                    } catch (Exception e2) {
                        i0(e2, u64Var, true);
                    }
                } finally {
                    aqbVarM56934h.m56923s(xwfVarM56921l);
                }
            } finally {
                m51431Q(aqbVarM56934h);
            }
        } catch (Exception e3) {
            i0(e3, u64Var, true);
        }
    }

    public final boolean a0() {
        boolean z;
        synchronized (this.f48779c) {
            z = true;
            if (!this.f48783g.m36857r() && !(!this.f48784h.isEmpty())) {
                if (!m51439Y()) {
                    z = false;
                }
            }
        }
        return z;
    }

    public final boolean b0() {
        boolean z;
        boolean z2;
        synchronized (this.f48779c) {
            z = !this.f48793q;
        }
        if (z) {
            return true;
        }
        Iterator it = this.f48797u.mo22430k().iterator();
        while (true) {
            if (!it.hasNext()) {
                z2 = false;
                break;
            }
            if (((p69) it.next()).mo22428a()) {
                z2 = true;
                break;
            }
        }
        return z2;
    }

    @Override // p001o.bp3
    /* renamed from: c */
    public boolean mo19504c() {
        return false;
    }

    public final Object c0(n64 n64Var) {
        Object objM24279m = e47.m24279m(m51437W(), new C17363g(null), n64Var);
        return objM24279m == uq8.m51918f() ? objM24279m : y3i.f54824a;
    }

    public final void d0() {
        synchronized (this.f48779c) {
            this.f48795s = true;
            y3i y3iVar = y3i.f54824a;
        }
    }

    @Override // p001o.bp3
    /* renamed from: e */
    public int mo19506e() {
        return 1000;
    }

    public final void e0(u64 u64Var) {
        synchronized (this.f48779c) {
            List list = this.f48786j;
            int size = list.size();
            boolean z = false;
            int i = 0;
            while (true) {
                if (i >= size) {
                    break;
                }
                if (sq8.m48644c(((zmb) list.get(i)).m59617b(), u64Var)) {
                    z = true;
                    break;
                }
                i++;
            }
            if (z) {
                y3i y3iVar = y3i.f54824a;
                ArrayList arrayList = new ArrayList();
                f0(arrayList, this, u64Var);
                while (!arrayList.isEmpty()) {
                    g0(arrayList, null);
                    f0(arrayList, this, u64Var);
                }
            }
        }
    }

    @Override // p001o.bp3
    /* renamed from: f */
    public q74 mo19507f() {
        return this.f48798v;
    }

    @Override // p001o.bp3
    /* renamed from: g */
    public void mo19508g(zmb zmbVar) {
        xb2 xb2VarM51434T;
        sq8.m48649h(zmbVar, "reference");
        synchronized (this.f48779c) {
            this.f48786j.add(zmbVar);
            xb2VarM51434T = m51434T();
        }
        if (xb2VarM51434T != null) {
            vre.C17665a c17665a = vre.f50797b;
            xb2VarM51434T.resumeWith(vre.m53351b(y3i.f54824a));
        }
    }

    public final List g0(List list, lb8 lb8Var) {
        ArrayList arrayList;
        HashMap map = new HashMap(list.size());
        int size = list.size();
        for (int i = 0; i < size; i++) {
            Object obj = list.get(i);
            u64 u64VarM59617b = ((zmb) obj).m59617b();
            Object arrayList2 = map.get(u64VarM59617b);
            if (arrayList2 == null) {
                arrayList2 = new ArrayList();
                map.put(u64VarM59617b, arrayList2);
            }
            ((ArrayList) arrayList2).add(obj);
        }
        for (Map.Entry entry : map.entrySet()) {
            u64 u64Var = (u64) entry.getKey();
            List list2 = (List) entry.getValue();
            go3.m29198R(!u64Var.mo27298p());
            aqb aqbVarM56934h = xwf.f54441e.m56934h(k0(u64Var), q0(u64Var, lb8Var));
            try {
                xwf xwfVarM56921l = aqbVarM56934h.m56921l();
                try {
                    synchronized (this.f48779c) {
                        arrayList = new ArrayList(list2.size());
                        int size2 = list2.size();
                        for (int i2 = 0; i2 < size2; i2++) {
                            zmb zmbVar = (zmb) list2.get(i2);
                            Map map2 = this.f48787k;
                            zmbVar.m59618c();
                            arrayList.add(vyh.m53620a(zmbVar, vee.m52675a(map2, null)));
                        }
                    }
                    u64Var.mo27288e(arrayList);
                    y3i y3iVar = y3i.f54824a;
                } finally {
                    aqbVarM56934h.m56923s(xwfVarM56921l);
                }
            } finally {
                m51431Q(aqbVarM56934h);
            }
        }
        return kh3.Q0(map.keySet());
    }

    @Override // p001o.bp3
    /* renamed from: h */
    public void mo19509h(u64 u64Var) {
        xb2 xb2VarM51434T;
        sq8.m48649h(u64Var, "composition");
        synchronized (this.f48779c) {
            if (this.f48784h.contains(u64Var)) {
                xb2VarM51434T = null;
            } else {
                this.f48784h.add(u64Var);
                xb2VarM51434T = m51434T();
            }
        }
        if (xb2VarM51434T != null) {
            vre.C17665a c17665a = vre.f50797b;
            xb2VarM51434T.resumeWith(vre.m53351b(y3i.f54824a));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x003c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final u64 h0(u64 u64Var, lb8 lb8Var) {
        if (!u64Var.mo27298p() && !u64Var.isDisposed()) {
            Set set = this.f48790n;
            boolean z = true;
            if (!(set != null && set.contains(u64Var))) {
                aqb aqbVarM56934h = xwf.f54441e.m56934h(k0(u64Var), q0(u64Var, lb8Var));
                try {
                    xwf xwfVarM56921l = aqbVarM56934h.m56921l();
                    if (lb8Var != null) {
                        try {
                            if (!lb8Var.m36857r()) {
                                z = false;
                            }
                        } catch (Throwable th) {
                            aqbVarM56934h.m56923s(xwfVarM56921l);
                            throw th;
                        }
                    }
                    if (z) {
                        u64Var.mo27285b(new C17364h(lb8Var, u64Var));
                    }
                    boolean zMo27291h = u64Var.mo27291h();
                    aqbVarM56934h.m56923s(xwfVarM56921l);
                    if (zMo27291h) {
                        return u64Var;
                    }
                    return null;
                } finally {
                    m51431Q(aqbVarM56934h);
                }
            }
        }
        return null;
    }

    @Override // p001o.bp3
    /* renamed from: i */
    public ymb mo19510i(zmb zmbVar) {
        ymb ymbVar;
        sq8.m48649h(zmbVar, "reference");
        synchronized (this.f48779c) {
            ymbVar = (ymb) this.f48788l.remove(zmbVar);
        }
        return ymbVar;
    }

    public final void i0(Exception exc, u64 u64Var, boolean z) throws Exception {
        Object obj = f48773A.get();
        sq8.m48648g(obj, "_hotReloadEnabled.get()");
        if (!((Boolean) obj).booleanValue() || (exc instanceof tn3)) {
            throw exc;
        }
        synchronized (this.f48779c) {
            nv.m41177d("Error was captured in composition while live edit was enabled.", exc);
            this.f48785i.clear();
            this.f48784h.clear();
            this.f48783g = new lb8();
            this.f48786j.clear();
            this.f48787k.clear();
            this.f48788l.clear();
            this.f48794r = new C17358b(z, exc);
            if (u64Var != null) {
                List arrayList = this.f48789m;
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    this.f48789m = arrayList;
                }
                if (!arrayList.contains(u64Var)) {
                    arrayList.add(u64Var);
                }
                this.f48782f.remove(u64Var);
            }
            m51434T();
        }
    }

    @Override // p001o.bp3
    /* renamed from: j */
    public void mo19511j(Set set) {
        sq8.m48649h(set, "table");
    }

    public final xk7 k0(u64 u64Var) {
        return new C17365i(u64Var);
    }

    public final Object l0(ql7 ql7Var, n64 n64Var) {
        Object objM43867g = pm1.m43867g(this.f48778b, new C17366j(ql7Var, qlb.m45634a(n64Var.getContext()), null), n64Var);
        return objM43867g == uq8.m51918f() ? objM43867g : y3i.f54824a;
    }

    public final boolean m0() {
        List listT0;
        boolean zM51440Z;
        synchronized (this.f48779c) {
            if (this.f48783g.isEmpty()) {
                return m51440Z();
            }
            lb8 lb8Var = this.f48783g;
            this.f48783g = new lb8();
            synchronized (this.f48779c) {
                listT0 = kh3.T0(this.f48782f);
            }
            try {
                int size = listT0.size();
                for (int i = 0; i < size; i++) {
                    ((u64) listT0.get(i)).mo27295m(lb8Var);
                    if (((EnumC17360d) this.f48796t.getValue()).compareTo(EnumC17360d.ShuttingDown) <= 0) {
                        break;
                    }
                }
                this.f48783g = new lb8();
                synchronized (this.f48779c) {
                    if (m51434T() != null) {
                        throw new IllegalStateException("called outside of runRecomposeAndApplyChanges".toString());
                    }
                    zM51440Z = m51440Z();
                }
                return zM51440Z;
            } catch (Throwable th) {
                synchronized (this.f48779c) {
                    this.f48783g.m36852e(lb8Var);
                    y3i y3iVar = y3i.f54824a;
                    throw th;
                }
            }
        }
    }

    @Override // p001o.bp3
    /* renamed from: n */
    public void mo19515n(u64 u64Var) {
        sq8.m48649h(u64Var, "composition");
        synchronized (this.f48779c) {
            this.f48782f.remove(u64Var);
            this.f48784h.remove(u64Var);
            this.f48785i.remove(u64Var);
            y3i y3iVar = y3i.f54824a;
        }
    }

    public final void n0(p69 p69Var) {
        synchronized (this.f48779c) {
            Throwable th = this.f48781e;
            if (th != null) {
                throw th;
            }
            if (((EnumC17360d) this.f48796t.getValue()).compareTo(EnumC17360d.ShuttingDown) <= 0) {
                throw new IllegalStateException("Recomposer shut down".toString());
            }
            if (this.f48780d != null) {
                throw new IllegalStateException("Recomposer already running".toString());
            }
            this.f48780d = p69Var;
            m51434T();
        }
    }

    public final void o0() {
        xb2 xb2VarM51434T;
        synchronized (this.f48779c) {
            if (this.f48795s) {
                this.f48795s = false;
                xb2VarM51434T = m51434T();
            } else {
                xb2VarM51434T = null;
            }
        }
        if (xb2VarM51434T != null) {
            vre.C17665a c17665a = vre.f50797b;
            xb2VarM51434T.resumeWith(vre.m53351b(y3i.f54824a));
        }
    }

    public final Object p0(n64 n64Var) {
        Object objL0 = l0(new C17367k(null), n64Var);
        return objL0 == uq8.m51918f() ? objL0 : y3i.f54824a;
    }

    public final xk7 q0(u64 u64Var, lb8 lb8Var) {
        return new C17368l(u64Var, lb8Var);
    }
}
