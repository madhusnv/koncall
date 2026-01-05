package p001o;

import java.io.Closeable;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.CancellationException;
import p001o.m18;

/* loaded from: classes3.dex */
public final class t7g extends xle {

    /* renamed from: b */
    public final m18 f46593b;

    /* renamed from: c */
    public final q74 f46594c;

    /* renamed from: o.t7g$a */
    public static final class C17018a extends jgg implements nl7 {

        /* renamed from: a */
        public Object f46595a;

        /* renamed from: b */
        public int f46596b;

        /* renamed from: c */
        public final /* synthetic */ gm1 f46597c;

        /* renamed from: d */
        public final /* synthetic */ t7g f46598d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C17018a(gm1 gm1Var, t7g t7gVar, n64 n64Var) {
            super(2, n64Var);
            this.f46597c = gm1Var;
            this.f46598d = t7gVar;
        }

        @Override // p001o.vb1
        public final n64 create(Object obj, n64 n64Var) {
            return new C17018a(this.f46597c, this.f46598d, n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) throws IllegalAccessException, IOException, IllegalArgumentException, InvocationTargetException {
            Closeable closeable;
            Throwable th;
            Object objM51918f = uq8.m51918f();
            int i = this.f46596b;
            if (i == 0) {
                wre.m54934b(obj);
                gm1 gm1Var = this.f46597c;
                t7g t7gVar = this.f46598d;
                try {
                    this.f46595a = gm1Var;
                    this.f46596b = 1;
                    if (t7gVar.m49548m(gm1Var, this) == objM51918f) {
                        return objM51918f;
                    }
                    closeable = gm1Var;
                } catch (Throwable th2) {
                    closeable = gm1Var;
                    th = th2;
                    throw th;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                closeable = (Closeable) this.f46595a;
                try {
                    wre.m54934b(obj);
                } catch (Throwable th3) {
                    th = th3;
                    try {
                        throw th;
                    } catch (Throwable th4) {
                        tb3.m49666a(closeable, th);
                        throw th4;
                    }
                }
            }
            y3i y3iVar = y3i.f54824a;
            tb3.m49666a(closeable, null);
            return y3i.f54824a;
        }

        @Override // p001o.nl7
        public final Object invoke(h84 h84Var, n64 n64Var) {
            return ((C17018a) create(h84Var, n64Var)).invokeSuspend(y3i.f54824a);
        }
    }

    /* renamed from: o.t7g$b */
    public static final class C17019b extends jgg implements nl7 {

        /* renamed from: a */
        public int f46599a;

        /* renamed from: c */
        public final /* synthetic */ gm1 f46601c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C17019b(gm1 gm1Var, n64 n64Var) {
            super(2, n64Var);
            this.f46601c = gm1Var;
        }

        @Override // p001o.vb1
        public final n64 create(Object obj, n64 n64Var) {
            return t7g.this.new C17019b(this.f46601c, n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            Object objM51918f = uq8.m51918f();
            int i = this.f46599a;
            if (i == 0) {
                wre.m54934b(obj);
                t7g t7gVar = t7g.this;
                gm1 gm1Var = this.f46601c;
                this.f46599a = 1;
                if (t7gVar.m49548m(gm1Var, this) == objM51918f) {
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
            return ((C17019b) create(h84Var, n64Var)).invokeSuspend(y3i.f54824a);
        }
    }

    public t7g(m18 m18Var, q74 q74Var) {
        sq8.m48649h(m18Var, "body");
        sq8.m48649h(q74Var, "callContext");
        this.f46593b = m18Var;
        this.f46594c = q74Var;
        if ((m18Var instanceof m18.AbstractC15194b) || (m18Var instanceof m18.AbstractC15197e)) {
            return;
        }
        throw new IllegalArgumentException(("Invalid streaming body " + m18Var).toString());
    }

    /* renamed from: n */
    public static final String m49545n() {
        return "request cancelled";
    }

    @Override // p001o.xle
    /* renamed from: a */
    public long mo18953a() {
        Long contentLength = this.f46593b.getContentLength();
        if (contentLength != null) {
            return contentLength.longValue();
        }
        return -1L;
    }

    @Override // p001o.xle
    /* renamed from: b */
    public y9b mo18954b() {
        return null;
    }

    @Override // p001o.xle
    /* renamed from: g */
    public boolean mo49546g() {
        return this.f46593b.isDuplex();
    }

    @Override // p001o.xle
    /* renamed from: h */
    public boolean mo42498h() {
        return this.f46593b.isOneShot();
    }

    @Override // p001o.xle
    /* renamed from: i */
    public void mo18955i(gm1 gm1Var) throws Exception {
        sq8.m48649h(gm1Var, "sink");
        try {
            m49547l(gm1Var);
        } catch (Exception e) {
            if (!(e instanceof CancellationException)) {
                if (!(e instanceof IOException)) {
                    throw new IOException(e);
                }
                throw e;
            }
            q74 q74Var = this.f46594c;
            uk7 uk7Var = new uk7() { // from class: o.s7g
                @Override // p001o.uk7
                public final Object invoke() {
                    return t7g.m49545n();
                }
            };
            fja fjaVar = fja.Trace;
            String strMo26336c = kge.m35689b(t7g.class).mo26336c();
            if (strMo26336c == null) {
                throw new IllegalArgumentException("log<T> cannot be used on an anonymous object".toString());
            }
            v74.m52399d(q74Var, fjaVar, strMo26336c, null, uk7Var);
        }
    }

    /* renamed from: l */
    public final void m49547l(gm1 gm1Var) {
        q74 q74Var = this.f46594c;
        q74 q74VarPlus = q74Var.plus(o84.m41759a(q74Var, "send-request-body"));
        if (mo49546g()) {
            rm1.m46952d(kt7.f32697a, q74VarPlus.plus(eu5.m25611b()), null, new C17018a(gm1Var, this, null), 2, null);
        } else {
            pm1.m43865e(q74VarPlus.minusKey(z74.f56626b), new C17019b(gm1Var, null));
        }
    }

    /* renamed from: m */
    public final Object m49548m(gm1 gm1Var, n64 n64Var) throws IllegalAccessException, IOException, IllegalArgumentException, InvocationTargetException {
        m18 m18Var = this.f46593b;
        if (m18Var instanceof m18.AbstractC15194b) {
            Object objM58851a = z6f.m58851a(((m18.AbstractC15194b) m18Var).readFrom(), a74.m16540e(gm1Var), n64Var);
            return objM58851a == uq8.m51918f() ? objM58851a : y3i.f54824a;
        }
        if (!(m18Var instanceof m18.AbstractC15197e)) {
            throw new IllegalStateException(("unexpected HttpBody type " + this.f46593b).toString());
        }
        lzf lzfVarM16538c = a74.m16538c(((m18.AbstractC15197e) m18Var).readFrom());
        try {
            gm1Var.p0(lzfVarM16538c);
            tb3.m49666a(lzfVarM16538c, null);
            return y3i.f54824a;
        } finally {
        }
    }
}
