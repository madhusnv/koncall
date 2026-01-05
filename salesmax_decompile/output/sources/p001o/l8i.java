package p001o;

import com.amplifyframework.core.model.ModelIdentifier;
import com.google.android.gms.common.internal.ImagesContract;
import p001o.c5e;
import p001o.kei;
import p001o.l8i;
import p001o.p8i;
import p001o.s8i;
import p001o.y08;

/* loaded from: classes3.dex */
public final class l8i {

    /* renamed from: k */
    public static final C15037b f33466k = new C15037b(null);

    /* renamed from: a */
    public final a6f f33467a;

    /* renamed from: b */
    public final y08 f33468b;

    /* renamed from: c */
    public final int f33469c;

    /* renamed from: d */
    public final s8i f33470d;

    /* renamed from: e */
    public final c5e f33471e;

    /* renamed from: f */
    public final kei f33472f;

    /* renamed from: g */
    public final y66 f33473g;

    /* renamed from: h */
    public final String f33474h;

    /* renamed from: i */
    public final String f33475i;

    /* renamed from: j */
    public final String f33476j;

    /* renamed from: o.l8i$b */
    public static final class C15037b {
        public C15037b() {
        }

        public /* synthetic */ C15037b(id5 id5Var) {
            this();
        }

        /* renamed from: m */
        public static /* synthetic */ l8i m36787m(C15037b c15037b, String str, p8i p8iVar, int i, Object obj) {
            if ((i & 2) != 0) {
                p8iVar = p8i.f39606b.m43192a();
            }
            return c15037b.m36798l(str, p8iVar);
        }

        /* renamed from: n */
        public static final y3i m36788n(C15036a c15036a, String str) {
            sq8.m48649h(str, "it");
            c15036a.m36775p(a6f.f14208c.m16526d(str));
            return y3i.f54824a;
        }

        /* renamed from: o */
        public static final y3i m36789o(t4f t4fVar, final C15036a c15036a, final p8i p8iVar) {
            t4fVar.m49300i(new String[0], new xk7() { // from class: o.i8i
                @Override // p001o.xk7
                public final Object invoke(Object obj) {
                    return l8i.C15037b.m36790p(c15036a, p8iVar, (String) obj);
                }
            });
            return y3i.f54824a;
        }

        /* renamed from: p */
        public static final y3i m36790p(C15036a c15036a, p8i p8iVar, String str) {
            sq8.m48649h(str, "it");
            c15036a.m36770k(str, p8iVar);
            return y3i.f54824a;
        }

        /* renamed from: q */
        public static final y3i m36791q(final C15036a c15036a, String str) {
            sq8.m48649h(str, "authority");
            t4f t4fVar = new t4f(str);
            t4fVar.m49295d(new String[]{"@"}, new xk7() { // from class: o.j8i
                @Override // p001o.xk7
                public final Object invoke(Object obj) {
                    return l8i.C15037b.m36792r(c15036a, (String) obj);
                }
            });
            t4fVar.m49300i(new String[0], new xk7() { // from class: o.k8i
                @Override // p001o.xk7
                public final Object invoke(Object obj) {
                    return l8i.C15037b.m36793s(c15036a, (String) obj);
                }
            });
            return y3i.f54824a;
        }

        /* renamed from: r */
        public static final y3i m36792r(C15036a c15036a, String str) {
            sq8.m48649h(str, "it");
            c15036a.m36769j().m35559e(str);
            return y3i.f54824a;
        }

        /* renamed from: s */
        public static final y3i m36793s(C15036a c15036a, String str) {
            sq8.m48649h(str, "hostport");
            hwc hwcVarM45019b = q8i.m45019b(str);
            y08 y08Var = (y08) hwcVarM45019b.m31227a();
            Integer num = (Integer) hwcVarM45019b.m31228b();
            c15036a.m36773n(y08Var);
            if (num != null) {
                c15036a.m36774o(Integer.valueOf(num.intValue()));
            }
            return y3i.f54824a;
        }

        /* renamed from: t */
        public static final y3i m36794t(t4f t4fVar, final C15036a c15036a, final p8i p8iVar) {
            t4fVar.m49300i(new String[]{"?", ModelIdentifier.Helper.PRIMARY_KEY_DELIMITER}, new xk7() { // from class: o.g8i
                @Override // p001o.xk7
                public final Object invoke(Object obj) {
                    return l8i.C15037b.m36795u(c15036a, p8iVar, (String) obj);
                }
            });
            return y3i.f54824a;
        }

