package vv;

import android.content.Context;
import ex.InterfaceC2137a;
import ex.InterfaceC2139c;
import k2.w0;
import kotlin.jvm.internal.AbstractC4154l;
import l7.a0;
import p005f.C2162k;
import r5.AbstractC6468c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: vv.b */
/* loaded from: classes3.dex */
public final class C7790b implements InterfaceC2137a {

    /* renamed from: a */
    public final /* synthetic */ int f37458a = 0;

    /* renamed from: b */
    public final /* synthetic */ Context f37459b;

    /* renamed from: c */
    public final /* synthetic */ C2162k f37460c;

    /* renamed from: d */
    public final /* synthetic */ Object f37461d;

    /* renamed from: e */
    public final /* synthetic */ Object f37462e;

    public C7790b(Context context, InterfaceC2139c interfaceC2139c, C2162k c2162k, w0 w0Var) {
        this.f37459b = context;
        this.f37460c = c2162k;
        this.f37461d = w0Var;
        this.f37462e = interfaceC2139c;
    }

    @Override // ex.InterfaceC2137a
    public final Object invoke() {
        switch (this.f37458a) {
            case 0:
                w0 w0Var = (w0) this.f37461d;
                if (((Boolean) w0Var.getValue()).booleanValue()) {
                    w0Var.setValue(Boolean.FALSE);
                    InterfaceC2139c interfaceC2139c = (InterfaceC2139c) this.f37462e;
                    Context context = this.f37459b;
                    AbstractC4154l.m8923f(context, "context");
                    C2162k launcher = this.f37460c;
                    AbstractC4154l.m8923f(launcher, "launcher");
                    String[] strArr = AbstractC7792d.f37464a;
                    int length = strArr.length;
                    int i10 = 0;
                    while (true) {
                        if (i10 >= length) {
                            interfaceC2139c.invoke("contact_access_permission");
                        } else if (AbstractC6468c.m12450a(context, strArr[i10]) == 0) {
                            i10++;
                        } else {
                            launcher.mo1274a(strArr);
                        }
                    }
                }
                break;
            default:
                String[] strArr2 = (String[]) this.f37461d;
                a0 a0Var = (a0) this.f37462e;
                Context context2 = this.f37459b;
                AbstractC4154l.m8923f(context2, "context");
                C2162k launcher2 = this.f37460c;
                AbstractC4154l.m8923f(launcher2, "launcher");
                int length2 = strArr2.length;
                int i11 = 0;
                while (true) {
                    if (i11 >= length2) {
                        a0.m9181f(a0Var, "check_dcc");
                    } else if (AbstractC6468c.m12450a(context2, strArr2[i11]) == 0) {
                        i11++;
                    } else {
                        launcher2.mo1274a(strArr2);
                    }
                }
                break;
        }
        return qw.a0.f30746a;
    }

    public C7790b(Context context, String[] strArr, C2162k c2162k, a0 a0Var) {
        this.f37459b = context;
        this.f37461d = strArr;
        this.f37460c = c2162k;
        this.f37462e = a0Var;
    }
}
