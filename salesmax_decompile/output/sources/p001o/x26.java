package p001o;

import java.io.IOException;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import p001o.j7f;
import p001o.l8i;
import p001o.qja;
import p001o.y08;

/* loaded from: classes2.dex */
public final class x26 implements rb3 {

    /* renamed from: a */
    public final r9d f53093a;

    /* renamed from: b */
    public final b18 f53094b;

    /* renamed from: c */
    public final boolean f53095c;

    /* renamed from: d */
    public final t18 f53096d;

    /* renamed from: o.x26$a */
    public static final class C18037a extends o64 {

        /* renamed from: a */
        public Object f53097a;

        /* renamed from: b */
        public /* synthetic */ Object f53098b;

        /* renamed from: d */
        public int f53100d;

        public C18037a(n64 n64Var) {
            super(n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            this.f53098b = obj;
            this.f53100d |= Integer.MIN_VALUE;
            return x26.this.m55590k(this);
        }
    }

    /* renamed from: o.x26$b */
    public static final class C18038b extends o64 {

        /* renamed from: a */
        public /* synthetic */ Object f53101a;

        /* renamed from: c */
        public int f53103c;

        public C18038b(n64 n64Var) {
            super(n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            this.f53101a = obj;
            this.f53103c |= Integer.MIN_VALUE;
            return x26.this.m55591o(null, this);
        }
    }

    /* renamed from: o.x26$c */
    public static final class C18039c extends o64 {

        /* renamed from: a */
        public Object f53104a;

        /* renamed from: b */
        public Object f53105b;

        /* renamed from: c */
        public Object f53106c;

        /* renamed from: d */
        public /* synthetic */ Object f53107d;

        /* renamed from: f */
        public int f53109f;

        public C18039c(n64 n64Var) {
            super(n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            this.f53107d = obj;
            this.f53109f |= Integer.MIN_VALUE;
            return x26.this.resolve(null, this);
        }
    }

    /* renamed from: o.x26$d */
    public static final class C18040d implements h86 {

        /* renamed from: a */
        public final /* synthetic */ l8i f53110a;

        public C18040d(l8i l8iVar) {
            this.f53110a = l8iVar;
        }

        @Override // p001o.h86
        /* renamed from: a */
        public final Object mo29972a(rne rneVar, n64 n64Var) {
            return new b86(this.f53110a, null, 2, null);
        }
    }

    /* renamed from: o.x26$e */
    public static final class C18041e extends o64 {

        /* renamed from: a */
        public Object f53111a;

        /* renamed from: b */
        public Object f53112b;

        /* renamed from: c */
        public /* synthetic */ Object f53113c;

        /* renamed from: e */
        public int f53115e;

        public C18041e(n64 n64Var) {
            super(n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            this.f53113c = obj;
            this.f53115e |= Integer.MIN_VALUE;
            return x26.this.m55592u(null, this);
        }
    }

    public x26(r9d r9dVar, t18 t18Var, b18 b18Var) {
        sq8.m48649h(r9dVar, "platformProvider");
        sq8.m48649h(b18Var, "hostResolver");
        this.f53093a = r9dVar;
        this.f53094b = b18Var;
        this.f53095c = t18Var == null;
        this.f53096d = t18Var == null ? ne5.m40414b(null, 1, null) : t18Var;
    }

    /* renamed from: r */
    public static final String m55586r() {
        return "retrieving container credentials";
    }

    /* renamed from: s */
    public static final String m55587s() {
        return "failed to obtain credentials from container metadata service";
    }

    /* renamed from: t */
    public static final String m55588t(ic4 ic4Var) {
        StringBuilder sb = new StringBuilder();
        sb.append("obtained credentials from container metadata service; expiration=");
        gk8 gk8VarMo29762c = ic4Var.mo29762c();
        sb.append(gk8VarMo29762c != null ? gk8VarMo29762c.m28951d(vmh.ISO_8601) : null);
        return sb.toString();
    }

