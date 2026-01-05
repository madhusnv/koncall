package com.amplifyframework.util;

import com.amplifyframework.annotations.InternalAmplifyApi;
import hc.AbstractC2887j;
import hc.C2882e;
import hc.C2883f;
import hc.C2884g;
import hc.C2885h;
import hc.C2886i;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC4154l;
import og.pe;
import org.json.JSONObject;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class DocumentExtensionsKt {
    @InternalAmplifyApi
    public static final AbstractC2887j JsonDocument(String content) {
        AbstractC4154l.m8923f(content, "content");
        return new DocumentBuilder().process(new JSONObject(content));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final void appendTo(AbstractC2887j abstractC2887j, StringBuilder sb2) {
        if (abstractC2887j instanceof C2886i) {
            sb2.append('\"');
            sb2.append(((C2886i) abstractC2887j).f15913a);
            sb2.append('\"');
            return;
        }
        if (abstractC2887j instanceof C2882e) {
            sb2.append(((C2882e) abstractC2887j).f15909a);
            return;
        }
        int i10 = 0;
        if (abstractC2887j instanceof C2883f) {
            sb2.append('[');
            for (Object obj : (Iterable) abstractC2887j) {
                int i11 = i10 + 1;
                if (i10 < 0) {
                    pe.m10842q();
                    throw null;
                }
                appendTo((AbstractC2887j) obj, sb2);
                if (i10 < ((C2883f) abstractC2887j).f15910a.size() - 1) {
                    sb2.append(',');
                }
                i10 = i11;
            }
            sb2.append(']');
            return;
        }
        if (!(abstractC2887j instanceof C2884g)) {
            if (abstractC2887j instanceof C2885h) {
                sb2.append(((C2885h) abstractC2887j).f15912a);
                return;
            } else {
                if (abstractC2887j != 0) {
                    throw new NoWhenBranchMatchedException();
                }
                sb2.append("null");
                return;
            }
        }
        sb2.append('{');
        for (Object obj2 : ((C2884g) abstractC2887j).f15911a.entrySet()) {
            int i12 = i10 + 1;
            if (i10 < 0) {
                pe.m10842q();
                throw null;
            }
            Map.Entry entry = (Map.Entry) obj2;
            String str = (String) entry.getKey();
            AbstractC2887j abstractC2887j2 = (AbstractC2887j) entry.getValue();
            sb2.append('\"');
            sb2.append(str);
            sb2.append("\":");
            appendTo(abstractC2887j2, sb2);
            if (i10 < r8.size() - 1) {
                sb2.append(',');
            }
            i10 = i12;
        }
        sb2.append('}');
    }

    @InternalAmplifyApi
    public static final String toJsonString(AbstractC2887j abstractC2887j) {
        AbstractC4154l.m8923f(abstractC2887j, "<this>");
        StringBuilder sb2 = new StringBuilder();
        appendTo(abstractC2887j, sb2);
        return sb2.toString();
    }
}