        /* renamed from: u */
        public static final y3i m36795u(C15036a c15036a, p8i p8iVar, String str) {
            sq8.m48649h(str, "it");
            c15036a.m36767h().m48013j(str, p8iVar);
            return y3i.f54824a;
        }

        /* renamed from: v */
        public static final y3i m36796v(t4f t4fVar, final C15036a c15036a, final p8i p8iVar) {
            t4fVar.m49300i(new String[]{ModelIdentifier.Helper.PRIMARY_KEY_DELIMITER}, new xk7() { // from class: o.h8i
                @Override // p001o.xk7
                public final Object invoke(Object obj) {
                    return l8i.C15037b.m36797w(c15036a, p8iVar, (String) obj);
                }
            });
            return y3i.f54824a;
        }

        /* renamed from: w */
        public static final y3i m36797w(C15036a c15036a, p8i p8iVar, String str) {
            sq8.m48649h(str, "it");
            c15036a.m36766g().m20287w(str, p8iVar);
            return y3i.f54824a;
        }

        /* renamed from: l */
        public final l8i m36798l(String str, final p8i p8iVar) {
            sq8.m48649h(str, "value");
            sq8.m48649h(p8iVar, "encoding");
            try {
                C15037b c15037b = l8i.f33466k;
                final C15036a c15036a = new C15036a();
                final t4f t4fVar = new t4f(str);
                t4fVar.m49298g(new String[]{"://"}, new xk7() { // from class: o.b8i
                    @Override // p001o.xk7
                    public final Object invoke(Object obj) {
                        return l8i.C15037b.m36788n(c15036a, (String) obj);
                    }
                });
                t4fVar.m49300i(new String[]{"/", "?", ModelIdentifier.Helper.PRIMARY_KEY_DELIMITER}, new xk7() { // from class: o.c8i
                    @Override // p001o.xk7
                    public final Object invoke(Object obj) {
                        return l8i.C15037b.m36791q(c15036a, (String) obj);
                    }
                });
                t4fVar.m49293b("/", new uk7() { // from class: o.d8i
                    @Override // p001o.uk7
                    public final Object invoke() {
                        return l8i.C15037b.m36794t(t4fVar, c15036a, p8iVar);
                    }
                });
                t4fVar.m49293b("?", new uk7() { // from class: o.e8i
                    @Override // p001o.uk7
                    public final Object invoke() {
                        return l8i.C15037b.m36796v(t4fVar, c15036a, p8iVar);
                    }
                });
                t4fVar.m49294c(ModelIdentifier.Helper.PRIMARY_KEY_DELIMITER, new uk7() { // from class: o.f8i
                    @Override // p001o.uk7
                    public final Object invoke() {
                        return l8i.C15037b.m36789o(t4fVar, c15036a, p8iVar);
                    }
                });
                return c15036a.m36761b();
            } catch (IllegalArgumentException e) {
                throw new IllegalArgumentException("Cannot parse \"" + str + "\" as a URL", e);
            }
        }

        /* renamed from: x */
        public final hwc m36799x(a6f a6fVar, y08 y08Var, int i, s8i s8iVar, c5e c5eVar, kei keiVar, y66 y66Var) {
            StringBuilder sb = new StringBuilder();
            sb.append(a6fVar.m16522e());
            sb.append("://");
            sb.append(keiVar);
            sb.append(a18.m16326c(y08Var));
            if (i != a6fVar.m16521d()) {
                sb.append(":");
                sb.append(i);
            }
            int length = sb.length();
            sb.append(s8iVar);
            sb.append(c5eVar);
            if (y66Var != null) {
                sb.append('#');
                sb.append(y66Var.m57311c());
            }
            String string = sb.toString();
            sq8.m48648g(string, "toString(...)");
            String strSubstring = string.substring(length);
            sq8.m48648g(strSubstring, "substring(...)");
            return vyh.m53620a(string, bih.m19215a(strSubstring, "/"));
        }
    }

    public /* synthetic */ l8i(a6f a6fVar, y08 y08Var, int i, s8i s8iVar, c5e c5eVar, kei keiVar, y66 y66Var, id5 id5Var) {
        this(a6fVar, y08Var, i, s8iVar, c5eVar, keiVar, y66Var);
    }

    /* renamed from: a */
    public final y66 m36754a() {
        return this.f33473g;
    }

    /* renamed from: b */
    public final y08 m36755b() {
        return this.f33468b;
    }

