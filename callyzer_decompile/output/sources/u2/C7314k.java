package u2;

import ex.InterfaceC2141e;
import mx.C4912h;
import uw.InterfaceC7559c;
import ww.AbstractC8198h;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: u2.k */
/* loaded from: classes.dex */
public final class C7314k extends AbstractC8198h implements InterfaceC2141e {

    /* renamed from: b */
    public long[] f34878b;

    /* renamed from: c */
    public int f34879c;

    /* renamed from: d */
    public int f34880d;

    /* renamed from: e */
    public int f34881e;

    /* renamed from: f */
    public /* synthetic */ Object f34882f;

    /* renamed from: g */
    public final /* synthetic */ C7315l f34883g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7314k(C7315l c7315l, InterfaceC7559c interfaceC7559c) {
        super(2, interfaceC7559c);
        this.f34883g = c7315l;
    }

    @Override // ww.AbstractC8191a
    public final InterfaceC7559c create(Object obj, InterfaceC7559c interfaceC7559c) {
        C7314k c7314k = new C7314k(this.f34883g, interfaceC7559c);
        c7314k.f34882f = obj;
        return c7314k;
    }

    @Override // ex.InterfaceC2141e
    public final Object invoke(Object obj, Object obj2) {
        return ((C7314k) create((C4912h) obj, (InterfaceC7559c) obj2)).invokeSuspend(qw.a0.f30746a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0078, code lost:
    
        if (r13.m9805d(r10, r21) == r8) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00a5, code lost:
    
        if (r9.m9805d(r10, r21) == r8) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00d4, code lost:
    
        if (r6.m9805d(r7, r21) == r8) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00d6, code lost:
    
        return r8;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00b6  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0078 -> B:19:0x007b). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x00a5 -> B:32:0x00a9). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x00a8 -> B:32:0x00a9). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:40:0x00d4 -> B:44:0x00d9). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:42:0x00d7 -> B:43:0x00d8). Please report as a decompilation issue!!! */
    @Override // ww.AbstractC8191a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r22) {
        /*
            Method dump skipped, instructions count: 222
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: u2.C7314k.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
