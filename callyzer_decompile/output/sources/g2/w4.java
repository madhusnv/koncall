package g2;

import com.sun.mail.util.AbstractC1452a;
import g4.C2492h;
import h2.C2811p;
import nf.C5047i;
import nx.AbstractC5178p;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class w4 implements l4.k0 {

    /* renamed from: a */
    public final C2811p f13107a;

    /* renamed from: b */
    public final int f13108b;

    /* renamed from: c */
    public final int f13109c;

    /* renamed from: d */
    public final int f13110d;

    /* renamed from: e */
    public final C5047i f13111e;

    public w4(C2811p c2811p) {
        this.f13107a = c2811p;
        String str = c2811p.f15757a;
        char c2 = c2811p.f15758b;
        this.f13108b = AbstractC5178p.m10098I(str, c2, 0, 6);
        this.f13109c = AbstractC5178p.m10103N(str, c2, 0, 6);
        this.f13110d = c2811p.f15759c.length();
        this.f13111e = new C5047i(15, this);
    }

    @Override // l4.k0
    /* renamed from: y */
    public final l4.i0 mo6334y(C2492h c2492h) {
        String strM10114Y = c2492h.f13620b;
        int length = strM10114Y.length();
        int i10 = 0;
        int i11 = this.f13110d;
        if (length > i11) {
            strM10114Y = AbstractC5178p.m10114Y(strM10114Y, pg.w9.m11919j(0, i11));
        }
        String string = "";
        int i12 = 0;
        while (i10 < strM10114Y.length()) {
            int i13 = i12 + 1;
            string = string + strM10114Y.charAt(i10);
            if (i13 == this.f13108b || i12 + 2 == this.f13109c) {
                StringBuilder sbM4568o = AbstractC1452a.m4568o(string);
                sbM4568o.append(this.f13107a.f15758b);
                string = sbM4568o.toString();
            }
            i10++;
            i12 = i13;
        }
        return new l4.i0(new C2492h(6, string, null), this.f13111e);
    }
}
