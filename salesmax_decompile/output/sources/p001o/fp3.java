package p001o;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public final class fp3 implements u64, tee {

    /* renamed from: H */
    public kb8 f23866H;

    /* renamed from: L */
    public boolean f23867L;

    /* renamed from: M */
    public fp3 f23868M;

    /* renamed from: Q */
    public int f23869Q;

    /* renamed from: X */
    public final fo3 f23870X;

    /* renamed from: Y */
    public final q74 f23871Y;

    /* renamed from: Z */
    public final boolean f23872Z;

    /* renamed from: a */
    public final bp3 f23873a;

    /* renamed from: b */
    public final ao0 f23874b;

    /* renamed from: c */
    public final AtomicReference f23875c;

    /* renamed from: d */
    public final Object f23876d;

    /* renamed from: e */
    public final HashSet f23877e;

    /* renamed from: f */
    public final dwf f23878f;

    /* renamed from: g */
    public final sb8 f23879g;

    /* renamed from: h */
    public final HashSet f23880h;
    public boolean h0;
    public nl7 i0;

    /* renamed from: q */
    public final sb8 f23881q;

    /* renamed from: s */
    public final List f23882s;

    /* renamed from: x */
    public final List f23883x;

    /* renamed from: y */
    public final sb8 f23884y;

    /* renamed from: o.fp3$a */
    public static final class C13524a implements xhe {

        /* renamed from: a */
        public final Set f23885a;

        /* renamed from: b */
        public final List f23886b;

        /* renamed from: c */
        public final List f23887c;

        /* renamed from: d */
        public final List f23888d;

        /* renamed from: e */
        public List f23889e;

        /* renamed from: f */
        public List f23890f;

        public C13524a(Set set) {
            sq8.m48649h(set, "abandoning");
            this.f23885a = set;
            this.f23886b = new ArrayList();
            this.f23887c = new ArrayList();
            this.f23888d = new ArrayList();
        }

        @Override // p001o.xhe
        /* renamed from: a */
        public void mo27309a(yhe yheVar) {
            sq8.m48649h(yheVar, "instance");
            int iLastIndexOf = this.f23886b.lastIndexOf(yheVar);
            if (iLastIndexOf < 0) {
                this.f23887c.add(yheVar);
            } else {
                this.f23886b.remove(iLastIndexOf);
                this.f23885a.remove(yheVar);
            }
        }

        @Override // p001o.xhe
        /* renamed from: b */
        public void mo27310b(yhe yheVar) {
            sq8.m48649h(yheVar, "instance");
            int iLastIndexOf = this.f23887c.lastIndexOf(yheVar);
            if (iLastIndexOf < 0) {
                this.f23886b.add(yheVar);
            } else {
                this.f23887c.remove(iLastIndexOf);
                this.f23885a.remove(yheVar);
            }
        }

        @Override // p001o.xhe
        /* renamed from: c */
        public void mo27311c(sn3 sn3Var) {
            sq8.m48649h(sn3Var, "instance");
            List arrayList = this.f23890f;
            if (arrayList == null) {
                arrayList = new ArrayList();
                this.f23890f = arrayList;
            }
            arrayList.add(sn3Var);
        }

        /* renamed from: d */
        public final void m27312d() {
            if (!this.f23885a.isEmpty()) {
                Object objM54953a = wsh.f52622a.m54953a("Compose:abandons");
                try {
                    Iterator it = this.f23885a.iterator();
                    while (it.hasNext()) {
                        yhe yheVar = (yhe) it.next();
                        it.remove();
                        yheVar.mo26696b();
                    }
                    y3i y3iVar = y3i.f54824a;
                } finally {
                    wsh.f52622a.m54954b(objM54953a);
                }
            }
        }

        /* renamed from: e */
        public final void m27313e() {
            Object objM54953a;
            List list = this.f23889e;
            if (!(list == null || list.isEmpty())) {
                objM54953a = wsh.f52622a.m54953a("Compose:deactivations");
                try {
                    for (int size = list.size() - 1; -1 < size; size--) {
                        ((sn3) list.get(size)).mo5285c();
                    }
                    y3i y3iVar = y3i.f54824a;
                    wsh.f52622a.m54954b(objM54953a);
                    list.clear();
                } finally {
                }
            }
            if (!this.f23887c.isEmpty()) {
                objM54953a = wsh.f52622a.m54953a("Compose:onForgotten");
                try {
                    for (int size2 = this.f23887c.size() - 1; -1 < size2; size2--) {
                        yhe yheVar = (yhe) this.f23887c.get(size2);
                        if (!this.f23885a.contains(yheVar)) {
                            yheVar.mo26697c();
                        }
                    }
                    y3i y3iVar2 = y3i.f54824a;
                } finally {
                }
            }
            if (!this.f23886b.isEmpty()) {
                objM54953a = wsh.f52622a.m54953a("Compose:onRemembered");
                try {
                    List list2 = this.f23886b;
                    int size3 = list2.size();
                    for (int i = 0; i < size3; i++) {
                        yhe yheVar2 = (yhe) list2.get(i);
                        this.f23885a.remove(yheVar2);
                        yheVar2.mo26695a();
                    }
                    y3i y3iVar3 = y3i.f54824a;
                } finally {
                }
            }
            List list3 = this.f23890f;
            if (list3 == null || list3.isEmpty()) {
                return;
            }
            objM54953a = wsh.f52622a.m54953a("Compose:releases");
            try {
                for (int size4 = list3.size() - 1; -1 < size4; size4--) {
                    ((sn3) list3.get(size4)).mo5284b();
                }
                y3i y3iVar4 = y3i.f54824a;
                wsh.f52622a.m54954b(objM54953a);
                list3.clear();
            } finally {
            }
        }

        /* renamed from: f */
        public final void m27314f() {
            if (!this.f23888d.isEmpty()) {
                Object objM54953a = wsh.f52622a.m54953a("Compose:sideeffects");
                try {
                    List list = this.f23888d;
                    int size = list.size();
                    for (int i = 0; i < size; i++) {
                        ((uk7) list.get(i)).invoke();
                    }
                    this.f23888d.clear();
                    y3i y3iVar = y3i.f54824a;
                } finally {
                    wsh.f52622a.m54954b(objM54953a);
                }
            }
        }
    }

    public fp3(bp3 bp3Var, ao0 ao0Var, q74 q74Var) {
        sq8.m48649h(bp3Var, "parent");
        sq8.m48649h(ao0Var, "applier");
        this.f23873a = bp3Var;
        this.f23874b = ao0Var;
        this.f23875c = new AtomicReference(null);
        this.f23876d = new Object();
        HashSet hashSet = new HashSet();
        this.f23877e = hashSet;
        dwf dwfVar = new dwf();
        this.f23878f = dwfVar;
        this.f23879g = new sb8();
        this.f23880h = new HashSet();
        this.f23881q = new sb8();
        ArrayList arrayList = new ArrayList();
        this.f23882s = arrayList;
        ArrayList arrayList2 = new ArrayList();
        this.f23883x = arrayList2;
        this.f23884y = new sb8();
        this.f23866H = new kb8(0, 1, null);
        fo3 fo3Var = new fo3(ao0Var, bp3Var, dwfVar, hashSet, arrayList, arrayList2, this);
        bp3Var.m19512k(fo3Var);
        this.f23870X = fo3Var;
        this.f23871Y = q74Var;
        this.f23872Z = bp3Var instanceof uee;
        this.i0 = qn3.f42186a.m45677a();
    }

    /* renamed from: A */
    public final lv8 m27278A(ree reeVar, sc0 sc0Var, Object obj) {
        synchronized (this.f23876d) {
            fp3 fp3Var = this.f23868M;
            if (fp3Var == null || !this.f23878f.m23900B(this.f23869Q, sc0Var)) {
                fp3Var = null;
            }
            if (fp3Var == null) {
                if (m27283F(reeVar, obj)) {
                    return lv8.IMMINENT;
                }
                if (obj == null) {
                    this.f23866H.m35359l(reeVar, null);
                } else {
                    gp3.m29264d(this.f23866H, reeVar, obj);
                }
            }
            if (fp3Var != null) {
                return fp3Var.m27278A(reeVar, sc0Var, obj);
            }
            this.f23873a.mo19509h(this);
            return mo27298p() ? lv8.DEFERRED : lv8.SCHEDULED;
        }
    }

    /* renamed from: B */
    public final void m27279B(Object obj) {
        sb8 sb8Var = this.f23879g;
        int iM48124f = sb8Var.m48124f(obj);
        if (iM48124f >= 0) {
            lb8 lb8VarM48133o = sb8Var.m48133o(iM48124f);
            Object[] objArrM36856p = lb8VarM48133o.m36856p();
            int size = lb8VarM48133o.size();
            for (int i = 0; i < size; i++) {
                Object obj2 = objArrM36856p[i];
                sq8.m48647f(obj2, "null cannot be cast to non-null type T of androidx.compose.runtime.collection.IdentityArraySet");
                ree reeVar = (ree) obj2;
                if (reeVar.m46610r(obj) == lv8.IMMINENT) {
                    this.f23884y.m48121c(obj, reeVar);
                }
            }
        }
    }

    /* renamed from: C */
    public final void m27280C(im5 im5Var) {
        sq8.m48649h(im5Var, "state");
        if (this.f23879g.m48123e(im5Var)) {
            return;
        }
        this.f23881q.m48132n(im5Var);
    }

    /* renamed from: D */
    public final void m27281D(Object obj, ree reeVar) {
        sq8.m48649h(obj, "instance");
        sq8.m48649h(reeVar, "scope");
        this.f23879g.m48131m(obj, reeVar);
    }

    /* renamed from: E */
    public final kb8 m27282E() {
        kb8 kb8Var = this.f23866H;
        this.f23866H = new kb8(0, 1, null);
        return kb8Var;
    }

    /* renamed from: F */
    public final boolean m27283F(ree reeVar, Object obj) {
        return mo27298p() && this.f23870X.e1(reeVar, obj);
    }

    @Override // p001o.u64, p001o.tee
    /* renamed from: a */
    public void mo27284a(Object obj) {
        ree reeVarC0;
        sq8.m48649h(obj, "value");
        if (m27308z() || (reeVarC0 = this.f23870X.c0()) == null) {
            return;
        }
        reeVarC0.m46597D(true);
        if (reeVarC0.m46613u(obj)) {
            return;
        }
        this.f23879g.m48121c(obj, reeVarC0);
        if (obj instanceof im5) {
            this.f23881q.m48132n(obj);
            for (Object obj2 : ((im5) obj).mo30770q().mo30776b()) {
                if (obj2 == null) {
                    return;
                }
                this.f23881q.m48121c(obj2, obj);
            }
        }
    }

    @Override // p001o.u64
    /* renamed from: b */
    public void mo27285b(uk7 uk7Var) {
        sq8.m48649h(uk7Var, "block");
        this.f23870X.r0(uk7Var);
    }

    @Override // p001o.u64
    /* renamed from: c */
    public void mo27286c() {
        synchronized (this.f23876d) {
            try {
                if (!this.f23883x.isEmpty()) {
                    m27304v(this.f23883x);
                }
                y3i y3iVar = y3i.f54824a;
            } catch (Throwable th) {
                try {
                    if (!this.f23877e.isEmpty()) {
                        new C13524a(this.f23877e).m27312d();
                    }
                    throw th;
                } catch (Exception e) {
                    m27297o();
                    throw e;
                }
            }
        }
    }

    @Override // p001o.tee
    /* renamed from: d */
    public lv8 mo27287d(ree reeVar, Object obj) {
        fp3 fp3Var;
        sq8.m48649h(reeVar, "scope");
        if (reeVar.m46604l()) {
            reeVar.m46618z(true);
        }
        sc0 sc0VarM46602j = reeVar.m46602j();
        if (sc0VarM46602j == null || !sc0VarM46602j.m48145b()) {
            return lv8.IGNORED;
        }
        if (this.f23878f.m23903I(sc0VarM46602j)) {
            return !reeVar.m46603k() ? lv8.IGNORED : m27278A(reeVar, sc0VarM46602j, obj);
        }
        synchronized (this.f23876d) {
            fp3Var = this.f23868M;
        }
        return fp3Var != null && fp3Var.m27283F(reeVar, obj) ? lv8.IMMINENT : lv8.IGNORED;
    }

    @Override // p001o.ap3
    public void dispose() {
        synchronized (this.f23876d) {
            if (!this.h0) {
                this.h0 = true;
                this.i0 = qn3.f42186a.m45678b();
                List listD0 = this.f23870X.d0();
                if (listD0 != null) {
                    m27304v(listD0);
                }
                boolean z = this.f23878f.m23911r() > 0;
                if (z || (true ^ this.f23877e.isEmpty())) {
                    C13524a c13524a = new C13524a(this.f23877e);
                    if (z) {
                        this.f23874b.m17553g();
                        gwf gwfVarM23902G = this.f23878f.m23902G();
                        try {
                            go3.m29195O(gwfVarM23902G, c13524a);
                            y3i y3iVar = y3i.f54824a;
                            gwfVarM23902G.m29584G();
                            this.f23874b.clear();
                            this.f23874b.mo17550d();
                            c13524a.m27313e();
                        } catch (Throwable th) {
                            gwfVarM23902G.m29584G();
                            throw th;
                        }
                    }
                    c13524a.m27312d();
                }
                this.f23870X.m27186N();
            }
            y3i y3iVar2 = y3i.f54824a;
        }
        this.f23873a.mo19515n(this);
    }

    @Override // p001o.u64
    /* renamed from: e */
    public void mo27288e(List list) {
        sq8.m48649h(list, "references");
        int size = list.size();
        boolean z = false;
        int i = 0;
        while (true) {
            if (i >= size) {
                z = true;
                break;
            } else if (!sq8.m48644c(((zmb) ((hwc) list.get(i)).m31229c()).m59617b(), this)) {
                break;
            } else {
                i++;
            }
        }
        go3.m29198R(z);
        try {
            this.f23870X.k0(list);
            y3i y3iVar = y3i.f54824a;
        } finally {
        }
    }

    @Override // p001o.u64
    /* renamed from: f */
    public void mo27289f() {
        synchronized (this.f23876d) {
            for (Object obj : this.f23878f.m23912v()) {
                ree reeVar = obj instanceof ree ? (ree) obj : null;
                if (reeVar != null) {
                    reeVar.invalidate();
                }
            }
            y3i y3iVar = y3i.f54824a;
        }
    }

    @Override // p001o.tee
    /* renamed from: g */
    public void mo27290g(ree reeVar) {
        sq8.m48649h(reeVar, "scope");
        this.f23867L = true;
    }

    @Override // p001o.u64
    /* renamed from: h */
    public boolean mo27291h() {
        boolean zY0;
        synchronized (this.f23876d) {
            m27306x();
            try {
                kb8 kb8VarM27282E = m27282E();
                try {
                    zY0 = this.f23870X.y0(kb8VarM27282E);
                    if (!zY0) {
                        m27307y();
                    }
                } catch (Exception e) {
                    this.f23866H = kb8VarM27282E;
                    throw e;
                }
            } finally {
            }
        }
        return zY0;
    }

    @Override // p001o.u64
    /* renamed from: i */
    public void mo27292i(nl7 nl7Var) {
        sq8.m48649h(nl7Var, FirebaseAnalytics.Param.CONTENT);
        try {
            synchronized (this.f23876d) {
                m27306x();
                kb8 kb8VarM27282E = m27282E();
                try {
                    this.f23870X.m27181I(kb8VarM27282E, nl7Var);
                    y3i y3iVar = y3i.f54824a;
                } catch (Exception e) {
                    this.f23866H = kb8VarM27282E;
                    throw e;
                }
            }
        } finally {
        }
    }

    @Override // p001o.ap3
    public boolean isDisposed() {
        return this.h0;
    }

    @Override // p001o.u64
    /* renamed from: j */
    public void mo27293j(ymb ymbVar) {
        sq8.m48649h(ymbVar, "state");
        C13524a c13524a = new C13524a(this.f23877e);
        gwf gwfVarM23902G = ymbVar.m58000a().m23902G();
        try {
            go3.m29195O(gwfVarM23902G, c13524a);
            y3i y3iVar = y3i.f54824a;
            gwfVarM23902G.m29584G();
            c13524a.m27313e();
        } catch (Throwable th) {
            gwfVarM23902G.m29584G();
            throw th;
        }
    }

    @Override // p001o.u64
    /* renamed from: k */
    public boolean mo27294k(Set set) {
        sq8.m48649h(set, "values");
        for (Object obj : set) {
            if (this.f23879g.m48123e(obj) || this.f23881q.m48123e(obj)) {
                return true;
            }
        }
        return false;
    }

    @Override // p001o.ap3
    /* renamed from: l */
    public void mo5275l(nl7 nl7Var) {
        sq8.m48649h(nl7Var, FirebaseAnalytics.Param.CONTENT);
        if (!(!this.h0)) {
            throw new IllegalStateException("The composition is disposed".toString());
        }
        this.i0 = nl7Var;
        this.f23873a.mo19502a(this, nl7Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.util.Set[]] */
    @Override // p001o.u64
    /* renamed from: m */
    public void mo27295m(Set set) {
        Object obj;
        Set setM27244B;
        sq8.m48649h(set, "values");
        do {
            obj = this.f23875c.get();
            if (obj == null ? true : sq8.m48644c(obj, gp3.f25633a)) {
                setM27244B = set;
            } else if (obj instanceof Set) {
                setM27244B = new Set[]{obj, set};
            } else {
                if (!(obj instanceof Object[])) {
                    throw new IllegalStateException(("corrupt pendingModifications: " + this.f23875c).toString());
                }
                sq8.m48647f(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.collections.Set<kotlin.Any>>");
                setM27244B = fp0.m27244B((Set[]) obj, set);
            }
        } while (!ec3.m24748a(this.f23875c, obj, setM27244B));
        if (obj == null) {
            synchronized (this.f23876d) {
                m27307y();
                y3i y3iVar = y3i.f54824a;
            }
        }
    }

    @Override // p001o.u64
    /* renamed from: n */
    public void mo27296n() {
        synchronized (this.f23876d) {
            try {
                m27304v(this.f23882s);
                m27307y();
                y3i y3iVar = y3i.f54824a;
            } catch (Throwable th) {
                try {
                    if (!this.f23877e.isEmpty()) {
                        new C13524a(this.f23877e).m27312d();
                    }
                    throw th;
                } catch (Exception e) {
                    m27297o();
                    throw e;
                }
            }
        }
    }

    /* renamed from: o */
    public final void m27297o() {
        this.f23875c.set(null);
        this.f23882s.clear();
        this.f23883x.clear();
        this.f23877e.clear();
    }

    @Override // p001o.u64
    /* renamed from: p */
    public boolean mo27298p() {
        return this.f23870X.n0();
    }

    @Override // p001o.u64
    /* renamed from: q */
    public void mo27299q(Object obj) {
        sq8.m48649h(obj, "value");
        synchronized (this.f23876d) {
            m27279B(obj);
            sb8 sb8Var = this.f23881q;
            int iM48124f = sb8Var.m48124f(obj);
            if (iM48124f >= 0) {
                lb8 lb8VarM48133o = sb8Var.m48133o(iM48124f);
                Object[] objArrM36856p = lb8VarM48133o.m36856p();
                int size = lb8VarM48133o.size();
                for (int i = 0; i < size; i++) {
                    Object obj2 = objArrM36856p[i];
                    sq8.m48647f(obj2, "null cannot be cast to non-null type T of androidx.compose.runtime.collection.IdentityArraySet");
                    m27279B((im5) obj2);
                }
            }
            y3i y3iVar = y3i.f54824a;
        }
    }

    @Override // p001o.u64
    /* renamed from: r */
    public void mo27300r() {
        synchronized (this.f23876d) {
            try {
                this.f23870X.m27178F();
                if (!this.f23877e.isEmpty()) {
                    new C13524a(this.f23877e).m27312d();
                }
                y3i y3iVar = y3i.f54824a;
            } catch (Throwable th) {
                try {
                    if (!this.f23877e.isEmpty()) {
                        new C13524a(this.f23877e).m27312d();
                    }
                    throw th;
                } catch (Exception e) {
                    m27297o();
                    throw e;
                }
            }
        }
    }

    @Override // p001o.u64
    /* renamed from: s */
    public Object mo27301s(u64 u64Var, int i, uk7 uk7Var) {
        sq8.m48649h(uk7Var, "block");
        if (u64Var == null || sq8.m48644c(u64Var, this) || i < 0) {
            return uk7Var.invoke();
        }
        this.f23868M = (fp3) u64Var;
        this.f23869Q = i;
        try {
            return uk7Var.invoke();
        } finally {
            this.f23868M = null;
            this.f23869Q = 0;
        }
    }

    /* renamed from: t */
    public final HashSet m27302t(HashSet hashSet, Object obj, boolean z) {
        sb8 sb8Var = this.f23879g;
        int iM48124f = sb8Var.m48124f(obj);
        if (iM48124f >= 0) {
            lb8 lb8VarM48133o = sb8Var.m48133o(iM48124f);
            Object[] objArrM36856p = lb8VarM48133o.m36856p();
            int size = lb8VarM48133o.size();
            for (int i = 0; i < size; i++) {
                Object obj2 = objArrM36856p[i];
                sq8.m48647f(obj2, "null cannot be cast to non-null type T of androidx.compose.runtime.collection.IdentityArraySet");
                ree reeVar = (ree) obj2;
                if (!this.f23884y.m48131m(obj, reeVar) && reeVar.m46610r(obj) != lv8.IGNORED) {
                    if (!reeVar.m46611s() || z) {
                        if (hashSet == null) {
                            hashSet = new HashSet();
                        }
                        hashSet.add(reeVar);
                    } else {
                        this.f23880h.add(reeVar);
                    }
                }
            }
        }
        return hashSet;
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0105  */
    /* renamed from: u */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m27303u(Set set, boolean z) {
        HashSet hashSetM27302t;
        boolean z2;
        boolean z3;
        boolean z4;
        if (set instanceof lb8) {
            lb8 lb8Var = (lb8) set;
            Object[] objArrM36856p = lb8Var.m36856p();
            int size = lb8Var.size();
            hashSetM27302t = null;
            for (int i = 0; i < size; i++) {
                Object obj = objArrM36856p[i];
                sq8.m48647f(obj, "null cannot be cast to non-null type T of androidx.compose.runtime.collection.IdentityArraySet");
                if (obj instanceof ree) {
                    ((ree) obj).m46610r(null);
                } else {
                    hashSetM27302t = m27302t(hashSetM27302t, obj, z);
                    sb8 sb8Var = this.f23881q;
                    int iM48124f = sb8Var.m48124f(obj);
                    if (iM48124f >= 0) {
                        lb8 lb8VarM48133o = sb8Var.m48133o(iM48124f);
                        Object[] objArrM36856p2 = lb8VarM48133o.m36856p();
                        int size2 = lb8VarM48133o.size();
                        for (int i2 = 0; i2 < size2; i2++) {
                            Object obj2 = objArrM36856p2[i2];
                            sq8.m48647f(obj2, "null cannot be cast to non-null type T of androidx.compose.runtime.collection.IdentityArraySet");
                            hashSetM27302t = m27302t(hashSetM27302t, (im5) obj2, z);
                        }
                    }
                }
            }
        } else {
            hashSetM27302t = null;
            for (Object obj3 : set) {
                if (obj3 instanceof ree) {
                    ((ree) obj3).m46610r(null);
                } else {
                    HashSet hashSetM27302t2 = m27302t(hashSetM27302t, obj3, z);
                    sb8 sb8Var2 = this.f23881q;
                    int iM48124f2 = sb8Var2.m48124f(obj3);
                    if (iM48124f2 >= 0) {
                        lb8 lb8VarM48133o2 = sb8Var2.m48133o(iM48124f2);
                        Object[] objArrM36856p3 = lb8VarM48133o2.m36856p();
                        int size3 = lb8VarM48133o2.size();
                        for (int i3 = 0; i3 < size3; i3++) {
                            Object obj4 = objArrM36856p3[i3];
                            sq8.m48647f(obj4, "null cannot be cast to non-null type T of androidx.compose.runtime.collection.IdentityArraySet");
                            hashSetM27302t2 = m27302t(hashSetM27302t2, (im5) obj4, z);
                        }
                    }
                    hashSetM27302t = hashSetM27302t2;
                }
            }
        }
        if (z) {
            boolean z5 = true;
            if (!this.f23880h.isEmpty()) {
                sb8 sb8Var3 = this.f23879g;
                int[] iArrM48129k = sb8Var3.m48129k();
                lb8[] lb8VarArrM48127i = sb8Var3.m48127i();
                Object[] objArrM48130l = sb8Var3.m48130l();
                int iM48128j = sb8Var3.m48128j();
                int i4 = 0;
                int i5 = 0;
                while (i4 < iM48128j) {
                    int i6 = iArrM48129k[i4];
                    lb8 lb8Var2 = lb8VarArrM48127i[i6];
                    sq8.m48646e(lb8Var2);
                    Object[] objArrM36856p4 = lb8Var2.m36856p();
                    int size4 = lb8Var2.size();
                    int i7 = 0;
                    int i8 = 0;
                    while (i7 < size4) {
                        Object obj5 = objArrM36856p4[i7];
                        sq8.m48647f(obj5, "null cannot be cast to non-null type T of androidx.compose.runtime.collection.IdentityArraySet");
                        lb8[] lb8VarArr = lb8VarArrM48127i;
                        ree reeVar = (ree) obj5;
                        int i9 = iM48128j;
                        if (this.f23880h.contains(reeVar)) {
                            z2 = true;
                        } else {
                            if (hashSetM27302t != null) {
                                z2 = true;
                                z4 = hashSetM27302t.contains(reeVar);
                                if (z4) {
                                    z3 = false;
                                }
                                if (!z3) {
                                    int i10 = i8;
                                    if (i10 != i7) {
                                        objArrM36856p4[i10] = obj5;
                                    }
                                    i8 = i10 + 1;
                                }
                                i7++;
                                lb8VarArrM48127i = lb8VarArr;
                                z5 = z2;
                                iM48128j = i9;
                            } else {
                                z2 = true;
                            }
                            if (z4) {
                            }
                            if (!z3) {
                            }
                            i7++;
                            lb8VarArrM48127i = lb8VarArr;
                            z5 = z2;
                            iM48128j = i9;
                        }
                        z3 = z2;
                        if (!z3) {
                        }
                        i7++;
                        lb8VarArrM48127i = lb8VarArr;
                        z5 = z2;
                        iM48128j = i9;
                    }
                    lb8[] lb8VarArr2 = lb8VarArrM48127i;
                    int i11 = iM48128j;
                    int i12 = i8;
                    boolean z6 = z5;
                    for (int i13 = i12; i13 < size4; i13++) {
                        objArrM36856p4[i13] = null;
                    }
                    lb8Var2.f33542a = i12;
                    if (lb8Var2.size() > 0) {
                        if (i5 != i4) {
                            int i14 = iArrM48129k[i5];
                            iArrM48129k[i5] = i6;
                            iArrM48129k[i4] = i14;
                        }
                        i5++;
                    }
                    i4++;
                    lb8VarArrM48127i = lb8VarArr2;
                    z5 = z6;
                    iM48128j = i11;
                }
                int iM48128j2 = sb8Var3.m48128j();
                for (int i15 = i5; i15 < iM48128j2; i15++) {
                    objArrM48130l[iArrM48129k[i15]] = null;
                }
                sb8Var3.m48134p(i5);
                this.f23880h.clear();
                m27305w();
                return;
            }
        }
        if (hashSetM27302t != null) {
            sb8 sb8Var4 = this.f23879g;
            int[] iArrM48129k2 = sb8Var4.m48129k();
            lb8[] lb8VarArrM48127i2 = sb8Var4.m48127i();
            Object[] objArrM48130l2 = sb8Var4.m48130l();
            int iM48128j3 = sb8Var4.m48128j();
            int i16 = 0;
            int i17 = 0;
            while (i16 < iM48128j3) {
                int i18 = iArrM48129k2[i16];
                lb8 lb8Var3 = lb8VarArrM48127i2[i18];
                sq8.m48646e(lb8Var3);
                Object[] objArrM36856p5 = lb8Var3.m36856p();
                int size5 = lb8Var3.size();
                int i19 = 0;
                int i20 = 0;
                while (i19 < size5) {
                    Object obj6 = objArrM36856p5[i19];
                    sq8.m48647f(obj6, "null cannot be cast to non-null type T of androidx.compose.runtime.collection.IdentityArraySet");
                    lb8[] lb8VarArr3 = lb8VarArrM48127i2;
                    if (!hashSetM27302t.contains((ree) obj6)) {
                        if (i20 != i19) {
                            objArrM36856p5[i20] = obj6;
                        }
                        i20++;
                    }
                    i19++;
                    lb8VarArrM48127i2 = lb8VarArr3;
                }
                lb8[] lb8VarArr4 = lb8VarArrM48127i2;
                for (int i21 = i20; i21 < size5; i21++) {
                    objArrM36856p5[i21] = null;
                }
                lb8Var3.f33542a = i20;
                if (lb8Var3.size() > 0) {
                    if (i17 != i16) {
                        int i22 = iArrM48129k2[i17];
                        iArrM48129k2[i17] = i18;
                        iArrM48129k2[i16] = i22;
                    }
                    i17++;
                }
                i16++;
                lb8VarArrM48127i2 = lb8VarArr4;
            }
            int iM48128j4 = sb8Var4.m48128j();
            for (int i23 = i17; i23 < iM48128j4; i23++) {
                objArrM48130l2[iArrM48129k2[i23]] = null;
            }
            sb8Var4.m48134p(i17);
            m27305w();
        }
    }

    /* renamed from: v */
    public final void m27304v(List list) {
        boolean zIsEmpty;
        C13524a c13524a = new C13524a(this.f23877e);
        try {
            if (list.isEmpty()) {
                if (zIsEmpty) {
                    return;
                } else {
                    return;
                }
            }
            Object objM54953a = wsh.f52622a.m54953a("Compose:applyChanges");
            try {
                this.f23874b.m17553g();
                gwf gwfVarM23902G = this.f23878f.m23902G();
                try {
                    ao0 ao0Var = this.f23874b;
                    int size = list.size();
                    int i = 0;
                    for (int i2 = 0; i2 < size; i2++) {
                        ((ql7) list.get(i2)).invoke(ao0Var, gwfVarM23902G, c13524a);
                    }
                    list.clear();
                    y3i y3iVar = y3i.f54824a;
                    gwfVarM23902G.m29584G();
                    this.f23874b.mo17550d();
                    wsh wshVar = wsh.f52622a;
                    wshVar.m54954b(objM54953a);
                    c13524a.m27313e();
                    c13524a.m27314f();
                    if (this.f23867L) {
                        objM54953a = wshVar.m54953a("Compose:unobserve");
                        try {
                            this.f23867L = false;
                            sb8 sb8Var = this.f23879g;
                            int[] iArrM48129k = sb8Var.m48129k();
                            lb8[] lb8VarArrM48127i = sb8Var.m48127i();
                            Object[] objArrM48130l = sb8Var.m48130l();
                            int iM48128j = sb8Var.m48128j();
                            int i3 = 0;
                            int i4 = 0;
                            while (i3 < iM48128j) {
                                int i5 = iArrM48129k[i3];
                                lb8 lb8Var = lb8VarArrM48127i[i5];
                                sq8.m48646e(lb8Var);
                                Object[] objArrM36856p = lb8Var.m36856p();
                                int size2 = lb8Var.size();
                                int i6 = i;
                                while (i < size2) {
                                    lb8[] lb8VarArr = lb8VarArrM48127i;
                                    Object obj = objArrM36856p[i];
                                    int i7 = iM48128j;
                                    sq8.m48647f(obj, "null cannot be cast to non-null type T of androidx.compose.runtime.collection.IdentityArraySet");
                                    if (!(!((ree) obj).m46609q())) {
                                        if (i6 != i) {
                                            objArrM36856p[i6] = obj;
                                        }
                                        i6++;
                                    }
                                    i++;
                                    lb8VarArrM48127i = lb8VarArr;
                                    iM48128j = i7;
                                }
                                lb8[] lb8VarArr2 = lb8VarArrM48127i;
                                int i8 = iM48128j;
                                for (int i9 = i6; i9 < size2; i9++) {
                                    objArrM36856p[i9] = null;
                                }
                                lb8Var.f33542a = i6;
                                if (lb8Var.size() > 0) {
                                    if (i4 != i3) {
                                        int i10 = iArrM48129k[i4];
                                        iArrM48129k[i4] = i5;
                                        iArrM48129k[i3] = i10;
                                    }
                                    i4++;
                                }
                                i3++;
                                lb8VarArrM48127i = lb8VarArr2;
                                iM48128j = i8;
                                i = 0;
                            }
                            int iM48128j2 = sb8Var.m48128j();
                            for (int i11 = i4; i11 < iM48128j2; i11++) {
                                objArrM48130l[iArrM48129k[i11]] = null;
                            }
                            sb8Var.m48134p(i4);
                            m27305w();
                            y3i y3iVar2 = y3i.f54824a;
                            wsh.f52622a.m54954b(objM54953a);
                        } finally {
                        }
                    }
                    if (this.f23883x.isEmpty()) {
                        c13524a.m27312d();
                    }
                } catch (Throwable th) {
                    gwfVarM23902G.m29584G();
                    throw th;
                }
            } finally {
            }
        } finally {
            if (this.f23883x.isEmpty()) {
                c13524a.m27312d();
            }
        }
    }

    /* renamed from: w */
    public final void m27305w() {
        sb8 sb8Var = this.f23881q;
        int[] iArrM48129k = sb8Var.m48129k();
        lb8[] lb8VarArrM48127i = sb8Var.m48127i();
        Object[] objArrM48130l = sb8Var.m48130l();
        int iM48128j = sb8Var.m48128j();
        int i = 0;
        int i2 = 0;
        while (i < iM48128j) {
            int i3 = iArrM48129k[i];
            lb8 lb8Var = lb8VarArrM48127i[i3];
            sq8.m48646e(lb8Var);
            Object[] objArrM36856p = lb8Var.m36856p();
            int size = lb8Var.size();
            int i4 = 0;
            int i5 = 0;
            while (i4 < size) {
                Object obj = objArrM36856p[i4];
                sq8.m48647f(obj, "null cannot be cast to non-null type T of androidx.compose.runtime.collection.IdentityArraySet");
                lb8[] lb8VarArr = lb8VarArrM48127i;
                if (!(!this.f23879g.m48123e((im5) obj))) {
                    if (i5 != i4) {
                        objArrM36856p[i5] = obj;
                    }
                    i5++;
                }
                i4++;
                lb8VarArrM48127i = lb8VarArr;
            }
            lb8[] lb8VarArr2 = lb8VarArrM48127i;
            for (int i6 = i5; i6 < size; i6++) {
                objArrM36856p[i6] = null;
            }
            lb8Var.f33542a = i5;
            if (lb8Var.size() > 0) {
                if (i2 != i) {
                    int i7 = iArrM48129k[i2];
                    iArrM48129k[i2] = i3;
                    iArrM48129k[i] = i7;
                }
                i2++;
            }
            i++;
            lb8VarArrM48127i = lb8VarArr2;
        }
        int iM48128j2 = sb8Var.m48128j();
        for (int i8 = i2; i8 < iM48128j2; i8++) {
            objArrM48130l[iArrM48129k[i8]] = null;
        }
        sb8Var.m48134p(i2);
        if (!this.f23880h.isEmpty()) {
            Iterator it = this.f23880h.iterator();
            sq8.m48648g(it, "iterator()");
            while (it.hasNext()) {
                if (!((ree) it.next()).m46611s()) {
                    it.remove();
                }
            }
        }
    }

    /* renamed from: x */
    public final void m27306x() {
        Object andSet = this.f23875c.getAndSet(gp3.f25633a);
        if (andSet != null) {
            if (sq8.m48644c(andSet, gp3.f25633a)) {
                go3.m29222v("pending composition has not been applied");
                throw new qe9();
            }
            if (andSet instanceof Set) {
                m27303u((Set) andSet, true);
                return;
            }
            if (!(andSet instanceof Object[])) {
                go3.m29222v("corrupt pendingModifications drain: " + this.f23875c);
                throw new qe9();
            }
            for (Set set : (Set[]) andSet) {
                m27303u(set, true);
            }
        }
    }

    /* renamed from: y */
    public final void m27307y() {
        Object andSet = this.f23875c.getAndSet(null);
        if (sq8.m48644c(andSet, gp3.f25633a)) {
            return;
        }
        if (andSet instanceof Set) {
            m27303u((Set) andSet, false);
            return;
        }
        if (andSet instanceof Object[]) {
            for (Set set : (Set[]) andSet) {
                m27303u(set, false);
            }
            return;
        }
        if (andSet == null) {
            go3.m29222v("calling recordModificationsOf and applyChanges concurrently is not supported");
            throw new qe9();
        }
        go3.m29222v("corrupt pendingModifications drain: " + this.f23875c);
        throw new qe9();
    }

    /* renamed from: z */
    public final boolean m27308z() {
        return this.f23870X.m27198Z();
    }

    public /* synthetic */ fp3(bp3 bp3Var, ao0 ao0Var, q74 q74Var, int i, id5 id5Var) {
        this(bp3Var, ao0Var, (i & 4) != 0 ? null : q74Var);
    }
}
