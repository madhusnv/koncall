package androidx.core.graphics.drawable;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import android.graphics.drawable.AdaptiveIconDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.versionedparcelable.CustomVersionedParcelable;
import com.amplifyframework.storage.s3.transfer.TransferTable;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.nio.charset.Charset;
import org.apache.http.protocol.HTTP;
import p001o.fgd;
import p001o.s6c;

/* loaded from: classes2.dex */
public class IconCompat extends CustomVersionedParcelable {

    /* renamed from: k */
    public static final PorterDuff.Mode f7159k = PorterDuff.Mode.SRC_IN;

    /* renamed from: a */
    public int f7160a;

    /* renamed from: b */
    public Object f7161b;

    /* renamed from: c */
    public byte[] f7162c;

    /* renamed from: d */
    public Parcelable f7163d;

    /* renamed from: e */
    public int f7164e;

    /* renamed from: f */
    public int f7165f;

    /* renamed from: g */
    public ColorStateList f7166g;

    /* renamed from: h */
    public PorterDuff.Mode f7167h;

    /* renamed from: i */
    public String f7168i;

    /* renamed from: j */
    public String f7169j;

    /* renamed from: androidx.core.graphics.drawable.IconCompat$a */
    public static class C2028a {
        /* renamed from: a */
        public static IconCompat m5870a(Object obj) {
            fgd.m26663g(obj);
            int iM5873d = m5873d(obj);
            if (iM5873d == 2) {
                return IconCompat.m5857h(null, m5872c(obj), m5871b(obj));
            }
            if (iM5873d == 4) {
                return IconCompat.m5855f(m5874e(obj));
            }
            if (iM5873d == 6) {
                return IconCompat.m5852c(m5874e(obj));
            }
            IconCompat iconCompat = new IconCompat(-1);
            iconCompat.f7161b = obj;
            return iconCompat;
        }

        /* renamed from: b */
        public static int m5871b(Object obj) {
            if (Build.VERSION.SDK_INT >= 28) {
                return C2030c.m5879a(obj);
            }
            try {
                return ((Integer) obj.getClass().getMethod("getResId", new Class[0]).invoke(obj, new Object[0])).intValue();
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
                return 0;
            }
        }

        /* renamed from: c */
        public static String m5872c(Object obj) {
            if (Build.VERSION.SDK_INT >= 28) {
                return C2030c.m5880b(obj);
            }
            try {
                return (String) obj.getClass().getMethod("getResPackage", new Class[0]).invoke(obj, new Object[0]);
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
                return null;
            }
        }

