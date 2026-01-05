package og;

import android.content.Context;
import android.telephony.TelephonyManager;
import java.io.EOFException;
import java.util.Locale;
import kotlin.jvm.internal.AbstractC4154l;
import nx.AbstractC5178p;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public abstract class yc {
    /* renamed from: a */
    public static final String m11065a(Context context) {
        AbstractC4154l.m8923f(context, "context");
        Object systemService = context.getSystemService("phone");
        AbstractC4154l.m8921d(systemService, "null cannot be cast to non-null type android.telephony.TelephonyManager");
        String networkCountryIso = ((TelephonyManager) systemService).getNetworkCountryIso();
        AbstractC4154l.m8920c(networkCountryIso);
        Locale locale = Locale.ROOT;
        String lowerCase = networkCountryIso.toLowerCase(locale);
        AbstractC4154l.m8922e(lowerCase, "toLowerCase(...)");
        if (!AbstractC5178p.m10101L(lowerCase)) {
            return lowerCase;
        }
        String country = Locale.getDefault().getCountry();
        AbstractC4154l.m8922e(country, "getCountry(...)");
        String lowerCase2 = country.toLowerCase(locale);
        AbstractC4154l.m8922e(lowerCase2, "toLowerCase(...)");
        return AbstractC5178p.m10101L(lowerCase2) ? "in" : lowerCase2;
    }

    /* renamed from: b */
    public static final void m11066b(long j6, Long l9) throws EOFException {
        if (l9 != null && j6 == l9.longValue()) {
            return;
        }
        if (l9 == null || j6 <= l9.longValue()) {
            throw new EOFException("Expected " + j6 + " bytes but received " + l9 + " bytes.");
        }
        throw new EOFException("Expected " + j6 + " bytes but received " + l9 + " bytes. The connection may have been closed prematurely.");
    }
}
