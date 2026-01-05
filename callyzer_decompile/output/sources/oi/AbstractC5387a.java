package oi;

import android.os.Bundle;
import java.util.Arrays;
import pg.m8;
import pg.o8;
import pg.p8;
import ug.z1;
import yh.AbstractC8660d;
import yh.AbstractC8662f;
import yh.C8658b;
import yh.C8664h;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: oi.a */
/* loaded from: classes.dex */
public abstract class AbstractC5387a {

    /* renamed from: a */
    public static final AbstractC8662f f27061a;

    /* renamed from: b */
    public static final C8664h f27062b;

    /* renamed from: c */
    public static final C8664h f27063c;

    /* renamed from: d */
    public static final C8664h f27064d;

    /* renamed from: e */
    public static final C8664h f27065e;

    /* renamed from: f */
    public static final C8664h f27066f;

    static {
        int i10 = AbstractC8662f.f41966c;
        Object[] objArr = new Object[15];
        objArr[0] = "_in";
        objArr[1] = "_xa";
        objArr[2] = "_xu";
        objArr[3] = "_aq";
        objArr[4] = "_aa";
        objArr[5] = "_ai";
        System.arraycopy(new String[]{"_ac", "campaign_details", "_ug", "_iapx", "_exp_set", "_exp_clear", "_exp_activate", "_exp_timeout", "_exp_expire"}, 0, objArr, 6, 9);
        f27061a = AbstractC8662f.m16004k(15, objArr);
        C8658b c8658b = AbstractC8660d.f41962b;
        Object[] objArr2 = {"_e", "_f", "_iap", "_s", "_au", "_ui", "_cd"};
        p8.m11824a(7, objArr2);
        f27062b = AbstractC8660d.m16000h(7, objArr2);
        Object[] objArr3 = {"auto", "app", "am"};
        p8.m11824a(3, objArr3);
        f27063c = AbstractC8660d.m16000h(3, objArr3);
        Object[] objArr4 = {"_r", "_dbg"};
        p8.m11824a(2, objArr4);
        f27064d = AbstractC8660d.m16000h(2, objArr4);
        m8.m11791b(4, "initialCapacity");
        String[] strArr = z1.f36033i;
        p8.m11824a(15, strArr);
        Object[] objArrCopyOf = Arrays.copyOf(new Object[4], o8.m11810a(4, 15));
        System.arraycopy(strArr, 0, objArrCopyOf, 0, 15);
        String[] strArr2 = z1.f36034j;
        p8.m11824a(15, strArr2);
        if (objArrCopyOf.length < 30) {
            objArrCopyOf = Arrays.copyOf(objArrCopyOf, o8.m11810a(objArrCopyOf.length, 30));
        }
        System.arraycopy(strArr2, 0, objArrCopyOf, 15, 15);
        f27065e = AbstractC8660d.m16000h(30, objArrCopyOf);
        Object[] objArr5 = {"^_ltv_[A-Z]{3}$", "^_cc[1-5]{1}$"};
        p8.m11824a(2, objArr5);
        f27066f = AbstractC8660d.m16000h(2, objArr5);
    }

    /* renamed from: a */
    public static boolean m11102a(String str) {
        return !f27063c.contains(str);
    }

    /* renamed from: b */
    public static boolean m11103b(String str, Bundle bundle) {
        if (!f27062b.contains(str)) {
            if (bundle == null) {
                return true;
            }
            C8664h c8664h = f27064d;
            int i10 = c8664h.f41972d;
            int i11 = 0;
            while (i11 < i10) {
                boolean zContainsKey = bundle.containsKey((String) c8664h.get(i11));
                i11++;
                if (zContainsKey) {
                }
            }
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public static boolean m11104c(String str, String str2) {
        if ("_ce1".equals(str2) || "_ce2".equals(str2)) {
            if (str.equals("fcm") || str.equals("frc")) {
                return true;
            }
        } else if ("_ln".equals(str2)) {
            if (str.equals("fcm") || str.equals("fiam")) {
                return true;
            }
        } else if (!f27065e.contains(str2)) {
            C8664h c8664h = f27066f;
            int i10 = c8664h.f41972d;
            int i11 = 0;
            while (i11 < i10) {
                boolean zMatches = str2.matches((String) c8664h.get(i11));
                i11++;
                if (zMatches) {
                }
            }
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public static boolean m11105d(String str, String str2, Bundle bundle) {
        if (!"_cmp".equals(str2)) {
            return true;
        }
        if (m11102a(str) && bundle != null) {
            C8664h c8664h = f27064d;
            int i10 = c8664h.f41972d;
            int i11 = 0;
            while (true) {
                if (i11 >= i10) {
                    int iHashCode = str.hashCode();
                    if (iHashCode != 101200) {
                        if (iHashCode != 101230) {
                            if (iHashCode == 3142703 && str.equals("fiam")) {
                                bundle.putString("_cis", "fiam_integration");
                                return true;
                            }
                        } else if (str.equals("fdl")) {
                            bundle.putString("_cis", "fdl_integration");
                            return true;
                        }
                    } else if (str.equals("fcm")) {
                        bundle.putString("_cis", "fcm_integration");
                        return true;
                    }
                } else {
                    boolean zContainsKey = bundle.containsKey((String) c8664h.get(i11));
                    i11++;
                    if (zContainsKey) {
                        break;
                    }
                }
            }
        }
        return false;
    }
}
