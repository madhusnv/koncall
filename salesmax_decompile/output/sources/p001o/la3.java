package p001o;

import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public abstract class la3 {
    /* renamed from: a */
    public static byte[] m36831a(byte[] bArr) {
        return sqi.f45790a >= 27 ? bArr : sqi.t0(m36833c(sqi.m48703H(bArr)));
    }

    /* renamed from: b */
    public static byte[] m36832b(byte[] bArr) throws JSONException {
        if (sqi.f45790a >= 27) {
            return bArr;
        }
        try {
            JSONObject jSONObject = new JSONObject(sqi.m48703H(bArr));
            StringBuilder sb = new StringBuilder("{\"keys\":[");
            JSONArray jSONArray = jSONObject.getJSONArray(UserMetadata.KEYDATA_FILENAME);
            for (int i = 0; i < jSONArray.length(); i++) {
                if (i != 0) {
                    sb.append(",");
                }
                JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                sb.append("{\"k\":\"");
                sb.append(m36834d(jSONObject2.getString("k")));
                sb.append("\",\"kid\":\"");
                sb.append(m36834d(jSONObject2.getString("kid")));
                sb.append("\",\"kty\":\"");
                sb.append(jSONObject2.getString("kty"));
                sb.append("\"}");
            }
            sb.append("]}");
            return sqi.t0(sb.toString());
        } catch (JSONException e) {
            ria.m46820d("ClearKeyUtil", "Failed to adjust response data: " + sqi.m48703H(bArr), e);
            return bArr;
        }
    }

    /* renamed from: c */
    public static String m36833c(String str) {
        return str.replace('+', '-').replace('/', '_');
    }

    /* renamed from: d */
    public static String m36834d(String str) {
        return str.replace('-', '+').replace('_', '/');
    }
}
