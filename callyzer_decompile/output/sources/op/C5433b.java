package op;

import ex.InterfaceC2137a;
import ex.InterfaceC2139c;
import k2.w0;
import kotlin.jvm.internal.AbstractC4154l;
import qw.a0;
import rt.C6617a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: op.b */
/* loaded from: classes3.dex */
public final /* synthetic */ class C5433b implements InterfaceC2139c {

    /* renamed from: a */
    public final /* synthetic */ int f27330a;

    /* renamed from: b */
    public final /* synthetic */ w0 f27331b;

    /* renamed from: c */
    public final /* synthetic */ w0 f27332c;

    /* renamed from: d */
    public final /* synthetic */ w0 f27333d;

    /* renamed from: e */
    public final /* synthetic */ w0 f27334e;

    public /* synthetic */ C5433b(w0 w0Var, w0 w0Var2, w0 w0Var3, w0 w0Var4, int i10) {
        this.f27330a = i10;
        this.f27331b = w0Var;
        this.f27332c = w0Var2;
        this.f27333d = w0Var3;
        this.f27334e = w0Var4;
    }

    @Override // ex.InterfaceC2139c
    public final Object invoke(Object obj) {
        switch (this.f27330a) {
            case 0:
                C6617a callLogData = (C6617a) obj;
                AbstractC4154l.m8923f(callLogData, "callLogData");
                this.f27331b.setValue(Boolean.TRUE);
                this.f27332c.setValue(callLogData);
                this.f27333d.setValue(callLogData.f31772b);
                this.f27334e.setValue(callLogData.f31774d);
                break;
            case 1:
                Boolean bool = (Boolean) obj;
                boolean zBooleanValue = bool.booleanValue();
                this.f27331b.setValue(bool);
                if (zBooleanValue) {
                    this.f27333d.setValue(Boolean.TRUE);
                } else {
                    this.f27332c.setValue(Boolean.TRUE);
                }
                this.f27334e.setValue(Boolean.FALSE);
                break;
            default:
                Boolean bool2 = (Boolean) obj;
                boolean zBooleanValue2 = bool2.booleanValue();
                this.f27331b.setValue(bool2);
                if (zBooleanValue2) {
                    w0 w0Var = this.f27333d;
                    InterfaceC2137a interfaceC2137a = (InterfaceC2137a) w0Var.getValue();
                    if (interfaceC2137a != null) {
                        interfaceC2137a.invoke();
                    }
                    w0Var.setValue(null);
                } else {
                    this.f27332c.setValue(Boolean.TRUE);
                }
                this.f27334e.setValue(Boolean.FALSE);
                break;
        }
        return a0.f30746a;
    }
}
