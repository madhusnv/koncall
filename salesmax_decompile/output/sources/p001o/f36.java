package p001o;

import com.google.firebase.perf.util.Constants;

/* loaded from: classes6.dex */
public final class f36 implements f76 {
    /* renamed from: b */
    public static void m26024b(char c, StringBuilder sb) {
        if (c >= ' ' && c <= '?') {
            sb.append(c);
        } else if (c < '@' || c > '^') {
            py7.m44289e(c);
        } else {
            sb.append((char) (c - '@'));
        }
    }

    /* renamed from: c */
    public static String m26025c(CharSequence charSequence, int i) {
        int length = charSequence.length() - i;
        if (length == 0) {
            throw new IllegalStateException("StringBuilder must not be empty");
        }
        int iCharAt = (charSequence.charAt(i) << 18) + ((length >= 2 ? charSequence.charAt(i + 1) : (char) 0) << '\f') + ((length >= 3 ? charSequence.charAt(i + 2) : (char) 0) << 6) + (length >= 4 ? charSequence.charAt(i + 3) : (char) 0);
        char c = (char) ((iCharAt >> 16) & Constants.MAX_HOST_LENGTH);
        char c2 = (char) ((iCharAt >> 8) & Constants.MAX_HOST_LENGTH);
        char c3 = (char) (iCharAt & Constants.MAX_HOST_LENGTH);
        StringBuilder sb = new StringBuilder(3);
        sb.append(c);
        if (length >= 2) {
            sb.append(c2);
        }
        if (length >= 3) {
            sb.append(c3);
        }
        return sb.toString();
    }

    /* renamed from: e */
    public static void m26026e(j76 j76Var, CharSequence charSequence) {
        try {
            int length = charSequence.length();
            if (length == 0) {
                return;
            }
            boolean z = true;
            if (length == 1) {
                j76Var.m33356p();
                int iM39007a = j76Var.m33347g().m39007a() - j76Var.m33341a();
                int iM33346f = j76Var.m33346f();
                if (iM33346f > iM39007a) {
                    j76Var.m33357q(j76Var.m33341a() + 1);
                    iM39007a = j76Var.m33347g().m39007a() - j76Var.m33341a();
                }
                if (iM33346f <= iM39007a && iM39007a <= 2) {
                    return;
                }
            }
            if (length > 4) {
                throw new IllegalStateException("Count must not exceed 4");
            }
            int i = length - 1;
            String strM26025c = m26025c(charSequence, 0);
            if (!(!j76Var.m33349i()) || i > 2) {
                z = false;
            }
            if (i <= 2) {
                j76Var.m33357q(j76Var.m33341a() + i);
                if (j76Var.m33347g().m39007a() - j76Var.m33341a() >= 3) {
                    j76Var.m33357q(j76Var.m33341a() + strM26025c.length());
                    z = false;
                }
            }
            if (z) {
                j76Var.m33351k();
                j76Var.f29915d -= i;
            } else {
                j76Var.m33359s(strM26025c);
            }
        } finally {
            j76Var.m33355o(0);
        }
    }

    @Override // p001o.f76
    /* renamed from: a */
    public void mo21605a(j76 j76Var) {
        StringBuilder sb = new StringBuilder();
        while (true) {
            if (!j76Var.m33349i()) {
                break;
            }
            m26024b(j76Var.m33343c(), sb);
            j76Var.f29915d++;
            if (sb.length() >= 4) {
                j76Var.m33359s(m26025c(sb, 0));
                sb.delete(0, 4);
                if (py7.m44298n(j76Var.m33344d(), j76Var.f29915d, m26027d()) != m26027d()) {
                    j76Var.m33355o(0);
                    break;
                }
            }
        }
        sb.append((char) 31);
        m26026e(j76Var, sb);
    }

    /* renamed from: d */
    public int m26027d() {
        return 4;
    }
}
