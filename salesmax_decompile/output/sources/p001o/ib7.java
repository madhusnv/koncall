package p001o;

import android.content.res.AssetManager;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.view.View;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public class ib7 {

    /* renamed from: d */
    public final AssetManager f28377d;

    /* renamed from: a */
    public final rpb f28374a = new rpb();

    /* renamed from: b */
    public final Map f28375b = new HashMap();

    /* renamed from: c */
    public final Map f28376c = new HashMap();

    /* renamed from: e */
    public String f28378e = ".ttf";

    public ib7(Drawable.Callback callback, hb7 hb7Var) {
        if (callback instanceof View) {
            this.f28377d = ((View) callback).getContext().getAssets();
        } else {
            rja.m46866c("LottieDrawable must be inside of a view for images to work.");
            this.f28377d = null;
        }
    }

    /* renamed from: a */
    public final Typeface m31813a(String str) {
        Typeface typeface = (Typeface) this.f28376c.get(str);
        if (typeface != null) {
            return typeface;
        }
        Typeface typefaceCreateFromAsset = Typeface.createFromAsset(this.f28377d, "fonts/" + str + this.f28378e);
        this.f28376c.put(str, typefaceCreateFromAsset);
        return typefaceCreateFromAsset;
    }

    /* renamed from: b */
    public Typeface m31814b(String str, String str2) {
        this.f28374a.m47066b(str, str2);
        Typeface typeface = (Typeface) this.f28375b.get(this.f28374a);
        if (typeface != null) {
            return typeface;
        }
        Typeface typefaceM31816d = m31816d(m31813a(str), str2);
        this.f28375b.put(this.f28374a, typefaceM31816d);
        return typefaceM31816d;
    }

    /* renamed from: c */
    public void m31815c(hb7 hb7Var) {
    }

    /* renamed from: d */
    public final Typeface m31816d(Typeface typeface, String str) {
        boolean zContains = str.contains("Italic");
        boolean zContains2 = str.contains("Bold");
        int i = (zContains && zContains2) ? 3 : zContains ? 2 : zContains2 ? 1 : 0;
        return typeface.getStyle() == i ? typeface : Typeface.create(typeface, i);
    }
}
