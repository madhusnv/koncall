package ss;

import ex.InterfaceC2141e;
import org.bouncycastle.iana.AEADAlgorithm;
import tx.InterfaceC7266z;
import uw.InterfaceC7559c;
import ww.AbstractC8199i;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final class b0 extends AbstractC8199i implements InterfaceC2141e {

    /* renamed from: a */
    public final /* synthetic */ int f33410a;

    /* renamed from: b */
    public int f33411b;

    /* renamed from: c */
    public final /* synthetic */ z0 f33412c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b0(z0 z0Var, InterfaceC7559c interfaceC7559c, int i10) {
        super(2, interfaceC7559c);
        this.f33410a = i10;
        this.f33412c = z0Var;
    }

    @Override // ww.AbstractC8191a
    public final InterfaceC7559c create(Object obj, InterfaceC7559c interfaceC7559c) {
        switch (this.f33410a) {
            case 0:
                return new b0(this.f33412c, interfaceC7559c, 0);
            case 1:
                return new b0(this.f33412c, interfaceC7559c, 1);
            case 2:
                return new b0(this.f33412c, interfaceC7559c, 2);
            case 3:
                return new b0(this.f33412c, interfaceC7559c, 3);
            case 4:
                return new b0(this.f33412c, interfaceC7559c, 4);
            case 5:
                return new b0(this.f33412c, interfaceC7559c, 5);
            case 6:
                return new b0(this.f33412c, interfaceC7559c, 6);
            case 7:
                return new b0(this.f33412c, interfaceC7559c, 7);
            case 8:
                return new b0(this.f33412c, interfaceC7559c, 8);
            case 9:
                return new b0(this.f33412c, interfaceC7559c, 9);
            case 10:
                return new b0(this.f33412c, interfaceC7559c, 10);
            case 11:
                return new b0(this.f33412c, interfaceC7559c, 11);
            case 12:
                return new b0(this.f33412c, interfaceC7559c, 12);
            case 13:
                return new b0(this.f33412c, interfaceC7559c, 13);
            case 14:
                return new b0(this.f33412c, interfaceC7559c, 14);
            case AEADAlgorithm.AEAD_AES_SIV_CMAC_256 /* 15 */:
                return new b0(this.f33412c, interfaceC7559c, 15);
            case 16:
                return new b0(this.f33412c, interfaceC7559c, 16);
            case 17:
                return new b0(this.f33412c, interfaceC7559c, 17);
            case 18:
                return new b0(this.f33412c, interfaceC7559c, 18);
            case 19:
                return new b0(this.f33412c, interfaceC7559c, 19);
            case 20:
                return new b0(this.f33412c, interfaceC7559c, 20);
            case 21:
                return new b0(this.f33412c, interfaceC7559c, 21);
            case 22:
                return new b0(this.f33412c, interfaceC7559c, 22);
            case 23:
                return new b0(this.f33412c, interfaceC7559c, 23);
            default:
                return new b0(this.f33412c, interfaceC7559c, 24);
        }
    }

    @Override // ex.InterfaceC2141e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f33410a) {
        }
        return ((b0) create((InterfaceC7266z) obj, (InterfaceC7559c) obj2)).invokeSuspend(qw.a0.f30746a);
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0093  */
    @Override // ww.AbstractC8191a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r18) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 1538
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ss.b0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
