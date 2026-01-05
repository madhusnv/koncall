package ki;

import android.text.TextUtils;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import ni.C5072a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ki.a */
/* loaded from: classes.dex */
public final class C4078a {

    /* renamed from: g */
    public static final String[] f20951g = {"experimentId", "experimentStartTime", "timeToLiveMillis", "triggerTimeoutMillis", "variantId"};

    /* renamed from: h */
    public static final SimpleDateFormat f20952h = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", Locale.US);

    /* renamed from: a */
    public final String f20953a;

    /* renamed from: b */
    public final String f20954b;

    /* renamed from: c */
    public final String f20955c;

    /* renamed from: d */
    public final Date f20956d;

    /* renamed from: e */
    public final long f20957e;

    /* renamed from: f */
    public final long f20958f;

    public C4078a(String str, String str2, String str3, Date date, long j6, long j10) {
        this.f20953a = str;
        this.f20954b = str2;
        this.f20955c = str3;
        this.f20956d = date;
        this.f20957e = j6;
        this.f20958f = j10;
    }

    /* renamed from: a */
    public final C5072a m8846a() {
        C5072a c5072a = new C5072a();
        c5072a.f24868a = "frc";
        c5072a.f24880m = this.f20956d.getTime();
        c5072a.f24869b = this.f20953a;
        c5072a.f24870c = this.f20954b;
        String str = this.f20955c;
        if (TextUtils.isEmpty(str)) {
            str = null;
        }
        c5072a.f24871d = str;
        c5072a.f24872e = this.f20957e;
        c5072a.f24877j = this.f20958f;
        return c5072a;
    }
}
