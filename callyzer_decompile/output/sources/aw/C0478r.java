package aw;

import com.websoptimization.callyzerbiz.workManager.RecordingCompressManager;
import ex.InterfaceC2141e;
import ja.C3614h;
import java.util.ArrayList;
import java.util.List;
import l4.C4367l;
import tx.InterfaceC7266z;
import ud.InterfaceC7411o;
import uw.InterfaceC7559c;
import ww.AbstractC8199i;
import yx.C8810d;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: aw.r */
/* loaded from: classes3.dex */
public final class C0478r extends AbstractC8199i implements InterfaceC2141e {

    /* renamed from: a */
    public final /* synthetic */ int f3423a = 0;

    /* renamed from: b */
    public int f3424b;

    /* renamed from: c */
    public int f3425c;

    /* renamed from: d */
    public Object f3426d;

    /* renamed from: e */
    public Object f3427e;

    /* renamed from: f */
    public Object f3428f;

    /* renamed from: g */
    public Object f3429g;

    /* renamed from: h */
    public Object f3430h;

    /* renamed from: j */
    public /* synthetic */ Object f3431j;

    /* renamed from: k */
    public final /* synthetic */ Object f3432k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0478r(List list, C8810d c8810d, ArrayList arrayList, RecordingCompressManager recordingCompressManager, InterfaceC7559c interfaceC7559c) {
        super(2, interfaceC7559c);
        this.f3427e = list;
        this.f3431j = c8810d;
        this.f3432k = arrayList;
        this.f3429g = recordingCompressManager;
    }

    @Override // ww.AbstractC8191a
    public final InterfaceC7559c create(Object obj, InterfaceC7559c interfaceC7559c) {
        switch (this.f3423a) {
            case 0:
                return new C0478r((List) this.f3427e, (C8810d) this.f3431j, (ArrayList) this.f3432k, (RecordingCompressManager) this.f3429g, interfaceC7559c);
            case 1:
                return new C0478r((C4367l) this.f3430h, (InterfaceC7411o) this.f3431j, (C3614h) this.f3432k, interfaceC7559c);
            default:
                C0478r c0478r = new C0478r((ks.c0) this.f3432k, interfaceC7559c);
                c0478r.f3431j = obj;
                return c0478r;
        }
    }

    @Override // ex.InterfaceC2141e
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC7266z interfaceC7266z = (InterfaceC7266z) obj;
        InterfaceC7559c interfaceC7559c = (InterfaceC7559c) obj2;
        switch (this.f3423a) {
        }
        return ((C0478r) create(interfaceC7266z, interfaceC7559c)).invokeSuspend(qw.a0.f30746a);
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Removed duplicated region for block: B:119:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0244  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0260  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x011e -> B:9:0x0038). Please report as a decompilation issue!!! */
    @Override // ww.AbstractC8191a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r36) {
        /*
            Method dump skipped, instructions count: 926
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: aw.C0478r.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0478r(ks.c0 c0Var, InterfaceC7559c interfaceC7559c) {
        super(2, interfaceC7559c);
        this.f3432k = c0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0478r(C4367l c4367l, InterfaceC7411o interfaceC7411o, C3614h c3614h, InterfaceC7559c interfaceC7559c) {
        super(2, interfaceC7559c);
        this.f3430h = c4367l;
        this.f3431j = interfaceC7411o;
        this.f3432k = c3614h;
    }
}
