package d3;

import android.graphics.Paint;
import android.graphics.Shader;
import c3.C0850e;
import kotlin.jvm.internal.AbstractC4154l;
import of.C5359n;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public abstract class j0 extends AbstractC1561o {

    /* renamed from: a */
    public Shader f7778a;

    /* renamed from: b */
    public long f7779b = 9205357640488583168L;

    @Override // d3.AbstractC1561o
    /* renamed from: a */
    public final void mo5176a(float f6, long j6, C5359n c5359n) {
        Paint paint = (Paint) c5359n.f26304b;
        Shader shaderMo5177b = this.f7778a;
        if (shaderMo5177b == null || !C0850e.m2290a(this.f7779b, j6)) {
            if (C0850e.m2294e(j6)) {
                shaderMo5177b = null;
                this.f7778a = null;
                this.f7779b = 9205357640488583168L;
            } else {
                shaderMo5177b = mo5177b(j6);
                this.f7778a = shaderMo5177b;
                this.f7779b = j6;
            }
        }
        long jM5131c = h0.m5131c(paint.getColor());
        long j10 = C1565s.f7809b;
        if (!C1565s.m5187c(jM5131c, j10)) {
            c5359n.m10514u(j10);
        }
        if (!AbstractC4154l.m8918a((Shader) c5359n.f26305c, shaderMo5177b)) {
            c5359n.m10517x(shaderMo5177b);
        }
        if (paint.getAlpha() / 255.0f == f6) {
            return;
        }
        c5359n.m10512s(f6);
    }

    /* renamed from: b */
    public abstract Shader mo5177b(long j6);
}
