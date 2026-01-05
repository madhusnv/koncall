package xh;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: xh.a */
/* loaded from: classes.dex */
public final class C8376a extends AbstractC8377b {

    /* renamed from: a */
    public static final C8376a f40049a = new C8376a();

    @Override // xh.AbstractC8377b
    /* renamed from: a */
    public final Object mo15548a() {
        throw new IllegalStateException("Optional.get() cannot be called on an absent value");
    }

    @Override // xh.AbstractC8377b
    /* renamed from: b */
    public final boolean mo15549b() {
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
