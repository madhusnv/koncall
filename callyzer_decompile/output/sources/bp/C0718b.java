package bp;

import d7.AbstractC1646r;
import d7.InterfaceC1649u;
import ex.InterfaceC2139c;
import g4.n0;
import k2.f0;
import k2.w0;
import kotlin.jvm.internal.AbstractC4154l;
import kq.C4181k;
import l4.C4381z;
import og.yf;
import pg.w9;
import qw.a0;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: bp.b */
/* loaded from: classes3.dex */
public final /* synthetic */ class C0718b implements InterfaceC2139c {

    /* renamed from: a */
    public final /* synthetic */ int f4535a;

    /* renamed from: b */
    public final /* synthetic */ w0 f4536b;

    /* renamed from: c */
    public final /* synthetic */ w0 f4537c;

    public /* synthetic */ C0718b(w0 w0Var, w0 w0Var2, int i10) {
        this.f4535a = i10;
        this.f4536b = w0Var;
        this.f4537c = w0Var2;
    }

    @Override // ex.InterfaceC2139c
    public final Object invoke(Object obj) {
        int i10 = this.f4535a;
        a0 a0Var = a0.f30746a;
        w0 w0Var = this.f4537c;
        w0 w0Var2 = this.f4536b;
        switch (i10) {
            case 0:
                f0 DisposableEffect = (f0) obj;
                AbstractC4154l.m8923f(DisposableEffect, "$this$DisposableEffect");
                AbstractC1646r lifecycle = ((InterfaceC1649u) w0Var2.getValue()).getLifecycle();
                C0717a c0717a = new C0717a(w0Var, 0);
                lifecycle.mo5343a(c0717a);
                break;
            case 1:
                C4181k callHistory = (C4181k) obj;
                AbstractC4154l.m8923f(callHistory, "callHistory");
                w0Var2.setValue(callHistory);
                w0Var.setValue(Boolean.TRUE);
                break;
            case 2:
                String number = (String) obj;
                AbstractC4154l.m8923f(number, "number");
                w0Var2.setValue(number);
                w0Var.setValue(Boolean.TRUE);
                break;
            case 3:
                String number2 = (String) obj;
                AbstractC4154l.m8923f(number2, "number");
                w0Var2.setValue(number2);
                w0Var.setValue(Boolean.TRUE);
                break;
            case 4:
                String it = (String) obj;
                AbstractC4154l.m8923f(it, "it");
                w0Var2.setValue(it);
                w0Var.setValue(Boolean.TRUE);
                break;
            default:
                C4381z newValue = (C4381z) obj;
                AbstractC4154l.m8923f(newValue, "newValue");
                String str = newValue.f21945a.f13620b;
                long j6 = newValue.f21946b;
                int i11 = n0.f13685c;
                int iM11912c = w9.m11912c((int) (j6 >> 32), 0, str.length());
                int iM11912c2 = w9.m11912c((int) (j6 & 4294967295L), 0, str.length());
                w0Var2.setValue(str);
                w0Var.setValue(new C4381z(str, 4, yf.m11072a(iM11912c, iM11912c2)));
                break;
        }
        return a0Var;
    }
}
