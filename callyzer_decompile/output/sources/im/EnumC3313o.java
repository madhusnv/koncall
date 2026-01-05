package im;

import com.websoptimization.callyzerbiz.R;
import pg.b8;
import xw.InterfaceC8493a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: im.o */
/* loaded from: classes3.dex */
public final class EnumC3313o {
    private static final /* synthetic */ InterfaceC8493a $ENTRIES;
    private static final /* synthetic */ EnumC3313o[] $VALUES;
    public static final EnumC3313o NoOptionSelected = new EnumC3313o("NoOptionSelected", 0, 0);
    public static final EnumC3313o OnlyMe = new EnumC3313o("OnlyMe", 1, R.string.only_me);
    public static final EnumC3313o SpecificEmployee = new EnumC3313o("SpecificEmployee", 2, R.string.specific_employee);
    private final int employeeType;

    private static final /* synthetic */ EnumC3313o[] $values() {
        return new EnumC3313o[]{NoOptionSelected, OnlyMe, SpecificEmployee};
    }

    static {
        EnumC3313o[] enumC3313oArr$values = $values();
        $VALUES = enumC3313oArr$values;
        $ENTRIES = b8.m11548b(enumC3313oArr$values);
    }

    private EnumC3313o(String str, int i10, int i11) {
        this.employeeType = i11;
    }

    public static InterfaceC8493a getEntries() {
        return $ENTRIES;
    }

    public static EnumC3313o valueOf(String str) {
        return (EnumC3313o) Enum.valueOf(EnumC3313o.class, str);
    }

    public static EnumC3313o[] values() {
        return (EnumC3313o[]) $VALUES.clone();
    }

    public final int getEmployeeType() {
        return this.employeeType;
    }
}
