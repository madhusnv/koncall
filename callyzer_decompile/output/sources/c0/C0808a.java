package c0;

import android.graphics.Matrix;
import android.media.Image;
import i0.r2;
import zk.C8989c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: c0.a */
/* loaded from: classes.dex */
public final class C0808a implements b1 {

    /* renamed from: a */
    public final Image f5031a;

    /* renamed from: b */
    public final C8989c[] f5032b;

    /* renamed from: c */
    public final C0813f f5033c;

    public C0808a(Image image) {
        this.f5031a = image;
        Image.Plane[] planes = image.getPlanes();
        if (planes != null) {
            this.f5032b = new C8989c[planes.length];
            for (int i10 = 0; i10 < planes.length; i10++) {
                this.f5032b[i10] = new C8989c(4, planes[i10]);
            }
        } else {
            this.f5032b = new C8989c[0];
        }
        this.f5033c = new C0813f(r2.f16576b, image.getTimestamp(), 0, new Matrix(), 0);
    }

    @Override // c0.b1
    /* renamed from: X */
    public final w0 mo2135X() {
        return this.f5033c;
    }

    @Override // c0.b1
    /* renamed from: b */
    public final int mo2136b() {
        return this.f5031a.getWidth();
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.f5031a.close();
    }

    @Override // c0.b1
    public final Image e0() {
        return this.f5031a;
    }

    @Override // c0.b1
    public final int getFormat() {
        return this.f5031a.getFormat();
    }

    @Override // c0.b1
    public final int getHeight() {
        return this.f5031a.getHeight();
    }

    @Override // c0.b1
    /* renamed from: l */
    public final a1[] mo2137l() {
        return this.f5032b;
    }
}
