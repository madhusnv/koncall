package dg;

import android.content.Context;
import h1.AbstractC2785p;
import h1.b2;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: dg.i */
/* loaded from: classes.dex */
public final class C1720i implements InterfaceC1713b, b2 {

    /* renamed from: a */
    public final /* synthetic */ int f8362a;

    /* renamed from: b */
    public final int f8363b;

    public /* synthetic */ C1720i(int i10, int i11) {
        this.f8362a = i11;
        this.f8363b = i10;
    }

    @Override // h1.z1
    /* renamed from: B */
    public AbstractC2785p mo2730B(long j6, AbstractC2785p abstractC2785p, AbstractC2785p abstractC2785p2, AbstractC2785p abstractC2785p3) {
        return j6 < ((long) this.f8363b) * 1000000 ? abstractC2785p : abstractC2785p2;
    }

    @Override // h1.b2
    /* renamed from: N */
    public int mo2731N() {
        return this.f8363b;
    }

    @Override // h1.b2
    /* renamed from: W */
    public int mo2732W() {
        return 0;
    }

    @Override // dg.InterfaceC1713b
    /* renamed from: a */
    public int mo5401a(Context context, String str, boolean z6) {
        return 0;
    }

    @Override // dg.InterfaceC1713b
    /* renamed from: g */
    public int mo5402g(Context context, String str) {
        return this.f8363b;
    }

    public String toString() {
        switch (this.f8362a) {
            case 3:
                return String.valueOf(this.f8363b);
            default:
                return super.toString();
        }
    }

    @Override // h1.z1
    /* renamed from: n */
    public AbstractC2785p mo2744n(long j6, AbstractC2785p abstractC2785p, AbstractC2785p abstractC2785p2, AbstractC2785p abstractC2785p3) {
        return abstractC2785p3;
    }
}
