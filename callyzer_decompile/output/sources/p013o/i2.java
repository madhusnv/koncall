package p013o;

import android.util.Range;
import android.util.Size;
import android.view.Menu;
import c0.a0;
import com.sun.mail.util.AbstractC1452a;
import ex.InterfaceC2137a;
import ex.InterfaceC2139c;
import i0.C3082m;
import i0.s0;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import qc.C6158d;
import ub.C7393i;
import ud.AbstractC7402f;
import ud.C7401e;
import ud.EnumC7413q;
import ud.InterfaceC7403g;
import y3.EnumC8539c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class i2 {

    /* renamed from: a */
    public Object f25538a;

    /* renamed from: b */
    public Object f25539b;

    /* renamed from: c */
    public Object f25540c;

    /* renamed from: d */
    public Object f25541d;

    /* renamed from: e */
    public Object f25542e;

    /* renamed from: f */
    public Object f25543f;

    /* renamed from: g */
    public Object f25544g;

    public i2() {
        this.f25538a = new AtomicBoolean();
        this.f25539b = null;
        this.f25540c = new HashMap(16, 1.0f);
        this.f25541d = new HashMap(16, 1.0f);
        this.f25542e = new HashMap(16, 1.0f);
        this.f25543f = new HashMap(16, 1.0f);
        this.f25544g = null;
    }

    /* renamed from: a */
    public static void m10244a(Menu menu, EnumC8539c enumC8539c) {
        menu.add(0, enumC8539c.getId(), enumC8539c.getOrder(), enumC8539c.getTitleResource()).setShowAsAction(1);
    }

    /* renamed from: b */
    public static void m10245b(Menu menu, EnumC8539c enumC8539c, InterfaceC2137a interfaceC2137a) {
        if (interfaceC2137a != null && menu.findItem(enumC8539c.getId()) == null) {
            m10244a(menu, enumC8539c);
        } else {
            if (interfaceC2137a != null || menu.findItem(enumC8539c.getId()) == null) {
                return;
            }
            menu.removeItem(enumC8539c.getId());
        }
    }

    /* renamed from: c */
    public C3082m m10246c() {
        String strM4561h = ((Size) this.f25538a) == null ? " resolution" : "";
        if (((Size) this.f25539b) == null) {
            strM4561h = strM4561h.concat(" originalConfiguredResolution");
        }
        if (((a0) this.f25540c) == null) {
            strM4561h = AbstractC1452a.m4561h(strM4561h, " dynamicRange");
        }
        if (((Integer) this.f25541d) == null) {
            strM4561h = AbstractC1452a.m4561h(strM4561h, " sessionType");
        }
        if (((Range) this.f25542e) == null) {
            strM4561h = AbstractC1452a.m4561h(strM4561h, " expectedFrameRateRange");
        }
        if (((Boolean) this.f25544g) == null) {
            strM4561h = AbstractC1452a.m4561h(strM4561h, " zslDisabled");
        }
        if (strM4561h.isEmpty()) {
            return new C3082m((Size) this.f25538a, (Size) this.f25539b, (a0) this.f25540c, ((Integer) this.f25541d).intValue(), (Range) this.f25542e, (s0) this.f25543f, ((Boolean) this.f25544g).booleanValue());
        }
        throw new IllegalStateException("Missing required properties:".concat(strM4561h));
    }

    /* renamed from: d */
    public void m10247d(Object obj) {
        Object c6158d;
        this.f25542e = AbstractC7402f.f35186a[((EnumC7413q) this.f25542e).ordinal()] == 1 ? EnumC7413q.INITIALIZED : EnumC7413q.EXPLICIT_INSTANCE;
        this.f25544g = obj;
        if (obj == null) {
            this.f25541d = (InterfaceC7403g) this.f25538a;
            c6158d = new C7401e(this, 0);
        } else {
            c6158d = new C6158d(9, obj);
        }
        this.f25543f = c6158d;
        if (obj != null) {
        }
    }

    public i2(InterfaceC7403g interfaceC7403g, InterfaceC2139c interfaceC2139c) {
        C7393i c7393i = new C7393i(1);
        this.f25538a = interfaceC7403g;
        this.f25539b = interfaceC2139c;
        this.f25540c = c7393i;
        this.f25541d = interfaceC7403g;
        this.f25542e = EnumC7413q.NOT_INITIALIZED;
        this.f25543f = new C7401e(this, 1);
    }
}
