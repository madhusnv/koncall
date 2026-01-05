package p001o;

import android.os.Bundle;
import com.amplifyframework.storage.s3.transfer.TransferTable;
import com.facebook.C10773c;
import java.util.ArrayList;
import java.util.Currency;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import p001o.eec;

/* loaded from: classes5.dex */
public final class fh8 {

    /* renamed from: a */
    public static final fh8 f23324a = new fh8();

    /* renamed from: b */
    public static final List f23325b = bh3.m18963e("fb_currency");

    /* renamed from: c */
    public static final List f23326c = bh3.m18963e("_valueToSum");

    /* renamed from: d */
    public static final long f23327d = TimeUnit.MINUTES.toMillis(1);

    /* renamed from: e */
    public static final List f23328e = ch3.m21249n(vyh.m53620a("fb_iap_product_id", bh3.m18963e("fb_iap_product_id")), vyh.m53620a("fb_iap_product_description", bh3.m18963e("fb_iap_product_description")), vyh.m53620a("fb_iap_product_title", bh3.m18963e("fb_iap_product_title")), vyh.m53620a("fb_iap_purchase_token", bh3.m18963e("fb_iap_purchase_token")));

    /* renamed from: a */
    public final hwc m26687a(Bundle bundle, Bundle bundle2, eec eecVar) {
        if (bundle == null) {
            return new hwc(bundle2, eecVar);
        }
        try {
            for (String str : bundle.keySet()) {
                String string = bundle.getString(str);
                if (string != null) {
                    eec.C13167a c13167a = eec.f21491b;
                    fec fecVar = fec.IAPParameters;
                    sq8.m48648g(str, TransferTable.COLUMN_KEY);
                    hwc hwcVarM24866b = c13167a.m24866b(fecVar, str, string, bundle2, eecVar);
                    Bundle bundle3 = (Bundle) hwcVarM24866b.m31227a();
                    eecVar = (eec) hwcVarM24866b.m31228b();
                    bundle2 = bundle3;
                }
            }
        } catch (Exception unused) {
        }
        return new hwc(bundle2, eecVar);
    }

    /* renamed from: b */
    public final Currency m26688b(Bundle bundle) {
        Iterator it = m26689c().iterator();
        while (true) {
            String string = null;
            if (!it.hasNext()) {
                return null;
            }
            String str = (String) it.next();
            if (bundle != null) {
                try {
                    string = bundle.getString(str);
                } catch (Exception unused) {
                    continue;
                }
            }
            if (!(string == null || string.length() == 0)) {
                return Currency.getInstance(string);
            }
        }
    }

    /* renamed from: c */
    public final List m26689c() {
        tt6 tt6VarM56796f = xt6.m56796f(C10773c.m13020m());
        return ((tt6VarM56796f != null ? tt6VarM56796f.m50538e() : null) == null || tt6VarM56796f.m50538e().isEmpty()) ? f23325b : tt6VarM56796f.m50538e();
    }

    /* renamed from: d */
    public final List m26690d(boolean z) {
        tt6 tt6VarM56796f = xt6.m56796f(C10773c.m13020m());
        if ((tt6VarM56796f != null ? tt6VarM56796f.m50546m() : null) == null || tt6VarM56796f.m50546m().isEmpty()) {
            return f23328e;
        }
        if (!z) {
            return tt6VarM56796f.m50546m();
        }
        ArrayList arrayList = new ArrayList();
        for (hwc hwcVar : tt6VarM56796f.m50546m()) {
            Iterator it = ((List) hwcVar.m31230d()).iterator();
            while (it.hasNext()) {
                arrayList.add(new hwc((String) it.next(), bh3.m18963e(hwcVar.m31229c())));
            }
        }
        return arrayList;
    }

    /* renamed from: e */
    public final long m26691e() {
        Long lM50539f;
        tt6 tt6VarM56796f = xt6.m56796f(C10773c.m13020m());
        return ((tt6VarM56796f != null ? tt6VarM56796f.m50539f() : null) == null || ((lM50539f = tt6VarM56796f.m50539f()) != null && lM50539f.longValue() == 0)) ? f23327d : tt6VarM56796f.m50539f().longValue();
    }

    /* renamed from: f */
    public final List m26692f(boolean z) {
        tt6 tt6VarM56796f = xt6.m56796f(C10773c.m13020m());
        if (tt6VarM56796f == null) {
            return null;
        }
        List listM50558y = tt6VarM56796f.m50558y();
        if (listM50558y == null || listM50558y.isEmpty()) {
            return null;
        }
        if (!z) {
            return tt6VarM56796f.m50558y();
        }
        ArrayList arrayList = new ArrayList();
        for (hwc hwcVar : tt6VarM56796f.m50558y()) {
            Iterator it = ((List) hwcVar.m31230d()).iterator();
            while (it.hasNext()) {
                arrayList.add(new hwc((String) it.next(), bh3.m18963e(hwcVar.m31229c())));
            }
        }
        return arrayList;
    }

    /* renamed from: g */
    public final Double m26693g(Double d, Bundle bundle) {
        if (d != null) {
            return d;
        }
        Iterator it = m26694h().iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (bundle != null) {
                try {
                    return Double.valueOf(bundle.getDouble(str));
                } catch (Exception unused) {
                    continue;
                }
            }
        }
        return null;
    }

    /* renamed from: h */
    public final List m26694h() {
        tt6 tt6VarM56796f = xt6.m56796f(C10773c.m13020m());
        return ((tt6VarM56796f != null ? tt6VarM56796f.m50548o() : null) == null || tt6VarM56796f.m50548o().isEmpty()) ? f23326c : tt6VarM56796f.m50548o();
    }
}
