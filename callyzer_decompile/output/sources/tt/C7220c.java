package tt;

import ex.InterfaceC2141e;
import qw.a0;
import tx.InterfaceC7266z;
import uw.InterfaceC7559c;
import ww.AbstractC8199i;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: tt.c */
/* loaded from: classes3.dex */
public final class C7220c extends AbstractC8199i implements InterfaceC2141e {

    /* renamed from: a */
    public final /* synthetic */ int f34532a;

    /* renamed from: b */
    public int f34533b;

    /* renamed from: c */
    public final /* synthetic */ C7224g f34534c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C7220c(C7224g c7224g, InterfaceC7559c interfaceC7559c, int i10) {
        super(2, interfaceC7559c);
        this.f34532a = i10;
        this.f34534c = c7224g;
    }

    @Override // ww.AbstractC8191a
    public final InterfaceC7559c create(Object obj, InterfaceC7559c interfaceC7559c) {
        switch (this.f34532a) {
            case 0:
                return new C7220c(this.f34534c, interfaceC7559c, 0);
            case 1:
                return new C7220c(this.f34534c, interfaceC7559c, 1);
            case 2:
                return new C7220c(this.f34534c, interfaceC7559c, 2);
            case 3:
                return new C7220c(this.f34534c, interfaceC7559c, 3);
            case 4:
                return new C7220c(this.f34534c, interfaceC7559c, 4);
            default:
                return new C7220c(this.f34534c, interfaceC7559c, 5);
        }
    }

    @Override // ex.InterfaceC2141e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f34532a) {
        }
        return ((C7220c) create((InterfaceC7266z) obj, (InterfaceC7559c) obj2)).invokeSuspend(a0.f30746a);
    }

    /* JADX WARN: Removed duplicated region for block: B:127:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:128:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:129:? A[RETURN, SYNTHETIC] */
    @Override // ww.AbstractC8191a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r31) {
        /*
            Method dump skipped, instructions count: 630
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: tt.C7220c.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
