package p001o;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.Base64;
import android.view.View;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import org.objectweb.asm.Opcodes;

/* loaded from: classes3.dex */
public class kc8 {

    /* renamed from: d */
    public static final Object f31918d = new Object();

    /* renamed from: a */
    public final Context f31919a;

    /* renamed from: b */
    public final String f31920b;

    /* renamed from: c */
    public final Map f31921c;

    public kc8(Drawable.Callback callback, String str, jc8 jc8Var, Map map) {
        if (TextUtils.isEmpty(str) || str.charAt(str.length() - 1) == '/') {
            this.f31920b = str;
        } else {
            this.f31920b = str + '/';
        }
        if (callback instanceof View) {
            this.f31919a = ((View) callback).getContext();
            this.f31921c = map;
            m35395d(jc8Var);
        } else {
            rja.m46866c("LottieDrawable must be inside of a view for images to work.");
            this.f31921c = new HashMap();
            this.f31919a = null;
        }
    }

    /* renamed from: a */
    public Bitmap m35392a(String str) {
        hma hmaVar = (hma) this.f31921c.get(str);
        if (hmaVar == null) {
            return null;
        }
        Bitmap bitmapM30808a = hmaVar.m30808a();
        if (bitmapM30808a != null) {
            return bitmapM30808a;
        }
        String strM30809b = hmaVar.m30809b();
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inScaled = true;
        options.inDensity = Opcodes.IF_ICMPNE;
        if (strM30809b.startsWith("data:") && strM30809b.indexOf("base64,") > 0) {
            try {
                byte[] bArrDecode = Base64.decode(strM30809b.substring(strM30809b.indexOf(44) + 1), 0);
                return m35394c(str, BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length, options));
            } catch (IllegalArgumentException e) {
                rja.m46867d("data URL did not have correct base64 format.", e);
                return null;
            }
        }
        try {
            if (TextUtils.isEmpty(this.f31920b)) {
                throw new IllegalStateException("You must set an images folder before loading an image. Set it with LottieComposition#setImagesFolder or LottieDrawable#setImagesFolder");
            }
            try {
                return m35394c(str, hri.m31032l(BitmapFactory.decodeStream(this.f31919a.getAssets().open(this.f31920b + strM30809b), null, options), hmaVar.m30812e(), hmaVar.m30810c()));
            } catch (IllegalArgumentException e2) {
                rja.m46867d("Unable to decode image.", e2);
                return null;
            }
        } catch (IOException e3) {
            rja.m46867d("Unable to open asset.", e3);
            return null;
        }
    }

    /* renamed from: b */
    public boolean m35393b(Context context) {
        return (context == null && this.f31919a == null) || this.f31919a.equals(context);
    }

    /* renamed from: c */
    public final Bitmap m35394c(String str, Bitmap bitmap) {
        synchronized (f31918d) {
            ((hma) this.f31921c.get(str)).m30813f(bitmap);
        }
        return bitmap;
    }

    /* renamed from: d */
    public void m35395d(jc8 jc8Var) {
    }
}
