package p001o;

import java.util.List;

/* loaded from: classes6.dex */
public interface jta {

    /* renamed from: o.jta$a */
    public static final class C14654a {
        /* renamed from: a */
        public static C14655b m34495a(jta jtaVar) {
            return new C14655b(jtaVar);
        }
    }

    /* renamed from: o.jta$b */
    public static final class C14655b {

        /* renamed from: a */
        public final jta f31069a;

        public C14655b(jta jtaVar) {
            sq8.m48649h(jtaVar, "match");
            this.f31069a = jtaVar;
        }

        /* renamed from: a */
        public final jta m34496a() {
            return this.f31069a;
        }
    }

    /* renamed from: a */
    C14655b mo34492a();

    /* renamed from: b */
    List mo34493b();

    /* renamed from: c */
    ita mo34494c();

    kl8 getRange();

    String getValue();

    jta next();
}
