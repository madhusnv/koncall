package h2;

import a3.C0043b;
import android.content.Context;
import android.os.Build;
import android.text.format.DateFormat;
import android.view.accessibility.AccessibilityManager;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import aq.C0408k;
import au.C0446j;
import b2.C0566x;
import com.sun.mail.util.AbstractC1452a;
import d7.InterfaceC1649u;
import e7.AbstractC1967c;
import ex.InterfaceC2137a;
import ex.InterfaceC2139c;
import ex.InterfaceC2141e;
import g2.k2;
import g2.sc;
import g4.C2508x;
import g4.C2510z;
import j$.time.Instant;
import j$.time.ZoneId;
import j$.time.format.DateTimeFormatter;
import j$.time.format.DecimalStyle;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import k2.C3953b;
import k2.C3961j;
import k2.C3966o;
import k2.C3977z;
import k2.InterfaceC3962k;
import k2.m1;
import k2.n1;
import kotlin.jvm.internal.AbstractC4154l;
import nx.AbstractC5178p;
import nx.AbstractC5185w;
import nx.C5171i;
import nx.C5174l;
import og.f2;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: h2.q */
/* loaded from: classes.dex */
public abstract class AbstractC2812q {

    /* renamed from: a */
    public static final C2510z f15764a = new C2510z(null, new C2508x());

    /* renamed from: a */
    public static final void m6909a(InterfaceC1649u interfaceC1649u, InterfaceC2139c interfaceC2139c, InterfaceC2137a interfaceC2137a, InterfaceC3962k interfaceC3962k, int i10) {
        C3966o c3966o = (C3966o) interfaceC3962k;
        c3966o.a0(-1868327245);
        int i11 = (c3966o.m8616i(interfaceC1649u) ? 4 : 2) | i10 | (c3966o.m8616i(interfaceC2139c) ? 32 : 16) | (c3966o.m8616i(interfaceC2137a) ? 256 : 128);
        if ((i11 & 147) == 146 && c3966o.m8586C()) {
            c3966o.m8601S();
        } else {
            boolean zM8616i = ((i11 & 112) == 32) | c3966o.m8616i(interfaceC1649u) | ((i11 & 896) == 256);
            Object objM8596M = c3966o.m8596M();
            if (zM8616i || objM8596M == C3961j.f20408a) {
                objM8596M = new C0566x(11, interfaceC1649u, interfaceC2139c, interfaceC2137a);
                c3966o.j0(objM8596M);
            }
            C3953b.m8500c(interfaceC1649u, (InterfaceC2139c) objM8596M, c3966o);
        }
        n1 n1VarM8628u = c3966o.m8628u();
        if (n1VarM8628u != null) {
            n1VarM8628u.f20443d = new C0446j(interfaceC1649u, interfaceC2139c, interfaceC2137a, i10, 6);
        }
    }

