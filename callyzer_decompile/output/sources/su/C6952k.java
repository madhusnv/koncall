package su;

import android.content.Context;
import android.widget.Toast;
import ao.c0;
import bq.C0732l;
import bs.C0749g;
import com.websoptimization.callyzerbiz.R;
import d7.q0;
import d7.w0;
import du.AbstractC1839u;
import du.C1819a;
import du.C1820b;
import du.C1821c;
import du.C1823e;
import du.C1825g;
import du.C1826h;
import du.C1827i;
import du.C1828j;
import du.C1829k;
import du.C1830l;
import du.C1831m;
import du.C1832n;
import du.C1833o;
import du.C1834p;
import du.C1835q;
import du.C1838t;
import im.p1;
import iu.C3350b;
import iu.C3356h;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AbstractC4154l;
import ln.C4493f;
import ln.C4494g;
import nn.C5113e;
import org.bouncycastle.jcajce.provider.digest.AbstractC5601a;
import pg.f9;
import pg.o6;
import rn.h0;
import tx.InterfaceC7266z;
import u7.C7351a;
import uo.C7485j;
import uw.InterfaceC7559c;
import vx.C7806h;
import wo.C8134s;
import wx.C8203d;
import wx.c1;
import wx.m1;
import xm.s2;
import xm.y5;
import yv.C8800o;
import yv.C8801p;
import yv.C8805t;
import yx.C8810d;
import zo.C9000c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: su.k */
/* loaded from: classes3.dex */
public final class C6952k extends w0 {

    /* renamed from: b */
    public final Context f33624b;

    /* renamed from: c */
    public final C7485j f33625c;

    /* renamed from: d */
    public final C5113e f33626d;

    /* renamed from: e */
    public final C9000c f33627e;

    /* renamed from: f */
    public final c0 f33628f;

    /* renamed from: g */
    public final h0 f33629g;

    /* renamed from: h */
    public final wx.w0 f33630h;

    /* renamed from: i */
    public final C8805t f33631i;

    /* renamed from: j */
    public final C8134s f33632j;

    /* renamed from: k */
    public final y5 f33633k;

    /* renamed from: l */
    public final C8810d f33634l;

    /* renamed from: m */
    public final C4494g f33635m;

    /* renamed from: n */
    public final m1 f33636n;

    /* renamed from: o */
    public final wx.w0 f33637o;

    /* renamed from: p */
    public final C7806h f33638p;

    /* renamed from: q */
    public final C8203d f33639q;

    /* renamed from: r */
    public final wx.w0 f33640r;

    public C6952k(Context context, C7485j c7485j, C5113e c5113e, C9000c c9000c, c0 c0Var, h0 callRecordingUseCase, wx.w0 w0Var, C8805t c8805t, C8134s c8134s, y5 userSIMRepository, C4493f c4493f, C8810d c8810d, C4494g c4494g) {
        AbstractC4154l.m8923f(callRecordingUseCase, "callRecordingUseCase");
        AbstractC4154l.m8923f(userSIMRepository, "userSIMRepository");
        this.f33624b = context;
        this.f33625c = c7485j;
        this.f33626d = c5113e;
        this.f33627e = c9000c;
        this.f33628f = c0Var;
        this.f33629g = callRecordingUseCase;
        this.f33630h = w0Var;
        this.f33631i = c8805t;
        this.f33632j = c8134s;
        this.f33633k = userSIMRepository;
        this.f33634l = c8810d;
        this.f33635m = c4494g;
        m1 m1VarM15372c = c1.m15372c(new C3356h());
        this.f33636n = m1VarM15372c;
        this.f33637o = new wx.w0(m1VarM15372c);
        InterfaceC7559c interfaceC7559c = null;
        C7806h c7806hM11805a = o6.m11805a(0, null, null, 7);
        this.f33638p = c7806hM11805a;
        this.f33639q = c1.m15389t(c7806hM11805a);
        this.f33640r = c4494g.f22370d;
        m13204f();
        tx.c0.m13502y(c8810d, null, null, new C6945d(this, interfaceC7559c, 0), 3);
        tx.c0.m13502y(q0.m5340g(this), null, null, new C6945d(this, interfaceC7559c, 1), 3);
        tx.c0.m13502y(q0.m5340g(this), null, null, new C6945d(this, interfaceC7559c, 2), 3);
    }

