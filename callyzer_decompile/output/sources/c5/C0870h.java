package c5;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: c5.h */
/* loaded from: classes.dex */
public final class C0870h extends AbstractC0865c {
    /* renamed from: m */
    public static C0870h m2333m(String str) {
        C0870h c0870h = new C0870h(str.toCharArray());
        c0870h.f5410b = 0L;
        c0870h.m2331k(str.length() - 1);
        return c0870h;
    }

    @Override // c5.AbstractC0865c
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C0870h) && m2327b().equals(((C0870h) obj).m2327b())) {
            return true;
        }
        return super.equals(obj);
    }
}
