package hl;

import android.graphics.Bitmap;
import android.media.Image;
import sf.AbstractC6840z;
import zj.C8986c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: hl.a */
/* loaded from: classes.dex */
public final class C2964a {

    /* renamed from: a */
    public volatile Bitmap f16023a;

    /* renamed from: b */
    public volatile C8986c f16024b;

    /* renamed from: c */
    public final int f16025c;

    /* renamed from: d */
    public final int f16026d;

    /* renamed from: e */
    public final int f16027e;

    /* renamed from: f */
    public final int f16028f;

    public C2964a(Bitmap bitmap) {
        AbstractC6840z.m13036g(bitmap);
        this.f16023a = bitmap;
        this.f16025c = bitmap.getWidth();
        this.f16026d = bitmap.getHeight();
        m7244b(0);
        this.f16027e = 0;
        this.f16028f = -1;
    }

    /* renamed from: b */
    public static void m7244b(int i10) {
        boolean z6 = true;
        if (i10 != 0 && i10 != 90 && i10 != 180 && i10 != 270) {
            z6 = false;
        }
        AbstractC6840z.m13030a("Invalid rotation. Only 0, 90, 180, 270 are supported currently.", z6);
    }

    /* renamed from: a */
    public final Image.Plane[] m7245a() {
        if (this.f16024b == null) {
            return null;
        }
        return ((Image) this.f16024b.f43336b).getPlanes();
    }

    public C2964a(Image image, int i10, int i11, int i12) {
        this.f16024b = new C8986c(20, image);
        this.f16025c = i10;
        this.f16026d = i11;
        m7244b(i12);
        this.f16027e = i12;
        this.f16028f = 35;
    }
}
