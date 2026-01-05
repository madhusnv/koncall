package td;

import aws.smithy.kotlin.runtime.time.ParseException;
import kotlin.jvm.internal.AbstractC4154l;
import nx.C5176n;
import nx.EnumC5177o;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: td.s */
/* loaded from: classes.dex */
public abstract class AbstractC7142s {

    /* renamed from: a */
    public static final C5176n f34375a = new C5176n("(-)?(\\d+(.(\\d+))?)E(-?\\d+)", EnumC5177o.IGNORE_CASE);

    /* renamed from: a */
    public static final C7129f m13413a(int i10, String str) {
        AbstractC4154l.m8923f(str, "str");
        AbstractC7136m.m13412b(i10, 1, str);
        char cCharAt = str.charAt(i10);
        if (cCharAt == ' ') {
            return new C7129f(i10 + 1, Character.valueOf(cCharAt));
        }
        throw new ParseException(str, "expected ` ` found `" + cCharAt + '`', i10);
    }
}
