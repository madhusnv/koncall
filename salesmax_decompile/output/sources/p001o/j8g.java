package p001o;

import org.apache.http.message.TokenParser;

/* loaded from: classes6.dex */
public final class j8g extends a8 {

    /* renamed from: e */
    public final String f29968e;

    public j8g(String str) {
        sq8.m48649h(str, "source");
        this.f29968e = str;
    }

    @Override // p001o.a8
    /* renamed from: E */
    public String mo16588E(String str, boolean z) {
        sq8.m48649h(str, "keyToMatch");
        int i = this.f14266a;
        try {
            if (mo16609j() == 6 && sq8.m48644c(m16590G(z), str)) {
                m16618t();
                if (mo16609j() == 5) {
                    return m16590G(z);
                }
            }
            return null;
        } finally {
            this.f14266a = i;
            m16618t();
        }
    }

    @Override // p001o.a8
    /* renamed from: H */
    public int mo16591H(int i) {
        if (i < mo16586C().length()) {
            return i;
        }
        return -1;
    }

    @Override // p001o.a8
    /* renamed from: J */
    public int mo16593J() {
        char cCharAt;
        int i = this.f14266a;
        if (i == -1) {
            return i;
        }
        while (i < mo16586C().length() && ((cCharAt = mo16586C().charAt(i)) == ' ' || cCharAt == '\n' || cCharAt == '\r' || cCharAt == '\t')) {
            i++;
        }
        this.f14266a = i;
        return i;
    }

    @Override // p001o.a8
    /* renamed from: M */
    public boolean mo16596M() {
        int iMo16593J = mo16593J();
        if (iMo16593J == mo16586C().length() || iMo16593J == -1 || mo16586C().charAt(iMo16593J) != ',') {
            return false;
        }
        this.f14266a++;
        return true;
    }

    @Override // p001o.a8
    /* renamed from: R, reason: merged with bridge method [inline-methods] */
    public String mo16586C() {
        return this.f29968e;
    }

    @Override // p001o.a8
    /* renamed from: e */
    public boolean mo16604e() {
        int i = this.f14266a;
        if (i == -1) {
            return false;
        }
        while (i < mo16586C().length()) {
            char cCharAt = mo16586C().charAt(i);
            if (cCharAt != ' ' && cCharAt != '\n' && cCharAt != '\r' && cCharAt != '\t') {
                this.f14266a = i;
                return m16587D(cCharAt);
            }
            i++;
        }
        this.f14266a = i;
        return false;
    }

    @Override // p001o.a8
    /* renamed from: i */
    public String mo16608i() {
        mo16611l(TokenParser.DQUOTE);
        int i = this.f14266a;
        int iA0 = f9g.a0(mo16586C(), TokenParser.DQUOTE, i, false, 4, null);
        if (iA0 == -1) {
            m16615q();
            m16622y((byte) 1, false);
            throw new qe9();
        }
        for (int i2 = i; i2 < iA0; i2++) {
            if (mo16586C().charAt(i2) == '\\') {
                return m16614p(mo16586C(), this.f14266a, i2);
            }
        }
        this.f14266a = iA0 + 1;
        String strSubstring = mo16586C().substring(i, iA0);
        sq8.m48648g(strSubstring, "substring(...)");
        return strSubstring;
    }

    @Override // p001o.a8
    /* renamed from: j */
    public byte mo16609j() {
        byte bM18263a;
        String strMo16586C = mo16586C();
        do {
            int i = this.f14266a;
            if (i == -1 || i >= strMo16586C.length()) {
                return (byte) 10;
            }
            int i2 = this.f14266a;
            this.f14266a = i2 + 1;
            bM18263a = b8.m18263a(strMo16586C.charAt(i2));
        } while (bM18263a == 3);
        return bM18263a;
    }

    @Override // p001o.a8
    /* renamed from: l */
    public void mo16611l(char c) {
        if (this.f14266a == -1) {
            m16598P(c);
        }
        String strMo16586C = mo16586C();
        while (this.f14266a < strMo16586C.length()) {
            int i = this.f14266a;
            this.f14266a = i + 1;
            char cCharAt = strMo16586C.charAt(i);
            if (cCharAt != ' ' && cCharAt != '\n' && cCharAt != '\r' && cCharAt != '\t') {
                if (cCharAt == c) {
                    return;
                } else {
                    m16598P(c);
                }
            }
        }
        this.f14266a = -1;
        m16598P(c);
    }
}
