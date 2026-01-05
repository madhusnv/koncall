package mk;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Method;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: mk.q */
/* loaded from: classes.dex */
public final class C4778q extends AbstractC4780s {

    /* renamed from: b */
    public final /* synthetic */ Method f23815b;

    public C4778q(Method method) {
        this.f23815b = method;
    }

    @Override // mk.AbstractC4780s
    /* renamed from: a */
    public final boolean mo9709a(Object obj, AccessibleObject accessibleObject) {
        try {
            return ((Boolean) this.f23815b.invoke(accessibleObject, obj)).booleanValue();
        } catch (Exception e2) {
            throw new RuntimeException("Failed invoking canAccess", e2);
        }
    }
}
