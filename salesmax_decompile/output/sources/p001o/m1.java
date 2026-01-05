package p001o;

/* loaded from: classes6.dex */
public final class m1 implements f76 {
    /* renamed from: b */
    public static char m38155b(char c, char c2) {
        if (py7.m44290f(c) && py7.m44290f(c2)) {
            return (char) (((c - '0') * 10) + (c2 - '0') + 130);
        }
        throw new IllegalArgumentException("not digits: " + c + c2);
    }

    @Override // p001o.f76
    /* renamed from: a */
    public void mo21605a(j76 j76Var) {
        if (py7.m44285a(j76Var.m33344d(), j76Var.f29915d) >= 2) {
            j76Var.m33358r(m38155b(j76Var.m33344d().charAt(j76Var.f29915d), j76Var.m33344d().charAt(j76Var.f29915d + 1)));
            j76Var.f29915d += 2;
            return;
        }
        char cM33343c = j76Var.m33343c();
        int iM44298n = py7.m44298n(j76Var.m33344d(), j76Var.f29915d, m38156c());
        if (iM44298n == m38156c()) {
            if (!py7.m44291g(cM33343c)) {
                j76Var.m33358r((char) (cM33343c + 1));
                j76Var.f29915d++;
                return;
            } else {
                j76Var.m33358r((char) 235);
                j76Var.m33358r((char) ((cM33343c - 128) + 1));
                j76Var.f29915d++;
                return;
            }
        }
        if (iM44298n == 1) {
            j76Var.m33358r((char) 230);
            j76Var.m33355o(1);
            return;
        }
        if (iM44298n == 2) {
            j76Var.m33358r((char) 239);
            j76Var.m33355o(2);
            return;
        }
        if (iM44298n == 3) {
            j76Var.m33358r((char) 238);
            j76Var.m33355o(3);
        } else if (iM44298n == 4) {
            j76Var.m33358r((char) 240);
            j76Var.m33355o(4);
        } else {
            if (iM44298n != 5) {
                throw new IllegalStateException("Illegal mode: ".concat(String.valueOf(iM44298n)));
            }
            j76Var.m33358r((char) 231);
            j76Var.m33355o(5);
        }
    }

    /* renamed from: c */
    public int m38156c() {
        return 0;
    }
}
