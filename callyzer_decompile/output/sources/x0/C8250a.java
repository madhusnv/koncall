package x0;

import android.media.ImageWriter;
import android.os.Build;
import android.util.Size;
import android.view.Surface;
import androidx.camera.extensions.internal.compat.quirk.CaptureOutputSurfaceOccupiedQuirk;
import b9.AbstractC0630b;
import com.google.android.gms.internal.measurement.j4;
import og.t1;
import og.u1;
import p020v.b0;
import pg.t8;
import w0.AbstractC7856a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: x0.a */
/* loaded from: classes.dex */
public final class C8250a {

    /* renamed from: b */
    public final ImageWriter f39397b;

    /* renamed from: c */
    public final j4 f39398c;

    /* renamed from: e */
    public final Surface f39400e;

    /* renamed from: f */
    public final boolean f39401f;

    /* renamed from: g */
    public final boolean f39402g;

    /* renamed from: a */
    public final Object f39396a = new Object();

    /* renamed from: d */
    public boolean f39399d = false;

    /* renamed from: h */
    public long f39403h = -1;

    public C8250a(Surface surface, Size size, boolean z6) {
        this.f39402g = z6;
        boolean z10 = AbstractC7856a.f37628a.m5729g(CaptureOutputSurfaceOccupiedQuirk.class) != null || z6;
        this.f39401f = z10;
        if (Build.VERSION.SDK_INT < 29 || !z10) {
            this.f39400e = surface;
            this.f39398c = null;
            this.f39397b = null;
        } else {
            u1.m10942a("CaptureOutputSurface");
            j4 j4VarM10923c = t1.m10923c(size.getWidth(), size.getHeight(), 35, 2);
            this.f39398c = j4VarM10923c;
            this.f39400e = j4VarM10923c.getSurface();
            this.f39397b = AbstractC0630b.m1796e(surface);
            j4VarM10923c.mo1871a(new b0(9, this), t8.m11872a());
        }
    }
}
