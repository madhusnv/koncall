package o1;

import s4.EnumC6757m;
import s4.InterfaceC6747c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: o1.e */
/* loaded from: classes.dex */
public final class C5246e implements InterfaceC5247f, InterfaceC5249h {

    /* renamed from: a */
    public final /* synthetic */ int f25717a;

    /* renamed from: b */
    public final float f25718b;

    public C5246e(int i10) {
        this.f25717a = i10;
        switch (i10) {
            case 1:
                this.f25718b = 0;
                break;
            case 2:
                this.f25718b = 0;
                break;
            case 3:
                this.f25718b = 0;
                break;
            default:
                this.f25718b = 0;
                break;
        }
    }

    @Override // o1.InterfaceC5247f, o1.InterfaceC5249h
    /* renamed from: a */
    public final float mo10336a() {
        switch (this.f25717a) {
        }
        return this.f25718b;
    }

    @Override // o1.InterfaceC5249h
    /* renamed from: b */
    public final void mo10335b(InterfaceC6747c interfaceC6747c, int i10, int[] iArr, int[] iArr2) {
        switch (this.f25717a) {
            case 0:
                AbstractC5251j.m10345a(i10, iArr, iArr2, false);
                break;
            case 1:
                AbstractC5251j.m10348d(i10, iArr, iArr2, false);
                break;
            case 2:
                AbstractC5251j.m10349e(i10, iArr, iArr2, false);
                break;
            default:
                AbstractC5251j.m10350f(i10, iArr, iArr2, false);
                break;
        }
    }

    @Override // o1.InterfaceC5247f
    /* renamed from: c */
    public final void mo10316c(InterfaceC6747c interfaceC6747c, int i10, int[] iArr, EnumC6757m enumC6757m, int[] iArr2) {
        switch (this.f25717a) {
            case 0:
                if (enumC6757m != EnumC6757m.Ltr) {
                    AbstractC5251j.m10345a(i10, iArr, iArr2, true);
                    break;
                } else {
                    AbstractC5251j.m10345a(i10, iArr, iArr2, false);
                    break;
                }
            case 1:
                if (enumC6757m != EnumC6757m.Ltr) {
                    AbstractC5251j.m10348d(i10, iArr, iArr2, true);
                    break;
                } else {
                    AbstractC5251j.m10348d(i10, iArr, iArr2, false);
                    break;
                }
            case 2:
                if (enumC6757m != EnumC6757m.Ltr) {
                    AbstractC5251j.m10349e(i10, iArr, iArr2, true);
                    break;
                } else {
                    AbstractC5251j.m10349e(i10, iArr, iArr2, false);
                    break;
                }
            default:
                if (enumC6757m != EnumC6757m.Ltr) {
                    AbstractC5251j.m10350f(i10, iArr, iArr2, true);
                    break;
                } else {
                    AbstractC5251j.m10350f(i10, iArr, iArr2, false);
                    break;
                }
        }
    }

    public final String toString() {
        switch (this.f25717a) {
            case 0:
                return "Arrangement#Center";
            case 1:
                return "Arrangement#SpaceAround";
            case 2:
                return "Arrangement#SpaceBetween";
            default:
                return "Arrangement#SpaceEvenly";
        }
    }
}
