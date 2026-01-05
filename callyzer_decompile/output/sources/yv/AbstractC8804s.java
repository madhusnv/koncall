package yv;

import android.content.Context;
import android.os.Build;
import android.telephony.PhoneNumberUtils;
import android.text.TextUtils;
import cm.C0983a;
import com.google.i18n.phonenumbers.C1404a;
import com.google.i18n.phonenumbers.NumberParseException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.AbstractC4154l;
import nx.AbstractC5178p;
import og.nd;
import og.pe;
import og.wc;
import og.yc;
import sk.C6863k;
import sq.n2;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: yv.s */
/* loaded from: classes3.dex */
public abstract class AbstractC8804s {

    /* renamed from: a */
    public static String f42473a;

    static {
        Collections.unmodifiableList(pe.m10835j("225"));
        f42473a = "";
        nd.m10782c(new n2(21));
    }

    /* renamed from: a */
    public static String m16222a(String phoneNumber) {
        AbstractC4154l.m8923f(phoneNumber, "phoneNumber");
        C1404a c1404aM4499e = C1404a.m4499e();
        try {
            return c1404aM4499e.m4512l(c1404aM4499e.m4517t(phoneNumber, null));
        } catch (NumberParseException e2) {
            e2.printStackTrace();
            return null;
        }
    }

    /* renamed from: b */
    public static C0983a m16223b(Context context) {
        AbstractC4154l.m8923f(context, "context");
        int i10 = 0;
        try {
            ArrayList arrayListM11031a = wc.m11031a();
            int size = arrayListM11031a.size();
            Object obj = null;
            boolean z6 = false;
            int i11 = 0;
            while (i11 < size) {
                Object obj2 = arrayListM11031a.get(i11);
                i11++;
                if (AbstractC4154l.m8918a(((C0983a) obj2).f5815d, yc.m11065a(context))) {
                    if (z6) {
                        throw new IllegalArgumentException("Collection contains more than one matching element.");
                    }
                    z6 = true;
                    obj = obj2;
                }
            }
            if (z6) {
                return (C0983a) obj;
            }
            throw new NoSuchElementException("Collection contains no element matching the predicate.");
        } catch (Exception unused) {
            ArrayList arrayListM11031a2 = wc.m11031a();
            int size2 = arrayListM11031a2.size();
            while (i10 < size2) {
                Object obj3 = arrayListM11031a2.get(i10);
                i10++;
                C0983a c0983a = (C0983a) obj3;
                if (AbstractC4154l.m8918a(c0983a.f5815d, yc.m11065a(context))) {
                    return c0983a;
                }
            }
            throw new NoSuchElementException("Collection contains no element matching the predicate.");
        }
    }

    /* renamed from: c */
    public static boolean m16224c(int i10, String inputNumber, String region) {
        AbstractC4154l.m8923f(inputNumber, "inputNumber");
        AbstractC4154l.m8923f(region, "region");
        C8791f c8791f = C8791f.f42457a;
        if (!AbstractC5178p.m10101L(inputNumber) && TextUtils.isDigitsOnly(inputNumber) && i10 != 0) {
            try {
                C6863k c6863kM16169b = C8791f.m16169b("+" + i10 + inputNumber, region);
                if (c6863kM16169b != null) {
                    if (C1404a.m4499e().m4514n(c6863kM16169b)) {
                        return C8791f.m16172e("+" + i10 + inputNumber, region);
                    }
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        return false;
    }

    /* renamed from: d */
    public static boolean m16225d(String str, String anotherNumber, String countryIso) {
        AbstractC4154l.m8923f(str, "<this>");
        AbstractC4154l.m8923f(anotherNumber, "anotherNumber");
        AbstractC4154l.m8923f(countryIso, "countryIso");
        return Build.VERSION.SDK_INT >= 31 ? PhoneNumberUtils.areSamePhoneNumber(str, anotherNumber, countryIso) : PhoneNumberUtils.compare(str, anotherNumber);
    }
}
