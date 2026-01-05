package p001o;

/* loaded from: classes5.dex */
public final class ek8 implements ls6 {

    /* renamed from: b */
    public static final ek8 f21790b = new ek8(null);

    /* renamed from: a */
    public final Object f21791a;

    public ek8(Object obj) {
        this.f21791a = obj;
    }

    /* renamed from: a */
    public static ls6 m25188a(Object obj) {
        return new ek8(cgd.m21197c(obj, "instance cannot be null"));
    }

    @Override // javax.inject.Provider
    public Object get() {
        return this.f21791a;
    }
}
