package wo;

import ex.InterfaceC2141e;
import mm.C4802m;
import qw.a0;
import tx.InterfaceC7266z;
import uw.InterfaceC7559c;
import ww.AbstractC8199i;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: wo.i */
/* loaded from: classes3.dex */
public final class C8124i extends AbstractC8199i implements InterfaceC2141e {

    /* renamed from: a */
    public Object f38886a;

    /* renamed from: b */
    public int f38887b;

    /* renamed from: c */
    public /* synthetic */ Object f38888c;

    /* renamed from: d */
    public final /* synthetic */ C4802m f38889d;

    /* renamed from: e */
    public final /* synthetic */ C8134s f38890e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8124i(C4802m c4802m, C8134s c8134s, InterfaceC7559c interfaceC7559c) {
        super(2, interfaceC7559c);
        this.f38889d = c4802m;
        this.f38890e = c8134s;
    }

    @Override // ww.AbstractC8191a
    public final InterfaceC7559c create(Object obj, InterfaceC7559c interfaceC7559c) {
        C8124i c8124i = new C8124i(this.f38889d, this.f38890e, interfaceC7559c);
        c8124i.f38888c = obj;
        return c8124i;
    }

    @Override // ex.InterfaceC2141e
    public final Object invoke(Object obj, Object obj2) {
        return ((C8124i) create((InterfaceC7266z) obj, (InterfaceC7559c) obj2)).invokeSuspend(a0.f30746a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0077, code lost:
    
        if (r6 == r7) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0168, code lost:
    
        if (wo.C8134s.m15297a(r2, r15, r16) == r7) goto L84;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0198  */
    /* JADX WARN: Type inference failed for: r0v2, types: [qw.m] */
    /* JADX WARN: Type inference failed for: r0v24, types: [com.websoptimization.callyzerbiz.data.model.response.SyncResponse] */
    /* JADX WARN: Type inference failed for: r0v27, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v28, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v30, types: [java.lang.Object] */
    @Override // ww.AbstractC8191a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r17) throws com.websoptimization.callyzerbiz.common.exception.RestApiException, com.websoptimization.callyzerbiz.common.exception.DataNotSyncException {
        /*
            Method dump skipped, instructions count: 418
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: wo.C8124i.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
