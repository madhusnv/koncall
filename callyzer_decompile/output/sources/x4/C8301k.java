package x4;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: x4.k */
/* loaded from: classes.dex */
public final class C8301k extends AbstractC8298h {

    /* renamed from: h */
    public final /* synthetic */ C8302l f39848h;

    public C8301k(C8302l c8302l) {
        this.f39848h = c8302l;
    }

    @Override // x4.AbstractC8298h
    /* renamed from: h */
    public final String mo15502h() {
        C8299i c8299i = (C8299i) this.f39848h.f39849a.get();
        if (c8299i == null) {
            return "Completer object has been garbage collected, future will fail soon";
        }
        return "tag=[" + c8299i.f39844a + "]";
    }
}
