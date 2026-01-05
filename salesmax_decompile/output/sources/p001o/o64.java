package p001o;

import p001o.q74;

/* loaded from: classes6.dex */
public abstract class o64 extends vb1 {
    private final q74 _context;
    private transient n64 intercepted;

    public o64(n64 n64Var, q74 q74Var) {
        super(n64Var);
        this._context = q74Var;
    }

    @Override // p001o.n64
    public q74 getContext() {
        q74 q74Var = this._context;
        sq8.m48646e(q74Var);
        return q74Var;
    }

    public final n64 intercepted() {
        n64 n64VarMo42994O = this.intercepted;
        if (n64VarMo42994O == null) {
            p64 p64Var = (p64) getContext().get(p64.f39391p);
            if (p64Var == null || (n64VarMo42994O = p64Var.mo42994O(this)) == null) {
                n64VarMo42994O = this;
            }
            this.intercepted = n64VarMo42994O;
        }
        return n64VarMo42994O;
    }

    @Override // p001o.vb1
    public void releaseIntercepted() {
        n64 n64Var = this.intercepted;
        if (n64Var != null && n64Var != this) {
            q74.InterfaceC16311b interfaceC16311b = getContext().get(p64.f39391p);
            sq8.m48646e(interfaceC16311b);
            ((p64) interfaceC16311b).mo42995o(n64Var);
        }
        this.intercepted = km3.f32424a;
    }

    public o64(n64 n64Var) {
        this(n64Var, n64Var != null ? n64Var.getContext() : null);
    }
}
