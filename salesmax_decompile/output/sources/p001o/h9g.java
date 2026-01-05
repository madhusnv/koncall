package p001o;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

/* loaded from: classes6.dex */
public abstract class h9g extends g9g {

    /* renamed from: o.h9g$a */
    public static final class C13896a extends kf9 implements xk7 {

        /* renamed from: a */
        public static final C13896a f26457a = new C13896a();

        public C13896a() {
            super(1);
        }

        @Override // p001o.xk7
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke(CharSequence charSequence) {
            sq8.m48649h(charSequence, "it");
            return charSequence.toString();
        }
    }

    public static final List d1(CharSequence charSequence, int i) {
        sq8.m48649h(charSequence, "<this>");
        return n1(charSequence, i, i, true);
    }

    public static final String e1(String str, int i) {
        sq8.m48649h(str, "<this>");
        if (i >= 0) {
            String strSubstring = str.substring(bce.m18604g(i, str.length()));
            sq8.m48648g(strSubstring, "substring(...)");
            return strSubstring;
        }
        throw new IllegalArgumentException(("Requested character count " + i + " is less than zero.").toString());
    }

    public static final String f1(String str, int i) {
        sq8.m48649h(str, "<this>");
        if (i >= 0) {
            return l1(str, bce.m18601d(str.length() - i, 0));
        }
        throw new IllegalArgumentException(("Requested character count " + i + " is less than zero.").toString());
    }

    public static final char g1(CharSequence charSequence) {
        sq8.m48649h(charSequence, "<this>");
        if (charSequence.length() == 0) {
            throw new NoSuchElementException("Char sequence is empty.");
        }
        return charSequence.charAt(0);
    }

    public static final Character h1(CharSequence charSequence, int i) {
        sq8.m48649h(charSequence, "<this>");
        boolean z = false;
        if (i >= 0 && i < charSequence.length()) {
            z = true;
        }
        if (z) {
            return Character.valueOf(charSequence.charAt(i));
        }
        return null;
    }

    public static final char i1(CharSequence charSequence) {
        sq8.m48649h(charSequence, "<this>");
        if (charSequence.length() == 0) {
            throw new NoSuchElementException("Char sequence is empty.");
        }
        return charSequence.charAt(f9g.m26312V(charSequence));
    }

    public static final char j1(CharSequence charSequence, vbe vbeVar) {
        sq8.m48649h(charSequence, "<this>");
        sq8.m48649h(vbeVar, "random");
        if (charSequence.length() == 0) {
            throw new NoSuchElementException("Char sequence is empty.");
        }
        return charSequence.charAt(vbeVar.mo22613g(charSequence.length()));
    }

    public static final char k1(CharSequence charSequence) {
        sq8.m48649h(charSequence, "<this>");
        int length = charSequence.length();
        if (length == 0) {
            throw new NoSuchElementException("Char sequence is empty.");
        }
        if (length == 1) {
            return charSequence.charAt(0);
        }
        throw new IllegalArgumentException("Char sequence has more than one element.");
    }

    public static final String l1(String str, int i) {
        sq8.m48649h(str, "<this>");
        if (i >= 0) {
            String strSubstring = str.substring(0, bce.m18604g(i, str.length()));
            sq8.m48648g(strSubstring, "substring(...)");
            return strSubstring;
        }
        throw new IllegalArgumentException(("Requested character count " + i + " is less than zero.").toString());
    }

    public static final String m1(String str, int i) {
        sq8.m48649h(str, "<this>");
        if (i >= 0) {
            int length = str.length();
            String strSubstring = str.substring(length - bce.m18604g(i, length));
            sq8.m48648g(strSubstring, "substring(...)");
            return strSubstring;
        }
        throw new IllegalArgumentException(("Requested character count " + i + " is less than zero.").toString());
    }

    public static final List n1(CharSequence charSequence, int i, int i2, boolean z) {
        sq8.m48649h(charSequence, "<this>");
        return o1(charSequence, i, i2, z, C13896a.f26457a);
    }

    public static final List o1(CharSequence charSequence, int i, int i2, boolean z, xk7 xk7Var) {
        sq8.m48649h(charSequence, "<this>");
        sq8.m48649h(xk7Var, "transform");
        bwf.m19905a(i, i2);
        int length = charSequence.length();
        ArrayList arrayList = new ArrayList((length / i2) + (length % i2 == 0 ? 0 : 1));
        int i3 = 0;
        while (true) {
            if (!(i3 >= 0 && i3 < length)) {
                break;
            }
            int i4 = i3 + i;
            if (i4 < 0 || i4 > length) {
                if (!z) {
                    break;
                }
                i4 = length;
            }
            arrayList.add(xk7Var.invoke(charSequence.subSequence(i3, i4)));
            i3 += i2;
        }
        return arrayList;
    }
}
