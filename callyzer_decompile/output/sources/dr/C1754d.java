package dr;

import br.C0740c;
import ex.InterfaceC2141e;
import tq.EnumC7204p;
import tx.InterfaceC7266z;
import uw.InterfaceC7559c;
import ww.AbstractC8199i;
import wx.u0;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: dr.d */
/* loaded from: classes3.dex */
public final class C1754d extends AbstractC8199i implements InterfaceC2141e {

    /* renamed from: a */
    public u0 f8491a;

    /* renamed from: b */
    public C1775y f8492b;

    /* renamed from: c */
    public Object f8493c;

    /* renamed from: d */
    public C0740c f8494d;

    /* renamed from: e */
    public EnumC7204p f8495e;

    /* renamed from: f */
    public int f8496f;

    /* renamed from: g */
    public int f8497g;

    /* renamed from: h */
    public boolean f8498h;

    /* renamed from: j */
    public int f8499j;

    /* renamed from: k */
    public final /* synthetic */ C1775y f8500k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1754d(C1775y c1775y, InterfaceC7559c interfaceC7559c) {
        super(2, interfaceC7559c);
        this.f8500k = c1775y;
    }

    @Override // ww.AbstractC8191a
    public final InterfaceC7559c create(Object obj, InterfaceC7559c interfaceC7559c) {
        return new C1754d(this.f8500k, interfaceC7559c);
    }

    @Override // ex.InterfaceC2141e
    public final Object invoke(Object obj, Object obj2) {
        return ((C1754d) create((InterfaceC7266z) obj, (InterfaceC7559c) obj2)).invokeSuspend(qw.a0.f30746a);
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:67:0x02a6  */
    /* JADX WARN: Type inference failed for: r14v1, types: [wx.u0] */
    /* JADX WARN: Type inference failed for: r1v5, types: [dr.y] */
    /* JADX WARN: Type inference failed for: r24v2 */
    /* JADX WARN: Type inference failed for: r24v3, types: [boolean] */
    /* JADX WARN: Type inference failed for: r24v4 */
    /* JADX WARN: Type inference failed for: r3v22, types: [dr.y] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x013d -> B:12:0x007e). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:66:0x02a4 -> B:72:0x02be). Please report as a decompilation issue!!! */
    @Override // ww.AbstractC8191a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r46) {
        /*
            Method dump skipped, instructions count: 746
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dr.C1754d.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
