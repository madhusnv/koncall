package ks;

import ex.InterfaceC2141e;
import im.InterfaceC3307i;
import uw.InterfaceC7559c;
import ww.AbstractC8199i;
import yv.C8801p;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ks.b */
/* loaded from: classes3.dex */
public final class C4213b extends AbstractC8199i implements InterfaceC2141e {

    /* renamed from: a */
    public final /* synthetic */ int f21343a;

    /* renamed from: b */
    public int f21344b;

    /* renamed from: c */
    public /* synthetic */ Object f21345c;

    /* renamed from: d */
    public final /* synthetic */ C4223l f21346d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C4213b(int i10, C4223l c4223l, InterfaceC7559c interfaceC7559c) {
        super(2, interfaceC7559c);
        this.f21343a = i10;
        this.f21346d = c4223l;
    }

    @Override // ww.AbstractC8191a
    public final InterfaceC7559c create(Object obj, InterfaceC7559c interfaceC7559c) {
        switch (this.f21343a) {
            case 0:
                C4213b c4213b = new C4213b(0, this.f21346d, interfaceC7559c);
                c4213b.f21345c = obj;
                return c4213b;
            case 1:
                C4213b c4213b2 = new C4213b(1, this.f21346d, interfaceC7559c);
                c4213b2.f21345c = obj;
                return c4213b2;
            default:
                C4213b c4213b3 = new C4213b(2, this.f21346d, interfaceC7559c);
                c4213b3.f21345c = obj;
                return c4213b3;
        }
    }

    @Override // ex.InterfaceC2141e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f21343a) {
            case 0:
                return ((C4213b) create((C8801p) obj, (InterfaceC7559c) obj2)).invokeSuspend(qw.a0.f30746a);
            case 1:
                return ((C4213b) create((InterfaceC3307i) obj, (InterfaceC7559c) obj2)).invokeSuspend(qw.a0.f30746a);
            default:
                return ((C4213b) create((im.m0) obj, (InterfaceC7559c) obj2)).invokeSuspend(qw.a0.f30746a);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:80:? A[RETURN, SYNTHETIC] */
    @Override // ww.AbstractC8191a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r39) {
        /*
            Method dump skipped, instructions count: 402
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ks.C4213b.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