        /* renamed from: d */
        public static int m5873d(Object obj) {
            if (Build.VERSION.SDK_INT >= 28) {
                return C2030c.m5881c(obj);
            }
            try {
                return ((Integer) obj.getClass().getMethod("getType", new Class[0]).invoke(obj, new Object[0])).intValue();
            } catch (IllegalAccessException unused) {
                StringBuilder sb = new StringBuilder();
                sb.append("Unable to get icon type ");
                sb.append(obj);
                return -1;
            } catch (NoSuchMethodException unused2) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Unable to get icon type ");
                sb2.append(obj);
                return -1;
            } catch (InvocationTargetException unused3) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append("Unable to get icon type ");
                sb3.append(obj);
                return -1;
            }
        }

        /* renamed from: e */
        public static Uri m5874e(Object obj) {
            if (Build.VERSION.SDK_INT >= 28) {
                return C2030c.m5882d(obj);
            }
            try {
                return (Uri) obj.getClass().getMethod("getUri", new Class[0]).invoke(obj, new Object[0]);
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
                return null;
            }
        }

        /* renamed from: f */
        public static Drawable m5875f(Icon icon, Context context) {
            return icon.loadDrawable(context);
        }

        /* renamed from: g */
        public static Icon m5876g(IconCompat iconCompat, Context context) {
            Icon iconCreateWithBitmap;
            switch (iconCompat.f7160a) {
                case -1:
                    return (Icon) iconCompat.f7161b;
                case 0:
                default:
                    throw new IllegalArgumentException("Unknown type");
                case 1:
                    iconCreateWithBitmap = Icon.createWithBitmap((Bitmap) iconCompat.f7161b);
                    break;
                case 2:
                    iconCreateWithBitmap = Icon.createWithResource(iconCompat.m5861k(), iconCompat.f7164e);
                    break;
                case 3:
                    iconCreateWithBitmap = Icon.createWithData((byte[]) iconCompat.f7161b, iconCompat.f7164e, iconCompat.f7165f);
                    break;
                case 4:
                    iconCreateWithBitmap = Icon.createWithContentUri((String) iconCompat.f7161b);
                    break;
                case 5:
                    if (Build.VERSION.SDK_INT < 26) {
                        iconCreateWithBitmap = Icon.createWithBitmap(IconCompat.m5851b((Bitmap) iconCompat.f7161b, false));
                        break;
                    } else {
                        iconCreateWithBitmap = C2029b.m5878b((Bitmap) iconCompat.f7161b);
                        break;
                    }
                case 6:
                    int i = Build.VERSION.SDK_INT;
                    if (i >= 30) {
                        iconCreateWithBitmap = C2031d.m5883a(iconCompat.m5863m());
                        break;
                    } else {
                        if (context == null) {
                            throw new IllegalArgumentException("Context is required to resolve the file uri of the icon: " + iconCompat.m5863m());
                        }
                        InputStream inputStreamM5864n = iconCompat.m5864n(context);
                        if (inputStreamM5864n == null) {
                            throw new IllegalStateException("Cannot load adaptive icon from uri: " + iconCompat.m5863m());
                        }
                        if (i < 26) {
                            iconCreateWithBitmap = Icon.createWithBitmap(IconCompat.m5851b(BitmapFactory.decodeStream(inputStreamM5864n), false));
                            break;
                        } else {
                            iconCreateWithBitmap = C2029b.m5878b(BitmapFactory.decodeStream(inputStreamM5864n));
                            break;
                        }
                    }
            }
            ColorStateList colorStateList = iconCompat.f7166g;
            if (colorStateList != null) {
                iconCreateWithBitmap.setTintList(colorStateList);
            }
            PorterDuff.Mode mode = iconCompat.f7167h;
            if (mode != IconCompat.f7159k) {
                iconCreateWithBitmap.setTintMode(mode);
            }
            return iconCreateWithBitmap;
        }
    }

    /* renamed from: androidx.core.graphics.drawable.IconCompat$b */
    public static class C2029b {
        /* renamed from: a */
        public static Drawable m5877a(Drawable drawable, Drawable drawable2) {
            return new AdaptiveIconDrawable(drawable, drawable2);
        }

        /* renamed from: b */
        public static Icon m5878b(Bitmap bitmap) {
            return Icon.createWithAdaptiveBitmap(bitmap);
        }
    }

    /* renamed from: androidx.core.graphics.drawable.IconCompat$c */
    public static class C2030c {
        /* renamed from: a */
        public static int m5879a(Object obj) {
            return ((Icon) obj).getResId();
        }

        /* renamed from: b */
        public static String m5880b(Object obj) {
            return ((Icon) obj).getResPackage();
        }

        /* renamed from: c */
        public static int m5881c(Object obj) {
            return ((Icon) obj).getType();
        }

        /* renamed from: d */
        public static Uri m5882d(Object obj) {
            return ((Icon) obj).getUri();
        }
    }

    /* renamed from: androidx.core.graphics.drawable.IconCompat$d */
    public static class C2031d {
        /* renamed from: a */
        public static Icon m5883a(Uri uri) {
            return Icon.createWithAdaptiveBitmapContentUri(uri);
        }
    }

    public IconCompat() {
        this.f7160a = -1;
        this.f7162c = null;
        this.f7163d = null;
        this.f7164e = 0;
        this.f7165f = 0;
        this.f7166g = null;
        this.f7167h = f7159k;
        this.f7168i = null;
    }

    /* renamed from: a */
    public static IconCompat m5850a(Icon icon) {
        return C2028a.m5870a(icon);
    }

    /* renamed from: b */
    public static Bitmap m5851b(Bitmap bitmap, boolean z) {
        int iMin = (int) (Math.min(bitmap.getWidth(), bitmap.getHeight()) * 0.6666667f);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iMin, iMin, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        Paint paint = new Paint(3);
        float f = iMin;
        float f2 = 0.5f * f;
        float f3 = 0.9166667f * f2;
        if (z) {
            float f4 = 0.010416667f * f;
            paint.setColor(0);
            paint.setShadowLayer(f4, 0.0f, f * 0.020833334f, 1023410176);
            canvas.drawCircle(f2, f2, f3, paint);
            paint.setShadowLayer(f4, 0.0f, 0.0f, 503316480);
            canvas.drawCircle(f2, f2, f3, paint);
            paint.clearShadowLayer();
        }
        paint.setColor(-16777216);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
        Matrix matrix = new Matrix();
        matrix.setTranslate((-(bitmap.getWidth() - iMin)) / 2.0f, (-(bitmap.getHeight() - iMin)) / 2.0f);
        bitmapShader.setLocalMatrix(matrix);
        paint.setShader(bitmapShader);
        canvas.drawCircle(f2, f2, f3, paint);
        canvas.setBitmap(null);
        return bitmapCreateBitmap;
    }

    /* renamed from: c */
    public static IconCompat m5852c(Uri uri) {
        s6c.m47911c(uri);
        return m5853d(uri.toString());
    }

    /* renamed from: d */
    public static IconCompat m5853d(String str) {
        s6c.m47911c(str);
        IconCompat iconCompat = new IconCompat(6);
        iconCompat.f7161b = str;
        return iconCompat;
    }

    /* renamed from: e */
    public static IconCompat m5854e(Bitmap bitmap) {
        s6c.m47911c(bitmap);
        IconCompat iconCompat = new IconCompat(1);
        iconCompat.f7161b = bitmap;
        return iconCompat;
    }

    /* renamed from: f */
    public static IconCompat m5855f(Uri uri) {
        s6c.m47911c(uri);
        return m5856g(uri.toString());
    }

    /* renamed from: g */
    public static IconCompat m5856g(String str) {
        s6c.m47911c(str);
        IconCompat iconCompat = new IconCompat(4);
        iconCompat.f7161b = str;
        return iconCompat;
    }

    /* renamed from: h */
    public static IconCompat m5857h(Resources resources, String str, int i) {
        s6c.m47911c(str);
        if (i == 0) {
            throw new IllegalArgumentException("Drawable resource ID must not be 0");
        }
        IconCompat iconCompat = new IconCompat(2);
        iconCompat.f7164e = i;
        if (resources != null) {
            try {
                iconCompat.f7161b = resources.getResourceName(i);
            } catch (Resources.NotFoundException unused) {
                throw new IllegalArgumentException("Icon resource cannot be found");
            }
        } else {
            iconCompat.f7161b = str;
        }
        iconCompat.f7169j = str;
        return iconCompat;
    }

    /* renamed from: t */
    public static String m5858t(int i) {
        switch (i) {
            case 1:
                return "BITMAP";
            case 2:
                return "RESOURCE";
            case 3:
                return "DATA";
            case 4:
                return "URI";
            case 5:
                return "BITMAP_MASKABLE";
            case 6:
                return "URI_MASKABLE";
            default:
                return "UNKNOWN";
        }
    }

    /* renamed from: i */
    public Bitmap m5859i() {
        int i = this.f7160a;
        if (i == -1) {
            Object obj = this.f7161b;
            if (obj instanceof Bitmap) {
                return (Bitmap) obj;
            }
            return null;
        }
        if (i == 1) {
            return (Bitmap) this.f7161b;
        }
        if (i == 5) {
            return m5851b((Bitmap) this.f7161b, true);
        }
        throw new IllegalStateException("called getBitmap() on " + this);
    }

    /* renamed from: j */
    public int m5860j() {
        int i = this.f7160a;
        if (i == -1) {
            return C2028a.m5871b(this.f7161b);
        }
        if (i == 2) {
            return this.f7164e;
        }
        throw new IllegalStateException("called getResId() on " + this);
    }

    /* renamed from: k */
    public String m5861k() {
        int i = this.f7160a;
        if (i == -1) {
            return C2028a.m5872c(this.f7161b);
        }
        if (i == 2) {
            String str = this.f7169j;
            return (str == null || TextUtils.isEmpty(str)) ? ((String) this.f7161b).split(":", -1)[0] : this.f7169j;
        }
        throw new IllegalStateException("called getResPackage() on " + this);
    }

    /* renamed from: l */
    public int m5862l() {
        int i = this.f7160a;
        return i == -1 ? C2028a.m5873d(this.f7161b) : i;
    }

    /* renamed from: m */
    public Uri m5863m() {
        int i = this.f7160a;
        if (i == -1) {
            return C2028a.m5874e(this.f7161b);
        }
        if (i == 4 || i == 6) {
            return Uri.parse((String) this.f7161b);
        }
        throw new IllegalStateException("called getUri() on " + this);
    }

    /* renamed from: n */
    public InputStream m5864n(Context context) {
        Uri uriM5863m = m5863m();
        String scheme = uriM5863m.getScheme();
        if (FirebaseAnalytics.Param.CONTENT.equals(scheme) || TransferTable.COLUMN_FILE.equals(scheme)) {
            try {
                return context.getContentResolver().openInputStream(uriM5863m);
            } catch (Exception unused) {
                StringBuilder sb = new StringBuilder();
                sb.append("Unable to load image from URI: ");
                sb.append(uriM5863m);
                return null;
            }
        }
        try {
            return new FileInputStream(new File((String) this.f7161b));
        } catch (FileNotFoundException unused2) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Unable to load image from path: ");
            sb2.append(uriM5863m);
            return null;
        }
    }

    /* renamed from: o */
    public void m5865o() {
        this.f7167h = PorterDuff.Mode.valueOf(this.f7168i);
        switch (this.f7160a) {
            case -1:
                Parcelable parcelable = this.f7163d;
                if (parcelable == null) {
                    throw new IllegalArgumentException("Invalid icon");
                }
                this.f7161b = parcelable;
                return;
            case 0:
            default:
                return;
            case 1:
            case 5:
                Parcelable parcelable2 = this.f7163d;
                if (parcelable2 != null) {
                    this.f7161b = parcelable2;
                    return;
                }
                byte[] bArr = this.f7162c;
                this.f7161b = bArr;
                this.f7160a = 3;
                this.f7164e = 0;
                this.f7165f = bArr.length;
                return;
            case 2:
            case 4:
            case 6:
                String str = new String(this.f7162c, Charset.forName(HTTP.UTF_16));
                this.f7161b = str;
                if (this.f7160a == 2 && this.f7169j == null) {
                    this.f7169j = str.split(":", -1)[0];
                    return;
                }
                return;
            case 3:
                this.f7161b = this.f7162c;
                return;
        }
    }

    /* renamed from: p */
    public void m5866p(boolean z) {
        this.f7168i = this.f7167h.name();
        switch (this.f7160a) {
            case -1:
                if (z) {
                    throw new IllegalArgumentException("Can't serialize Icon created with IconCompat#createFromIcon");
                }
                this.f7163d = (Parcelable) this.f7161b;
                return;
            case 0:
            default:
                return;
            case 1:
            case 5:
                if (!z) {
                    this.f7163d = (Parcelable) this.f7161b;
                    return;
                }
                Bitmap bitmap = (Bitmap) this.f7161b;
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                bitmap.compress(Bitmap.CompressFormat.PNG, 90, byteArrayOutputStream);
                this.f7162c = byteArrayOutputStream.toByteArray();
                return;
            case 2:
                this.f7162c = ((String) this.f7161b).getBytes(Charset.forName(HTTP.UTF_16));
                return;
            case 3:
                this.f7162c = (byte[]) this.f7161b;
                return;
            case 4:
            case 6:
                this.f7162c = this.f7161b.toString().getBytes(Charset.forName(HTTP.UTF_16));
                return;
        }
    }

    /* renamed from: q */
    public Bundle m5867q() {
        Bundle bundle = new Bundle();
        switch (this.f7160a) {
            case -1:
                bundle.putParcelable("obj", (Parcelable) this.f7161b);
                break;
            case 0:
            default:
                throw new IllegalArgumentException("Invalid icon");
            case 1:
            case 5:
                bundle.putParcelable("obj", (Bitmap) this.f7161b);
                break;
            case 2:
            case 4:
            case 6:
                bundle.putString("obj", (String) this.f7161b);
                break;
            case 3:
                bundle.putByteArray("obj", (byte[]) this.f7161b);
                break;
        }
        bundle.putInt("type", this.f7160a);
        bundle.putInt("int1", this.f7164e);
        bundle.putInt("int2", this.f7165f);
        bundle.putString("string1", this.f7169j);
        ColorStateList colorStateList = this.f7166g;
        if (colorStateList != null) {
            bundle.putParcelable("tint_list", colorStateList);
        }
        PorterDuff.Mode mode = this.f7167h;
        if (mode != f7159k) {
            bundle.putString("tint_mode", mode.name());
        }
        return bundle;
    }

    /* renamed from: r */
    public Icon m5868r() {
        return m5869s(null);
    }

    /* renamed from: s */
    public Icon m5869s(Context context) {
        return C2028a.m5876g(this, context);
    }

    public String toString() {
        if (this.f7160a == -1) {
            return String.valueOf(this.f7161b);
        }
        StringBuilder sb = new StringBuilder("Icon(typ=");
        sb.append(m5858t(this.f7160a));
        switch (this.f7160a) {
            case 1:
            case 5:
                sb.append(" size=");
                sb.append(((Bitmap) this.f7161b).getWidth());
                sb.append("x");
                sb.append(((Bitmap) this.f7161b).getHeight());
                break;
            case 2:
                sb.append(" pkg=");
                sb.append(this.f7169j);
                sb.append(" id=");
                sb.append(String.format("0x%08x", Integer.valueOf(m5860j())));
                break;
            case 3:
                sb.append(" len=");
                sb.append(this.f7164e);
                if (this.f7165f != 0) {
                    sb.append(" off=");
                    sb.append(this.f7165f);
                    break;
                }
                break;
            case 4:
            case 6:
                sb.append(" uri=");
                sb.append(this.f7161b);
                break;
        }
        if (this.f7166g != null) {
            sb.append(" tint=");
            sb.append(this.f7166g);
        }
        if (this.f7167h != f7159k) {
            sb.append(" mode=");
            sb.append(this.f7167h);
        }
        sb.append(")");
        return sb.toString();
    }

    public IconCompat(int i) {
        this.f7162c = null;
        this.f7163d = null;
        this.f7164e = 0;
        this.f7165f = 0;
        this.f7166g = null;
        this.f7167h = f7159k;
        this.f7168i = null;
        this.f7160a = i;
    }
}
