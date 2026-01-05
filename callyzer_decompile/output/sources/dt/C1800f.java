package dt;

import at.C0430a;
import ex.InterfaceC2141e;
import qw.a0;
import tx.InterfaceC7266z;
import uw.InterfaceC7559c;
import ww.AbstractC8199i;
import wx.m1;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: dt.f */
/* loaded from: classes3.dex */
public final class C1800f extends AbstractC8199i implements InterfaceC2141e {

    /* renamed from: a */
    public final /* synthetic */ int f8708a;

    /* renamed from: b */
    public m1 f8709b;

    /* renamed from: c */
    public C1804j f8710c;

    /* renamed from: d */
    public Object f8711d;

    /* renamed from: e */
    public C0430a f8712e;

    /* renamed from: f */
    public int f8713f;

    /* renamed from: g */
    public int f8714g;

    /* renamed from: h */
    public final /* synthetic */ C1804j f8715h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1800f(C1804j c1804j, InterfaceC7559c interfaceC7559c, int i10) {
        super(2, interfaceC7559c);
        this.f8708a = i10;
        this.f8715h = c1804j;
    }

    @Override // ww.AbstractC8191a
    public final InterfaceC7559c create(Object obj, InterfaceC7559c interfaceC7559c) {
        switch (this.f8708a) {
            case 0:
                return new C1800f(this.f8715h, interfaceC7559c, 0);
            default:
                return new C1800f(this.f8715h, interfaceC7559c, 1);
        }
    }

    @Override // ex.InterfaceC2141e
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC7266z interfaceC7266z = (InterfaceC7266z) obj;
        InterfaceC7559c interfaceC7559c = (InterfaceC7559c) obj2;
        switch (this.f8708a) {
        }
        return ((C1800f) create(interfaceC7266z, interfaceC7559c)).invokeSuspend(a0.f30746a);
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0181 A[LOOP:2: B:54:0x0181->B:74:?, LOOP_START] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:78:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x007d -> B:23:0x007e). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:50:0x0152 -> B:40:0x0107). Please report as a decompilation issue!!! */
    @Override // ww.AbstractC8191a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r31) {
        /*
            Method dump skipped, instructions count: 560
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dt.C1800f.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
