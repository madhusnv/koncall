package p001o;

import android.graphics.ColorSpace;
import android.graphics.ImageDecoder;
import android.graphics.ImageDecoder$OnHeaderDecodedListener;
import android.graphics.ImageDecoder$OnPartialImageListener;
import android.os.Build;
import android.util.Log;
import android.util.Size;

/* loaded from: classes5.dex */
public final class vf5 implements ImageDecoder$OnHeaderDecodedListener {

    /* renamed from: a */
    public final yw7 f50271a = yw7.m58428b();

    /* renamed from: b */
    public final int f50272b;

    /* renamed from: c */
    public final int f50273c;

    /* renamed from: d */
    public final s75 f50274d;

    /* renamed from: e */
    public final mx5 f50275e;

    /* renamed from: f */
    public final boolean f50276f;

    /* renamed from: g */
    public final mgd f50277g;

    /* renamed from: o.vf5$a */
    public class C17571a implements ImageDecoder$OnPartialImageListener {
        public C17571a() {
        }

        public boolean onPartialImage(ImageDecoder.DecodeException decodeException) {
            return false;
        }
    }

    public vf5(int i, int i2, rec recVar) {
        this.f50272b = i;
        this.f50273c = i2;
        this.f50274d = (s75) recVar.m46585c(sx5.f46063f);
        this.f50275e = (mx5) recVar.m46585c(mx5.f36070h);
        mec mecVar = sx5.f46067j;
        this.f50276f = recVar.m46585c(mecVar) != null && ((Boolean) recVar.m46585c(mecVar)).booleanValue();
        this.f50277g = (mgd) recVar.m46585c(sx5.f46064g);
    }

    public void onHeaderDecoded(ImageDecoder imageDecoder, ImageDecoder.ImageInfo imageInfo, ImageDecoder.Source source) {
        boolean z = false;
        if (this.f50271a.m58435e(this.f50272b, this.f50273c, this.f50276f, false)) {
            imageDecoder.setAllocator(3);
        } else {
            imageDecoder.setAllocator(1);
        }
        if (this.f50274d == s75.PREFER_RGB_565) {
            imageDecoder.setMemorySizePolicy(0);
        }
        imageDecoder.setOnPartialImageListener(new C17571a());
        Size size = imageInfo.getSize();
        int width = this.f50272b;
        if (width == Integer.MIN_VALUE) {
            width = size.getWidth();
        }
        int height = this.f50273c;
        if (height == Integer.MIN_VALUE) {
            height = size.getHeight();
        }
        float fMo39755b = this.f50275e.mo39755b(size.getWidth(), size.getHeight(), width, height);
        int iRound = Math.round(size.getWidth() * fMo39755b);
        int iRound2 = Math.round(size.getHeight() * fMo39755b);
        if (Log.isLoggable("ImageDecoder", 2)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Resizing from [");
            sb.append(size.getWidth());
            sb.append("x");
            sb.append(size.getHeight());
            sb.append("] to [");
            sb.append(iRound);
            sb.append("x");
            sb.append(iRound2);
            sb.append("] scaleFactor: ");
            sb.append(fMo39755b);
        }
        imageDecoder.setTargetSize(iRound, iRound2);
        mgd mgdVar = this.f50277g;
        if (mgdVar != null) {
            int i = Build.VERSION.SDK_INT;
            if (i < 28) {
                if (i >= 26) {
                    imageDecoder.setTargetColorSpace(ColorSpace.get(ColorSpace.Named.SRGB));
                }
            } else {
                if (mgdVar == mgd.DISPLAY_P3 && imageInfo.getColorSpace() != null && imageInfo.getColorSpace().isWideGamut()) {
                    z = true;
                }
                imageDecoder.setTargetColorSpace(ColorSpace.get(z ? ColorSpace.Named.DISPLAY_P3 : ColorSpace.Named.SRGB));
            }
        }
    }
}
