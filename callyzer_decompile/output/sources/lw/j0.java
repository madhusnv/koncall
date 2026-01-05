package lw;

import com.skydoves.balloon.internals.DefinitionKt;
import kx.C4262d;
import kx.InterfaceC4263e;
import pg.b8;
import xw.InterfaceC8493a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final class j0 {
    private static final /* synthetic */ InterfaceC8493a $ENTRIES;
    private static final /* synthetic */ j0[] $VALUES;
    public static final i0 Companion;
    private final InterfaceC4263e angleRange;
    public static final j0 NorthEast = new j0("NorthEast", 0, new C4262d(-90.0f, DefinitionKt.NO_Float_VALUE));
    public static final j0 SouthEast = new j0("SouthEast", 1, new C4262d(DefinitionKt.NO_Float_VALUE, 90.0f));
    public static final j0 SouthWest = new j0("SouthWest", 2, new C4262d(90.0f, 180.0f));
    public static final j0 NorthWest = new j0("NorthWest", 3, new C4262d(180.0f, 270.0f));

    private static final /* synthetic */ j0[] $values() {
        return new j0[]{NorthEast, SouthEast, SouthWest, NorthWest};
    }

    static {
        j0[] j0VarArr$values = $values();
        $VALUES = j0VarArr$values;
        $ENTRIES = b8.m11548b(j0VarArr$values);
        Companion = new i0();
    }

    private j0(String str, int i10, InterfaceC4263e interfaceC4263e) {
        this.angleRange = interfaceC4263e;
    }

    public static InterfaceC8493a getEntries() {
        return $ENTRIES;
    }

    public static j0 valueOf(String str) {
        return (j0) Enum.valueOf(j0.class, str);
    }

    public static j0[] values() {
        return (j0[]) $VALUES.clone();
    }

    public final InterfaceC4263e getAngleRange() {
        return this.angleRange;
    }
}
