package hm;

import com.websoptimization.callyzerbiz.broadcastReceivers.SimStatesChangedReceiver;
import com.websoptimization.callyzerbiz.common.exception.SimStateException;
import ex.InterfaceC2141e;
import qw.a0;
import tx.InterfaceC7266z;
import uw.InterfaceC7559c;
import ww.AbstractC8199i;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: hm.r */
/* loaded from: classes3.dex */
public final class C2982r extends AbstractC8199i implements InterfaceC2141e {

    /* renamed from: a */
    public SimStateException f16119a;

    /* renamed from: b */
    public int f16120b;

    /* renamed from: c */
    public final /* synthetic */ SimStatesChangedReceiver f16121c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2982r(SimStatesChangedReceiver simStatesChangedReceiver, InterfaceC7559c interfaceC7559c) {
        super(2, interfaceC7559c);
        this.f16121c = simStatesChangedReceiver;
    }

    @Override // ww.AbstractC8191a
    public final InterfaceC7559c create(Object obj, InterfaceC7559c interfaceC7559c) {
        return new C2982r(this.f16121c, interfaceC7559c);
    }

    @Override // ex.InterfaceC2141e
    public final Object invoke(Object obj, Object obj2) {
        return ((C2982r) create((InterfaceC7266z) obj, (InterfaceC7559c) obj2)).invokeSuspend(a0.f30746a);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00df  */
    @Override // ww.AbstractC8191a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            Method dump skipped, instructions count: 252
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: hm.C2982r.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
