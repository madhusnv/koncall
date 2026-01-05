package hm;

import com.websoptimization.callyzerbiz.broadcastReceivers.PhoneStateReceiver;
import com.websoptimization.callyzerbiz.data.model.request.LeadNumberVerificationRequest;
import ex.InterfaceC2141e;
import java.util.Iterator;
import java.util.List;
import qw.a0;
import tx.InterfaceC7266z;
import uw.InterfaceC7559c;
import ww.AbstractC8199i;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: hm.h */
/* loaded from: classes3.dex */
public final class C2972h extends AbstractC8199i implements InterfaceC2141e {

    /* renamed from: a */
    public List f16067a;

    /* renamed from: b */
    public String f16068b;

    /* renamed from: c */
    public List f16069c;

    /* renamed from: d */
    public LeadNumberVerificationRequest f16070d;

    /* renamed from: e */
    public PhoneStateReceiver f16071e;

    /* renamed from: f */
    public Iterator f16072f;

    /* renamed from: g */
    public int f16073g;

    /* renamed from: h */
    public int f16074h;

    /* renamed from: j */
    public int f16075j;

    /* renamed from: k */
    public final /* synthetic */ PhoneStateReceiver f16076k;

    /* renamed from: l */
    public final /* synthetic */ LeadNumberVerificationRequest f16077l;

    /* renamed from: m */
    public final /* synthetic */ List f16078m;

    /* renamed from: n */
    public final /* synthetic */ String f16079n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2972h(PhoneStateReceiver phoneStateReceiver, LeadNumberVerificationRequest leadNumberVerificationRequest, List list, String str, InterfaceC7559c interfaceC7559c) {
        super(2, interfaceC7559c);
        this.f16076k = phoneStateReceiver;
        this.f16077l = leadNumberVerificationRequest;
        this.f16078m = list;
        this.f16079n = str;
    }

    @Override // ww.AbstractC8191a
    public final InterfaceC7559c create(Object obj, InterfaceC7559c interfaceC7559c) {
        return new C2972h(this.f16076k, this.f16077l, this.f16078m, this.f16079n, interfaceC7559c);
    }

    @Override // ex.InterfaceC2141e
    public final Object invoke(Object obj, Object obj2) {
        return ((C2972h) create((InterfaceC7266z) obj, (InterfaceC7559c) obj2)).invokeSuspend(a0.f30746a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x00db, code lost:
    
        if (r4.m15721k(false, r17) != r3) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0136, code lost:
    
        r16 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x01ba, code lost:
    
        if (r7.m15721k(true, r17) != r3) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x01c8, code lost:
    
        r16 = r1;
     */
    /* JADX WARN: Path cross not found for [B:38:0x010b, B:46:0x0139], limit reached: 75 */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01cc  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:55:0x01ba -> B:57:0x01bd). Please report as a decompilation issue!!! */
    @Override // ww.AbstractC8191a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r18) {
        /*
            Method dump skipped, instructions count: 569
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: hm.C2972h.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
