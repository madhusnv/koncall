package mk;

import java.lang.reflect.AccessibleObject;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: mk.s */
/* loaded from: classes.dex */
public abstract class AbstractC4780s {

    /* renamed from: a */
    public static final AbstractC4780s f23816a;

    static {
        AbstractC4780s c4778q;
        if (AbstractC4771j.f23788a >= 9) {
            try {
                c4778q = new C4778q(AccessibleObject.class.getDeclaredMethod("canAccess", Object.class));
            } catch (NoSuchMethodException unused) {
            }
        } else {
            c4778q = null;
        }
        if (c4778q == null) {
            c4778q = new C4779r();
        }
        f23816a = c4778q;
    }

    /* renamed from: a */
    public abstract boolean mo9709a(Object obj, AccessibleObject accessibleObject);
}
