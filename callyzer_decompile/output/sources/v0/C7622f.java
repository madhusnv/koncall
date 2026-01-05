package v0;

import android.content.res.Resources;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Parcel;
import android.text.TextUtils;
import androidx.camera.camera2.internal.compat.quirk.SmallDisplaySizeQuirk;
import c9.C0927v;
import ej.C2057b;
import he.InterfaceC2917h;
import i0.o1;
import i0.s0;
import i0.w1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.MissingFormatArgumentException;
import jg.AbstractC3762a;
import jo.C3810f;
import kc.C4049d;
import kotlin.jvm.internal.AbstractC4154l;
import org.json.JSONArray;
import org.json.JSONException;
import p023y.AbstractC8523a;
import pg.l8;
import rb.C6489b;
import rf.InterfaceC6505j;
import uf.C7427b;
import vc.InterfaceC7700c;
import vc.InterfaceC7703f;
import w9.C7963f;
import wc.b0;
import wd.C7997e;
import wi.C8062l;
import wx.c1;
import xd.C8339j;
import xf.BinderC8371f;
import xf.C8366a;
import xf.C8370e;
import xf.C8373h;
import xm.y5;
import yg.C8650g;
import yg.C8656m;
import yg.InterfaceC8648e;
import yg.InterfaceC8649f;
import zb.InterfaceC8918l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: v0.f */
/* loaded from: classes.dex */
public final class C7622f implements w1, InterfaceC8649f, InterfaceC7703f, InterfaceC2917h, InterfaceC6505j, InterfaceC8648e, InterfaceC8918l {

    /* renamed from: a */
    public Object f36778a;

    public /* synthetic */ C7622f(Object obj) {
        this.f36778a = obj;
    }

    /* renamed from: A */
    public static void m14508A(String str) {
        if (str.startsWith("gcm.n.")) {
            str.substring(6);
        }
    }

    /* renamed from: w */
    public static boolean m14509w(Bundle bundle) {
        return "1".equals(bundle.getString("gcm.n.e")) || "1".equals(bundle.getString("gcm.n.e".replace("gcm.n.", "gcm.notification.")));
    }

    @Override // vc.InterfaceC7703f
    /* renamed from: S */
    public InterfaceC7700c mo1857S(String schemeId) {
        AbstractC4154l.m8923f(schemeId, "schemeId");
        if (schemeId.equals("aws.auth#sigv4")) {
            return ((C7963f) this.f36778a).f38313f;
        }
        if (schemeId.equals("smithy.api#noAuth")) {
            return C4049d.f20892a;
        }
        throw new IllegalStateException(("auth scheme " + ((Object) C6489b.m12497a(schemeId)) + " not configured for client").toString());
    }

    /* renamed from: a */
    public boolean m14510a(String str) {
        String strM14517u = m14517u(str);
        return "1".equals(strM14517u) || Boolean.parseBoolean(strM14517u);
    }

    @Override // rf.InterfaceC6505j
    public void accept(Object obj, Object obj2) {
        BinderC8371f binderC8371f = new BinderC8371f((C8650g) obj2, 1);
        C8370e c8370e = (C8370e) ((C8373h) obj).m13009t();
        C8366a c8366a = (C8366a) this.f36778a;
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken(c8370e.f6441g);
        int i10 = AbstractC3762a.f19640a;
        parcelObtain.writeStrongBinder(binderC8371f);
        AbstractC3762a.m8287c(parcelObtain, c8366a);
        parcelObtain.writeStrongBinder(null);
        c8370e.m3754d(parcelObtain, 2);
    }

    /* renamed from: b */
    public Integer m14511b(String str) {
        String strM14517u = m14517u(str);
        if (TextUtils.isEmpty(strM14517u)) {
            return null;
        }
        try {
            return Integer.valueOf(Integer.parseInt(strM14517u));
        } catch (NumberFormatException unused) {
            m14508A(str);
            return null;
        }
    }

    @Override // i0.w1
    /* renamed from: d */
    public s0 mo2241d() {
        return (o1) this.f36778a;
    }

    @Override // yg.InterfaceC8648e
    /* renamed from: g */
    public void mo27g(Object obj) {
        ((C8650g) ((C7427b) this.f36778a).f35231b).f41930a.m15989p();
    }

    @Override // he.InterfaceC2917h
    /* renamed from: m */
    public Object mo7024m(C7997e c7997e) {
        return c1.m15385p(new C3810f(((C8339j) this.f36778a).f39938g, 5), c7997e);
    }

    /* renamed from: n */
    public JSONArray m14512n(String str) {
        String strM14517u = m14517u(str);
        if (TextUtils.isEmpty(strM14517u)) {
            return null;
        }
        try {
            return new JSONArray(strM14517u);
        } catch (JSONException unused) {
            m14508A(str);
            return null;
        }
    }

