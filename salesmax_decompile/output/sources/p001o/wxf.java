package p001o;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import p001o.im5;

/* loaded from: classes2.dex */
public final class wxf {

    /* renamed from: a */
    public final xk7 f52841a;

    /* renamed from: b */
    public final AtomicReference f52842b;

    /* renamed from: c */
    public boolean f52843c;

    /* renamed from: d */
    public final nl7 f52844d;

    /* renamed from: e */
    public final xk7 f52845e;

    /* renamed from: f */
    public final fqb f52846f;

    /* renamed from: g */
    public o9c f52847g;

    /* renamed from: h */
    public boolean f52848h;

    /* renamed from: i */
    public C17999a f52849i;

    /* renamed from: o.wxf$a */
    public static final class C17999a {

        /* renamed from: a */
        public final xk7 f52850a;

        /* renamed from: b */
        public Object f52851b;

        /* renamed from: c */
        public jb8 f52852c;

        /* renamed from: d */
        public int f52853d;

        /* renamed from: e */
        public final sb8 f52854e;

        /* renamed from: f */
        public final kb8 f52855f;

        /* renamed from: g */
        public final lb8 f52856g;

        /* renamed from: h */
        public final fqb f52857h;

        /* renamed from: i */
        public final jm5 f52858i;

        /* renamed from: j */
        public int f52859j;

        /* renamed from: k */
        public final sb8 f52860k;

        /* renamed from: l */
        public final HashMap f52861l;

        /* renamed from: o.wxf$a$a */
        public static final class a implements jm5 {
            public a() {
            }

            @Override // p001o.jm5
            /* renamed from: a */
            public void mo27217a(im5 im5Var) {
                sq8.m48649h(im5Var, "derivedState");
                C17999a.this.f52859j++;
            }

            @Override // p001o.jm5
            /* renamed from: b */
            public void mo27218b(im5 im5Var) {
                sq8.m48649h(im5Var, "derivedState");
                C17999a c17999a = C17999a.this;
                c17999a.f52859j--;
            }
        }

        public C17999a(xk7 xk7Var) {
            sq8.m48649h(xk7Var, "onChanged");
            this.f52850a = xk7Var;
            this.f52853d = -1;
            this.f52854e = new sb8();
            this.f52855f = new kb8(0, 1, null);
            this.f52856g = new lb8();
            this.f52857h = new fqb(new im5[16], 0);
            this.f52858i = new a();
            this.f52860k = new sb8();
            this.f52861l = new HashMap();
        }

        /* renamed from: c */
        public final void m55367c() {
            this.f52854e.m48122d();
            this.f52855f.m35349b();
            this.f52860k.m48122d();
            this.f52861l.clear();
        }

        /* renamed from: d */
        public final void m55368d(Object obj) {
            int i = this.f52853d;
            jb8 jb8Var = this.f52852c;
            if (jb8Var != null) {
                Object[] objArrM33470e = jb8Var.m33470e();
                int[] iArrM33472g = jb8Var.m33472g();
                int iM33471f = jb8Var.m33471f();
                int i2 = 0;
                for (int i3 = 0; i3 < iM33471f; i3++) {
                    Object obj2 = objArrM33470e[i3];
                    sq8.m48647f(obj2, "null cannot be cast to non-null type kotlin.Any");
                    int i4 = iArrM33472g[i3];
                    boolean z = i4 != i;
                    if (z) {
                        m55375k(obj, obj2);
                    }
                    if (!z) {
                        if (i2 != i3) {
                            objArrM33470e[i2] = obj2;
                            iArrM33472g[i2] = i4;
                        }
                        i2++;
                    }
                }
                for (int i5 = i2; i5 < iM33471f; i5++) {
                    objArrM33470e[i5] = null;
                }
                jb8Var.f30086a = i2;
            }
        }

        /* renamed from: e */
        public final xk7 m55369e() {
            return this.f52850a;
        }

        /* renamed from: f */
        public final void m55370f() {
            lb8 lb8Var = this.f52856g;
            xk7 xk7Var = this.f52850a;
            Object[] objArrM36856p = lb8Var.m36856p();
            int size = lb8Var.size();
            for (int i = 0; i < size; i++) {
                Object obj = objArrM36856p[i];
                sq8.m48647f(obj, "null cannot be cast to non-null type T of androidx.compose.runtime.collection.IdentityArraySet");
                xk7Var.invoke(obj);
            }
            lb8Var.clear();
        }

