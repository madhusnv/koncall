package p001o;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes6.dex */
public final class r4g extends p9 implements cqb, v37, pm7 {

    /* renamed from: f */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f42984f = AtomicReferenceFieldUpdater.newUpdater(r4g.class, Object.class, "_state$volatile");
    private volatile /* synthetic */ Object _state$volatile;

    /* renamed from: e */
    public int f42985e;

    /* renamed from: o.r4g$a */
    public static final class C16535a extends o64 {

        /* renamed from: a */
        public Object f42986a;

        /* renamed from: b */
        public Object f42987b;

        /* renamed from: c */
        public Object f42988c;

        /* renamed from: d */
        public Object f42989d;

        /* renamed from: e */
        public Object f42990e;

        /* renamed from: f */
        public /* synthetic */ Object f42991f;

        /* renamed from: h */
        public int f42993h;

        public C16535a(n64 n64Var) {
            super(n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            this.f42991f = obj;
            this.f42993h |= Integer.MIN_VALUE;
            return r4g.this.mo9775a(null, this);
        }
    }

    public r4g(Object obj) {
        this._state$volatile = obj;
    }

    /* JADX WARN: Path cross not found for [B:33:0x009d, B:35:0x00a3], limit reached: 48 */
    /* JADX WARN: Path cross not found for [B:35:0x00a3, B:33:0x009d], limit reached: 48 */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0098 A[Catch: all -> 0x0072, TryCatch #0 {all -> 0x0072, blocks: (B:15:0x003e, B:29:0x008e, B:31:0x0098, B:33:0x009d, B:43:0x00be, B:45:0x00c4, B:35:0x00a3, B:39:0x00aa, B:20:0x005c, B:23:0x006e, B:28:0x007f), top: B:50:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x009d A[Catch: all -> 0x0072, TryCatch #0 {all -> 0x0072, blocks: (B:15:0x003e, B:29:0x008e, B:31:0x0098, B:33:0x009d, B:43:0x00be, B:45:0x00c4, B:35:0x00a3, B:39:0x00aa, B:20:0x005c, B:23:0x006e, B:28:0x007f), top: B:50:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00bc A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00c4 A[Catch: all -> 0x0072, TRY_LEAVE, TryCatch #0 {all -> 0x0072, blocks: (B:15:0x003e, B:29:0x008e, B:31:0x0098, B:33:0x009d, B:43:0x00be, B:45:0x00c4, B:35:0x00a3, B:39:0x00aa, B:20:0x005c, B:23:0x006e, B:28:0x007f), top: B:50:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:44:0x00c2 -> B:29:0x008e). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:46:0x00d4 -> B:29:0x008e). Please report as a decompilation issue!!! */
    @Override // p001o.zlf, p001o.v37
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object mo9775a(z37 z37Var, n64 n64Var) {
        C16535a c16535a;
        r4g r4gVar;
        t4g t4gVar;
        z37 z37Var2;
        p69 p69Var;
        Object obj;
        Object obj2;
        Object obj3;
        if (n64Var instanceof C16535a) {
            c16535a = (C16535a) n64Var;
            int i = c16535a.f42993h;
            if ((i & Integer.MIN_VALUE) != 0) {
                c16535a.f42993h = i - Integer.MIN_VALUE;
            } else {
                c16535a = new C16535a(n64Var);
            }
        }
        Object obj4 = c16535a.f42991f;
        Object objM51918f = uq8.m51918f();
        int i2 = c16535a.f42993h;
        try {
            if (i2 == 0) {
                wre.m54934b(obj4);
                r4gVar = this;
                t4gVar = (t4g) m43196h();
            } else if (i2 == 1) {
                t4gVar = (t4g) c16535a.f42988c;
                z37Var = (z37) c16535a.f42987b;
                r4gVar = (r4g) c16535a.f42986a;
                wre.m54934b(obj4);
            } else if (i2 == 2) {
                obj = c16535a.f42990e;
                p69Var = (p69) c16535a.f42989d;
                t4gVar = (t4g) c16535a.f42988c;
                z37Var2 = (z37) c16535a.f42987b;
                r4gVar = (r4g) c16535a.f42986a;
                wre.m54934b(obj4);
                if (!t4gVar.m49306h()) {
                }
                obj2 = f42984f.get(r4gVar);
                if (p69Var != null) {
                }
                if (obj != null) {
                }
                if (obj2 != y4c.f54875a) {
                }
                c16535a.f42986a = r4gVar;
                c16535a.f42987b = z37Var2;
                c16535a.f42988c = t4gVar;
                c16535a.f42989d = p69Var;
                c16535a.f42990e = obj2;
                c16535a.f42993h = 2;
                if (z37Var2.emit(obj3, c16535a) != objM51918f) {
                }
            } else {
                if (i2 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                obj = c16535a.f42990e;
                p69Var = (p69) c16535a.f42989d;
                t4gVar = (t4g) c16535a.f42988c;
                z37Var2 = (z37) c16535a.f42987b;
                r4gVar = (r4g) c16535a.f42986a;
                wre.m54934b(obj4);
                obj2 = f42984f.get(r4gVar);
                if (p69Var != null) {
                    z69.m58845j(p69Var);
                }
                if (obj != null || !sq8.m48644c(obj, obj2)) {
                    obj3 = obj2 != y4c.f54875a ? null : obj2;
                    c16535a.f42986a = r4gVar;
                    c16535a.f42987b = z37Var2;
                    c16535a.f42988c = t4gVar;
                    c16535a.f42989d = p69Var;
                    c16535a.f42990e = obj2;
                    c16535a.f42993h = 2;
                    if (z37Var2.emit(obj3, c16535a) != objM51918f) {
                        return objM51918f;
                    }
                    obj = obj2;
                }
                if (!t4gVar.m49306h()) {
                    c16535a.f42986a = r4gVar;
                    c16535a.f42987b = z37Var2;
                    c16535a.f42988c = t4gVar;
                    c16535a.f42989d = p69Var;
                    c16535a.f42990e = obj;
                    c16535a.f42993h = 3;
                    if (t4gVar.m49303e(c16535a) == objM51918f) {
                        return objM51918f;
                    }
                }
                obj2 = f42984f.get(r4gVar);
                if (p69Var != null) {
                }
                if (obj != null) {
                }
                if (obj2 != y4c.f54875a) {
                }
                c16535a.f42986a = r4gVar;
                c16535a.f42987b = z37Var2;
                c16535a.f42988c = t4gVar;
                c16535a.f42989d = p69Var;
                c16535a.f42990e = obj2;
                c16535a.f42993h = 2;
                if (z37Var2.emit(obj3, c16535a) != objM51918f) {
                }
            }
            z37Var2 = z37Var;
            p69Var = (p69) c16535a.getContext().get(p69.f39399t);
            obj = null;
            obj2 = f42984f.get(r4gVar);
            if (p69Var != null) {
            }
            if (obj != null) {
            }
            if (obj2 != y4c.f54875a) {
            }
            c16535a.f42986a = r4gVar;
            c16535a.f42987b = z37Var2;
            c16535a.f42988c = t4gVar;
            c16535a.f42989d = p69Var;
            c16535a.f42990e = obj2;
            c16535a.f42993h = 2;
            if (z37Var2.emit(obj3, c16535a) != objM51918f) {
            }
        } catch (Throwable th) {
            r4gVar.m43197k(t4gVar);
            throw th;
        }
    }

    @Override // p001o.zpb
    /* renamed from: b */
    public boolean mo17498b(Object obj) {
        setValue(obj);
        return true;
    }

    @Override // p001o.cqb
    public boolean compareAndSet(Object obj, Object obj2) {
        if (obj == null) {
            obj = y4c.f54875a;
        }
        if (obj2 == null) {
            obj2 = y4c.f54875a;
        }
        return m46218q(obj, obj2);
    }

    @Override // p001o.zpb
    /* renamed from: d */
    public void mo17499d() {
        throw new UnsupportedOperationException("MutableStateFlow.resetReplayCache is not supported");
    }

    @Override // p001o.pm7
    /* renamed from: e */
    public v37 mo17500e(q74 q74Var, int i, wl1 wl1Var) {
        return s4g.m47841d(this, q74Var, i, wl1Var);
    }

    @Override // p001o.zpb, p001o.z37
    public Object emit(Object obj, n64 n64Var) {
        setValue(obj);
        return y3i.f54824a;
    }

    @Override // p001o.cqb, p001o.q4g
    public Object getValue() {
        lgg lggVar = y4c.f54875a;
        Object obj = f42984f.get(this);
        if (obj == lggVar) {
            return null;
        }
        return obj;
    }

    @Override // p001o.p9
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public t4g mo17501i() {
        return new t4g();
    }

    @Override // p001o.p9
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public t4g[] mo17502j(int i) {
        return new t4g[i];
    }

    /* renamed from: q */
    public final boolean m46218q(Object obj, Object obj2) {
        int i;
        r9[] r9VarArrM43199m;
        synchronized (this) {
            Object obj3 = f42984f.get(this);
            if (obj != null && !sq8.m48644c(obj3, obj)) {
                return false;
            }
            if (sq8.m48644c(obj3, obj2)) {
                return true;
            }
            f42984f.set(this, obj2);
            int i2 = this.f42985e;
            if ((i2 & 1) != 0) {
                this.f42985e = i2 + 2;
                return true;
            }
            int i3 = i2 + 1;
            this.f42985e = i3;
            r9[] r9VarArrM43199m2 = m43199m();
            y3i y3iVar = y3i.f54824a;
            while (true) {
                t4g[] t4gVarArr = (t4g[]) r9VarArrM43199m2;
                if (t4gVarArr != null) {
                    for (t4g t4gVar : t4gVarArr) {
                        if (t4gVar != null) {
                            t4gVar.m49305g();
                        }
                    }
                }
                synchronized (this) {
                    i = this.f42985e;
                    if (i == i3) {
                        this.f42985e = i3 + 1;
                        return true;
                    }
                    r9VarArrM43199m = m43199m();
                    y3i y3iVar2 = y3i.f54824a;
                }
                r9VarArrM43199m2 = r9VarArrM43199m;
                i3 = i;
            }
        }
    }

    @Override // p001o.cqb
    public void setValue(Object obj) {
        if (obj == null) {
            obj = y4c.f54875a;
        }
        m46218q(null, obj);
    }
}
