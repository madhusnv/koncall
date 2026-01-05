package p001o;

import android.util.Range;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import p001o.mq3;

/* loaded from: classes2.dex */
public final class cd2 {

    /* renamed from: i */
    public static final mq3.AbstractC15402a f17857i = mq3.AbstractC15402a.m39507a("camerax.core.captureConfig.rotation", Integer.TYPE);

    /* renamed from: j */
    public static final mq3.AbstractC15402a f17858j = mq3.AbstractC15402a.m39507a("camerax.core.captureConfig.jpegQuality", Integer.class);

    /* renamed from: k */
    public static final mq3.AbstractC15402a f17859k = mq3.AbstractC15402a.m39507a("camerax.core.captureConfig.resolvedFrameRate", Range.class);

    /* renamed from: a */
    public final List f17860a;

    /* renamed from: b */
    public final mq3 f17861b;

    /* renamed from: c */
    public final int f17862c;

    /* renamed from: d */
    public final boolean f17863d;

    /* renamed from: e */
    public final List f17864e;

    /* renamed from: f */
    public final boolean f17865f;

    /* renamed from: g */
    public final wig f17866g;

    /* renamed from: h */
    public final u72 f17867h;

    /* renamed from: o.cd2$b */
    public interface InterfaceC12639b {
        /* renamed from: a */
        void mo20914a(c9i c9iVar, C12638a c12638a);
    }

    public cd2(List list, mq3 mq3Var, int i, boolean z, List list2, boolean z2, wig wigVar, u72 u72Var) {
        this.f17860a = list;
        this.f17861b = mq3Var;
        this.f17862c = i;
        this.f17864e = Collections.unmodifiableList(list2);
        this.f17865f = z2;
        this.f17866g = wigVar;
        this.f17867h = u72Var;
        this.f17863d = z;
    }

    /* renamed from: b */
    public static cd2 m20880b() {
        return new C12638a().m20901h();
    }

    /* renamed from: c */
    public List m20881c() {
        return this.f17864e;
    }

    /* renamed from: d */
    public u72 m20882d() {
        return this.f17867h;
    }

    /* renamed from: e */
    public Range m20883e() {
        Range range = (Range) this.f17861b.mo36958d(f17859k, k7g.f31605a);
        Objects.requireNonNull(range);
        return range;
    }

    /* renamed from: f */
    public int m20884f() {
        Object objM54617d = this.f17866g.m54617d("CAPTURE_CONFIG_ID_KEY");
        if (objM54617d == null) {
            return -1;
        }
        return ((Integer) objM54617d).intValue();
    }

    /* renamed from: g */
    public mq3 m20885g() {
        return this.f17861b;
    }

    /* renamed from: h */
    public int m20886h() {
        Integer num = (Integer) this.f17861b.mo36958d(c9i.f17562F, 0);
        Objects.requireNonNull(num);
        return num.intValue();
    }

    /* renamed from: i */
    public List m20887i() {
        return Collections.unmodifiableList(this.f17860a);
    }

    /* renamed from: j */
    public wig m20888j() {
        return this.f17866g;
    }

    /* renamed from: k */
    public int m20889k() {
        return this.f17862c;
    }

    /* renamed from: l */
    public int m20890l() {
        Integer num = (Integer) this.f17861b.mo36958d(c9i.f17563G, 0);
        Objects.requireNonNull(num);
        return num.intValue();
    }

    /* renamed from: m */
    public boolean m20891m() {
        return this.f17865f;
    }

    /* renamed from: o.cd2$a */
    public static final class C12638a {

        /* renamed from: a */
        public final Set f17868a;

        /* renamed from: b */
        public vob f17869b;

        /* renamed from: c */
        public int f17870c;

        /* renamed from: d */
        public boolean f17871d;

        /* renamed from: e */
        public List f17872e;

        /* renamed from: f */
        public boolean f17873f;

        /* renamed from: g */
        public eqb f17874g;

        /* renamed from: h */
        public u72 f17875h;

        public C12638a() {
            this.f17868a = new HashSet();
            this.f17869b = qpb.a0();
            this.f17870c = -1;
            this.f17871d = false;
            this.f17872e = new ArrayList();
            this.f17873f = false;
            this.f17874g = eqb.m25439g();
        }

