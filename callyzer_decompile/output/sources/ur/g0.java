package ur;

import com.websoptimization.callyzerbiz.R;
import pg.b8;
import xw.InterfaceC8493a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final class g0 {
    private static final /* synthetic */ InterfaceC8493a $ENTRIES;
    private static final /* synthetic */ g0[] $VALUES;
    private final int excludeTitle;
    public static final g0 YES = new g0("YES", 0, R.string.yes);
    public static final g0 NO = new g0("NO", 1, R.string.no);

    private static final /* synthetic */ g0[] $values() {
        return new g0[]{YES, NO};
    }

    static {
        g0[] g0VarArr$values = $values();
        $VALUES = g0VarArr$values;
        $ENTRIES = b8.m11548b(g0VarArr$values);
    }

    private g0(String str, int i10, int i11) {
        this.excludeTitle = i11;
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

    public final int getExcludeTitle() {
        return this.excludeTitle;
    }
}
