package hq;

import ex.InterfaceC2139c;
import java.util.List;
import kotlin.jvm.internal.AbstractC4154l;
import lq.C4508c;
import mq.a1;
import wx.m1;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final /* synthetic */ class e0 implements InterfaceC2139c {

    /* renamed from: a */
    public final /* synthetic */ int f16177a;

    /* renamed from: b */
    public final /* synthetic */ a1 f16178b;

    public /* synthetic */ e0(a1 a1Var, int i10) {
        this.f16177a = i10;
        this.f16178b = a1Var;
    }

    @Override // ex.InterfaceC2139c
    public final Object invoke(Object obj) {
        Object value;
        Object value2;
        switch (this.f16177a) {
            case 0:
                this.f16178b.m9792i(new mq.m0(((Boolean) obj).booleanValue()));
                break;
            case 1:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                m1 m1Var = this.f16178b.f24148o;
                do {
                    value = m1Var.getValue();
                } while (!m1Var.m15397i(value, C4508c.m9341a((C4508c) value, null, false, zBooleanValue, 0, false, 0, false, null, false, null, 1019)));
            default:
                List neverAttendCallsUiModels = (List) obj;
                AbstractC4154l.m8923f(neverAttendCallsUiModels, "neverAttendCallsUiModels");
                a1 a1Var = this.f16178b;
                m1 m1Var2 = a1Var.f24148o;
                do {
                    value2 = m1Var2.getValue();
                } while (!m1Var2.m15397i(value2, C4508c.m9341a((C4508c) value2, neverAttendCallsUiModels, neverAttendCallsUiModels.size() < a1Var.f24150q, false, 0, true, neverAttendCallsUiModels.size(), false, null, false, null, 972)));
        }
        return qw.a0.f30746a;
    }
}