        /* renamed from: g */
        public final void m55371g(Object obj, xk7 xk7Var, uk7 uk7Var) {
            sq8.m48649h(obj, "scope");
            sq8.m48649h(xk7Var, "readObserver");
            sq8.m48649h(uk7Var, "block");
            Object obj2 = this.f52851b;
            jb8 jb8Var = this.f52852c;
            int i = this.f52853d;
            this.f52851b = obj;
            this.f52852c = (jb8) this.f52855f.m35353f(obj);
            if (this.f52853d == -1) {
                this.f52853d = exf.m25774F().mo39744f();
            }
            jm5 jm5Var = this.f52858i;
            fqb fqbVarM45950a = qxf.m45950a();
            try {
                fqbVarM45950a.m27344c(jm5Var);
                xwf.f54441e.m56930d(xk7Var, null, uk7Var);
                fqbVarM45950a.m27361v(fqbVarM45950a.m27354o() - 1);
                Object obj3 = this.f52851b;
                sq8.m48646e(obj3);
                m55368d(obj3);
                this.f52851b = obj2;
                this.f52852c = jb8Var;
                this.f52853d = i;
            } catch (Throwable th) {
                fqbVarM45950a.m27361v(fqbVarM45950a.m27354o() - 1);
                throw th;
            }
        }

