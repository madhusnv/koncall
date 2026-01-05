package p001o;

import java.io.IOException;
import java.util.List;

/* loaded from: classes2.dex */
public abstract class zdh {
    /* renamed from: a */
    public static final void m59273a(Appendable appendable, Object obj, xk7 xk7Var) throws IOException {
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

    /* renamed from: b */
    public static final Appendable m59274b(List list, Appendable appendable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, xk7 xk7Var) throws IOException {
        appendable.append(charSequence2);
        int size = list.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            Object obj = list.get(i3);
            i2++;
            if (i2 > 1) {
                appendable.append(charSequence);
            }
            if (i >= 0 && i2 > i) {
                break;
            }
            m59273a(appendable, obj, xk7Var);
        }
        if (i >= 0 && i2 > i) {
            appendable.append(charSequence4);
        }
        appendable.append(charSequence3);
        return appendable;
    }

    /* renamed from: c */
    public static final String m59275c(List list, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, xk7 xk7Var) {
        sq8.m48649h(list, "<this>");
        sq8.m48649h(charSequence, "separator");
        sq8.m48649h(charSequence2, "prefix");
        sq8.m48649h(charSequence3, "postfix");
        sq8.m48649h(charSequence4, "truncated");
        String string = ((StringBuilder) m59274b(list, new StringBuilder(), charSequence, charSequence2, charSequence3, i, charSequence4, xk7Var)).toString();
        sq8.m48648g(string, "fastJoinTo(StringBuilder…form)\n        .toString()");
        return string;
    }

    /* renamed from: d */
    public static /* synthetic */ String m59276d(List list, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, xk7 xk7Var, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            charSequence = ", ";
        }
        CharSequence charSequence5 = (i2 & 2) != 0 ? "" : charSequence2;
        CharSequence charSequence6 = (i2 & 4) == 0 ? charSequence3 : "";
        if ((i2 & 8) != 0) {
            i = -1;
        }
        int i3 = i;
        if ((i2 & 16) != 0) {
            charSequence4 = "...";
        }
        CharSequence charSequence7 = charSequence4;
        if ((i2 & 32) != 0) {
            xk7Var = null;
        }
        return m59275c(list, charSequence, charSequence5, charSequence6, i3, charSequence7, xk7Var);
    }
}