    /* renamed from: e */
    public final void m13203e(AbstractC1839u event) {
        Object value;
        Object value2;
        Object value3;
        Object value4;
        Object value5;
        C1838t c1838t;
        Object value6;
        Object value7;
        Object value8;
        Object value9;
        Object value10;
        Object value11;
        AbstractC4154l.m8923f(event, "event");
        boolean zEquals = event.equals(C1835q.f8813a);
        m1 m1Var = this.f33636n;
        if (zEquals) {
            if (((C3356h) m1Var.getValue()).f17751n) {
                this.f33627e.m16470f(false);
                return;
            }
            this.f33635m.m9337b(p1.LOG_FILE_UPLOAD_STATE, new C3350b(R.string.no_internet_connection));
            return;
        }
        boolean z6 = event instanceof C1823e;
        C8810d c8810d = this.f33634l;
        InterfaceC7559c interfaceC7559c = null;
        if (z6) {
            tx.c0.m13502y(c8810d, null, null, new C0732l(this, event, interfaceC7559c, 14), 3);
            return;
        }
        int i10 = 4;
        if (event instanceof C1830l) {
            tx.c0.m13502y(c8810d, null, null, new C6945d(this, interfaceC7559c, i10), 3);
            return;
        }
        if (event instanceof C1826h) {
            do {
                value11 = m1Var.getValue();
            } while (!m1Var.m15397i(value11, C3356h.m7670a((C3356h) value11, null, null, false, true, false, false, null, null, false, null, null, false, false, false, null, 262127)));
            return;
        }
        boolean z10 = event instanceof C1832n;
        Context context = this.f33624b;
        if (z10) {
            Toast.makeText(context, context.getString(R.string.call_recording_folder_set_success_message), 0).show();
            tx.c0.m13502y(c8810d, null, null, new ps.c0(this, event, interfaceC7559c, 23), 3);
            return;
        }
        if (event instanceof C1825g) {
            do {
                value10 = m1Var.getValue();
            } while (!m1Var.m15397i(value10, C3356h.m7670a((C3356h) value10, null, null, false, false, false, false, null, null, false, null, null, false, false, false, null, 262127)));
            return;
        }
        if (event instanceof C1827i) {
            do {
                value9 = m1Var.getValue();
            } while (!m1Var.m15397i(value9, C3356h.m7670a((C3356h) value9, null, null, false, false, false, false, null, null, true, ((C1827i) event).f8804a, null, false, false, false, null, 260607)));
            return;
        }
        if (event instanceof C1820b) {
            do {
                value8 = m1Var.getValue();
            } while (!m1Var.m15397i(value8, C3356h.m7670a((C3356h) value8, null, null, false, false, false, false, null, null, false, null, null, false, false, false, null, 262079)));
            return;
        }
        if (event instanceof C1834p) {
            C1834p c1834p = (C1834p) event;
            new C8805t(c1834p.f8811a).m16232g("MainScreen", c1834p.f8812b);
            return;
        }
        if (event.equals(C1819a.f8796a)) {
            tx.c0.m13502y(c8810d, null, null, new C6945d(this, interfaceC7559c, 5), 3);
            return;
        }
        boolean z11 = event instanceof C1838t;
        wx.w0 w0Var = this.f33630h;
        if (z11) {
            do {
                value5 = m1Var.getValue();
                c1838t = (C1838t) event;
            } while (!m1Var.m15397i(value5, C3356h.m7670a((C3356h) value5, null, null, false, false, false, false, c1838t.f8816a, c1838t.f8817b, false, null, null, false, false, false, null, 261695)));
            C8800o c8800o = C8800o.f42459a;
            long jM16194c = C8800o.m16194c(c1838t.f8816a);
            long jM16194c2 = C8800o.m16194c(c1838t.f8817b);
            if (((int) TimeUnit.DAYS.convert(Math.abs(jM16194c2 - jM16194c), TimeUnit.MILLISECONDS)) >= 2) {
                do {
                    value6 = m1Var.getValue();
                } while (!m1Var.m15397i(value6, C3356h.m7670a((C3356h) value6, null, null, false, false, false, false, null, null, true, f9.m11628b(context, R.string.you_can_sync_maximum_2_days_calllogs), null, false, false, false, null, 260607)));
                return;
            } else if (((C8801p) w0Var.f39340a.getValue()).f42464a) {
                tx.c0.m13502y(c8810d, null, null, new C6947f(this, jM16194c, jM16194c2, event, null), 3);
                return;
            } else {
                do {
                    value7 = m1Var.getValue();
                } while (!m1Var.m15397i(value7, C3356h.m7670a((C3356h) value7, null, null, false, false, false, false, null, null, true, f9.m11628b(context, R.string.no_internet_connection), null, false, false, false, null, 260607)));
                return;
            }
        }
        if (event instanceof C1833o) {
            do {
                value4 = m1Var.getValue();
            } while (!m1Var.m15397i(value4, C3356h.m7670a((C3356h) value4, null, null, false, false, false, false, null, null, true, context.getString(R.string.go_note_dialog_error), null, false, false, false, null, 260607)));
            return;
        }
        if (event instanceof C1821c) {
            do {
                value3 = m1Var.getValue();
            } while (!m1Var.m15397i(value3, C3356h.m7670a((C3356h) value3, null, null, false, false, false, false, null, null, false, null, null, false, false, false, null, 260607)));
            return;
        }
        if (event.equals(C1828j.f8805a)) {
            if (s2.f40812p) {
                AbstractC5601a.m11254y(context, R.string.find_recording_already_running, "getString(...)", context);
                return;
            } else if (((C8801p) w0Var.f39340a.getValue()).f42464a) {
                tx.c0.m13502y(c8810d, null, null, new C0749g(this, null), 3);
                return;
            } else {
                do {
                    value2 = m1Var.getValue();
                } while (!m1Var.m15397i(value2, C3356h.m7670a((C3356h) value2, null, null, false, false, false, false, null, null, false, null, null, false, false, true, null, 245759)));
                return;
            }
        }
        int i11 = 3;
        InterfaceC7559c interfaceC7559c2 = null;
        if (event instanceof C1829k) {
            if (((C1829k) event).f8806a) {
                tx.c0.m13502y(c8810d, null, null, new C6945d(this, interfaceC7559c2, i11), 3);
            }
            do {
                value = m1Var.getValue();
            } while (!m1Var.m15397i(value, C3356h.m7670a((C3356h) value, null, null, false, false, false, false, null, null, false, null, null, false, false, false, null, 243711)));
            return;
        }
        if (event instanceof C1831m) {
            C7485j c7485j = this.f33625c;
            tx.c0.m13502y((InterfaceC7266z) c7485j.f36149h.getValue(), null, null, new C7351a(c7485j, null, i10), 3);
        }
    }

    /* renamed from: f */
    public final void m13204f() {
        tx.c0.m13502y(this.f33634l, null, null, new C6949h(this, null), 3);
    }
}
