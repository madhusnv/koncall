package kotlin.jvm.internal;

import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.util.List;
import java.util.Map;
import lx.EnumC4576o;
import lx.InterfaceC4563b;
import lx.InterfaceC4565d;
import lx.InterfaceC4575n;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: kotlin.jvm.internal.c */
/* loaded from: classes3.dex */
public abstract class AbstractC4145c implements InterfaceC4563b, Serializable {
    public static final Object NO_RECEIVER = C4144b.f21155a;
    private final boolean isTopLevel;
    private final String name;
    private final Class owner;
    protected final Object receiver;
    private transient InterfaceC4563b reflected;
    private final String signature;

    public AbstractC4145c(Object obj, Class cls, String str, String str2, boolean z6) {
        this.receiver = obj;
        this.owner = cls;
        this.name = str;
        this.signature = str2;
        this.isTopLevel = z6;
    }

    @Override // lx.InterfaceC4563b
    public Object call(Object... objArr) {
        return getReflected().call(objArr);
    }

    @Override // lx.InterfaceC4563b
    public Object callBy(Map map) {
        return getReflected().callBy(map);
    }

    public InterfaceC4563b compute() {
        InterfaceC4563b interfaceC4563b = this.reflected;
        if (interfaceC4563b != null) {
            return interfaceC4563b;
        }
        InterfaceC4563b interfaceC4563bComputeReflected = computeReflected();
        this.reflected = interfaceC4563bComputeReflected;
        return interfaceC4563bComputeReflected;
    }

    public abstract InterfaceC4563b computeReflected();

    @Override // lx.InterfaceC4562a
    public List<Annotation> getAnnotations() {
        return getReflected().getAnnotations();
    }

    public Object getBoundReceiver() {
        return this.receiver;
    }

    @Override // lx.InterfaceC4563b
    public String getName() {
        return this.name;
    }

    public InterfaceC4565d getOwner() {
        Class cls = this.owner;
        if (cls == null) {
            return null;
        }
        if (!this.isTopLevel) {
            return a0.m8901a(cls);
        }
        a0.f21154a.getClass();
        return new C4158p(cls);
    }

    @Override // lx.InterfaceC4563b
    public List<Object> getParameters() {
        return getReflected().getParameters();
    }

    public abstract InterfaceC4563b getReflected();

    @Override // lx.InterfaceC4563b
    public InterfaceC4575n getReturnType() {
        getReflected().getReturnType();
        return null;
    }

    public String getSignature() {
        return this.signature;
    }

    @Override // lx.InterfaceC4563b
    public List<Object> getTypeParameters() {
        return getReflected().getTypeParameters();
    }

    @Override // lx.InterfaceC4563b
    public EnumC4576o getVisibility() {
        return getReflected().getVisibility();
    }

    @Override // lx.InterfaceC4563b
    public boolean isAbstract() {
        return getReflected().isAbstract();
    }

    @Override // lx.InterfaceC4563b
    public boolean isFinal() {
        return getReflected().isFinal();
    }

    @Override // lx.InterfaceC4563b
    public boolean isOpen() {
        return getReflected().isOpen();
    }

    @Override // lx.InterfaceC4563b
    public boolean isSuspend() {
        return getReflected().isSuspend();
    }
}
