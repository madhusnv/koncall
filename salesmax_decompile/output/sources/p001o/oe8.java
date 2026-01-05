package p001o;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;

/* loaded from: classes5.dex */
public class oe8 {
    /* renamed from: a */
    public kzi m42119a(ImageView imageView, Class cls) {
        if (Bitmap.class.equals(cls)) {
            return new li1(imageView);
        }
        if (Drawable.class.isAssignableFrom(cls)) {
            return new jy5(imageView);
        }
        throw new IllegalArgumentException("Unhandled class: " + cls + ", try .as*(Class).transcode(ResourceTranscoder)");
    }
}
