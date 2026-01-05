package ug;

import java.util.Calendar;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ug.q */
/* loaded from: classes.dex */
public final class C7446q extends t1 {

    /* renamed from: c */
    public long f35759c;

    /* renamed from: d */
    public String f35760d;

    @Override // ug.t1
    /* renamed from: N */
    public final boolean mo13860N() {
        Calendar calendar = Calendar.getInstance();
        this.f35759c = TimeUnit.MINUTES.convert(calendar.get(16) + calendar.get(15), TimeUnit.MILLISECONDS);
        Locale locale = Locale.getDefault();
        String language = locale.getLanguage();
        Locale locale2 = Locale.ENGLISH;
        String lowerCase = language.toLowerCase(locale2);
        String lowerCase2 = locale.getCountry().toLowerCase(locale2);
        this.f35760d = p020v.a1.m14335o(new StringBuilder(String.valueOf(lowerCase).length() + 1 + String.valueOf(lowerCase2).length()), lowerCase, "-", lowerCase2);
        return false;
    }

    /* renamed from: Q */
    public final long m14110Q() {
        m14144O();
        return this.f35759c;
    }

    /* renamed from: R */
    public final String m14111R() {
        m14144O();
        return this.f35760d;
    }
}
