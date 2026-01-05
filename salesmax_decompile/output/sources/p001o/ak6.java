package p001o;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import p001o.n41;

/* loaded from: classes5.dex */
public abstract class ak6 {

    /* renamed from: o.ak6$a */
    public static abstract class AbstractC12211a {
        /* renamed from: a */
        public final AbstractC12211a m17318a(String str, int i) {
            mo17322e().put(str, String.valueOf(i));
            return this;
        }

        /* renamed from: b */
        public final AbstractC12211a m17319b(String str, long j) {
            mo17322e().put(str, String.valueOf(j));
            return this;
        }

        /* renamed from: c */
        public final AbstractC12211a m17320c(String str, String str2) {
            mo17322e().put(str, str2);
            return this;
        }

        /* renamed from: d */
        public abstract ak6 mo17321d();

        /* renamed from: e */
        public abstract Map mo17322e();

        /* renamed from: f */
        public abstract AbstractC12211a mo17323f(Map map);

        /* renamed from: g */
        public abstract AbstractC12211a mo17324g(Integer num);

        /* renamed from: h */
        public abstract AbstractC12211a mo17325h(d76 d76Var);

        /* renamed from: i */
        public abstract AbstractC12211a mo17326i(long j);

        /* renamed from: j */
        public abstract AbstractC12211a mo17327j(String str);

        /* renamed from: k */
        public abstract AbstractC12211a mo17328k(long j);
    }

    /* renamed from: a */
    public static AbstractC12211a m17306a() {
        return new n41.C15485b().mo17323f(new HashMap());
    }

    /* renamed from: b */
    public final String m17307b(String str) {
        String str2 = (String) mo17308c().get(str);
        return str2 == null ? "" : str2;
    }

    /* renamed from: c */
    public abstract Map mo17308c();

    /* renamed from: d */
    public abstract Integer mo17309d();

    /* renamed from: e */
    public abstract d76 mo17310e();

    /* renamed from: f */
    public abstract long mo17311f();

    /* renamed from: g */
    public final int m17312g(String str) {
        String str2 = (String) mo17308c().get(str);
        if (str2 == null) {
            return 0;
        }
        return Integer.valueOf(str2).intValue();
    }

    /* renamed from: h */
    public final long m17313h(String str) {
        String str2 = (String) mo17308c().get(str);
        if (str2 == null) {
            return 0L;
        }
        return Long.valueOf(str2).longValue();
    }

    /* renamed from: i */
    public final Map m17314i() {
        return Collections.unmodifiableMap(mo17308c());
    }

    /* renamed from: j */
    public abstract String mo17315j();

    /* renamed from: k */
    public abstract long mo17316k();

    /* renamed from: l */
    public AbstractC12211a m17317l() {
        return new n41.C15485b().mo17327j(mo17315j()).mo17324g(mo17309d()).mo17325h(mo17310e()).mo17326i(mo17311f()).mo17328k(mo17316k()).mo17323f(new HashMap(mo17308c()));
    }
}
