package o6;

import ex.InterfaceC2141e;
import uw.InterfaceC7559c;
import ww.AbstractC8199i;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: o6.t */
/* loaded from: classes.dex */
public final class C5318t extends AbstractC8199i implements InterfaceC2141e {

    /* renamed from: a */
    public final /* synthetic */ int f26153a;

    /* renamed from: b */
    public int f26154b;

    /* renamed from: c */
    public /* synthetic */ boolean f26155c;

    /* renamed from: d */
    public final /* synthetic */ C5321w f26156d;

    /* renamed from: e */
    public final /* synthetic */ int f26157e;

    /* renamed from: f */
    public Object f26158f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C5318t(C5321w c5321w, int i10, InterfaceC7559c interfaceC7559c, int i11) {
        super(2, interfaceC7559c);
        this.f26153a = i11;
        this.f26156d = c5321w;
        this.f26157e = i10;
    }

    @Override // ww.AbstractC8191a
    public final InterfaceC7559c create(Object obj, InterfaceC7559c interfaceC7559c) {
        switch (this.f26153a) {
            case 0:
                C5318t c5318t = new C5318t(this.f26156d, this.f26157e, interfaceC7559c, 0);
                c5318t.f26155c = ((Boolean) obj).booleanValue();
                return c5318t;
            default:
                C5318t c5318t2 = new C5318t(this.f26156d, this.f26157e, interfaceC7559c, 1);
                c5318t2.f26155c = ((Boolean) obj).booleanValue();
                return c5318t2;
        }
    }

    @Override // ex.InterfaceC2141e
    public final Object invoke(Object obj, Object obj2) {
        int i10 = this.f26153a;
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        InterfaceC7559c interfaceC7559c = (InterfaceC7559c) obj2;
        switch (i10) {
        }
        return ((C5318t) create(bool, interfaceC7559c)).invokeSuspend(qw.a0.f30746a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:24:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x005f  */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v22 */
    /* JADX WARN: Type inference failed for: r1v23 */
    @Override // ww.AbstractC8191a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            Method dump skipped, instructions count: 220
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o6.C5318t.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
