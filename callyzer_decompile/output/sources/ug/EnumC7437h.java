package ug;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ug.h */
/* loaded from: classes.dex */
public enum EnumC7437h {
    UNSET('0'),
    REMOTE_DEFAULT('1'),
    REMOTE_DELEGATION('2'),
    MANIFEST('3'),
    INITIALIZATION('4'),
    API('5'),
    CHILD_ACCOUNT('6'),
    TCF('7'),
    REMOTE_ENFORCED_DEFAULT('8'),
    FAILSAFE('9');

    private final char zzk;

    EnumC7437h(char c2) {
        this.zzk = c2;
    }

    public static EnumC7437h zza(char c2) {
        for (EnumC7437h enumC7437h : values()) {
            if (enumC7437h.zzk == c2) {
                return enumC7437h;
            }
        }
        return UNSET;
    }

    public final /* synthetic */ char zzb() {
        return this.zzk;
    }
}