    /* renamed from: C */
    public final l8i m55589C(String str) {
        try {
            return l8i.C15037b.m36787m(l8i.f33466k, "http://169.254.170.2" + str, null, 2, null);
        } catch (Exception e) {
            throw new n2e("Invalid relativeUri `" + str + '`', e);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this.f53095c) {
            ub3.m51325a(this.f53096d);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x006b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0076 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: k */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m55590k(n64 n64Var) {
        C18037a c18037a;
        x26 x26Var;
        String str;
        if (n64Var instanceof C18037a) {
            c18037a = (C18037a) n64Var;
            int i = c18037a.f53100d;
            if ((i & Integer.MIN_VALUE) != 0) {
                c18037a.f53100d = i - Integer.MIN_VALUE;
            } else {
                c18037a = new C18037a(n64Var);
            }
        }
        Object objM55591o = c18037a.f53098b;
        Object objM51918f = uq8.m51918f();
        int i2 = c18037a.f53100d;
        if (i2 == 0) {
            wre.m54934b(objM55591o);
            String str2 = (String) bj6.m19237f(o81.f37890a.m41733f(), this.f53093a);
            if (str2 == null) {
                x26Var = this;
                str = (String) bj6.m19237f(o81.f37890a.m41732e(), x26Var.f53093a);
                if (str == null) {
                    return null;
                }
                if (f9g.m26306P(str, "\r\n", false, 2, null)) {
                    return str;
                }
                throw new sc4("Token contains illegal line break sequence.", null, 2, null);
            }
            c18037a.f53097a = this;
            c18037a.f53100d = 1;
            objM55591o = m55591o(str2, c18037a);
            if (objM55591o == objM51918f) {
                return objM51918f;
            }
            x26Var = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x26Var = (x26) c18037a.f53097a;
            wre.m54934b(objM55591o);
        }
        str = (String) objM55591o;
        if (str == null) {
            str = (String) bj6.m19237f(o81.f37890a.m41732e(), x26Var.f53093a);
            if (str == null) {
            }
        }
        if (f9g.m26306P(str, "\r\n", false, 2, null)) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: o */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m55591o(String str, n64 n64Var) {
        C18038b c18038b;
        String strM24600r;
        if (n64Var instanceof C18038b) {
            c18038b = (C18038b) n64Var;
            int i = c18038b.f53103c;
            if ((i & Integer.MIN_VALUE) != 0) {
                c18038b.f53103c = i - Integer.MIN_VALUE;
            } else {
                c18038b = new C18038b(n64Var);
            }
        }
        Object objMo18076d = c18038b.f53101a;
        Object objM51918f = uq8.m51918f();
        int i2 = c18038b.f53103c;
        if (i2 == 0) {
            wre.m54934b(objMo18076d);
            r9d r9dVar = this.f53093a;
            c18038b.f53103c = 1;
            objMo18076d = r9dVar.mo18076d(str, c18038b);
            if (objMo18076d == objM51918f) {
                return objM51918f;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            wre.m54934b(objMo18076d);
        }
        byte[] bArr = (byte[]) objMo18076d;
        if (bArr == null || (strM24600r = e9g.m24600r(bArr)) == null) {
            throw new sc4("Could not read token file.", null, 2, null);
        }
        return strM24600r;
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x0140 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:69:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // p001o.qc4, p001o.nb8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object resolve(qx0 qx0Var, n64 n64Var) throws Exception {
        C18039c c18039c;
        x26 x26Var;
        qja qjaVar;
        String str;
        String str2;
        qja qjaVar2;
        l8i l8iVarM55589C;
        qja qjaVar3;
        if (n64Var instanceof C18039c) {
            c18039c = (C18039c) n64Var;
            int i = c18039c.f53109f;
            if ((i & Integer.MIN_VALUE) != 0) {
                c18039c.f53109f = i - Integer.MIN_VALUE;
            } else {
                c18039c = new C18039c(n64Var);
            }
        }
        Object objM36671e = c18039c.f53107d;
        Object objM51918f = uq8.m51918f();
        int i2 = c18039c.f53109f;
        if (i2 == 0) {
            wre.m54934b(objM36671e);
            q74 context = c18039c.getContext();
            String strMo26336c = kge.m35689b(x26.class).mo26336c();
            if (strMo26336c == null) {
                throw new IllegalArgumentException("logger<T> cannot be used on an anonymous object".toString());
            }
            qja qjaVarM52400e = v74.m52400e(context, strMo26336c);
            c18039c.f53104a = this;
            c18039c.f53105b = qjaVarM52400e;
            c18039c.f53109f = 1;
            Object objM55590k = m55590k(c18039c);
            if (objM55590k == objM51918f) {
                return objM51918f;
            }
            x26Var = this;
            qjaVar = qjaVarM52400e;
            objM36671e = objM55590k;
        } else if (i2 == 1) {
            qjaVar = (qja) c18039c.f53105b;
            x26Var = (x26) c18039c.f53104a;
            wre.m54934b(objM36671e);
        } else {
            if (i2 == 2) {
                str2 = (String) c18039c.f53106c;
                qjaVar2 = (qja) c18039c.f53105b;
                x26Var = (x26) c18039c.f53104a;
                wre.m54934b(objM36671e);
                qja qjaVar4 = qjaVar2;
                l8iVarM55589C = (l8i) objM36671e;
                str = str2;
                qjaVar = qjaVar4;
                j7f.C14471a c14471a = j7f.f29929h;
                k7f k7fVar = new k7f(kge.m35689b(y3i.class), kge.m35689b(ic4.class));
                k7fVar.m35123i(new a36(str));
                k7fVar.m35120f(new t26());
                k7fVar.m35121g("EcsCredentialsProvider");
                k7fVar.m35124j("EcsContainerMetadata");
                k7fVar.m35117c().m51150j(new C18040d(l8iVarM55589C));
                j7f j7fVarM35115a = k7fVar.m35115a();
                j7fVarM35115a.m33383c().m51151k(new z26());
                qja.C16414b.m45548a(qjaVar, null, new uk7() { // from class: o.u26
                    @Override // p001o.uk7
                    public final Object invoke() {
                        return x26.m55586r();
                    }
                }, 1, null);
                i7f i7fVar = new i7f(x26Var.f53096d);
                try {
                    y3i y3iVar = y3i.f54824a;
                    c18039c.f53104a = qjaVar;
                    c18039c.f53105b = null;
                    c18039c.f53106c = null;
                    c18039c.f53109f = 3;
                    objM36671e = l7f.m36671e(j7fVarM35115a, i7fVar, y3iVar, c18039c);
                    if (objM36671e == objM51918f) {
                        return objM51918f;
                    }
                    qjaVar3 = qjaVar;
                    final ic4 ic4Var = (ic4) objM36671e;
                    qja.C16414b.m45548a(qjaVar3, null, new uk7() { // from class: o.w26
                        @Override // p001o.uk7
                        public final Object invoke() {
                            return x26.m55588t(ic4Var);
                        }
                    }, 1, null);
                    return ic4Var;
                } catch (Exception e) {
                    e = e;
                    qjaVar3 = qjaVar;
                    qja.C16414b.m45548a(qjaVar3, null, new uk7() { // from class: o.v26
                        @Override // p001o.uk7
                        public final Object invoke() {
                            return x26.m55587s();
                        }
                    }, 1, null);
                    if (e instanceof sc4) {
                        throw new sc4("Failed to get credentials from container metadata service", e);
                    }
                    throw e;
                }
            }
            if (i2 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            qjaVar3 = (qja) c18039c.f53104a;
            try {
                wre.m54934b(objM36671e);
                final ic4 ic4Var2 = (ic4) objM36671e;
                qja.C16414b.m45548a(qjaVar3, null, new uk7() { // from class: o.w26
                    @Override // p001o.uk7
                    public final Object invoke() {
                        return x26.m55588t(ic4Var2);
                    }
                }, 1, null);
                return ic4Var2;
            } catch (Exception e2) {
                e = e2;
                qja.C16414b.m45548a(qjaVar3, null, new uk7() { // from class: o.v26
                    @Override // p001o.uk7
                    public final Object invoke() {
                        return x26.m55587s();
                    }
                }, 1, null);
                if (e instanceof sc4) {
                }
            }
        }
        str = (String) objM36671e;
        o81 o81Var = o81.f37890a;
        String str3 = (String) bj6.m19237f(o81Var.m41735h(), x26Var.f53093a);
        String str4 = (String) bj6.m19237f(o81Var.m41734g(), x26Var.f53093a);
        boolean z = false;
        if ((str3 == null || f9g.d0(str3)) ? false : true) {
            l8iVarM55589C = x26Var.m55589C(str3);
            j7f.C14471a c14471a2 = j7f.f29929h;
            k7f k7fVar2 = new k7f(kge.m35689b(y3i.class), kge.m35689b(ic4.class));
            k7fVar2.m35123i(new a36(str));
            k7fVar2.m35120f(new t26());
            k7fVar2.m35121g("EcsCredentialsProvider");
            k7fVar2.m35124j("EcsContainerMetadata");
            k7fVar2.m35117c().m51150j(new C18040d(l8iVarM55589C));
            j7f j7fVarM35115a2 = k7fVar2.m35115a();
            j7fVarM35115a2.m33383c().m51151k(new z26());
            qja.C16414b.m45548a(qjaVar, null, new uk7() { // from class: o.u26
                @Override // p001o.uk7
                public final Object invoke() {
                    return x26.m55586r();
                }
            }, 1, null);
            i7f i7fVar2 = new i7f(x26Var.f53096d);
            y3i y3iVar2 = y3i.f54824a;
            c18039c.f53104a = qjaVar;
            c18039c.f53105b = null;
            c18039c.f53106c = null;
            c18039c.f53109f = 3;
            objM36671e = l7f.m36671e(j7fVarM35115a2, i7fVar2, y3iVar2, c18039c);
            if (objM36671e == objM51918f) {
            }
        } else {
            if (str4 != null && !f9g.d0(str4)) {
                z = true;
            }
            if (!z) {
                throw new n2e("Container credentials URI not set", null, 2, null);
            }
            c18039c.f53104a = x26Var;
            c18039c.f53105b = qjaVar;
            c18039c.f53106c = str;
            c18039c.f53109f = 2;
            Object objM55592u = x26Var.m55592u(str4, c18039c);
            if (objM55592u == objM51918f) {
                return objM51918f;
            }
            qja qjaVar5 = qjaVar;
            str2 = str;
            objM36671e = objM55592u;
            qjaVar2 = qjaVar5;
            qja qjaVar42 = qjaVar2;
            l8iVarM55589C = (l8i) objM36671e;
            str = str2;
            qjaVar = qjaVar42;
            j7f.C14471a c14471a22 = j7f.f29929h;
            k7f k7fVar22 = new k7f(kge.m35689b(y3i.class), kge.m35689b(ic4.class));
            k7fVar22.m35123i(new a36(str));
            k7fVar22.m35120f(new t26());
            k7fVar22.m35121g("EcsCredentialsProvider");
            k7fVar22.m35124j("EcsContainerMetadata");
            k7fVar22.m35117c().m51150j(new C18040d(l8iVarM55589C));
            j7f j7fVarM35115a22 = k7fVar22.m35115a();
            j7fVarM35115a22.m33383c().m51151k(new z26());
            qja.C16414b.m45548a(qjaVar, null, new uk7() { // from class: o.u26
                @Override // p001o.uk7
                public final Object invoke() {
                    return x26.m55586r();
                }
            }, 1, null);
            i7f i7fVar22 = new i7f(x26Var.f53096d);
            y3i y3iVar22 = y3i.f54824a;
            c18039c.f53104a = qjaVar;
            c18039c.f53105b = null;
            c18039c.f53106c = null;
            c18039c.f53109f = 3;
            objM36671e = l7f.m36671e(j7fVarM35115a22, i7fVar22, y3iVar22, c18039c);
            if (objM36671e == objM51918f) {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /* renamed from: u */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m55592u(String str, n64 n64Var) {
        C18041e c18041e;
        l8i l8iVar;
        Throwable th;
        String str2 = str;
        if (n64Var instanceof C18041e) {
            c18041e = (C18041e) n64Var;
            int i = c18041e.f53115e;
            if ((i & Integer.MIN_VALUE) != 0) {
                c18041e.f53115e = i - Integer.MIN_VALUE;
            } else {
                c18041e = new C18041e(n64Var);
            }
        }
        Object obj = c18041e.f53113c;
        Object objM51918f = uq8.m51918f();
        int i2 = c18041e.f53115e;
        boolean z = true;
        if (i2 == 0) {
            wre.m54934b(obj);
            try {
                l8i l8iVarM36787m = l8i.C15037b.m36787m(l8i.f33466k, str2, null, 2, null);
                if (sq8.m48644c(l8iVarM36787m.m36759f(), a6f.f14208c.m16525c())) {
                    return l8iVarM36787m;
                }
                y08 y08VarM36755b = l8iVarM36787m.m36755b();
                if (y08VarM36755b instanceof y08.C18292c) {
                    Set set = y26.f54744d;
                    y08 y08VarM36755b2 = l8iVarM36787m.m36755b();
                    sq8.m48647f(y08VarM36755b2, "null cannot be cast to non-null type aws.smithy.kotlin.runtime.net.Host.IpAddress");
                    if (set.contains(((y08.C18292c) y08VarM36755b2).m57088a())) {
                        return l8iVarM36787m;
                    }
                    throw new n2e("The container credentials full URI (" + str2 + ") has an invalid host. Host can only be one of [" + kh3.p0(y26.f54744d, null, null, null, 0, null, null, 63, null) + "].", null, 2, null);
                }
                if (!(y08VarM36755b instanceof y08.C18291b)) {
                    throw new szb();
                }
                try {
                    b18 b18Var = this.f53094b;
                    String string = l8iVarM36787m.m36755b().toString();
                    c18041e.f53111a = str2;
                    c18041e.f53112b = l8iVarM36787m;
                    c18041e.f53115e = 1;
                    Object objMo18087a = b18Var.mo18087a(string, c18041e);
                    if (objMo18087a == objM51918f) {
                        return objM51918f;
                    }
                    l8iVar = l8iVarM36787m;
                    obj = objMo18087a;
                } catch (Throwable th2) {
                    th = th2;
                    throw new n2e("The container credentials full URI (" + str2 + ") is specified via a hostname whose IP address(es) could not be resolved. " + th.getMessage(), th);
                }
            } catch (Exception e) {
                throw new n2e("Invalid fullUri `" + str2 + '`', e);
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            l8i l8iVar2 = (l8i) c18041e.f53112b;
            String str3 = (String) c18041e.f53111a;
            try {
                wre.m54934b(obj);
                l8iVar = l8iVar2;
                str2 = str3;
            } catch (Throwable th3) {
                th = th3;
                str2 = str3;
                throw new n2e("The container credentials full URI (" + str2 + ") is specified via a hostname whose IP address(es) could not be resolved. " + th.getMessage(), th);
            }
        }
        List list = (List) obj;
        if (!list.isEmpty()) {
            if (!(list instanceof Collection) || !list.isEmpty()) {
                Iterator it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    if (!((z08) it.next()).m58588a().mo17901b()) {
                        z = false;
                        break;
                    }
                }
            }
            if (z) {
                return l8iVar;
            }
        }
        throw new n2e("The container credentials full URI (" + str2 + ") is specified via a hostname whose IP address(es) do not resolve to the loopback device.", null, 2, null);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public x26(r9d r9dVar, t18 t18Var) {
        this(r9dVar, t18Var, b18.f15444a.m18089a());
        sq8.m48649h(r9dVar, "platformProvider");
    }
}
