package p001o;

/* loaded from: classes6.dex */
public abstract class ufj {
    /* renamed from: a */
    public static final boolean m51547a(bg2 bg2Var, Object obj) {
        sq8.m48649h(bg2Var, "<this>");
        if (obj instanceof bg2) {
            bg2 bg2Var2 = (bg2) obj;
            if (sq8.m48644c(bg2Var2.m18845d(), bg2Var.m18845d()) && sq8.m48644c(bg2Var2.m18842a(), bg2Var.m18842a())) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    public static final int m51548b(bg2 bg2Var) {
        sq8.m48649h(bg2Var, "<this>");
        return ((899 + bg2Var.m18845d().hashCode()) * 31) + bg2Var.m18842a().hashCode();
    }

    /* renamed from: c */
    public static final String m51549c(bg2 bg2Var) {
        sq8.m48649h(bg2Var, "<this>");
        return bg2Var.m18845d() + " authParams=" + bg2Var.m18842a();
    }
}
