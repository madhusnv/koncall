package gv;

import android.content.Context;
import android.widget.Toast;
import com.websoptimization.callyzerbiz.R;
import ex.InterfaceC2139c;
import hq.AbstractC3017v;
import hq.m0;
import iq.EnumC3343a;
import kotlin.NoWhenBranchMatchedException;
import kv.AbstractC4255i;
import kv.C4253g;
import kv.C4254h;
import qw.a0;
import uw.InterfaceC7559c;
import wx.InterfaceC8210k;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: gv.i */
/* loaded from: classes3.dex */
public final class C2738i implements InterfaceC8210k {

    /* renamed from: a */
    public final /* synthetic */ int f15277a;

    /* renamed from: b */
    public final /* synthetic */ InterfaceC2139c f15278b;

    /* renamed from: c */
    public final /* synthetic */ Context f15279c;

    public /* synthetic */ C2738i(InterfaceC2139c interfaceC2139c, Context context, int i10) {
        this.f15277a = i10;
        this.f15278b = interfaceC2139c;
        this.f15279c = context;
    }

    @Override // wx.InterfaceC8210k
    public final Object emit(Object obj, InterfaceC7559c interfaceC7559c) {
        switch (this.f15277a) {
            case 0:
                AbstractC4255i abstractC4255i = (AbstractC4255i) obj;
                if (abstractC4255i instanceof C4253g) {
                    this.f15278b.invoke("synced_call_log_progress");
                } else {
                    if (!(abstractC4255i instanceof C4254h)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    Toast.makeText(this.f15279c, "OTP verified!", 0).show();
                }
                return a0.f30746a;
            case 1:
                int i10 = AbstractC3017v.f16294a[((EnumC3343a) obj).ordinal()];
                if (i10 == 1) {
                    this.f15278b.invoke("message_templates");
                } else {
                    if (i10 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    Toast.makeText(this.f15279c, R.string.subscription_expired_dot, 0).show();
                }
                return a0.f30746a;
            default:
                int i11 = m0.f16255a[((EnumC3343a) obj).ordinal()];
                if (i11 == 1) {
                    this.f15278b.invoke("message_templates");
                } else {
                    if (i11 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    Toast.makeText(this.f15279c, R.string.subscription_expired_dot, 0).show();
                }
                return a0.f30746a;
        }
    }
}
