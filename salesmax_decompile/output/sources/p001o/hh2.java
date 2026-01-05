package p001o;

import org.apache.http.message.TokenParser;

/* loaded from: classes3.dex */
public abstract class hh2 implements hgd {

    /* renamed from: o.hh2$a */
    public static abstract class AbstractC13941a extends hh2 {
        @Override // p001o.hgd
        public /* bridge */ /* synthetic */ boolean apply(Object obj) {
            return super.m30438b((Character) obj);
        }
    }

    /* renamed from: o.hh2$b */
    public static final class C13942b extends AbstractC13941a {

        /* renamed from: a */
        public final char f26858a;

        public C13942b(char c) {
            this.f26858a = c;
        }

        @Override // p001o.hh2
        /* renamed from: e */
        public boolean mo30440e(char c) {
            return c == this.f26858a;
        }

        public String toString() {
            return "CharMatcher.is('" + hh2.m30437g(this.f26858a) + "')";
        }
    }

    /* renamed from: o.hh2$c */
    public static abstract class AbstractC13943c extends AbstractC13941a {

        /* renamed from: a */
        public final String f26859a;

        public AbstractC13943c(String str) {
            this.f26859a = (String) dgd.m23062o(str);
        }

        public final String toString() {
            return this.f26859a;
        }
    }

    /* renamed from: o.hh2$d */
    public static final class C13944d extends AbstractC13943c {

        /* renamed from: b */
        public static final hh2 f26860b = new C13944d();

        public C13944d() {
            super("CharMatcher.none()");
        }

        @Override // p001o.hh2
        /* renamed from: c */
        public int mo30439c(CharSequence charSequence, int i) {
            dgd.m23065r(i, charSequence.length());
            return -1;
        }

        @Override // p001o.hh2
        /* renamed from: e */
        public boolean mo30440e(char c) {
            return false;
        }
    }

    /* renamed from: d */
    public static hh2 m30435d(char c) {
        return new C13942b(c);
    }

    /* renamed from: f */
    public static hh2 m30436f() {
        return C13944d.f26860b;
    }

    /* renamed from: g */
    public static String m30437g(char c) {
        char[] cArr = {TokenParser.ESCAPE, 'u', 0, 0, 0, 0};
        for (int i = 0; i < 4; i++) {
            cArr[5 - i] = "0123456789ABCDEF".charAt(c & 15);
            c = (char) (c >> 4);
        }
        return String.copyValueOf(cArr);
    }

    /* renamed from: b */
    public boolean m30438b(Character ch) {
        return mo30440e(ch.charValue());
    }

    /* renamed from: c */
    public int mo30439c(CharSequence charSequence, int i) {
        int length = charSequence.length();
        dgd.m23065r(i, length);
        while (i < length) {
            if (mo30440e(charSequence.charAt(i))) {
                return i;
            }
            i++;
        }
        return -1;
    }

    /* renamed from: e */
    public abstract boolean mo30440e(char c);
}
