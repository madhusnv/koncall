package mk;

import com.google.android.gms.internal.measurement.j4;
import java.lang.reflect.Method;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: mk.t */
/* loaded from: classes.dex */
public final class C4781t extends AbstractC4785x {

    /* renamed from: b */
    public final /* synthetic */ Method f23817b;

    /* renamed from: c */
    public final /* synthetic */ Object f23818c;

    public C4781t(Method method, Object obj) {
        this.f23817b = method;
        this.f23818c = obj;
    }

    @Override // mk.AbstractC4785x
    /* renamed from: a */
    public final Object mo9710a(Class cls) {
        String strM3388i = j4.m3388i(cls);
        if (strM3388i != null) {
            throw new AssertionError("UnsafeAllocator is used for non-instantiable type: ".concat(strM3388i));
        }
        return this.f23817b.invoke(this.f23818c, cls);
    }
}
