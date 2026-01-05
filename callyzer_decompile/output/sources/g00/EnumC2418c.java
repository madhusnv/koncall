package g00;

import org.bouncycastle.jcajce.provider.digest.AbstractC5601a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: g00.c */
/* loaded from: classes3.dex */
public enum EnumC2418c {
    ERROR(40, "ERROR"),
    WARN(30, "WARN"),
    INFO(20, "INFO"),
    DEBUG(10, "DEBUG"),
    TRACE(0, "TRACE");

    private final int levelInt;
    private final String levelStr;

    EnumC2418c(int i10, String str) {
        this.levelInt = i10;
        this.levelStr = str;
    }

    public static EnumC2418c intToLevel(int i10) {
        if (i10 == 0) {
            return TRACE;
        }
        if (i10 == 10) {
            return DEBUG;
        }
        if (i10 == 20) {
            return INFO;
        }
        if (i10 == 30) {
            return WARN;
        }
        if (i10 == 40) {
            return ERROR;
        }
        throw new IllegalArgumentException(AbstractC5601a.m11232c(i10, "Level integer [", "] not recognized."));
    }

    public int toInt() {
        return this.levelInt;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.levelStr;
    }
}
