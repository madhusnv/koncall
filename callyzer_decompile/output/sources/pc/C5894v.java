package pc;

import ay.C0496f;
import ay.ExecutorC0495e;
import b00.InterfaceC0527l;
import iz.C3393z;
import iz.i0;
import java.io.IOException;
import java.util.concurrent.CancellationException;
import jc.AbstractC3741q;
import jc.AbstractC3744t;
import jc.AbstractC3745u;
import kotlin.jvm.internal.AbstractC4154l;
import lp.C4504f;
import nd.EnumC5011b;
import o6.s0;
import od.C5338b;
import og.u1;
import pg.r7;
import qw.a0;
import tx.AbstractC7262v;
import tx.C7263w;
import tx.C7265y;
import tx.c0;
import tx.m0;
import tx.z0;
import uw.InterfaceC7559c;
import uw.InterfaceC7564h;
import vw.EnumC7794a;
import wc.AbstractC7984r;
import ww.AbstractC8199i;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: pc.v */
/* loaded from: classes.dex */
public final class C5894v extends i0 {

    /* renamed from: d */
    public static final /* synthetic */ int f28724d = 0;

    /* renamed from: b */
    public final AbstractC3745u f28725b;

    /* renamed from: c */
    public final InterfaceC7564h f28726c;

    public C5894v(AbstractC3745u body, InterfaceC7564h interfaceC7564h) {
        AbstractC4154l.m8923f(body, "body");
        this.f28725b = body;
        this.f28726c = interfaceC7564h;
        if ((body instanceof AbstractC3741q) || (body instanceof AbstractC3744t)) {
            return;
        }
        throw new IllegalArgumentException(("Invalid streaming body " + body).toString());
    }

    /* renamed from: f */
    public static final Object m11503f(C5894v c5894v, InterfaceC0527l interfaceC0527l, AbstractC8199i abstractC8199i) throws IOException {
        AbstractC3745u abstractC3745u = c5894v.f28725b;
        boolean z6 = abstractC3745u instanceof AbstractC3741q;
        a0 a0Var = a0.f30746a;
        if (z6) {
            Object objM15161e = AbstractC7984r.m15161e(((AbstractC3741q) abstractC3745u).readFrom(), r7.m11852c(interfaceC0527l), abstractC8199i);
            return objM15161e == EnumC7794a.COROUTINE_SUSPENDED ? objM15161e : a0Var;
        }
        if (!(abstractC3745u instanceof AbstractC3744t)) {
            throw new IllegalStateException(("unexpected HttpBody type " + abstractC3745u).toString());
        }
        b00.i0 i0VarM11851b = r7.m11851b(((AbstractC3744t) abstractC3745u).readFrom());
        try {
            interfaceC0527l.j0(i0VarM11851b);
            i0VarM11851b.close();
            return a0Var;
        } finally {
        }
    }

    @Override // iz.i0
    /* renamed from: a */
    public final long mo7445a() {
        Long contentLength = this.f28725b.getContentLength();
        if (contentLength != null) {
            return contentLength.longValue();
        }
        return -1L;
    }

    @Override // iz.i0
    /* renamed from: b */
    public final C3393z mo7446b() {
        return null;
    }

    @Override // iz.i0
    /* renamed from: c */
    public final boolean mo7730c() {
        return this.f28725b.isDuplex();
    }

    @Override // iz.i0
    /* renamed from: d */
    public final boolean mo7727d() {
        return this.f28725b.isOneShot();
    }

    @Override // iz.i0
    /* renamed from: e */
    public final void mo7447e(InterfaceC0527l interfaceC0527l) throws Exception {
        try {
            m11504g(interfaceC0527l);
        } catch (Exception e2) {
            if (!(e2 instanceof CancellationException)) {
                if (!(e2 instanceof IOException)) {
                    throw new IOException(e2);
                }
                throw e2;
            }
            C5338b c5338b = new C5338b(2);
            EnumC5011b enumC5011b = EnumC5011b.Trace;
            String strM8913b = kotlin.jvm.internal.a0.m8901a(C5894v.class).m8913b();
            if (strM8913b == null) {
                throw new IllegalArgumentException("log<T> cannot be used on an anonymous object");
            }
            u1.m10948g(this.f28726c, enumC5011b, strM8913b, null, c5338b);
        }
    }

    /* renamed from: g */
    public final void m11504g(InterfaceC0527l interfaceC0527l) throws Throwable {
        String str;
        C7263w c7263w = C7265y.f34695c;
        InterfaceC7564h interfaceC7564h = this.f28726c;
        C7265y c7265y = (C7265y) interfaceC7564h.o0(c7263w);
        InterfaceC7564h interfaceC7564hT0 = interfaceC7564h.t0((c7265y == null || (str = c7265y.f34696b) == null) ? new C7265y("send-request-body") : new C7265y(str.concat(":send-request-body")));
        InterfaceC7559c interfaceC7559c = null;
        if (!this.f28725b.isDuplex()) {
            c0.m13468D(interfaceC7564hT0.mo1766z(AbstractC7262v.f34684b), new C4504f(this, interfaceC0527l, interfaceC7559c, 24));
        } else {
            C0496f c0496f = m0.f34659a;
            c0.m13502y(z0.f34701a, interfaceC7564hT0.t0(ExecutorC0495e.f3538c), null, new s0(interfaceC0527l, this, interfaceC7559c, 3), 2);
        }
    }
}
