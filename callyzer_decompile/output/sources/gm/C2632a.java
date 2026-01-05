package gm;

import com.websoptimization.callyzerbiz.CallRecordingAttachActivity;
import ex.InterfaceC2141e;
import k2.C3966o;
import k2.InterfaceC3962k;
import nq.AbstractC5133e;
import s2.AbstractC6740i;
import uv.AbstractC7554g;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: gm.a */
/* loaded from: classes3.dex */
public final /* synthetic */ class C2632a implements InterfaceC2141e {

    /* renamed from: a */
    public final /* synthetic */ int f14226a;

    /* renamed from: b */
    public final /* synthetic */ CallRecordingAttachActivity f14227b;

    public /* synthetic */ C2632a(CallRecordingAttachActivity callRecordingAttachActivity, int i10) {
        this.f14226a = i10;
        this.f14227b = callRecordingAttachActivity;
    }

    @Override // ex.InterfaceC2141e
    public final Object invoke(Object obj, Object obj2) {
        int i10 = this.f14226a;
        qw.a0 a0Var = qw.a0.f30746a;
        CallRecordingAttachActivity callRecordingAttachActivity = this.f14227b;
        int i11 = 1;
        InterfaceC3962k interfaceC3962k = (InterfaceC3962k) obj;
        int iIntValue = ((Integer) obj2).intValue();
        switch (i10) {
            case 0:
                int i12 = CallRecordingAttachActivity.f7248e;
                C3966o c3966o = (C3966o) interfaceC3962k;
                if (!c3966o.m8598P(iIntValue & 1, (iIntValue & 3) != 2)) {
                    c3966o.m8601S();
                    break;
                } else {
                    AbstractC7554g.m14300a(false, AbstractC6740i.m12902d(1870062984, new C2632a(callRecordingAttachActivity, i11), c3966o), c3966o, 48, 1);
                    break;
                }
            default:
                int i13 = CallRecordingAttachActivity.f7248e;
                C3966o c3966o2 = (C3966o) interfaceC3962k;
                if (!c3966o2.m8598P(iIntValue & 1, (iIntValue & 3) != 2)) {
                    c3966o2.m8601S();
                    break;
                } else {
                    AbstractC5133e.m10054b(callRecordingAttachActivity.getIntent(), c3966o2, 0);
                    break;
                }
        }
        return a0Var;
    }
}
