package us;

import a9.C0073l;
import android.content.Context;
import d7.q0;
import d7.w0;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC4154l;
import ln.C4494g;
import pg.o6;
import rn.h0;
import rs.AbstractC6616f;
import rs.C6611a;
import rs.C6612b;
import rs.C6613c;
import rs.C6614d;
import rs.C6615e;
import rw.C6668r;
import ts.C7214a;
import tx.c0;
import uw.InterfaceC7559c;
import vx.C7806h;
import wx.C8203d;
import wx.c1;
import wx.m1;
import yx.C8810d;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: us.c */
/* loaded from: classes3.dex */
public final class C7536c extends w0 {

    /* renamed from: b */
    public final Context f36287b;

    /* renamed from: c */
    public final h0 f36288c;

    /* renamed from: d */
    public final wx.w0 f36289d;

    /* renamed from: e */
    public final C8810d f36290e;

    /* renamed from: f */
    public final C4494g f36291f;

    /* renamed from: g */
    public final C0073l f36292g;

    /* renamed from: h */
    public final m1 f36293h;

    /* renamed from: i */
    public final wx.w0 f36294i;

    /* renamed from: j */
    public final C7806h f36295j;

    /* renamed from: k */
    public final C8203d f36296k;

    public C7536c(Context context, h0 callRecordingUseCase, wx.w0 w0Var, C8810d c8810d, C4494g c4494g, C0073l c0073l) {
        AbstractC4154l.m8923f(callRecordingUseCase, "callRecordingUseCase");
        this.f36287b = context;
        this.f36288c = callRecordingUseCase;
        this.f36289d = w0Var;
        this.f36290e = c8810d;
        this.f36291f = c4494g;
        this.f36292g = c0073l;
        m1 m1VarM15372c = c1.m15372c(new C7214a(false, null, true, C6668r.f31943a, false, false));
        this.f36293h = m1VarM15372c;
        this.f36294i = new wx.w0(m1VarM15372c);
        InterfaceC7559c interfaceC7559c = null;
        C7806h c7806hM11805a = o6.m11805a(0, null, null, 7);
        this.f36295j = c7806hM11805a;
        this.f36296k = c1.m15389t(c7806hM11805a);
        c0.m13502y(c8810d, null, null, new C7534a(this, interfaceC7559c, 0), 3);
        c0.m13502y(q0.m5340g(this), null, null, new C7534a(this, interfaceC7559c, 1), 3);
        c0.m13502y(q0.m5340g(this), null, null, new C7534a(this, interfaceC7559c, 2), 3);
    }

    /* renamed from: e */
    public final void m14297e(AbstractC6616f event) {
        Object value;
        Object value2;
        Object value3;
        Object value4;
        AbstractC4154l.m8923f(event, "event");
        boolean z6 = event instanceof C6613c;
        InterfaceC7559c interfaceC7559c = null;
        C8810d c8810d = this.f36290e;
        if (z6) {
            c0.m13502y(c8810d, null, null, new C7534a(this, interfaceC7559c, 3), 3);
            return;
        }
        boolean z10 = event instanceof C6611a;
        m1 m1Var = this.f36293h;
        if (z10) {
            do {
                value4 = m1Var.getValue();
            } while (!m1Var.m15397i(value4, C7214a.m13447a((C7214a) value4, false, null, false, null, false, false, 60)));
            return;
        }
        if (event instanceof C6614d) {
            do {
                value3 = m1Var.getValue();
            } while (!m1Var.m15397i(value3, C7214a.m13447a((C7214a) value3, false, null, false, null, false, true, 28)));
            c0.m13502y(c8810d, null, null, new C7534a(this, interfaceC7559c, 3), 3);
        } else if (event instanceof C6612b) {
            do {
                value2 = m1Var.getValue();
            } while (!m1Var.m15397i(value2, C7214a.m13447a((C7214a) value2, false, null, false, null, false, false, 31)));
        } else {
            if (!(event instanceof C6615e)) {
                throw new NoWhenBranchMatchedException();
            }
            do {
                value = m1Var.getValue();
            } while (!m1Var.m15397i(value, C7214a.m13447a((C7214a) value, false, null, false, null, false, true, 31)));
        }
    }
}
