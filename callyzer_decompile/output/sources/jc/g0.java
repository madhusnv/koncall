package jc;

import kx.C4266h;
import org.bouncycastle.asn1.x509.DisplayText;
import pg.b8;
import xw.InterfaceC8493a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class g0 implements Comparable {
    private static final /* synthetic */ InterfaceC8493a $ENTRIES;
    private static final /* synthetic */ g0[] $VALUES;
    public static final f0 Companion;
    private final C4266h range;
    public static final g0 INFORMATION = new g0("INFORMATION", 0, new C4266h(100, 199, 1));
    public static final g0 SUCCESS = new g0("SUCCESS", 1, new C4266h(DisplayText.DISPLAY_TEXT_MAXIMUM_SIZE, 299, 1));
    public static final g0 REDIRECT = new g0("REDIRECT", 2, new C4266h(300, 399, 1));
    public static final g0 CLIENT_ERROR = new g0("CLIENT_ERROR", 3, new C4266h(400, 499, 1));
    public static final g0 SERVER_ERROR = new g0("SERVER_ERROR", 4, new C4266h(500, 599, 1));

    private static final /* synthetic */ g0[] $values() {
        return new g0[]{INFORMATION, SUCCESS, REDIRECT, CLIENT_ERROR, SERVER_ERROR};
    }

    static {
        g0[] g0VarArr$values = $values();
        $VALUES = g0VarArr$values;
        $ENTRIES = b8.m11548b(g0VarArr$values);
        Companion = new f0();
    }

    private g0(String str, int i10, C4266h c4266h) {
        this.range = c4266h;
    }

    public static InterfaceC8493a getEntries() {
        return $ENTRIES;
    }

    public static g0 valueOf(String str) {
        return (g0) Enum.valueOf(g0.class, str);
    }

    public static g0[] values() {
        return (g0[]) $VALUES.clone();
    }

    public boolean contains(int i10) {
        return this.range.m8986h(i10);
    }

    public boolean isEmpty() {
        return this.range.isEmpty();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* bridge */ /* synthetic */ boolean contains(Comparable comparable) {
        return contains(((Number) comparable).intValue());
    }

    public Integer getEndInclusive() {
        return Integer.valueOf(this.range.f21647b);
    }

    public Integer getStart() {
        return Integer.valueOf(this.range.f21646a);
    }
}
