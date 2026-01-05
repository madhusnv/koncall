package hq;

import ex.InterfaceC2139c;
import kotlin.jvm.internal.AbstractC4154l;
import mq.C4844l;
import mq.C4846n;
import mq.C4852t;
import mq.C4856x;
import qw.C6361k;
import uw.C7565i;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: hq.w */
/* loaded from: classes3.dex */
public final class C3018w implements InterfaceC2139c {

    /* renamed from: a */
    public final /* synthetic */ int f16295a;

    /* renamed from: b */
    public final /* synthetic */ mq.h0 f16296b;

    public /* synthetic */ C3018w(mq.h0 h0Var, int i10) {
        this.f16295a = i10;
        this.f16296b = h0Var;
    }

    @Override // ex.InterfaceC2139c
    public final Object invoke(Object obj) {
        switch (this.f16295a) {
            case 0:
                String search = (String) obj;
                AbstractC4154l.m8923f(search, "search");
                this.f16296b.m9801m(new C4852t(search));
                break;
            case 1:
                int iIntValue = ((Number) obj).intValue();
                Integer numValueOf = Integer.valueOf(iIntValue);
                mq.h0 h0Var = this.f16296b;
                h0Var.m9801m(new C4846n(new C6361k(numValueOf, (String) tx.c0.m13468D(C7565i.f36440a, new C4856x(h0Var, iIntValue, null, 0)))));
                break;
            default:
                this.f16296b.m9801m(new C4844l(((Number) obj).intValue()));
                break;
        }
        return qw.a0.f30746a;
    }
}
