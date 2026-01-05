package p001o;

import android.media.Image;
import android.media.ImageWriter;
import android.view.Surface;

/* loaded from: classes2.dex */
public abstract class re8 {
    /* renamed from: a */
    public static ImageWriter m46580a(Surface surface, int i) {
        return ImageWriter.newInstance(surface, i);
    }

    /* renamed from: b */
    public static void m46581b(ImageWriter imageWriter, Image image) {
        imageWriter.queueInputImage(image);
    }
}
