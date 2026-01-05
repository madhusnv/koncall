package p001o;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;

/* loaded from: classes2.dex */
public final class cf0 implements xzc {

    /* renamed from: a */
    public final Path f18019a;

    /* renamed from: b */
    public final RectF f18020b;

    /* renamed from: c */
    public final float[] f18021c;

    /* renamed from: d */
    public final Matrix f18022d;

    public cf0(Path path) {
        sq8.m48649h(path, "internalPath");
        this.f18019a = path;
        this.f18020b = new RectF();
        this.f18021c = new float[8];
        this.f18022d = new Matrix();
    }

    @Override // p001o.xzc
    /* renamed from: a */
    public void mo21113a(tue tueVar) {
        sq8.m48649h(tueVar, "roundRect");
        this.f18020b.set(tueVar.m50687d(), tueVar.m50689f(), tueVar.m50688e(), tueVar.m50684a());
        this.f18021c[0] = k74.m35097d(tueVar.m50690g());
        this.f18021c[1] = k74.m35098e(tueVar.m50690g());
        this.f18021c[2] = k74.m35097d(tueVar.m50691h());
        this.f18021c[3] = k74.m35098e(tueVar.m50691h());
        this.f18021c[4] = k74.m35097d(tueVar.m50686c());
        this.f18021c[5] = k74.m35098e(tueVar.m50686c());
        this.f18021c[6] = k74.m35097d(tueVar.m50685b());
        this.f18021c[7] = k74.m35098e(tueVar.m50685b());
        this.f18019a.addRoundRect(this.f18020b, this.f18021c, Path.Direction.CCW);
    }

    /* renamed from: b */
    public final Path m21114b() {
        return this.f18019a;
    }

    @Override // p001o.xzc
    public void reset() {
        this.f18019a.reset();
    }

    public /* synthetic */ cf0(Path path, int i, id5 id5Var) {
        this((i & 1) != 0 ? new Path() : path);
    }
}
