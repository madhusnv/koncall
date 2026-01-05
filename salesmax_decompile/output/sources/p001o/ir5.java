package p001o;

import android.graphics.Bitmap;
import android.net.nsd.NsdManager;
import android.net.nsd.NsdServiceInfo;
import android.os.Build;
import com.facebook.C10773c;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public final class ir5 {

    /* renamed from: a */
    public static final ir5 f29107a = new ir5();

    /* renamed from: b */
    public static final String f29108b = ir5.class.getCanonicalName();

    /* renamed from: c */
    public static final HashMap f29109c = new HashMap();

    /* renamed from: o.ir5$a */
    public static final class C14353a implements NsdManager.RegistrationListener {

        /* renamed from: a */
        public final /* synthetic */ String f29110a;

        /* renamed from: b */
        public final /* synthetic */ String f29111b;

        public C14353a(String str, String str2) {
            this.f29110a = str;
            this.f29111b = str2;
        }

        @Override // android.net.nsd.NsdManager.RegistrationListener
        public void onRegistrationFailed(NsdServiceInfo nsdServiceInfo, int i) {
            sq8.m48649h(nsdServiceInfo, "serviceInfo");
            ir5.m32602a(this.f29111b);
        }

        @Override // android.net.nsd.NsdManager.RegistrationListener
        public void onServiceRegistered(NsdServiceInfo nsdServiceInfo) {
            sq8.m48649h(nsdServiceInfo, "NsdServiceInfo");
            if (sq8.m48644c(this.f29110a, nsdServiceInfo.getServiceName())) {
                return;
            }
            ir5.m32602a(this.f29111b);
        }

        @Override // android.net.nsd.NsdManager.RegistrationListener
        public void onServiceUnregistered(NsdServiceInfo nsdServiceInfo) {
            sq8.m48649h(nsdServiceInfo, "serviceInfo");
        }

        @Override // android.net.nsd.NsdManager.RegistrationListener
        public void onUnregistrationFailed(NsdServiceInfo nsdServiceInfo, int i) {
            sq8.m48649h(nsdServiceInfo, "serviceInfo");
        }
    }

    /* renamed from: a */
    public static final void m32602a(String str) {
        if (a94.m16694d(ir5.class)) {
            return;
        }
        try {
            f29107a.m32607b(str);
        } catch (Throwable th) {
            a94.m16692b(th, ir5.class);
        }
    }

    /* renamed from: c */
    public static final Bitmap m32603c(String str) {
        Bitmap bitmap = null;
        if (a94.m16694d(ir5.class)) {
            return null;
        }
        try {
            EnumMap enumMap = new EnumMap(z66.class);
            enumMap.put((EnumMap) z66.MARGIN, (z66) 2);
            try {
                yh1 yh1VarMo16332a = new xnb().mo16332a(str, va1.QR_CODE, 200, 200, enumMap);
                int iM57801f = yh1VarMo16332a.m57801f();
                int iM57802g = yh1VarMo16332a.m57802g();
                int[] iArr = new int[iM57801f * iM57802g];
                for (int i = 0; i < iM57801f; i++) {
                    int i2 = i * iM57802g;
                    for (int i3 = 0; i3 < iM57802g; i3++) {
                        iArr[i2 + i3] = yh1VarMo16332a.m57800c(i3, i) ? -16777216 : -1;
                    }
                }
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iM57802g, iM57801f, Bitmap.Config.ARGB_8888);
                try {
                    bitmapCreateBitmap.setPixels(iArr, 0, iM57802g, 0, 0, iM57802g, iM57801f);
                    return bitmapCreateBitmap;
                } catch (fdj unused) {
                    bitmap = bitmapCreateBitmap;
                    return bitmap;
                }
            } catch (fdj unused2) {
            }
        } catch (Throwable th) {
            a94.m16692b(th, ir5.class);
            return null;
        }
    }

    /* renamed from: d */
    public static final String m32604d(Map map) {
        if (a94.m16694d(ir5.class)) {
            return null;
        }
        if (map == null) {
            try {
                map = new HashMap();
            } catch (Throwable th) {
                a94.m16692b(th, ir5.class);
                return null;
            }
        }
        String str = Build.DEVICE;
        sq8.m48648g(str, "DEVICE");
        map.put("device", str);
        String str2 = Build.MODEL;
        sq8.m48648g(str2, "MODEL");
        map.put("model", str2);
        String string = new JSONObject(map).toString();
        sq8.m48648g(string, "JSONObject(deviceInfo as Map<*, *>).toString()");
        return string;
    }

    /* renamed from: e */
    public static final boolean m32605e() {
        if (a94.m16694d(ir5.class)) {
            return false;
        }
        try {
            tt6 tt6VarM56796f = xt6.m56796f(C10773c.m13020m());
            if (tt6VarM56796f != null) {
                return tt6VarM56796f.m50556w().contains(mwf.Enabled);
            }
            return false;
        } catch (Throwable th) {
            a94.m16692b(th, ir5.class);
            return false;
        }
    }

    /* renamed from: f */
    public static final boolean m32606f(String str) {
        if (a94.m16694d(ir5.class)) {
            return false;
        }
        try {
            if (m32605e()) {
                return f29107a.m32608g(str);
            }
            return false;
        } catch (Throwable th) {
            a94.m16692b(th, ir5.class);
            return false;
        }
    }

    /* renamed from: b */
    public final void m32607b(String str) {
        if (a94.m16694d(this)) {
            return;
        }
        try {
            NsdManager.RegistrationListener registrationListener = (NsdManager.RegistrationListener) f29109c.get(str);
            if (registrationListener != null) {
                Object systemService = C10773c.m13019l().getSystemService("servicediscovery");
                sq8.m48647f(systemService, "null cannot be cast to non-null type android.net.nsd.NsdManager");
                try {
                    ((NsdManager) systemService).unregisterService(registrationListener);
                } catch (IllegalArgumentException e) {
                    cri.j0(f29108b, e);
                }
                f29109c.remove(str);
            }
        } catch (Throwable th) {
            a94.m16692b(th, this);
        }
    }

    /* renamed from: g */
    public final boolean m32608g(String str) {
        if (a94.m16694d(this)) {
            return false;
        }
        try {
            HashMap map = f29109c;
            if (map.containsKey(str)) {
                return true;
            }
            String str2 = "fbsdk_" + ("android-" + e9g.m24592F(C10773c.m12989C(), '.', '|', false, 4, null)) + '_' + str;
            NsdServiceInfo nsdServiceInfo = new NsdServiceInfo();
            nsdServiceInfo.setServiceType("_fb._tcp.");
            nsdServiceInfo.setServiceName(str2);
            nsdServiceInfo.setPort(80);
            Object systemService = C10773c.m13019l().getSystemService("servicediscovery");
            sq8.m48647f(systemService, "null cannot be cast to non-null type android.net.nsd.NsdManager");
            C14353a c14353a = new C14353a(str2, str);
            map.put(str, c14353a);
            ((NsdManager) systemService).registerService(nsdServiceInfo, 1, c14353a);
            return true;
        } catch (Throwable th) {
            a94.m16692b(th, this);
            return false;
        }
    }
}
