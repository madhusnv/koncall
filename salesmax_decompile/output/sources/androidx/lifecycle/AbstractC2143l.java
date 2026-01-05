package androidx.lifecycle;

import p001o.ec3;
import p001o.eu5;
import p001o.gdg;
import p001o.sq8;
import p001o.tca;

/* renamed from: androidx.lifecycle.l */
/* loaded from: classes2.dex */
public abstract class AbstractC2143l {
    /* renamed from: a */
    public static final tca m6533a(AbstractC2139h abstractC2139h) {
        C2140i c2140i;
        sq8.m48649h(abstractC2139h, "<this>");
        do {
            C2140i c2140i2 = (C2140i) abstractC2139h.m6523c().get();
            if (c2140i2 != null) {
                return c2140i2;
            }
            c2140i = new C2140i(abstractC2139h, gdg.m28505b(null, 1, null).plus(eu5.m25612c().r0()));
        } while (!ec3.m24748a(abstractC2139h.m6523c(), null, c2140i));
        c2140i.m6531b();
        return c2140i;
    }
}
