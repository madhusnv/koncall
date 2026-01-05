package p001o;

import java.io.IOException;

/* loaded from: classes2.dex */
public class byc extends IOException {

    /* renamed from: a */
    public final boolean f16968a;

    /* renamed from: b */
    public final int f16969b;

    public byc(String str, Throwable th, boolean z, int i) {
        super(str, th);
        this.f16968a = z;
        this.f16969b = i;
    }

    /* renamed from: a */
    public static byc m19921a(String str, Throwable th) {
        return new byc(str, th, true, 1);
    }

    /* renamed from: b */
    public static byc m19922b(String str, Throwable th) {
        return new byc(str, th, true, 0);
    }

    /* renamed from: c */
    public static byc m19923c(String str, Throwable th) {
        return new byc(str, th, true, 4);
    }

    /* renamed from: d */
    public static byc m19924d(String str) {
        return new byc(str, null, false, 1);
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return super.getMessage() + "{contentIsMalformed=" + this.f16968a + ", dataType=" + this.f16969b + "}";
    }
}
