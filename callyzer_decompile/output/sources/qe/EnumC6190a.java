package qe;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: qe.a */
/* loaded from: classes.dex */
public enum EnumC6190a {
    ABI_ARMV7A_NEON("armeabi-v7a-neon"),
    ABI_ARMV7A("armeabi-v7a"),
    ABI_ARM("armeabi"),
    ABI_X86("x86"),
    ABI_X86_64("x86_64"),
    ABI_ARM64_V8A("arm64-v8a"),
    ABI_UNKNOWN("unknown");

    private final String name;

    EnumC6190a(String str) {
        this.name = str;
    }

    public static EnumC6190a from(String str) {
        if (str == null) {
            return ABI_UNKNOWN;
        }
        EnumC6190a enumC6190a = ABI_ARM;
        if (str.equals(enumC6190a.getName())) {
            return enumC6190a;
        }
        EnumC6190a enumC6190a2 = ABI_ARMV7A;
        if (str.equals(enumC6190a2.getName())) {
            return enumC6190a2;
        }
        EnumC6190a enumC6190a3 = ABI_ARMV7A_NEON;
        if (str.equals(enumC6190a3.getName())) {
            return enumC6190a3;
        }
        EnumC6190a enumC6190a4 = ABI_ARM64_V8A;
        if (str.equals(enumC6190a4.getName())) {
            return enumC6190a4;
        }
        EnumC6190a enumC6190a5 = ABI_X86;
        if (str.equals(enumC6190a5.getName())) {
            return enumC6190a5;
        }
        EnumC6190a enumC6190a6 = ABI_X86_64;
        return str.equals(enumC6190a6.getName()) ? enumC6190a6 : ABI_UNKNOWN;
    }

    public String getName() {
        return this.name;
    }
}
