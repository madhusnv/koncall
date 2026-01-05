package p001o;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import p001o.qja;

/* loaded from: classes3.dex */
public final class bc5 implements v81 {

    /* renamed from: a */
    public final hc2 f15910a;

    /* renamed from: b */
    public final zrf f15911b;

    /* renamed from: c */
    public final pme f15912c;

    /* renamed from: o.bc5$a */
    public static final class C12349a extends o64 {

        /* renamed from: a */
        public Object f15913a;

        /* renamed from: b */
        public Object f15914b;

        /* renamed from: c */
        public Object f15915c;

        /* renamed from: d */
        public /* synthetic */ Object f15916d;

        /* renamed from: f */
        public int f15918f;

        public C12349a(n64 n64Var) {
            super(n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            this.f15916d = obj;
            this.f15918f |= Integer.MIN_VALUE;
            return bc5.this.mo18582c(null, null, this);
        }
    }

    /* renamed from: o.bc5$b */
    public static final class C12350b implements Comparator {
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            String str = (String) ((Map.Entry) obj).getKey();
            Locale locale = Locale.ROOT;
            String lowerCase = str.toLowerCase(locale);
            sq8.m48648g(lowerCase, "toLowerCase(...)");
            String lowerCase2 = ((String) ((Map.Entry) obj2).getKey()).toLowerCase(locale);
            sq8.m48648g(lowerCase2, "toLowerCase(...)");
            return uk3.m51674d(lowerCase, lowerCase2);
        }
    }

    public bc5(hc2 hc2Var, zrf zrfVar, pme pmeVar) {
        sq8.m48649h(hc2Var, "canonicalizer");
        sq8.m48649h(zrfVar, "signatureCalculator");
        sq8.m48649h(pmeVar, "requestMutator");
        this.f15910a = hc2Var;
        this.f15911b = zrfVar;
        this.f15912c = pmeVar;
    }

    /* renamed from: l */
    public static final String m18572l(gc2 gc2Var) {
        return "Canonical request:\n" + gc2Var.m28388b();
    }

    /* renamed from: m */
    public static final String m18573m(String str) {
        return "String to sign:\n" + str;
    }

    /* renamed from: n */
    public static final String m18574n(String str) {
        return "Calculated signature: " + str;
    }

    /* renamed from: o */
    public static final String m18575o(String str) {
        return "Chunk string to sign:\n" + str;
    }

    /* renamed from: p */
    public static final String m18576p(String str) {
        return "Calculated chunk signature: " + str;
    }

    /* renamed from: q */
    public static final String m18577q(String str) {
        return "Chunk trailer string to sign:\n" + str;
    }

    /* renamed from: r */
    public static final String m18578r(String str) {
        return "Calculated chunk signature: " + str;
    }

    /* renamed from: s */
    public static final CharSequence m18579s(String str) {
        sq8.m48649h(str, "v");
        return f9g.Z0(str).toString();
    }

    @Override // p001o.v81
    /* renamed from: a */
    public Object mo18580a(ux7 ux7Var, byte[] bArr, z81 z81Var, n64 n64Var) {
        q74 context = n64Var.getContext();
        String strMo26336c = kge.m35689b(bc5.class).mo26336c();
        if (strMo26336c == null) {
            throw new IllegalArgumentException("logger<T> cannot be used on an anonymous object".toString());
        }
        qja qjaVarM52400e = v74.m52400e(context, strMo26336c);
        List<Map.Entry> listI0 = kh3.I0(ux7Var.mo17772b(), new C12350b());
        ArrayList arrayList = new ArrayList(dh3.m23088v(listI0, 10));
        for (Map.Entry entry : listI0) {
            StringBuilder sb = new StringBuilder();
            String lowerCase = ((String) entry.getKey()).toLowerCase(Locale.ROOT);
            sq8.m48648g(lowerCase, "toLowerCase(...)");
            sb.append(lowerCase);
            sb.append(":");
            sb.append(kh3.p0((Iterable) entry.getValue(), ",", null, null, 0, null, new xk7() { // from class: o.wb5
                @Override // p001o.xk7
                public final Object invoke(Object obj) {
                    return bc5.m18579s((String) obj);
                }
            }, 30, null));
            sb.append("\n");
            String string = sb.toString();
            sq8.m48648g(string, "toString(...)");
            arrayList.add(e9g.m24603u(string));
        }
        Iterator it = arrayList.iterator();
        if (!it.hasNext()) {
            throw new UnsupportedOperationException("Empty collection can't be reduced.");
        }
        Object next = it.next();
        while (it.hasNext()) {
            next = fp0.m27274w((byte[]) next, (byte[]) it.next());
        }
        final String strMo17051b = this.f15911b.mo17051b((byte[]) next, bArr, z81Var);
        qja.C16414b.m45550c(qjaVarM52400e, null, new uk7() { // from class: o.xb5
            @Override // p001o.uk7
            public final Object invoke() {
                return bc5.m18577q(strMo17051b);
            }
        }, 1, null);
        final String strMo17050a = this.f15911b.mo17050a(this.f15911b.mo17052c(z81Var), strMo17051b);
        qja.C16414b.m45548a(qjaVarM52400e, null, new uk7() { // from class: o.yb5
            @Override // p001o.uk7
            public final Object invoke() {
                return bc5.m18578r(strMo17050a);
            }
        }, 1, null);
        return new a91(y3i.f54824a, e9g.m24603u(strMo17050a));
    }

