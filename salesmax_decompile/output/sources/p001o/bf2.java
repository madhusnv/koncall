package p001o;

import java.util.ArrayDeque;
import java.util.PriorityQueue;
import p001o.b85;
import p001o.bf2;

/* loaded from: classes2.dex */
public abstract class bf2 implements hbg {

    /* renamed from: a */
    public final ArrayDeque f16073a = new ArrayDeque();

    /* renamed from: b */
    public final ArrayDeque f16074b;

    /* renamed from: c */
    public final PriorityQueue f16075c;

    /* renamed from: d */
    public C12368b f16076d;

    /* renamed from: e */
    public long f16077e;

    /* renamed from: f */
    public long f16078f;

    /* renamed from: g */
    public long f16079g;

    /* renamed from: o.bf2$b */
    public static final class C12368b extends mbg implements Comparable {

        /* renamed from: x */
        public long f16080x;

        public C12368b() {
        }

        @Override // java.lang.Comparable
        /* renamed from: B, reason: merged with bridge method [inline-methods] */
        public int compareTo(C12368b c12368b) {
            if (m50150n() != c12368b.m50150n()) {
                return m50150n() ? 1 : -1;
            }
            long j = this.f14284f - c12368b.f14284f;
            if (j == 0) {
                j = this.f16080x - c12368b.f16080x;
                if (j == 0) {
                    return 0;
                }
            }
            return j > 0 ? 1 : -1;
        }
    }

    /* renamed from: o.bf2$c */
    public static final class C12369c extends nbg {

        /* renamed from: g */
        public b85.InterfaceC12299a f16081g;

        public C12369c(b85.InterfaceC12299a interfaceC12299a) {
            this.f16081g = interfaceC12299a;
        }

        @Override // p001o.b85
        /* renamed from: u */
        public final void mo18274u() {
            this.f16081g.mo16983a(this);
        }
    }

    public bf2() {
        for (int i = 0; i < 10; i++) {
            this.f16073a.add(new C12368b());
        }
        this.f16074b = new ArrayDeque();
        for (int i2 = 0; i2 < 2; i2++) {
            this.f16074b.add(new C12369c(new b85.InterfaceC12299a() { // from class: o.af2
                @Override // p001o.b85.InterfaceC12299a
                /* renamed from: a */
                public final void mo16983a(b85 b85Var) {
                    this.f14590a.m18827p((bf2.C12369c) b85Var);
                }
            }));
        }
        this.f16075c = new PriorityQueue();
        this.f16079g = -9223372036854775807L;
    }

    @Override // p001o.hbg
    /* renamed from: b */
    public void mo18814b(long j) {
        this.f16077e = j;
    }

    @Override // p001o.x75
    /* renamed from: d */
    public final void mo18816d(long j) {
        this.f16079g = j;
    }

    @Override // p001o.x75
    public void flush() {
        this.f16078f = 0L;
        this.f16077e = 0L;
        while (!this.f16075c.isEmpty()) {
            m18826o((C12368b) sqi.m48729h((C12368b) this.f16075c.poll()));
        }
        C12368b c12368b = this.f16076d;
        if (c12368b != null) {
            m18826o(c12368b);
            this.f16076d = null;
        }
    }

    /* renamed from: g */
    public abstract gbg mo18818g();

    /* renamed from: h */
    public abstract void mo18819h(mbg mbgVar);

    @Override // p001o.x75
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public mbg mo18817e() {
        op0.m42517g(this.f16076d == null);
        if (this.f16073a.isEmpty()) {
            return null;
        }
        C12368b c12368b = (C12368b) this.f16073a.pollFirst();
        this.f16076d = c12368b;
        return c12368b;
    }

    @Override // p001o.x75
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public nbg mo16896a() {
        if (this.f16074b.isEmpty()) {
            return null;
        }
        while (!this.f16075c.isEmpty() && ((C12368b) sqi.m48729h((C12368b) this.f16075c.peek())).f14284f <= this.f16077e) {
            C12368b c12368b = (C12368b) sqi.m48729h((C12368b) this.f16075c.poll());
            if (c12368b.m50150n()) {
                nbg nbgVar = (nbg) sqi.m48729h((nbg) this.f16074b.pollFirst());
                nbgVar.m50147g(4);
                m18826o(c12368b);
                return nbgVar;
            }
            mo18819h(c12368b);
            if (mo18824m()) {
                gbg gbgVarMo18818g = mo18818g();
                nbg nbgVar2 = (nbg) sqi.m48729h((nbg) this.f16074b.pollFirst());
                nbgVar2.m40292v(c12368b.f14284f, gbgVarMo18818g, Long.MAX_VALUE);
                m18826o(c12368b);
                return nbgVar2;
            }
            m18826o(c12368b);
        }
        return null;
    }

    /* renamed from: k */
    public final nbg m18822k() {
        return (nbg) this.f16074b.pollFirst();
    }

    /* renamed from: l */
    public final long m18823l() {
        return this.f16077e;
    }

    /* renamed from: m */
    public abstract boolean mo18824m();

    @Override // p001o.x75
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public void mo18815c(mbg mbgVar) {
        op0.m42511a(mbgVar == this.f16076d);
        C12368b c12368b = (C12368b) mbgVar;
        long j = this.f16079g;
        if (j == -9223372036854775807L || c12368b.f14284f >= j) {
            long j2 = this.f16078f;
            this.f16078f = 1 + j2;
            c12368b.f16080x = j2;
            this.f16075c.add(c12368b);
        } else {
            m18826o(c12368b);
        }
        this.f16076d = null;
    }

    /* renamed from: o */
    public final void m18826o(C12368b c12368b) {
        c12368b.mo16674h();
        this.f16073a.add(c12368b);
    }

    /* renamed from: p */
    public void m18827p(nbg nbgVar) {
        nbgVar.mo16674h();
        this.f16074b.add(nbgVar);
    }

    @Override // p001o.x75
    public void release() {
    }
}
