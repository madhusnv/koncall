package p001o;

import android.util.Range;
import android.util.Size;
import p001o.k7g;

/* loaded from: classes2.dex */
public final class n51 extends k7g {

    /* renamed from: b */
    public final Size f36386b;

    /* renamed from: c */
    public final y16 f36387c;

    /* renamed from: d */
    public final Range f36388d;

    /* renamed from: e */
    public final mq3 f36389e;

    /* renamed from: f */
    public final boolean f36390f;

    /* renamed from: o.n51$b */
    public static final class C15502b extends k7g.AbstractC14726a {

        /* renamed from: a */
        public Size f36391a;

        /* renamed from: b */
        public y16 f36392b;

        /* renamed from: c */
        public Range f36393c;

        /* renamed from: d */
        public mq3 f36394d;

        /* renamed from: e */
        public Boolean f36395e;

        @Override // p001o.k7g.AbstractC14726a
        /* renamed from: a */
        public k7g mo35132a() {
            String str = "";
            if (this.f36391a == null) {
                str = " resolution";
            }
            if (this.f36392b == null) {
                str = str + " dynamicRange";
            }
            if (this.f36393c == null) {
                str = str + " expectedFrameRateRange";
            }
            if (this.f36395e == null) {
                str = str + " zslDisabled";
            }
            if (str.isEmpty()) {
                return new n51(this.f36391a, this.f36392b, this.f36393c, this.f36394d, this.f36395e.booleanValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // p001o.k7g.AbstractC14726a
        /* renamed from: b */
        public k7g.AbstractC14726a mo35133b(y16 y16Var) {
            if (y16Var == null) {
                throw new NullPointerException("Null dynamicRange");
            }
            this.f36392b = y16Var;
            return this;
        }

        @Override // p001o.k7g.AbstractC14726a
        /* renamed from: c */
        public k7g.AbstractC14726a mo35134c(Range range) {
            if (range == null) {
                throw new NullPointerException("Null expectedFrameRateRange");
            }
            this.f36393c = range;
            return this;
        }

        @Override // p001o.k7g.AbstractC14726a
        /* renamed from: d */
        public k7g.AbstractC14726a mo35135d(mq3 mq3Var) {
            this.f36394d = mq3Var;
            return this;
        }

        @Override // p001o.k7g.AbstractC14726a
        /* renamed from: e */
        public k7g.AbstractC14726a mo35136e(Size size) {
            if (size == null) {
                throw new NullPointerException("Null resolution");
            }
            this.f36391a = size;
            return this;
        }

        @Override // p001o.k7g.AbstractC14726a
        /* renamed from: f */
        public k7g.AbstractC14726a mo35137f(boolean z) {
            this.f36395e = Boolean.valueOf(z);
            return this;
        }

        public C15502b() {
        }

        public C15502b(k7g k7gVar) {
            this.f36391a = k7gVar.mo35129e();
            this.f36392b = k7gVar.mo35126b();
            this.f36393c = k7gVar.mo35127c();
            this.f36394d = k7gVar.mo35128d();
            this.f36395e = Boolean.valueOf(k7gVar.mo35130f());
        }
    }

    @Override // p001o.k7g
    /* renamed from: b */
    public y16 mo35126b() {
        return this.f36387c;
    }

    @Override // p001o.k7g
    /* renamed from: c */
    public Range mo35127c() {
        return this.f36388d;
    }

    @Override // p001o.k7g
    /* renamed from: d */
    public mq3 mo35128d() {
        return this.f36389e;
    }

    @Override // p001o.k7g
    /* renamed from: e */
    public Size mo35129e() {
        return this.f36386b;
    }

    public boolean equals(Object obj) {
        mq3 mq3Var;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof k7g)) {
            return false;
        }
        k7g k7gVar = (k7g) obj;
        return this.f36386b.equals(k7gVar.mo35129e()) && this.f36387c.equals(k7gVar.mo35126b()) && this.f36388d.equals(k7gVar.mo35127c()) && ((mq3Var = this.f36389e) != null ? mq3Var.equals(k7gVar.mo35128d()) : k7gVar.mo35128d() == null) && this.f36390f == k7gVar.mo35130f();
    }

    @Override // p001o.k7g
    /* renamed from: f */
    public boolean mo35130f() {
        return this.f36390f;
    }

    @Override // p001o.k7g
    /* renamed from: g */
    public k7g.AbstractC14726a mo35131g() {
        return new C15502b(this);
    }

    public int hashCode() {
        int iHashCode = (((((this.f36386b.hashCode() ^ 1000003) * 1000003) ^ this.f36387c.hashCode()) * 1000003) ^ this.f36388d.hashCode()) * 1000003;
        mq3 mq3Var = this.f36389e;
        return ((iHashCode ^ (mq3Var == null ? 0 : mq3Var.hashCode())) * 1000003) ^ (this.f36390f ? 1231 : 1237);
    }

    public String toString() {
        return "StreamSpec{resolution=" + this.f36386b + ", dynamicRange=" + this.f36387c + ", expectedFrameRateRange=" + this.f36388d + ", implementationOptions=" + this.f36389e + ", zslDisabled=" + this.f36390f + "}";
    }

    public n51(Size size, y16 y16Var, Range range, mq3 mq3Var, boolean z) {
        this.f36386b = size;
        this.f36387c = y16Var;
        this.f36388d = range;
        this.f36389e = mq3Var;
        this.f36390f = z;
    }
}
