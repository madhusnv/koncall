package xv;

import ex.InterfaceC2141e;
import qw.a0;
import tx.InterfaceC7266z;
import uw.InterfaceC7559c;
import ww.AbstractC8199i;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: xv.e */
/* loaded from: classes3.dex */
public final class C8478e extends AbstractC8199i implements InterfaceC2141e {

    /* renamed from: a */
    public Throwable f41299a;

    /* renamed from: b */
    public int f41300b;

    /* renamed from: c */
    public int f41301c;

    /* renamed from: d */
    public /* synthetic */ Object f41302d;

    /* renamed from: e */
    public final /* synthetic */ C8489p f41303e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8478e(C8489p c8489p, InterfaceC7559c interfaceC7559c) {
        super(2, interfaceC7559c);
        this.f41303e = c8489p;
    }

    @Override // ww.AbstractC8191a
    public final InterfaceC7559c create(Object obj, InterfaceC7559c interfaceC7559c) {
        C8478e c8478e = new C8478e(this.f41303e, interfaceC7559c);
        c8478e.f41302d = obj;
        return c8478e;
    }

    @Override // ex.InterfaceC2141e
    public final Object invoke(Object obj, Object obj2) {
        return ((C8478e) create((InterfaceC7266z) obj, (InterfaceC7559c) obj2)).invokeSuspend(a0.f30746a);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x0200, code lost:
    
        if (xv.C8489p.m15781j(r2, r20) != r8) goto L136;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x0219, code lost:
    
        if (xv.C8489p.m15781j(r2, r20) != r8) goto L136;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x0281, code lost:
    
        if (xv.C8489p.m15781j(r2, r20) == r8) goto L155;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x0293, code lost:
    
        if (xv.C8489p.m15781j(r2, r20) == r8) goto L155;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x01d8 A[Catch: all -> 0x0045, Exception -> 0x0049, SimStateException -> 0x004c, PHI: r4
      0x01d8: PHI (r4v36 int) = (r4v45 int), (r4v46 int) binds: [B:100:0x01d4, B:20:0x0051] A[DONT_GENERATE, DONT_INLINE], TryCatch #1 {all -> 0x0045, blocks: (B:11:0x0040, B:105:0x01e9, B:109:0x0204, B:113:0x021d, B:20:0x0051, B:102:0x01d8, B:23:0x0058, B:84:0x0199, B:86:0x01a1, B:88:0x01b4, B:99:0x01c9, B:26:0x0061), top: B:171:0x0019 }] */
    /* JADX WARN: Removed duplicated region for block: B:104:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0270  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0286  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x02a3  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x02c2  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x02ea A[LOOP:3: B:157:0x02ea->B:180:?, LOOP_START] */
    /* JADX WARN: Removed duplicated region for block: B:192:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0122 A[PHI: r4 r9 r18
      0x0122: PHI (r4v8 java.lang.Object) = (r4v7 java.lang.Object), (r4v20 java.lang.Object) binds: [B:57:0x011e, B:28:0x0069] A[DONT_GENERATE, DONT_INLINE]
      0x0122: PHI (r9v14 int) = (r9v12 int), (r9v16 int) binds: [B:57:0x011e, B:28:0x0069] A[DONT_GENERATE, DONT_INLINE]
      0x0122: PHI (r18v2 java.lang.String) = (r18v0 java.lang.String), (r18v7 java.lang.String) binds: [B:57:0x011e, B:28:0x0069] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0181 A[Catch: all -> 0x01c2, Exception -> 0x01c4, SimStateException -> 0x01c6, TRY_LEAVE, TryCatch #5 {SimStateException -> 0x01c6, Exception -> 0x01c4, all -> 0x01c2, blocks: (B:78:0x0179, B:80:0x0181, B:75:0x0166), top: B:173:0x0166 }] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01a1 A[Catch: all -> 0x0045, Exception -> 0x0049, SimStateException -> 0x004c, LOOP:0: B:86:0x01a1->B:176:?, LOOP_START, TryCatch #1 {all -> 0x0045, blocks: (B:11:0x0040, B:105:0x01e9, B:109:0x0204, B:113:0x021d, B:20:0x0051, B:102:0x01d8, B:23:0x0058, B:84:0x0199, B:86:0x01a1, B:88:0x01b4, B:99:0x01c9, B:26:0x0061), top: B:171:0x0019 }] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01c8  */
    /* JADX WARN: Type inference failed for: r4v0, types: [nn.e] */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v2, types: [int] */
    /* JADX WARN: Type inference failed for: r4v21 */
    /* JADX WARN: Type inference failed for: r4v22 */
    /* JADX WARN: Type inference failed for: r4v23 */
    /* JADX WARN: Type inference failed for: r4v38, types: [int] */
    /* JADX WARN: Type inference failed for: r4v4, types: [int] */
    /* JADX WARN: Type inference failed for: r4v43 */
    /* JADX WARN: Type inference failed for: r4v44 */
    /* JADX WARN: Type inference failed for: r4v5 */
    @Override // ww.AbstractC8191a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r21) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 860
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: xv.C8478e.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
