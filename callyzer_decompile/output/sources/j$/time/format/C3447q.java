package j$.time.format;

import j$.time.chrono.Chronology;
import j$.time.chrono.InterfaceC3411j;
import j$.time.chrono.IsoChronology;
import j$.time.temporal.AbstractC3483m;
import j$.time.temporal.ChronoField;
import j$.time.temporal.TemporalField;
import java.util.Iterator;
import java.util.Map;

/* renamed from: j$.time.format.q */
/* loaded from: classes2.dex */
public final class C3447q implements InterfaceC3435e {

    /* renamed from: a */
    public final TemporalField f18187a;

    /* renamed from: b */
    public final TextStyle f18188b;

    /* renamed from: c */
    public final C3456z f18189c;

    /* renamed from: d */
    public volatile C3439i f18190d;

    public C3447q(TemporalField temporalField, TextStyle textStyle, C3456z c3456z) {
        this.f18187a = temporalField;
        this.f18188b = textStyle;
        this.f18189c = c3456z;
    }

    @Override // j$.time.format.InterfaceC3435e
    /* renamed from: t */
    public final boolean mo7963t(C3453w c3453w, StringBuilder sb2) {
        String strMo7951c;
        Long lM7991a = c3453w.m7991a(this.f18187a);
        DateTimeFormatter dateTimeFormatter = c3453w.f18212b;
        if (lM7991a == null) {
            return false;
        }
        Chronology chronology = (Chronology) c3453w.f18211a.mo7808d(AbstractC3483m.f18278b);
        if (chronology == null || chronology == IsoChronology.INSTANCE) {
            strMo7951c = this.f18189c.mo7951c(this.f18187a, lM7991a.longValue(), this.f18188b, dateTimeFormatter.f18112b);
        } else {
            strMo7951c = this.f18189c.mo7950b(chronology, this.f18187a, lM7991a.longValue(), this.f18188b, dateTimeFormatter.f18112b);
        }
        if (strMo7951c != null) {
            sb2.append(strMo7951c);
            return true;
        }
        if (this.f18190d == null) {
            this.f18190d = new C3439i(this.f18187a, 1, 19, SignStyle.NORMAL);
        }
        return this.f18190d.mo7963t(c3453w, sb2);
    }

    @Override // j$.time.format.InterfaceC3435e
    /* renamed from: C */
    public final int mo7962C(C3451u c3451u, CharSequence charSequence, int i10) {
        Iterator itMo7953e;
        C3456z c3456z = this.f18189c;
        TemporalField temporalField = this.f18187a;
        int length = charSequence.length();
        if (i10 >= 0 && i10 <= length) {
            boolean z6 = c3451u.f18204c;
            DateTimeFormatter dateTimeFormatter = c3451u.f18202a;
            TextStyle textStyle = z6 ? this.f18188b : null;
            Chronology chronology = c3451u.m7986c().f18138c;
            if (chronology == null && (chronology = c3451u.f18202a.f18115e) == null) {
                chronology = IsoChronology.INSTANCE;
            }
            Chronology chronology2 = chronology;
            if (chronology2 == null || chronology2 == IsoChronology.INSTANCE) {
                itMo7953e = c3456z.mo7953e(temporalField, textStyle, dateTimeFormatter.f18112b);
            } else {
                itMo7953e = c3456z.mo7952d(chronology2, temporalField, textStyle, dateTimeFormatter.f18112b);
            }
            Iterator it = itMo7953e;
            if (it != null) {
                while (it.hasNext()) {
                    Map.Entry entry = (Map.Entry) it.next();
                    String str = (String) entry.getKey();
                    if (c3451u.m7990g(str, 0, charSequence, i10, str.length())) {
                        return c3451u.m7989f(this.f18187a, ((Long) entry.getValue()).longValue(), i10, str.length() + i10);
                    }
                }
                if (temporalField == ChronoField.ERA && !c3451u.f18204c) {
                    Iterator it2 = chronology2.mo7892B().iterator();
                    while (it2.hasNext()) {
                        String string = ((InterfaceC3411j) it2.next()).toString();
                        if (c3451u.m7990g(string, 0, charSequence, i10, string.length())) {
                            return c3451u.m7989f(this.f18187a, r7.getValue(), i10, string.length() + i10);
                        }
                    }
                }
                if (c3451u.f18204c) {
                    return ~i10;
                }
            }
            if (this.f18190d == null) {
                this.f18190d = new C3439i(this.f18187a, 1, 19, SignStyle.NORMAL);
            }
            return this.f18190d.mo7962C(c3451u, charSequence, i10);
        }
        throw new IndexOutOfBoundsException();
    }

    public final String toString() {
        TextStyle textStyle = TextStyle.FULL;
        TemporalField temporalField = this.f18187a;
        TextStyle textStyle2 = this.f18188b;
        if (textStyle2 == textStyle) {
            return "Text(" + temporalField + ")";
        }
        return "Text(" + temporalField + "," + textStyle2 + ")";
    }
}
