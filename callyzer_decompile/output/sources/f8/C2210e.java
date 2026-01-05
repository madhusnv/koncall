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
/* renamed from: f8.e */
/* loaded from: classes.dex */
public final class C2210e extends AbstractC8199i implements InterfaceC2141e {

    /* renamed from: a */
    public final /* synthetic */ int f10156a;

    /* renamed from: b */
    public d0 f10157b;

    /* renamed from: c */
    public int f10158c;

    /* renamed from: d */
    public /* synthetic */ Object f10159d;

    /* renamed from: e */
    public final /* synthetic */ AbstractC8894w f10160e;

    /* renamed from: f */
    public final /* synthetic */ AbstractC8199i f10161f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C2210e(AbstractC8894w abstractC8894w, InterfaceC7559c interfaceC7559c, InterfaceC2139c interfaceC2139c, int i10) {
        super(2, interfaceC7559c);
        this.f10156a = i10;
        switch (i10) {
            case 1:
                this.f10160e = abstractC8894w;
                this.f10161f = (AbstractC8199i) interfaceC2139c;
                super(2, interfaceC7559c);
                break;
            default:
                this.f10160e = abstractC8894w;
                this.f10161f = (AbstractC8199i) interfaceC2139c;
                break;
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [ex.c, ww.i] */
    /* JADX WARN: Type inference failed for: r1v1, types: [ex.c, ww.i] */
    @Override // ww.AbstractC8191a
    public final InterfaceC7559c create(Object obj, InterfaceC7559c interfaceC7559c) {
        switch (this.f10156a) {
            case 0:
                C2210e c2210e = new C2210e(this.f10160e, interfaceC7559c, this.f10161f, 0);
                c2210e.f10159d = obj;
                return c2210e;
            default:
                C2210e c2210e2 = new C2210e(this.f10160e, interfaceC7559c, this.f10161f, 1);
                c2210e2.f10159d = obj;
                return c2210e2;
        }
    }

    @Override // ex.InterfaceC2141e
    public final Object invoke(Object obj, Object obj2) {
        e0 e0Var = (e0) obj;
        InterfaceC7559c interfaceC7559c = (InterfaceC7559c) obj2;
        switch (this.f10156a) {
        }
        return ((C2210e) create(e0Var, interfaceC7559c)).invokeSuspend(a0.f30746a);
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x009b A[PHI: r1 r11
      0x009b: PHI (r1v21 z7.e0) = (r1v18 z7.e0), (r1v27 z7.e0) binds: [B:32:0x0098, B:16:0x0030] A[DONT_GENERATE, DONT_INLINE]
      0x009b: PHI (r11v34 java.lang.Object) = (r11v32 java.lang.Object), (r11v0 java.lang.Object) binds: [B:32:0x0098, B:16:0x0030] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0156 A[PHI: r1 r11
      0x0156: PHI (r1v7 z7.e0) = (r1v4 z7.e0), (r1v13 z7.e0) binds: [B:70:0x0153, B:54:0x00eb] A[DONT_GENERATE, DONT_INLINE]
      0x0156: PHI (r11v13 java.lang.Object) = (r11v11 java.lang.Object), (r11v0 java.lang.Object) binds: [B:70:0x0153, B:54:0x00eb] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x016c  */
    /* JADX WARN: Type inference failed for: r8v0, types: [ex.c, ww.i] */
    /* JADX WARN: Type inference failed for: r8v1, types: [ex.c, ww.i] */
    @Override // ww.AbstractC8191a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            Method dump skipped, instructions count: 386
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: f8.C2210e.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
