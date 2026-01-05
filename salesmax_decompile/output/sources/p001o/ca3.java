package p001o;

import android.graphics.RectF;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class ca3 implements n74 {

    /* renamed from: a */
    public final float f17585a;

    public ca3(float f) {
        this.f17585a = f;
    }

    /* renamed from: b */
    public static ca3 m20545b(o6 o6Var) {
        return new ca3(o6Var.m41633b());
    }

    /* renamed from: c */
    public static float m20546c(RectF rectF) {
        return Math.min(rectF.width() / 2.0f, rectF.height() / 2.0f);
    }

    @Override // p001o.n74
    /* renamed from: a */
    public float mo20547a(RectF rectF) {
        return pza.m44555a(this.f17585a, 0.0f, m20546c(rectF));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ca3) && this.f17585a == ((ca3) obj).f17585a;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f17585a)});
    }
}
