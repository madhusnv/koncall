package b2;

import ex.InterfaceC2141e;
import nf.C5047i;
import t1.AbstractC7000y;
import uw.InterfaceC7559c;
import ww.AbstractC8198h;
import y1.C8529a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: b2.y */
/* loaded from: classes.dex */
public final class C0567y extends AbstractC8198h implements InterfaceC2141e {

    /* renamed from: b */
    public final /* synthetic */ int f3860b;

    /* renamed from: c */
    public int f3861c;

    /* renamed from: d */
    public /* synthetic */ Object f3862d;

    /* renamed from: e */
    public Object f3863e;

    /* renamed from: f */
    public Object f3864f;

    /* renamed from: g */
    public final /* synthetic */ Object f3865g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0567y(Object obj, InterfaceC7559c interfaceC7559c, int i10) {
        super(2, interfaceC7559c);
        this.f3860b = i10;
        this.f3865g = obj;
    }

    @Override // ww.AbstractC8191a
    public final InterfaceC7559c create(Object obj, InterfaceC7559c interfaceC7559c) {
        switch (this.f3860b) {
            case 0:
                C0567y c0567y = new C0567y((C5047i) this.f3863e, (C0554l) this.f3864f, (x1.d1) this.f3865g, interfaceC7559c);
                c0567y.f3862d = obj;
                return c0567y;
            case 1:
                C0567y c0567y2 = new C0567y((AbstractC7000y) this.f3865g, interfaceC7559c, 1);
                c0567y2.f3862d = obj;
                return c0567y2;
            default:
                C0567y c0567y3 = new C0567y((C8529a) this.f3865g, interfaceC7559c, 2);
                c0567y3.f3862d = obj;
                return c0567y3;
        }
    }

    @Override // ex.InterfaceC2141e
    public final Object invoke(Object obj, Object obj2) {
        p3.f0 f0Var = (p3.f0) obj;
        InterfaceC7559c interfaceC7559c = (InterfaceC7559c) obj2;
        switch (this.f3860b) {
        }
        return ((C0567y) create(f0Var, interfaceC7559c)).invokeSuspend(qw.a0.f30746a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:252:0x01c2, code lost:
    
        continue;
     */
    /* JADX WARN: Path cross not found for [B:31:0x00b4, B:26:0x0093], limit reached: 257 */
    /* JADX WARN: Path cross not found for [B:34:0x00b9, B:37:0x00bf], limit reached: 257 */
    /* JADX WARN: Path cross not found for [B:59:0x011b, B:61:0x0122], limit reached: 257 */
    /* JADX WARN: Path cross not found for [B:61:0x0122, B:56:0x0109], limit reached: 257 */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0263  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0288  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x02f2  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x030e  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0327  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x03b6  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x0282 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:230:0x0103 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:266:0x031e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:271:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:272:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0140  */
    /* JADX WARN: Type inference failed for: r12v6, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r3v10, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r4v39, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r9v4, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:146:0x0255 -> B:148:0x0258). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:180:0x0300 -> B:182:0x0303). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:40:0x00d2 -> B:42:0x00d6). Please report as a decompilation issue!!! */
    @Override // ww.AbstractC8191a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r20) {
        /*
            Method dump skipped, instructions count: 976
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: b2.C0567y.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0567y(C5047i c5047i, C0554l c0554l, x1.d1 d1Var, InterfaceC7559c interfaceC7559c) {
        super(2, interfaceC7559c);
        this.f3860b = 0;
        this.f3863e = c5047i;
        this.f3864f = c0554l;
        this.f3865g = d1Var;
    }
}
