package j$.time.format;

import j$.time.temporal.AbstractC3483m;
import j$.time.zone.C3498i;
import java.lang.ref.SoftReference;
import java.text.DateFormatSymbols;
import java.util.AbstractMap;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: j$.time.format.t */
/* loaded from: classes2.dex */
public final class C3450t extends C3449s {

    /* renamed from: i */
    public static final Map f18197i = new ConcurrentHashMap();

    /* renamed from: e */
    public final TextStyle f18198e;

    /* renamed from: f */
    public final boolean f18199f;

    /* renamed from: g */
    public final Map f18200g;

    /* renamed from: h */
    public final Map f18201h;

    public C3450t(TextStyle textStyle, boolean z6) {
        super(AbstractC3483m.f18281e, "ZoneText(" + textStyle + ")");
        this.f18200g = new HashMap();
        this.f18201h = new HashMap();
        Objects.requireNonNull(textStyle, "textStyle");
        this.f18198e = textStyle;
        this.f18199f = z6;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00f4  */
    @Override // j$.time.format.C3449s, j$.time.format.InterfaceC3435e
    /* renamed from: t */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean mo7963t(j$.time.format.C3453w r14, java.lang.StringBuilder r15) {
        /*
            Method dump skipped, instructions count: 249
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.time.format.C3450t.mo7963t(j$.time.format.w, java.lang.StringBuilder):boolean");
    }

    @Override // j$.time.format.C3449s
    /* renamed from: a */
    public final C3443m mo7983a(C3451u c3451u) {
        C3443m c3443m;
        if (this.f18198e == TextStyle.NARROW) {
            return super.mo7983a(c3451u);
        }
        Locale locale = c3451u.f18202a.f18112b;
        boolean z6 = c3451u.f18203b;
        Set set = C3498i.f18337d;
        int size = set.size();
        Map map = z6 ? this.f18200g : this.f18201h;
        Map.Entry entry = (Map.Entry) map.get(locale);
        if (entry != null && ((Integer) entry.getKey()).intValue() == size && (c3443m = (C3443m) ((SoftReference) entry.getValue()).get()) != null) {
            return c3443m;
        }
        C3443m c3443m2 = c3451u.f18203b ? new C3443m("", null, null) : new C3442l("", null, null);
        for (String[] strArr : DateFormatSymbols.getInstance(locale).getZoneStrings()) {
            String str = strArr[0];
            if (set.contains(str)) {
                c3443m2.m7979a(str, str);
                HashMap map2 = (HashMap) c0.f18150d;
                String str2 = (String) map2.get(str);
                if (str2 == null) {
                    HashMap map3 = (HashMap) c0.f18153g;
                    if (map3.containsKey(str)) {
                        str = (String) map3.get(str);
                        str2 = (String) map2.get(str);
                    }
                }
                if (str2 != null) {
                    Map map4 = (Map) ((HashMap) c0.f18152f).get(str2);
                    str = (map4 == null || !map4.containsKey(locale.getCountry())) ? (String) ((HashMap) c0.f18151e).get(str2) : (String) map4.get(locale.getCountry());
                }
                HashMap map5 = (HashMap) c0.f18153g;
                if (map5.containsKey(str)) {
                    str = (String) map5.get(str);
                }
                for (int i10 = this.f18198e == TextStyle.FULL ? 1 : 2; i10 < strArr.length; i10 += 2) {
                    c3443m2.m7979a(strArr[i10], str);
                }
            }
        }
        map.put(locale, new AbstractMap.SimpleImmutableEntry(Integer.valueOf(size), new SoftReference(c3443m2)));
        return c3443m2;
    }
}
