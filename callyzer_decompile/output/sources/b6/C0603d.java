package b6;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: b6.d */
/* loaded from: classes.dex */
public final class C0603d extends C0602c {

    /* renamed from: d */
    public final Object f3990d;

    public C0603d() {
        super(12);
        this.f3990d = new Object();
    }

    @Override // b6.C0602c
    /* renamed from: a */
    public final Object mo1762a() {
        Object objMo1762a;
        synchronized (this.f3990d) {
            objMo1762a = super.mo1762a();
        }
        return objMo1762a;
    }

    @Override // b6.C0602c
    /* renamed from: d */
    public final boolean mo1765d(Object obj) {
        boolean zMo1765d;
        synchronized (this.f3990d) {
            zMo1765d = super.mo1765d(obj);
        }
        return zMo1765d;
    }
}
