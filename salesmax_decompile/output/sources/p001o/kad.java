package p001o;

/* loaded from: classes2.dex */
public final class kad {

    /* renamed from: d */
    public static final kad f31765d = new kad(1.0f);

    /* renamed from: e */
    public static final String f31766e = sqi.B0(0);

    /* renamed from: f */
    public static final String f31767f = sqi.B0(1);

    /* renamed from: a */
    public final float f31768a;

    /* renamed from: b */
    public final float f31769b;

    /* renamed from: c */
    public final int f31770c;

    public kad(float f) {
        this(f, 1.0f);
    }

    /* renamed from: a */
    public long m35247a(long j) {
        return j * this.f31770c;
    }

    /* renamed from: b */
    public kad m35248b(float f) {
        return new kad(f, this.f31769b);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || kad.class != obj.getClass()) {
            return false;
        }
        kad kadVar = (kad) obj;
        return this.f31768a == kadVar.f31768a && this.f31769b == kadVar.f31769b;
    }

    public int hashCode() {
        return ((527 + Float.floatToRawIntBits(this.f31768a)) * 31) + Float.floatToRawIntBits(this.f31769b);
    }

    public String toString() {
        return sqi.m48702G("PlaybackParameters(speed=%.2f, pitch=%.2f)", Float.valueOf(this.f31768a), Float.valueOf(this.f31769b));
    }

    public kad(float f, float f2) {
        op0.m42511a(f > 0.0f);
        op0.m42511a(f2 > 0.0f);
        this.f31768a = f;
        this.f31769b = f2;
        this.f31770c = Math.round(f * 1000.0f);
    }
}
