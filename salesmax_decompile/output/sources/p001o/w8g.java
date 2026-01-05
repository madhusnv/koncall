package p001o;

/* loaded from: classes6.dex */
public abstract class w8g {
    /* renamed from: a */
    public static final void m54067a(Appendable appendable, Object obj, xk7 xk7Var) {
        sq8.m48649h(appendable, "<this>");
        if (xk7Var != null) {
            appendable.append((CharSequence) xk7Var.invoke(obj));
            return;
        }
        if (obj == null ? true : obj instanceof CharSequence) {
            appendable.append((CharSequence) obj);
        } else if (obj instanceof Character) {
            appendable.append(((Character) obj).charValue());
        } else {
            appendable.append(String.valueOf(obj));
        }
    }
}
