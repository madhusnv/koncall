package p001o;

/* loaded from: classes6.dex */
public abstract class kbf {
    /* renamed from: a */
    public static Object m35360a(Object obj) {
        return obj;
    }

    /* renamed from: b */
    public static final ibf m35361b(Object obj) {
        if (obj == dq3.f20402a) {
            throw new IllegalStateException("Does not contain segment".toString());
        }
        sq8.m48647f(obj, "null cannot be cast to non-null type S of kotlinx.coroutines.internal.SegmentOrClosed");
        return (ibf) obj;
    }

    /* renamed from: c */
    public static final boolean m35362c(Object obj) {
        return obj == dq3.f20402a;
    }
}
