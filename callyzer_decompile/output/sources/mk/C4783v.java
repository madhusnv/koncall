package mk;

import com.google.android.gms.internal.measurement.j4;
import java.lang.reflect.Method;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: mk.v */
/* loaded from: classes.dex */
public final class C4783v extends AbstractC4785x {

    /* renamed from: b */
    public final /* synthetic */ Method f23821b;

    public C4783v(Method method) {
        this.f23821b = method;
    }

    @Override // mk.AbstractC4785x
    /* renamed from: a */
    public final Object mo9710a(Class cls) {
        String strM3388i = j4.m3388i(cls);
        if (strM3388i != null) {
            throw new AssertionError("UnsafeAllocator is used for non-instantiable type: ".concat(strM3388i));
        }
        return this.f23821b.invoke(null, cls, Object.class);
    }
}
