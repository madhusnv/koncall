package p001o;

import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import p001o.cmb;
import p001o.hha;

/* loaded from: classes3.dex */
public final class vr1 {

    /* renamed from: q */
    public static final hdg f50761q = ldg.m36987b(new C17657a());

    /* renamed from: r */
    public static final es1 f50762r = new es1(0, 0, 0, 0, 0, 0);

    /* renamed from: s */
    public static final hdg f50763s = new C17658b();

    /* renamed from: t */
    public static final rlh f50764t = new C17659c();

    /* renamed from: f */
    public f7j f50770f;

    /* renamed from: g */
    public hha.EnumC13965u f50771g;

    /* renamed from: h */
    public hha.EnumC13965u f50772h;

    /* renamed from: l */
    public ej6 f50776l;

    /* renamed from: m */
    public ej6 f50777m;

    /* renamed from: n */
    public nie f50778n;

    /* renamed from: o */
    public rlh f50779o;

    /* renamed from: a */
    public boolean f50765a = true;

    /* renamed from: b */
    public int f50766b = -1;

    /* renamed from: c */
    public int f50767c = -1;

    /* renamed from: d */
    public long f50768d = -1;

    /* renamed from: e */
    public long f50769e = -1;

    /* renamed from: i */
    public long f50773i = -1;

    /* renamed from: j */
    public long f50774j = -1;

    /* renamed from: k */
    public long f50775k = -1;

    /* renamed from: p */
    public hdg f50780p = f50761q;

    /* renamed from: o.vr1$a */
    public class C17657a implements z6 {
        @Override // p001o.z6
        /* renamed from: a */
        public void mo53329a(int i) {
        }

        @Override // p001o.z6
        /* renamed from: b */
        public void mo53330b(int i) {
        }

        @Override // p001o.z6
        /* renamed from: c */
        public void mo53331c() {
        }

        @Override // p001o.z6
        /* renamed from: d */
        public void mo53332d(long j) {
        }

        @Override // p001o.z6
        /* renamed from: e */
        public void mo53333e(long j) {
        }
    }

    /* renamed from: o.vr1$b */
    public class C17658b implements hdg {
        @Override // p001o.hdg
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public z6 get() {
            return new y6();
        }
    }

    /* renamed from: o.vr1$c */
    public class C17659c extends rlh {
        @Override // p001o.rlh
        /* renamed from: a */
        public long mo46948a() {
            return 0L;
        }
    }

    /* renamed from: o.vr1$d */
    public static final class C17660d {

        /* renamed from: a */
        public static final Logger f50781a = Logger.getLogger(vr1.class.getName());
    }

    /* renamed from: o.vr1$e */
    public enum EnumC17661e implements nie {
        INSTANCE;

        @Override // p001o.nie
        public void onRemoval(oie oieVar) {
        }
    }

    /* renamed from: o.vr1$f */
    public enum EnumC17662f implements f7j {
        INSTANCE;

        @Override // p001o.f7j
        public int weigh(Object obj, Object obj2) {
            return 1;
        }
    }

    /* renamed from: y */
    public static vr1 m53298y() {
        return new vr1();
    }

    /* renamed from: A */
    public vr1 m53299A(hha.EnumC13965u enumC13965u) {
        hha.EnumC13965u enumC13965u2 = this.f50771g;
        dgd.m23072y(enumC13965u2 == null, "Key strength was already set to %s", enumC13965u2);
        this.f50771g = (hha.EnumC13965u) dgd.m23062o(enumC13965u);
        return this;
    }

    /* renamed from: B */
    public vr1 m53300B(hha.EnumC13965u enumC13965u) {
        hha.EnumC13965u enumC13965u2 = this.f50772h;
        dgd.m23072y(enumC13965u2 == null, "Value strength was already set to %s", enumC13965u2);
        this.f50772h = (hha.EnumC13965u) dgd.m23062o(enumC13965u);
        return this;
    }

    /* renamed from: C */
    public vr1 m53301C(rlh rlhVar) {
        dgd.m23068u(this.f50779o == null);
        this.f50779o = (rlh) dgd.m23062o(rlhVar);
        return this;
    }

