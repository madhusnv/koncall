package p001o;

import android.graphics.RectF;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class x60 implements n74 {

    /* renamed from: a */
    public final n74 f53257a;

    /* renamed from: b */
    public final float f53258b;

    public x60(float f, n74 n74Var) {
        while (n74Var instanceof x60) {
            n74Var = ((x60) n74Var).f53257a;
            f += ((x60) n74Var).f53258b;
        }
        this.f53257a = n74Var;
        this.f53258b = f;
    }

    @Override // p001o.n74
    /* renamed from: a */
    public float mo20547a(RectF rectF) {
        return Math.max(0.0f, this.f53257a.mo20547a(rectF) + this.f53258b);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x60)) {
            return false;
        }
        x60 x60Var = (x60) obj;
        return this.f53257a.equals(x60Var.f53257a) && this.f53258b == x60Var.f53258b;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.f53257a, Float.valueOf(this.f53258b)});
    }
}
