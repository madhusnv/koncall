package p001o;

import java.util.Iterator;
import java.util.List;
import java.util.Set;
import p001o.gja;
import p001o.n6d;
import p001o.qja;

/* loaded from: classes3.dex */
public abstract class y7f {

    /* renamed from: o.y7f$a */
    public /* synthetic */ class C18348a extends dm7 implements ql7 {

        /* renamed from: a */
        public static final C18348a f55032a = new C18348a();

        public C18348a() {
            super(3, y7f.class, "httpTraceMiddleware", "httpTraceMiddleware(Laws/smithy/kotlin/runtime/http/operation/OperationRequest;Laws/smithy/kotlin/runtime/io/Handler;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 1);
        }

        @Override // p001o.ql7
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Object invoke(zdc zdcVar, jw7 jw7Var, n64 n64Var) {
            return y7f.m57346j(zdcVar, jw7Var, n64Var);
        }
    }

    /* renamed from: o.y7f$b */
    public static final class C18349b extends o64 {

        /* renamed from: a */
        public Object f55033a;

        /* renamed from: b */
        public Object f55034b;

        /* renamed from: c */
        public Object f55035c;

        /* renamed from: d */
        public Object f55036d;

        /* renamed from: e */
        public /* synthetic */ Object f55037e;

        /* renamed from: f */
        public int f55038f;

        public C18349b(n64 n64Var) {
            super(n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            this.f55037e = obj;
            this.f55038f |= Integer.MIN_VALUE;
            return y7f.m57346j(null, null, this);
        }
    }

    /* renamed from: f */
    public static final jw7 m57342f(m28 m28Var, jw7 jw7Var, un8 un8Var) {
        return new cn5(jw7Var, m28Var, un8Var);
    }

    /* renamed from: g */
    public static final jw7 m57343g(m48 m48Var, jw7 jw7Var, un8 un8Var) {
        return new jff(jw7Var, m48Var, un8Var);
    }

    /* renamed from: h */
    public static final jw7 m57344h(u7f u7fVar, jw7 jw7Var, j7f j7fVar) {
        sq8.m48649h(u7fVar, "<this>");
        sq8.m48649h(jw7Var, "handler");
        sq8.m48649h(j7fVar, "op");
        un8 un8Var = new un8(j7fVar.m33381a(), j7fVar.m33384d(), j7fVar.m33387g());
        n6d.m40146f(u7fVar.m51146f(), new r18(), null, 2, null);
        n6d.m40146f(u7fVar.m51146f(), new vn8(un8Var), null, 2, null);
        u7fVar.m51146f().m40148c(n6d.EnumC15515a.After, C18348a.f55032a);
        return new xdc(veb.m52663a(new ni8(m57343g(j7fVar.m33385e(), veb.m52663a(new iqb(veb.m52663a(veb.m52663a(new uz0(m57342f(j7fVar.m33382b(), veb.m52663a(jw7Var, u7fVar.m51146f()), un8Var), un8Var, u7fVar.m51141a(), u7fVar.m51142b()), u7fVar.m51145e()), new ose(u7fVar.m51148h(), u7fVar.m51147g(), un8Var))), u7fVar.m51144d()), un8Var)), u7fVar.m51143c()), un8Var);
    }

    /* renamed from: i */
    public static final y3i m57345i(ib8 ib8Var, jl6 jl6Var) {
        List listQ0;
        List listB0;
        Set set = (Set) ib8Var.getAttributes().mo18191b(po1.m43955d());
        if (set == null || (listQ0 = kh3.Q0(set)) == null || (listB0 = kh3.B0(listQ0)) == null) {
            return null;
        }
        Iterator it = listB0.iterator();
        while (it.hasNext()) {
            po1.m43953b(jl6Var, (lo1) it.next());
        }
        return y3i.f54824a;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00d5 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0114 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: j */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m57346j(zdc zdcVar, jw7 jw7Var, n64 n64Var) {
        C18349b c18349b;
        gja gjaVarM26257a;
        qja qjaVarM52400e;
        Object obj;
        zdc zdcVar2;
        qja qjaVar;
        Object objMo21441a;
        gja gjaVar;
        final gge ggeVar;
        gge ggeVar2;
        gge ggeVar3;
        qja qjaVar2;
        if (n64Var instanceof C18349b) {
            c18349b = (C18349b) n64Var;
            int i = c18349b.f55038f;
            if ((i & Integer.MIN_VALUE) != 0) {
                c18349b.f55038f = i - Integer.MIN_VALUE;
            } else {
                c18349b = new C18349b(n64Var);
            }
        }
        Object objM33190e = c18349b.f55037e;
        Object objM51918f = uq8.m51918f();
        int i2 = c18349b.f55038f;
        if (i2 == 0) {
            wre.m54934b(objM33190e);
            gjaVarM26257a = f7f.m26257a(zdcVar.m59254c());
            qjaVarM52400e = v74.m52400e(c18349b.getContext(), "httpTraceMiddleware");
            if (gjaVarM26257a.m28860a(gja.C13754d.f25333c) || gjaVarM26257a.m28860a(gja.C13755e.f25334c)) {
                z38 z38Var = (z38) zdcVar.m59255d();
                boolean zM28860a = gjaVarM26257a.m28860a(gja.C13755e.f25334c);
                c18349b.f55033a = zdcVar;
                c18349b.f55034b = jw7Var;
                c18349b.f55035c = gjaVarM26257a;
                c18349b.f55036d = qjaVarM52400e;
                c18349b.f55038f = 1;
                Object objM16407c = a48.m16407c(z38Var, zM28860a, c18349b);
                if (objM16407c == objM51918f) {
                    return objM51918f;
                }
                obj = objM16407c;
                zdcVar2 = zdcVar;
                qjaVar = qjaVarM52400e;
            }
            gge ggeVar4 = new gge();
            c18349b.f55033a = gjaVarM26257a;
            c18349b.f55034b = qjaVarM52400e;
            c18349b.f55035c = ggeVar4;
            c18349b.f55036d = ggeVar4;
            c18349b.f55038f = 2;
            objMo21441a = jw7Var.mo21441a(zdcVar, c18349b);
            if (objMo21441a != objM51918f) {
                return objM51918f;
            }
            gjaVar = gjaVarM26257a;
            ggeVar = ggeVar4;
            objM33190e = objMo21441a;
            ggeVar2 = ggeVar;
            ggeVar2.f25106a = objM33190e;
            if (gjaVar.m28860a(gja.C13756f.f25335c)) {
            }
            g48 g48VarM41347f = ((o18) ggeVar.f25106a).m41347f();
            boolean zM28860a2 = gjaVar.m28860a(gja.C13757g.f25336c);
            c18349b.f55033a = qjaVarM52400e;
            c18349b.f55034b = ggeVar;
            c18349b.f55035c = null;
            c18349b.f55036d = null;
            c18349b.f55038f = 3;
            objM33190e = j48.m33190e(g48VarM41347f, zM28860a2, c18349b);
            if (objM33190e != objM51918f) {
            }
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ggeVar3 = (gge) c18349b.f55034b;
                    qjaVar2 = (qja) c18349b.f55033a;
                    wre.m54934b(objM33190e);
                    hwc hwcVar = (hwc) objM33190e;
                    g48 g48Var = (g48) hwcVar.m31227a();
                    final String str = (String) hwcVar.m31228b();
                    ggeVar3.f25106a = o18.m41344c((o18) ggeVar3.f25106a, null, g48Var, 1, null);
                    qja.C16414b.m45548a(qjaVar2, null, new uk7() { // from class: o.w7f
                        @Override // p001o.uk7
                        public final Object invoke() {
                            return y7f.m57348l(str);
                        }
                    }, 1, null);
                    ggeVar = ggeVar3;
                    return ggeVar.f25106a;
                }
                ggeVar2 = (gge) c18349b.f55036d;
                ggeVar = (gge) c18349b.f55035c;
                qjaVarM52400e = (qja) c18349b.f55034b;
                gjaVar = (gja) c18349b.f55033a;
                wre.m54934b(objM33190e);
                ggeVar2.f25106a = objM33190e;
                if (gjaVar.m28860a(gja.C13756f.f25335c) && !gjaVar.m28860a(gja.C13757g.f25336c)) {
                    qja.C16414b.m45548a(qjaVarM52400e, null, new uk7() { // from class: o.x7f
                        @Override // p001o.uk7
                        public final Object invoke() {
                            return y7f.m57349m(ggeVar);
                        }
                    }, 1, null);
                    return ggeVar.f25106a;
                }
                g48 g48VarM41347f2 = ((o18) ggeVar.f25106a).m41347f();
                boolean zM28860a22 = gjaVar.m28860a(gja.C13757g.f25336c);
                c18349b.f55033a = qjaVarM52400e;
                c18349b.f55034b = ggeVar;
                c18349b.f55035c = null;
                c18349b.f55036d = null;
                c18349b.f55038f = 3;
                objM33190e = j48.m33190e(g48VarM41347f2, zM28860a22, c18349b);
                if (objM33190e != objM51918f) {
                    return objM51918f;
                }
                ggeVar3 = ggeVar;
                qjaVar2 = qjaVarM52400e;
                hwc hwcVar2 = (hwc) objM33190e;
                g48 g48Var2 = (g48) hwcVar2.m31227a();
                final String str2 = (String) hwcVar2.m31228b();
                ggeVar3.f25106a = o18.m41344c((o18) ggeVar3.f25106a, null, g48Var2, 1, null);
                qja.C16414b.m45548a(qjaVar2, null, new uk7() { // from class: o.w7f
                    @Override // p001o.uk7
                    public final Object invoke() {
                        return y7f.m57348l(str2);
                    }
                }, 1, null);
                ggeVar = ggeVar3;
                return ggeVar.f25106a;
            }
            qjaVar = (qja) c18349b.f55036d;
            gja gjaVar2 = (gja) c18349b.f55035c;
            jw7 jw7Var2 = (jw7) c18349b.f55034b;
            zdcVar2 = (zdc) c18349b.f55033a;
            wre.m54934b(objM33190e);
            obj = objM33190e;
            gjaVarM26257a = gjaVar2;
            jw7Var = jw7Var2;
        }
        final String str3 = (String) obj;
        qja.C16414b.m45548a(qjaVar, null, new uk7() { // from class: o.v7f
            @Override // p001o.uk7
            public final Object invoke() {
                return y7f.m57347k(str3);
            }
        }, 1, null);
        qjaVarM52400e = qjaVar;
        zdcVar = zdcVar2;
        gge ggeVar42 = new gge();
        c18349b.f55033a = gjaVarM26257a;
        c18349b.f55034b = qjaVarM52400e;
        c18349b.f55035c = ggeVar42;
        c18349b.f55036d = ggeVar42;
        c18349b.f55038f = 2;
        objMo21441a = jw7Var.mo21441a(zdcVar, c18349b);
        if (objMo21441a != objM51918f) {
        }
    }

    /* renamed from: k */
    public static final String m57347k(String str) {
        return "HttpRequest:\n" + str;
    }

    /* renamed from: l */
    public static final String m57348l(String str) {
        return "HttpResponse:\n" + str;
    }

    /* renamed from: m */
    public static final String m57349m(gge ggeVar) {
        return "HttpResponse: " + ((o18) ggeVar.f25106a).m41347f().getStatus();
    }
}