        /* renamed from: i */
        public static C12638a m20892i(c9i c9iVar) {
            InterfaceC12639b interfaceC12639bM20529A = c9iVar.m20529A(null);
            if (interfaceC12639bM20529A != null) {
                C12638a c12638a = new C12638a();
                interfaceC12639bM20529A.mo20914a(c9iVar, c12638a);
                return c12638a;
            }
            throw new IllegalStateException("Implementation is missing option unpacker for " + c9iVar.m48394p(c9iVar.toString()));
        }

        /* renamed from: j */
        public static C12638a m20893j(cd2 cd2Var) {
            return new C12638a(cd2Var);
        }

        /* renamed from: a */
        public void m20894a(Collection collection) {
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                m20896c((j72) it.next());
            }
        }

        /* renamed from: b */
        public void m20895b(wig wigVar) {
            this.f17874g.m25441f(wigVar);
        }

        /* renamed from: c */
        public void m20896c(j72 j72Var) {
            if (this.f17872e.contains(j72Var)) {
                return;
            }
            this.f17872e.add(j72Var);
        }

        /* renamed from: d */
        public void m20897d(mq3.AbstractC15402a abstractC15402a, Object obj) {
            this.f17869b.mo45760N(abstractC15402a, obj);
        }

        /* renamed from: e */
        public void m20898e(mq3 mq3Var) {
            for (mq3.AbstractC15402a abstractC15402a : mq3Var.mo36956b()) {
                this.f17869b.mo36958d(abstractC15402a, null);
                this.f17869b.mo45759C(abstractC15402a, mq3Var.mo36959e(abstractC15402a), mq3Var.mo36960f(abstractC15402a));
            }
        }

        /* renamed from: f */
        public void m20899f(yj5 yj5Var) {
            this.f17868a.add(yj5Var);
        }

        /* renamed from: g */
        public void m20900g(String str, Object obj) {
            this.f17874g.m25442i(str, obj);
        }

        /* renamed from: h */
        public cd2 m20901h() {
            return new cd2(new ArrayList(this.f17868a), tec.m49792Y(this.f17869b), this.f17870c, this.f17871d, new ArrayList(this.f17872e), this.f17873f, wig.m54616c(this.f17874g), this.f17875h);
        }

        /* renamed from: k */
        public Range m20902k() {
            return (Range) this.f17869b.mo36958d(cd2.f17859k, k7g.f31605a);
        }

        /* renamed from: l */
        public Set m20903l() {
            return this.f17868a;
        }

        /* renamed from: m */
        public int m20904m() {
            return this.f17870c;
        }

        /* renamed from: n */
        public void m20905n(u72 u72Var) {
            this.f17875h = u72Var;
        }

        /* renamed from: o */
        public void m20906o(Range range) {
            m20897d(cd2.f17859k, range);
        }

        /* renamed from: p */
        public void m20907p(int i) {
            this.f17874g.m25442i("CAPTURE_CONFIG_ID_KEY", Integer.valueOf(i));
        }

        /* renamed from: q */
        public void m20908q(mq3 mq3Var) {
            this.f17869b = qpb.b0(mq3Var);
        }

        /* renamed from: r */
        public void m20909r(boolean z) {
            this.f17871d = z;
        }

        /* renamed from: s */
        public void m20910s(int i) {
            if (i != 0) {
                m20897d(c9i.f17562F, Integer.valueOf(i));
            }
        }

        /* renamed from: t */
        public void m20911t(int i) {
            this.f17870c = i;
        }

        /* renamed from: u */
        public void m20912u(boolean z) {
            this.f17873f = z;
        }

        /* renamed from: v */
        public void m20913v(int i) {
            if (i != 0) {
                m20897d(c9i.f17563G, Integer.valueOf(i));
            }
        }

        public C12638a(cd2 cd2Var) {
            HashSet hashSet = new HashSet();
            this.f17868a = hashSet;
            this.f17869b = qpb.a0();
            this.f17870c = -1;
            this.f17871d = false;
            this.f17872e = new ArrayList();
            this.f17873f = false;
            this.f17874g = eqb.m25439g();
            hashSet.addAll(cd2Var.f17860a);
            this.f17869b = qpb.b0(cd2Var.f17861b);
            this.f17870c = cd2Var.f17862c;
            this.f17872e.addAll(cd2Var.m20881c());
            this.f17873f = cd2Var.m20891m();
            this.f17874g = eqb.m25440h(cd2Var.m20888j());
            this.f17871d = cd2Var.f17863d;
        }
    }
}
