package p001o;

/* loaded from: classes2.dex */
public final class uj3 implements g36 {

    /* renamed from: a */
    public final nh0 f48980a;

    /* renamed from: b */
    public final int f48981b;

    public uj3(nh0 nh0Var, int i) {
        sq8.m48649h(nh0Var, "annotatedString");
        this.f48980a = nh0Var;
        this.f48981b = i;
    }

    /* renamed from: a */
    public final String m51646a() {
        return this.f48980a.m40556g();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uj3)) {
            return false;
        }
        uj3 uj3Var = (uj3) obj;
        return sq8.m48644c(m51646a(), uj3Var.m51646a()) && this.f48981b == uj3Var.f48981b;
    }

    public int hashCode() {
        return (m51646a().hashCode() * 31) + this.f48981b;
    }

    public String toString() {
        return "CommitTextCommand(text='" + m51646a() + "', newCursorPosition=" + this.f48981b + ')';
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public uj3(String str, int i) {
        this(new nh0(str, null, null, 6, null), i);
        sq8.m48649h(str, "text");
    }
}
