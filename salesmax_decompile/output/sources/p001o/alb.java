package p001o;

/* loaded from: classes2.dex */
public interface alb {

    /* renamed from: a */
    public static final C12214a f14913a = C12214a.f14914b;

    /* renamed from: o.alb$a */
    public static final class C12214a implements alb {

        /* renamed from: b */
        public static final /* synthetic */ C12214a f14914b = new C12214a();

        @Override // p001o.alb
        /* renamed from: a */
        public boolean mo17349a(xk7 xk7Var) {
            sq8.m48649h(xk7Var, "predicate");
            return true;
        }

        @Override // p001o.alb
        /* renamed from: b */
        public Object mo17350b(Object obj, nl7 nl7Var) {
            sq8.m48649h(nl7Var, "operation");
            return obj;
        }

        @Override // p001o.alb
        /* renamed from: c */
        public alb mo17351c(alb albVar) {
            sq8.m48649h(albVar, "other");
            return albVar;
        }

        public String toString() {
            return "Modifier";
        }
    }

    /* renamed from: o.alb$b */
    public interface InterfaceC12215b extends alb {
        @Override // p001o.alb
        /* renamed from: a */
        default boolean mo17349a(xk7 xk7Var) {
            sq8.m48649h(xk7Var, "predicate");
            return ((Boolean) xk7Var.invoke(this)).booleanValue();
        }

        @Override // p001o.alb
        /* renamed from: b */
        default Object mo17350b(Object obj, nl7 nl7Var) {
            sq8.m48649h(nl7Var, "operation");
            return nl7Var.invoke(obj, this);
        }
    }

    /* renamed from: o.alb$c */
    public static abstract class AbstractC12216c implements rk5 {

        /* renamed from: H */
        public boolean f14915H;

        /* renamed from: b */
        public h84 f14917b;

        /* renamed from: c */
        public int f14918c;

        /* renamed from: e */
        public AbstractC12216c f14920e;

        /* renamed from: f */
        public AbstractC12216c f14921f;

        /* renamed from: g */
        public r9c f14922g;

        /* renamed from: h */
        public xzb f14923h;

        /* renamed from: q */
        public boolean f14924q;

        /* renamed from: s */
        public boolean f14925s;

        /* renamed from: x */
        public boolean f14926x;

        /* renamed from: y */
        public boolean f14927y;

        /* renamed from: a */
        public AbstractC12216c f14916a = this;

        /* renamed from: d */
        public int f14919d = -1;

        /* renamed from: A */
        public final int m17352A() {
            return this.f14919d;
        }

        /* renamed from: B */
        public final AbstractC12216c m17353B() {
            return this.f14921f;
        }

        /* renamed from: C */
        public final xzb m17354C() {
            return this.f14923h;
        }

        /* renamed from: D */
        public final boolean m17355D() {
            return this.f14924q;
        }

        /* renamed from: E */
        public final int m17356E() {
            return this.f14918c;
        }

        /* renamed from: F */
        public final r9c m17357F() {
            return this.f14922g;
        }

        /* renamed from: G */
        public final AbstractC12216c m17358G() {
            return this.f14920e;
        }

        /* renamed from: H */
        public boolean m17359H() {
            return true;
        }

        /* renamed from: I */
        public final boolean m17360I() {
            return this.f14925s;
        }

        /* renamed from: J */
        public final boolean m17361J() {
            return this.f14915H;
        }

        /* renamed from: K */
        public void m17362K() {
            if (!(!this.f14915H)) {
                throw new IllegalStateException("node attached multiple times".toString());
            }
            if (!(this.f14923h != null)) {
                throw new IllegalStateException("attach invoked on a node without a coordinator".toString());
            }
            this.f14915H = true;
            this.f14926x = true;
        }

        /* renamed from: L */
        public void m17363L() {
            if (!this.f14915H) {
                throw new IllegalStateException("Cannot detach a node that is not attached".toString());
            }
            if (!(!this.f14926x)) {
                throw new IllegalStateException("Must run runAttachLifecycle() before markAsDetached()".toString());
            }
            if (!(!this.f14927y)) {
                throw new IllegalStateException("Must run runDetachLifecycle() before markAsDetached()".toString());
            }
            this.f14915H = false;
            h84 h84Var = this.f14917b;
            if (h84Var != null) {
                i84.m31709c(h84Var, new hlb());
                this.f14917b = null;
            }
        }

        /* renamed from: M */
        public void mo17364M() {
        }

        /* renamed from: N */
        public void mo17365N() {
        }

        /* renamed from: O */
        public void mo4912O() {
        }

        /* renamed from: P */
        public void m17366P() {
            if (!this.f14915H) {
                throw new IllegalStateException("Check failed.".toString());
            }
            mo4912O();
        }

        /* renamed from: Q */
        public void m17367Q() {
            if (!this.f14915H) {
                throw new IllegalStateException("Must run markAsAttached() prior to runAttachLifecycle".toString());
            }
            if (!this.f14926x) {
                throw new IllegalStateException("Must run runAttachLifecycle() only once after markAsAttached()".toString());
            }
            this.f14926x = false;
            mo17364M();
            this.f14927y = true;
        }

        /* renamed from: R */
        public void m17368R() {
            if (!this.f14915H) {
                throw new IllegalStateException("node detached multiple times".toString());
            }
            if (!(this.f14923h != null)) {
                throw new IllegalStateException("detach invoked on a node without a coordinator".toString());
            }
            if (!this.f14927y) {
                throw new IllegalStateException("Must run runDetachLifecycle() once after runAttachLifecycle() and before markAsDetached()".toString());
            }
            this.f14927y = false;
            mo17365N();
        }

        /* renamed from: S */
        public final void m17369S(int i) {
            this.f14919d = i;
        }

        /* renamed from: T */
        public final void m17370T(AbstractC12216c abstractC12216c) {
            this.f14921f = abstractC12216c;
        }

        /* renamed from: U */
        public final void m17371U(boolean z) {
            this.f14924q = z;
        }

        /* renamed from: V */
        public final void m17372V(int i) {
            this.f14918c = i;
        }

        /* renamed from: W */
        public final void m17373W(r9c r9cVar) {
            this.f14922g = r9cVar;
        }

        /* renamed from: X */
        public final void m17374X(AbstractC12216c abstractC12216c) {
            this.f14920e = abstractC12216c;
        }

        /* renamed from: Y */
        public final void m17375Y(boolean z) {
            this.f14925s = z;
        }

        /* renamed from: Z */
        public void m17376Z(xzb xzbVar) {
            this.f14923h = xzbVar;
        }

        @Override // p001o.rk5
        /* renamed from: h */
        public final AbstractC12216c mo17377h() {
            return this.f14916a;
        }
    }

    /* renamed from: a */
    boolean mo17349a(xk7 xk7Var);

    /* renamed from: b */
    Object mo17350b(Object obj, nl7 nl7Var);

    /* renamed from: c */
    default alb mo17351c(alb albVar) {
        sq8.m48649h(albVar, "other");
        return albVar == f14913a ? this : new qi3(this, albVar);
    }
}
