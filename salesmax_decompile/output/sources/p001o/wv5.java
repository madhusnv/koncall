package p001o;

/* loaded from: classes3.dex */
public class wv5 {

    /* renamed from: a */
    public final String f52723a;

    /* renamed from: b */
    public final String f52724b;

    /* renamed from: c */
    public final float f52725c;

    /* renamed from: d */
    public final EnumC17969a f52726d;

    /* renamed from: e */
    public final int f52727e;

    /* renamed from: f */
    public final float f52728f;

    /* renamed from: g */
    public final float f52729g;

    /* renamed from: h */
    public final int f52730h;

    /* renamed from: i */
    public final int f52731i;

    /* renamed from: j */
    public final float f52732j;

    /* renamed from: k */
    public final boolean f52733k;

    /* renamed from: o.wv5$a */
    public enum EnumC17969a {
        LEFT_ALIGN,
        RIGHT_ALIGN,
        CENTER
    }

    public wv5(String str, String str2, float f, EnumC17969a enumC17969a, int i, float f2, float f3, int i2, int i3, float f4, boolean z) {
        this.f52723a = str;
        this.f52724b = str2;
        this.f52725c = f;
        this.f52726d = enumC17969a;
        this.f52727e = i;
        this.f52728f = f2;
        this.f52729g = f3;
        this.f52730h = i2;
        this.f52731i = i3;
        this.f52732j = f4;
        this.f52733k = z;
    }

    public int hashCode() {
        int iHashCode = (((((int) ((((this.f52723a.hashCode() * 31) + this.f52724b.hashCode()) * 31) + this.f52725c)) * 31) + this.f52726d.ordinal()) * 31) + this.f52727e;
        long jFloatToRawIntBits = Float.floatToRawIntBits(this.f52728f);
        return (((iHashCode * 31) + ((int) (jFloatToRawIntBits ^ (jFloatToRawIntBits >>> 32)))) * 31) + this.f52730h;
    }
}
