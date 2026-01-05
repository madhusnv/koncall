package ec;

import ex.InterfaceC2141e;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AbstractC4154l;
import rw.AbstractC6663m;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ec.u */
/* loaded from: classes.dex */
public interface InterfaceC2023u {
    /* renamed from: a */
    Set mo5747a();

    /* renamed from: b */
    default void m5748b(InterfaceC2141e interfaceC2141e) {
        for (Map.Entry entry : mo5747a()) {
            interfaceC2141e.invoke((String) entry.getKey(), (List) entry.getValue());
        }
    }

    /* renamed from: c */
    boolean mo5749c();

    boolean contains(String str);

    /* renamed from: d */
    List mo5750d(String str);

    default Object get(String name) {
        AbstractC4154l.m8923f(name, "name");
        List listMo5750d = mo5750d(name);
        if (listMo5750d != null) {
            return AbstractC6663m.m12743G(listMo5750d);
        }
        return null;
    }

    boolean isEmpty();

    Set names();
}
