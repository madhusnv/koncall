package p001o;

/* loaded from: classes6.dex */
public abstract class vw7 extends t7 {

    /* renamed from: b */
    public iw7 f50954b;

    @Override // p001o.t7
    /* renamed from: A */
    public Object mo36261A(Object obj, Class cls) {
        return m49496B(this.f50954b, obj, cls);
    }

    /* renamed from: C */
    public iw7 m53504C() {
        return this.f50954b;
    }

    /* renamed from: E */
    public void m53505E(iw7 iw7Var) {
        try {
            iw7 iw7Var2 = this.f50954b;
            if (getServer() != null) {
                getServer().m18895I().m25930e(this, iw7Var2, iw7Var, "handler");
            }
            if (iw7Var != null) {
                iw7Var.setServer(getServer());
            }
            this.f50954b = iw7Var;
            if (iw7Var2 == null || !iw7Var2.isStarted()) {
                return;
            }
            iw7Var2.stop();
        } catch (Exception e) {
            IllegalStateException illegalStateException = new IllegalStateException();
            illegalStateException.initCause(e);
            throw illegalStateException;
        }
    }

    @Override // p001o.s7, p001o.d8
    public void doStart() {
        iw7 iw7Var = this.f50954b;
        if (iw7Var != null) {
            iw7Var.start();
        }
        super.doStart();
    }

    @Override // p001o.s7, p001o.d8
    public void doStop() {
        super.doStop();
        iw7 iw7Var = this.f50954b;
        if (iw7Var != null) {
            iw7Var.stop();
        }
    }

    @Override // p001o.iw7
    public void handle(String str, o48 o48Var, p48 p48Var, int i) {
        if (this.f50954b == null || !isStarted()) {
            return;
        }
        this.f50954b.handle(str, o48Var, p48Var, i);
    }

    @Override // p001o.s7, p001o.iw7
    public void setServer(bgf bgfVar) {
        bgf server = getServer();
        super.setServer(bgfVar);
        iw7 iw7VarM53504C = m53504C();
        if (iw7VarM53504C != null) {
            iw7VarM53504C.setServer(bgfVar);
        }
        if (bgfVar == null || bgfVar == server) {
            return;
        }
        bgfVar.m18895I().m25930e(this, null, this.f50954b, "handler");
    }
}
