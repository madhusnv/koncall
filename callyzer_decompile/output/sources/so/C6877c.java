package so;

import a2.AbstractC0030c;
import com.google.i18n.phonenumbers.C1404a;
import com.google.i18n.phonenumbers.NumberParseException;
import im.AbstractC3322x;
import java.util.Locale;
import java.util.logging.Logger;
import kn.C4126f;
import kotlin.jvm.internal.AbstractC4154l;
import od.C5338b;
import og.nd;
import pg.u6;
import qw.C6366p;
import sk.C6863k;
import sk.EnumC6855c;
import sk.EnumC6862j;
import ww.AbstractC8193c;
import xm.y5;
import yv.C8791f;
import yv.C8805t;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: so.c */
/* loaded from: classes3.dex */
public final class C6877c {

    /* renamed from: a */
    public final y5 f32695a;

    /* renamed from: b */
    public final C8805t f32696b;

    /* renamed from: c */
    public final C6366p f32697c;

    public C6877c(y5 userSIMRepository, C8805t c8805t) {
        AbstractC4154l.m8923f(userSIMRepository, "userSIMRepository");
        this.f32695a = userSIMRepository;
        this.f32696b = c8805t;
        this.f32697c = nd.m10782c(new C5338b(20));
    }

    /* renamed from: d */
    public static /* synthetic */ Object m13064d(C6877c c6877c, String str, String str2, boolean z6, AbstractC8193c abstractC8193c, int i10) {
        boolean z10;
        C6877c c6877c2;
        String str3;
        AbstractC8193c abstractC8193c2;
        if ((i10 & 2) != 0) {
            str2 = "";
        }
        String str4 = str2;
        boolean z11 = (i10 & 4) != 0;
        if ((i10 & 8) != 0) {
            z10 = false;
            str3 = str;
            abstractC8193c2 = abstractC8193c;
            c6877c2 = c6877c;
        } else {
            z10 = z6;
            c6877c2 = c6877c;
            str3 = str;
            abstractC8193c2 = abstractC8193c;
        }
        return c6877c2.m13067c(str3, str4, z11, z10, abstractC8193c2);
    }

    /* renamed from: a */
    public final C4126f m13065a(String str, int i10, String str2, String str3) throws NumberFormatException {
        EnumC6862j enumC6862j = EnumC6862j.FROM_NUMBER_WITH_PLUS_SIGN;
        long j6 = Long.parseLong(str);
        m13066b();
        EnumC6855c enumC6855c = EnumC6855c.E164;
        StringBuilder sb2 = new StringBuilder(20);
        sb2.setLength(0);
        StringBuilder sb3 = new StringBuilder();
        sb3.append(j6);
        sb2.append(sb3.toString());
        Logger logger = C1404a.f7185h;
        int iOrdinal = enumC6855c.ordinal();
        if (iOrdinal == 0) {
            sb2.insert(0, i10).insert(0, '+');
        } else if (iOrdinal == 1) {
            sb2.insert(0, " ").insert(0, i10).insert(0, '+');
        } else if (iOrdinal == 3) {
            sb2.insert(0, "-").insert(0, i10).insert(0, '+').insert(0, "tel:");
        }
        String string = sb2.toString();
        C8791f c8791f = C8791f.f42457a;
        if (!C8791f.m16171d(string)) {
            return null;
        }
        try {
            AbstractC4154l.m8920c(string);
            C6863k c6863kM13069f = m13069f(string, str3, true);
            if (!u6.m11881b(c6863kM13069f)) {
                return null;
            }
            AbstractC4154l.m8920c(c6863kM13069f);
            return m13068e(c6863kM13069f);
        } catch (NumberParseException e2) {
            StringBuilder sb4 = new StringBuilder(">>>>>>>>>> Valid Number Exception <<<<<<<<<<<<<\n number to validate:=");
            sb4.append(str2);
            sb4.append(" >>> countryCode :=");
            sb4.append(i10);
            NumberParseException.EnumC1403a enumC1403a = NumberParseException.EnumC1403a.INVALID_COUNTRY_CODE;
            C8805t c8805t = this.f32696b;
            NumberParseException.EnumC1403a enumC1403a2 = e2.f7183a;
            if (enumC1403a2 != enumC1403a) {
                sb4.append("ErrorType :=");
                int i11 = enumC1403a2 == null ? -1 : AbstractC6875a.f32688a[enumC1403a2.ordinal()];
                if (i11 == 1) {
                    sb4.append("Not Valid Number");
                } else if (i11 == 2 || i11 == 3) {
                    sb4.append("number is too short");
                } else if (i11 != 4) {
                    sb4.append("undefined error or other type");
                } else {
                    sb4.append("number is too long");
                }
            } else {
                c8805t.m16235j(e2);
            }
            String string2 = sb4.toString();
            AbstractC4154l.m8922e(string2, "toString(...)");
            c8805t.m16238m(string2, e2);
            return null;
        }
    }

    /* renamed from: b */
    public final C1404a m13066b() {
        Object value = this.f32697c.getValue();
        AbstractC4154l.m8922e(value, "getValue(...)");
        return (C1404a) value;
    }

    /* JADX WARN: Removed duplicated region for block: B:76:0x0160 A[Catch: NumberFormatException -> 0x0125, TryCatch #0 {NumberFormatException -> 0x0125, blocks: (B:49:0x00d7, B:51:0x00df, B:53:0x00e9, B:55:0x00fb, B:58:0x0102, B:60:0x010a, B:63:0x0113, B:65:0x011d, B:69:0x0129, B:71:0x0133, B:73:0x0139, B:76:0x0160, B:78:0x016d, B:79:0x0190), top: B:83:0x00d7 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m13067c(java.lang.String r14, java.lang.String r15, boolean r16, boolean r17, ww.AbstractC8193c r18) throws com.google.i18n.phonenumbers.NumberParseException {
        /*
            Method dump skipped, instructions count: 458
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: so.C6877c.m13067c(java.lang.String, java.lang.String, boolean, boolean, ww.c):java.lang.Object");
    }

    /* renamed from: e */
    public final C4126f m13068e(C6863k c6863k) {
        String strValueOf;
        if (AbstractC3322x.f17591c.contains(String.valueOf(c6863k.f32610a))) {
            m13066b();
            strValueOf = C1404a.m4500h(c6863k);
            AbstractC4154l.m8922e(strValueOf, "getNationalSignificantNumber(...)");
        } else {
            strValueOf = String.valueOf(c6863k.f32611b);
        }
        return new C4126f(strValueOf, c6863k.f32610a);
    }

    /* renamed from: f */
    public final C6863k m13069f(String str, String str2, boolean z6) throws NumberParseException {
        try {
            return m13066b().m4517t(str, str2);
        } catch (NumberParseException e2) {
            if (z6) {
                throw e2;
            }
            return null;
        } catch (Exception e10) {
            e10.printStackTrace();
            String country = Locale.getDefault().getCountry();
            StringBuilder sbM127r = AbstractC0030c.m127r("Passed phone number := ", str, " , countryRegion := ", str2, " ,defaultCountry := ");
            sbM127r.append(country);
            this.f32696b.m16239n(sbM127r.toString(), e10);
            return null;
        }
    }
}
