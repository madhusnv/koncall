package eq;

import android.content.Context;
import com.websoptimization.callyzerbiz.domain.model.FCMData;
import ex.InterfaceC2141e;
import lm.C4486a;
import qw.a0;
import tx.InterfaceC7266z;
import uw.InterfaceC7559c;
import ww.AbstractC8199i;
import yn.C8716n;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: eq.c */
/* loaded from: classes3.dex */
public final class C2091c extends AbstractC8199i implements InterfaceC2141e {

    /* renamed from: a */
    public final /* synthetic */ int f9781a;

    /* renamed from: b */
    public int f9782b;

    /* renamed from: c */
    public int f9783c;

    /* renamed from: d */
    public int f9784d;

    /* renamed from: e */
    public Object f9785e;

    /* renamed from: f */
    public Object f9786f;

    /* renamed from: g */
    public Object f9787g;

    /* renamed from: h */
    public Object f9788h;

    /* renamed from: j */
    public Object f9789j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2091c(C2100l c2100l, InterfaceC7559c interfaceC7559c) {
        super(2, interfaceC7559c);
        this.f9781a = 0;
        this.f9787g = c2100l;
    }

    @Override // ww.AbstractC8191a
    public final InterfaceC7559c create(Object obj, InterfaceC7559c interfaceC7559c) {
        switch (this.f9781a) {
            case 0:
                return new C2091c((C2100l) this.f9787g, interfaceC7559c);
            case 1:
                return new C2091c((C4486a) this.f9788h, (Context) this.f9789j, interfaceC7559c, 1);
            default:
                return new C2091c((FCMData) this.f9788h, (C8716n) this.f9789j, interfaceC7559c, 2);
        }
    }

    @Override // ex.InterfaceC2141e
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC7266z interfaceC7266z = (InterfaceC7266z) obj;
        InterfaceC7559c interfaceC7559c = (InterfaceC7559c) obj2;
        switch (this.f9781a) {
        }
        return ((C2091c) create(interfaceC7266z, interfaceC7559c)).invokeSuspend(a0.f30746a);
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 10, insn: 0x0159: MOVE (r3 I:??[OBJECT, ARRAY]) = (r10 I:??[OBJECT, ARRAY]) (LINE:346), block:B:54:0x0159 */
    /* JADX WARN: Removed duplicated region for block: B:157:0x03e3  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x03e5  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0417 A[LOOP:2: B:163:0x0411->B:165:0x0417, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0427  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x042a  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0448  */
    /* JADX WARN: Removed duplicated region for block: B:203:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:205:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v5, types: [wx.m1] */
    /* JADX WARN: Type inference failed for: r10v19 */
    /* JADX WARN: Type inference failed for: r10v49, types: [ex.e, ww.i] */
    /* JADX WARN: Type inference failed for: r3v1, types: [int] */
    /* JADX WARN: Type inference failed for: r3v2, types: [dy.a] */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:160:0x03fc -> B:127:0x02fa). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x00d9 -> B:34:0x00df). Please report as a decompilation issue!!! */
    @Override // ww.AbstractC8191a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r32) {
        /*
            Method dump skipped, instructions count: 1220
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: eq.C2091c.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2091c(Object obj, Object obj2, InterfaceC7559c interfaceC7559c, int i10) {
        super(2, interfaceC7559c);
        this.f9781a = i10;
        this.f9788h = obj;
        this.f9789j = obj2;
    }
}
