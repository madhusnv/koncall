package p001o;

import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.util.List;
import java.util.Map;

/* loaded from: classes6.dex */
public abstract class y22 implements nb9, Serializable {
    public static final Object NO_RECEIVER = C18299a.f54735a;
    private final boolean isTopLevel;
    private final String name;
    private final Class owner;
    protected final Object receiver;
    private transient nb9 reflected;
    private final String signature;

    /* renamed from: o.y22$a */
    public static class C18299a implements Serializable {

        /* renamed from: a */
        public static final C18299a f54735a = new C18299a();

        private Object readResolve() {
            return f54735a;
        }
    }

    public y22(Object obj, Class cls, String str, String str2, boolean z) {
        this.receiver = obj;
        this.owner = cls;
        this.name = str;
        this.signature = str2;
        this.isTopLevel = z;
    }

    @Override // p001o.nb9
    public Object call(Object... objArr) {
        return getReflected().call(objArr);
    }

    @Override // p001o.nb9
    public Object callBy(Map map) {
        return getReflected().callBy(map);
    }

    public nb9 compute() {
        nb9 nb9Var = this.reflected;
        if (nb9Var != null) {
            return nb9Var;
        }
        nb9 nb9VarComputeReflected = computeReflected();
        this.reflected = nb9VarComputeReflected;
        return nb9VarComputeReflected;
    }

    public abstract nb9 computeReflected();

    @Override // p001o.mb9
    public List<Annotation> getAnnotations() {
        return getReflected().getAnnotations();
    }

    public Object getBoundReceiver() {
        return this.receiver;
    }

    @Override // p001o.nb9
    public String getName() {
        return this.name;
    }

    public qb9 getOwner() {
        Class cls = this.owner;
        if (cls == null) {
            return null;
        }
        return this.isTopLevel ? kge.m35690c(cls) : kge.m35689b(cls);
    }

    @Override // p001o.nb9
    public List<Object> getParameters() {
        return getReflected().getParameters();
    }

    public nb9 getReflected() {
        nb9 nb9VarCompute = compute();
        if (nb9VarCompute != this) {
            return nb9VarCompute;
        }
        throw new se9();
    }

    @Override // p001o.nb9
    public ec9 getReturnType() {
        getReflected().getReturnType();
        return null;
    }

    public String getSignature() {
        return this.signature;
    }

    @Override // p001o.nb9
    public List<Object> getTypeParameters() {
        return getReflected().getTypeParameters();
    }

    @Override // p001o.nb9
    public fc9 getVisibility() {
        return getReflected().getVisibility();
    }

    @Override // p001o.nb9
    public boolean isAbstract() {
        return getReflected().isAbstract();
    }

    @Override // p001o.nb9
    public boolean isFinal() {
        return getReflected().isFinal();
    }

    @Override // p001o.nb9
    public boolean isOpen() {
        return getReflected().isOpen();
    }

    @Override // p001o.nb9, p001o.rb9
    public boolean isSuspend() {
        return getReflected().isSuspend();
    }
}
