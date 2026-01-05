package p001o;

import android.app.PendingIntent;
import java.util.Map;

/* loaded from: classes3.dex */
public class bn0 {

    /* renamed from: a */
    public final String f16542a;

    /* renamed from: b */
    public final int f16543b;

    /* renamed from: c */
    public final int f16544c;

    /* renamed from: d */
    public final int f16545d;

    /* renamed from: e */
    public final Integer f16546e;

    /* renamed from: f */
    public final int f16547f;

    /* renamed from: g */
    public final long f16548g;

    /* renamed from: h */
    public final long f16549h;

    /* renamed from: i */
    public final long f16550i;

    /* renamed from: j */
    public final long f16551j;

    /* renamed from: k */
    public final PendingIntent f16552k;

    /* renamed from: l */
    public final PendingIntent f16553l;

    /* renamed from: m */
    public final PendingIntent f16554m;

    /* renamed from: n */
    public final PendingIntent f16555n;

    /* renamed from: o */
    public final Map f16556o;

    /* renamed from: p */
    public boolean f16557p = false;

    public bn0(String str, int i, int i2, int i3, Integer num, int i4, long j, long j2, long j3, long j4, PendingIntent pendingIntent, PendingIntent pendingIntent2, PendingIntent pendingIntent3, PendingIntent pendingIntent4, Map map) {
        this.f16542a = str;
        this.f16543b = i;
        this.f16544c = i2;
        this.f16545d = i3;
        this.f16546e = num;
        this.f16547f = i4;
        this.f16548g = j;
        this.f16549h = j2;
        this.f16550i = j3;
        this.f16551j = j4;
        this.f16552k = pendingIntent;
        this.f16553l = pendingIntent2;
        this.f16554m = pendingIntent3;
        this.f16555n = pendingIntent4;
        this.f16556o = map;
    }

    /* renamed from: e */
    public static bn0 m19393e(String str, int i, int i2, int i3, Integer num, int i4, long j, long j2, long j3, long j4, PendingIntent pendingIntent, PendingIntent pendingIntent2, PendingIntent pendingIntent3, PendingIntent pendingIntent4, Map map) {
        return new bn0(str, i, i2, i3, num, i4, j, j2, j3, j4, pendingIntent, pendingIntent2, pendingIntent3, pendingIntent4, map);
    }

    /* renamed from: a */
    public boolean m19394a(int i) {
        return m19397d(en0.m25342c(i)) != null;
    }

    /* renamed from: b */
    public boolean m19395b(en0 en0Var) {
        return m19397d(en0Var) != null;
    }

    /* renamed from: c */
    public int m19396c() {
        return this.f16544c;
    }

    /* renamed from: d */
    public final PendingIntent m19397d(en0 en0Var) {
        if (en0Var.mo25345b() == 0) {
            PendingIntent pendingIntent = this.f16553l;
            if (pendingIntent != null) {
                return pendingIntent;
            }
            if (m19400h(en0Var)) {
                return this.f16555n;
            }
            return null;
        }
        if (en0Var.mo25345b() == 1) {
            PendingIntent pendingIntent2 = this.f16552k;
            if (pendingIntent2 != null) {
                return pendingIntent2;
            }
            if (m19400h(en0Var)) {
                return this.f16554m;
            }
        }
        return null;
    }

    /* renamed from: f */
    public final void m19398f() {
        this.f16557p = true;
    }

    /* renamed from: g */
    public final boolean m19399g() {
        return this.f16557p;
    }

    /* renamed from: h */
    public final boolean m19400h(en0 en0Var) {
        return en0Var.mo25344a() && this.f16550i <= this.f16551j;
    }
}
