package p001o;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Bundle;
import com.facebook.C10773c;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import p001o.kh8;
import p001o.mt6;

/* loaded from: classes5.dex */
public final class ih8 {

    /* renamed from: d */
    public static String f28668d;

    /* renamed from: a */
    public static final ih8 f28665a = new ih8();

    /* renamed from: b */
    public static final ConcurrentHashMap f28666b = new ConcurrentHashMap();

    /* renamed from: c */
    public static final ConcurrentHashMap f28667c = new ConcurrentHashMap();

    /* renamed from: e */
    public static final AtomicBoolean f28669e = new AtomicBoolean(false);

    /* renamed from: o.ih8$a */
    public /* synthetic */ class C14292a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f28670a;

        static {
            int[] iArr = new int[kh8.EnumC14835a.values().length];
            try {
                iArr[kh8.EnumC14835a.NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[kh8.EnumC14835a.V1.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[kh8.EnumC14835a.V2_V4.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[kh8.EnumC14835a.V5_V7.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f28670a = iArr;
        }
    }

    /* renamed from: a */
    public static final void m32132a() {
        if (a94.m16694d(ih8.class)) {
            return;
        }
        try {
            if (!u61.m50977g()) {
                hh8.m30458i();
            } else {
                f28669e.set(true);
                m32137h();
            }
        } catch (Throwable th) {
            a94.m16692b(th, ih8.class);
        }
    }

    /* renamed from: d */
    public static /* synthetic */ String m32133d(ih8 ih8Var, Bundle bundle, eec eecVar, Bundle bundle2, eec eecVar2, boolean z, boolean z2, int i, Object obj) {
        if (a94.m16694d(ih8.class)) {
            return null;
        }
        try {
            return ih8Var.m32139c(bundle, eecVar, bundle2, eecVar2, z, (i & 32) != 0 ? false : z2);
        } catch (Throwable th) {
            a94.m16692b(th, ih8.class);
            return null;
        }
    }

    /* renamed from: e */
    public static final String m32134e() {
        if (a94.m16694d(ih8.class)) {
            return null;
        }
        try {
            return f28668d;
        } catch (Throwable th) {
            a94.m16692b(th, ih8.class);
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: f */
    public static final synchronized Bundle m32135f(List list, long j, boolean z, List list2) {
        qg8 qg8Var;
        String str;
        Long l;
        String str2;
        boolean z2;
        String str3 = null;
        if (a94.m16694d(ih8.class)) {
            return null;
        }
        try {
            sq8.m48649h(list, "purchases");
            sq8.m48649h(list2, "purchaseParameters");
            if (list2.isEmpty()) {
                return null;
            }
            if (!(list.size() == list2.size())) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            int size = list.size();
            Bundle bundle = null;
            int i = 0;
            while (i < size) {
                qg8 qg8Var2 = (qg8) list.get(i);
                hwc hwcVar = (hwc) list2.get(i);
                Bundle bundle2 = (Bundle) hwcVar.m31227a();
                eec eecVar = (eec) hwcVar.m31228b();
                qg8 qg8Var3 = new qg8(qg8Var2.m45429c(), new BigDecimal(String.valueOf(qg8Var2.m45427a())).setScale(2, RoundingMode.HALF_UP).doubleValue(), qg8Var2.m45428b());
                List<hwc> list3 = z ? (List) f28666b.get(qg8Var3) : (List) f28667c.get(qg8Var3);
                if (list3 == null || list3.isEmpty()) {
                    qg8Var = qg8Var3;
                    str = null;
                    l = null;
                    str2 = null;
                    z2 = false;
                } else {
                    str = str3;
                    Long lValueOf = str;
                    str2 = lValueOf;
                    z2 = false;
                    for (hwc hwcVar2 : list3) {
                        long jLongValue = ((Number) hwcVar2.m31229c()).longValue();
                        hwc hwcVar3 = (hwc) hwcVar2.m31230d();
                        Bundle bundle3 = (Bundle) hwcVar3.m31227a();
                        eec eecVar2 = (eec) hwcVar3.m31228b();
                        if (Math.abs(j - jLongValue) <= fh8.f23324a.m26691e() && (lValueOf == 0 || jLongValue < lValueOf.longValue())) {
                            ih8 ih8Var = f28665a;
                            qg8 qg8Var4 = qg8Var3;
                            String strM32133d = m32133d(ih8Var, bundle2, eecVar, bundle3, eecVar2, !z, false, 32, null);
                            String strM32139c = ih8Var.m32139c(bundle2, eecVar, bundle3, eecVar2, !z, true);
                            if (strM32139c != null) {
                                str = strM32139c;
                            }
                            if (strM32133d != null) {
                                lValueOf = Long.valueOf(jLongValue);
                                arrayList.add(new hwc(qg8Var4, Long.valueOf(jLongValue)));
                                qg8Var3 = qg8Var4;
                                str2 = strM32133d;
                                z2 = true;
                            } else {
                                qg8Var3 = qg8Var4;
                                str2 = strM32133d;
                            }
                        }
                    }
                    qg8Var = qg8Var3;
                    l = lValueOf;
                }
                if (str != null) {
                    if (bundle == null) {
                        bundle = new Bundle();
                    }
                    bundle.putString("fb_iap_test_dedup_result", "1");
                    bundle.putString("fb_iap_test_dedup_key_used", str);
                }
                if (z2) {
                    if (bundle == null) {
                        bundle = new Bundle();
                    }
                    bundle.putString("fb_iap_non_deduped_event_time", String.valueOf(l != null ? l.longValue() / 1000 : 0L));
                    bundle.putString("fb_iap_actual_dedup_result", "1");
                    bundle.putString("fb_iap_actual_dedup_key_used", str2);
                }
                if (z && !z2) {
                    ConcurrentHashMap concurrentHashMap = f28667c;
                    if (concurrentHashMap.get(qg8Var) == null) {
                        concurrentHashMap.put(qg8Var, new ArrayList());
                    }
                    List list4 = (List) concurrentHashMap.get(qg8Var);
                    if (list4 != null) {
                        list4.add(new hwc(Long.valueOf(j), new hwc(bundle2, eecVar)));
                    }
                } else if (!z && !z2) {
                    ConcurrentHashMap concurrentHashMap2 = f28666b;
                    if (concurrentHashMap2.get(qg8Var) == null) {
                        concurrentHashMap2.put(qg8Var, new ArrayList());
                    }
                    List list5 = (List) concurrentHashMap2.get(qg8Var);
                    if (list5 != null) {
                        list5.add(new hwc(Long.valueOf(j), new hwc(bundle2, eecVar)));
                    }
                }
                i++;
                str3 = null;
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                hwc hwcVar4 = (hwc) it.next();
                List list6 = z ? (List) f28666b.get(hwcVar4.m31229c()) : (List) f28667c.get(hwcVar4.m31229c());
                if (list6 != null) {
                    Iterator it2 = list6.iterator();
                    int i2 = 0;
                    while (true) {
                        if (!it2.hasNext()) {
                            break;
                        }
                        int i3 = i2 + 1;
                        if (((Number) ((hwc) it2.next()).m31229c()).longValue() == ((Number) hwcVar4.m31230d()).longValue()) {
                            list6.remove(i2);
                            break;
                        }
                        i2 = i3;
                    }
                    if (z) {
                        if (list6.isEmpty()) {
                            f28666b.remove(hwcVar4.m31229c());
                        } else {
                            f28666b.put(hwcVar4.m31229c(), list6);
                        }
                    } else if (list6.isEmpty()) {
                        f28667c.remove(hwcVar4.m31229c());
                    } else {
                        f28667c.put(hwcVar4.m31229c(), list6);
                    }
                }
            }
            return bundle;
        } catch (Throwable th) {
            a94.m16692b(th, ih8.class);
            return null;
        }
    }

    /* renamed from: g */
    public static final void m32136g(String str) {
        if (a94.m16694d(ih8.class)) {
            return;
        }
        try {
            f28668d = str;
        } catch (Throwable th) {
            a94.m16692b(th, ih8.class);
        }
    }

    /* renamed from: h */
    public static final void m32137h() {
        if (a94.m16694d(ih8.class)) {
            return;
        }
        try {
            if (f28669e.get()) {
                kh8.EnumC14835a enumC14835aM32138b = f28665a.m32138b();
                int i = C14292a.f28670a[enumC14835aM32138b.ordinal()];
                if (i == 2) {
                    rg8.m46721g(kh8.EnumC14835a.V1);
                    return;
                }
                if (i != 3) {
                    if (i == 4 && mt6.m39648g(mt6.EnumC15426c.IapLoggingLib5To7)) {
                        xg8.m56252e(C10773c.m13019l(), enumC14835aM32138b);
                        return;
                    }
                    return;
                }
                if (mt6.m39648g(mt6.EnumC15426c.IapLoggingLib2)) {
                    xg8.m56252e(C10773c.m13019l(), enumC14835aM32138b);
                } else {
                    rg8.m46721g(kh8.EnumC14835a.V2_V4);
                }
            }
        } catch (Throwable th) {
            a94.m16692b(th, ih8.class);
        }
    }

    /* renamed from: b */
    public final kh8.EnumC14835a m32138b() {
        try {
            if (a94.m16694d(this)) {
                return null;
            }
            try {
                Context contextM13019l = C10773c.m13019l();
                ApplicationInfo applicationInfo = contextM13019l.getPackageManager().getApplicationInfo(contextM13019l.getPackageName(), 128);
                sq8.m48648g(applicationInfo, "context.packageManager.g…TA_DATA\n                )");
                String string = applicationInfo.metaData.getString("com.google.android.play.billingclient.version");
                if (string == null) {
                    return kh8.EnumC14835a.NONE;
                }
                List listD0 = f9g.D0(string, new String[]{"."}, false, 3, 2, null);
                if (string.length() == 0) {
                    return kh8.EnumC14835a.V5_V7;
                }
                m32136g("GPBL." + string);
                Integer numM22638l = d9g.m22638l((String) listD0.get(0));
                if (numM22638l == null) {
                    return kh8.EnumC14835a.V5_V7;
                }
                int iIntValue = numM22638l.intValue();
                return iIntValue == 1 ? kh8.EnumC14835a.V1 : iIntValue < 5 ? kh8.EnumC14835a.V2_V4 : kh8.EnumC14835a.V5_V7;
            } catch (Exception unused) {
                return kh8.EnumC14835a.V5_V7;
            }
        } catch (Throwable th) {
            a94.m16692b(th, this);
            return null;
        }
    }

    /* renamed from: c */
    public final String m32139c(Bundle bundle, eec eecVar, Bundle bundle2, eec eecVar2, boolean z, boolean z2) {
        if (a94.m16694d(this)) {
            return null;
        }
        try {
            List<hwc> listM26692f = z2 ? fh8.f23324a.m26692f(z) : fh8.f23324a.m26690d(z);
            if (listM26692f == null) {
                return null;
            }
            for (hwc hwcVar : listM26692f) {
                Object objM24867c = eec.f21491b.m24867c(fec.IAPParameters, (String) hwcVar.m31229c(), bundle, eecVar);
                String str = objM24867c instanceof String ? (String) objM24867c : null;
                if (!(str == null || str.length() == 0)) {
                    for (String str2 : (List) hwcVar.m31230d()) {
                        Object objM24867c2 = eec.f21491b.m24867c(fec.IAPParameters, str2, bundle2, eecVar2);
                        String str3 = objM24867c2 instanceof String ? (String) objM24867c2 : null;
                        if (!(str3 == null || str3.length() == 0) && sq8.m48644c(str3, str)) {
                            return z ? (String) hwcVar.m31229c() : str2;
                        }
                    }
                }
            }
            return null;
        } catch (Throwable th) {
            a94.m16692b(th, this);
            return null;
        }
    }
}
