package p001o;

/* loaded from: classes6.dex */
public final class jdj extends cr1 {
    @Override // p001o.cr1, p001o.f76
    /* renamed from: a */
    public void mo21605a(j76 j76Var) {
        StringBuilder sb = new StringBuilder();
        while (true) {
            if (!j76Var.m33349i()) {
                break;
            }
            char cM33343c = j76Var.m33343c();
            j76Var.f29915d++;
            mo19087c(cM33343c, sb);
            if (sb.length() % 3 == 0) {
                cr1.m21604g(j76Var, sb);
                if (py7.m44298n(j76Var.m33344d(), j76Var.f29915d, mo19088e()) != mo19088e()) {
                    j76Var.m33355o(0);
                    break;
                }
            }
        }
        mo21607f(j76Var, sb);
    }

    @Override // p001o.cr1
    /* renamed from: c */
    public int mo19087c(char c, StringBuilder sb) {
        if (c == '\r') {
            sb.append((char) 0);
        } else if (c == ' ') {
            sb.append((char) 3);
        } else if (c == '*') {
            sb.append((char) 1);
        } else if (c == '>') {
            sb.append((char) 2);
        } else if (c >= '0' && c <= '9') {
            sb.append((char) ((c - '0') + 4));
        } else if (c < 'A' || c > 'Z') {
            py7.m44289e(c);
        } else {
            sb.append((char) ((c - 'A') + 14));
        }
        return 1;
    }

    @Override // p001o.cr1
    /* renamed from: e */
    public int mo19088e() {
        return 3;
    }

    @Override // p001o.cr1
    /* renamed from: f */
    public void mo21607f(j76 j76Var, StringBuilder sb) {
        j76Var.m33356p();
        int iM39007a = j76Var.m33347g().m39007a() - j76Var.m33341a();
        j76Var.f29915d -= sb.length();
        if (j76Var.m33346f() > 1 || iM39007a > 1 || j76Var.m33346f() != iM39007a) {
            j76Var.m33358r((char) 254);
        }
        if (j76Var.m33345e() < 0) {
            j76Var.m33355o(0);
        }
    }
}
