package mg;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: mg.c */
/* loaded from: classes.dex */
public final class C4724c extends AbstractC4726e {

    /* renamed from: a */
    public static final C4724c f23634a = new C4724c();

    @Override // mg.AbstractC4726e
    /* renamed from: a */
    public final Object mo9614a() {
        throw new IllegalStateException("Optional.get() cannot be called on an absent value");
    }

    @Override // mg.AbstractC4726e
    /* renamed from: b */
    public final boolean mo9615b() {
        return false;
    }

    public final boolean equals(Object obj) {
        return obj == this;
    }

    public final int hashCode() {
        return 2040732332;
    }

    public final String toString() {
        return "Optional.absent()";
    }
}
