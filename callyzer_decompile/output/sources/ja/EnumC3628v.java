package ja;

import aws.sdk.kotlin.runtime.config.profile.AwsConfigParseException;
import ea.AbstractC1976f;
import ex.InterfaceC2142f;
import gc.AbstractC2562f;
import gc.C2558b;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC4154l;
import nx.AbstractC5178p;
import og.pe;
import pg.b8;
import pg.d8;
import rw.AbstractC6663m;
import ud.C7416t;
import ud.InterfaceC7411o;
import xw.InterfaceC8493a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ja.v */
/* loaded from: classes.dex */
public final class EnumC3628v {
    private static final /* synthetic */ InterfaceC8493a $ENTRIES;
    private static final /* synthetic */ EnumC3628v[] $VALUES;
    public static final EnumC3628v CONFIGURATION = new EnumC3628v("CONFIGURATION", 0, AbstractC1976f.f9248g, pe.m10834i(C3620n.f19262a, C3621o.f19263a, C3622p.f19264a, C3623q.f19265a), pe.m10834i("~", ".aws", "config"));
    public static final EnumC3628v CREDENTIAL = new EnumC3628v("CREDENTIAL", 1, AbstractC1976f.f9249h, pe.m10834i(C3624r.f19266a, C3625s.f19267a, C3626t.f19268a, C3627u.f19269a), pe.m10834i("~", ".aws", "credentials"));
    private final List<InterfaceC2142f> lineParsers;
    private final List<String> pathSegments;
    private final C2558b setting;

    private static final /* synthetic */ EnumC3628v[] $values() {
        return new EnumC3628v[]{CONFIGURATION, CREDENTIAL};
    }

    static {
        EnumC3628v[] enumC3628vArr$values = $values();
        $VALUES = enumC3628vArr$values;
        $ENTRIES = b8.m11548b(enumC3628vArr$values);
    }

    private EnumC3628v(String str, int i10, C2558b c2558b, List list, List list2) {
        this.setting = c2558b;
        this.lineParsers = list;
        this.pathSegments = list2;
    }

    public static InterfaceC8493a getEntries() {
        return $ENTRIES;
    }

    public static EnumC3628v valueOf(String str) {
        return (EnumC3628v) Enum.valueOf(EnumC3628v.class, str);
    }

    public static EnumC3628v[] values() {
        return (EnumC3628v[]) $VALUES.clone();
    }

    public final String path(InterfaceC7411o platform) {
        String string;
        AbstractC4154l.m8923f(platform, "platform");
        String str = (String) AbstractC2562f.m6572a(this.setting, platform);
        if (str != null && (string = AbstractC5178p.g0(str).toString()) != null) {
            return string;
        }
        List<String> list = this.pathSegments;
        Object value = C7416t.f35214d.getValue();
        AbstractC4154l.m8922e(value, "getValue(...)");
        return AbstractC6663m.m12748L(list, (String) value, null, null, null, 62);
    }

    public final b0 tokenOf(C3619m input, C3632z c3632z, C3631y c3631y) {
        b0 b0Var;
        AbstractC4154l.m8923f(input, "input");
        Iterator<T> it = this.lineParsers.iterator();
        while (true) {
            if (!it.hasNext()) {
                b0Var = null;
                break;
            }
            b0Var = (b0) ((InterfaceC2142f) it.next()).invoke(input, c3632z, c3631y);
            if (b0Var != null) {
                break;
            }
        }
        if (b0Var != null) {
            return b0Var;
        }
        throw new AwsConfigParseException(d8.m11583a("Encountered unexpected token", Integer.valueOf(input.f19260a)));
    }
}
