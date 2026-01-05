package p001o;

import android.media.Image;
import android.media.ImageReader;
import android.view.Surface;
import androidx.camera.core.C1891a;
import androidx.camera.core.InterfaceC1893c;
import java.util.concurrent.Executor;
import p001o.zd8;

/* loaded from: classes2.dex */
public class pe0 implements zd8 {

    /* renamed from: a */
    public final ImageReader f39938a;

    /* renamed from: b */
    public final Object f39939b = new Object();

    /* renamed from: c */
    public boolean f39940c = true;

    public pe0(ImageReader imageReader) {
        this.f39938a = imageReader;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: k */
    public /* synthetic */ void m43500k(zd8.InterfaceC18614a interfaceC18614a) {
        interfaceC18614a.mo27818a(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: l */
    public /* synthetic */ void m43501l(Executor executor, final zd8.InterfaceC18614a interfaceC18614a, ImageReader imageReader) {
        synchronized (this.f39939b) {
            if (!this.f39940c) {
                executor.execute(new Runnable() { // from class: o.oe0
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f38178a.m43500k(interfaceC18614a);
                    }
                });
            }
        }
    }

    @Override // p001o.zd8
    /* renamed from: a */
    public Surface mo4668a() {
        Surface surface;
        synchronized (this.f39939b) {
            surface = this.f39938a.getSurface();
        }
        return surface;
    }

    @Override // p001o.zd8
    /* renamed from: c */
    public InterfaceC1893c mo4669c() {
        Image imageAcquireLatestImage;
        synchronized (this.f39939b) {
            try {
                imageAcquireLatestImage = this.f39938a.acquireLatestImage();
            } catch (RuntimeException e) {
                if (!m43502j(e)) {
                    throw e;
                }
                imageAcquireLatestImage = null;
            }
            if (imageAcquireLatestImage == null) {
                return null;
            }
            return new C1891a(imageAcquireLatestImage);
        }
    }

    @Override // p001o.zd8
    public void close() {
        synchronized (this.f39939b) {
            this.f39938a.close();
        }
    }

    @Override // p001o.zd8
    /* renamed from: d */
    public int mo4670d() {
        int imageFormat;
        synchronized (this.f39939b) {
            imageFormat = this.f39938a.getImageFormat();
        }
        return imageFormat;
    }

    @Override // p001o.zd8
    /* renamed from: e */
    public void mo4671e() {
        synchronized (this.f39939b) {
            this.f39940c = true;
            this.f39938a.setOnImageAvailableListener(null, null);
        }
    }

    @Override // p001o.zd8
    /* renamed from: f */
    public int mo4672f() {
        int maxImages;
        synchronized (this.f39939b) {
            maxImages = this.f39938a.getMaxImages();
        }
        return maxImages;
    }

    @Override // p001o.zd8
    /* renamed from: g */
    public void mo4673g(final zd8.InterfaceC18614a interfaceC18614a, final Executor executor) {
        synchronized (this.f39939b) {
            this.f39940c = false;
            this.f39938a.setOnImageAvailableListener(new ImageReader.OnImageAvailableListener() { // from class: o.ne0
                @Override // android.media.ImageReader.OnImageAvailableListener
                public final void onImageAvailable(ImageReader imageReader) {
                    this.f36736a.m43501l(executor, interfaceC18614a, imageReader);
                }
            }, mpa.m39497a());
        }
    }

    @Override // p001o.zd8
    public int getHeight() {
        int height;
        synchronized (this.f39939b) {
            height = this.f39938a.getHeight();
        }
        return height;
    }

    @Override // p001o.zd8
    public int getWidth() {
        int width;
        synchronized (this.f39939b) {
            width = this.f39938a.getWidth();
        }
        return width;
    }

    @Override // p001o.zd8
    /* renamed from: h */
    public InterfaceC1893c mo4674h() {
        Image imageAcquireNextImage;
        synchronized (this.f39939b) {
            try {
                imageAcquireNextImage = this.f39938a.acquireNextImage();
            } catch (RuntimeException e) {
                if (!m43502j(e)) {
                    throw e;
                }
                imageAcquireNextImage = null;
            }
            if (imageAcquireNextImage == null) {
                return null;
            }
            return new C1891a(imageAcquireNextImage);
        }
    }

    /* renamed from: j */
    public final boolean m43502j(RuntimeException runtimeException) {
        return "ImageReaderContext is not initialized".equals(runtimeException.getMessage());
    }
}