        /* renamed from: h */
        public final boolean m55372h(Set set) {
            boolean z;
            int iM48124f;
            int i;
            Object[] objArr;
            int iM48124f2;
            sq8.m48649h(set, "changes");
            sb8 sb8Var = this.f52860k;
            HashMap map = this.f52861l;
            sb8 sb8Var2 = this.f52854e;
            lb8 lb8Var = this.f52856g;
            if (set instanceof lb8) {
                lb8 lb8Var2 = (lb8) set;
                Object[] objArrM36856p = lb8Var2.m36856p();
                int size = lb8Var2.size();
                int i2 = 0;
                z = false;
                while (i2 < size) {
                    Object obj = objArrM36856p[i2];
                    sq8.m48647f(obj, "null cannot be cast to non-null type T of androidx.compose.runtime.collection.IdentityArraySet");
                    if (!sb8Var.m48123e(obj) || (iM48124f2 = sb8Var.m48124f(obj)) < 0) {
                        i = size;
                        objArr = objArrM36856p;
                    } else {
                        lb8 lb8VarM48133o = sb8Var.m48133o(iM48124f2);
                        Object[] objArrM36856p2 = lb8VarM48133o.m36856p();
                        int size2 = lb8VarM48133o.size();
                        int i3 = 0;
                        while (i3 < size2) {
                            Object obj2 = objArrM36856p2[i3];
                            sq8.m48647f(obj2, "null cannot be cast to non-null type T of androidx.compose.runtime.collection.IdentityArraySet");
                            im5 im5Var = (im5) obj2;
                            sq8.m48647f(im5Var, "null cannot be cast to non-null type androidx.compose.runtime.DerivedState<kotlin.Any?>");
                            int i4 = size;
                            Object obj3 = map.get(im5Var);
                            pxf pxfVarMo30769a = im5Var.mo30769a();
                            if (pxfVarMo30769a == null) {
                                pxfVarMo30769a = qxf.m45957h();
                            }
                            Object[] objArr2 = objArrM36856p;
                            boolean z2 = z;
                            if (pxfVarMo30769a.mo32849b(im5Var.mo30770q().mo30775a(), obj3)) {
                                this.f52857h.m27344c(im5Var);
                            } else {
                                int iM48124f3 = sb8Var2.m48124f(im5Var);
                                if (iM48124f3 >= 0) {
                                    lb8 lb8VarM48133o2 = sb8Var2.m48133o(iM48124f3);
                                    Object[] objArrM36856p3 = lb8VarM48133o2.m36856p();
                                    int size3 = lb8VarM48133o2.size();
                                    z = z2;
                                    int i5 = 0;
                                    while (i5 < size3) {
                                        Object obj4 = objArrM36856p3[i5];
                                        sq8.m48647f(obj4, "null cannot be cast to non-null type T of androidx.compose.runtime.collection.IdentityArraySet");
                                        lb8Var.add(obj4);
                                        i5++;
                                        z = true;
                                    }
                                }
                                i3++;
                                size = i4;
                                objArrM36856p = objArr2;
                            }
                            z = z2;
                            i3++;
                            size = i4;
                            objArrM36856p = objArr2;
                        }
                        i = size;
                        objArr = objArrM36856p;
                    }
                    int iM48124f4 = sb8Var2.m48124f(obj);
                    if (iM48124f4 >= 0) {
                        lb8 lb8VarM48133o3 = sb8Var2.m48133o(iM48124f4);
                        Object[] objArrM36856p4 = lb8VarM48133o3.m36856p();
                        int size4 = lb8VarM48133o3.size();
                        int i6 = 0;
                        while (i6 < size4) {
                            Object obj5 = objArrM36856p4[i6];
                            sq8.m48647f(obj5, "null cannot be cast to non-null type T of androidx.compose.runtime.collection.IdentityArraySet");
                            lb8Var.add(obj5);
                            i6++;
                            z = true;
                        }
                    }
                    i2++;
                    size = i;
                    objArrM36856p = objArr;
                }
            } else {
                Iterator it = set.iterator();
                z = false;
                while (it.hasNext()) {
                    Object next = it.next();
                    if (sb8Var.m48123e(next) && (iM48124f = sb8Var.m48124f(next)) >= 0) {
                        lb8 lb8VarM48133o4 = sb8Var.m48133o(iM48124f);
                        Object[] objArrM36856p5 = lb8VarM48133o4.m36856p();
                        int size5 = lb8VarM48133o4.size();
                        int i7 = 0;
                        while (i7 < size5) {
                            Object obj6 = objArrM36856p5[i7];
                            sq8.m48647f(obj6, "null cannot be cast to non-null type T of androidx.compose.runtime.collection.IdentityArraySet");
                            im5 im5Var2 = (im5) obj6;
                            sq8.m48647f(im5Var2, "null cannot be cast to non-null type androidx.compose.runtime.DerivedState<kotlin.Any?>");
                            Object obj7 = map.get(im5Var2);
                            pxf pxfVarMo30769a2 = im5Var2.mo30769a();
                            if (pxfVarMo30769a2 == null) {
                                pxfVarMo30769a2 = qxf.m45957h();
                            }
                            Iterator it2 = it;
                            if (pxfVarMo30769a2.mo32849b(im5Var2.mo30770q().mo30775a(), obj7)) {
                                this.f52857h.m27344c(im5Var2);
                            } else {
                                int iM48124f5 = sb8Var2.m48124f(im5Var2);
                                if (iM48124f5 >= 0) {
                                    lb8 lb8VarM48133o5 = sb8Var2.m48133o(iM48124f5);
                                    Object[] objArrM36856p6 = lb8VarM48133o5.m36856p();
                                    int size6 = lb8VarM48133o5.size();
                                    int i8 = 0;
                                    while (i8 < size6) {
                                        Object obj8 = objArrM36856p6[i8];
                                        sq8.m48647f(obj8, "null cannot be cast to non-null type T of androidx.compose.runtime.collection.IdentityArraySet");
                                        lb8Var.add(obj8);
                                        i8++;
                                        z = true;
                                    }
                                }
                            }
                            i7++;
                            it = it2;
                        }
                    }
                    Iterator it3 = it;
                    int iM48124f6 = sb8Var2.m48124f(next);
                    if (iM48124f6 >= 0) {
                        lb8 lb8VarM48133o6 = sb8Var2.m48133o(iM48124f6);
                        Object[] objArrM36856p7 = lb8VarM48133o6.m36856p();
                        int size7 = lb8VarM48133o6.size();
                        int i9 = 0;
                        while (i9 < size7) {
                            Object obj9 = objArrM36856p7[i9];
                            sq8.m48647f(obj9, "null cannot be cast to non-null type T of androidx.compose.runtime.collection.IdentityArraySet");
                            lb8Var.add(obj9);
                            i9++;
                            z = true;
                        }
                    }
                    it = it3;
                }
            }
            if (this.f52857h.m27357r()) {
                fqb fqbVar = this.f52857h;
                int iM27354o = fqbVar.m27354o();
                if (iM27354o > 0) {
                    Object[] objArrM27353n = fqbVar.m27353n();
                    int i10 = 0;
                    do {
                        m55377m((im5) objArrM27353n[i10]);
                        i10++;
                    } while (i10 < iM27354o);
                }
                this.f52857h.m27349i();
            }
            return z;
        }

