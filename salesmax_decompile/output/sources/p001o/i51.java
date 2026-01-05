package p001o;

import java.util.Map;

/* loaded from: classes5.dex */
public final class i51 extends e5f {

    /* renamed from: a */
    public final ib3 f28089a;

    /* renamed from: b */
    public final Map f28090b;

    public i51(ib3 ib3Var, Map map) {
        if (ib3Var == null) {
            throw new NullPointerException("Null clock");
        }
        this.f28089a = ib3Var;
        if (map == null) {
            throw new NullPointerException("Null values");
        }
        this.f28090b = map;
    }

    @Override // p001o.e5f
    /* renamed from: e */
    public ib3 mo24323e() {
        return this.f28089a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof e5f)) {
            return false;
        }
        e5f e5fVar = (e5f) obj;
        return this.f28089a.equals(e5fVar.mo24323e()) && this.f28090b.equals(e5fVar.mo24325h());
    }

    @Override // p001o.e5f
    /* renamed from: h */
    public Map mo24325h() {
        return this.f28090b;
    }

    public int hashCode() {
        return ((this.f28089a.hashCode() ^ 1000003) * 1000003) ^ this.f28090b.hashCode();
    }

    public String toString() {
        return "SchedulerConfig{clock=" + this.f28089a + ", values=" + this.f28090b + "}";
    }
}
