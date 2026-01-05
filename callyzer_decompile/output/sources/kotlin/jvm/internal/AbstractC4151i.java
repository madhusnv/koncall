package kotlin.jvm.internal;

import dx.C1852b;
import lx.InterfaceC4563b;
import lx.InterfaceC4566e;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: kotlin.jvm.internal.i */
/* loaded from: classes3.dex */
public abstract class AbstractC4151i extends AbstractC4145c implements InterfaceC4150h, InterfaceC4566e {
    private final int arity;
    private final int flags;

    public AbstractC4151i(int i10, int i11, Class cls, Object obj, String str, String str2) {
        super(obj, cls, str, str2, (i11 & 1) == 1);
        this.arity = i10;
        this.flags = 0;
    }

    @Override // kotlin.jvm.internal.AbstractC4145c
    public InterfaceC4563b computeReflected() {
        a0.f21154a.getClass();
        return this;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC4151i) {
            AbstractC4151i abstractC4151i = (AbstractC4151i) obj;
            return getName().equals(abstractC4151i.getName()) && getSignature().equals(abstractC4151i.getSignature()) && this.flags == abstractC4151i.flags && this.arity == abstractC4151i.arity && AbstractC4154l.m8918a(getBoundReceiver(), abstractC4151i.getBoundReceiver()) && AbstractC4154l.m8918a(getOwner(), abstractC4151i.getOwner());
        }
        if (obj instanceof InterfaceC4566e) {
            return obj.equals(compute());
        }
        return false;
    }

    @Override // kotlin.jvm.internal.InterfaceC4150h
    public int getArity() {
        return this.arity;
    }

    public int hashCode() {
        return getSignature().hashCode() + ((getName().hashCode() + (getOwner() == null ? 0 : getOwner().hashCode() * 31)) * 31);
    }

    @Override // lx.InterfaceC4566e
    public boolean isExternal() {
        return getReflected().isExternal();
    }

    @Override // lx.InterfaceC4566e
    public boolean isInfix() {
        return getReflected().isInfix();
    }

    @Override // lx.InterfaceC4566e
    public boolean isInline() {
        return getReflected().isInline();
    }

    @Override // lx.InterfaceC4566e
    public boolean isOperator() {
        return getReflected().isOperator();
    }

    @Override // kotlin.jvm.internal.AbstractC4145c, lx.InterfaceC4563b
    public boolean isSuspend() {
        return getReflected().isSuspend();
    }

    public String toString() {
        InterfaceC4563b interfaceC4563bCompute = compute();
        if (interfaceC4563bCompute != this) {
            return interfaceC4563bCompute.toString();
        }
        if ("<init>".equals(getName())) {
            return "constructor (Kotlin reflection is not available)";
        }
        return "function " + getName() + " (Kotlin reflection is not available)";
    }

    @Override // kotlin.jvm.internal.AbstractC4145c
    public InterfaceC4566e getReflected() {
        InterfaceC4563b interfaceC4563bCompute = compute();
        if (interfaceC4563bCompute != this) {
            return (InterfaceC4566e) interfaceC4563bCompute;
        }
        throw new C1852b("Kotlin reflection implementation is not found at runtime. Make sure you have kotlin-reflect.jar in the classpath");
    }
}
