package pg;

import iy.InterfaceC3366c;
import iy.InterfaceC3367d;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC4154l;
import ky.InterfaceC4279k;
import ly.C4597u;
import nx.AbstractC5178p;
import zc.AbstractC8927d;
import zc.C8925b;
import zc.C8926c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public abstract class x9 {
    /* renamed from: a */
    public static final void m11933a(InterfaceC3367d interfaceC3367d) {
        AbstractC4154l.m8923f(interfaceC3367d, "<this>");
        if ((interfaceC3367d instanceof C4597u ? (C4597u) interfaceC3367d : null) != null) {
            return;
        }
        throw new IllegalStateException("This serializer can be used only with Json format.Expected Encoder to be JsonEncoder, got " + kotlin.jvm.internal.a0.m8901a(interfaceC3367d.getClass()));
    }

    /* renamed from: b */
    public static final InterfaceC4279k m11934b(InterfaceC3366c interfaceC3366c) {
        AbstractC4154l.m8923f(interfaceC3366c, "<this>");
        InterfaceC4279k interfaceC4279k = interfaceC3366c instanceof InterfaceC4279k ? (InterfaceC4279k) interfaceC3366c : null;
        if (interfaceC4279k != null) {
            return interfaceC4279k;
        }
        throw new IllegalStateException("This serializer can be used only with Json format.Expected Decoder to be JsonDecoder, got " + kotlin.jvm.internal.a0.m8901a(interfaceC3366c.getClass()));
    }

    /* renamed from: c */
    public static AbstractC8927d m11935c(String host) {
        AbstractC4154l.m8923f(host, "host");
        z9 z9VarM11558f = ba.m11558f(host);
        if (z9VarM11558f == null) {
            z9VarM11558f = ba.m11559g(host);
        }
        if (z9VarM11558f != null) {
            return new C8926c(z9VarM11558f);
        }
        List listM10111V = AbstractC5178p.m10111V(host, new char[]{'.'}, 0, 6);
        if (!listM10111V.isEmpty()) {
            Iterator it = listM10111V.iterator();
            while (it.hasNext()) {
                if (!ba.m11557e((String) it.next())) {
                    throw new IllegalArgumentException(host.concat(" is not a valid inet host"));
                }
            }
        }
        return new C8925b(host);
    }
}
