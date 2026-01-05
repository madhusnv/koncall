package tb;

import ai.AbstractC0151h;
import kotlin.NoWhenBranchMatchedException;
import sb.C6778e;
import td.EnumC7143t;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: tb.r */
/* loaded from: classes.dex */
public abstract class AbstractC7107r {

    /* renamed from: a */
    public static final C7105p f34293a = new C7105p((byte) 0, 0);

    /* renamed from: a */
    public static final AbstractC0151h m13395a(EnumC7093d enumC7093d) {
        int i10 = AbstractC7106q.f34292a[enumC7093d.ordinal()];
        if (i10 == 1) {
            o0.U0.getClass();
            return n0.f34282b;
        }
        if (i10 != 2) {
            throw new NoWhenBranchMatchedException();
        }
        o0.U0.getClass();
        return n0.f34283c;
    }

    /* renamed from: b */
    public static final String m13396b(C7096g c7096g) {
        return ((C6778e) c7096g.f34250l).f32239a + '/' + m13397c(c7096g);
    }

    /* renamed from: c */
    public static final String m13397c(C7096g c7096g) {
        String str = c7096g.f34240b;
        String strM13409b = c7096g.f34241c.m13409b(EnumC7143t.ISO_8601_CONDENSED_DATE);
        int i10 = AbstractC7106q.f34292a[c7096g.f34243e.ordinal()];
        if (i10 != 1) {
            if (i10 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            return strM13409b + '/' + str + "/aws4_request";
        }
        return strM13409b + '/' + c7096g.f34239a + '/' + str + "/aws4_request";
    }
}
