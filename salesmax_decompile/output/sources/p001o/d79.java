package p001o;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import p001o.p69;
import p001o.q74;

/* loaded from: classes6.dex */
public class d79 implements p69, h93, xwc {

    /* renamed from: a */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f19180a = AtomicReferenceFieldUpdater.newUpdater(d79.class, Object.class, "_state$volatile");

    /* renamed from: b */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f19181b = AtomicReferenceFieldUpdater.newUpdater(d79.class, Object.class, "_parentHandle$volatile");
    private volatile /* synthetic */ Object _parentHandle$volatile;
    private volatile /* synthetic */ Object _state$volatile;

    /* renamed from: o.d79$a */
    public static final class C12802a extends zb2 {

        /* renamed from: q */
        public final d79 f19182q;

        public C12802a(n64 n64Var, d79 d79Var) {
            super(n64Var, 1);
            this.f19182q = d79Var;
        }

        @Override // p001o.zb2
        /* renamed from: M */
        public String mo22433M() {
            return "AwaitContinuation";
        }

        @Override // p001o.zb2
        /* renamed from: t */
        public Throwable mo22434t(p69 p69Var) {
            Throwable thM22441f;
            Object objI0 = this.f19182q.i0();
            return (!(objI0 instanceof C12804c) || (thM22441f = ((C12804c) objI0).m22441f()) == null) ? objI0 instanceof lm3 ? ((lm3) objI0).f34036a : p69Var.mo22431r() : thM22441f;
        }
    }

    /* renamed from: o.d79$b */
    public static final class C12803b extends b79 {

        /* renamed from: e */
        public final d79 f19183e;

        /* renamed from: f */
        public final C12804c f19184f;

        /* renamed from: g */
        public final d93 f19185g;

        /* renamed from: h */
        public final Object f19186h;

        public C12803b(d79 d79Var, C12804c c12804c, d93 d93Var, Object obj) {
            this.f19183e = d79Var;
            this.f19184f = c12804c;
            this.f19185g = d93Var;
            this.f19186h = obj;
        }

        @Override // p001o.b79
        /* renamed from: v */
        public boolean mo18250v() {
            return false;
        }

        @Override // p001o.b79
        /* renamed from: w */
        public void mo18251w(Throwable th) {
            this.f19183e.m22424V(this.f19184f, this.f19185g, this.f19186h);
        }
    }

    /* renamed from: o.d79$c */
    public static final class C12804c implements oh8 {

        /* renamed from: b */
        public static final /* synthetic */ AtomicIntegerFieldUpdater f19187b = AtomicIntegerFieldUpdater.newUpdater(C12804c.class, "_isCompleting$volatile");

        /* renamed from: c */
        public static final /* synthetic */ AtomicReferenceFieldUpdater f19188c = AtomicReferenceFieldUpdater.newUpdater(C12804c.class, Object.class, "_rootCause$volatile");

        /* renamed from: d */
        public static final /* synthetic */ AtomicReferenceFieldUpdater f19189d = AtomicReferenceFieldUpdater.newUpdater(C12804c.class, Object.class, "_exceptionsHolder$volatile");
        private volatile /* synthetic */ Object _exceptionsHolder$volatile;
        private volatile /* synthetic */ int _isCompleting$volatile;
        private volatile /* synthetic */ Object _rootCause$volatile;

        /* renamed from: a */
        public final b0c f19190a;

        public C12804c(b0c b0cVar, boolean z, Throwable th) {
            this.f19190a = b0cVar;
            this._isCompleting$volatile = z ? 1 : 0;
            this._rootCause$volatile = th;
        }

        @Override // p001o.oh8
        /* renamed from: a */
        public boolean mo18081a() {
            return m22441f() == null;
        }

        @Override // p001o.oh8
        /* renamed from: b */
        public b0c mo18082b() {
            return this.f19190a;
        }

        /* renamed from: c */
        public final void m22438c(Throwable th) {
            Throwable thM22441f = m22441f();
            if (thM22441f == null) {
                m22448p(th);
                return;
            }
            if (th == thM22441f) {
                return;
            }
            Object objM22440e = m22440e();
            if (objM22440e == null) {
                m22447o(th);
                return;
            }
            if (objM22440e instanceof Throwable) {
                if (th == objM22440e) {
                    return;
                }
                ArrayList arrayListM22439d = m22439d();
                arrayListM22439d.add(objM22440e);
                arrayListM22439d.add(th);
                m22447o(arrayListM22439d);
                return;
            }
            if (objM22440e instanceof ArrayList) {
                ((ArrayList) objM22440e).add(th);
                return;
            }
            throw new IllegalStateException(("State is " + objM22440e).toString());
        }

        /* renamed from: d */
        public final ArrayList m22439d() {
            return new ArrayList(4);
        }

        /* renamed from: e */
        public final Object m22440e() {
            return f19189d.get(this);
        }

