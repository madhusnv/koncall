package ht;

import cm.C0983a;
import com.websoptimization.callyzerbiz.R;
import et.C2130b;
import et.C2131c;
import et.C2132d;
import et.C2133e;
import ex.InterfaceC2139c;
import gt.C2729a;
import java.util.List;
import jt.AbstractC3853b;
import jt.C3856e;
import kotlin.jvm.internal.AbstractC4154l;
import qw.a0;
import rw.AbstractC6663m;
import t8.e0;
import t8.f0;
import wx.m1;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ht.a */
/* loaded from: classes3.dex */
public final /* synthetic */ class C3026a implements InterfaceC2139c {

    /* renamed from: a */
    public final /* synthetic */ int f16327a;

    /* renamed from: b */
    public final /* synthetic */ C3856e f16328b;

    public /* synthetic */ C3026a(C3856e c3856e, int i10) {
        this.f16327a = i10;
        this.f16328b = c3856e;
    }

    @Override // ex.InterfaceC2139c
    public final Object invoke(Object obj) {
        Object value;
        Object value2;
        switch (this.f16327a) {
            case 0:
                String it = (String) obj;
                AbstractC4154l.m8923f(it, "it");
                this.f16328b.m8402g(new C2132d(it));
                break;
            case 1:
                String phoneNumber = (String) obj;
                AbstractC4154l.m8923f(phoneNumber, "phoneNumber");
                if (phoneNumber.length() <= 16) {
                    this.f16328b.m8402g(new C2133e(phoneNumber));
                }
                return a0.f30746a;
            case 2:
                C0983a countryData = (C0983a) obj;
                AbstractC4154l.m8923f(countryData, "countryData");
                this.f16328b.m8402g(new C2130b(countryData));
                break;
            case 3:
                String newText = (String) obj;
                AbstractC4154l.m8923f(newText, "newText");
                this.f16328b.m8402g(new C2131c(newText));
                break;
            default:
                C3856e c3856e = this.f16328b;
                m1 m1Var = c3856e.f19853i;
                List list = (List) obj;
                AbstractC4154l.m8920c(list);
                f0 f0Var = (f0) AbstractC6663m.m12751O(list);
                if (f0Var != null) {
                    e0 e0Var = f0Var.f34141b;
                    int i10 = AbstractC3853b.f19840a[e0Var.ordinal()];
                    if (i10 == 1) {
                        C3856e.m8401f(c3856e);
                        do {
                            value = m1Var.getValue();
                        } while (!m1Var.m15397i(value, C2729a.m6728a((C2729a) value, null, null, false, null, null, false, null, null, false, 0, null, null, false, null, false, null, null, Integer.valueOf(R.string.submit_contact_form_success), null, false, 3407871)));
                    } else if (i10 != 2) {
                        e0Var.name();
                    } else {
                        C3856e.m8401f(c3856e);
                        f0Var.f34143d.m13367d("error_reason");
                        do {
                            value2 = m1Var.getValue();
                        } while (!m1Var.m15397i(value2, C2729a.m6728a((C2729a) value2, null, null, false, null, null, false, null, null, false, 0, null, null, false, null, false, null, Integer.valueOf(R.string.submit_contact_form_fail), null, null, false, 3407871)));
                    }
                }
                return a0.f30746a;
        }
        return a0.f30746a;
    }
}
