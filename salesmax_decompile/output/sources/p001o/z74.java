package p001o;

import p001o.p64;
import p001o.q74;
import p001o.z74;

/* loaded from: classes6.dex */
public abstract class z74 extends i7 implements p64 {

    /* renamed from: b */
    public static final C18565a f56626b = new C18565a(null);

    /* renamed from: o.z74$a */
    public static final class C18565a extends j7 {
        public /* synthetic */ C18565a(id5 id5Var) {
            this();
        }

        /* renamed from: d */
        public static final z74 m58862d(q74.InterfaceC16311b interfaceC16311b) {
            if (interfaceC16311b instanceof z74) {
                return (z74) interfaceC16311b;
            }
            return null;
        }

        public C18565a() {
            super(p64.f39391p, new xk7() { // from class: o.y74
                @Override // p001o.xk7
                public final Object invoke(Object obj) {
                    return z74.C18565a.m58862d((q74.InterfaceC16311b) obj);
                }
            });
        }
    }

    public z74() {
        super(p64.f39391p);
    }

    public static /* synthetic */ z74 o0(z74 z74Var, int i, String str, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: limitedParallelism");
        }
        if ((i2 & 2) != 0) {
            str = null;
        }
        return z74Var.l0(i, str);
    }

    /* renamed from: K */
    public abstract void mo22314K(q74 q74Var, Runnable runnable);

    @Override // p001o.p64
    /* renamed from: O */
    public final n64 mo42994O(n64 n64Var) {
        return new yt5(this, n64Var);
    }

    /* renamed from: X */
    public void mo26180X(q74 q74Var, Runnable runnable) {
        mo22314K(q74Var, runnable);
    }

    @Override // p001o.i7, p001o.q74.InterfaceC16311b, p001o.q74
    public q74.InterfaceC16311b get(q74.InterfaceC16312c interfaceC16312c) {
        return p64.C15961a.m42996a(this, interfaceC16312c);
    }

    public boolean k0(q74 q74Var) {
        return true;
    }

    public z74 l0(int i, String str) {
        jda.m33601a(i);
        return new ida(this, i, str);
    }

    @Override // p001o.i7, p001o.q74
    public q74 minusKey(q74.InterfaceC16312c interfaceC16312c) {
        return p64.C15961a.m42997b(this, interfaceC16312c);
    }

    @Override // p001o.p64
    /* renamed from: o */
    public final void mo42995o(n64 n64Var) {
        sq8.m48647f(n64Var, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
        ((yt5) n64Var).m58196r();
    }

    public String toString() {
        return o75.m41657a(this) + '@' + o75.m41658b(this);
    }
}