    /* renamed from: c */
    public final c5e m36756c() {
        return this.f33471e;
    }

    /* renamed from: d */
    public final s8i m36757d() {
        return this.f33470d;
    }

    /* renamed from: e */
    public final int m36758e() {
        return this.f33469c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || l8i.class != obj.getClass()) {
            return false;
        }
        l8i l8iVar = (l8i) obj;
        return sq8.m48644c(this.f33467a, l8iVar.f33467a) && sq8.m48644c(this.f33468b, l8iVar.f33468b) && this.f33469c == l8iVar.f33469c && sq8.m48644c(this.f33470d, l8iVar.f33470d) && sq8.m48644c(this.f33471e, l8iVar.f33471e) && sq8.m48644c(this.f33472f, l8iVar.f33472f) && sq8.m48644c(this.f33473g, l8iVar.f33473g);
    }

    /* renamed from: f */
    public final a6f m36759f() {
        return this.f33467a;
    }

    /* renamed from: g */
    public final kei m36760g() {
        return this.f33472f;
    }

    public int hashCode() {
        int iHashCode = ((((((((((this.f33467a.hashCode() * 31) + this.f33468b.hashCode()) * 31) + this.f33469c) * 31) + this.f33470d.hashCode()) * 31) + this.f33471e.hashCode()) * 31) + this.f33472f.hashCode()) * 31;
        y66 y66Var = this.f33473g;
        return iHashCode + (y66Var != null ? y66Var.hashCode() : 0);
    }

    public String toString() {
        return this.f33474h;
    }

    public l8i(a6f a6fVar, y08 y08Var, int i, s8i s8iVar, c5e c5eVar, kei keiVar, y66 y66Var) {
        this.f33467a = a6fVar;
        this.f33468b = y08Var;
        this.f33469c = i;
        this.f33470d = s8iVar;
        this.f33471e = c5eVar;
        this.f33472f = keiVar;
        this.f33473g = y66Var;
        StringBuilder sb = new StringBuilder();
        sb.append(y08Var);
        if (i != a6fVar.m16521d()) {
            sb.append(':');
            sb.append(i);
        }
        String string = sb.toString();
        sq8.m48648g(string, "toString(...)");
        this.f33475i = string;
        boolean z = false;
        if (1 <= i && i < 65536) {
            z = true;
        }
        if (z) {
            hwc hwcVarM36799x = f33466k.m36799x(a6fVar, y08Var, i, s8iVar, c5eVar, keiVar, y66Var);
            this.f33474h = (String) hwcVarM36799x.m31229c();
            this.f33476j = (String) hwcVarM36799x.m31230d();
        } else {
            throw new IllegalArgumentException(("Given port " + i + " is not in required range [1, 65535]").toString());
        }
    }

    /* renamed from: o.l8i$a */
    public static final class C15036a implements qb2 {

        /* renamed from: a */
        public a6f f33477a;

        /* renamed from: b */
        public y08 f33478b;

        /* renamed from: c */
        public Integer f33479c;

        /* renamed from: d */
        public s8i.C16783a f33480d;

        /* renamed from: e */
        public final c5e.C12567a f33481e;

        /* renamed from: f */
        public final kei.C14821a f33482f;

        /* renamed from: g */
        public y66 f33483g;

        public C15036a(l8i l8iVar) {
            kei keiVarM36760g;
            kei.C14821a c14821aM35554c;
            c5e c5eVarM36756c;
            c5e.C12567a c12567aM20260o;
            s8i s8iVarM36757d;
            s8i.C16783a c16783aM48003d;
            y08 y08VarM36755b;
            a6f a6fVarM36759f;
            this.f33477a = (l8iVar == null || (a6fVarM36759f = l8iVar.m36759f()) == null) ? a6f.f14208c.m16525c() : a6fVarM36759f;
            this.f33478b = (l8iVar == null || (y08VarM36755b = l8iVar.m36755b()) == null) ? new y08.C18291b("") : y08VarM36755b;
            this.f33479c = l8iVar != null ? Integer.valueOf(l8iVar.m36758e()) : null;
            this.f33480d = (l8iVar == null || (s8iVarM36757d = l8iVar.m36757d()) == null || (c16783aM48003d = s8iVarM36757d.m48003d()) == null) ? new s8i.C16783a() : c16783aM48003d;
            this.f33481e = (l8iVar == null || (c5eVarM36756c = l8iVar.m36756c()) == null || (c12567aM20260o = c5eVarM36756c.m20260o()) == null) ? new c5e.C12567a() : c12567aM20260o;
            this.f33482f = (l8iVar == null || (keiVarM36760g = l8iVar.m36760g()) == null || (c14821aM35554c = keiVarM36760g.m35554c()) == null) ? new kei.C14821a() : c14821aM35554c;
            this.f33483g = l8iVar != null ? l8iVar.m36754a() : null;
        }

        /* renamed from: b */
        public final l8i m36761b() {
            a6f a6fVar = this.f33477a;
            y08 y08Var = this.f33478b;
            Integer num = this.f33479c;
            return new l8i(a6fVar, y08Var, num != null ? num.intValue() : a6fVar.m16521d(), this.f33480d.m48004a(), this.f33481e.m20270d(), this.f33482f.m35555a(), this.f33483g, null);
        }

        /* renamed from: c */
        public final void m36762c(l8i l8iVar) {
            sq8.m48649h(l8iVar, ImagesContract.URL);
            this.f33477a = l8iVar.m36759f();
            this.f33478b = l8iVar.m36755b();
            this.f33479c = Integer.valueOf(l8iVar.m36758e());
            this.f33480d.m48006c(l8iVar.m36757d());
            this.f33481e.m20274h(l8iVar.m36756c());
            this.f33482f.m35557c(l8iVar.m36760g());
            this.f33483g = l8iVar.m36754a();
        }

        @Override // p001o.qb2
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public C15036a mo26958a() {
            C15036a c15036a = new C15036a();
            c15036a.f33477a = this.f33477a;
            c15036a.f33478b = this.f33478b;
            c15036a.f33479c = this.f33479c;
            c15036a.f33480d.m48005b(this.f33480d);
            c15036a.f33481e.m20273g(this.f33481e);
            c15036a.f33482f.m35556b(this.f33482f);
            c15036a.f33483g = this.f33483g;
            return c15036a;
        }

        /* renamed from: e */
        public final y08 m36764e() {
            return this.f33478b;
        }

        /* renamed from: f */
        public final String m36765f() {
            StringBuilder sb = new StringBuilder();
            sb.append(this.f33478b);
            Integer num = this.f33479c;
            if (num != null) {
                int iM16521d = this.f33477a.m16521d();
                if (num == null || num.intValue() != iM16521d) {
                    sb.append(':');
                    sb.append(this.f33479c);
                }
            }
            String string = sb.toString();
            sq8.m48648g(string, "toString(...)");
            return string;
        }

        /* renamed from: g */
        public final c5e.C12567a m36766g() {
            return this.f33481e;
        }

        /* renamed from: h */
        public final s8i.C16783a m36767h() {
            return this.f33480d;
        }

        /* renamed from: i */
        public final String m36768i() {
            StringBuilder sb = new StringBuilder();
            sb.append(this.f33480d.m48008e());
            sb.append(this.f33481e.m20282r());
            y66 y66Var = this.f33483g;
            if (y66Var != null) {
                sb.append('#');
                sb.append(y66Var.m57311c());
            }
            String string = sb.toString();
            sq8.m48648g(string, "toString(...)");
            return bih.m19215a(string, "/");
        }

        /* renamed from: j */
        public final kei.C14821a m36769j() {
            return this.f33482f;
        }

        /* renamed from: k */
        public final void m36770k(String str, p8i p8iVar) {
            sq8.m48649h(str, "value");
            sq8.m48649h(p8iVar, "encoding");
            if (p8iVar.m43191b(p8i.C16027c.f39610e)) {
                m36772m(str);
            } else {
                m36771l(str);
            }
        }

        /* renamed from: l */
        public final void m36771l(String str) {
            this.f33483g = str != null ? e3d.f20909h.m24247d().mo24242b(str) : null;
        }

        /* renamed from: m */
        public final void m36772m(String str) {
            this.f33483g = str != null ? e3d.f20909h.m24247d().mo24243c(str) : null;
        }

        /* renamed from: n */
        public final void m36773n(y08 y08Var) {
            sq8.m48649h(y08Var, "<set-?>");
            this.f33478b = y08Var;
        }

        /* renamed from: o */
        public final void m36774o(Integer num) {
            this.f33479c = num;
        }

        /* renamed from: p */
        public final void m36775p(a6f a6fVar) {
            sq8.m48649h(a6fVar, "<set-?>");
            this.f33477a = a6fVar;
        }

        public C15036a() {
            this(null);
        }
    }
}
