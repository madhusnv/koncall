package jy;

import fy.InterfaceC2401a;
import hy.InterfaceC3055f;
import iy.InterfaceC3365b;
import iy.InterfaceC3366c;
import iy.InterfaceC3367d;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC4154l;
import ly.C4597u;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public abstract class s0 extends AbstractC3877n {

    /* renamed from: b */
    public final r0 f19962b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s0(InterfaceC2401a primitiveSerializer) {
        super(primitiveSerializer);
        AbstractC4154l.m8923f(primitiveSerializer, "primitiveSerializer");
        this.f19962b = new r0(primitiveSerializer.getDescriptor());
    }

    @Override // jy.AbstractC3864a
    /* renamed from: a */
    public final Object mo8406a() {
        return (q0) mo8412g(mo8418j());
    }

    @Override // jy.AbstractC3864a
    /* renamed from: b */
    public final int mo8407b(Object obj) {
        q0 q0Var = (q0) obj;
        AbstractC4154l.m8923f(q0Var, "<this>");
        return q0Var.mo8416d();
    }

    @Override // jy.AbstractC3864a
    /* renamed from: c */
    public final Iterator mo8408c(Object obj) {
        throw new IllegalStateException("This method lead to boxing and must not be used, use writeContents instead");
    }

    @Override // jy.AbstractC3864a, fy.InterfaceC2401a
    public final Object deserialize(InterfaceC3366c interfaceC3366c) {
        return m8410e(interfaceC3366c);
    }

    @Override // fy.InterfaceC2401a
    public final InterfaceC3055f getDescriptor() {
        return this.f19962b;
    }

    @Override // jy.AbstractC3864a
    /* renamed from: h */
    public final Object mo8413h(Object obj) {
        q0 q0Var = (q0) obj;
        AbstractC4154l.m8923f(q0Var, "<this>");
        return q0Var.mo8414a();
    }

    @Override // jy.AbstractC3877n
    /* renamed from: i */
    public final void mo8417i(int i10, Object obj, Object obj2) {
        AbstractC4154l.m8923f((q0) obj, "<this>");
        throw new IllegalStateException("This method lead to boxing and must not be used, use Builder.append instead");
    }

    /* renamed from: j */
    public abstract Object mo8418j();

    /* renamed from: k */
    public abstract void mo8419k(InterfaceC3365b interfaceC3365b, Object obj, int i10);

    @Override // jy.AbstractC3877n, fy.InterfaceC2401a
    public final void serialize(InterfaceC3367d interfaceC3367d, Object obj) {
        int iMo8409d = mo8409d(obj);
        r0 descriptor = this.f19962b;
        AbstractC4154l.m8923f(descriptor, "descriptor");
        InterfaceC3365b interfaceC3365bMo7711c = ((C4597u) interfaceC3367d).mo7711c(descriptor);
        mo8419k(interfaceC3365bMo7711c, obj, iMo8409d);
        interfaceC3365bMo7711c.mo7693b(descriptor);
    }
}
