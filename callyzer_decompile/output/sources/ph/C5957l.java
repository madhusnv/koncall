package ph;

import android.graphics.Canvas;
import android.graphics.Matrix;
import java.util.ArrayList;
import oh.C5386a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ph.l */
/* loaded from: classes.dex */
public final class C5957l extends AbstractC5963r {

    /* renamed from: b */
    public final /* synthetic */ ArrayList f29188b;

    /* renamed from: c */
    public final /* synthetic */ Matrix f29189c;

    public C5957l(ArrayList arrayList, Matrix matrix) {
        this.f29188b = arrayList;
        this.f29189c = matrix;
    }

    @Override // ph.AbstractC5963r
    /* renamed from: a */
    public final void mo11997a(Matrix matrix, C5386a c5386a, int i10, Canvas canvas) {
        ArrayList arrayList = this.f29188b;
        int size = arrayList.size();
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            ((AbstractC5963r) obj).mo11997a(this.f29189c, c5386a, i10, canvas);
        }
    }
}
