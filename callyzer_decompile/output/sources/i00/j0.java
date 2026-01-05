package i00;

import android.os.Build;
import java.lang.reflect.Method;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final class j0 extends C3096a {
    @Override // i00.C3096a
    /* renamed from: e */
    public final Object mo7436e(Method method, Class cls, Object obj, Object[] objArr) {
        if (Build.VERSION.SDK_INT >= 26) {
            return AbstractC3109n.m7452a(method, cls, obj, objArr);
        }
        throw new UnsupportedOperationException("Calling default methods on API 24 and 25 is not supported");
    }

    @Override // i00.C3096a
    /* renamed from: f */
    public final boolean mo7437f(Method method) {
        return method.isDefault();
    }
}