        /* renamed from: f */
        public final Throwable m22441f() {
            return (Throwable) f19188c.get(this);
        }

        /* renamed from: j */
        public final boolean m22442j() {
            return m22441f() != null;
        }

        /* renamed from: k */
        public final boolean m22443k() {
            return f19187b.get(this) != 0;
        }

        /* renamed from: l */
        public final boolean m22444l() {
            return m22440e() == e79.f21112e;
        }

        /* renamed from: m */
        public final List m22445m(Throwable th) {
            ArrayList arrayListM22439d;
            Object objM22440e = m22440e();
            if (objM22440e == null) {
                arrayListM22439d = m22439d();
            } else if (objM22440e instanceof Throwable) {
                ArrayList arrayListM22439d2 = m22439d();
                arrayListM22439d2.add(objM22440e);
                arrayListM22439d = arrayListM22439d2;
            } else {
                if (!(objM22440e instanceof ArrayList)) {
                    throw new IllegalStateException(("State is " + objM22440e).toString());
                }
                arrayListM22439d = (ArrayList) objM22440e;
            }
            Throwable thM22441f = m22441f();
            if (thM22441f != null) {
                arrayListM22439d.add(0, thM22441f);
            }
            if (th != null && !sq8.m48644c(th, thM22441f)) {
                arrayListM22439d.add(th);
            }
            m22447o(e79.f21112e);
            return arrayListM22439d;
        }

        /* renamed from: n */
        public final void m22446n(boolean z) {
            f19187b.set(this, z ? 1 : 0);
        }

        /* renamed from: o */
        public final void m22447o(Object obj) {
            f19189d.set(this, obj);
        }

        /* renamed from: p */
        public final void m22448p(Throwable th) {
            f19188c.set(this, th);
        }

        public String toString() {
            return "Finishing[cancelling=" + m22442j() + ", completing=" + m22443k() + ", rootCause=" + m22441f() + ", exceptions=" + m22440e() + ", list=" + mo18082b() + ']';
        }
    }

    /* renamed from: o.d79$d */
    public static final class C12805d extends qre implements nl7 {

        /* renamed from: b */
        public Object f19191b;

        /* renamed from: c */
        public Object f19192c;

        /* renamed from: d */
        public int f19193d;

        /* renamed from: e */
        public /* synthetic */ Object f19194e;

        public C12805d(n64 n64Var) {
            super(2, n64Var);
        }

        @Override // p001o.vb1
        public final n64 create(Object obj, n64 n64Var) {
            C12805d c12805d = d79.this.new C12805d(n64Var);
            c12805d.f19194e = obj;
            return c12805d;
        }

        @Override // p001o.nl7
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(kef kefVar, n64 n64Var) {
            return ((C12805d) create(kefVar, n64Var)).invokeSuspend(y3i.f54824a);
        }

        /* JADX WARN: Removed duplicated region for block: B:22:0x006b  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x006d -> B:27:0x0083). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x0080 -> B:27:0x0083). Please report as a decompilation issue!!! */
        @Override // p001o.vb1
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            b0c b0cVarMo18082b;
            kef kefVar;
            C12805d c12805d;
            jia jiaVar;
            kia kiaVarM35741l;
            Object objM51918f = uq8.m51918f();
            int i = this.f19193d;
            if (i == 0) {
                wre.m54934b(obj);
                kef kefVar2 = (kef) this.f19194e;
                Object objI0 = d79.this.i0();
                if (objI0 instanceof d93) {
                    h93 h93Var = ((d93) objI0).f19399e;
                    this.f19193d = 1;
                    if (kefVar2.mo33661f(h93Var, this) == objM51918f) {
                        return objM51918f;
                    }
                } else if ((objI0 instanceof oh8) && (b0cVarMo18082b = ((oh8) objI0).mo18082b()) != null) {
                    Object objM35740k = b0cVarMo18082b.m35740k();
                    sq8.m48647f(objM35740k, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode");
                    kia kiaVar = (kia) objM35740k;
                    kefVar = kefVar2;
                    c12805d = this;
                    jiaVar = b0cVarMo18082b;
                    kiaVarM35741l = kiaVar;
                    if (!sq8.m48644c(kiaVarM35741l, jiaVar)) {
                    }
                }
            } else if (i == 1) {
                wre.m54934b(obj);
            } else {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kiaVarM35741l = (kia) this.f19192c;
                jiaVar = (jia) this.f19191b;
                kefVar = (kef) this.f19194e;
                wre.m54934b(obj);
                c12805d = this;
                kiaVarM35741l = kiaVarM35741l.m35741l();
                if (!sq8.m48644c(kiaVarM35741l, jiaVar)) {
                    if (kiaVarM35741l instanceof d93) {
                        h93 h93Var2 = ((d93) kiaVarM35741l).f19399e;
                        c12805d.f19194e = kefVar;
                        c12805d.f19191b = jiaVar;
                        c12805d.f19192c = kiaVarM35741l;
                        c12805d.f19193d = 2;
                        if (kefVar.mo33661f(h93Var2, c12805d) == objM51918f) {
                            return objM51918f;
                        }
                    }
                    kiaVarM35741l = kiaVarM35741l.m35741l();
                    if (!sq8.m48644c(kiaVarM35741l, jiaVar)) {
                    }
                }
            }
            return y3i.f54824a;
        }
    }

