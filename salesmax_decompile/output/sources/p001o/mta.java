package p001o;

import java.util.Iterator;
import java.util.List;
import java.util.regex.MatchResult;
import java.util.regex.Matcher;
import p001o.jta;

/* loaded from: classes6.dex */
public final class mta implements jta {

    /* renamed from: a */
    public final Matcher f35954a;

    /* renamed from: b */
    public final CharSequence f35955b;

    /* renamed from: c */
    public final ita f35956c;

    /* renamed from: d */
    public List f35957d;

    /* renamed from: o.mta$a */
    public static final class C15428a extends e8 {
        public C15428a() {
        }

        @Override // p001o.b7, java.util.Collection, java.util.Set
        public final /* bridge */ boolean contains(Object obj) {
            if (obj instanceof String) {
                return m39658e((String) obj);
            }
            return false;
        }

        @Override // p001o.b7
        /* renamed from: d */
        public int mo18169d() {
            return mta.this.m39657e().groupCount() + 1;
        }

        /* renamed from: e */
        public /* bridge */ boolean m39658e(String str) {
            return super.contains(str);
        }

        @Override // p001o.e8, java.util.List
        public final /* bridge */ int indexOf(Object obj) {
            if (obj instanceof String) {
                return m39660o((String) obj);
            }
            return -1;
        }

        @Override // p001o.e8, java.util.List
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public String get(int i) {
            String strGroup = mta.this.m39657e().group(i);
            return strGroup == null ? "" : strGroup;
        }

        @Override // p001o.e8, java.util.List
        public final /* bridge */ int lastIndexOf(Object obj) {
            if (obj instanceof String) {
                return m39661p((String) obj);
            }
            return -1;
        }

        /* renamed from: o */
        public /* bridge */ int m39660o(String str) {
            return super.indexOf(str);
        }

        /* renamed from: p */
        public /* bridge */ int m39661p(String str) {
            return super.lastIndexOf(str);
        }
    }

    /* renamed from: o.mta$b */
    public static final class C15429b extends b7 implements ita {

        /* renamed from: o.mta$b$a */
        public static final class a extends kf9 implements xk7 {
            public a() {
                super(1);
            }

            /* renamed from: a */
            public final hta m39663a(int i) {
                return C15429b.this.get(i);
            }

            @Override // p001o.xk7
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return m39663a(((Number) obj).intValue());
            }
        }

        public C15429b() {
        }

        @Override // p001o.b7, java.util.Collection, java.util.Set
        public final /* bridge */ boolean contains(Object obj) {
            if (obj == null ? true : obj instanceof hta) {
                return m39662e((hta) obj);
            }
            return false;
        }

        @Override // p001o.b7
        /* renamed from: d */
        public int mo18169d() {
            return mta.this.m39657e().groupCount() + 1;
        }

        /* renamed from: e */
        public /* bridge */ boolean m39662e(hta htaVar) {
            return super.contains(htaVar);
        }

        @Override // p001o.ita
        public hta get(int i) {
            kl8 kl8VarM46740h = rge.m46740h(mta.this.m39657e(), i);
            if (kl8VarM46740h.getStart().intValue() < 0) {
                return null;
            }
            String strGroup = mta.this.m39657e().group(i);
            sq8.m48648g(strGroup, "group(...)");
            return new hta(strGroup, kl8VarM46740h);
        }

        @Override // p001o.b7, java.util.Collection
        public boolean isEmpty() {
            return false;
        }

        @Override // java.util.Collection, java.lang.Iterable
        public Iterator iterator() {
            return qef.m45319v(kh3.m35706V(ch3.m21247l(this)), new a()).iterator();
        }
    }

    public mta(Matcher matcher, CharSequence charSequence) {
        sq8.m48649h(matcher, "matcher");
        sq8.m48649h(charSequence, "input");
        this.f35954a = matcher;
        this.f35955b = charSequence;
        this.f35956c = new C15429b();
    }

    @Override // p001o.jta
    /* renamed from: a */
    public jta.C14655b mo34492a() {
        return jta.C14654a.m34495a(this);
    }

    @Override // p001o.jta
    /* renamed from: b */
    public List mo34493b() {
        if (this.f35957d == null) {
            this.f35957d = new C15428a();
        }
        List list = this.f35957d;
        sq8.m48646e(list);
        return list;
    }

    @Override // p001o.jta
    /* renamed from: c */
    public ita mo34494c() {
        return this.f35956c;
    }

    /* renamed from: e */
    public final MatchResult m39657e() {
        return this.f35954a;
    }

    @Override // p001o.jta
    public kl8 getRange() {
        return rge.m46739g(m39657e());
    }

    @Override // p001o.jta
    public String getValue() {
        String strGroup = m39657e().group();
        sq8.m48648g(strGroup, "group(...)");
        return strGroup;
    }

    @Override // p001o.jta
    public jta next() {
        int iEnd = m39657e().end() + (m39657e().end() == m39657e().start() ? 1 : 0);
        if (iEnd > this.f35955b.length()) {
            return null;
        }
        Matcher matcher = this.f35954a.pattern().matcher(this.f35955b);
        sq8.m48648g(matcher, "matcher(...)");
        return rge.m46737e(matcher, iEnd, this.f35955b);
    }
}
