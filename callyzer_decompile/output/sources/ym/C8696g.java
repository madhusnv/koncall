package ym;

import a9.C0073l;
import c9.C0919n;
import i00.AbstractC3100e;
import i00.InterfaceC3099d;
import i00.InterfaceC3101f;
import i00.InterfaceC3106k;
import i00.w0;
import im.f1;
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import kotlin.jvm.internal.AbstractC4154l;
import pw.InterfaceC6043a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ym.g */
/* loaded from: classes3.dex */
public final class C8696g extends AbstractC3100e {

    /* renamed from: a */
    public final InterfaceC6043a f42065a;

    /* renamed from: b */
    public final InterfaceC6043a f42066b;

    public C8696g(InterfaceC6043a deviceDeleteManager, InterfaceC6043a leadSubscriptionExpireManager) {
        AbstractC4154l.m8923f(deviceDeleteManager, "deviceDeleteManager");
        AbstractC4154l.m8923f(leadSubscriptionExpireManager, "leadSubscriptionExpireManager");
        this.f42065a = deviceDeleteManager;
        this.f42066b = leadSubscriptionExpireManager;
    }

    @Override // i00.AbstractC3100e
    /* renamed from: a */
    public final InterfaceC3101f mo7444a(Type returnType, Annotation[] annotations, C0073l c0073l) {
        AbstractC4154l.m8923f(returnType, "returnType");
        AbstractC4154l.m8923f(annotations, "annotations");
        if (!InterfaceC3099d.class.equals(w0.m7469h(returnType))) {
            return null;
        }
        if (!(returnType instanceof ParameterizedType)) {
            throw new IllegalStateException("return type must be parameterized as Call<NetworkResponse<<Foo>> or Call<NetworkResponse<out Foo>>");
        }
        Type typeM7468g = w0.m7468g(0, (ParameterizedType) returnType);
        if (!AbstractC4154l.m8918a(w0.m7469h(typeM7468g), f1.class)) {
            return null;
        }
        if (!(typeM7468g instanceof ParameterizedType)) {
            throw new IllegalStateException("Response must be parameterized as NetworkResponse<Foo> or NetworkResponse<out Foo>");
        }
        Type typeM7468g2 = w0.m7468g(0, (ParameterizedType) typeM7468g);
        InterfaceC3106k interfaceC3106kM197F = c0073l.m197F(typeM7468g2, annotations);
        InterfaceC6043a deviceDeleteManager = this.f42065a;
        AbstractC4154l.m8923f(deviceDeleteManager, "deviceDeleteManager");
        InterfaceC6043a leadSubscriptionExpireManager = this.f42066b;
        AbstractC4154l.m8923f(leadSubscriptionExpireManager, "leadSubscriptionExpireManager");
        C0919n c0919n = new C0919n();
        c0919n.f5598a = typeM7468g2;
        c0919n.f5599b = interfaceC3106kM197F;
        c0919n.f5600c = deviceDeleteManager;
        c0919n.f5601d = leadSubscriptionExpireManager;
        return c0919n;
    }
}