    public d79(boolean z) {
        this._state$volatile = z ? e79.f21114g : e79.f21113f;
    }

    public static /* synthetic */ CancellationException L0(d79 d79Var, Throwable th, String str, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: toCancellationException");
        }
        if ((i & 1) != 0) {
            str = null;
        }
        return d79Var.K0(th, str);
    }

    public final void A0(b0c b0cVar, Throwable th) throws Throwable {
        b0cVar.m35736g(1);
        Object objM35740k = b0cVar.m35740k();
        sq8.m48647f(objM35740k, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode");
        qm3 qm3Var = null;
        for (kia kiaVarM35741l = (kia) objM35740k; !sq8.m48644c(kiaVarM35741l, b0cVar); kiaVarM35741l = kiaVarM35741l.m35741l()) {
            if (kiaVarM35741l instanceof b79) {
                try {
                    ((b79) kiaVarM35741l).mo18251w(th);
                } catch (Throwable th2) {
                    if (qm3Var != null) {
                        cl6.m21376a(qm3Var, th2);
                    } else {
                        qm3Var = new qm3("Exception in completion handler " + kiaVarM35741l + " for " + this, th2);
                        y3i y3iVar = y3i.f54824a;
                    }
                }
            }
        }
        if (qm3Var != null) {
            n0(qm3Var);
        }
    }

    public void B0(Throwable th) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v11, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Throwable] */
    @Override // p001o.xwc
    /* renamed from: C */
    public CancellationException mo22410C() {
        CancellationException cancellationExceptionM22441f;
        Object objI0 = i0();
        if (objI0 instanceof C12804c) {
            cancellationExceptionM22441f = ((C12804c) objI0).m22441f();
        } else if (objI0 instanceof lm3) {
            cancellationExceptionM22441f = ((lm3) objI0).f34036a;
        } else {
            if (objI0 instanceof oh8) {
                throw new IllegalStateException(("Cannot be cancelling child in this state: " + objI0).toString());
            }
            cancellationExceptionM22441f = null;
        }
        CancellationException cancellationException = cancellationExceptionM22441f instanceof CancellationException ? cancellationExceptionM22441f : null;
        if (cancellationException != null) {
            return cancellationException;
        }
        return new q69("Parent job is " + J0(objI0), cancellationExceptionM22441f, this);
    }

    public void C0(Object obj) {
    }

    public void D0() {
    }

    /* renamed from: E */
    public final Object m22411E(n64 n64Var) throws Throwable {
        Object objI0;
        do {
            objI0 = i0();
            if (!(objI0 instanceof oh8)) {
                if (objI0 instanceof lm3) {
                    throw ((lm3) objI0).f34036a;
                }
                return e79.m24481h(objI0);
            }
        } while (I0(objI0) < 0);
        return m22412G(n64Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [o.nh8] */
    public final void E0(z56 z56Var) {
        b0c b0cVar = new b0c();
        if (!z56Var.mo18081a()) {
            b0cVar = new nh8(b0cVar);
        }
        j9.m33417a(f19180a, this, z56Var, b0cVar);
    }

    public final void F0(b79 b79Var) {
        b79Var.m35735f(new b0c());
        j9.m33417a(f19180a, this, b79Var, b79Var.m35741l());
    }

    /* renamed from: G */
    public final Object m22412G(n64 n64Var) {
        C12802a c12802a = new C12802a(tq8.m50336c(n64Var), this);
        c12802a.m59116E();
        bc2.m18560a(c12802a, a79.m16555m(this, false, new xre(c12802a), 1, null));
        Object objM59140v = c12802a.m59140v();
        if (objM59140v == uq8.m51918f()) {
            n75.m40201c(n64Var);
        }
        return objM59140v;
    }

    public final void G0(b79 b79Var) {
        Object objI0;
        do {
            objI0 = i0();
            if (!(objI0 instanceof b79)) {
                if (!(objI0 instanceof oh8) || ((oh8) objI0).mo18082b() == null) {
                    return;
                }
                b79Var.m35743r();
                return;
            }
            if (objI0 != b79Var) {
                return;
            }
        } while (!j9.m33417a(f19180a, this, objI0, e79.f21114g));
    }

    public final void H0(c93 c93Var) {
        f19181b.set(this, c93Var);
    }

    /* renamed from: I */
    public final boolean m22413I(Throwable th) {
        return m22415K(th);
    }

    public final int I0(Object obj) {
        if (obj instanceof z56) {
            if (((z56) obj).mo18081a()) {
                return 0;
            }
            if (!j9.m33417a(f19180a, this, obj, e79.f21114g)) {
                return -1;
            }
            D0();
            return 1;
        }
        if (!(obj instanceof nh8)) {
            return 0;
        }
        if (!j9.m33417a(f19180a, this, obj, ((nh8) obj).mo18082b())) {
            return -1;
        }
        D0();
        return 1;
    }

    @Override // p001o.p69
    /* renamed from: J */
    public final boolean mo22414J() {
        return !(i0() instanceof oh8);
    }

    public final String J0(Object obj) {
        if (!(obj instanceof C12804c)) {
            return obj instanceof oh8 ? ((oh8) obj).mo18081a() ? "Active" : "New" : obj instanceof lm3 ? "Cancelled" : "Completed";
        }
        C12804c c12804c = (C12804c) obj;
        return c12804c.m22442j() ? "Cancelling" : c12804c.m22443k() ? "Completing" : "Active";
    }

    /* renamed from: K */
    public final boolean m22415K(Object obj) throws Throwable {
        Object objU0 = e79.f21108a;
        if (c0() && (objU0 = m22417M(obj)) == e79.f21109b) {
            return true;
        }
        if (objU0 == e79.f21108a) {
            objU0 = u0(obj);
        }
        if (objU0 == e79.f21108a || objU0 == e79.f21109b) {
            return true;
        }
        if (objU0 == e79.f21111d) {
            return false;
        }
        mo17837z(objU0);
        return true;
    }

    public final CancellationException K0(Throwable th, String str) {
        CancellationException q69Var = th instanceof CancellationException ? (CancellationException) th : null;
        if (q69Var == null) {
            if (str == null) {
                str = mo22419P();
            }
            q69Var = new q69(str, th, this);
        }
        return q69Var;
    }

    /* renamed from: L */
    public void mo22416L(Throwable th) throws Throwable {
        m22415K(th);
    }

    /* renamed from: M */
    public final Object m22417M(Object obj) {
        Object objP0;
        do {
            Object objI0 = i0();
            if (!(objI0 instanceof oh8) || ((objI0 instanceof C12804c) && ((C12804c) objI0).m22443k())) {
                return e79.f21108a;
            }
            objP0 = P0(objI0, new lm3(m22425W(obj), false, 2, null));
        } while (objP0 == e79.f21110c);
        return objP0;
    }

    public final String M0() {
        return x0() + '{' + J0(i0()) + '}';
    }

    /* renamed from: N */
    public final boolean m22418N(Throwable th) {
        if (r0()) {
            return true;
        }
        boolean z = th instanceof CancellationException;
        c93 c93VarH0 = h0();
        return (c93VarH0 == null || c93VarH0 == e0c.f20709a) ? z : c93VarH0.mo20507c(th) || z;
    }

    public final boolean N0(oh8 oh8Var, Object obj) throws Throwable {
        if (!j9.m33417a(f19180a, this, oh8Var, e79.m24480g(obj))) {
            return false;
        }
        B0(null);
        C0(obj);
        m22423U(oh8Var, obj);
        return true;
    }

    public final boolean O0(oh8 oh8Var, Throwable th) throws Throwable {
        b0c b0cVarE0 = e0(oh8Var);
        if (b0cVarE0 == null) {
            return false;
        }
        if (!j9.m33417a(f19180a, this, oh8Var, new C12804c(b0cVarE0, false, th))) {
            return false;
        }
        z0(b0cVarE0, th);
        return true;
    }

    /* renamed from: P */
    public String mo22419P() {
        return "Job was cancelled";
    }

    public final Object P0(Object obj, Object obj2) {
        return !(obj instanceof oh8) ? e79.f21108a : ((!(obj instanceof z56) && !(obj instanceof b79)) || (obj instanceof d93) || (obj2 instanceof lm3)) ? Q0((oh8) obj, obj2) : N0((oh8) obj, obj2) ? obj2 : e79.f21110c;
    }

    @Override // p001o.h93
    /* renamed from: Q */
    public final void mo22420Q(xwc xwcVar) throws Throwable {
        m22415K(xwcVar);
    }

    public final Object Q0(oh8 oh8Var, Object obj) throws Throwable {
        b0c b0cVarE0 = e0(oh8Var);
        if (b0cVarE0 == null) {
            return e79.f21110c;
        }
        C12804c c12804c = oh8Var instanceof C12804c ? (C12804c) oh8Var : null;
        if (c12804c == null) {
            c12804c = new C12804c(b0cVarE0, false, null);
        }
        gge ggeVar = new gge();
        synchronized (c12804c) {
            if (c12804c.m22443k()) {
                return e79.f21108a;
            }
            c12804c.m22446n(true);
            if (c12804c != oh8Var && !j9.m33417a(f19180a, this, oh8Var, c12804c)) {
                return e79.f21110c;
            }
            boolean zM22442j = c12804c.m22442j();
            lm3 lm3Var = obj instanceof lm3 ? (lm3) obj : null;
            if (lm3Var != null) {
                c12804c.m22438c(lm3Var.f34036a);
            }
            Throwable thM22441f = Boolean.valueOf(zM22442j ? false : true).booleanValue() ? c12804c.m22441f() : null;
            ggeVar.f25106a = thM22441f;
            y3i y3iVar = y3i.f54824a;
            if (thM22441f != null) {
                z0(b0cVarE0, thM22441f);
            }
            d93 d93VarY0 = y0(b0cVarE0);
            if (d93VarY0 != null && R0(c12804c, d93VarY0, obj)) {
                return e79.f21109b;
            }
            b0cVarE0.m35736g(2);
            d93 d93VarY02 = y0(b0cVarE0);
            return (d93VarY02 == null || !R0(c12804c, d93VarY02, obj)) ? m22426X(c12804c, obj) : e79.f21109b;
        }
    }

    /* renamed from: R */
    public boolean mo18145R(Throwable th) {
        if (th instanceof CancellationException) {
            return true;
        }
        return m22415K(th) && b0();
    }

    public final boolean R0(C12804c c12804c, d93 d93Var, Object obj) {
        while (z69.m58847l(d93Var.f19399e, false, new C12803b(this, c12804c, d93Var, obj)) == e0c.f20709a) {
            d93Var = y0(d93Var);
            if (d93Var == null) {
                return false;
            }
        }
        return true;
    }

    @Override // p001o.p69
    /* renamed from: S */
    public final c93 mo22421S(h93 h93Var) {
        boolean z;
        Throwable thM22441f;
        d93 d93Var = new d93(h93Var);
        d93Var.m18252x(this);
        while (true) {
            Object objI0 = i0();
            z = true;
            if (!(objI0 instanceof z56)) {
                if (!(objI0 instanceof oh8)) {
                    z = false;
                    break;
                }
                b0c b0cVarMo18082b = ((oh8) objI0).mo18082b();
                if (b0cVarMo18082b == null) {
                    sq8.m48647f(objI0, "null cannot be cast to non-null type kotlinx.coroutines.JobNode");
                    F0((b79) objI0);
                } else if (!b0cVarMo18082b.m35733d(d93Var, 7)) {
                    boolean zM35733d = b0cVarMo18082b.m35733d(d93Var, 3);
                    Object objI02 = i0();
                    if (objI02 instanceof C12804c) {
                        thM22441f = ((C12804c) objI02).m22441f();
                    } else {
                        lm3 lm3Var = objI02 instanceof lm3 ? (lm3) objI02 : null;
                        thM22441f = lm3Var != null ? lm3Var.f34036a : null;
                    }
                    d93Var.mo18251w(thM22441f);
                    if (!zM35733d) {
                        return e0c.f20709a;
                    }
                }
            } else {
                z56 z56Var = (z56) objI0;
                if (!z56Var.mo18081a()) {
                    E0(z56Var);
                } else if (j9.m33417a(f19180a, this, objI0, d93Var)) {
                    break;
                }
            }
        }
        if (z) {
            return d93Var;
        }
        Object objI03 = i0();
        lm3 lm3Var2 = objI03 instanceof lm3 ? (lm3) objI03 : null;
        d93Var.mo18251w(lm3Var2 != null ? lm3Var2.f34036a : null);
        return e0c.f20709a;
    }

    @Override // p001o.p69
    /* renamed from: T */
    public final yu5 mo22422T(boolean z, boolean z2, xk7 xk7Var) {
        return p0(z2, z ? new qv8(xk7Var) : new rv8(xk7Var));
    }

    /* renamed from: U */
    public final void m22423U(oh8 oh8Var, Object obj) throws Throwable {
        c93 c93VarH0 = h0();
        if (c93VarH0 != null) {
            c93VarH0.dispose();
            H0(e0c.f20709a);
        }
        lm3 lm3Var = obj instanceof lm3 ? (lm3) obj : null;
        Throwable th = lm3Var != null ? lm3Var.f34036a : null;
        if (!(oh8Var instanceof b79)) {
            b0c b0cVarMo18082b = oh8Var.mo18082b();
            if (b0cVarMo18082b != null) {
                A0(b0cVarMo18082b, th);
                return;
            }
            return;
        }
        try {
            ((b79) oh8Var).mo18251w(th);
        } catch (Throwable th2) {
            n0(new qm3("Exception in completion handler " + oh8Var + " for " + this, th2));
        }
    }

    /* renamed from: V */
    public final void m22424V(C12804c c12804c, d93 d93Var, Object obj) {
        d93 d93VarY0 = y0(d93Var);
        if (d93VarY0 == null || !R0(c12804c, d93VarY0, obj)) {
            c12804c.mo18082b().m35736g(2);
            d93 d93VarY02 = y0(d93Var);
            if (d93VarY02 == null || !R0(c12804c, d93VarY02, obj)) {
                mo17837z(m22426X(c12804c, obj));
            }
        }
    }

    /* renamed from: W */
    public final Throwable m22425W(Object obj) {
        if (obj == null ? true : obj instanceof Throwable) {
            Throwable th = (Throwable) obj;
            return th == null ? new q69(mo22419P(), null, this) : th;
        }
        sq8.m48647f(obj, "null cannot be cast to non-null type kotlinx.coroutines.ParentJob");
        return ((xwc) obj).mo22410C();
    }

    /* renamed from: X */
    public final Object m22426X(C12804c c12804c, Object obj) throws Throwable {
        boolean zM22442j;
        Throwable thA0;
        lm3 lm3Var = obj instanceof lm3 ? (lm3) obj : null;
        Throwable th = lm3Var != null ? lm3Var.f34036a : null;
        synchronized (c12804c) {
            zM22442j = c12804c.m22442j();
            List listM22445m = c12804c.m22445m(th);
            thA0 = a0(c12804c, listM22445m);
            if (thA0 != null) {
                m22432x(thA0, listM22445m);
            }
        }
        if (thA0 != null && thA0 != th) {
            obj = new lm3(thA0, false, 2, null);
        }
        if (thA0 != null) {
            if (m22418N(thA0) || m0(thA0)) {
                sq8.m48647f(obj, "null cannot be cast to non-null type kotlinx.coroutines.CompletedExceptionally");
                ((lm3) obj).m37464c();
            }
        }
        if (!zM22442j) {
            B0(thA0);
        }
        C0(obj);
        j9.m33417a(f19180a, this, c12804c, e79.m24480g(obj));
        m22423U(c12804c, obj);
        return obj;
    }

    /* renamed from: Z */
    public final Throwable m22427Z(Object obj) {
        lm3 lm3Var = obj instanceof lm3 ? (lm3) obj : null;
        if (lm3Var != null) {
            return lm3Var.f34036a;
        }
        return null;
    }

    @Override // p001o.p69
    /* renamed from: a */
    public boolean mo22428a() {
        Object objI0 = i0();
        return (objI0 instanceof oh8) && ((oh8) objI0).mo18081a();
    }

    public final Throwable a0(C12804c c12804c, List list) {
        Object next;
        Object obj = null;
        if (list.isEmpty()) {
            if (c12804c.m22442j()) {
                return new q69(mo22419P(), null, this);
            }
            return null;
        }
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (!(((Throwable) next) instanceof CancellationException)) {
                break;
            }
        }
        Throwable th = (Throwable) next;
        if (th != null) {
            return th;
        }
        Throwable th2 = (Throwable) list.get(0);
        if (th2 instanceof omh) {
            Iterator it2 = list.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Object next2 = it2.next();
                Throwable th3 = (Throwable) next2;
                if (th3 != th2 && (th3 instanceof omh)) {
                    obj = next2;
                    break;
                }
            }
            Throwable th4 = (Throwable) obj;
            if (th4 != null) {
                return th4;
            }
        }
        return th2;
    }

    public boolean b0() {
        return true;
    }

    public boolean c0() {
        return false;
    }

    @Override // p001o.p69
    public final Object d0(n64 n64Var) {
        if (s0()) {
            Object objT0 = t0(n64Var);
            return objT0 == uq8.m51918f() ? objT0 : y3i.f54824a;
        }
        z69.m58844i(n64Var.getContext());
        return y3i.f54824a;
    }

    public final b0c e0(oh8 oh8Var) {
        b0c b0cVarMo18082b = oh8Var.mo18082b();
        if (b0cVarMo18082b != null) {
            return b0cVarMo18082b;
        }
        if (oh8Var instanceof z56) {
            return new b0c();
        }
        if (oh8Var instanceof b79) {
            F0((b79) oh8Var);
            return null;
        }
        throw new IllegalStateException(("State should have list: " + oh8Var).toString());
    }

    @Override // p001o.p69
    /* renamed from: f */
    public void mo22429f(CancellationException cancellationException) throws Throwable {
        if (cancellationException == null) {
            cancellationException = new q69(mo22419P(), null, this);
        }
        mo22416L(cancellationException);
    }

    @Override // p001o.q74
    public Object fold(Object obj, nl7 nl7Var) {
        return p69.C15966a.m43000b(this, obj, nl7Var);
    }

    public p69 g0() {
        c93 c93VarH0 = h0();
        if (c93VarH0 != null) {
            return c93VarH0.getParent();
        }
        return null;
    }

    @Override // p001o.q74.InterfaceC16311b, p001o.q74
    public q74.InterfaceC16311b get(q74.InterfaceC16312c interfaceC16312c) {
        return p69.C15966a.m43001c(this, interfaceC16312c);
    }

    @Override // p001o.q74.InterfaceC16311b
    public final q74.InterfaceC16312c getKey() {
        return p69.f39399t;
    }

    public final c93 h0() {
        return (c93) f19181b.get(this);
    }

    public final Object i0() {
        return f19180a.get(this);
    }

    @Override // p001o.p69
    public final yu5 j0(xk7 xk7Var) {
        return p0(true, new rv8(xk7Var));
    }

    @Override // p001o.p69
    /* renamed from: k */
    public final ief mo22430k() {
        return mef.m38854b(new C12805d(null));
    }

    public boolean m0(Throwable th) {
        return false;
    }

    @Override // p001o.q74
    public q74 minusKey(q74.InterfaceC16312c interfaceC16312c) {
        return p69.C15966a.m43003e(this, interfaceC16312c);
    }

    public final void o0(p69 p69Var) {
        if (p69Var == null) {
            H0(e0c.f20709a);
            return;
        }
        p69Var.start();
        c93 c93VarMo22421S = p69Var.mo22421S(this);
        H0(c93VarMo22421S);
        if (mo22414J()) {
            c93VarMo22421S.dispose();
            H0(e0c.f20709a);
        }
    }

    public final yu5 p0(boolean z, b79 b79Var) {
        boolean z2;
        boolean zM35733d;
        b79Var.m18252x(this);
        while (true) {
            Object objI0 = i0();
            z2 = true;
            if (!(objI0 instanceof z56)) {
                if (!(objI0 instanceof oh8)) {
                    z2 = false;
                    break;
                }
                oh8 oh8Var = (oh8) objI0;
                b0c b0cVarMo18082b = oh8Var.mo18082b();
                if (b0cVarMo18082b == null) {
                    sq8.m48647f(objI0, "null cannot be cast to non-null type kotlinx.coroutines.JobNode");
                    F0((b79) objI0);
                } else {
                    if (b79Var.mo18250v()) {
                        C12804c c12804c = oh8Var instanceof C12804c ? (C12804c) oh8Var : null;
                        Throwable thM22441f = c12804c != null ? c12804c.m22441f() : null;
                        if (thM22441f != null) {
                            if (z) {
                                b79Var.mo18251w(thM22441f);
                            }
                            return e0c.f20709a;
                        }
                        zM35733d = b0cVarMo18082b.m35733d(b79Var, 5);
                    } else {
                        zM35733d = b0cVarMo18082b.m35733d(b79Var, 1);
                    }
                    if (zM35733d) {
                        break;
                    }
                }
            } else {
                z56 z56Var = (z56) objI0;
                if (!z56Var.mo18081a()) {
                    E0(z56Var);
                } else if (j9.m33417a(f19180a, this, objI0, b79Var)) {
                    break;
                }
            }
        }
        if (z2) {
            return b79Var;
        }
        if (z) {
            Object objI02 = i0();
            lm3 lm3Var = objI02 instanceof lm3 ? (lm3) objI02 : null;
            b79Var.mo18251w(lm3Var != null ? lm3Var.f34036a : null);
        }
        return e0c.f20709a;
    }

    @Override // p001o.q74
    public q74 plus(q74 q74Var) {
        return p69.C15966a.m43004f(this, q74Var);
    }

    public final boolean q0() {
        Object objI0 = i0();
        return (objI0 instanceof lm3) || ((objI0 instanceof C12804c) && ((C12804c) objI0).m22442j());
    }

    @Override // p001o.p69
    /* renamed from: r */
    public final CancellationException mo22431r() {
        Object objI0 = i0();
        if (!(objI0 instanceof C12804c)) {
            if (objI0 instanceof oh8) {
                throw new IllegalStateException(("Job is still new or active: " + this).toString());
            }
            if (objI0 instanceof lm3) {
                return L0(this, ((lm3) objI0).f34036a, null, 1, null);
            }
            return new q69(o75.m41657a(this) + " has completed normally", null, this);
        }
        Throwable thM22441f = ((C12804c) objI0).m22441f();
        if (thM22441f != null) {
            CancellationException cancellationExceptionK0 = K0(thM22441f, o75.m41657a(this) + " is cancelling");
            if (cancellationExceptionK0 != null) {
                return cancellationExceptionK0;
            }
        }
        throw new IllegalStateException(("Job is still new or active: " + this).toString());
    }

    public boolean r0() {
        return false;
    }

    public final boolean s0() {
        Object objI0;
        do {
            objI0 = i0();
            if (!(objI0 instanceof oh8)) {
                return false;
            }
        } while (I0(objI0) < 0);
        return true;
    }

    @Override // p001o.p69
    public final boolean start() {
        int iI0;
        do {
            iI0 = I0(i0());
            if (iI0 == 0) {
                return false;
            }
        } while (iI0 != 1);
        return true;
    }

    public final Object t0(n64 n64Var) {
        zb2 zb2Var = new zb2(tq8.m50336c(n64Var), 1);
        zb2Var.m59116E();
        bc2.m18560a(zb2Var, a79.m16555m(this, false, new yre(zb2Var), 1, null));
        Object objM59140v = zb2Var.m59140v();
        if (objM59140v == uq8.m51918f()) {
            n75.m40201c(n64Var);
        }
        return objM59140v == uq8.m51918f() ? objM59140v : y3i.f54824a;
    }

    public String toString() {
        return M0() + '@' + o75.m41658b(this);
    }

    public final Object u0(Object obj) throws Throwable {
        Throwable thM22425W = null;
        while (true) {
            Object objI0 = i0();
            if (objI0 instanceof C12804c) {
                synchronized (objI0) {
                    if (((C12804c) objI0).m22444l()) {
                        return e79.f21111d;
                    }
                    boolean zM22442j = ((C12804c) objI0).m22442j();
                    if (obj != null || !zM22442j) {
                        if (thM22425W == null) {
                            thM22425W = m22425W(obj);
                        }
                        ((C12804c) objI0).m22438c(thM22425W);
                    }
                    Throwable thM22441f = zM22442j ^ true ? ((C12804c) objI0).m22441f() : null;
                    if (thM22441f != null) {
                        z0(((C12804c) objI0).mo18082b(), thM22441f);
                    }
                    return e79.f21108a;
                }
            }
            if (!(objI0 instanceof oh8)) {
                return e79.f21111d;
            }
            if (thM22425W == null) {
                thM22425W = m22425W(obj);
            }
            oh8 oh8Var = (oh8) objI0;
            if (!oh8Var.mo18081a()) {
                Object objP0 = P0(objI0, new lm3(thM22425W, false, 2, null));
                if (objP0 == e79.f21108a) {
                    throw new IllegalStateException(("Cannot happen in " + objI0).toString());
                }
                if (objP0 != e79.f21110c) {
                    return objP0;
                }
            } else if (O0(oh8Var, thM22425W)) {
                return e79.f21108a;
            }
        }
    }

    public final boolean v0(Object obj) {
        Object objP0;
        do {
            objP0 = P0(i0(), obj);
            if (objP0 == e79.f21108a) {
                return false;
            }
            if (objP0 == e79.f21109b) {
                return true;
            }
        } while (objP0 == e79.f21110c);
        mo17837z(objP0);
        return true;
    }

    public final Object w0(Object obj) {
        Object objP0;
        do {
            objP0 = P0(i0(), obj);
            if (objP0 == e79.f21108a) {
                throw new IllegalStateException("Job " + this + " is already complete or completing, but is being completed with " + obj, m22427Z(obj));
            }
        } while (objP0 == e79.f21110c);
        return objP0;
    }

    /* renamed from: x */
    public final void m22432x(Throwable th, List list) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        if (list.size() <= 1) {
            return;
        }
        Set setNewSetFromMap = Collections.newSetFromMap(new IdentityHashMap(list.size()));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Throwable th2 = (Throwable) it.next();
            if (th2 != th && th2 != th && !(th2 instanceof CancellationException) && setNewSetFromMap.add(th2)) {
                cl6.m21376a(th, th2);
            }
        }
    }

    public String x0() {
        return o75.m41657a(this);
    }

    public final d93 y0(kia kiaVar) {
        while (kiaVar.mo33861q()) {
            kiaVar = kiaVar.m35742m();
        }
        while (true) {
            kiaVar = kiaVar.m35741l();
            if (!kiaVar.mo33861q()) {
                if (kiaVar instanceof d93) {
                    return (d93) kiaVar;
                }
                if (kiaVar instanceof b0c) {
                    return null;
                }
            }
        }
    }

    /* renamed from: z */
    public void mo17837z(Object obj) {
    }

    public final void z0(b0c b0cVar, Throwable th) throws Throwable {
        B0(th);
        b0cVar.m35736g(4);
        Object objM35740k = b0cVar.m35740k();
        sq8.m48647f(objM35740k, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode");
        qm3 qm3Var = null;
        for (kia kiaVarM35741l = (kia) objM35740k; !sq8.m48644c(kiaVarM35741l, b0cVar); kiaVarM35741l = kiaVarM35741l.m35741l()) {
            if ((kiaVarM35741l instanceof b79) && ((b79) kiaVarM35741l).mo18250v()) {
                try {
                    ((b79) kiaVarM35741l).mo18251w(th);
                } catch (Throwable th2) {
                    if (qm3Var != null) {
                        cl6.m21376a(qm3Var, th2);
                    } else {
                        qm3Var = new qm3("Exception in completion handler " + kiaVarM35741l + " for " + this, th2);
                        y3i y3iVar = y3i.f54824a;
                    }
                }
            }
        }
        if (qm3Var != null) {
            n0(qm3Var);
        }
        m22418N(th);
    }

    public void n0(Throwable th) throws Throwable {
        throw th;
    }
}