    /* renamed from: o */
    public int[] m14513o() throws JSONException {
        JSONArray jSONArrayM14512n = m14512n("gcm.n.light_settings");
        if (jSONArrayM14512n == null) {
            return null;
        }
        int[] iArr = new int[3];
        try {
            if (jSONArrayM14512n.length() != 3) {
                throw new JSONException("lightSettings don't have all three fields");
            }
            int color = Color.parseColor(jSONArrayM14512n.optString(0));
            if (color == -16777216) {
                throw new IllegalArgumentException("Transparent color is invalid");
            }
            iArr[0] = color;
            iArr[1] = jSONArrayM14512n.optInt(1);
            iArr[2] = jSONArrayM14512n.optInt(2);
            return iArr;
        } catch (IllegalArgumentException e2) {
            jSONArrayM14512n.toString();
            e2.getMessage();
            return null;
        } catch (JSONException unused) {
            jSONArrayM14512n.toString();
            return null;
        }
    }

    @Override // yg.InterfaceC8649f
    /* renamed from: p */
    public C8656m mo23p(Object obj) {
        C2057b c2057b = (C2057b) obj;
        C0927v c0927v = (C0927v) this.f36778a;
        if (c2057b == null) {
            return l8.m11765f(null);
        }
        C8062l c8062l = (C8062l) c0927v.f5669c;
        C8062l.m15197a(c8062l);
        c8062l.f38611m.m2787z(c8062l.f38603e.f40063a, null);
        c8062l.f38615q.m15971d(null);
        return l8.m11765f(null);
    }

    /* renamed from: r */
    public Object[] m14514r(String str) {
        JSONArray jSONArrayM14512n = m14512n(str.concat("_loc_args"));
        if (jSONArrayM14512n == null) {
            return null;
        }
        int length = jSONArrayM14512n.length();
        String[] strArr = new String[length];
        for (int i10 = 0; i10 < length; i10++) {
            strArr[i10] = jSONArrayM14512n.optString(i10);
        }
        return strArr;
    }

    /* renamed from: s */
    public String m14515s(String str) {
        return m14517u(str.concat("_loc_key"));
    }

    /* renamed from: t */
    public String m14516t(Resources resources, String str, String str2) {
        String strM14517u = m14517u(str2);
        if (!TextUtils.isEmpty(strM14517u)) {
            return strM14517u;
        }
        String strM14515s = m14515s(str2);
        if (TextUtils.isEmpty(strM14515s)) {
            return null;
        }
        int identifier = resources.getIdentifier(strM14515s, "string", str);
        if (identifier == 0) {
            m14508A(str2.concat("_loc_key"));
            return null;
        }
        Object[] objArrM14514r = m14514r(str2);
        if (objArrM14514r == null) {
            return resources.getString(identifier);
        }
        try {
            return resources.getString(identifier, objArrM14514r);
        } catch (MissingFormatArgumentException unused) {
            m14508A(str2);
            Arrays.toString(objArrM14514r);
            return null;
        }
    }

    /* renamed from: u */
    public String m14517u(String str) {
        Bundle bundle = (Bundle) this.f36778a;
        if (!bundle.containsKey(str) && str.startsWith("gcm.n.")) {
            String strReplace = !str.startsWith("gcm.n.") ? str : str.replace("gcm.n.", "gcm.notification.");
            if (bundle.containsKey(strReplace)) {
                str = strReplace;
            }
        }
        return bundle.getString(str);
    }

    /* renamed from: v */
    public long[] m14518v() throws JSONException {
        JSONArray jSONArrayM14512n = m14512n("gcm.n.vibrate_timings");
        if (jSONArrayM14512n == null) {
            return null;
        }
        try {
            if (jSONArrayM14512n.length() <= 1) {
                throw new JSONException("vibrateTimings have invalid length");
            }
            int length = jSONArrayM14512n.length();
            long[] jArr = new long[length];
            for (int i10 = 0; i10 < length; i10++) {
                jArr[i10] = jSONArrayM14512n.optLong(i10);
            }
            return jArr;
        } catch (NumberFormatException | JSONException unused) {
            jSONArrayM14512n.toString();
            return null;
        }
    }

    /* renamed from: x */
    public Bundle m14519x() {
        Bundle bundle = (Bundle) this.f36778a;
        Bundle bundle2 = new Bundle(bundle);
        for (String str : bundle.keySet()) {
            if (!str.startsWith("google.c.a.") && !str.equals("from")) {
                bundle2.remove(str);
            }
        }
        return bundle2;
    }

    /* renamed from: y */
    public void m14520y() {
        Iterator it = ((List) this.f36778a).iterator();
        while (it.hasNext()) {
            ((b0) it.next()).mo15149h();
        }
    }

    public C7622f(y5 userSIMRepository) {
        AbstractC4154l.m8923f(userSIMRepository, "userSIMRepository");
        this.f36778a = userSIMRepository;
    }

    public C7622f(int i10) {
        switch (i10) {
            case 13:
                this.f36778a = new C8656m();
                break;
            case 14:
                this.f36778a = (SmallDisplaySizeQuirk) AbstractC8523a.f41447a.m5729g(SmallDisplaySizeQuirk.class);
                break;
            default:
                this.f36778a = new ArrayList();
                break;
        }
    }

    public C7622f(Bundle bundle) {
        if (bundle != null) {
            this.f36778a = new Bundle(bundle);
            return;
        }
        throw new NullPointerException("data");
    }
}
