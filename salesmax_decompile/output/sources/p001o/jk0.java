package p001o;

import android.R;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Shader;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.graphics.drawable.shapes.Shape;
import android.util.AttributeSet;
import android.widget.ProgressBar;
import com.amplifyframework.storage.s3.transfer.TransferRecord;

/* loaded from: classes2.dex */
public class jk0 {

    /* renamed from: c */
    public static final int[] f30519c = {R.attr.indeterminateDrawable, R.attr.progressDrawable};

    /* renamed from: a */
    public final ProgressBar f30520a;

    /* renamed from: b */
    public Bitmap f30521b;

    /* renamed from: o.jk0$a */
    public static class C14552a {
        /* renamed from: a */
        public static void m33891a(LayerDrawable layerDrawable, LayerDrawable layerDrawable2, int i) {
            layerDrawable2.setLayerGravity(i, layerDrawable.getLayerGravity(i));
            layerDrawable2.setLayerWidth(i, layerDrawable.getLayerWidth(i));
            layerDrawable2.setLayerHeight(i, layerDrawable.getLayerHeight(i));
            layerDrawable2.setLayerInsetLeft(i, layerDrawable.getLayerInsetLeft(i));
            layerDrawable2.setLayerInsetRight(i, layerDrawable.getLayerInsetRight(i));
            layerDrawable2.setLayerInsetTop(i, layerDrawable.getLayerInsetTop(i));
            layerDrawable2.setLayerInsetBottom(i, layerDrawable.getLayerInsetBottom(i));
            layerDrawable2.setLayerInsetStart(i, layerDrawable.getLayerInsetStart(i));
            layerDrawable2.setLayerInsetEnd(i, layerDrawable.getLayerInsetEnd(i));
        }
    }

    public jk0(ProgressBar progressBar) {
        this.f30520a = progressBar;
    }

    /* renamed from: a */
    public final Shape m33886a() {
        return new RoundRectShape(new float[]{5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f}, null, null);
    }

    /* renamed from: b */
    public Bitmap m33887b() {
        return this.f30521b;
    }

    /* renamed from: c */
    public void mo33888c(AttributeSet attributeSet, int i) {
        anh anhVarM17525v = anh.m17525v(this.f30520a.getContext(), attributeSet, f30519c, i, 0);
        Drawable drawableM17533h = anhVarM17525v.m17533h(0);
        if (drawableM17533h != null) {
            this.f30520a.setIndeterminateDrawable(m33890e(drawableM17533h));
        }
        Drawable drawableM17533h2 = anhVarM17525v.m17533h(1);
        if (drawableM17533h2 != null) {
            this.f30520a.setProgressDrawable(m33889d(drawableM17533h2, false));
        }
        anhVarM17525v.m17546x();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: d */
    public Drawable m33889d(Drawable drawable, boolean z) {
        if (drawable instanceof qcj) {
            qcj qcjVar = (qcj) drawable;
            Drawable drawableM45106a = qcjVar.m45106a();
            if (drawableM45106a != null) {
                qcjVar.m45107b(m33889d(drawableM45106a, z));
            }
        } else {
            if (drawable instanceof LayerDrawable) {
                LayerDrawable layerDrawable = (LayerDrawable) drawable;
                int numberOfLayers = layerDrawable.getNumberOfLayers();
                Drawable[] drawableArr = new Drawable[numberOfLayers];
                for (int i = 0; i < numberOfLayers; i++) {
                    int id = layerDrawable.getId(i);
                    drawableArr[i] = m33889d(layerDrawable.getDrawable(i), id == 16908301 || id == 16908303);
                }
                LayerDrawable layerDrawable2 = new LayerDrawable(drawableArr);
                for (int i2 = 0; i2 < numberOfLayers; i2++) {
                    layerDrawable2.setId(i2, layerDrawable.getId(i2));
                    C14552a.m33891a(layerDrawable, layerDrawable2, i2);
                }
                return layerDrawable2;
            }
            if (drawable instanceof BitmapDrawable) {
                BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
                Bitmap bitmap = bitmapDrawable.getBitmap();
                if (this.f30521b == null) {
                    this.f30521b = bitmap;
                }
                ShapeDrawable shapeDrawable = new ShapeDrawable(m33886a());
                shapeDrawable.getPaint().setShader(new BitmapShader(bitmap, Shader.TileMode.REPEAT, Shader.TileMode.CLAMP));
                shapeDrawable.getPaint().setColorFilter(bitmapDrawable.getPaint().getColorFilter());
                return z ? new ClipDrawable(shapeDrawable, 3, 1) : shapeDrawable;
            }
        }
        return drawable;
    }

    /* renamed from: e */
    public final Drawable m33890e(Drawable drawable) {
        if (!(drawable instanceof AnimationDrawable)) {
            return drawable;
        }
        AnimationDrawable animationDrawable = (AnimationDrawable) drawable;
        int numberOfFrames = animationDrawable.getNumberOfFrames();
        AnimationDrawable animationDrawable2 = new AnimationDrawable();
        animationDrawable2.setOneShot(animationDrawable.isOneShot());
        for (int i = 0; i < numberOfFrames; i++) {
            Drawable drawableM33889d = m33889d(animationDrawable.getFrame(i), true);
            drawableM33889d.setLevel(TransferRecord.MAXIMUM_UPLOAD_PARTS);
            animationDrawable2.addFrame(drawableM33889d, animationDrawable.getDuration(i));
        }
        animationDrawable2.setLevel(TransferRecord.MAXIMUM_UPLOAD_PARTS);
        return animationDrawable2;
    }
}
