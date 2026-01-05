package ve;

import android.content.Context;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.telephony.TelephonyManager;
import android.util.Log;
import com.sun.mail.imap.IMAPStore;
import gf.InterfaceC2585a;
import i0.m0;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Locale;
import java.util.TimeZone;
import k4.C4001v;
import lj.C4481d;
import og.f1;
import s2.C6739h;
import we.AbstractC7999a;
import we.AbstractC8021w;
import we.AbstractC8023y;
import we.C8000b;
import we.C8001c;
import we.C8002d;
import we.C8003e;
import we.C8004f;
import we.C8005g;
import we.C8006h;
import we.C8007i;
import we.C8008j;
import we.C8009k;
import we.C8010l;
import we.C8011m;
import we.C8012n;
import we.C8013o;
import we.C8014p;
import we.C8015q;
import we.C8016r;
import we.C8017s;
import we.C8018t;
import we.C8020v;
import we.a0;
import we.b0;
import we.c0;
import we.d0;
import we.e0;
import we.f0;
import we.g0;
import we.h0;
import we.i0;
import xe.C8356h;
import ye.InterfaceC8642g;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ve.b */
/* loaded from: classes.dex */
public final class C7708b implements InterfaceC8642g {

    /* renamed from: a */
    public final C4001v f37231a;

    /* renamed from: b */
    public final ConnectivityManager f37232b;

    /* renamed from: c */
    public final Context f37233c;

    /* renamed from: d */
    public final URL f37234d;

    /* renamed from: e */
    public final InterfaceC2585a f37235e;

    /* renamed from: f */
    public final InterfaceC2585a f37236f;

    /* renamed from: g */
    public final int f37237g;

    public C7708b(Context context, InterfaceC2585a interfaceC2585a, InterfaceC2585a interfaceC2585a2) {
        C4481d c4481d = new C4481d();
        C8001c c8001c = C8001c.f38466a;
        c4481d.mo8850c(AbstractC8021w.class, c8001c);
        c4481d.mo8850c(C8011m.class, c8001c);
        C8008j c8008j = C8008j.f38491a;
        c4481d.mo8850c(f0.class, c8008j);
        c4481d.mo8850c(C8018t.class, c8008j);
        C8002d c8002d = C8002d.f38468a;
        c4481d.mo8850c(AbstractC8023y.class, c8002d);
        c4481d.mo8850c(C8012n.class, c8002d);
        C8000b c8000b = C8000b.f38453a;
        c4481d.mo8850c(AbstractC7999a.class, c8000b);
        c4481d.mo8850c(C8010l.class, c8000b);
        C8007i c8007i = C8007i.f38481a;
        c4481d.mo8850c(e0.class, c8007i);
        c4481d.mo8850c(C8017s.class, c8007i);
        C8003e c8003e = C8003e.f38471a;
        c4481d.mo8850c(a0.class, c8003e);
        c4481d.mo8850c(C8013o.class, c8003e);
        C8006h c8006h = C8006h.f38479a;
        c4481d.mo8850c(d0.class, c8006h);
        c4481d.mo8850c(C8016r.class, c8006h);
        C8005g c8005g = C8005g.f38477a;
        c4481d.mo8850c(c0.class, c8005g);
        c4481d.mo8850c(C8015q.class, c8005g);
        C8009k c8009k = C8009k.f38499a;
        c4481d.mo8850c(i0.class, c8009k);
        c4481d.mo8850c(C8020v.class, c8009k);
        C8004f c8004f = C8004f.f38474a;
        c4481d.mo8850c(b0.class, c8004f);
        c4481d.mo8850c(C8014p.class, c8004f);
        c4481d.f22312d = true;
        this.f37231a = new C4001v(6, c4481d);
        this.f37233c = context;
        this.f37232b = (ConnectivityManager) context.getSystemService("connectivity");
        this.f37234d = m14706b(C7707a.f37225c);
        this.f37235e = interfaceC2585a2;
        this.f37236f = interfaceC2585a;
        this.f37237g = 130000;
    }

    /* renamed from: b */
    public static URL m14706b(String str) {
        try {
            return new URL(str);
        } catch (MalformedURLException e2) {
            throw new IllegalArgumentException(m0.m7378k("Invalid url: ", str), e2);
        }
    }

    /* renamed from: a */
    public final C8356h m14707a(C8356h c8356h) {
        int subtype;
        NetworkInfo activeNetworkInfo = this.f37232b.getActiveNetworkInfo();
        C6739h c6739hM15531c = c8356h.m15531c();
        int i10 = Build.VERSION.SDK_INT;
        HashMap map = (HashMap) c6739hM15531c.f32185f;
        if (map == null) {
            throw new IllegalStateException("Property \"autoMetadata\" has not been set");
        }
        map.put("sdk-version", String.valueOf(i10));
        c6739hM15531c.m12893a("model", Build.MODEL);
        c6739hM15531c.m12893a("hardware", Build.HARDWARE);
        c6739hM15531c.m12893a("device", Build.DEVICE);
        c6739hM15531c.m12893a("product", Build.PRODUCT);
        c6739hM15531c.m12893a("os-uild", Build.ID);
        c6739hM15531c.m12893a("manufacturer", Build.MANUFACTURER);
        c6739hM15531c.m12893a("fingerprint", Build.FINGERPRINT);
        Calendar.getInstance();
        long offset = TimeZone.getDefault().getOffset(Calendar.getInstance().getTimeInMillis()) / IMAPStore.RESPONSE;
        HashMap map2 = (HashMap) c6739hM15531c.f32185f;
        if (map2 == null) {
            throw new IllegalStateException("Property \"autoMetadata\" has not been set");
        }
        map2.put("tz-offset", String.valueOf(offset));
        int value = activeNetworkInfo == null ? h0.NONE.getValue() : activeNetworkInfo.getType();
        HashMap map3 = (HashMap) c6739hM15531c.f32185f;
        if (map3 == null) {
            throw new IllegalStateException("Property \"autoMetadata\" has not been set");
        }
        map3.put("net-type", String.valueOf(value));
        int i11 = -1;
        if (activeNetworkInfo == null) {
            subtype = g0.UNKNOWN_MOBILE_SUBTYPE.getValue();
        } else {
            subtype = activeNetworkInfo.getSubtype();
            if (subtype == -1) {
                subtype = g0.COMBINED.getValue();
            } else if (g0.forNumber(subtype) == null) {
                subtype = 0;
            }
        }
        HashMap map4 = (HashMap) c6739hM15531c.f32185f;
        if (map4 == null) {
            throw new IllegalStateException("Property \"autoMetadata\" has not been set");
        }
        map4.put("mobile-subtype", String.valueOf(subtype));
        c6739hM15531c.m12893a("country", Locale.getDefault().getCountry());
        c6739hM15531c.m12893a("locale", Locale.getDefault().getLanguage());
        Context context = this.f37233c;
        String simOperator = ((TelephonyManager) context.getSystemService("phone")).getSimOperator();
        if (simOperator == null) {
            simOperator = "";
        }
        c6739hM15531c.m12893a("mcc_mnc", simOperator);
        try {
            i11 = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
        } catch (PackageManager.NameNotFoundException unused) {
            Log.isLoggable(f1.m10639c("CctTransportBackend"), 6);
        }
        c6739hM15531c.m12893a("application_build", Integer.toString(i11));
        return c6739hM15531c.m12894b();
    }
}
