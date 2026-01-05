package qu;

import android.content.Context;
import aw.C0480t;
import com.websoptimization.callyzerbiz.R;
import d7.q0;
import d7.w0;
import im.EnumC3321w;
import io.C3328c;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import lu.C4522h;
import mu.AbstractC4886d;
import mu.C4884b;
import mu.C4885c;
import og.pe;
import ou.C5744a;
import pg.f9;
import pg.o6;
import pu.C6040h;
import rw.C6668r;
import s2.C6734c;
import tx.c0;
import tx.s1;
import uw.InterfaceC7559c;
import vx.C7806h;
import wx.C8203d;
import wx.c1;
import wx.m1;
import yv.C8805t;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: qu.e */
/* loaded from: classes3.dex */
public final class C6324e extends w0 {

    /* renamed from: b */
    public final C3328c f30662b;

    /* renamed from: c */
    public final Context f30663c;

    /* renamed from: d */
    public final C8805t f30664d;

    /* renamed from: e */
    public s1 f30665e;

    /* renamed from: f */
    public boolean f30666f;

    /* renamed from: g */
    public boolean f30667g;

    /* renamed from: h */
    public int f30668h;

    /* renamed from: i */
    public final m1 f30669i;

    /* renamed from: j */
    public final wx.w0 f30670j;

    /* renamed from: k */
    public final C7806h f30671k;

    /* renamed from: l */
    public final C8203d f30672l;

    public C6324e(C3328c c3328c, EnumC3321w enumC3321w, Context context, C8805t c8805t) {
        List listM10834i;
        Object value;
        this.f30662b = c3328c;
        this.f30663c = context;
        this.f30664d = c8805t;
        m1 m1VarM15372c = c1.m15372c(new C5744a(C6668r.f31943a));
        this.f30669i = m1VarM15372c;
        this.f30670j = new wx.w0(m1VarM15372c);
        InterfaceC7559c interfaceC7559c = null;
        C7806h c7806hM11805a = o6.m11805a(0, null, null, 7);
        this.f30671k = c7806hM11805a;
        this.f30672l = c1.m15389t(c7806hM11805a);
        int i10 = AbstractC6322c.f30658a[enumC3321w.ordinal()];
        if (i10 == 1) {
            listM10834i = pe.m10834i(new C6040h(f9.m11628b(context, R.string.ts_permission_title), f9.m11628b(context, R.string.ts_permission_description), R.drawable.ic_ts_permissons, new C6323d(this, interfaceC7559c, 3), new C6734c(new C4522h(this, 3), true, -735234697)), m12333g(), new C6040h(f9.m11628b(context, R.string.ts_internet_title), f9.m11628b(context, R.string.ts_internet_description), R.drawable.ic_ts_internet, new C6323d(this, interfaceC7559c, 4), new C6734c(new C4522h(this, 2), true, -560031122)), m12331e(), m12332f(), new C6040h(f9.m11628b(context, R.string.ts_admin_title), f9.m11628b(context, R.string.ts_admin_description), R.drawable.ic_ts_admin_config, new C6323d(this, interfaceC7559c, 1), AbstractC6320a.f30652b));
        } else {
            if (i10 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            listM10834i = pe.m10834i(new C6040h(f9.m11628b(context, R.string.ts_note_permission_title), f9.m11628b(context, R.string.ts_note_permission_description), R.drawable.ic_ts_permissons, new C6323d(this, interfaceC7559c, 5), new C6734c(new C4522h(this, 6), true, 373316954)), m12333g(), new C6040h(f9.m11628b(context, R.string.ts_note_popup_title), f9.m11628b(context, R.string.ts_note_popup_description), R.drawable.ic_ts_note_settings, new C6323d(this, interfaceC7559c, 6), new C6734c(new C4522h(this, 1), true, -1729970427)), m12331e(), m12332f());
        }
        do {
            value = m1VarM15372c.getValue();
            ((C5744a) value).getClass();
        } while (!m1VarM15372c.m15397i(value, new C5744a(listM10834i)));
    }

    /* renamed from: e */
    public final C6040h m12331e() {
        Context context = this.f30663c;
        return new C6040h(f9.m11628b(context, R.string.ts_subscription_title), f9.m11628b(context, R.string.ts_subscription_description), R.drawable.ic_ts_active_subscription, new C6323d(this, null, 0), AbstractC6320a.f30651a);
    }

    /* renamed from: f */
    public final C6040h m12332f() {
        Context context = this.f30663c;
        return new C6040h(f9.m11628b(context, R.string.ts_battery_title), f9.m11628b(context, R.string.ts_battery_description), R.drawable.ic_ts_battery, new C6323d(this, null, 2), new C6734c(new C4522h(this, 5), true, 174210411));
    }

    /* renamed from: g */
    public final C6040h m12333g() {
        Context context = this.f30663c;
        return new C6040h(f9.m11628b(context, R.string.ts_sim_card_title), f9.m11628b(context, R.string.ts_sim_card_description), R.drawable.ic_ts_sim, new C6323d(this, null, 7), new C6734c(new C4522h(this, 4), true, -1061878429));
    }

    /* renamed from: h */
    public final void m12334h(String str) {
        c0.m13502y(q0.m5340g(this), null, null, new ps.c0(this, str, null, 7), 3);
    }

    /* renamed from: i */
    public final void m12335i(AbstractC4886d abstractC4886d) {
        InterfaceC7559c interfaceC7559c = null;
        if (abstractC4886d.equals(C4885c.f24399a)) {
            if (this.f30666f || this.f30667g) {
                return;
            }
            int i10 = this.f30668h;
            s1 s1Var = this.f30665e;
            if (s1Var != null) {
                s1Var.mo13510j(null);
            }
            this.f30665e = c0.m13502y(q0.m5340g(this), null, null, new C0480t(this, i10, interfaceC7559c, 8), 3);
            return;
        }
        if (abstractC4886d.equals(C4884b.f24398a)) {
            s1 s1Var2 = this.f30665e;
            if (s1Var2 != null) {
                s1Var2.mo13510j(null);
            }
            this.f30665e = null;
            this.f30665e = c0.m13502y(q0.m5340g(this), null, null, new C0480t(this, 0, interfaceC7559c, 8), 3);
        }
    }
}
