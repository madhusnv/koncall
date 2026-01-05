package p001o;

/* loaded from: classes6.dex */
public abstract class rhd {
    /* renamed from: c */
    public static /* synthetic */ void m46778c(rhd rhdVar, int i, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: ensureCapacity");
        }
        if ((i2 & 1) != 0) {
            i = rhdVar.mo17043d() + 1;
        }
        rhdVar.mo17042b(i);
    }

    /* renamed from: a */
    public abstract Object mo17041a();

    /* renamed from: b */
    public abstract void mo17042b(int i);

    /* renamed from: d */
    public abstract int mo17043d();
}
