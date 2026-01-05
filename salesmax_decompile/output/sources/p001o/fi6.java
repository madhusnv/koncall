package p001o;

import p001o.bff;
import p001o.p9g;

/* loaded from: classes6.dex */
public final class fi6 extends ubd {

    /* renamed from: m */
    public final bff f23390m;

    /* renamed from: n */
    public final gi9 f23391n;

    /* renamed from: o.fi6$a */
    public static final class C13438a extends kf9 implements uk7 {

        /* renamed from: a */
        public final /* synthetic */ int f23392a;

        /* renamed from: b */
        public final /* synthetic */ String f23393b;

        /* renamed from: c */
        public final /* synthetic */ fi6 f23394c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C13438a(int i, String str, fi6 fi6Var) {
            super(0);
            this.f23392a = i;
            this.f23393b = str;
            this.f23394c = fi6Var;
        }

        @Override // p001o.uk7
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final uef[] invoke() {
            int i = this.f23392a;
            uef[] uefVarArr = new uef[i];
            for (int i2 = 0; i2 < i; i2++) {
                uefVarArr[i2] = yef.m57706c(this.f23393b + '.' + this.f23394c.mo16763e(i2), p9g.C16040d.f39684a, new uef[0], null, 8, null);
            }
            return uefVarArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fi6(String str, int i) {
        super(str, null, i, 2, null);
        sq8.m48649h(str, "name");
        this.f23390m = bff.C12373b.f16099a;
        this.f23391n = si9.m48360a(new C13438a(i, str, this));
    }

    @Override // p001o.ubd
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof uef)) {
            return false;
        }
        uef uefVar = (uef) obj;
        return uefVar.getKind() == bff.C12373b.f16099a && sq8.m48644c(mo16766h(), uefVar.mo16766h()) && sq8.m48644c(had.m30142a(this), had.m30142a(uefVar));
    }

    @Override // p001o.ubd, p001o.uef
    /* renamed from: g */
    public uef mo16765g(int i) {
        return m26743s()[i];
    }

    @Override // p001o.ubd, p001o.uef
    public bff getKind() {
        return this.f23390m;
    }

    @Override // p001o.ubd
    public int hashCode() {
        int iHashCode = mo16766h().hashCode();
        int iHashCode2 = 1;
        for (String str : xef.m56193b(this)) {
            int i = iHashCode2 * 31;
            iHashCode2 = i + (str != null ? str.hashCode() : 0);
        }
        return (iHashCode * 31) + iHashCode2;
    }

    /* renamed from: s */
    public final uef[] m26743s() {
        return (uef[]) this.f23391n.getValue();
    }

    @Override // p001o.ubd
    public String toString() {
        return kh3.p0(xef.m56193b(this), ", ", mo16766h() + '(', ")", 0, null, null, 56, null);
    }
}
