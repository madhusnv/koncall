package p001o;

/* loaded from: classes2.dex */
public final class pfc {

    /* renamed from: a */
    public final ofc f40001a;

    /* renamed from: b */
    public final String f40002b;

    /* renamed from: o.pfc$a */
    public /* synthetic */ class C16105a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f40003a;

        static {
            int[] iArr = new int[ofc.values().length];
            try {
                iArr[ofc.Unknown.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f40003a = iArr;
        }
    }

    public pfc(ofc ofcVar, String str) {
        sq8.m48649h(ofcVar, "family");
        this.f40001a = ofcVar;
        this.f40002b = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pfc)) {
            return false;
        }
        pfc pfcVar = (pfc) obj;
        return this.f40001a == pfcVar.f40001a && sq8.m48644c(this.f40002b, pfcVar.f40002b);
    }

    public int hashCode() {
        int iHashCode = this.f40001a.hashCode() * 31;
        String str = this.f40002b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return i91.m31759d("os", C16105a.f40003a[this.f40001a.ordinal()] == 1 ? "other" : this.f40001a.toString(), this.f40002b);
    }
}
