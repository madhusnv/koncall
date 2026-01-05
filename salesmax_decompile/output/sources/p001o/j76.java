package p001o;

import java.nio.charset.StandardCharsets;

/* loaded from: classes6.dex */
public final class j76 {

    /* renamed from: a */
    public final String f29912a;

    /* renamed from: b */
    public ngg f29913b;

    /* renamed from: c */
    public final StringBuilder f29914c;

    /* renamed from: d */
    public int f29915d;

    /* renamed from: e */
    public int f29916e;

    /* renamed from: f */
    public mgg f29917f;

    /* renamed from: g */
    public int f29918g;

    public j76(String str) {
        byte[] bytes = str.getBytes(StandardCharsets.ISO_8859_1);
        StringBuilder sb = new StringBuilder(bytes.length);
        int length = bytes.length;
        for (int i = 0; i < length; i++) {
            char c = (char) (bytes[i] & 255);
            if (c == '?' && str.charAt(i) != '?') {
                throw new IllegalArgumentException("Message contains characters outside ISO-8859-1 encoding.");
            }
            sb.append(c);
        }
        this.f29912a = sb.toString();
        this.f29913b = ngg.FORCE_NONE;
        this.f29914c = new StringBuilder(str.length());
        this.f29916e = -1;
    }

    /* renamed from: a */
    public int m33341a() {
        return this.f29914c.length();
    }

    /* renamed from: b */
    public StringBuilder m33342b() {
        return this.f29914c;
    }

    /* renamed from: c */
    public char m33343c() {
        return this.f29912a.charAt(this.f29915d);
    }

    /* renamed from: d */
    public String m33344d() {
        return this.f29912a;
    }

    /* renamed from: e */
    public int m33345e() {
        return this.f29916e;
    }

    /* renamed from: f */
    public int m33346f() {
        return m33348h() - this.f29915d;
    }

    /* renamed from: g */
    public mgg m33347g() {
        return this.f29917f;
    }

    /* renamed from: h */
    public final int m33348h() {
        return this.f29912a.length() - this.f29918g;
    }

    /* renamed from: i */
    public boolean m33349i() {
        return this.f29915d < m33348h();
    }

    /* renamed from: j */
    public void m33350j() {
        this.f29916e = -1;
    }

    /* renamed from: k */
    public void m33351k() {
        this.f29917f = null;
    }

    /* renamed from: l */
    public void m33352l(ft5 ft5Var, ft5 ft5Var2) {
    }

    /* renamed from: m */
    public void m33353m(int i) {
        this.f29918g = i;
    }

    /* renamed from: n */
    public void m33354n(ngg nggVar) {
        this.f29913b = nggVar;
    }

    /* renamed from: o */
    public void m33355o(int i) {
        this.f29916e = i;
    }

    /* renamed from: p */
    public void m33356p() {
        m33357q(m33341a());
    }

    /* renamed from: q */
    public void m33357q(int i) {
        mgg mggVar = this.f29917f;
        if (mggVar == null || i > mggVar.m39007a()) {
            this.f29917f = mgg.m39006l(i, this.f29913b, null, null, true);
        }
    }

    /* renamed from: r */
    public void m33358r(char c) {
        this.f29914c.append(c);
    }

    /* renamed from: s */
    public void m33359s(String str) {
        this.f29914c.append(str);
    }
}
