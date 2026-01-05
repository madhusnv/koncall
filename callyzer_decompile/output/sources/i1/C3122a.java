package i1;

import ex.InterfaceC2141e;
import k1.x1;
import kotlin.jvm.internal.C4165w;
import m1.InterfaceC4630l;
import tx.InterfaceC7266z;
import uw.InterfaceC7559c;
import wc.InterfaceC7989w;
import ww.AbstractC8199i;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: i1.a */
/* loaded from: classes.dex */
public final class C3122a extends AbstractC8199i implements InterfaceC2141e {

    /* renamed from: a */
    public final /* synthetic */ int f16777a;

    /* renamed from: b */
    public int f16778b;

    /* renamed from: c */
    public long f16779c;

    /* renamed from: d */
    public Object f16780d;

    /* renamed from: e */
    public final /* synthetic */ Object f16781e;

    /* renamed from: f */
    public final /* synthetic */ Object f16782f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C3122a(Object obj, long j6, Object obj2, InterfaceC7559c interfaceC7559c, int i10) {
        super(2, interfaceC7559c);
        this.f16777a = i10;
        this.f16781e = obj;
        this.f16779c = j6;
        this.f16782f = obj2;
    }

    @Override // ww.AbstractC8191a
    public final InterfaceC7559c create(Object obj, InterfaceC7559c interfaceC7559c) {
        switch (this.f16777a) {
            case 0:
                return new C3122a((AbstractC3126e) this.f16781e, this.f16779c, (InterfaceC4630l) this.f16782f, interfaceC7559c, 0);
            case 1:
                C3122a c3122a = new C3122a((x1) this.f16781e, this.f16779c, (C4165w) this.f16782f, interfaceC7559c, 1);
                c3122a.f16780d = obj;
                return c3122a;
            case 2:
                return new C3122a((wc.d0) this.f16781e, (InterfaceC7989w) this.f16782f, interfaceC7559c);
            default:
                return new C3122a((k2.w0) this.f16781e, this.f16779c, (InterfaceC4630l) this.f16782f, interfaceC7559c, 3);
        }
    }

    @Override // ex.InterfaceC2141e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f16777a) {
        }
        return ((C3122a) create((InterfaceC7266z) obj, (InterfaceC7559c) obj2)).invokeSuspend(qw.a0.f30746a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0050, code lost:
    
        if (r8.mo9501a(r9, r19) == r0) goto L25;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:121:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:161:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00c3  */
    /* JADX WARN: Type inference failed for: r13v17 */
    /* JADX WARN: Type inference failed for: r13v7 */
    /* JADX WARN: Type inference failed for: r13v8, types: [w2.q] */
    /* JADX WARN: Type inference failed for: r15v10 */
    /* JADX WARN: Type inference failed for: r15v11 */
    /* JADX WARN: Type inference failed for: r15v12 */
    /* JADX WARN: Type inference failed for: r15v13 */
    /* JADX WARN: Type inference failed for: r15v14 */
    /* JADX WARN: Type inference failed for: r15v2 */
    /* JADX WARN: Type inference failed for: r15v3 */
    /* JADX WARN: Type inference failed for: r15v4, types: [m2.e] */
    /* JADX WARN: Type inference failed for: r15v6 */
    /* JADX WARN: Type inference failed for: r15v7, types: [m2.e] */
    /* JADX WARN: Type inference failed for: r15v9 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x00af -> B:40:0x00b2). Please report as a decompilation issue!!! */
    @Override // ww.AbstractC8191a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r20) {
        /*
            Method dump skipped, instructions count: 590
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: i1.C3122a.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3122a(wc.d0 d0Var, InterfaceC7989w interfaceC7989w, InterfaceC7559c interfaceC7559c) {
        super(2, interfaceC7559c);
        this.f16777a = 2;
        this.f16781e = d0Var;
        this.f16782f = interfaceC7989w;
    }
}
