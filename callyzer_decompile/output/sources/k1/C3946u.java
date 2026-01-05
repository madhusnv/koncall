package k1;

import ex.InterfaceC2141e;
import kotlin.jvm.internal.C4164v;
import kotlin.jvm.internal.C4168z;
import p3.C5812j;
import uw.InterfaceC7559c;
import ww.AbstractC8198h;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: k1.u */
/* loaded from: classes.dex */
public final class C3946u extends AbstractC8198h implements InterfaceC2141e {

    /* renamed from: b */
    public C5812j f20244b;

    /* renamed from: c */
    public int f20245c;

    /* renamed from: d */
    public int f20246d;

    /* renamed from: e */
    public /* synthetic */ Object f20247e;

    /* renamed from: f */
    public final /* synthetic */ C4164v f20248f;

    /* renamed from: g */
    public final /* synthetic */ C4168z f20249g;

    /* renamed from: h */
    public final /* synthetic */ C4168z f20250h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3946u(C4164v c4164v, C4168z c4168z, C4168z c4168z2, InterfaceC7559c interfaceC7559c) {
        super(2, interfaceC7559c);
        this.f20248f = c4164v;
        this.f20249g = c4168z;
        this.f20250h = c4168z2;
    }

    @Override // ww.AbstractC8191a
    public final InterfaceC7559c create(Object obj, InterfaceC7559c interfaceC7559c) {
        C3946u c3946u = new C3946u(this.f20248f, this.f20249g, this.f20250h, interfaceC7559c);
        c3946u.f20247e = obj;
        return c3946u;
    }

    @Override // ex.InterfaceC2141e
    public final Object invoke(Object obj, Object obj2) {
        return ((C3946u) create((p3.f0) obj, (InterfaceC7559c) obj2)).invokeSuspend(qw.a0.f30746a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0093, code lost:
    
        r2 = 1;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00d2 A[EDGE_INSN: B:69:0x00d2->B:45:0x00d2 BREAK  A[LOOP:0: B:40:0x00bf->B:44:0x00cf], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x006a A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r6v8, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r7v5, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r9v1, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x00b3 -> B:39:0x00b6). Please report as a decompilation issue!!! */
    @Override // ww.AbstractC8191a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r17) {
        /*
            Method dump skipped, instructions count: 312
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: k1.C3946u.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
