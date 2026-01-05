package q5;

import android.app.PendingIntent;
import android.os.Bundle;
import androidx.core.graphics.drawable.IconCompat;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: q5.e */
/* loaded from: classes.dex */
public final class C6112e {

    /* renamed from: a */
    public final Bundle f29819a;

    /* renamed from: b */
    public IconCompat f29820b;

    /* renamed from: c */
    public final boolean f29821c;

    /* renamed from: d */
    public final boolean f29822d;

    /* renamed from: e */
    public final int f29823e;

    /* renamed from: f */
    public final CharSequence f29824f;

    /* renamed from: g */
    public final PendingIntent f29825g;

    public C6112e(int i10, CharSequence charSequence, PendingIntent pendingIntent) {
        IconCompat iconCompatM758b = i10 == 0 ? null : IconCompat.m758b(i10);
        Bundle bundle = new Bundle();
        this.f29822d = true;
        this.f29820b = iconCompatM758b;
        if (iconCompatM758b != null && iconCompatM758b.m760d() == 2) {
            this.f29823e = iconCompatM758b.m759c();
        }
        this.f29824f = C6118k.m12150b(charSequence);
        this.f29825g = pendingIntent;
        this.f29819a = bundle;
        this.f29821c = true;
        this.f29822d = true;
    }
}
