package p001o;

import android.graphics.RectF;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class o6 implements n74 {

    /* renamed from: a */
    public final float f37814a;

    public o6(float f) {
        this.f37814a = f;
    }

    @Override // p001o.n74
    /* renamed from: a */
    public float mo20547a(RectF rectF) {
        return this.f37814a;
    }

    /* renamed from: b */
    public float m41633b() {
        return this.f37814a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof o6) && this.f37814a == ((o6) obj).f37814a;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f37814a)});
    }

    public String toString() {
        return m41633b() + "px";
    }
}
