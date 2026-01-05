package y3;

import android.R;
import android.os.Build;
import kotlin.NoWhenBranchMatchedException;
import pg.b8;
import xw.InterfaceC8493a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: y3.c */
/* loaded from: classes.dex */
public final class EnumC8539c {
    private static final /* synthetic */ InterfaceC8493a $ENTRIES;
    private static final /* synthetic */ EnumC8539c[] $VALUES;

    /* renamed from: id, reason: collision with root package name */
    private final int f44866id;
    private final int order;
    public static final EnumC8539c Copy = new EnumC8539c("Copy", 0, 0);
    public static final EnumC8539c Paste = new EnumC8539c("Paste", 1, 1);
    public static final EnumC8539c Cut = new EnumC8539c("Cut", 2, 2);
    public static final EnumC8539c SelectAll = new EnumC8539c("SelectAll", 3, 3);
    public static final EnumC8539c Autofill = new EnumC8539c("Autofill", 4, 4);

    private static final /* synthetic */ EnumC8539c[] $values() {
        return new EnumC8539c[]{Copy, Paste, Cut, SelectAll, Autofill};
    }

    static {
        EnumC8539c[] enumC8539cArr$values = $values();
        $VALUES = enumC8539cArr$values;
        $ENTRIES = b8.m11548b(enumC8539cArr$values);
    }

    private EnumC8539c(String str, int i10, int i11) {
        this.f44866id = i11;
        this.order = i11;
    }

    public static InterfaceC8493a getEntries() {
        return $ENTRIES;
    }

    public static EnumC8539c valueOf(String str) {
        return (EnumC8539c) Enum.valueOf(EnumC8539c.class, str);
    }

    public static EnumC8539c[] values() {
        return (EnumC8539c[]) $VALUES.clone();
    }

    public final int getId() {
        return this.f44866id;
    }

    public final int getOrder() {
        return this.order;
    }

    public final int getTitleResource() {
        int i10 = AbstractC8538b.f41482a[ordinal()];
        if (i10 == 1) {
            return R.string.copy;
        }
        if (i10 == 2) {
            return R.string.paste;
        }
        if (i10 == 3) {
            return R.string.cut;
        }
        if (i10 == 4) {
            return R.string.selectAll;
        }
        if (i10 == 5) {
            return Build.VERSION.SDK_INT <= 26 ? com.websoptimization.callyzerbiz.R.string.autofill : R.string.autofill;
        }
        throw new NoWhenBranchMatchedException();
    }
}
