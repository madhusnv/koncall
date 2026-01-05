package i00;

import a9.C0073l;
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.concurrent.CompletableFuture;
import nf.C5047i;
import zj.C8986c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: i00.i */
/* loaded from: classes3.dex */
public final class C3104i extends AbstractC3100e {
    @Override // i00.AbstractC3100e
    /* renamed from: a */
    public final InterfaceC3101f mo7444a(Type type, Annotation[] annotationArr, C0073l c0073l) {
        if (w0.m7469h(type) != CompletableFuture.class) {
            return null;
        }
        if (!(type instanceof ParameterizedType)) {
            throw new IllegalStateException("CompletableFuture return type must be parameterized as CompletableFuture<Foo> or CompletableFuture<? extends Foo>");
        }
        Type typeM7468g = w0.m7468g(0, (ParameterizedType) type);
        if (w0.m7469h(typeM7468g) != p0.class) {
            return new C8986c(22, typeM7468g);
        }
        if (!(typeM7468g instanceof ParameterizedType)) {
            throw new IllegalStateException("Response must be parameterized as Response<Foo> or Response<? extends Foo>");
        }
        return new C5047i(24, w0.m7468g(0, (ParameterizedType) typeM7468g));
    }
}
