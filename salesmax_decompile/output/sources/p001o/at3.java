package p001o;

import java.io.EOFException;
import java.net.Socket;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.util.concurrent.ConcurrentHashMap;
import p001o.fmh;
import p001o.q74;
import p001o.qja;

/* loaded from: classes3.dex */
public final class at3 extends bt3 {

    /* renamed from: c */
    public final long f15214c;

    /* renamed from: d */
    public final h84 f15215d;

    /* renamed from: e */
    public final ConcurrentHashMap f15216e;

    /* renamed from: o.at3$a */
    public static final class C12245a extends jgg implements nl7 {

        /* renamed from: a */
        public int f15217a;

        /* renamed from: b */
        public /* synthetic */ Object f15218b;

        public C12245a(n64 n64Var) {
            super(2, n64Var);
        }

        @Override // p001o.vb1
        public final n64 create(Object obj, n64 n64Var) {
            C12245a c12245a = at3.this.new C12245a(n64Var);
            c12245a.f15218b = obj;
            return c12245a;
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            Object objM51918f = uq8.m51918f();
            int i = this.f15217a;
            if (i == 0) {
                wre.m54934b(obj);
                h84 h84Var = (h84) this.f15218b;
                q74.InterfaceC16311b interfaceC16311b = at3.this.f15215d.mo6529D().get(p69.f39399t);
                if (interfaceC16311b == null) {
                    throw new IllegalArgumentException(("Connection idle monitor scope cannot be cancelled because it does not have a job: " + h84Var).toString());
                }
                this.f15217a = 1;
                if (z69.m58842g((p69) interfaceC16311b, this) == objM51918f) {
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
            return ((C12245a) create(h84Var, n64Var)).invokeSuspend(y3i.f54824a);
        }
    }

    /* renamed from: o.at3$b */
    public static final class C12246b extends jgg implements nl7 {

        /* renamed from: a */
        public int f15220a;

        /* renamed from: b */
        public final /* synthetic */ p69 f15221b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C12246b(p69 p69Var, n64 n64Var) {
            super(2, n64Var);
            this.f15221b = p69Var;
        }

        @Override // p001o.vb1
        public final n64 create(Object obj, n64 n64Var) {
            return new C12246b(this.f15221b, n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            Object objM51918f = uq8.m51918f();
            int i = this.f15220a;
            if (i == 0) {
                wre.m54934b(obj);
                p69 p69Var = this.f15221b;
                this.f15220a = 1;
                if (z69.m58842g(p69Var, this) == objM51918f) {
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
            return ((C12246b) create(h84Var, n64Var)).invokeSuspend(y3i.f54824a);
        }
    }

    /* renamed from: o.at3$c */
    public static final class C12247c extends jgg implements nl7 {

        /* renamed from: a */
        public int f15222a;

        /* renamed from: c */
        public final /* synthetic */ xr3 f15224c;

        /* renamed from: d */
        public final /* synthetic */ q74 f15225d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C12247c(xr3 xr3Var, q74 q74Var, n64 n64Var) {
            super(2, n64Var);
            this.f15224c = xr3Var;
            this.f15225d = q74Var;
        }

        @Override // p001o.vb1
        public final n64 create(Object obj, n64 n64Var) {
            return at3.this.new C12247c(this.f15224c, this.f15225d, n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            Object objM51918f = uq8.m51918f();
            int i = this.f15222a;
            if (i == 0) {
                wre.m54934b(obj);
                at3 at3Var = at3.this;
                xr3 xr3Var = this.f15224c;
                q74 q74Var = this.f15225d;
                this.f15222a = 1;
                if (at3Var.m17804C(xr3Var, q74Var, this) == objM51918f) {
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
            return ((C12247c) create(h84Var, n64Var)).invokeSuspend(y3i.f54824a);
        }
    }

    public /* synthetic */ at3(long j, id5 id5Var) {
        this(j);
    }

    /* renamed from: A */
    public static final String m17776A(xr3 xr3Var, long j) {
        return "Monitoring canceled for " + xr3Var + " in " + ((Object) k16.m34876V(j));
    }

    /* renamed from: B */
    public static final String m17777B(p69 p69Var, xr3 xr3Var) {
        return "Launched coroutine " + p69Var + " to monitor " + xr3Var;
    }

    /* renamed from: D */
    public static final String m17778D() {
        return "Monitoring coroutine has been cancelled. Ending polling loop.";
    }

    /* renamed from: E */
    public static final String m17779E(xr3 xr3Var) {
        return "Failed to poll " + xr3Var + ". Ending polling loop. Connection may be unstable now.";
    }

    /* renamed from: F */
    public static final String m17780F() {
        return "Attempting to reset soTimeout...";
    }

    /* renamed from: G */
    public static final String m17781G() {
        return "soTimeout reset.";
    }

    /* renamed from: H */
    public static final String m17782H(xr3 xr3Var) {
        return "Failed to reset socket timeout on " + xr3Var + ". Connection may be unstable now.";
    }

    /* renamed from: I */
    public static final String m17783I(xr3 xr3Var) {
        return "Socket for " + xr3Var + " closed before monitoring started. Skipping polling loop.";
    }

    /* renamed from: J */
    public static final String m17784J(xr3 xr3Var) {
        return "Commence socket monitoring for " + xr3Var;
    }

    /* renamed from: K */
    public static final String m17785K(xr3 xr3Var) {
        return "Polling socket for " + xr3Var;
    }

    /* renamed from: L */
    public static final String m17786L(xr3 xr3Var) {
        return "Socket still alive for " + xr3Var;
    }

    /* renamed from: M */
    public static final String m17787M(xr3 xr3Var) {
        return "Socket closed remotely for " + xr3Var;
    }

    /* renamed from: z */
    public static final String m17803z(xr3 xr3Var) {
        return "Cancel monitoring for " + xr3Var;
    }

    /* renamed from: C */
    public final Object m17804C(final xr3 xr3Var, q74 q74Var, n64 n64Var) throws SocketException {
        boolean z;
        Throwable th;
        uk7 uk7Var;
        String strMo26336c = kge.m35689b(at3.class).mo26336c();
        if (strMo26336c == null) {
            throw new IllegalArgumentException("logger<T> cannot be used on an anonymous object".toString());
        }
        qja qjaVarM52400e = v74.m52400e(q74Var, strMo26336c);
        Socket socketMo56684d = xr3Var.mo56684d();
        try {
            im1 im1VarPeek = uac.m51310c(uac.m51317j(socketMo56684d)).peek();
            qja.C16414b.m45550c(qjaVarM52400e, null, new uk7() { // from class: o.xs3
                @Override // p001o.uk7
                public final Object invoke() {
                    return at3.m17784J(xr3Var);
                }
            }, 1, null);
            int soTimeout = socketMo56684d.getSoTimeout();
            try {
                socketMo56684d.setSoTimeout((int) k16.m34894y(this.f15214c));
                while (z69.m58849n(n64Var.getContext())) {
                    try {
                        qja.C16414b.m45550c(qjaVarM52400e, null, new uk7() { // from class: o.ys3
                            @Override // p001o.uk7
                            public final Object invoke() {
                                return at3.m17785K(xr3Var);
                            }
                        }, 1, null);
                        im1VarPeek.readByte();
                    } catch (EOFException unused) {
                        qja.C16414b.m45550c(qjaVarM52400e, null, new uk7() { // from class: o.os3
                            @Override // p001o.uk7
                            public final Object invoke() {
                                return at3.m17787M(xr3Var);
                            }
                        }, 1, null);
                        ggj.m28626f(socketMo56684d);
                        try {
                            return y3i.f54824a;
                        } catch (Throwable th2) {
                            th = th2;
                            z = false;
                            try {
                                qjaVarM52400e.mo18186c(th, new uk7() { // from class: o.qs3
                                    @Override // p001o.uk7
                                    public final Object invoke() {
                                        return at3.m17779E(xr3Var);
                                    }
                                });
                                if (z) {
                                    qja.C16414b.m45550c(qjaVarM52400e, null, new uk7() { // from class: o.us3
                                        @Override // p001o.uk7
                                        public final Object invoke() {
                                            return at3.m17780F();
                                        }
                                    }, 1, null);
                                    try {
                                        xr3Var.mo56684d().setSoTimeout(soTimeout);
                                        qja.C16414b.m45550c(qjaVarM52400e, null, new uk7() { // from class: o.vs3
                                            @Override // p001o.uk7
                                            public final Object invoke() {
                                                return at3.m17781G();
                                            }
                                        }, 1, null);
                                    } catch (Throwable th3) {
                                        th = th3;
                                        uk7Var = new uk7() { // from class: o.ws3
                                            @Override // p001o.uk7
                                            public final Object invoke() {
                                                return at3.m17782H(xr3Var);
                                            }
                                        };
                                        qjaVarM52400e.mo18186c(th, uk7Var);
                                        return y3i.f54824a;
                                    }
                                }
                                return y3i.f54824a;
                            } catch (Throwable th4) {
                                if (z) {
                                    qja.C16414b.m45550c(qjaVarM52400e, null, new uk7() { // from class: o.us3
                                        @Override // p001o.uk7
                                        public final Object invoke() {
                                            return at3.m17780F();
                                        }
                                    }, 1, null);
                                    try {
                                        xr3Var.mo56684d().setSoTimeout(soTimeout);
                                        qja.C16414b.m45550c(qjaVarM52400e, null, new uk7() { // from class: o.vs3
                                            @Override // p001o.uk7
                                            public final Object invoke() {
                                                return at3.m17781G();
                                            }
                                        }, 1, null);
                                    } catch (Throwable th5) {
                                        qjaVarM52400e.mo18186c(th5, new uk7() { // from class: o.ws3
                                            @Override // p001o.uk7
                                            public final Object invoke() {
                                                return at3.m17782H(xr3Var);
                                            }
                                        });
                                    }
                                }
                                throw th4;
                            }
                        }
                    } catch (SocketTimeoutException unused2) {
                        qja.C16414b.m45550c(qjaVarM52400e, null, new uk7() { // from class: o.zs3
                            @Override // p001o.uk7
                            public final Object invoke() {
                                return at3.m17786L(xr3Var);
                            }
                        }, 1, null);
                    }
                }
                qja.C16414b.m45550c(qjaVarM52400e, null, new uk7() { // from class: o.ps3
                    @Override // p001o.uk7
                    public final Object invoke() {
                        return at3.m17778D();
                    }
                }, 1, null);
                qja.C16414b.m45550c(qjaVarM52400e, null, new uk7() { // from class: o.us3
                    @Override // p001o.uk7
                    public final Object invoke() {
                        return at3.m17780F();
                    }
                }, 1, null);
            } catch (Throwable th6) {
                th = th6;
                z = true;
            }
            try {
                xr3Var.mo56684d().setSoTimeout(soTimeout);
                qja.C16414b.m45550c(qjaVarM52400e, null, new uk7() { // from class: o.vs3
                    @Override // p001o.uk7
                    public final Object invoke() {
                        return at3.m17781G();
                    }
                }, 1, null);
            } catch (Throwable th7) {
                th = th7;
                uk7Var = new uk7() { // from class: o.ws3
                    @Override // p001o.uk7
                    public final Object invoke() {
                        return at3.m17782H(xr3Var);
                    }
                };
                qjaVarM52400e.mo18186c(th, uk7Var);
                return y3i.f54824a;
            }
            return y3i.f54824a;
        } catch (SocketException unused3) {
            qja.C16414b.m45550c(qjaVarM52400e, null, new uk7() { // from class: o.ts3
                @Override // p001o.uk7
                public final Object invoke() {
                    return at3.m17783I(xr3Var);
                }
            }, 1, null);
            return y3i.f54824a;
        }
    }

    @Override // p001o.bt3
    /* renamed from: e */
    public void mo17805e(final xr3 xr3Var, bt1 bt1Var) {
        sq8.m48649h(xr3Var, "connection");
        sq8.m48649h(bt1Var, "call");
        p69 p69Var = (p69) this.f15216e.remove(xr3Var);
        if (p69Var != null) {
            q74 q74VarM17807x = m17807x(bt1Var);
            String strMo26336c = kge.m35689b(at3.class).mo26336c();
            if (strMo26336c == null) {
                throw new IllegalArgumentException("logger<T> cannot be used on an anonymous object".toString());
            }
            qja qjaVarM52400e = v74.m52400e(q74VarM17807x, strMo26336c);
            qja.C16414b.m45550c(qjaVarM52400e, null, new uk7() { // from class: o.ns3
                @Override // p001o.uk7
                public final Object invoke() {
                    return at3.m17803z(xr3Var);
                }
            }, 1, null);
            long jM27092b = fmh.C13489a.f23681a.m27092b();
            pm1.m43865e(q74VarM17807x, new C12246b(p69Var, null));
            final long jM27095h = fmh.C13489a.a.m27095h(jM27092b);
            qja.C16414b.m45550c(qjaVarM52400e, null, new uk7() { // from class: o.rs3
                @Override // p001o.uk7
                public final Object invoke() {
                    return at3.m17776A(xr3Var, jM27095h);
                }
            }, 1, null);
        }
    }

    @Override // p001o.bt3
    /* renamed from: g */
    public void mo17806g(final xr3 xr3Var, bt1 bt1Var) {
        sq8.m48649h(xr3Var, "connection");
        sq8.m48649h(bt1Var, "call");
        int iIdentityHashCode = System.identityHashCode(xr3Var);
        q74 q74VarM17807x = m17807x(bt1Var);
        final p69 p69VarM46952d = rm1.m46952d(this.f15215d, new f84("okhttp-conn-monitor-for-" + iIdentityHashCode), null, new C12247c(xr3Var, q74VarM17807x, null), 2, null);
        String strMo26336c = kge.m35689b(at3.class).mo26336c();
        if (strMo26336c == null) {
            throw new IllegalArgumentException("logger<T> cannot be used on an anonymous object".toString());
        }
        qja.C16414b.m45550c(v74.m52400e(q74VarM17807x, strMo26336c), null, new uk7() { // from class: o.ss3
            @Override // p001o.uk7
            public final Object invoke() {
                return at3.m17777B(p69VarM46952d, xr3Var);
            }
        }, 1, null);
        this.f15216e.put(xr3Var, p69VarM46952d);
    }

    /* renamed from: x */
    public final q74 m17807x(bt1 bt1Var) {
        q74 q74VarM18281a;
        b8f b8fVar = (b8f) bt1Var.request().m51739j(b8f.class);
        return (b8fVar == null || (q74VarM18281a = b8fVar.m18281a()) == null) ? eu5.m25611b() : q74VarM18281a;
    }

    /* renamed from: y */
    public final void m17808y() {
        qm1.m45641b(null, new C12245a(null), 1, null);
    }

    public at3(long j) {
        this.f15214c = j;
        this.f15215d = i84.m31707a(eu5.m25611b().plus(gdg.m28505b(null, 1, null)));
        this.f15216e = new ConcurrentHashMap();
    }
}
