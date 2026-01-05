package i00;

import a9.C0073l;
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.concurrent.Executor;
import tb.C7105p;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: i00.m */
/* loaded from: classes3.dex */
public final class C3108m extends AbstractC3100e {

    /* renamed from: a */
    public final Executor f16673a;

    public C3108m(Executor executor) {
        this.f16673a = executor;
    }

    @Override // i00.AbstractC3100e
    /* renamed from: a */
    public final InterfaceC3101f mo7444a(Type type, Annotation[] annotationArr, C0073l c0073l) {
        if (w0.m7469h(type) != InterfaceC3099d.class) {
            return null;
        }
        if (type instanceof ParameterizedType) {
            return new C7105p(6, w0.m7468g(0, (ParameterizedType) type), w0.m7472k(annotationArr, r0.class) ? null : this.f16673a);
        }
        throw new IllegalArgumentException("Call return type must be parameterized as Call<Foo> or Call<? extends Foo>");
    }
}
