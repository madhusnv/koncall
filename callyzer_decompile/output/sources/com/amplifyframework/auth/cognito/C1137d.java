package com.amplifyframework.auth.cognito;

import android.content.Context;
import android.widget.Toast;
import du.C1819a;
import du.C1828j;
import du.C1830l;
import du.C1833o;
import ex.InterfaceC2137a;
import ex.InterfaceC2139c;
import jp.C3826g;
import k2.h2;
import k2.w0;
import l7.a0;
import pg.f9;
import pp.C5995k;
import qp.C6270g;
import rs.C6613c;
import rt.C6617a;
import tu.C7225a;
import tu.C7226b;
import ut.C7540d;
import ut.C7541e;
import ut.C7543g;
import ut.C7546j;
import vt.C7785p;
import wt.C8185c;
import xt.C8455f;
import yt.C8774f;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: com.amplifyframework.auth.cognito.d */
/* loaded from: classes.dex */
public final /* synthetic */ class C1137d implements InterfaceC2137a {

    /* renamed from: a */
    public final /* synthetic */ int f5841a;

    /* renamed from: b */
    public final /* synthetic */ Object f5842b;

    /* renamed from: c */
    public final /* synthetic */ Object f5843c;

    /* renamed from: d */
    public final /* synthetic */ Object f5844d;

    /* renamed from: e */
    public final /* synthetic */ Object f5845e;

    /* renamed from: f */
    public final /* synthetic */ Object f5846f;

    /* renamed from: g */
    public final /* synthetic */ Object f5847g;

    public /* synthetic */ C1137d(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i10) {
        this.f5841a = i10;
        this.f5842b = obj;
        this.f5843c = obj2;
        this.f5844d = obj3;
        this.f5845e = obj4;
        this.f5846f = obj5;
        this.f5847g = obj6;
    }

    @Override // ex.InterfaceC2137a
    public final Object invoke() {
        switch (this.f5841a) {
            case 0:
                break;
            case 1:
                w0 w0Var = (w0) this.f5842b;
                C6270g c6270g = (C6270g) this.f5843c;
                C5995k c5995k = (C5995k) this.f5844d;
                w0 w0Var2 = (w0) this.f5845e;
                a0 a0Var = (a0) this.f5846f;
                Context context = (Context) this.f5847g;
                w0Var.setValue(Boolean.FALSE);
                if (c6270g.f30425n) {
                    c5995k.m12029k(new C3826g((C6617a) w0Var2.getValue()));
                    a0.m9181f(a0Var, "message_templates");
                } else {
                    Toast.makeText(context, com.websoptimization.callyzerbiz.R.string.subscription_expired_dot, 0).show();
                }
                break;
            case 2:
                C7225a c7225a = (C7225a) this.f5842b;
                Context context2 = (Context) this.f5843c;
                a0 a0Var2 = (a0) this.f5844d;
                w0 w0Var3 = (w0) this.f5845e;
                C7546j c7546j = (C7546j) this.f5846f;
                w0 w0Var4 = (w0) this.f5847g;
                int i10 = c7225a.f34556b;
                if (f9.m11628b(context2, i10).contentEquals(f9.m11628b(context2, com.websoptimization.callyzerbiz.R.string.settings))) {
                    a0.m9181f(a0Var2, "settings");
                } else if (f9.m11628b(context2, i10).contentEquals(f9.m11628b(context2, com.websoptimization.callyzerbiz.R.string.whats_new))) {
                    a0.m9181f(a0Var2, "whats_new");
                } else if (f9.m11628b(context2, i10).contentEquals(f9.m11628b(context2, com.websoptimization.callyzerbiz.R.string.about_app))) {
                    w0Var3.setValue(Boolean.TRUE);
                } else if (f9.m11628b(context2, i10).contentEquals(f9.m11628b(context2, com.websoptimization.callyzerbiz.R.string.compare))) {
                    a0.m9181f(a0Var2, "compare");
                } else if (f9.m11628b(context2, i10).contentEquals(f9.m11628b(context2, com.websoptimization.callyzerbiz.R.string.contact_us))) {
                    a0.m9181f(a0Var2, "contact_us");
                } else if (f9.m11628b(context2, i10).contentEquals(f9.m11628b(context2, com.websoptimization.callyzerbiz.R.string.call_note_templates))) {
                    if (((C7543g) w0Var4.getValue()).f36309e) {
                        a0.m9181f(a0Var2, "call_note_templates");
                    } else {
                        c7546j.m14299e(new C7541e(true));
                    }
                } else if (f9.m11628b(context2, i10).contentEquals(f9.m11628b(context2, com.websoptimization.callyzerbiz.R.string.message_templates))) {
                    if (((C7543g) w0Var4.getValue()).f36309e) {
                        c7546j.m14299e(new C7540d(new C6617a(null, null, null, null, null, null, null, "more", 0, null, null, null, 3967)));
                        a0.m9181f(a0Var2, "message_templates");
                    } else {
                        c7546j.m14299e(new C7541e(true));
                    }
                } else if (f9.m11628b(context2, i10).contentEquals(f9.m11628b(context2, com.websoptimization.callyzerbiz.R.string.linked_quick_call))) {
                    if (((C7543g) w0Var4.getValue()).f36309e) {
                        a0.m9181f(a0Var2, "quick_call");
                    } else {
                        c7546j.m14299e(new C7541e(true));
                    }
                }
                break;
            case 3:
                h2 h2Var = (h2) this.f5842b;
                Context context3 = (Context) this.f5843c;
                w0 w0Var5 = (w0) this.f5844d;
                C8774f c8774f = (C8774f) this.f5845e;
                w0 w0Var6 = (w0) this.f5846f;
                w0 w0Var7 = (w0) this.f5847g;
                if (((C8185c) h2Var.getValue()).f39145b.size() == 5) {
                    Toast.makeText(context3, com.websoptimization.callyzerbiz.R.string.you_can_link_5_device, 0).show();
                } else if (((Boolean) w0Var5.getValue()).booleanValue()) {
                    c8774f.m16129f(C7785p.f37449a);
                } else {
                    w0Var6.setValue(new C8455f(c8774f, 3));
                    w0Var7.setValue(Boolean.TRUE);
                }
                break;
            default:
                C7226b c7226b = (C7226b) this.f5842b;
                Context context4 = (Context) this.f5843c;
                a0 a0Var3 = (a0) this.f5844d;
                InterfaceC2139c interfaceC2139c = (InterfaceC2139c) this.f5845e;
                InterfaceC2139c interfaceC2139c2 = (InterfaceC2139c) this.f5846f;
                InterfaceC2137a interfaceC2137a = (InterfaceC2137a) this.f5847g;
                String strM11628b = f9.m11628b(context4, c7226b.f34558b);
                if (strM11628b.equals(f9.m11628b(context4, com.websoptimization.callyzerbiz.R.string.connect_with_cloud))) {
                    a0.m9181f(a0Var3, "device_detail");
                } else if (strM11628b.equals(f9.m11628b(context4, com.websoptimization.callyzerbiz.R.string.default_screen))) {
                    a0.m9181f(a0Var3, "settings_default_screen");
                } else if (strM11628b.equals(f9.m11628b(context4, com.websoptimization.callyzerbiz.R.string.enable_note_dialog))) {
                    if (c7226b.f34560d) {
                        a0.m9181f(a0Var3, "note_popup_screen");
                    } else {
                        interfaceC2139c.invoke(C1833o.f8810a);
                    }
                } else if (strM11628b.equals(f9.m11628b(context4, com.websoptimization.callyzerbiz.R.string.sync_call_history))) {
                    interfaceC2139c.invoke(C1819a.f8796a);
                } else if (strM11628b.equals(f9.m11628b(context4, com.websoptimization.callyzerbiz.R.string.not_sync_notification))) {
                    a0.m9181f(a0Var3, "not_sync_notification_screen");
                } else if (strM11628b.equals(f9.m11628b(context4, com.websoptimization.callyzerbiz.R.string.theme))) {
                    a0.m9181f(a0Var3, "theme");
                } else if (strM11628b.equals(f9.m11628b(context4, com.websoptimization.callyzerbiz.R.string.re_syn_call_recording))) {
                    interfaceC2139c.invoke(C1828j.f8805a);
                } else if (strM11628b.equals(f9.m11628b(context4, com.websoptimization.callyzerbiz.R.string.set_call_recording_location)) || strM11628b.equals(f9.m11628b(context4, com.websoptimization.callyzerbiz.R.string.change_call_recording_location))) {
                    interfaceC2139c.invoke(C1830l.f8807a);
                    interfaceC2139c2.invoke(C6613c.f31768a);
                } else if (strM11628b.equals(f9.m11628b(context4, com.websoptimization.callyzerbiz.R.string.change_dialer))) {
                    interfaceC2137a.invoke();
                } else if (strM11628b.equals(f9.m11628b(context4, com.websoptimization.callyzerbiz.R.string.troubleshooting))) {
                    a0.m9181f(a0Var3, "troubleshooting");
                }
                break;
        }
        return qw.a0.f30746a;
    }
}
