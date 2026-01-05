package androidx.datastore.preferences.protobuf;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: androidx.datastore.preferences.protobuf.w */
/* loaded from: classes.dex */
public abstract class AbstractC0332w implements Cloneable {

    /* renamed from: a */
    public final AbstractC0335z f2422a;

    /* renamed from: b */
    public AbstractC0335z f2423b;

    public AbstractC0332w(AbstractC0335z abstractC0335z) {
        this.f2422a = abstractC0335z;
        if (abstractC0335z.m1081g()) {
            throw new IllegalArgumentException("Default instance must be immutable.");
        }
        this.f2423b = abstractC0335z.m1083i();
    }

    /* renamed from: a */
    public final AbstractC0335z m1070a() {
        AbstractC0335z abstractC0335zM1071b = m1071b();
        abstractC0335zM1071b.getClass();
        if (AbstractC0335z.m1078f(abstractC0335zM1071b, true)) {
            return abstractC0335zM1071b;
        }
        throw new UninitializedMessageException();
    }

    /* renamed from: b */
    public final AbstractC0335z m1071b() {
        if (!this.f2423b.m1081g()) {
            return this.f2423b;
        }
        AbstractC0335z abstractC0335z = this.f2423b;
        abstractC0335z.getClass();
        x0 x0Var = x0.f2424c;
        x0Var.getClass();
        x0Var.m1073a(abstractC0335z.getClass()).mo810a(abstractC0335z);
        abstractC0335z.m1082h();
        return this.f2423b;
    }

    /* renamed from: c */
    public final void m1072c() {
        if (this.f2423b.m1081g()) {
            return;
        }
        AbstractC0335z abstractC0335zM1083i = this.f2422a.m1083i();
        AbstractC0335z abstractC0335z = this.f2423b;
        x0 x0Var = x0.f2424c;
        x0Var.getClass();
        x0Var.m1073a(abstractC0335zM1083i.getClass()).mo813d(abstractC0335zM1083i, abstractC0335z);
        this.f2423b = abstractC0335zM1083i;
    }

    public final Object clone() {
        AbstractC0335z abstractC0335z = this.f2422a;
        abstractC0335z.getClass();
        AbstractC0332w abstractC0332w = (AbstractC0332w) abstractC0335z.mo1080c(EnumC0334y.NEW_BUILDER);
        abstractC0332w.f2423b = m1071b();
        return abstractC0332w;
    }
}
