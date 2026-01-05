package fv;

import ex.InterfaceC2141e;
import qw.a0;
import tx.InterfaceC7266z;
import uw.InterfaceC7559c;
import ww.AbstractC8199i;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: fv.a */
/* loaded from: classes3.dex */
public final class C2376a extends AbstractC8199i implements InterfaceC2141e {

    /* renamed from: a */
    public final /* synthetic */ int f10813a;

    /* renamed from: b */
    public int f10814b;

    /* renamed from: c */
    public final /* synthetic */ C2386k f10815c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2376a(C2386k c2386k, InterfaceC7559c interfaceC7559c, int i10) {
        super(2, interfaceC7559c);
        this.f10813a = i10;
        this.f10815c = c2386k;
    }

    @Override // ww.AbstractC8191a
    public final InterfaceC7559c create(Object obj, InterfaceC7559c interfaceC7559c) {
        switch (this.f10813a) {
            case 0:
                return new C2376a(this.f10815c, interfaceC7559c, 0);
            case 1:
                return new C2376a(this.f10815c, interfaceC7559c, 1);
            case 2:
                return new C2376a(this.f10815c, interfaceC7559c, 2);
            case 3:
                return new C2376a(this.f10815c, interfaceC7559c, 3);
            case 4:
                return new C2376a(this.f10815c, interfaceC7559c, 4);
            case 5:
                return new C2376a(this.f10815c, interfaceC7559c, 5);
            case 6:
                return new C2376a(this.f10815c, interfaceC7559c, 6);
            case 7:
                return new C2376a(this.f10815c, interfaceC7559c, 7);
            case 8:
                return new C2376a(this.f10815c, interfaceC7559c, 8);
            case 9:
                return new C2376a(this.f10815c, interfaceC7559c, 9);
            case 10:
                return new C2376a(this.f10815c, interfaceC7559c, 10);
            default:
                return new C2376a(this.f10815c, interfaceC7559c, 11);
        }
    }

    @Override // ex.InterfaceC2141e
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC7266z interfaceC7266z = (InterfaceC7266z) obj;
        InterfaceC7559c interfaceC7559c = (InterfaceC7559c) obj2;
        switch (this.f10813a) {
        }
        return ((C2376a) create(interfaceC7266z, interfaceC7559c)).invokeSuspend(a0.f30746a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:141:0x0400, code lost:
    
        if (fv.C2386k.m6067l(r7, r0, r43) == r14) goto L142;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0094, code lost:
    
        if (r0 == r2) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00a5, code lost:
    
        if (r0 == r2) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00ea, code lost:
    
        return r2;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:204:0x0583  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x0595  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x060d  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x061f  */
    /* JADX WARN: Removed duplicated region for block: B:337:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:342:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r13v0, types: [uw.c] */
    /* JADX WARN: Type inference failed for: r13v1, types: [om.p] */
    /* JADX WARN: Type inference failed for: r13v21 */
    /* JADX WARN: Type inference failed for: r1v45, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v48 */
    /* JADX WARN: Type inference failed for: r1v49 */
    /* JADX WARN: Type inference failed for: r1v63 */
    /* JADX WARN: Type inference failed for: r1v64 */
    /* JADX WARN: Type inference failed for: r1v65 */
    /* JADX WARN: Type inference failed for: r1v66 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v33 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8, types: [wx.m1] */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r6v20 */
    /* JADX WARN: Type inference failed for: r6v27 */
    /* JADX WARN: Type inference failed for: r6v28 */
    /* JADX WARN: Type inference failed for: r6v31 */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 3 */
    @Override // ww.AbstractC8191a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r44) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 1764
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: fv.C2376a.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
