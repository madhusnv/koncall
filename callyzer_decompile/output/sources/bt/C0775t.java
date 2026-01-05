package bt;

import android.content.Context;
import android.widget.Toast;
import at.C0435f;
import com.websoptimization.callyzerbiz.R;
import dr.C1776z;
import er.AbstractC2122v;
import iq.EnumC3343a;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC4154l;
import pg.y8;
import qw.C6361k;
import uw.InterfaceC7559c;
import wx.InterfaceC8210k;
import zq.AbstractC9028k;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: bt.t */
/* loaded from: classes3.dex */
public final class C0775t implements InterfaceC8210k {

    /* renamed from: a */
    public final /* synthetic */ int f4920a;

    /* renamed from: b */
    public final /* synthetic */ l7.a0 f4921b;

    /* renamed from: c */
    public final /* synthetic */ Context f4922c;

    public /* synthetic */ C0775t(l7.a0 a0Var, Context context, int i10) {
        this.f4920a = i10;
        this.f4921b = a0Var;
        this.f4922c = context;
    }

    @Override // wx.InterfaceC8210k
    public final Object emit(Object obj, InterfaceC7559c interfaceC7559c) {
        switch (this.f4920a) {
            case 0:
                C0435f c0435f = (C0435f) obj;
                if (c0435f.f3202d) {
                    l7.a0.m9181f(this.f4921b, c0435f.f3203e);
                } else {
                    boolean z6 = c0435f.f3199a;
                    Context context = this.f4922c;
                    if (z6) {
                        Toast.makeText(context, c0435f.f3200b, 0).show();
                    } else {
                        Toast.makeText(context, c0435f.f3201c, 0).show();
                    }
                }
                return qw.a0.f30746a;
            case 1:
                C6361k c6361k = (C6361k) obj;
                if (((Boolean) c6361k.f30756b).booleanValue()) {
                    l7.a0.m9181f(this.f4921b, (String) c6361k.f30755a);
                } else {
                    Toast.makeText(this.f4922c, R.string.subscription_expired, 0).show();
                }
                return qw.a0.f30746a;
            case 2:
                int i10 = AbstractC2122v.f9921a[((EnumC3343a) obj).ordinal()];
                if (i10 == 1) {
                    l7.a0.m9181f(this.f4921b, "message_templates");
                } else {
                    if (i10 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    Toast.makeText(this.f4922c, R.string.subscription_expired_dot, 0).show();
                }
                return qw.a0.f30746a;
            case 3:
                int i11 = AbstractC9028k.f43477a[((EnumC3343a) obj).ordinal()];
                if (i11 == 1) {
                    l7.a0.m9181f(this.f4921b, "message_templates");
                } else {
                    if (i11 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    Toast.makeText(this.f4922c, R.string.subscription_expired_dot, 0).show();
                }
                return qw.a0.f30746a;
            default:
                dr.b0 b0Var = (dr.b0) obj;
                boolean z10 = b0Var instanceof C1776z;
                l7.a0 a0Var = this.f4921b;
                if (z10) {
                    l7.a0.m9181f(a0Var, "note/" + ((C1776z) b0Var).f8644a + "/null/null/false");
                } else {
                    if (!AbstractC4154l.m8918a(b0Var, dr.a0.f8485a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    y8.m11951f(this.f4922c, R.string.something_went_wrong);
                    a0Var.m9188g();
                }
                return qw.a0.f30746a;
        }
    }
}
