package d3;

import android.graphics.Path;
import android.graphics.RectF;
import c3.C0848c;
import c3.C0849d;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public interface g0 {
    /* renamed from: a */
    static void m5127a(g0 g0Var, C0848c c0848c) {
        Path.Direction direction;
        f0 f0Var = f0.CounterClockwise;
        C1555i c1555i = (C1555i) g0Var;
        C1555i.m5153j(c0848c);
        if (c1555i.f7753b == null) {
            c1555i.f7753b = new RectF();
        }
        RectF rectF = c1555i.f7753b;
        AbstractC4154l.m8920c(rectF);
        rectF.set(c0848c.f5354a, c0848c.f5355b, c0848c.f5356c, c0848c.f5357d);
        Path path = c1555i.f7752a;
        RectF rectF2 = c1555i.f7753b;
        AbstractC4154l.m8920c(rectF2);
        int i10 = AbstractC1557k.f7780a[f0Var.ordinal()];
        if (i10 == 1) {
            direction = Path.Direction.CCW;
        } else {
            if (i10 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            direction = Path.Direction.CW;
        }
        path.addRect(rectF2, direction);
    }

    /* renamed from: b */
    static void m5128b(g0 g0Var, C0849d c0849d) {
        Path.Direction direction;
        f0 f0Var = f0.CounterClockwise;
        C1555i c1555i = (C1555i) g0Var;
        if (c1555i.f7753b == null) {
            c1555i.f7753b = new RectF();
        }
        RectF rectF = c1555i.f7753b;
        AbstractC4154l.m8920c(rectF);
        float f6 = c0849d.f5358a;
        long j6 = c0849d.f5365h;
        long j10 = c0849d.f5364g;
        long j11 = c0849d.f5363f;
        long j12 = c0849d.f5362e;
        rectF.set(f6, c0849d.f5359b, c0849d.f5360c, c0849d.f5361d);
        if (c1555i.f7754c == null) {
            c1555i.f7754c = new float[8];
        }
        float[] fArr = c1555i.f7754c;
        AbstractC4154l.m8920c(fArr);
        fArr[0] = Float.intBitsToFloat((int) (j12 >> 32));
        fArr[1] = Float.intBitsToFloat((int) (j12 & 4294967295L));
        fArr[2] = Float.intBitsToFloat((int) (j11 >> 32));
        fArr[3] = Float.intBitsToFloat((int) (j11 & 4294967295L));
        fArr[4] = Float.intBitsToFloat((int) (j10 >> 32));
        fArr[5] = Float.intBitsToFloat((int) (j10 & 4294967295L));
        fArr[6] = Float.intBitsToFloat((int) (j6 >> 32));
        fArr[7] = Float.intBitsToFloat((int) (j6 & 4294967295L));
        Path path = c1555i.f7752a;
        RectF rectF2 = c1555i.f7753b;
        AbstractC4154l.m8920c(rectF2);
        float[] fArr2 = c1555i.f7754c;
        AbstractC4154l.m8920c(fArr2);
        int i10 = AbstractC1557k.f7780a[f0Var.ordinal()];
        if (i10 == 1) {
            direction = Path.Direction.CCW;
        } else {
            if (i10 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            direction = Path.Direction.CW;
        }
        path.addRoundRect(rectF2, fArr2, direction);
    }
}
