package p001o;

/* loaded from: classes3.dex */
public class psa {

    /* renamed from: a */
    public final String f40504a;

    /* renamed from: b */
    public final float f40505b;

    /* renamed from: c */
    public final float f40506c;

    public psa(String str, float f, float f2) {
        this.f40504a = str;
        this.f40506c = f2;
        this.f40505b = f;
    }

    /* renamed from: a */
    public boolean m44132a(String str) {
        if (this.f40504a.equalsIgnoreCase(str)) {
            return true;
        }
        if (this.f40504a.endsWith("\r")) {
            String str2 = this.f40504a;
            if (str2.substring(0, str2.length() - 1).equalsIgnoreCase(str)) {
                return true;
            }
        }
        return false;
    }
}
