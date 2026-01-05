package g2;

import ex.InterfaceC2141e;
import i1.C3128g;
import uw.InterfaceC7559c;
import ww.AbstractC8198h;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class o5 extends AbstractC8198h implements InterfaceC2141e {

    /* renamed from: b */
    public final /* synthetic */ int f12279b;

    /* renamed from: c */
    public int f12280c;

    /* renamed from: d */
    public /* synthetic */ Object f12281d;

    /* renamed from: e */
    public final /* synthetic */ Object f12282e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o5(Object obj, InterfaceC7559c interfaceC7559c, int i10) {
        super(2, interfaceC7559c);
        this.f12279b = i10;
        this.f12282e = obj;
    }

    @Override // ww.AbstractC8191a
    public final InterfaceC7559c create(Object obj, InterfaceC7559c interfaceC7559c) {
        switch (this.f12279b) {
            case 0:
                o5 o5Var = new o5((l5) this.f12282e, interfaceC7559c, 0);
                o5Var.f12281d = obj;
                return o5Var;
            default:
                o5 o5Var2 = new o5((C3128g) this.f12282e, interfaceC7559c, 1);
                o5Var2.f12281d = obj;
                return o5Var2;
        }
    }

    @Override // ex.InterfaceC2141e
    public final Object invoke(Object obj, Object obj2) {
        p3.f0 f0Var = (p3.f0) obj;
        InterfaceC7559c interfaceC7559c = (InterfaceC7559c) obj2;
        switch (this.f12279b) {
        }
        return ((o5) create(f0Var, interfaceC7559c)).invokeSuspend(qw.a0.f30746a);
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Removed duplicated region for block: B:21:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x009a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:66:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r13v21, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0056 -> B:19:0x0059). Please report as a decompilation issue!!! */
    @Override // ww.AbstractC8191a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            Method dump skipped, instructions count: 278
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: g2.o5.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
