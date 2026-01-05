package i00;

import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final class k0 extends C3096a {
    @Override // i00.C3096a
    /* renamed from: d */
    public final String mo7435d(int i10, Method method) {
        Parameter parameter = method.getParameters()[i10];
        if (!parameter.isNamePresent()) {
            return super.mo7435d(i10, method);
        }
        return "parameter '" + parameter.getName() + '\'';
    }

    @Override // i00.C3096a
    /* renamed from: e */
    public final Object mo7436e(Method method, Class cls, Object obj, Object[] objArr) {
        return AbstractC3109n.m7452a(method, cls, obj, objArr);
    }

    @Override // i00.C3096a
    /* renamed from: f */
    public final boolean mo7437f(Method method) {
        return method.isDefault();
    }
}
