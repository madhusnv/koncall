package p001o;

import android.graphics.RectF;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class whe implements n74 {

    /* renamed from: a */
    public final float f52005a;

    public whe(float f) {
        this.f52005a = f;
    }

    /* renamed from: b */
    public static float m54429b(RectF rectF) {
        return Math.min(rectF.width(), rectF.height());
    }

    @Override // p001o.n74
    /* renamed from: a */
    public float mo20547a(RectF rectF) {
        return this.f52005a * m54429b(rectF);
    }

    /* renamed from: c */
    public float m54430c() {
        return this.f52005a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof whe) && this.f52005a == ((whe) obj).f52005a;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f52005a)});
    }

    public String toString() {
        return ((int) (m54430c() * 100.0f)) + "%";
    }
}
