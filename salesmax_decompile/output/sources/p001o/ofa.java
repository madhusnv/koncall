package p001o;

import java.io.IOException;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* loaded from: classes2.dex */
public abstract class ofa {
    /* renamed from: a */
    public static final void m42196a(Appendable appendable, Object obj, xk7 xk7Var) throws IOException {
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
    public static final Appendable m42197b(List list, Appendable appendable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, xk7 xk7Var) throws IOException {
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
            m42196a(appendable, obj, xk7Var);
        }
        if (i >= 0 && i2 > i) {
            appendable.append(charSequence4);
        }
        appendable.append(charSequence3);
        return appendable;
    }

    /* renamed from: c */
    public static final String m42198c(List list, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, xk7 xk7Var) {
        sq8.m48649h(list, "<this>");
        sq8.m48649h(charSequence, "separator");
        sq8.m48649h(charSequence2, "prefix");
        sq8.m48649h(charSequence3, "postfix");
        sq8.m48649h(charSequence4, "truncated");
        String string = ((StringBuilder) m42197b(list, new StringBuilder(), charSequence, charSequence2, charSequence3, i, charSequence4, xk7Var)).toString();
        sq8.m48648g(string, "fastJoinTo(StringBuilder…form)\n        .toString()");
        return string;
    }

    /* renamed from: d */
    public static /* synthetic */ String m42199d(List list, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, xk7 xk7Var, int i2, Object obj) {
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
        return m42198c(list, charSequence, charSequence5, charSequence6, i3, charSequence7, xk7Var);
    }

    /* renamed from: e */
    public static final Set m42200e(List list) {
        sq8.m48649h(list, "<this>");
        HashSet hashSet = new HashSet(list.size());
        int size = list.size();
        for (int i = 0; i < size; i++) {
            hashSet.add(list.get(i));
        }
        return hashSet;
    }
}
