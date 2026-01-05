package androidx.media3.exoplayer.image;

import android.graphics.Bitmap;

/* loaded from: classes2.dex */
public interface ImageOutput {

    /* renamed from: a */
    public static final ImageOutput f8420a = new C2212a();

    /* renamed from: androidx.media3.exoplayer.image.ImageOutput$a */
    public class C2212a implements ImageOutput {
        @Override // androidx.media3.exoplayer.image.ImageOutput
        /* renamed from: a */
        public void mo7266a() {
        }

        @Override // androidx.media3.exoplayer.image.ImageOutput
        public void onImageAvailable(long j, Bitmap bitmap) {
        }
    }

    /* renamed from: a */
    void mo7266a();

    void onImageAvailable(long j, Bitmap bitmap);
}
