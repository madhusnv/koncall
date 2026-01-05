package pg;

import fd.C2271i;
import fd.InterfaceC2265c;
import id.C3236f;
import java.util.Iterator;
import jc.AbstractC3745u;
import jc.C3742r;
import jc.C3743s;
import kotlin.jvm.internal.AbstractC4154l;
import uc.C7394a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public abstract class j6 {
    /* renamed from: a */
    public static final C3236f m11709a(C2271i c2271i) {
        Object next;
        Iterator it = c2271i.f10280c.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((InterfaceC2265c) next).getClass() == C3236f.class) {
                break;
            }
        }
        InterfaceC2265c interfaceC2265c = (InterfaceC2265c) next;
        if (interfaceC2265c != null) {
            return (C3236f) interfaceC2265c;
        }
        throw new IllegalArgumentException(("Expected to find trait " + kotlin.jvm.internal.a0.m8901a(C3236f.class) + " in " + c2271i + " but was not present.").toString());
    }

    /* renamed from: b */
    public static final C7394a m11710b(C7394a c7394a, byte[] bArr) {
        AbstractC3745u abstractC3745uM8277a;
        AbstractC4154l.m8923f(c7394a, "<this>");
        if (bArr != null) {
            AbstractC3745u.Companion.getClass();
            abstractC3745uM8277a = C3742r.m8277a(bArr);
        } else {
            abstractC3745uM8277a = C3743s.f19596a;
        }
        return AbstractC5945z.m11956a(c7394a.f35158a, c7394a.f35159b, abstractC3745uM8277a);
    }
}
