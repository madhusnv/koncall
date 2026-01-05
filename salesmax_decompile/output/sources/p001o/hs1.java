package p001o;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import p001o.hb3;
import p001o.hs1;
import p001o.k16;

/* loaded from: classes3.dex */
public final class hs1 implements rb3 {

    /* renamed from: f */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f27417f = AtomicIntegerFieldUpdater.newUpdater(hs1.class, "e");

    /* renamed from: a */
    public final qc4 f27418a;

    /* renamed from: b */
    public final long f27419b;

    /* renamed from: c */
    public final hb3 f27420c;

    /* renamed from: d */
    public final ks1 f27421d;

    /* renamed from: e */
    public volatile /* synthetic */ int f27422e;

    /* renamed from: o.hs1$a */
    public static final class C14052a extends jgg implements xk7 {

        /* renamed from: a */
        public int f27423a;

        /* renamed from: c */
        public final /* synthetic */ qx0 f27425c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C14052a(qx0 qx0Var, n64 n64Var) {
            super(1, n64Var);
            this.f27425c = qx0Var;
        }

        /* renamed from: g */
        public static final String m31043g() {
            return "refreshing credentials cache";
        }

        @Override // p001o.vb1
        public final n64 create(n64 n64Var) {
            return hs1.this.new C14052a(this.f27425c, n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            Object objM51918f = uq8.m51918f();
            int i = this.f27423a;
            if (i == 0) {
                wre.m54934b(obj);
                q74 context = getContext();
                uk7 uk7Var = new uk7() { // from class: o.gs1
                    @Override // p001o.uk7
                    public final Object invoke() {
                        return hs1.C14052a.m31043g();
                    }
                };
                fja fjaVar = fja.Trace;
                String strMo26336c = kge.m35689b(hs1.class).mo26336c();
                if (strMo26336c == null) {
                    throw new IllegalArgumentException("log<T> cannot be used on an anonymous object".toString());
                }
                v74.m52399d(context, fjaVar, strMo26336c, null, uk7Var);
                qc4 qc4Var = hs1.this.f27418a;
                qx0 qx0Var = this.f27425c;
                this.f27423a = 1;
                obj = qc4Var.resolve(qx0Var, this);
                if (obj == objM51918f) {
                    return objM51918f;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                wre.m54934b(obj);
            }
            ic4 ic4Var = (ic4) obj;
            gk8 gk8Var = (gk8) kh3.v0(ch3.m21251p(ic4Var.mo29762c(), hs1.this.f27420c.mo30148a().m28956m(hs1.this.f27419b)));
            gk8 gk8VarMo29762c = ic4Var.mo29762c();
            return new yo6(oc4.m41962b(ic4Var, null, null, null, gk8VarMo29762c == null ? gk8Var : gk8VarMo29762c, null, null, 55, null), gk8Var);
        }

        @Override // p001o.xk7
        public final Object invoke(n64 n64Var) {
            return ((C14052a) create(n64Var)).invokeSuspend(y3i.f54824a);
        }
    }

    public /* synthetic */ hs1(qc4 qc4Var, long j, long j2, hb3 hb3Var, id5 id5Var) {
        this(qc4Var, j, j2, hb3Var);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (f27417f.compareAndSet(this, 0, 1)) {
            this.f27421d.close();
            ub3.m51325a(this.f27418a);
        }
    }

    @Override // p001o.qc4, p001o.nb8
    public Object resolve(qx0 qx0Var, n64 n64Var) {
        if (this.f27422e == 0) {
            return this.f27421d.m36182a(new C14052a(qx0Var, null), n64Var);
        }
        throw new IllegalStateException("Credentials provider is closed".toString());
    }

    public String toString() {
        return tc4.m49697a(this) + ": " + tc4.m49697a(this.f27418a);
    }

    public hs1(qc4 qc4Var, long j, long j2, hb3 hb3Var) {
        sq8.m48649h(qc4Var, "source");
        sq8.m48649h(hb3Var, "clock");
        this.f27418a = qc4Var;
        this.f27419b = j;
        this.f27420c = hb3Var;
        this.f27421d = new ks1(null, j2, hb3Var, null);
        this.f27422e = 0;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ hs1(qc4 qc4Var, long j, long j2, hb3 hb3Var, int i, id5 id5Var) {
        long jM38175s;
        long jM38175s2;
        if ((i & 2) != 0) {
            k16.C14700a c14700a = k16.f31358b;
            jM38175s = m16.m38175s(900, o16.SECONDS);
        } else {
            jM38175s = j;
        }
        if ((i & 4) != 0) {
            k16.C14700a c14700a2 = k16.f31358b;
            jM38175s2 = m16.m38175s(10, o16.SECONDS);
        } else {
            jM38175s2 = j2;
        }
        this(qc4Var, jM38175s, jM38175s2, (i & 8) != 0 ? hb3.C13904a.f26578a : hb3Var, null);
    }
}
