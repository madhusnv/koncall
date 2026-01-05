package p001o;

/* loaded from: classes6.dex */
public class cr1 implements f76 {
    /* renamed from: d */
    public static String m21603d(CharSequence charSequence, int i) {
        int iCharAt = (charSequence.charAt(i) * 1600) + (charSequence.charAt(i + 1) * '(') + charSequence.charAt(i + 2) + 1;
        return new String(new char[]{(char) (iCharAt / 256), (char) (iCharAt % 256)});
    }

    /* renamed from: g */
    public static void m21604g(j76 j76Var, StringBuilder sb) {
        j76Var.m33359s(m21603d(sb, 0));
        sb.delete(0, 3);
    }

    @Override // p001o.f76
    /* renamed from: a */
    public void mo21605a(j76 j76Var) {
        StringBuilder sb = new StringBuilder();
        while (true) {
            if (!j76Var.m33349i()) {
                break;
            }
            char cM33343c = j76Var.m33343c();
            j76Var.f29915d++;
            int iMo19087c = mo19087c(cM33343c, sb);
            int iM33341a = j76Var.m33341a() + ((sb.length() / 3) << 1);
            j76Var.m33357q(iM33341a);
            int iM39007a = j76Var.m33347g().m39007a() - iM33341a;
            if (!j76Var.m33349i()) {
                StringBuilder sb2 = new StringBuilder();
                if (sb.length() % 3 == 2 && (iM39007a < 2 || iM39007a > 2)) {
                    iMo19087c = m21606b(j76Var, sb, sb2, iMo19087c);
                }
                while (sb.length() % 3 == 1 && ((iMo19087c <= 3 && iM39007a != 1) || iMo19087c > 3)) {
                    iMo19087c = m21606b(j76Var, sb, sb2, iMo19087c);
                }
            } else if (sb.length() % 3 == 0 && py7.m44298n(j76Var.m33344d(), j76Var.f29915d, mo19088e()) != mo19088e()) {
                j76Var.m33355o(0);
                break;
            }
        }
        mo21607f(j76Var, sb);
    }

    /* renamed from: b */
    public final int m21606b(j76 j76Var, StringBuilder sb, StringBuilder sb2, int i) {
        int length = sb.length();
        sb.delete(length - i, length);
        j76Var.f29915d--;
        int iMo19087c = mo19087c(j76Var.m33343c(), sb2);
        j76Var.m33351k();
        return iMo19087c;
    }

    /* renamed from: c */
    public int mo19087c(char c, StringBuilder sb) {
        if (c == ' ') {
            sb.append((char) 3);
            return 1;
        }
        if (c >= '0' && c <= '9') {
            sb.append((char) ((c - '0') + 4));
            return 1;
        }
        if (c >= 'A' && c <= 'Z') {
            sb.append((char) ((c - 'A') + 14));
            return 1;
        }
        if (c < ' ') {
            sb.append((char) 0);
            sb.append(c);
            return 2;
        }
        if (c >= '!' && c <= '/') {
            sb.append((char) 1);
            sb.append((char) (c - '!'));
            return 2;
        }
        if (c >= ':' && c <= '@') {
            sb.append((char) 1);
            sb.append((char) ((c - ':') + 15));
            return 2;
        }
        if (c >= '[' && c <= '_') {
            sb.append((char) 1);
            sb.append((char) ((c - '[') + 22));
            return 2;
        }
        if (c < '`' || c > 127) {
            sb.append("\u0001\u001e");
            return mo19087c((char) (c - 128), sb) + 2;
        }
        sb.append((char) 2);
        sb.append((char) (c - '`'));
        return 2;
    }

    /* renamed from: e */
    public int mo19088e() {
        return 1;
    }

    /* renamed from: f */
    public void mo21607f(j76 j76Var, StringBuilder sb) {
        int length = (sb.length() / 3) << 1;
        int length2 = sb.length() % 3;
        int iM33341a = j76Var.m33341a() + length;
        j76Var.m33357q(iM33341a);
        int iM39007a = j76Var.m33347g().m39007a() - iM33341a;
        if (length2 == 2) {
            sb.append((char) 0);
            while (sb.length() >= 3) {
                m21604g(j76Var, sb);
            }
            if (j76Var.m33349i()) {
                j76Var.m33358r((char) 254);
            }
        } else if (iM39007a == 1 && length2 == 1) {
            while (sb.length() >= 3) {
                m21604g(j76Var, sb);
            }
            if (j76Var.m33349i()) {
                j76Var.m33358r((char) 254);
            }
            j76Var.f29915d--;
        } else {
            if (length2 != 0) {
                throw new IllegalStateException("Unexpected case. Please report!");
            }
            while (sb.length() >= 3) {
                m21604g(j76Var, sb);
            }
            if (iM39007a > 0 || j76Var.m33349i()) {
                j76Var.m33358r((char) 254);
            }
        }
        j76Var.m33355o(0);
    }
}