        /* renamed from: i */
        public final void m55373i(Object obj) {
            sq8.m48649h(obj, "value");
            Object obj2 = this.f52851b;
            sq8.m48646e(obj2);
            int i = this.f52853d;
            jb8 jb8Var = this.f52852c;
            if (jb8Var == null) {
                jb8Var = new jb8();
                this.f52852c = jb8Var;
                this.f52855f.m35359l(obj2, jb8Var);
                y3i y3iVar = y3i.f54824a;
            }
            m55374j(obj, i, obj2, jb8Var);
        }

        /* renamed from: j */
        public final void m55374j(Object obj, int i, Object obj2, jb8 jb8Var) {
            if (this.f52859j > 0) {
                return;
            }
            int iM33467b = jb8Var.m33467b(obj, i);
            if ((obj instanceof im5) && iM33467b != i) {
                im5.InterfaceC14318a interfaceC14318aMo30770q = ((im5) obj).mo30770q();
                this.f52861l.put(obj, interfaceC14318aMo30770q.mo30775a());
                Object[] objArrMo30776b = interfaceC14318aMo30770q.mo30776b();
                sb8 sb8Var = this.f52860k;
                sb8Var.m48132n(obj);
                for (Object obj3 : objArrMo30776b) {
                    if (obj3 == null) {
                        break;
                    }
                    sb8Var.m48121c(obj3, obj);
                }
            }
            if (iM33467b == -1) {
                this.f52854e.m48121c(obj, obj2);
            }
        }

        /* renamed from: k */
        public final void m55375k(Object obj, Object obj2) {
            this.f52854e.m48131m(obj2, obj);
            if (!(obj2 instanceof im5) || this.f52854e.m48123e(obj2)) {
                return;
            }
            this.f52860k.m48132n(obj2);
            this.f52861l.remove(obj2);
        }

        /* renamed from: l */
        public final void m55376l(xk7 xk7Var) {
            sq8.m48649h(xk7Var, "predicate");
            kb8 kb8Var = this.f52855f;
            int iM35355h = kb8Var.m35355h();
            int i = 0;
            for (int i2 = 0; i2 < iM35355h; i2++) {
                Object obj = kb8Var.m35354g()[i2];
                sq8.m48647f(obj, "null cannot be cast to non-null type Key of androidx.compose.runtime.collection.IdentityArrayMap");
                jb8 jb8Var = (jb8) kb8Var.m35356i()[i2];
                Boolean bool = (Boolean) xk7Var.invoke(obj);
                if (bool.booleanValue()) {
                    Object[] objArrM33470e = jb8Var.m33470e();
                    int[] iArrM33472g = jb8Var.m33472g();
                    int iM33471f = jb8Var.m33471f();
                    for (int i3 = 0; i3 < iM33471f; i3++) {
                        Object obj2 = objArrM33470e[i3];
                        sq8.m48647f(obj2, "null cannot be cast to non-null type kotlin.Any");
                        int i4 = iArrM33472g[i3];
                        m55375k(obj, obj2);
                    }
                }
                if (!bool.booleanValue()) {
                    if (i != i2) {
                        kb8Var.m35354g()[i] = obj;
                        kb8Var.m35356i()[i] = kb8Var.m35356i()[i2];
                    }
                    i++;
                }
            }
            if (kb8Var.m35355h() > i) {
                int iM35355h2 = kb8Var.m35355h();
                for (int i5 = i; i5 < iM35355h2; i5++) {
                    kb8Var.m35354g()[i5] = null;
                    kb8Var.m35356i()[i5] = null;
                }
                kb8Var.f31891c = i;
            }
        }

        /* renamed from: m */
        public final void m55377m(im5 im5Var) {
            sq8.m48649h(im5Var, "derivedState");
            kb8 kb8Var = this.f52855f;
            int iMo39744f = exf.m25774F().mo39744f();
            sb8 sb8Var = this.f52854e;
            int iM48124f = sb8Var.m48124f(im5Var);
            if (iM48124f >= 0) {
                lb8 lb8VarM48133o = sb8Var.m48133o(iM48124f);
                Object[] objArrM36856p = lb8VarM48133o.m36856p();
                int size = lb8VarM48133o.size();
                for (int i = 0; i < size; i++) {
                    Object obj = objArrM36856p[i];
                    sq8.m48647f(obj, "null cannot be cast to non-null type T of androidx.compose.runtime.collection.IdentityArraySet");
                    jb8 jb8Var = (jb8) kb8Var.m35353f(obj);
                    if (jb8Var == null) {
                        jb8Var = new jb8();
                        kb8Var.m35359l(obj, jb8Var);
                        y3i y3iVar = y3i.f54824a;
                    }
                    m55374j(im5Var, iMo39744f, obj, jb8Var);
                }
            }
        }
    }

