package f8;

import ex.InterfaceC2139c;
import ex.InterfaceC2141e;
import qw.a0;
import uw.InterfaceC7559c;
import ww.AbstractC8199i;
import z7.AbstractC8894w;
import z7.d0;
import z7.e0;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: f8.b */
/* loaded from: classes.dex */
public final class C2207b extends AbstractC8199i implements InterfaceC2141e {

    /* renamed from: a */
    public final /* synthetic */ int f10138a;

    /* renamed from: b */
    public d0 f10139b;

    /* renamed from: c */
    public int f10140c;

    /* renamed from: d */
    public /* synthetic */ Object f10141d;

    /* renamed from: e */
    public final /* synthetic */ boolean f10142e;

    /* renamed from: f */
    public final /* synthetic */ boolean f10143f;

    /* renamed from: g */
    public final /* synthetic */ AbstractC8894w f10144g;

    /* renamed from: h */
    public final /* synthetic */ InterfaceC2139c f10145h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2207b(boolean z6, boolean z10, AbstractC8894w abstractC8894w, InterfaceC7559c interfaceC7559c, InterfaceC2139c interfaceC2139c, int i10) {
        super(2, interfaceC7559c);
        this.f10138a = i10;
        this.f10142e = z6;
        this.f10143f = z10;
        this.f10144g = abstractC8894w;
        this.f10145h = interfaceC2139c;
    }

    @Override // ww.AbstractC8191a
    public final InterfaceC7559c create(Object obj, InterfaceC7559c interfaceC7559c) {
        switch (this.f10138a) {
            case 0:
                C2207b c2207b = new C2207b(this.f10142e, this.f10143f, this.f10144g, interfaceC7559c, this.f10145h, 0);
                c2207b.f10141d = obj;
                return c2207b;
            default:
                C2207b c2207b2 = new C2207b(this.f10142e, this.f10143f, this.f10144g, interfaceC7559c, this.f10145h, 1);
                c2207b2.f10141d = obj;
                return c2207b2;
        }
    }

    @Override // ex.InterfaceC2141e
    public final Object invoke(Object obj, Object obj2) {
        e0 e0Var = (e0) obj;
        InterfaceC7559c interfaceC7559c = (InterfaceC7559c) obj2;
        switch (this.f10138a) {
        }
        return ((C2207b) create(e0Var, interfaceC7559c)).invokeSuspend(a0.f30746a);
    }

    /* JADX WARN: Removed duplicated region for block: B:101:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:106:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:94:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:99:? A[RETURN, SYNTHETIC] */
    @Override // ww.AbstractC8191a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            Method dump skipped, instructions count: 442
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: f8.C2207b.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
