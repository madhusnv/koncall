package p001o;

import android.graphics.Matrix;
import android.util.Property;
import android.widget.ImageView;

/* loaded from: classes3.dex */
public class nd8 extends Property {

    /* renamed from: a */
    public final Matrix f36703a;

    public nd8() {
        super(Matrix.class, "imageMatrixProperty");
        this.f36703a = new Matrix();
    }

    @Override // android.util.Property
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public Matrix get(ImageView imageView) {
        this.f36703a.set(imageView.getImageMatrix());
        return this.f36703a;
    }

    @Override // android.util.Property
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void set(ImageView imageView, Matrix matrix) {
        imageView.setImageMatrix(matrix);
    }
}
