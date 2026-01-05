package p001o;

import android.os.Bundle;

/* loaded from: classes2.dex */
public abstract class iad extends Exception {

    /* renamed from: d */
    public static final String f28340d = sqi.B0(0);

    /* renamed from: e */
    public static final String f28341e = sqi.B0(1);

    /* renamed from: f */
    public static final String f28342f = sqi.B0(2);

    /* renamed from: g */
    public static final String f28343g = sqi.B0(3);

    /* renamed from: h */
    public static final String f28344h = sqi.B0(4);

    /* renamed from: q */
    public static final String f28345q = sqi.B0(5);

    /* renamed from: a */
    public final int f28346a;

    /* renamed from: b */
    public final long f28347b;

    /* renamed from: c */
    public final Bundle f28348c;

    public iad(String str, Throwable th, int i, Bundle bundle, long j) {
        super(str, th);
        this.f28346a = i;
        this.f28348c = bundle;
        this.f28347b = j;
    }
}
