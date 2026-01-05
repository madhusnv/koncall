package o1;

import s4.InterfaceC6747c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: o1.d */
/* loaded from: classes.dex */
public final class C5245d implements InterfaceC5249h {

    /* renamed from: a */
    public final /* synthetic */ int f25713a;

    @Override // o1.InterfaceC5249h
    /* renamed from: b */
    public final void mo10335b(InterfaceC6747c interfaceC6747c, int i10, int[] iArr, int[] iArr2) {
        switch (this.f25713a) {
            case 0:
                AbstractC5251j.m10347c(i10, iArr, iArr2, false);
                break;
            default:
                AbstractC5251j.m10346b(iArr, iArr2, false);
                break;
        }
    }

    public final String toString() {
        switch (this.f25713a) {
            case 0:
                return "Arrangement#Bottom";
            default:
                return "Arrangement#Top";
        }
    }
}