    @Override // p001o.v81
    /* renamed from: b */
    public Object mo18581b(byte[] bArr, byte[] bArr2, z81 z81Var, n64 n64Var) {
        q74 context = n64Var.getContext();
        String strMo26336c = kge.m35689b(bc5.class).mo26336c();
        if (strMo26336c == null) {
            throw new IllegalArgumentException("logger<T> cannot be used on an anonymous object".toString());
        }
        qja qjaVarM52400e = v74.m52400e(context, strMo26336c);
        final String strMo17053d = this.f15911b.mo17053d(bArr, bArr2, z81Var);
        qja.C16414b.m45550c(qjaVarM52400e, null, new uk7() { // from class: o.zb5
            @Override // p001o.uk7
            public final Object invoke() {
                return bc5.m18575o(strMo17053d);
            }
        }, 1, null);
        final String strMo17050a = this.f15911b.mo17050a(this.f15911b.mo17052c(z81Var), strMo17053d);
        qja.C16414b.m45548a(qjaVarM52400e, null, new uk7() { // from class: o.ac5
            @Override // p001o.uk7
            public final Object invoke() {
                return bc5.m18576p(strMo17050a);
            }
        }, 1, null);
        return new a91(y3i.f54824a, e9g.m24603u(strMo17050a));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // p001o.v81
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object mo18582c(y38 y38Var, z81 z81Var, n64 n64Var) {
        C12349a c12349a;
        bc5 bc5Var;
        qja qjaVar;
        if (n64Var instanceof C12349a) {
            c12349a = (C12349a) n64Var;
            int i = c12349a.f15918f;
            if ((i & Integer.MIN_VALUE) != 0) {
                c12349a.f15918f = i - Integer.MIN_VALUE;
            } else {
                c12349a = new C12349a(n64Var);
            }
        }
        Object obj = c12349a.f15916d;
        Object objM51918f = uq8.m51918f();
        int i2 = c12349a.f15918f;
        if (i2 == 0) {
            wre.m54934b(obj);
            q74 context = c12349a.getContext();
            String strMo26336c = kge.m35689b(bc5.class).mo26336c();
            if (strMo26336c == null) {
                throw new IllegalArgumentException("logger<T> cannot be used on an anonymous object".toString());
            }
            qja qjaVarM52400e = v74.m52400e(context, strMo26336c);
            if (z81Var.m58880a() != w81.SIGV4) {
                throw new b6i(z81Var.m58880a() + " support is not yet implemented for the default signer.", z81Var.m58880a());
            }
            hc2 hc2Var = this.f15910a;
            c12349a.f15913a = this;
            c12349a.f15914b = z81Var;
            c12349a.f15915c = qjaVarM52400e;
            c12349a.f15918f = 1;
            Object objMo30200a = hc2Var.mo30200a(y38Var, z81Var, c12349a);
            if (objMo30200a == objM51918f) {
                return objM51918f;
            }
            bc5Var = this;
            obj = objMo30200a;
            qjaVar = qjaVarM52400e;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            qjaVar = (qja) c12349a.f15915c;
            z81Var = (z81) c12349a.f15914b;
            bc5Var = (bc5) c12349a.f15913a;
            wre.m54934b(obj);
        }
        final gc2 gc2Var = (gc2) obj;
        if (z81Var.m58884e()) {
            qja.C16414b.m45550c(qjaVar, null, new uk7() { // from class: o.tb5
                @Override // p001o.uk7
                public final Object invoke() {
                    return bc5.m18572l(gc2Var);
                }
            }, 1, null);
        }
        final String strMo17054e = bc5Var.f15911b.mo17054e(gc2Var.m28388b(), z81Var);
        qja.C16414b.m45550c(qjaVar, null, new uk7() { // from class: o.ub5
            @Override // p001o.uk7
            public final Object invoke() {
                return bc5.m18573m(strMo17054e);
            }
        }, 1, null);
        final String strMo17050a = bc5Var.f15911b.mo17050a(bc5Var.f15911b.mo17052c(z81Var), strMo17054e);
        qja.C16414b.m45548a(qjaVar, null, new uk7() { // from class: o.vb5
            @Override // p001o.uk7
            public final Object invoke() {
                return bc5.m18574n(strMo17050a);
            }
        }, 1, null);
        return new a91(bc5Var.f15912c.mo33788a(z81Var, gc2Var, strMo17050a), e9g.m24603u(strMo17050a));
    }

    public /* synthetic */ bc5(hc2 hc2Var, zrf zrfVar, pme pmeVar, int i, id5 id5Var) {
        this((i & 1) != 0 ? hc2.f26636a.m30201a() : hc2Var, (i & 2) != 0 ? zrf.f57574a.m59791a() : zrfVar, (i & 4) != 0 ? pme.f40272a.m43898a() : pmeVar);
    }
}
