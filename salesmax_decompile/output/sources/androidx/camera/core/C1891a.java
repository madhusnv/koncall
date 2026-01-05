package androidx.camera.core;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.media.Image;
import androidx.camera.core.InterfaceC1893c;
import java.nio.ByteBuffer;
import p001o.jd8;
import p001o.lf8;
import p001o.wig;

/* renamed from: androidx.camera.core.a */
/* loaded from: classes2.dex */
public final class C1891a implements InterfaceC1893c {

    /* renamed from: a */
    public final Image f6091a;

    /* renamed from: b */
    public final a[] f6092b;

    /* renamed from: c */
    public final jd8 f6093c;

    /* renamed from: androidx.camera.core.a$a */
    public static final class a implements InterfaceC1893c.a {

        /* renamed from: a */
        public final Image.Plane f6094a;

        public a(Image.Plane plane) {
            this.f6094a = plane;
        }

        @Override // androidx.camera.core.InterfaceC1893c.a
        /* renamed from: a */
        public int mo4658a() {
            return this.f6094a.getRowStride();
        }

        @Override // androidx.camera.core.InterfaceC1893c.a
        /* renamed from: b */
        public int mo4659b() {
            return this.f6094a.getPixelStride();
        }

        @Override // androidx.camera.core.InterfaceC1893c.a
        public ByteBuffer getBuffer() {
            return this.f6094a.getBuffer();
        }
    }

    public C1891a(Image image) {
        this.f6091a = image;
        Image.Plane[] planes = image.getPlanes();
        if (planes != null) {
            this.f6092b = new a[planes.length];
            for (int i = 0; i < planes.length; i++) {
                this.f6092b[i] = new a(planes[i]);
            }
        } else {
            this.f6092b = new a[0];
        }
        this.f6093c = lf8.m37118c(wig.m54615b(), image.getTimestamp(), 0, new Matrix());
    }

    @Override // androidx.camera.core.InterfaceC1893c
    public void C0(Rect rect) {
        this.f6091a.setCropRect(rect);
    }

    @Override // androidx.camera.core.InterfaceC1893c
    public Image J2() {
        return this.f6091a;
    }

    @Override // androidx.camera.core.InterfaceC1893c, java.lang.AutoCloseable
    public void close() {
        this.f6091a.close();
    }

    @Override // androidx.camera.core.InterfaceC1893c
    public int getHeight() {
        return this.f6091a.getHeight();
    }

    @Override // androidx.camera.core.InterfaceC1893c
    public int getWidth() {
        return this.f6091a.getWidth();
    }

    @Override // androidx.camera.core.InterfaceC1893c
    /* renamed from: l */
    public int mo4657l() {
        return this.f6091a.getFormat();
    }

    @Override // androidx.camera.core.InterfaceC1893c
    public InterfaceC1893c.a[] u1() {
        return this.f6092b;
    }

    @Override // androidx.camera.core.InterfaceC1893c
    public jd8 y2() {
        return this.f6093c;
    }
}
