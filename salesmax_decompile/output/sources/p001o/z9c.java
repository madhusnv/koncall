package p001o;

import java.util.Arrays;

/* loaded from: classes2.dex */
public final class z9c {

    /* renamed from: a */
    public final aac f56745a = new aac();

    /* renamed from: b */
    public final zwc f56746b = new zwc(new byte[65025], 0);

    /* renamed from: c */
    public int f56747c = -1;

    /* renamed from: d */
    public int f56748d;

    /* renamed from: e */
    public boolean f56749e;

    /* renamed from: a */
    public final int m58986a(int i) {
        int i2;
        int i3 = 0;
        this.f56748d = 0;
        do {
            int i4 = this.f56748d;
            int i5 = i + i4;
            aac aacVar = this.f56745a;
            if (i5 >= aacVar.f14388g) {
                break;
            }
            int[] iArr = aacVar.f14391j;
            this.f56748d = i4 + 1;
            i2 = iArr[i4 + i];
            i3 += i2;
        } while (i2 == 255);
        return i3;
    }

    /* renamed from: b */
    public aac m58987b() {
        return this.f56745a;
    }

    /* renamed from: c */
    public zwc m58988c() {
        return this.f56746b;
    }

    /* renamed from: d */
    public boolean m58989d(uq6 uq6Var) {
        int i;
        op0.m42517g(uq6Var != null);
        if (this.f56749e) {
            this.f56749e = false;
            this.f56746b.m60013Q(0);
        }
        while (!this.f56749e) {
            if (this.f56747c < 0) {
                if (!this.f56745a.m16770c(uq6Var) || !this.f56745a.m16768a(uq6Var, true)) {
                    return false;
                }
                aac aacVar = this.f56745a;
                int iM58986a = aacVar.f14389h;
                if ((aacVar.f14383b & 1) == 1 && this.f56746b.m60026g() == 0) {
                    iM58986a += m58986a(0);
                    i = this.f56748d + 0;
                } else {
                    i = 0;
                }
                if (!wq6.m54807e(uq6Var, iM58986a)) {
                    return false;
                }
                this.f56747c = i;
            }
            int iM58986a2 = m58986a(this.f56747c);
            int i2 = this.f56747c + this.f56748d;
            if (iM58986a2 > 0) {
                zwc zwcVar = this.f56746b;
                zwcVar.m60022c(zwcVar.m60026g() + iM58986a2);
                if (!wq6.m54806d(uq6Var, this.f56746b.m60024e(), this.f56746b.m60026g(), iM58986a2)) {
                    return false;
                }
                zwc zwcVar2 = this.f56746b;
                zwcVar2.m60016T(zwcVar2.m60026g() + iM58986a2);
                this.f56749e = this.f56745a.f14391j[i2 + (-1)] != 255;
            }
            if (i2 == this.f56745a.f14388g) {
                i2 = -1;
            }
            this.f56747c = i2;
        }
        return true;
    }

    /* renamed from: e */
    public void m58990e() {
        this.f56745a.m16769b();
        this.f56746b.m60013Q(0);
        this.f56747c = -1;
        this.f56749e = false;
    }

    /* renamed from: f */
    public void m58991f() {
        if (this.f56746b.m60024e().length == 65025) {
            return;
        }
        zwc zwcVar = this.f56746b;
        zwcVar.m60015S(Arrays.copyOf(zwcVar.m60024e(), Math.max(65025, this.f56746b.m60026g())), this.f56746b.m60026g());
    }
}