    /* renamed from: b */
    public static final void m6910b(long j6, g4.o0 o0Var, InterfaceC2141e interfaceC2141e, InterfaceC3962k interfaceC3962k, int i10) {
        int i11;
        C3966o c3966o = (C3966o) interfaceC3962k;
        c3966o.a0(-716124955);
        if ((i10 & 6) == 0) {
            i11 = (c3966o.m8613f(j6) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c3966o.m8614g(o0Var) ? 32 : 16;
        }
        if ((i10 & KyberEngine.KyberPolyBytes) == 0) {
            i11 |= c3966o.m8616i(interfaceC2141e) ? 256 : 128;
        }
        if ((i11 & 147) == 146 && c3966o.m8586C()) {
            c3966o.m8601S();
        } else {
            C3977z c3977z = sc.f12721a;
            C3953b.m8499b(new m1[]{AbstractC1452a.m4572s(j6, k2.f11902a), c3977z.mo8541a(((g4.o0) c3966o.m8618k(c3977z)).m6465d(o0Var))}, interfaceC2141e, c3966o, ((i11 >> 3) & 112) | 8);
        }
        n1 n1VarM8628u = c3966o.m8628u();
        if (n1VarM8628u != null) {
            n1VarM8628u.f20443d = new l0(j6, o0Var, interfaceC2141e, i10, 0);
        }
    }

    /* renamed from: c */
    public static final AbstractC2808m m6911c(Locale locale) {
        return Build.VERSION.SDK_INT >= 26 ? new C2809n(locale) : new C2820y(locale);
    }

    /* renamed from: d */
    public static final C2811p m6912d(String input) {
        Pattern patternCompile = Pattern.compile("[^dMy/\\-.]");
        AbstractC4154l.m8922e(patternCompile, "compile(...)");
        AbstractC4154l.m8923f(input, "input");
        String strReplaceAll = patternCompile.matcher(input).replaceAll("");
        AbstractC4154l.m8922e(strReplaceAll, "replaceAll(...)");
        Pattern patternCompile2 = Pattern.compile("d{1,2}");
        AbstractC4154l.m8922e(patternCompile2, "compile(...)");
        String strReplaceAll2 = patternCompile2.matcher(strReplaceAll).replaceAll("dd");
        AbstractC4154l.m8922e(strReplaceAll2, "replaceAll(...)");
        Pattern patternCompile3 = Pattern.compile("M{1,2}");
        AbstractC4154l.m8922e(patternCompile3, "compile(...)");
        String strReplaceAll3 = patternCompile3.matcher(strReplaceAll2).replaceAll("MM");
        AbstractC4154l.m8922e(strReplaceAll3, "replaceAll(...)");
        Pattern patternCompile4 = Pattern.compile("y{1,4}");
        AbstractC4154l.m8922e(patternCompile4, "compile(...)");
        String strReplaceAll4 = patternCompile4.matcher(strReplaceAll3).replaceAll("yyyy");
        AbstractC4154l.m8922e(strReplaceAll4, "replaceAll(...)");
        String strM10108S = AbstractC5178p.m10108S(AbstractC5185w.m10136r(strReplaceAll4, "My", "M/y"), ".");
        Pattern patternCompile5 = Pattern.compile("[/\\-.]");
        AbstractC4154l.m8922e(patternCompile5, "compile(...)");
        Matcher matcher = patternCompile5.matcher(strM10108S);
        AbstractC4154l.m8922e(matcher, "matcher(...)");
        C5174l c5174lM10640a = f2.m10640a(matcher, 0, strM10108S);
        AbstractC4154l.m8920c(c5174lM10640a);
        C5171i c5171iM10081h = c5174lM10640a.f25282c.m10081h(0);
        AbstractC4154l.m8920c(c5171iM10081h);
        int i10 = c5171iM10081h.f25275b.f21646a;
        String strSubstring = strM10108S.substring(i10, i10 + 1);
        AbstractC4154l.m8922e(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return new C2811p(strM10108S, strSubstring.charAt(0));
    }

    /* renamed from: e */
    public static String m6913e(long j6, String str, Locale locale, Map map) {
        String str2 = "P:" + str + locale.toLanguageTag();
        Object objWithDecimalStyle = map.get(str2);
        if (objWithDecimalStyle == null) {
            objWithDecimalStyle = DateTimeFormatter.ofPattern(str, locale).withDecimalStyle(DecimalStyle.of(locale));
            map.put(str2, objWithDecimalStyle);
        }
        AbstractC4154l.m8921d(objWithDecimalStyle, "null cannot be cast to non-null type java.time.format.DateTimeFormatter");
        return Instant.ofEpochMilli(j6).atZone(C2809n.f15741d).mo7878m().format((DateTimeFormatter) objWithDecimalStyle);
    }

    /* renamed from: f */
    public static String m6914f(long j6, String str, Locale locale, Map map) {
        StringBuilder sbM4568o = AbstractC1452a.m4568o(str);
        sbM4568o.append(locale.toLanguageTag());
        String string = sbM4568o.toString();
        Object obj = map.get(string);
        Object obj2 = obj;
        if (obj == null) {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat(str, locale);
            simpleDateFormat.setTimeZone(C2820y.f15805d);
            map.put(string, simpleDateFormat);
            obj2 = simpleDateFormat;
        }
        Calendar calendar = Calendar.getInstance(C2820y.f15805d);
        calendar.setTimeInMillis(j6);
        return ((SimpleDateFormat) obj2).format(Long.valueOf(calendar.getTimeInMillis()));
    }

    /* renamed from: g */
    public static final String m6915g(long j6, String str, Locale locale, LinkedHashMap linkedHashMap) {
        String str2 = "S:" + str + locale.toLanguageTag();
        Object bestDateTimePattern = linkedHashMap.get(str2);
        if (bestDateTimePattern == null) {
            bestDateTimePattern = DateFormat.getBestDateTimePattern(locale, str);
            linkedHashMap.put(str2, bestDateTimePattern);
        }
        String string = bestDateTimePattern.toString();
        if (Build.VERSION.SDK_INT >= 26) {
            ZoneId zoneId = C2809n.f15741d;
            return m6913e(j6, string, locale, linkedHashMap);
        }
        TimeZone timeZone = C2820y.f15805d;
        return m6914f(j6, string, locale, linkedHashMap);
    }

    /* renamed from: h */
    public static final String m6916h(InterfaceC3962k interfaceC3962k, int i10) {
        C3966o c3966o = (C3966o) interfaceC3962k;
        c3966o.m8618k(AndroidCompositionLocals_androidKt.f2133a);
        return ((Context) c3966o.m8618k(AndroidCompositionLocals_androidKt.f2134b)).getResources().getString(i10);
    }

    /* renamed from: i */
    public static final c0 m6917i(InterfaceC3962k interfaceC3962k) {
        C3966o c3966o = (C3966o) interfaceC3962k;
        Object systemService = ((Context) c3966o.m8618k(AndroidCompositionLocals_androidKt.f2134b)).getSystemService("accessibility");
        AbstractC4154l.m8921d(systemService, "null cannot be cast to non-null type android.view.accessibility.AccessibilityManager");
        AccessibilityManager accessibilityManager = (AccessibilityManager) systemService;
        boolean zM8615h = c3966o.m8615h(true) | c3966o.m8615h(true);
        Object objM8596M = c3966o.m8596M();
        k2.s0 s0Var = C3961j.f20408a;
        if (zM8615h || objM8596M == s0Var) {
            objM8596M = new c0();
            c3966o.j0(objM8596M);
        }
        c0 c0Var = (c0) objM8596M;
        InterfaceC1649u interfaceC1649u = (InterfaceC1649u) c3966o.m8618k(AbstractC1967c.f9212a);
        boolean zM8614g = c3966o.m8614g(c0Var) | c3966o.m8616i(accessibilityManager);
        Object objM8596M2 = c3966o.m8596M();
        if (zM8614g || objM8596M2 == s0Var) {
            objM8596M2 = new C0408k(24, c0Var, accessibilityManager);
            c3966o.j0(objM8596M2);
        }
        InterfaceC2139c interfaceC2139c = (InterfaceC2139c) objM8596M2;
        boolean zM8614g2 = c3966o.m8614g(c0Var) | c3966o.m8616i(accessibilityManager);
        Object objM8596M3 = c3966o.m8596M();
        if (zM8614g2 || objM8596M3 == s0Var) {
            objM8596M3 = new C0043b(9, c0Var, accessibilityManager);
            c3966o.j0(objM8596M3);
        }
        m6909a(interfaceC1649u, interfaceC2139c, (InterfaceC2137a) objM8596M3, c3966o, 0);
        return c0Var;
    }
}
