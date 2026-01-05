package kotlin.jvm.internal;

import dx.C1852b;
import lx.InterfaceC4563b;
import lx.InterfaceC4574m;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: kotlin.jvm.internal.u */
/* loaded from: classes3.dex */
public abstract class AbstractC4163u extends AbstractC4145c implements InterfaceC4574m {
    private final boolean syntheticJavaProperty;

    public AbstractC4163u(Object obj, Class cls, String str, String str2, int i10) {
        super(obj, cls, str, str2, (i10 & 1) == 1);
        this.syntheticJavaProperty = (i10 & 2) == 2;
    }

    @Override // kotlin.jvm.internal.AbstractC4145c
    public InterfaceC4563b compute() {
        return this.syntheticJavaProperty ? this : super.compute();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC4163u) {
            AbstractC4163u abstractC4163u = (AbstractC4163u) obj;
            return getOwner().equals(abstractC4163u.getOwner()) && getName().equals(abstractC4163u.getName()) && getSignature().equals(abstractC4163u.getSignature()) && AbstractC4154l.m8918a(getBoundReceiver(), abstractC4163u.getBoundReceiver());
        }
        if (obj instanceof InterfaceC4574m) {
            return obj.equals(compute());
        }
        return false;
    }

    public int hashCode() {
        return getSignature().hashCode() + ((getName().hashCode() + (getOwner().hashCode() * 31)) * 31);
    }

    @Override // lx.InterfaceC4574m
    public boolean isConst() {
        return getReflected().isConst();
    }

    @Override // lx.InterfaceC4574m
    public boolean isLateinit() {
        return getReflected().isLateinit();
    }

    public String toString() {
        InterfaceC4563b interfaceC4563bCompute = compute();
        if (interfaceC4563bCompute != this) {
            return interfaceC4563bCompute.toString();
        }
        return "property " + getName() + " (Kotlin reflection is not available)";
    }

    @Override // kotlin.jvm.internal.AbstractC4145c
    public InterfaceC4574m getReflected() {
        if (this.syntheticJavaProperty) {
            throw new UnsupportedOperationException("Kotlin reflection is not yet supported for synthetic Java properties. Please follow/upvote https://youtrack.jetbrains.com/issue/KT-55980");
        }
        InterfaceC4563b interfaceC4563bCompute = compute();
        if (interfaceC4563bCompute != this) {
            return (InterfaceC4574m) interfaceC4563bCompute;
        }
        throw new C1852b("Kotlin reflection implementation is not found at runtime. Make sure you have kotlin-reflect.jar in the classpath");
    }
}
