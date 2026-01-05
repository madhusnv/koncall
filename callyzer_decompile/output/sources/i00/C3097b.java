package i00;

import a9.C0073l;
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Optional;
import k00.InterfaceC3923w;
import zj.C8986c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: i00.b */
/* loaded from: classes3.dex */
public final class C3097b extends AbstractC3105j {

    /* renamed from: a */
    public final /* synthetic */ int f16644a;

    public /* synthetic */ C3097b(int i10) {
        this.f16644a = i10;
    }

    @Override // i00.AbstractC3105j
    /* renamed from: a */
    public InterfaceC3106k mo7439a(Type type) {
        switch (this.f16644a) {
            case 0:
                if (iz.i0.class.isAssignableFrom(w0.m7469h(type))) {
                    return C3096a.f16635d;
                }
                return null;
            default:
                return super.mo7439a(type);
        }
    }

    @Override // i00.AbstractC3105j
    /* renamed from: b */
    public final InterfaceC3106k mo7440b(Type type, Annotation[] annotationArr, C0073l c0073l) {
        switch (this.f16644a) {
            case 0:
                if (type == iz.n0.class) {
                    return w0.m7472k(annotationArr, InterfaceC3923w.class) ? C3096a.f16636e : C3096a.f16634c;
                }
                if (type == Void.class) {
                    return C3096a.f16638g;
                }
                if (w0.f16762b && type == qw.a0.class) {
                    return C3096a.f16637f;
                }
                return null;
            default:
                if (w0.m7469h(type) != Optional.class) {
                    return null;
                }
                return new C8986c(23, c0073l.m197F(w0.m7468g(0, (ParameterizedType) type), annotationArr));
        }
    }
}
