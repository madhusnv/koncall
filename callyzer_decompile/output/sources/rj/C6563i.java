package rj;

import android.text.TextUtils;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import sj.C6850b;
import ug.C7455z;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: rj.i */
/* loaded from: classes.dex */
public final class C6563i {

    /* renamed from: b */
    public static final long f31419b = TimeUnit.HOURS.toSeconds(1);

    /* renamed from: c */
    public static final Pattern f31420c = Pattern.compile("\\AA[\\w-]{38}\\z");

    /* renamed from: d */
    public static C6563i f31421d;

    /* renamed from: a */
    public final C7455z f31422a;

    public C6563i(C7455z c7455z) {
        this.f31422a = c7455z;
    }

    /* renamed from: a */
    public final boolean m12575a(C6850b c6850b) {
        if (TextUtils.isEmpty(c6850b.f32524c)) {
            return true;
        }
        long j6 = c6850b.f32527f + c6850b.f32526e;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        this.f31422a.getClass();
        return j6 < timeUnit.toSeconds(System.currentTimeMillis()) + f31419b;
    }
}
