package nk;

import java.io.IOException;
import java.util.Calendar;
import java.util.GregorianCalendar;
import kk.AbstractC4103w;
import rk.C6564a;
import rk.C6566c;
import rk.EnumC6565b;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public class z0 extends AbstractC4103w {
    @Override // kk.AbstractC4103w
    /* renamed from: b */
    public final Object mo8851b(C6564a c6564a) throws IOException, NumberFormatException {
        int iO0;
        if (c6564a.E0() == EnumC6565b.NULL) {
            c6564a.A0();
            return null;
        }
        c6564a.mo10025j();
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        while (c6564a.E0() != EnumC6565b.END_OBJECT) {
            String strV0 = c6564a.v0();
            iO0 = c6564a.o0();
            strV0.getClass();
            switch (strV0) {
                case "dayOfMonth":
                    i12 = iO0;
                    break;
                case "minute":
                    i14 = iO0;
                    break;
                case "second":
                    i15 = iO0;
                    break;
                case "year":
                    i10 = iO0;
                    break;
                case "month":
                    i11 = iO0;
                    break;
                case "hourOfDay":
                    i13 = iO0;
                    break;
            }
        }
        c6564a.mo10027z();
        return new GregorianCalendar(i10, i11, i12, i13, i14, i15);
    }

    @Override // kk.AbstractC4103w
    /* renamed from: c */
    public final void mo8852c(C6566c c6566c, Object obj) throws IOException {
        if (((Calendar) obj) == null) {
            c6566c.mo10029J();
            return;
        }
        c6566c.mo10031n();
        c6566c.mo10028A("year");
        c6566c.f0(r4.get(1));
        c6566c.mo10028A("month");
        c6566c.f0(r4.get(2));
        c6566c.mo10028A("dayOfMonth");
        c6566c.f0(r4.get(5));
        c6566c.mo10028A("hourOfDay");
        c6566c.f0(r4.get(11));
        c6566c.mo10028A("minute");
        c6566c.f0(r4.get(12));
        c6566c.mo10028A("second");
        c6566c.f0(r4.get(13));
        c6566c.mo10033z();
    }
}
