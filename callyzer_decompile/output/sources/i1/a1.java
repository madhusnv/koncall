package i1;

import ex.InterfaceC2141e;
import j$.time.LocalDateTime;
import java.io.Serializable;
import tx.InterfaceC7266z;
import uw.InterfaceC7559c;
import ww.AbstractC8199i;
import yn.C8716n;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class a1 extends AbstractC8199i implements InterfaceC2141e {

    /* renamed from: a */
    public final /* synthetic */ int f16787a = 0;

    /* renamed from: b */
    public int f16788b;

    /* renamed from: c */
    public Object f16789c;

    /* renamed from: d */
    public Object f16790d;

    /* renamed from: e */
    public Object f16791e;

    /* renamed from: f */
    public Object f16792f;

    /* renamed from: g */
    public Object f16793g;

    /* renamed from: h */
    public Object f16794h;

    /* renamed from: j */
    public final /* synthetic */ Object f16795j;

    /* renamed from: k */
    public final /* synthetic */ Object f16796k;

    /* renamed from: l */
    public final /* synthetic */ Serializable f16797l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public a1(y0 y0Var, b1 b1Var, InterfaceC2141e interfaceC2141e, Object obj, InterfaceC7559c interfaceC7559c) {
        super(2, interfaceC7559c);
        this.f16796k = y0Var;
        this.f16795j = b1Var;
        this.f16797l = (AbstractC8199i) interfaceC2141e;
        this.f16793g = obj;
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [ex.e, ww.i] */
    @Override // ww.AbstractC8191a
    public final InterfaceC7559c create(Object obj, InterfaceC7559c interfaceC7559c) {
        switch (this.f16787a) {
            case 0:
                a1 a1Var = new a1((y0) this.f16796k, (b1) this.f16795j, (InterfaceC2141e) this.f16797l, this.f16793g, interfaceC7559c);
                a1Var.f16792f = obj;
                return a1Var;
            default:
                a1 a1Var2 = new a1((C8716n) this.f16794h, (String) this.f16795j, (LocalDateTime) this.f16796k, (LocalDateTime) this.f16797l, interfaceC7559c);
                a1Var2.f16789c = obj;
                return a1Var2;
        }
    }

    @Override // ex.InterfaceC2141e
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC7266z interfaceC7266z = (InterfaceC7266z) obj;
        InterfaceC7559c interfaceC7559c = (InterfaceC7559c) obj2;
        switch (this.f16787a) {
        }
        return ((a1) create(interfaceC7266z, interfaceC7559c)).invokeSuspend(qw.a0.f30746a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:125:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:127:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:128:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:129:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a7 A[Catch: all -> 0x0060, TRY_ENTER, TryCatch #0 {all -> 0x0060, blocks: (B:13:0x005a, B:38:0x00b5, B:35:0x00a7), top: B:111:0x0029 }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x016f  */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v27 */
    /* JADX WARN: Type inference failed for: r1v33 */
    /* JADX WARN: Type inference failed for: r1v34 */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v22 */
    /* JADX WARN: Type inference failed for: r3v3, types: [ex.e] */
    @Override // ww.AbstractC8191a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r21) {
        /*
            Method dump skipped, instructions count: 650
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: i1.a1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a1(C8716n c8716n, String str, LocalDateTime localDateTime, LocalDateTime localDateTime2, InterfaceC7559c interfaceC7559c) {
        super(2, interfaceC7559c);
        this.f16794h = c8716n;
        this.f16795j = str;
        this.f16796k = localDateTime;
        this.f16797l = localDateTime2;
    }
}
