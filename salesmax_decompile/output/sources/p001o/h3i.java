package p001o;

/* loaded from: classes6.dex */
public final class h3i extends f6f {

    /* renamed from: e */
    public final ThreadLocal f26178e;
    private volatile boolean threadLocalIsSet;

    /* JADX WARN: Illegal instructions before constructor call */
    public h3i(q74 q74Var, n64 n64Var) {
        j3i j3iVar = j3i.f29729a;
        super(q74Var.get(j3iVar) == null ? q74Var.plus(j3iVar) : q74Var, n64Var);
        this.f26178e = new ThreadLocal();
        if (n64Var.getContext().get(p64.f39391p) instanceof z74) {
            return;
        }
        Object objM35820i = kkh.m35820i(q74Var, null);
        kkh.m35817f(q74Var, objM35820i);
        X0(q74Var, objM35820i);
    }

    @Override // p001o.f6f, p001o.h7
    public void S0(Object obj) {
        if (this.threadLocalIsSet) {
            hwc hwcVar = (hwc) this.f26178e.get();
            if (hwcVar != null) {
                kkh.m35817f((q74) hwcVar.m31227a(), hwcVar.m31228b());
            }
            this.f26178e.remove();
        }
        Object objM46954a = rm3.m46954a(obj, this.f22801d);
        n64 n64Var = this.f22801d;
        q74 context = n64Var.getContext();
        Object objM35820i = kkh.m35820i(context, null);
        h3i h3iVarM51084m = objM35820i != kkh.f32357a ? u74.m51084m(n64Var, context, objM35820i) : null;
        try {
            this.f22801d.resumeWith(objM46954a);
            y3i y3iVar = y3i.f54824a;
        } finally {
            if (h3iVarM51084m == null || h3iVarM51084m.W0()) {
                kkh.m35817f(context, objM35820i);
            }
        }
    }

    public final boolean W0() {
        boolean z = this.threadLocalIsSet && this.f26178e.get() == null;
        this.f26178e.remove();
        return !z;
    }

    public final void X0(q74 q74Var, Object obj) {
        this.threadLocalIsSet = true;
        this.f26178e.set(vyh.m53620a(q74Var, obj));
    }
}
