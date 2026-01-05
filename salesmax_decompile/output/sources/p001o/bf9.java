package p001o;

/* loaded from: classes2.dex */
public class bf9 {

    /* renamed from: c */
    public static final String f16092c = sqi.B0(0);

    /* renamed from: d */
    public static final String f16093d = sqi.B0(1);

    /* renamed from: a */
    public final String f16094a;

    /* renamed from: b */
    public final String f16095b;

    public bf9(String str, String str2) {
        this.f16094a = sqi.Q0(str);
        this.f16095b = str2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        bf9 bf9Var = (bf9) obj;
        return sqi.m48724c(this.f16094a, bf9Var.f16094a) && sqi.m48724c(this.f16095b, bf9Var.f16095b);
    }

    public int hashCode() {
        int iHashCode = this.f16095b.hashCode() * 31;
        String str = this.f16094a;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }
}
