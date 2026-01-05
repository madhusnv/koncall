package ky;

import hy.InterfaceC3055f;
import kotlin.jvm.internal.AbstractC4154l;
import nx.AbstractC5178p;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ky.u */
/* loaded from: classes3.dex */
public final class C4289u {
    /* renamed from: a */
    public final String m8994a(InterfaceC3055f descriptor, String serialName) {
        AbstractC4154l.m8923f(descriptor, "descriptor");
        AbstractC4154l.m8923f(serialName, "serialName");
        StringBuilder sb2 = new StringBuilder(serialName.length() * 2);
        Character chValueOf = null;
        int i10 = 0;
        for (int i11 = 0; i11 < serialName.length(); i11++) {
            char cCharAt = serialName.charAt(i11);
            if (Character.isUpperCase(cCharAt)) {
                if (i10 == 0 && sb2.length() > 0 && AbstractC5178p.m10102M(sb2) != '_') {
                    sb2.append('_');
                }
                if (chValueOf != null) {
                    sb2.append(chValueOf.charValue());
                }
                i10++;
                chValueOf = Character.valueOf(Character.toLowerCase(cCharAt));
            } else {
                if (chValueOf != null) {
                    if (i10 > 1 && Character.isLetter(cCharAt)) {
                        sb2.append('_');
                    }
                    sb2.append(chValueOf.charValue());
                    chValueOf = null;
                    i10 = 0;
                }
                sb2.append(cCharAt);
            }
        }
        if (chValueOf != null) {
            sb2.append(chValueOf.charValue());
        }
        String string = sb2.toString();
        AbstractC4154l.m8922e(string, "toString(...)");
        return string;
    }

    public final String toString() {
        return "kotlinx.serialization.json.JsonNamingStrategy.SnakeCase";
    }
}
