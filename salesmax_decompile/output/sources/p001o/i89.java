package p001o;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Set;
import p001o.aff;
import p001o.dn5;
import p001o.vv5;
import p001o.xa9;

/* loaded from: classes3.dex */
public final class i89 implements dn5, dn5.InterfaceC12995a, dn5.InterfaceC12996b, uhd {

    /* renamed from: b */
    public static final C14211a f28223b = new C14211a(null);

    /* renamed from: c */
    public static final Set f28224c = nif.m40668i("Infinity", "-Infinity", "NaN");

    /* renamed from: a */
    public final qa9 f28225a;

    /* renamed from: o.i89$a */
    public static final class C14211a {
        public C14211a() {
        }

        public /* synthetic */ C14211a(id5 id5Var) {
            this();
        }
    }

    /* renamed from: o.i89$b */
    public /* synthetic */ class C14212b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f28226a;

        static {
            int[] iArr = new int[vmh.values().length];
            try {
                iArr[vmh.EPOCH_SECONDS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[vmh.ISO_8601.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[vmh.RFC_5322.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f28226a = iArr;
        }
    }

    public i89(byte[] bArr) {
        sq8.m48649h(bArr, "payload");
        this.f28225a = ra9.m46476a(bArr);
    }

    /* renamed from: v */
    public static final double m31719v(String str) {
        sq8.m48649h(str, "it");
        return Double.parseDouble(str);
    }

    /* renamed from: w */
    public static final int m31720w(String str) {
        sq8.m48649h(str, "it");
        Integer numM22638l = d9g.m22638l(str);
        return numM22638l != null ? numM22638l.intValue() : (int) Double.parseDouble(str);
    }

    /* renamed from: x */
    public static final long m31721x(String str) {
        sq8.m48649h(str, "it");
        Long lM22640n = d9g.m22640n(str);
        return lM22640n != null ? lM22640n.longValue() : (long) Double.parseDouble(str);
    }

    /* renamed from: z */
    public static final Object m31722z(String str) {
        sq8.m48649h(str, "it");
        return f9g.m26305O(str, '.', false, 2, null) ? Double.valueOf(Double.parseDouble(str)) : Long.valueOf(Long.parseLong(str));
    }

    /* renamed from: A */
    public final Object m31723A(xk7 xk7Var) {
        xa9 xa9VarNextToken = this.f28225a.nextToken();
        if (xa9VarNextToken instanceof xa9.C18093i) {
            return xk7Var.invoke(((xa9.C18093i) xa9VarNextToken).m55893a());
        }
        if (xa9VarNextToken instanceof xa9.C18094j) {
            xa9.C18094j c18094j = (xa9.C18094j) xa9VarNextToken;
            if (f28224c.contains(c18094j.m55894a())) {
                return xk7Var.invoke(c18094j.m55894a());
            }
        }
        throw new an5(xa9VarNextToken + " cannot be deserialized as type Number");
    }

    @Override // p001o.dn5.InterfaceC12995a, p001o.dn5.InterfaceC12996b
    /* renamed from: a */
    public boolean mo23580a() {
        return !sq8.m48644c(this.f28225a.peek(), xa9.C18092h.f53430a);
    }

    @Override // p001o.uhd
    /* renamed from: b */
    public int mo31724b() {
        return ((Number) m31723A(new xk7() { // from class: o.e89
            @Override // p001o.xk7
            public final Object invoke(Object obj) {
                return Integer.valueOf(i89.m31720w((String) obj));
            }
        })).intValue();
    }

    @Override // p001o.dn5
    /* renamed from: c */
    public dn5.InterfaceC12995a mo23577c(h7f h7fVar) {
        sq8.m48649h(h7fVar, "descriptor");
        xa9 xa9VarNextToken = this.f28225a.nextToken();
        if (xa9VarNextToken.getClass() == xa9.C18085a.class) {
            return this;
        }
        throw new an5("expected " + kge.m35689b(xa9.C18085a.class) + "; found " + kge.m35689b(xa9VarNextToken.getClass()));
    }

    @Override // p001o.dn5.InterfaceC12995a
    /* renamed from: d */
    public boolean mo23581d() {
        xa9 xa9VarPeek = this.f28225a.peek();
        if (!sq8.m48644c(xa9VarPeek, xa9.C18088d.f53426a)) {
            return !sq8.m48644c(xa9VarPeek, xa9.C18089e.f53427a);
        }
        xa9 xa9VarNextToken = this.f28225a.nextToken();
        if (xa9VarNextToken.getClass() == xa9.C18088d.class) {
            return false;
        }
        throw new an5("expected " + kge.m35689b(xa9.C18088d.class) + "; found " + kge.m35689b(xa9VarNextToken.getClass()));
    }

    @Override // p001o.uhd
    /* renamed from: e */
    public Void mo31725e() {
        xa9 xa9VarNextToken = this.f28225a.nextToken();
        if (xa9VarNextToken.getClass() == xa9.C18092h.class) {
            return null;
        }
        throw new an5("expected " + kge.m35689b(xa9.C18092h.class) + "; found " + kge.m35689b(xa9VarNextToken.getClass()));
    }

    @Override // p001o.dn5.InterfaceC12996b
    /* renamed from: f */
    public boolean mo23582f() {
        xa9 xa9VarPeek = this.f28225a.peek();
        if (!sq8.m48644c(xa9VarPeek, xa9.C18090f.f53428a)) {
            return (sq8.m48644c(xa9VarPeek, xa9.C18092h.f53430a) || sq8.m48644c(xa9VarPeek, xa9.C18089e.f53427a)) ? false : true;
        }
        xa9 xa9VarNextToken = this.f28225a.nextToken();
        if (xa9VarNextToken.getClass() == xa9.C18090f.class) {
            return false;
        }
        throw new an5("expected " + kge.m35689b(xa9.C18090f.class) + "; found " + kge.m35689b(xa9VarNextToken.getClass()));
    }

    @Override // p001o.dn5
    /* renamed from: g */
    public dn5.InterfaceC12996b mo23578g(h7f h7fVar) {
        sq8.m48649h(h7fVar, "descriptor");
        xa9 xa9VarNextToken = this.f28225a.nextToken();
        if (xa9VarNextToken.getClass() == xa9.C18086b.class) {
            return this;
        }
        throw new an5("expected " + kge.m35689b(xa9.C18086b.class) + "; found " + kge.m35689b(xa9VarNextToken.getClass()));
    }

    @Override // p001o.dn5
    /* renamed from: h */
    public dn5.InterfaceC12997c mo23579h(t7f t7fVar) {
        sq8.m48649h(t7fVar, "descriptor");
        xa9 xa9VarPeek = this.f28225a.peek();
        if (!sq8.m48644c(xa9VarPeek, xa9.C18086b.f53424a)) {
            if (sq8.m48644c(xa9VarPeek, xa9.C18092h.f53430a)) {
                return new x99(this);
            }
            throw new an5("Unexpected token type " + this.f28225a.peek());
        }
        xa9 xa9VarNextToken = this.f28225a.nextToken();
        if (xa9VarNextToken.getClass() == xa9.C18086b.class) {
            return new y89(this.f28225a, t7fVar, this);
        }
        throw new an5("expected " + kge.m35689b(xa9.C18086b.class) + "; found " + kge.m35689b(xa9VarNextToken.getClass()));
    }

    @Override // p001o.uhd
    /* renamed from: i */
    public String mo31726i() {
        xa9 xa9VarNextToken = this.f28225a.nextToken();
        if (xa9VarNextToken instanceof xa9.C18094j) {
            return ((xa9.C18094j) xa9VarNextToken).m55894a();
        }
        if (xa9VarNextToken instanceof xa9.C18093i) {
            return ((xa9.C18093i) xa9VarNextToken).m55893a();
        }
        if (xa9VarNextToken instanceof xa9.C18087c) {
            return String.valueOf(((xa9.C18087c) xa9VarNextToken).m55891a());
        }
        throw new an5(xa9VarNextToken + " cannot be deserialized as type String");
    }

    @Override // p001o.uhd
    /* renamed from: j */
    public vv5 mo31727j() {
        vv5 vv5VarM31732t = m31732t();
        if (vv5VarM31732t != null) {
            return vv5VarM31732t;
        }
        throw new IllegalStateException("expected non-null document field".toString());
    }

    @Override // p001o.uhd
    /* renamed from: k */
    public float mo31728k() {
        return (float) m31733u();
    }

    @Override // p001o.dn5.InterfaceC12996b
    public String key() {
        xa9 xa9VarNextToken = this.f28225a.nextToken();
        if (xa9VarNextToken.getClass() == xa9.C18091g.class) {
            return ((xa9.C18091g) xa9VarNextToken).m55892a();
        }
        throw new an5("expected " + kge.m35689b(xa9.C18091g.class) + "; found " + kge.m35689b(xa9VarNextToken.getClass()));
    }

    @Override // p001o.uhd
    /* renamed from: l */
    public gk8 mo31729l(vmh vmhVar) {
        sq8.m48649h(vmhVar, "format");
        int i = C14212b.f28226a[vmhVar.ordinal()];
        if (i == 1) {
            return gk8.f25374b.m28959b(mo31726i());
        }
        if (i == 2) {
            return gk8.f25374b.m28960d(mo31726i());
        }
        if (i == 3) {
            return gk8.f25374b.m28961e(mo31726i());
        }
        throw new an5("unknown timestamp format: " + vmhVar);
    }

    @Override // p001o.uhd
    /* renamed from: n */
    public boolean mo31730n() {
        xa9 xa9VarNextToken = this.f28225a.nextToken();
        if (xa9VarNextToken.getClass() == xa9.C18087c.class) {
            return ((xa9.C18087c) xa9VarNextToken).m55891a();
        }
        throw new an5("expected " + kge.m35689b(xa9.C18087c.class) + "; found " + kge.m35689b(xa9VarNextToken.getClass()));
    }

    @Override // p001o.uhd
    /* renamed from: o */
    public long mo31731o() {
        return ((Number) m31723A(new xk7() { // from class: o.h89
            @Override // p001o.xk7
            public final Object invoke(Object obj) {
                return Long.valueOf(i89.m31721x((String) obj));
            }
        })).longValue();
    }

    /* renamed from: t */
    public final vv5 m31732t() {
        xa9 xa9VarPeek = this.f28225a.peek();
        if (xa9VarPeek instanceof xa9.C18093i) {
            return aw5.m17886a(m31734y());
        }
        if (xa9VarPeek instanceof xa9.C18094j) {
            return aw5.m17887b(mo31726i());
        }
        if (xa9VarPeek instanceof xa9.C18087c) {
            return aw5.m17888c(mo31730n());
        }
        if (sq8.m48644c(xa9VarPeek, xa9.C18092h.f53430a)) {
            this.f28225a.nextToken();
            return null;
        }
        if (sq8.m48644c(xa9VarPeek, xa9.C18085a.f53423a)) {
            dn5.InterfaceC12995a interfaceC12995aMo23577c = mo23577c(new h7f(aff.C12156c.f14615a, 0, null, 6, null));
            ArrayList arrayList = new ArrayList();
            while (interfaceC12995aMo23577c.mo23581d()) {
                arrayList.add(m31732t());
            }
            return new vv5.C17676b(arrayList);
        }
        if (sq8.m48644c(xa9VarPeek, xa9.C18086b.f53424a)) {
            dn5.InterfaceC12996b interfaceC12996bMo23578g = mo23578g(new h7f(aff.C12156c.f14615a, 0, null, 6, null));
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            while (interfaceC12996bMo23578g.mo23582f()) {
                linkedHashMap.put(interfaceC12996bMo23578g.key(), m31732t());
            }
            return new vv5.C17677c(linkedHashMap);
        }
        if (sq8.m48644c(xa9VarPeek, xa9.C18088d.f53426a) || sq8.m48644c(xa9VarPeek, xa9.C18090f.f53428a) || sq8.m48644c(xa9VarPeek, xa9.C18089e.f53427a)) {
            throw new an5("encountered unexpected json token \"" + xa9VarPeek + "\" while deserializing document");
        }
        if (!(xa9VarPeek instanceof xa9.C18091g)) {
            throw new szb();
        }
        throw new an5("encountered unexpected json field declaration \"" + ((xa9.C18091g) xa9VarPeek).m55892a() + "\" while deserializing document");
    }

    /* renamed from: u */
    public double m31733u() {
        return ((Number) m31723A(new xk7() { // from class: o.f89
            @Override // p001o.xk7
            public final Object invoke(Object obj) {
                return Double.valueOf(i89.m31719v((String) obj));
            }
        })).doubleValue();
    }

    /* renamed from: y */
    public final Number m31734y() {
        return (Number) m31723A(new xk7() { // from class: o.g89
            @Override // p001o.xk7
            public final Object invoke(Object obj) {
                return (Number) i89.m31722z((String) obj);
            }
        });
    }
}
