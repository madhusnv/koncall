package p001o;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import p001o.c5e;
import p001o.dx7;
import p001o.e3d;
import p001o.m18;

/* loaded from: classes3.dex */
public final class mc5 implements hc2 {

    /* renamed from: b */
    public final uk7 f35129b;

    /* renamed from: o.mc5$a */
    public /* synthetic */ class C15272a extends dm7 implements uk7 {

        /* renamed from: a */
        public static final C15272a f35130a = new C15272a();

        public C15272a() {
            super(0, okf.class, "<init>", "<init>()V", 0);
        }

        @Override // p001o.uk7
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final okf invoke() {
            return new okf();
        }
    }

    /* renamed from: o.mc5$b */
    public /* synthetic */ class C15273b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f35131a;

        static {
            int[] iArr = new int[t81.values().length];
            try {
                iArr[t81.HTTP_REQUEST_VIA_HEADERS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[t81.HTTP_REQUEST_VIA_QUERY_PARAMS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f35131a = iArr;
        }
    }

    /* renamed from: o.mc5$c */
    public static final class C15274c extends o64 {

        /* renamed from: a */
        public /* synthetic */ Object f35132a;

        /* renamed from: c */
        public int f35134c;

        public C15274c(n64 n64Var) {
            super(n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            this.f35132a = obj;
            this.f35134c |= Integer.MIN_VALUE;
            return mc5.this.m38720i(null, this);
        }
    }

    /* renamed from: o.mc5$d */
    public static final class C15275d extends jgg implements nl7 {

        /* renamed from: a */
        public int f35135a;

        /* renamed from: c */
        public final /* synthetic */ h8f f35137c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C15275d(h8f h8fVar, n64 n64Var) {
            super(2, n64Var);
            this.f35137c = h8fVar;
        }

        @Override // p001o.vb1
        public final n64 create(Object obj, n64 n64Var) {
            return mc5.this.new C15275d(this.f35137c, n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            uq8.m51918f();
            if (this.f35135a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            wre.m54934b(obj);
            return gy7.m29642b(mc5.this.m38722q(this.f35137c));
        }

        @Override // p001o.nl7
        public final Object invoke(h84 h84Var, n64 n64Var) {
            return ((C15275d) create(h84Var, n64Var)).invokeSuspend(y3i.f54824a);
        }
    }

    /* renamed from: o.mc5$e */
    public static final class C15276e implements Comparator {
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return uk3.m51674d((String) ((hwc) obj).m31229c(), (String) ((hwc) obj2).m31229c());
        }
    }

    /* renamed from: o.mc5$f */
    public static final class C15277f extends o64 {

        /* renamed from: a */
        public Object f35138a;

        /* renamed from: b */
        public Object f35139b;

        /* renamed from: c */
        public /* synthetic */ Object f35140c;

        /* renamed from: e */
        public int f35142e;

        public C15277f(n64 n64Var) {
            super(n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            this.f35140c = obj;
            this.f35142e |= Integer.MIN_VALUE;
            return mc5.this.mo30200a(null, null, this);
        }
    }

    /* renamed from: o.mc5$g */
    public static final class C15278g extends o64 {

        /* renamed from: a */
        public Object f35143a;

        /* renamed from: b */
        public /* synthetic */ Object f35144b;

        /* renamed from: d */
        public int f35146d;

        public C15278g(n64 n64Var) {
            super(n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            this.f35144b = obj;
            this.f35146d |= Integer.MIN_VALUE;
            return mc5.this.m38721p(null, this);
        }
    }

    public mc5(uk7 uk7Var) {
        sq8.m48649h(uk7Var, "sha256Supplier");
        this.f35129b = uk7Var;
    }

    /* renamed from: j */
    public static final boolean m38714j(z81 z81Var, Map.Entry entry) {
        sq8.m48649h(entry, "it");
        return lc2.m36896l((String) entry.getKey(), z81Var);
    }

    /* renamed from: k */
    public static final hwc m38715k(Map.Entry entry) {
        sq8.m48649h(entry, "it");
        String lowerCase = ((String) entry.getKey()).toLowerCase(Locale.ROOT);
        sq8.m48648g(lowerCase, "toLowerCase(...)");
        return vyh.m53620a(lowerCase, entry.getValue());
    }

    /* renamed from: l */
    public static final CharSequence m38716l(hwc hwcVar) {
        sq8.m48649h(hwcVar, "it");
        return (CharSequence) hwcVar.m31229c();
    }

    /* renamed from: m */
    public static final String m38717m(hwc hwcVar) {
        sq8.m48649h(hwcVar, "it");
        return lc2.m36890f(hwcVar);
    }

    /* renamed from: n */
    public static final void m38718n(z81 z81Var, z38 z38Var, String str, String str2, boolean z, boolean z2) {
        if (!z || str2 == null) {
            return;
        }
        int i = C15273b.f35131a[z81Var.m58890k().ordinal()];
        if (i == 1) {
            if (z2 || !z38Var.m58668e().m59801i(str)) {
                z38Var.m58668e().m59810r(str, str2);
                return;
            }
            return;
        }
        if (i == 2) {
            c5e.C12567a c12567aM36766g = z38Var.m58671h().m36766g();
            if (z2 || !c12567aM36766g.m20280o().containsKey(str)) {
                c12567aM36766g.m20280o().remove(str);
                e3d.C13097a c13097a = e3d.f20909h;
                c12567aM36766g.put(c13097a.m24251h().mo24242b(str), c13097a.m24251h().mo24242b(str2));
                return;
            }
            return;
        }
        throw new v0c("An operation is not implemented: " + ("Support for " + z81Var.m58890k() + " is not yet implemented"));
    }

    /* renamed from: o */
    public static /* synthetic */ void m38719o(z81 z81Var, z38 z38Var, String str, String str2, boolean z, boolean z2, int i, Object obj) {
        m38718n(z81Var, z38Var, str, str2, (i & 16) != 0 ? true : z, (i & 32) != 0 ? true : z2);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x01c6 A[LOOP:0: B:38:0x01c0->B:40:0x01c6, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    @Override // p001o.hc2
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object mo30200a(y38 y38Var, z81 z81Var, n64 n64Var) {
        C15277f c15277f;
        String strM23921a;
        y38 y38Var2;
        final z81 z81Var2;
        Iterator it;
        if (n64Var instanceof C15277f) {
            c15277f = (C15277f) n64Var;
            int i = c15277f.f35142e;
            if ((i & Integer.MIN_VALUE) != 0) {
                c15277f.f35142e = i - Integer.MIN_VALUE;
            } else {
                c15277f = new C15277f(n64Var);
            }
        }
        Object objM38720i = c15277f.f35140c;
        Object objM51918f = uq8.m51918f();
        int i2 = c15277f.f35142e;
        if (i2 == 0) {
            wre.m54934b(objM38720i);
            dx7 dx7VarM58883d = z81Var.m58883d();
            if (!(dx7VarM58883d instanceof dx7.C13050a)) {
                if (!(dx7VarM58883d instanceof dx7.AbstractC13052c)) {
                    throw new szb();
                }
                strM23921a = ((dx7.AbstractC13052c) dx7VarM58883d).m23921a();
                y38Var2 = y38Var;
                z81Var2 = z81Var;
                boolean z = z81Var2.m58890k() != t81.HTTP_REQUEST_VIA_QUERY_PARAMS;
                boolean z2 = z && z81Var2.m58891l() == u81.X_AMZ_CONTENT_SHA256;
                String sessionToken = z81Var2.m58881b().getSessionToken();
                z38 z38VarM26053c = f48.m26053c(y38Var2);
                m38718n(z81Var2, z38VarM26053c, "Host", z38VarM26053c.m58671h().m36765f(), !z, false);
                m38719o(z81Var2, z38VarM26053c, "X-Amz-Algorithm", "AWS4-HMAC-SHA256", z, false, 32, null);
                m38719o(z81Var2, z38VarM26053c, "X-Amz-Credential", cc5.m20835a(z81Var2), z, false, 32, null);
                m38719o(z81Var2, z38VarM26053c, "X-Amz-Content-Sha256", strM23921a, z2, false, 32, null);
                m38719o(z81Var2, z38VarM26053c, "X-Amz-Date", z81Var2.m58892m().m28951d(vmh.ISO_8601_CONDENSED), false, false, 48, null);
                k16 k16VarM58882c = z81Var2.m58882c();
                m38719o(z81Var2, z38VarM26053c, "X-Amz-Expires", k16VarM58882c == null ? ml1.m39305e(k16.m34856B(k16VarM58882c.m34896X())).toString() : null, z, false, 32, null);
                m38719o(z81Var2, z38VarM26053c, "X-Amz-Security-Token", sessionToken, !z81Var2.m58886g(), false, 32, null);
                ief iefVarM45321x = qef.m45321x(qef.m45319v(qef.m45310m(kh3.m35706V(z38VarM26053c.m58668e().m59803k()), new xk7() { // from class: o.ic5
                    @Override // p001o.xk7
                    public final Object invoke(Object obj) {
                        return Boolean.valueOf(mc5.m38714j(z81Var2, (Map.Entry) obj));
                    }
                }), new xk7() { // from class: o.jc5
                    @Override // p001o.xk7
                    public final Object invoke(Object obj) {
                        return mc5.m38715k((Map.Entry) obj);
                    }
                }), new C15276e());
                String strM45317t = qef.m45317t(iefVarM45321x, ";", null, null, 0, null, new xk7() { // from class: o.kc5
                    @Override // p001o.xk7
                    public final Object invoke(Object obj) {
                        return mc5.m38716l((hwc) obj);
                    }
                }, 30, null);
                m38719o(z81Var2, z38VarM26053c, "X-Amz-SignedHeaders", strM45317t, z, false, 32, null);
                StringBuilder sb = new StringBuilder();
                sb.append(z38VarM26053c.m58669f().name());
                sq8.m48648g(sb, "append(...)");
                sb.append('\n');
                sq8.m48648g(sb, "append(...)");
                sb.append(lc2.m36892h(z38VarM26053c.m58671h(), z81Var2));
                sq8.m48648g(sb, "append(...)");
                sb.append('\n');
                sq8.m48648g(sb, "append(...)");
                sb.append(lc2.m36895k(z38VarM26053c.m58671h()));
                sq8.m48648g(sb, "append(...)");
                sb.append('\n');
                sq8.m48648g(sb, "append(...)");
                it = qef.m45319v(iefVarM45321x, new xk7() { // from class: o.lc5
                    @Override // p001o.xk7
                    public final Object invoke(Object obj) {
                        return mc5.m38717m((hwc) obj);
                    }
                }).iterator();
                while (it.hasNext()) {
                    sb.append((String) it.next());
                    sq8.m48648g(sb, "append(...)");
                    sb.append('\n');
                    sq8.m48648g(sb, "append(...)");
                }
                sb.append('\n');
                sq8.m48648g(sb, "append(...)");
                sb.append(strM45317t);
                sq8.m48648g(sb, "append(...)");
                sb.append('\n');
                sq8.m48648g(sb, "append(...)");
                sb.append(strM23921a);
                String string = sb.toString();
                sq8.m48648g(string, "toString(...)");
                m38719o(z81Var2, z38VarM26053c, "X-Amz-Security-Token", sessionToken, z81Var2.m58886g(), false, 32, null);
                return new gc2(z38VarM26053c, string, strM45317t, strM23921a);
            }
            m18 body = y38Var.getBody();
            c15277f.f35138a = y38Var;
            c15277f.f35139b = z81Var;
            c15277f.f35142e = 1;
            objM38720i = m38720i(body, c15277f);
            if (objM38720i == objM51918f) {
                return objM51918f;
            }
            y38Var2 = y38Var;
            z81Var2 = z81Var;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            z81Var2 = (z81) c15277f.f35139b;
            y38Var2 = (y38) c15277f.f35138a;
            wre.m54934b(objM38720i);
        }
        strM23921a = (String) objM38720i;
        if (z81Var2.m58890k() != t81.HTTP_REQUEST_VIA_QUERY_PARAMS) {
        }
        if (z) {
        }
        String sessionToken2 = z81Var2.m58881b().getSessionToken();
        z38 z38VarM26053c2 = f48.m26053c(y38Var2);
        m38718n(z81Var2, z38VarM26053c2, "Host", z38VarM26053c2.m58671h().m36765f(), !z, false);
        m38719o(z81Var2, z38VarM26053c2, "X-Amz-Algorithm", "AWS4-HMAC-SHA256", z, false, 32, null);
        m38719o(z81Var2, z38VarM26053c2, "X-Amz-Credential", cc5.m20835a(z81Var2), z, false, 32, null);
        m38719o(z81Var2, z38VarM26053c2, "X-Amz-Content-Sha256", strM23921a, z2, false, 32, null);
        m38719o(z81Var2, z38VarM26053c2, "X-Amz-Date", z81Var2.m58892m().m28951d(vmh.ISO_8601_CONDENSED), false, false, 48, null);
        k16 k16VarM58882c2 = z81Var2.m58882c();
        m38719o(z81Var2, z38VarM26053c2, "X-Amz-Expires", k16VarM58882c2 == null ? ml1.m39305e(k16.m34856B(k16VarM58882c2.m34896X())).toString() : null, z, false, 32, null);
        m38719o(z81Var2, z38VarM26053c2, "X-Amz-Security-Token", sessionToken2, !z81Var2.m58886g(), false, 32, null);
        ief iefVarM45321x2 = qef.m45321x(qef.m45319v(qef.m45310m(kh3.m35706V(z38VarM26053c2.m58668e().m59803k()), new xk7() { // from class: o.ic5
            @Override // p001o.xk7
            public final Object invoke(Object obj) {
                return Boolean.valueOf(mc5.m38714j(z81Var2, (Map.Entry) obj));
            }
        }), new xk7() { // from class: o.jc5
            @Override // p001o.xk7
            public final Object invoke(Object obj) {
                return mc5.m38715k((Map.Entry) obj);
            }
        }), new C15276e());
        String strM45317t2 = qef.m45317t(iefVarM45321x2, ";", null, null, 0, null, new xk7() { // from class: o.kc5
            @Override // p001o.xk7
            public final Object invoke(Object obj) {
                return mc5.m38716l((hwc) obj);
            }
        }, 30, null);
        m38719o(z81Var2, z38VarM26053c2, "X-Amz-SignedHeaders", strM45317t2, z, false, 32, null);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(z38VarM26053c2.m58669f().name());
        sq8.m48648g(sb2, "append(...)");
        sb2.append('\n');
        sq8.m48648g(sb2, "append(...)");
        sb2.append(lc2.m36892h(z38VarM26053c2.m58671h(), z81Var2));
        sq8.m48648g(sb2, "append(...)");
        sb2.append('\n');
        sq8.m48648g(sb2, "append(...)");
        sb2.append(lc2.m36895k(z38VarM26053c2.m58671h()));
        sq8.m48648g(sb2, "append(...)");
        sb2.append('\n');
        sq8.m48648g(sb2, "append(...)");
        it = qef.m45319v(iefVarM45321x2, new xk7() { // from class: o.lc5
            @Override // p001o.xk7
            public final Object invoke(Object obj) {
                return mc5.m38717m((hwc) obj);
            }
        }).iterator();
        while (it.hasNext()) {
        }
        sb2.append('\n');
        sq8.m48648g(sb2, "append(...)");
        sb2.append(strM45317t2);
        sq8.m48648g(sb2, "append(...)");
        sb2.append('\n');
        sq8.m48648g(sb2, "append(...)");
        sb2.append(strM23921a);
        String string2 = sb2.toString();
        sq8.m48648g(string2, "toString(...)");
        m38719o(z81Var2, z38VarM26053c2, "X-Amz-Security-Token", sessionToken2, z81Var2.m58886g(), false, 32, null);
        return new gc2(z38VarM26053c2, string2, strM45317t2, strM23921a);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m38720i(m18 m18Var, n64 n64Var) {
        C15274c c15274c;
        if (n64Var instanceof C15274c) {
            c15274c = (C15274c) n64Var;
            int i = c15274c.f35134c;
            if ((i & Integer.MIN_VALUE) != 0) {
                c15274c.f35134c = i - Integer.MIN_VALUE;
            } else {
                c15274c = new C15274c(n64Var);
            }
        }
        Object objM43867g = c15274c.f35132a;
        Object objM51918f = uq8.m51918f();
        int i2 = c15274c.f35134c;
        if (i2 != 0) {
            if (i2 == 1) {
                wre.m54934b(objM43867g);
                return gy7.m29642b((byte[]) objM43867g);
            }
            if (i2 == 2) {
                wre.m54934b(objM43867g);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        wre.m54934b(objM43867g);
        if (!(!m18Var.isOneShot())) {
            throw new IllegalArgumentException("Stream must be replayable to calculate a body hash".toString());
        }
        if (m18Var instanceof m18.C15196d) {
            return dx7.C13051b.f20621b.m23921a();
        }
        if (m18Var instanceof m18.AbstractC15193a) {
            return gy7.m29642b(bx7.m19910b(((m18.AbstractC15193a) m18Var).mo38177a(), this.f35129b));
        }
        if (m18Var instanceof m18.AbstractC15194b) {
            y6f from = ((m18.AbstractC15194b) m18Var).readFrom();
            c15274c.f35134c = 1;
            objM43867g = m38721p(from, c15274c);
            if (objM43867g == objM51918f) {
                return objM51918f;
            }
            return gy7.m29642b((byte[]) objM43867g);
        }
        if (!(m18Var instanceof m18.AbstractC15197e)) {
            throw new szb();
        }
        h8f from2 = ((m18.AbstractC15197e) m18Var).readFrom();
        z74 z74VarM28153a = g7f.f24695a.m28153a();
        C15275d c15275d = new C15275d(from2, null);
        c15274c.f35134c = 2;
        objM43867g = pm1.m43867g(z74VarM28153a, c15275d, c15274c);
        return objM43867g == objM51918f ? objM51918f : objM43867g;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: p */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m38721p(y6f y6fVar, n64 n64Var) {
        C15278g c15278g;
        ax7 ax7Var;
        if (n64Var instanceof C15278g) {
            c15278g = (C15278g) n64Var;
            int i = c15278g.f35146d;
            if ((i & Integer.MIN_VALUE) != 0) {
                c15278g.f35146d = i - Integer.MIN_VALUE;
            } else {
                c15278g = new C15278g(n64Var);
            }
        }
        Object obj = c15278g.f35144b;
        Object objM51918f = uq8.m51918f();
        int i2 = c15278g.f35146d;
        if (i2 == 0) {
            wre.m54934b(obj);
            ax7 ax7Var2 = (ax7) this.f35129b.invoke();
            hx7 hx7Var = new hx7(ax7Var2, null, 2, null);
            c15278g.f35143a = ax7Var2;
            c15278g.f35146d = 1;
            if (z6f.m58851a(y6fVar, hx7Var, c15278g) == objM51918f) {
                return objM51918f;
            }
            ax7Var = ax7Var2;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ax7Var = (ax7) c15278g.f35143a;
            wre.m54934b(obj);
        }
        return ax7Var.mo17932a();
    }

    /* renamed from: q */
    public final byte[] m38722q(h8f h8fVar) throws IllegalAccessException, IOException, IllegalArgumentException, InvocationTargetException {
        ax7 ax7Var = (ax7) this.f35129b.invoke();
        u6f u6fVarM38492a = m7f.m38492a(new hx7(ax7Var, null, 2, null));
        try {
            try {
                u6fVarM38492a.B0(h8fVar);
                h8fVar.close();
                u6fVarM38492a.close();
                return ax7Var.mo17932a();
            } catch (Throwable th) {
                try {
                    u6fVarM38492a.close();
                } catch (Throwable th2) {
                    cl6.m21376a(th, th2);
                }
                throw th;
            }
        } finally {
        }
    }

    public /* synthetic */ mc5(uk7 uk7Var, int i, id5 id5Var) {
        this((i & 1) != 0 ? C15272a.f35130a : uk7Var);
    }
}
