package p001o;

import org.objectweb.asm.Opcodes;

/* loaded from: classes6.dex */
public final class tb8 {

    /* renamed from: a */
    public final String f46771a;

    /* renamed from: b */
    public final String f46772b;

    /* renamed from: c */
    public final String f46773c;

    public tb8(String str, String str2, String str3) {
        sq8.m48649h(str, "sections");
        sq8.m48649h(str2, "ranges");
        sq8.m48649h(str3, "mappings");
        this.f46771a = str;
        this.f46772b = str2;
        this.f46773c = str3;
    }

    /* renamed from: a */
    public final int m49689a(int i, int i2, int i3) {
        int i4;
        int i5 = i & Opcodes.LAND;
        int i6 = i3 - 1;
        while (true) {
            if (i2 > i6) {
                i4 = (-i2) - 1;
                break;
            }
            i4 = (i2 + i6) / 2;
            int iM48651j = sq8.m48651j(i5, this.f46772b.charAt(i4 * 4));
            if (iM48651j >= 0) {
                if (iM48651j <= 0) {
                    break;
                }
                i2 = i4 + 1;
            } else {
                i6 = i4 - 1;
            }
        }
        return i4 >= 0 ? i4 * 4 : ((-i4) - 2) * 4;
    }

    /* renamed from: b */
    public final int m49690b(int i) {
        int i2;
        int i3 = (i & 2097024) >> 7;
        int length = (this.f46771a.length() / 4) - 1;
        int i4 = 0;
        while (true) {
            if (i4 > length) {
                i2 = (-i4) - 1;
                break;
            }
            i2 = (i4 + length) / 2;
            int iM48651j = sq8.m48651j(i3, vb8.m52506a(this.f46771a, i2 * 4));
            if (iM48651j >= 0) {
                if (iM48651j <= 0) {
                    break;
                }
                i4 = i2 + 1;
            } else {
                length = i2 - 1;
            }
        }
        return i2 >= 0 ? i2 * 4 : ((-i2) - 2) * 4;
    }

    /* renamed from: c */
    public final boolean m49691c(int i, gm1 gm1Var) {
        sq8.m48649h(gm1Var, "sink");
        int iM49690b = m49690b(i);
        int iM49689a = m49689a(i, vb8.m52506a(this.f46771a, iM49690b + 2), iM49690b + 4 < this.f46771a.length() ? vb8.m52506a(this.f46771a, iM49690b + 6) : this.f46772b.length() / 4);
        char cCharAt = this.f46772b.charAt(iM49689a + 1);
        if (cCharAt >= 0 && cCharAt < '@') {
            int iM52506a = vb8.m52506a(this.f46772b, iM49689a + 2);
            gm1Var.mo29025i(this.f46773c, iM52506a, cCharAt + iM52506a);
        } else {
            if ('@' <= cCharAt && cCharAt < 'P') {
                gm1Var.mo29022G(i - (this.f46772b.charAt(iM49689a + 3) | (((cCharAt & 15) << 14) | (this.f46772b.charAt(iM49689a + 2) << 7))));
            } else {
                if ('P' <= cCharAt && cCharAt < '`') {
                    gm1Var.mo29022G(i + (this.f46772b.charAt(iM49689a + 3) | ((cCharAt & 15) << 14) | (this.f46772b.charAt(iM49689a + 2) << 7)));
                } else if (cCharAt != 'w') {
                    if (cCharAt == 'x') {
                        gm1Var.mo29022G(i);
                    } else {
                        if (cCharAt == 'y') {
                            gm1Var.mo29022G(i);
                            return false;
                        }
                        if (cCharAt == 'z') {
                            gm1Var.T1(this.f46772b.charAt(iM49689a + 2));
                        } else if (cCharAt == '{') {
                            gm1Var.T1(this.f46772b.charAt(iM49689a + 2) | 128);
                        } else if (cCharAt == '|') {
                            gm1Var.T1(this.f46772b.charAt(iM49689a + 2));
                            gm1Var.T1(this.f46772b.charAt(iM49689a + 3));
                        } else if (cCharAt == '}') {
                            gm1Var.T1(this.f46772b.charAt(iM49689a + 2) | 128);
                            gm1Var.T1(this.f46772b.charAt(iM49689a + 3));
                        } else if (cCharAt == '~') {
                            gm1Var.T1(this.f46772b.charAt(iM49689a + 2));
                            gm1Var.T1(this.f46772b.charAt(iM49689a + 3) | 128);
                        } else {
                            if (cCharAt != 127) {
                                throw new IllegalStateException(("unexpected rangesIndex for " + i).toString());
                            }
                            gm1Var.T1(this.f46772b.charAt(iM49689a + 2) | 128);
                            gm1Var.T1(this.f46772b.charAt(iM49689a + 3) | 128);
                        }
                    }
                }
            }
        }
        return true;
    }
}
