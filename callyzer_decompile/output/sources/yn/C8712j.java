package yn;

import com.websoptimization.callyzerbiz.domain.model.FCMData;
import ex.InterfaceC2141e;
import qw.a0;
import tx.InterfaceC7266z;
import uw.InterfaceC7559c;
import ww.AbstractC8199i;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: yn.j */
/* loaded from: classes3.dex */
public final class C8712j extends AbstractC8199i implements InterfaceC2141e {

    /* renamed from: a */
    public final /* synthetic */ int f42114a = 1;

    /* renamed from: b */
    public int f42115b;

    /* renamed from: c */
    public final /* synthetic */ C8716n f42116c;

    /* renamed from: d */
    public final /* synthetic */ FCMData f42117d;

    /* renamed from: e */
    public String f42118e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8712j(FCMData fCMData, String str, InterfaceC7559c interfaceC7559c, C8716n c8716n) {
        super(2, interfaceC7559c);
        this.f42116c = c8716n;
        this.f42117d = fCMData;
        this.f42118e = str;
    }

    @Override // ww.AbstractC8191a
    public final InterfaceC7559c create(Object obj, InterfaceC7559c interfaceC7559c) {
        switch (this.f42114a) {
            case 0:
                return new C8712j(this.f42117d, this.f42116c, interfaceC7559c);
            default:
                return new C8712j(this.f42117d, this.f42118e, interfaceC7559c, this.f42116c);
        }
    }

    @Override // ex.InterfaceC2141e
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC7266z interfaceC7266z = (InterfaceC7266z) obj;
        InterfaceC7559c interfaceC7559c = (InterfaceC7559c) obj2;
        switch (this.f42114a) {
        }
        return ((C8712j) create(interfaceC7266z, interfaceC7559c)).invokeSuspend(a0.f30746a);
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x00a6  */
    @Override // ww.AbstractC8191a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            Method dump skipped, instructions count: 242
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: yn.C8712j.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8712j(FCMData fCMData, C8716n c8716n, InterfaceC7559c interfaceC7559c) {
        super(2, interfaceC7559c);
        this.f42117d = fCMData;
        this.f42116c = c8716n;
    }
}
