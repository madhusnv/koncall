package xx;

import c9.C0922q;
import com.websoptimization.callyzerbiz.domain.model.FCMData;
import dy.C1861i;
import ex.InterfaceC2141e;
import j3.C3553g;
import qw.a0;
import t8.C7059e;
import tx.InterfaceC7266z;
import uw.InterfaceC7559c;
import ww.AbstractC8199i;
import wx.C8214o;
import wx.InterfaceC8209j;
import wx.InterfaceC8210k;
import y8.C8595d;
import y8.InterfaceC8597f;
import yn.C8716n;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: xx.d */
/* loaded from: classes3.dex */
public final class C8498d extends AbstractC8199i implements InterfaceC2141e {

    /* renamed from: a */
    public final /* synthetic */ int f41398a;

    /* renamed from: b */
    public int f41399b;

    /* renamed from: c */
    public Object f41400c;

    /* renamed from: d */
    public final /* synthetic */ Object f41401d;

    /* renamed from: e */
    public final /* synthetic */ Object f41402e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C8498d(Object obj, Object obj2, Object obj3, InterfaceC7559c interfaceC7559c, int i10) {
        super(2, interfaceC7559c);
        this.f41398a = i10;
        this.f41400c = obj;
        this.f41401d = obj2;
        this.f41402e = obj3;
    }

    @Override // ww.AbstractC8191a
    public final InterfaceC7559c create(Object obj, InterfaceC7559c interfaceC7559c) {
        switch (this.f41398a) {
            case 0:
                C8498d c8498d = new C8498d((InterfaceC8210k) this.f41401d, (AbstractC8499e) this.f41402e, interfaceC7559c, 0);
                c8498d.f41400c = obj;
                return c8498d;
            case 1:
                return new C8498d((InterfaceC8209j) this.f41400c, (C8516v) this.f41401d, (C1861i) this.f41402e, interfaceC7559c, 1);
            case 2:
                C8498d c8498d2 = new C8498d((C8214o) this.f41402e, (InterfaceC8210k) this.f41401d, interfaceC7559c);
                c8498d2.f41400c = obj;
                return c8498d2;
            case 3:
                C8498d c8498d3 = new C8498d((C7059e) this.f41401d, (C8595d) this.f41402e, interfaceC7559c, 3);
                c8498d3.f41400c = obj;
                return c8498d3;
            case 4:
                return new C8498d((C3553g) this.f41400c, (C0922q) this.f41401d, (InterfaceC8597f) this.f41402e, interfaceC7559c, 4);
            case 5:
                C8498d c8498d4 = new C8498d((C8716n) this.f41401d, (FCMData) this.f41402e, interfaceC7559c, 5);
                c8498d4.f41400c = obj;
                return c8498d4;
            default:
                return new C8498d((C8716n) this.f41401d, (String) this.f41402e, interfaceC7559c, 6);
        }
    }

    @Override // ex.InterfaceC2141e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f41398a) {
        }
        return ((C8498d) create((InterfaceC7266z) obj, (InterfaceC7559c) obj2)).invokeSuspend(a0.f30746a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x00a1, code lost:
    
        if (r14 != r9) goto L39;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x008c  */
    /* JADX WARN: Type inference failed for: r0v18, types: [mm.m] */
    /* JADX WARN: Type inference failed for: r0v20, types: [mm.m] */
    /* JADX WARN: Type inference failed for: r4v11, types: [mm.m] */
    /* JADX WARN: Type inference failed for: r4v8, types: [java.lang.Object, mm.m] */
    /* JADX WARN: Type inference failed for: r4v9, types: [java.lang.Object] */
    @Override // ww.AbstractC8191a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 638
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: xx.C8498d.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C8498d(Object obj, Object obj2, InterfaceC7559c interfaceC7559c, int i10) {
        super(2, interfaceC7559c);
        this.f41398a = i10;
        this.f41401d = obj;
        this.f41402e = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8498d(C8214o c8214o, InterfaceC8210k interfaceC8210k, InterfaceC7559c interfaceC7559c) {
        super(2, interfaceC7559c);
        this.f41398a = 2;
        this.f41402e = c8214o;
        this.f41401d = interfaceC8210k;
    }
}
