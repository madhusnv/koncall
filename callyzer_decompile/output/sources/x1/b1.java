package x1;

import android.R;
import android.os.Build;
import k2.InterfaceC3962k;
import pg.b8;
import xw.InterfaceC8493a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class b1 {
    private static final /* synthetic */ InterfaceC8493a $ENTRIES;
    private static final /* synthetic */ b1[] $VALUES;
    public static final b1 Autofill;
    private final int stringId;
    public static final b1 Cut = new b1("Cut", 0, R.string.cut);
    public static final b1 Copy = new b1("Copy", 1, R.string.copy);
    public static final b1 Paste = new b1("Paste", 2, R.string.paste);
    public static final b1 SelectAll = new b1("SelectAll", 3, R.string.selectAll);

    private static final /* synthetic */ b1[] $values() {
        return new b1[]{Cut, Copy, Paste, SelectAll, Autofill};
    }

    static {
        Autofill = new b1("Autofill", 4, Build.VERSION.SDK_INT <= 26 ? com.websoptimization.callyzerbiz.R.string.autofill : R.string.autofill);
        b1[] b1VarArr$values = $values();
        $VALUES = b1VarArr$values;
        $ENTRIES = b8.m11548b(b1VarArr$values);
    }

    private b1(String str, int i10, int i11) {
        this.stringId = i11;
    }

    public static InterfaceC8493a getEntries() {
        return $ENTRIES;
    }

    public static b1 valueOf(String str) {
        return (b1) Enum.valueOf(b1.class, str);
    }

    public static b1[] values() {
        return (b1[]) $VALUES.clone();
    }

    public final String resolvedString(InterfaceC3962k interfaceC3962k, int i10) {
        return og.t0.m10920c(interfaceC3962k, this.stringId);
    }
}
