package ph;

import android.graphics.Matrix;
import android.graphics.Path;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ph.p */
/* loaded from: classes.dex */
public final class C5961p extends AbstractC5962q {

    /* renamed from: b */
    public float f29201b;

    /* renamed from: c */
    public float f29202c;

    @Override // ph.AbstractC5962q
    /* renamed from: a */
    public final void mo11999a(Matrix matrix, Path path) {
        Matrix matrix2 = this.f29203a;
        matrix.invert(matrix2);
        path.transform(matrix2);
        path.lineTo(this.f29201b, this.f29202c);
        path.transform(matrix);
    }
}
