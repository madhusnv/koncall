package ia;

import bc.C0642a;
import pg.b8;
import xw.InterfaceC8493a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ia.b */
/* loaded from: classes.dex */
public final class EnumC3210b {
    private static final /* synthetic */ InterfaceC8493a $ENTRIES;
    private static final /* synthetic */ EnumC3210b[] $VALUES;
    public static final C3209a Companion;
    public static final EnumC3210b IPv4 = new EnumC3210b("IPv4", 0, new C0642a("http://169.254.169.254"));
    public static final EnumC3210b IPv6 = new EnumC3210b("IPv6", 1, new C0642a("http://[fd00:ec2::254]"));
    private final C0642a defaultEndpoint;

    private static final /* synthetic */ EnumC3210b[] $values() {
        return new EnumC3210b[]{IPv4, IPv6};
    }

    static {
        EnumC3210b[] enumC3210bArr$values = $values();
        $VALUES = enumC3210bArr$values;
        $ENTRIES = b8.m11548b(enumC3210bArr$values);
        Companion = new C3209a();
    }

    private EnumC3210b(String str, int i10, C0642a c0642a) {
        this.defaultEndpoint = c0642a;
    }

    public static InterfaceC8493a getEntries() {
        return $ENTRIES;
    }

    public static EnumC3210b valueOf(String str) {
        return (EnumC3210b) Enum.valueOf(EnumC3210b.class, str);
    }

    public static EnumC3210b[] values() {
        return (EnumC3210b[]) $VALUES.clone();
    }

    public final C0642a getDefaultEndpoint$aws_config() {
        return this.defaultEndpoint;
    }
}
