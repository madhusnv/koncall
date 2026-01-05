package p001o;

import android.graphics.Path;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public class qp3 {

    /* renamed from: a */
    public final List f42260a = new ArrayList();

    /* renamed from: a */
    public void m45742a(txh txhVar) {
        this.f42260a.add(txhVar);
    }

    /* renamed from: b */
    public void m45743b(Path path) {
        for (int size = this.f42260a.size() - 1; size >= 0; size--) {
            hri.m31022b(path, (txh) this.f42260a.get(size));
        }
    }
}
