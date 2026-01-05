package og;

import android.os.LocaleList;
import android.text.Spannable;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.LocaleSpan;
import android.text.style.RelativeSizeSpan;
import gx.AbstractC2747a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;
import n4.C4952a;
import n4.C4953b;
import rw.AbstractC6664n;
import s4.C6759o;
import s4.C6760p;
import s4.InterfaceC6747c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public abstract class jb {

    /* renamed from: a */
    public static final /* synthetic */ int f26565a = 0;

    /* renamed from: a */
    public static final float m10708a(long j6, float f6, InterfaceC6747c interfaceC6747c) {
        float fM12954c;
        long jM12953b = C6759o.m12953b(j6);
        if (C6760p.m12956a(jM12953b, 4294967296L)) {
            if (interfaceC6747c.mo154O() <= 1.05d) {
                return interfaceC6747c.n0(j6);
            }
            fM12954c = C6759o.m12954c(j6) / C6759o.m12954c(interfaceC6747c.mo8432A(f6));
        } else {
            if (!C6760p.m12956a(jM12953b, 8589934592L)) {
                return Float.NaN;
            }
            fM12954c = C6759o.m12954c(j6);
        }
        return fM12954c * f6;
    }

    /* renamed from: b */
    public static final void m10709b(Spannable spannable, long j6, int i10, int i11) {
        if (j6 != 16) {
            spannable.setSpan(new ForegroundColorSpan(d3.h0.m5149u(j6)), i10, i11, 33);
        }
    }

    /* renamed from: c */
    public static final void m10710c(Spannable spannable, long j6, InterfaceC6747c interfaceC6747c, int i10, int i11) {
        long jM12953b = C6759o.m12953b(j6);
        if (C6760p.m12956a(jM12953b, 4294967296L)) {
            spannable.setSpan(new AbsoluteSizeSpan(AbstractC2747a.m6747k(interfaceC6747c.n0(j6)), false), i10, i11, 33);
        } else if (C6760p.m12956a(jM12953b, 8589934592L)) {
            spannable.setSpan(new RelativeSizeSpan(C6759o.m12954c(j6)), i10, i11, 33);
        }
    }

    /* renamed from: d */
    public static final void m10711d(Spannable spannable, C4953b c4953b, int i10, int i11) {
        if (c4953b != null) {
            ArrayList arrayList = new ArrayList(AbstractC6664n.m12768r(c4953b, 10));
            Iterator it = c4953b.f24639a.iterator();
            while (it.hasNext()) {
                arrayList.add(((C4952a) it.next()).f24637a);
            }
            Locale[] localeArr = (Locale[]) arrayList.toArray(new Locale[0]);
            spannable.setSpan(new LocaleSpan(new LocaleList((Locale[]) Arrays.copyOf(localeArr, localeArr.length))), i10, i11, 33);
        }
    }
}