    /* renamed from: D */
    public vr1 m53302D(ej6 ej6Var) {
        ej6 ej6Var2 = this.f50777m;
        dgd.m23072y(ej6Var2 == null, "value equivalence was already set to %s", ej6Var2);
        this.f50777m = (ej6) dgd.m23062o(ej6Var);
        return this;
    }

    /* renamed from: E */
    public vr1 m53303E(f7j f7jVar) {
        dgd.m23068u(this.f50770f == null);
        if (this.f50765a) {
            long j = this.f50768d;
            dgd.m23071x(j == -1, "weigher can not be combined with maximum size (%s provided)", j);
        }
        this.f50770f = (f7j) dgd.m23062o(f7jVar);
        return this;
    }

    /* renamed from: a */
    public rr1 m53304a() {
        m53307d();
        m53306c();
        return new hha.C13946b(this);
    }

    /* renamed from: b */
    public cha m53305b(cs1 cs1Var) {
        m53307d();
        return new hha.C13960p(this, cs1Var);
    }

    /* renamed from: c */
    public final void m53306c() {
        dgd.m23069v(this.f50775k == -1, "refreshAfterWrite requires a LoadingCache");
    }

    /* renamed from: d */
    public final void m53307d() {
        if (this.f50770f == null) {
            dgd.m23069v(this.f50769e == -1, "maximumWeight requires weigher");
        } else if (this.f50765a) {
            dgd.m23069v(this.f50769e != -1, "weigher requires maximumWeight");
        } else if (this.f50769e == -1) {
            C17660d.f50781a.log(Level.WARNING, "ignoring weigher specified without maximumWeight");
        }
    }

    /* renamed from: e */
    public vr1 m53308e(int i) {
        int i2 = this.f50767c;
        dgd.m23070w(i2 == -1, "concurrency level was already set to %s", i2);
        dgd.m23051d(i > 0);
        this.f50767c = i;
        return this;
    }

    /* renamed from: f */
    public vr1 m53309f(long j, TimeUnit timeUnit) {
        long j2 = this.f50774j;
        dgd.m23071x(j2 == -1, "expireAfterAccess was already set to %s ns", j2);
        dgd.m23057j(j >= 0, "duration cannot be negative: %s %s", j, timeUnit);
        this.f50774j = timeUnit.toNanos(j);
        return this;
    }

    /* renamed from: g */
    public vr1 m53310g(long j, TimeUnit timeUnit) {
        long j2 = this.f50773i;
        dgd.m23071x(j2 == -1, "expireAfterWrite was already set to %s ns", j2);
        dgd.m23057j(j >= 0, "duration cannot be negative: %s %s", j, timeUnit);
        this.f50773i = timeUnit.toNanos(j);
        return this;
    }

    /* renamed from: h */
    public int m53311h() {
        int i = this.f50767c;
        if (i == -1) {
            return 4;
        }
        return i;
    }

    /* renamed from: i */
    public long m53312i() {
        long j = this.f50774j;
        if (j == -1) {
            return 0L;
        }
        return j;
    }

    /* renamed from: j */
    public long m53313j() {
        long j = this.f50773i;
        if (j == -1) {
            return 0L;
        }
        return j;
    }

    /* renamed from: k */
    public int m53314k() {
        int i = this.f50766b;
        if (i == -1) {
            return 16;
        }
        return i;
    }

    /* renamed from: l */
    public ej6 m53315l() {
        return (ej6) cmb.m21420a(this.f50776l, m53316m().defaultEquivalence());
    }

    /* renamed from: m */
    public hha.EnumC13965u m53316m() {
        return (hha.EnumC13965u) cmb.m21420a(this.f50771g, hha.EnumC13965u.STRONG);
    }

    /* renamed from: n */
    public long m53317n() {
        if (this.f50773i == 0 || this.f50774j == 0) {
            return 0L;
        }
        return this.f50770f == null ? this.f50768d : this.f50769e;
    }

    /* renamed from: o */
    public long m53318o() {
        long j = this.f50775k;
        if (j == -1) {
            return 0L;
        }
        return j;
    }

