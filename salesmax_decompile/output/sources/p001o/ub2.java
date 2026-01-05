package p001o;

import android.graphics.Typeface;

/* loaded from: classes3.dex */
public final class ub2 extends ogh {

    /* renamed from: a */
    public final Typeface f48656a;

    /* renamed from: b */
    public final InterfaceC17347a f48657b;

    /* renamed from: c */
    public boolean f48658c;

    /* renamed from: o.ub2$a */
    public interface InterfaceC17347a {
        /* renamed from: a */
        void mo45425a(Typeface typeface);
    }

    public ub2(InterfaceC17347a interfaceC17347a, Typeface typeface) {
        this.f48656a = typeface;
        this.f48657b = interfaceC17347a;
    }

    @Override // p001o.ogh
    /* renamed from: a */
    public void mo14396a(int i) {
        m51324d(this.f48656a);
    }

    @Override // p001o.ogh
    /* renamed from: b */
    public void mo14397b(Typeface typeface, boolean z) {
        m51324d(typeface);
    }

    /* renamed from: c */
    public void m51323c() {
        this.f48658c = true;
    }

    /* renamed from: d */
    public final void m51324d(Typeface typeface) {
        if (this.f48658c) {
            return;
        }
        this.f48657b.mo45425a(typeface);
    }
}
