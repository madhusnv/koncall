package androidx.core.graphics.drawable;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.os.Build;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.versionedparcelable.CustomVersionedParcelable;
import bg.AbstractC0656a;
import c6.AbstractC0879i;
import c6.AbstractC0880j;
import com.amplifyframework.storage.s3.transfer.TransferTable;
import com.skydoves.balloon.internals.DefinitionKt;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.util.Objects;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public class IconCompat extends CustomVersionedParcelable {

    /* renamed from: k */
    public static final PorterDuff.Mode f2201k = PorterDuff.Mode.SRC_IN;

    /* renamed from: a */
    public int f2202a;

    /* renamed from: b */
    public Object f2203b;

    /* renamed from: c */
    public byte[] f2204c;

    /* renamed from: d */
    public Parcelable f2205d;

    /* renamed from: e */
    public int f2206e;

    /* renamed from: f */
    public int f2207f;

    /* renamed from: g */
    public ColorStateList f2208g;

    /* renamed from: h */
    public PorterDuff.Mode f2209h;

    /* renamed from: i */
    public String f2210i;

    /* renamed from: j */
    public String f2211j;

    public IconCompat() {
        this.f2202a = -1;
        this.f2204c = null;
        this.f2205d = null;
        this.f2206e = 0;
        this.f2207f = 0;
        this.f2208g = null;
        this.f2209h = f2201k;
        this.f2210i = null;
    }

    /* renamed from: a */
    public static Bitmap m757a(Bitmap bitmap, boolean z6) {
        int iMin = (int) (Math.min(bitmap.getWidth(), bitmap.getHeight()) * 0.6666667f);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iMin, iMin, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        Paint paint = new Paint(3);
        float f6 = iMin;
        float f10 = 0.5f * f6;
        float f11 = 0.9166667f * f10;
        if (z6) {
            float f12 = 0.010416667f * f6;
            paint.setColor(0);
            paint.setShadowLayer(f12, DefinitionKt.NO_Float_VALUE, f6 * 0.020833334f, 1023410176);
            canvas.drawCircle(f10, f10, f11, paint);
            paint.setShadowLayer(f12, DefinitionKt.NO_Float_VALUE, DefinitionKt.NO_Float_VALUE, 503316480);
            canvas.drawCircle(f10, f10, f11, paint);
            paint.clearShadowLayer();
        }
        paint.setColor(-16777216);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
        Matrix matrix = new Matrix();
        matrix.setTranslate((-(bitmap.getWidth() - iMin)) / 2.0f, (-(bitmap.getHeight() - iMin)) / 2.0f);
        bitmapShader.setLocalMatrix(matrix);
        paint.setShader(bitmapShader);
        canvas.drawCircle(f10, f10, f11, paint);
        canvas.setBitmap(null);
        return bitmapCreateBitmap;
    }

    /* renamed from: b */
    public static IconCompat m758b(int i10) {
        if (i10 == 0) {
            throw new IllegalArgumentException("Drawable resource ID must not be 0");
        }
        IconCompat iconCompat = new IconCompat(2);
        iconCompat.f2206e = i10;
        iconCompat.f2203b = "";
        iconCompat.f2211j = "";
        return iconCompat;
    }

    /* renamed from: c */
    public final int m759c() {
        int i10 = this.f2202a;
        if (i10 != -1) {
            if (i10 == 2) {
                return this.f2206e;
            }
            throw new IllegalStateException("called getResId() on " + this);
        }
        int i11 = Build.VERSION.SDK_INT;
        Object obj = this.f2203b;
        if (i11 >= 28) {
            return AbstractC0879i.m2395g(obj);
        }
        try {
            return ((Integer) obj.getClass().getMethod("getResId", null).invoke(obj, null)).intValue();
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            return 0;
        }
    }

    /* renamed from: d */
    public final int m760d() {
        int i10 = this.f2202a;
        if (i10 != -1) {
            return i10;
        }
        int i11 = Build.VERSION.SDK_INT;
        Object obj = this.f2203b;
        if (i11 >= 28) {
            return AbstractC0879i.m2403o(obj);
        }
        try {
            return ((Integer) obj.getClass().getMethod("getType", null).invoke(obj, null)).intValue();
        } catch (IllegalAccessException unused) {
            Objects.toString(obj);
            return -1;
        } catch (NoSuchMethodException unused2) {
            Objects.toString(obj);
            return -1;
        } catch (InvocationTargetException unused3) {
            Objects.toString(obj);
            return -1;
        }
    }

    /* renamed from: e */
    public final Uri m761e() {
        int i10 = this.f2202a;
        if (i10 == -1) {
            int i11 = Build.VERSION.SDK_INT;
            Object obj = this.f2203b;
            if (i11 >= 28) {
                return AbstractC0879i.m2404p(obj);
            }
            try {
                return (Uri) obj.getClass().getMethod("getUri", null).invoke(obj, null);
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
                return null;
            }
        }
        if (i10 == 4 || i10 == 6) {
            return Uri.parse((String) this.f2203b);
        }
        throw new IllegalStateException("called getUri() on " + this);
    }

    /* renamed from: f */
    public final Icon m762f(Context context) throws FileNotFoundException {
        Icon iconCreateWithBitmap;
        int i10 = Build.VERSION.SDK_INT;
        int i11 = this.f2202a;
        String strM2396h = null;
        inputStreamOpenInputStream = null;
        InputStream inputStreamOpenInputStream = null;
        switch (i11) {
            case -1:
                return (Icon) this.f2203b;
            case 0:
            default:
                throw new IllegalArgumentException("Unknown type");
            case 1:
                iconCreateWithBitmap = Icon.createWithBitmap((Bitmap) this.f2203b);
                break;
            case 2:
                if (i11 == -1) {
                    Object obj = this.f2203b;
                    if (i10 >= 28) {
                        strM2396h = AbstractC0879i.m2396h(obj);
                    } else {
                        try {
                            strM2396h = (String) obj.getClass().getMethod("getResPackage", null).invoke(obj, null);
                        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
                        }
                    }
                } else {
                    if (i11 != 2) {
                        throw new IllegalStateException("called getResPackage() on " + this);
                    }
                    String str = this.f2211j;
                    strM2396h = (str == null || TextUtils.isEmpty(str)) ? ((String) this.f2203b).split(":", -1)[0] : this.f2211j;
                }
                iconCreateWithBitmap = Icon.createWithResource(strM2396h, this.f2206e);
                break;
            case 3:
                iconCreateWithBitmap = Icon.createWithData((byte[]) this.f2203b, this.f2206e, this.f2207f);
                break;
            case 4:
                iconCreateWithBitmap = Icon.createWithContentUri((String) this.f2203b);
                break;
            case 5:
                if (i10 < 26) {
                    iconCreateWithBitmap = Icon.createWithBitmap(m757a((Bitmap) this.f2203b, false));
                    break;
                } else {
                    iconCreateWithBitmap = AbstractC0656a.m1901j((Bitmap) this.f2203b);
                    break;
                }
            case 6:
                if (i10 >= 30) {
                    iconCreateWithBitmap = AbstractC0880j.m2418b(m761e());
                    break;
                } else {
                    if (context == null) {
                        throw new IllegalArgumentException("Context is required to resolve the file uri of the icon: " + m761e());
                    }
                    Uri uriM761e = m761e();
                    String scheme = uriM761e.getScheme();
                    if ("content".equals(scheme) || TransferTable.COLUMN_FILE.equals(scheme)) {
                        try {
                            inputStreamOpenInputStream = context.getContentResolver().openInputStream(uriM761e);
                        } catch (Exception unused2) {
                            uriM761e.toString();
                        }
                    } else {
                        try {
                            inputStreamOpenInputStream = new FileInputStream(new File((String) this.f2203b));
                        } catch (FileNotFoundException unused3) {
                            uriM761e.toString();
                        }
                    }
                    if (inputStreamOpenInputStream == null) {
                        throw new IllegalStateException("Cannot load adaptive icon from uri: " + m761e());
                    }
                    if (Build.VERSION.SDK_INT < 26) {
                        iconCreateWithBitmap = Icon.createWithBitmap(m757a(BitmapFactory.decodeStream(inputStreamOpenInputStream), false));
                        break;
                    } else {
                        iconCreateWithBitmap = AbstractC0656a.m1901j(BitmapFactory.decodeStream(inputStreamOpenInputStream));
                        break;
                    }
                }
                break;
        }
        ColorStateList colorStateList = this.f2208g;
        if (colorStateList != null) {
            iconCreateWithBitmap.setTintList(colorStateList);
        }
        PorterDuff.Mode mode = this.f2209h;
        if (mode != f2201k) {
            iconCreateWithBitmap.setTintMode(mode);
        }
        return iconCreateWithBitmap;
    }

    public final String toString() {
        String str;
        if (this.f2202a == -1) {
            return String.valueOf(this.f2203b);
        }
        StringBuilder sb2 = new StringBuilder("Icon(typ=");
        switch (this.f2202a) {
            case 1:
                str = "BITMAP";
                break;
            case 2:
                str = "RESOURCE";
                break;
            case 3:
                str = "DATA";
                break;
            case 4:
                str = "URI";
                break;
            case 5:
                str = "BITMAP_MASKABLE";
                break;
            case 6:
                str = "URI_MASKABLE";
                break;
            default:
                str = "UNKNOWN";
                break;
        }
        sb2.append(str);
        switch (this.f2202a) {
            case 1:
            case 5:
                sb2.append(" size=");
                sb2.append(((Bitmap) this.f2203b).getWidth());
                sb2.append("x");
                sb2.append(((Bitmap) this.f2203b).getHeight());
                break;
            case 2:
                sb2.append(" pkg=");
                sb2.append(this.f2211j);
                sb2.append(" id=");
                sb2.append(String.format("0x%08x", Integer.valueOf(m759c())));
                break;
            case 3:
                sb2.append(" len=");
                sb2.append(this.f2206e);
                if (this.f2207f != 0) {
                    sb2.append(" off=");
                    sb2.append(this.f2207f);
                    break;
                }
                break;
            case 4:
            case 6:
                sb2.append(" uri=");
                sb2.append(this.f2203b);
                break;
        }
        if (this.f2208g != null) {
            sb2.append(" tint=");
            sb2.append(this.f2208g);
        }
        if (this.f2209h != f2201k) {
            sb2.append(" mode=");
            sb2.append(this.f2209h);
        }
        sb2.append(")");
        return sb2.toString();
    }

    public IconCompat(int i10) {
        this.f2204c = null;
        this.f2205d = null;
        this.f2206e = 0;
        this.f2207f = 0;
        this.f2208g = null;
        this.f2209h = f2201k;
        this.f2210i = null;
        this.f2202a = i10;
    }
}
