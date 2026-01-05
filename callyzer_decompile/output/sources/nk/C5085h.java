package nk;

import com.google.gson.JsonSyntaxException;
import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;
import java.util.Objects;
import java.util.TimeZone;
import kk.AbstractC4103w;
import mk.AbstractC4771j;
import mm.AbstractC4801l;
import ok.AbstractC5397a;
import rk.C6564a;
import rk.C6566c;
import rk.EnumC6565b;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: nk.h */
/* loaded from: classes.dex */
public final class C5085h extends AbstractC4103w {

    /* renamed from: c */
    public static final C5082e f24921c = new C5082e();

    /* renamed from: a */
    public final AbstractC5084g f24922a;

    /* renamed from: b */
    public final ArrayList f24923b;

    public C5085h(AbstractC5084g abstractC5084g, int i10, int i11) {
        String str;
        String str2;
        ArrayList arrayList = new ArrayList();
        this.f24923b = arrayList;
        Objects.requireNonNull(abstractC5084g);
        this.f24922a = abstractC5084g;
        Locale locale = Locale.US;
        arrayList.add(DateFormat.getDateTimeInstance(i10, i11, locale));
        if (!Locale.getDefault().equals(locale)) {
            arrayList.add(DateFormat.getDateTimeInstance(i10, i11));
        }
        if (AbstractC4771j.f23788a >= 9) {
            StringBuilder sb2 = new StringBuilder();
            if (i10 == 0) {
                str = "EEEE, MMMM d, yyyy";
            } else if (i10 == 1) {
                str = "MMMM d, yyyy";
            } else if (i10 == 2) {
                str = "MMM d, yyyy";
            } else {
                if (i10 != 3) {
                    throw new IllegalArgumentException(AbstractC4801l.m9730d(i10, "Unknown DateFormat style: "));
                }
                str = "M/d/yy";
            }
            sb2.append(str);
            sb2.append(" ");
            if (i11 == 0 || i11 == 1) {
                str2 = "h:mm:ss a z";
            } else if (i11 == 2) {
                str2 = "h:mm:ss a";
            } else {
                if (i11 != 3) {
                    throw new IllegalArgumentException(AbstractC4801l.m9730d(i11, "Unknown DateFormat style: "));
                }
                str2 = "h:mm a";
            }
            sb2.append(str2);
            arrayList.add(new SimpleDateFormat(sb2.toString(), locale));
        }
    }

    @Override // kk.AbstractC4103w
    /* renamed from: b */
    public final Object mo8851b(C6564a c6564a) throws IOException {
        Date dateM11120b;
        if (c6564a.E0() == EnumC6565b.NULL) {
            c6564a.A0();
            return null;
        }
        String strC0 = c6564a.C0();
        synchronized (this.f24923b) {
            try {
                ArrayList arrayList = this.f24923b;
                int size = arrayList.size();
                int i10 = 0;
                while (true) {
                    if (i10 >= size) {
                        try {
                            dateM11120b = AbstractC5397a.m11120b(strC0, new ParsePosition(0));
                            break;
                        } catch (ParseException e2) {
                            StringBuilder sbM7383p = i0.m0.m7383p("Failed parsing '", strC0, "' as Date; at path ");
                            sbM7383p.append(c6564a.mo10022P());
                            throw new JsonSyntaxException(sbM7383p.toString(), e2);
                        }
                    }
                    Object obj = arrayList.get(i10);
                    i10++;
                    DateFormat dateFormat = (DateFormat) obj;
                    TimeZone timeZone = dateFormat.getTimeZone();
                    try {
                        try {
                            dateM11120b = dateFormat.parse(strC0);
                            break;
                        } finally {
                            dateFormat.setTimeZone(timeZone);
                        }
                    } catch (ParseException unused) {
                        dateFormat.setTimeZone(timeZone);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return this.f24922a.mo10016a(dateM11120b);
    }

    @Override // kk.AbstractC4103w
    /* renamed from: c */
    public final void mo8852c(C6566c c6566c, Object obj) throws IOException {
        String str;
        Date date = (Date) obj;
        if (date == null) {
            c6566c.mo10029J();
            return;
        }
        DateFormat dateFormat = (DateFormat) this.f24923b.get(0);
        synchronized (this.f24923b) {
            str = dateFormat.format(date);
        }
        c6566c.v0(str);
    }

    public final String toString() {
        DateFormat dateFormat = (DateFormat) this.f24923b.get(0);
        if (dateFormat instanceof SimpleDateFormat) {
            return "DefaultDateTypeAdapter(" + ((SimpleDateFormat) dateFormat).toPattern() + ')';
        }
        return "DefaultDateTypeAdapter(" + dateFormat.getClass().getSimpleName() + ')';
    }
}
