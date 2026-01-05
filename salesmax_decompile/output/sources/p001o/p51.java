package p001o;

import p001o.weg;

/* loaded from: classes2.dex */
public final class p51 extends weg {

    /* renamed from: a */
    public final weg.EnumC17833b f39332a;

    /* renamed from: b */
    public final weg.EnumC17832a f39333b;

    /* renamed from: c */
    public final long f39334c;

    public p51(weg.EnumC17833b enumC17833b, weg.EnumC17832a enumC17832a, long j) {
        if (enumC17833b == null) {
            throw new NullPointerException("Null configType");
        }
        this.f39332a = enumC17833b;
        if (enumC17832a == null) {
            throw new NullPointerException("Null configSize");
        }
        this.f39333b = enumC17832a;
        this.f39334c = j;
    }

    @Override // p001o.weg
    /* renamed from: c */
    public weg.EnumC17832a mo42972c() {
        return this.f39333b;
    }

    @Override // p001o.weg
    /* renamed from: d */
    public weg.EnumC17833b mo42973d() {
        return this.f39332a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof weg)) {
            return false;
        }
        weg wegVar = (weg) obj;
        return this.f39332a.equals(wegVar.mo42973d()) && this.f39333b.equals(wegVar.mo42972c()) && this.f39334c == wegVar.mo42974f();
    }

    @Override // p001o.weg
    /* renamed from: f */
    public long mo42974f() {
        return this.f39334c;
    }

    public int hashCode() {
        int iHashCode = (((this.f39332a.hashCode() ^ 1000003) * 1000003) ^ this.f39333b.hashCode()) * 1000003;
        long j = this.f39334c;
        return iHashCode ^ ((int) (j ^ (j >>> 32)));
    }

    public String toString() {
        return "SurfaceConfig{configType=" + this.f39332a + ", configSize=" + this.f39333b + ", streamUseCase=" + this.f39334c + "}";
    }
}
