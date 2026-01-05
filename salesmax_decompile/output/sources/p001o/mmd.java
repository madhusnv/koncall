package p001o;

import com.amplifyframework.storage.s3.transfer.TransferTable;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public final class mmd {

    /* renamed from: a */
    public static final mmd f35737a = new mmd();

    /* renamed from: b */
    public static final ConcurrentHashMap f35738b = new ConcurrentHashMap();

    /* renamed from: a */
    public static final JSONObject m39359a(String str) {
        sq8.m48649h(str, "accessToken");
        return (JSONObject) f35738b.get(str);
    }

    /* renamed from: b */
    public static final void m39360b(String str, JSONObject jSONObject) {
        sq8.m48649h(str, TransferTable.COLUMN_KEY);
        sq8.m48649h(jSONObject, "value");
        f35738b.put(str, jSONObject);
    }
}