    /* renamed from: p */
    public nie m53319p() {
        return (nie) cmb.m21420a(this.f50778n, EnumC17661e.INSTANCE);
    }

    /* renamed from: q */
    public hdg m53320q() {
        return this.f50780p;
    }

    /* renamed from: r */
    public rlh m53321r(boolean z) {
        rlh rlhVar = this.f50779o;
        return rlhVar != null ? rlhVar : z ? rlh.m46947b() : f50764t;
    }

    /* renamed from: s */
    public ej6 m53322s() {
        return (ej6) cmb.m21420a(this.f50777m, m53323t().defaultEquivalence());
    }

    /* renamed from: t */
    public hha.EnumC13965u m53323t() {
        return (hha.EnumC13965u) cmb.m21420a(this.f50772h, hha.EnumC13965u.STRONG);
    }

    public String toString() {
        cmb.C12710b c12710bM21421b = cmb.m21421b(this);
        int i = this.f50766b;
        if (i != -1) {
            c12710bM21421b.m21423a("initialCapacity", i);
        }
        int i2 = this.f50767c;
        if (i2 != -1) {
            c12710bM21421b.m21423a("concurrencyLevel", i2);
        }
        long j = this.f50768d;
        if (j != -1) {
            c12710bM21421b.m21424b("maximumSize", j);
        }
        long j2 = this.f50769e;
        if (j2 != -1) {
            c12710bM21421b.m21424b("maximumWeight", j2);
        }
        if (this.f50773i != -1) {
            c12710bM21421b.m21425c("expireAfterWrite", this.f50773i + "ns");
        }
        if (this.f50774j != -1) {
            c12710bM21421b.m21425c("expireAfterAccess", this.f50774j + "ns");
        }
        hha.EnumC13965u enumC13965u = this.f50771g;
        if (enumC13965u != null) {
            c12710bM21421b.m21425c("keyStrength", kp0.m35995e(enumC13965u.toString()));
        }
        hha.EnumC13965u enumC13965u2 = this.f50772h;
        if (enumC13965u2 != null) {
            c12710bM21421b.m21425c("valueStrength", kp0.m35995e(enumC13965u2.toString()));
        }
        if (this.f50776l != null) {
            c12710bM21421b.m21431i("keyEquivalence");
        }
        if (this.f50777m != null) {
            c12710bM21421b.m21431i("valueEquivalence");
        }
        if (this.f50778n != null) {
            c12710bM21421b.m21431i("removalListener");
        }
        return c12710bM21421b.toString();
    }

    /* renamed from: u */
    public f7j m53324u() {
        return (f7j) cmb.m21420a(this.f50770f, EnumC17662f.INSTANCE);
    }

    /* renamed from: v */
    public vr1 m53325v(ej6 ej6Var) {
        ej6 ej6Var2 = this.f50776l;
        dgd.m23072y(ej6Var2 == null, "key equivalence was already set to %s", ej6Var2);
        this.f50776l = (ej6) dgd.m23062o(ej6Var);
        return this;
    }

    /* renamed from: w */
    public vr1 m53326w(long j) {
        long j2 = this.f50768d;
        dgd.m23071x(j2 == -1, "maximum size was already set to %s", j2);
        long j3 = this.f50769e;
        dgd.m23071x(j3 == -1, "maximum weight was already set to %s", j3);
        dgd.m23069v(this.f50770f == null, "maximum size can not be combined with weigher");
        dgd.m23052e(j >= 0, "maximum size must not be negative");
        this.f50768d = j;
        return this;
    }

    /* renamed from: x */
    public vr1 m53327x(long j) {
        long j2 = this.f50769e;
        dgd.m23071x(j2 == -1, "maximum weight was already set to %s", j2);
        long j3 = this.f50768d;
        dgd.m23071x(j3 == -1, "maximum size was already set to %s", j3);
        dgd.m23052e(j >= 0, "maximum weight must not be negative");
        this.f50769e = j;
        return this;
    }

    /* renamed from: z */
    public vr1 m53328z(nie nieVar) {
        dgd.m23068u(this.f50778n == null);
        this.f50778n = (nie) dgd.m23062o(nieVar);
        return this;
    }
}