    /* renamed from: o.wxf$b */
    public static final class C18000b extends kf9 implements nl7 {
        public C18000b() {
            super(2);
        }

        /* renamed from: a */
        public final void m55378a(Set set, xwf xwfVar) {
            sq8.m48649h(set, "applied");
            sq8.m48649h(xwfVar, "<anonymous parameter 1>");
            wxf.this.m55354i(set);
            if (wxf.this.m55357l()) {
                wxf.this.m55362q();
            }
        }

        @Override // p001o.nl7
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            m55378a((Set) obj, (xwf) obj2);
            return y3i.f54824a;
        }
    }

    /* renamed from: o.wxf$c */
    public static final class C18001c extends kf9 implements xk7 {
        public C18001c() {
            super(1);
        }

        @Override // p001o.xk7
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m69048invoke(obj);
            return y3i.f54824a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m69048invoke(Object obj) {
            sq8.m48649h(obj, "state");
            if (wxf.this.f52848h) {
                return;
            }
            fqb fqbVar = wxf.this.f52846f;
            wxf wxfVar = wxf.this;
            synchronized (fqbVar) {
                C17999a c17999a = wxfVar.f52849i;
                sq8.m48646e(c17999a);
                c17999a.m55373i(obj);
                y3i y3iVar = y3i.f54824a;
            }
        }
    }

    /* renamed from: o.wxf$d */
    public static final class C18002d extends kf9 implements uk7 {
        public C18002d() {
            super(0);
        }

        @Override // p001o.uk7
        public /* bridge */ /* synthetic */ Object invoke() {
            m69049invoke();
            return y3i.f54824a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m69049invoke() {
            do {
                fqb fqbVar = wxf.this.f52846f;
                wxf wxfVar = wxf.this;
                synchronized (fqbVar) {
                    if (!wxfVar.f52843c) {
                        wxfVar.f52843c = true;
                        try {
                            fqb fqbVar2 = wxfVar.f52846f;
                            int iM27354o = fqbVar2.m27354o();
                            if (iM27354o > 0) {
                                Object[] objArrM27353n = fqbVar2.m27353n();
                                int i = 0;
                                do {
                                    ((C17999a) objArrM27353n[i]).m55370f();
                                    i++;
                                } while (i < iM27354o);
                            }
                            wxfVar.f52843c = false;
                        } finally {
                        }
                    }
                    y3i y3iVar = y3i.f54824a;
                }
            } while (wxf.this.m55357l());
        }
    }

    public wxf(xk7 xk7Var) {
        sq8.m48649h(xk7Var, "onChangedExecutor");
        this.f52841a = xk7Var;
        this.f52842b = new AtomicReference(null);
        this.f52844d = new C18000b();
        this.f52845e = new C18001c();
        this.f52846f = new fqb(new C17999a[16], 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: i */
    public final void m55354i(Set set) {
        Object obj;
        Set setX0;
        do {
            obj = this.f52842b.get();
            if (obj == null) {
                setX0 = set;
            } else if (obj instanceof Set) {
                setX0 = ch3.m21249n(obj, set);
            } else {
                if (!(obj instanceof List)) {
                    m55361p();
                    throw new qe9();
                }
                setX0 = kh3.x0((Collection) obj, bh3.m18963e(set));
            }
        } while (!ec3.m24748a(this.f52842b, obj, setX0));
    }

    /* renamed from: j */
    public final void m55355j() {
        synchronized (this.f52846f) {
            fqb fqbVar = this.f52846f;
            int iM27354o = fqbVar.m27354o();
            if (iM27354o > 0) {
                Object[] objArrM27353n = fqbVar.m27353n();
                int i = 0;
                do {
                    ((C17999a) objArrM27353n[i]).m55367c();
                    i++;
                } while (i < iM27354o);
            }
            y3i y3iVar = y3i.f54824a;
        }
    }

    /* renamed from: k */
    public final void m55356k(xk7 xk7Var) {
        sq8.m48649h(xk7Var, "predicate");
        synchronized (this.f52846f) {
            fqb fqbVar = this.f52846f;
            int iM27354o = fqbVar.m27354o();
            if (iM27354o > 0) {
                Object[] objArrM27353n = fqbVar.m27353n();
                int i = 0;
                do {
                    ((C17999a) objArrM27353n[i]).m55376l(xk7Var);
                    i++;
                } while (i < iM27354o);
            }
            y3i y3iVar = y3i.f54824a;
        }
    }

    /* renamed from: l */
    public final boolean m55357l() {
        boolean z;
        synchronized (this.f52846f) {
            z = this.f52843c;
        }
        if (z) {
            return false;
        }
        boolean z2 = false;
        while (true) {
            Set setM55360o = m55360o();
            if (setM55360o == null) {
                return z2;
            }
            synchronized (this.f52846f) {
                fqb fqbVar = this.f52846f;
                int iM27354o = fqbVar.m27354o();
                if (iM27354o > 0) {
                    Object[] objArrM27353n = fqbVar.m27353n();
                    int i = 0;
                    do {
                        z2 = ((C17999a) objArrM27353n[i]).m55372h(setM55360o) || z2;
                        i++;
                    } while (i < iM27354o);
                }
                y3i y3iVar = y3i.f54824a;
            }
        }
    }

    /* renamed from: m */
    public final C17999a m55358m(xk7 xk7Var) {
        Object obj;
        fqb fqbVar = this.f52846f;
        int iM27354o = fqbVar.m27354o();
        if (iM27354o > 0) {
            Object[] objArrM27353n = fqbVar.m27353n();
            int i = 0;
            do {
                obj = objArrM27353n[i];
                if (((C17999a) obj).m55369e() == xk7Var) {
                    break;
                }
                i++;
            } while (i < iM27354o);
            obj = null;
        } else {
            obj = null;
        }
        C17999a c17999a = (C17999a) obj;
        if (c17999a != null) {
            return c17999a;
        }
        sq8.m48647f(xk7Var, "null cannot be cast to non-null type kotlin.Function1<kotlin.Any, kotlin.Unit>");
        C17999a c17999a2 = new C17999a((xk7) azh.m18052e(xk7Var, 1));
        this.f52846f.m27344c(c17999a2);
        return c17999a2;
    }

    /* renamed from: n */
    public final void m55359n(Object obj, xk7 xk7Var, uk7 uk7Var) {
        C17999a c17999aM55358m;
        sq8.m48649h(obj, "scope");
        sq8.m48649h(xk7Var, "onValueChangedForScope");
        sq8.m48649h(uk7Var, "block");
        synchronized (this.f52846f) {
            c17999aM55358m = m55358m(xk7Var);
        }
        boolean z = this.f52848h;
        C17999a c17999a = this.f52849i;
        try {
            this.f52848h = false;
            this.f52849i = c17999aM55358m;
            c17999aM55358m.m55371g(obj, this.f52845e, uk7Var);
        } finally {
            this.f52849i = c17999a;
            this.f52848h = z;
        }
    }

    /* renamed from: o */
    public final Set m55360o() {
        Object obj;
        Object objSubList;
        Set set;
        do {
            obj = this.f52842b.get();
            objSubList = null;
            if (obj == null) {
                return null;
            }
            if (obj instanceof Set) {
                set = (Set) obj;
            } else {
                if (!(obj instanceof List)) {
                    m55361p();
                    throw new qe9();
                }
                List list = (List) obj;
                Set set2 = (Set) list.get(0);
                if (list.size() == 2) {
                    objSubList = list.get(1);
                } else if (list.size() > 2) {
                    objSubList = list.subList(1, list.size());
                }
                set = set2;
            }
        } while (!ec3.m24748a(this.f52842b, obj, objSubList));
        return set;
    }

    /* renamed from: p */
    public final Void m55361p() {
        go3.m29222v("Unexpected notification");
        throw new qe9();
    }

    /* renamed from: q */
    public final void m55362q() {
        this.f52841a.invoke(new C18002d());
    }

    /* renamed from: r */
    public final void m55363r() {
        this.f52847g = xwf.f54441e.m56931e(this.f52844d);
    }

    /* renamed from: s */
    public final void m55364s() {
        o9c o9cVar = this.f52847g;
        if (o9cVar != null) {
            o9cVar.dispose();
        }
    }
}
