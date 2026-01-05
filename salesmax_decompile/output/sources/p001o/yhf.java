package p001o;

/* loaded from: classes2.dex */
public final class yhf implements g36 {

    /* renamed from: a */
    public final nh0 f55544a;

    /* renamed from: b */
    public final int f55545b;

    public yhf(nh0 nh0Var, int i) {
        sq8.m48649h(nh0Var, "annotatedString");
        this.f55544a = nh0Var;
        this.f55545b = i;
    }

    /* renamed from: a */
    public final String m57840a() {
        return this.f55544a.m40556g();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yhf)) {
            return false;
        }
        yhf yhfVar = (yhf) obj;
        return sq8.m48644c(m57840a(), yhfVar.m57840a()) && this.f55545b == yhfVar.f55545b;
    }

    public int hashCode() {
        return (m57840a().hashCode() * 31) + this.f55545b;
    }

    public String toString() {
        return "SetComposingTextCommand(text='" + m57840a() + "', newCursorPosition=" + this.f55545b + ')';
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public yhf(String str, int i) {
        this(new nh0(str, null, null, 6, null), i);
        sq8.m48649h(str, "text");
    }
}
