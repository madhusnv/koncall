package com.amplifyframework.util;

import com.amplifyframework.annotations.InternalAmplifyApi;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Map;
import org.apache.http.message.TokenParser;
import org.json.JSONObject;
import p001o.ch3;
import p001o.sq8;
import p001o.vv5;

/* loaded from: classes5.dex */
public final class DocumentExtensionsKt {
    @InternalAmplifyApi
    public static final vv5 JsonDocument(String str) {
        sq8.m48649h(str, FirebaseAnalytics.Param.CONTENT);
        return new DocumentBuilder().process(new JSONObject(str));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final void appendTo(vv5 vv5Var, StringBuilder sb) {
        if (vv5Var instanceof vv5.C17679e) {
            sb.append(TokenParser.DQUOTE);
            sb.append(((vv5.C17679e) vv5Var).m53460e());
            sb.append(TokenParser.DQUOTE);
            return;
        }
        if (vv5Var instanceof vv5.C17675a) {
            sb.append(((vv5.C17675a) vv5Var).m53459d());
            return;
        }
        int i = 0;
        if (vv5Var instanceof vv5.C17676b) {
            sb.append('[');
            for (Object obj : (Iterable) vv5Var) {
                int i2 = i + 1;
                if (i < 0) {
                    ch3.m21256u();
                }
                appendTo((vv5) obj, sb);
                if (i < ((vv5.C17676b) vv5Var).size() - 1) {
                    sb.append(',');
                }
                i = i2;
            }
            sb.append(']');
            return;
        }
        if (!(vv5Var instanceof vv5.C17677c)) {
            if (vv5Var instanceof vv5.C17678d) {
                sb.append(((vv5.C17678d) vv5Var).m53479n());
                return;
            } else {
                if (vv5Var == 0) {
                    sb.append("null");
                    return;
                }
                return;
            }
        }
        sb.append('{');
        for (Object obj2 : ((vv5.C17677c) vv5Var).entrySet()) {
            int i3 = i + 1;
            if (i < 0) {
                ch3.m21256u();
            }
            Map.Entry entry = (Map.Entry) obj2;
            String str = (String) entry.getKey();
            vv5 vv5Var2 = (vv5) entry.getValue();
            sb.append(TokenParser.DQUOTE);
            sb.append(str);
            sb.append("\":");
            appendTo(vv5Var2, sb);
            if (i < r7.size() - 1) {
                sb.append(',');
            }
            i = i3;
        }
        sb.append('}');
    }

    @InternalAmplifyApi
    public static final String toJsonString(vv5 vv5Var) {
        sq8.m48649h(vv5Var, "<this>");
        StringBuilder sb = new StringBuilder();
        appendTo(vv5Var, sb);
        String string = sb.toString();
        sq8.m48648g(string, "toString(...)");
        return string;
    }
}
