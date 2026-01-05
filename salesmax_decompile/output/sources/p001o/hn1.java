package p001o;

import android.os.Bundle;
import com.amplifyframework.storage.s3.transfer.TransferTable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public final class hn1 {

    /* renamed from: a */
    public static final hn1 f27198a = new hn1();

    /* renamed from: b */
    public static final Map f27199b;

    /* renamed from: o.hn1$a */
    public static final class C14005a implements InterfaceC14012h {
        @Override // p001o.hn1.InterfaceC14012h
        /* renamed from: a */
        public void mo30841a(Bundle bundle, String str, Object obj) {
            sq8.m48649h(bundle, "bundle");
            sq8.m48649h(str, TransferTable.COLUMN_KEY);
            sq8.m48649h(obj, "value");
            bundle.putBoolean(str, ((Boolean) obj).booleanValue());
        }
    }

    /* renamed from: o.hn1$b */
    public static final class C14006b implements InterfaceC14012h {
        @Override // p001o.hn1.InterfaceC14012h
        /* renamed from: a */
        public void mo30841a(Bundle bundle, String str, Object obj) {
            sq8.m48649h(bundle, "bundle");
            sq8.m48649h(str, TransferTable.COLUMN_KEY);
            sq8.m48649h(obj, "value");
            bundle.putInt(str, ((Integer) obj).intValue());
        }
    }

    /* renamed from: o.hn1$c */
    public static final class C14007c implements InterfaceC14012h {
        @Override // p001o.hn1.InterfaceC14012h
        /* renamed from: a */
        public void mo30841a(Bundle bundle, String str, Object obj) {
            sq8.m48649h(bundle, "bundle");
            sq8.m48649h(str, TransferTable.COLUMN_KEY);
            sq8.m48649h(obj, "value");
            bundle.putLong(str, ((Long) obj).longValue());
        }
    }

    /* renamed from: o.hn1$d */
    public static final class C14008d implements InterfaceC14012h {
        @Override // p001o.hn1.InterfaceC14012h
        /* renamed from: a */
        public void mo30841a(Bundle bundle, String str, Object obj) {
            sq8.m48649h(bundle, "bundle");
            sq8.m48649h(str, TransferTable.COLUMN_KEY);
            sq8.m48649h(obj, "value");
            bundle.putDouble(str, ((Double) obj).doubleValue());
        }
    }

    /* renamed from: o.hn1$e */
    public static final class C14009e implements InterfaceC14012h {
        @Override // p001o.hn1.InterfaceC14012h
        /* renamed from: a */
        public void mo30841a(Bundle bundle, String str, Object obj) {
            sq8.m48649h(bundle, "bundle");
            sq8.m48649h(str, TransferTable.COLUMN_KEY);
            sq8.m48649h(obj, "value");
            bundle.putString(str, (String) obj);
        }
    }

    /* renamed from: o.hn1$f */
    public static final class C14010f implements InterfaceC14012h {
        @Override // p001o.hn1.InterfaceC14012h
        /* renamed from: a */
        public void mo30841a(Bundle bundle, String str, Object obj) {
            sq8.m48649h(bundle, "bundle");
            sq8.m48649h(str, TransferTable.COLUMN_KEY);
            sq8.m48649h(obj, "value");
            throw new IllegalArgumentException("Unexpected type from JSON");
        }
    }

    /* renamed from: o.hn1$g */
    public static final class C14011g implements InterfaceC14012h {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // p001o.hn1.InterfaceC14012h
        /* renamed from: a */
        public void mo30841a(Bundle bundle, String str, Object obj) throws JSONException {
            sq8.m48649h(bundle, "bundle");
            sq8.m48649h(str, TransferTable.COLUMN_KEY);
            sq8.m48649h(obj, "value");
            JSONArray jSONArray = (JSONArray) obj;
            ArrayList arrayList = new ArrayList();
            if (jSONArray.length() == 0) {
                bundle.putStringArrayList(str, arrayList);
                return;
            }
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                Object obj2 = jSONArray.get(i);
                if (!(obj2 instanceof String)) {
                    throw new IllegalArgumentException("Unexpected type in an array: " + obj2.getClass());
                }
                arrayList.add(obj2);
            }
            bundle.putStringArrayList(str, arrayList);
        }
    }

    /* renamed from: o.hn1$h */
    public interface InterfaceC14012h {
        /* renamed from: a */
        void mo30841a(Bundle bundle, String str, Object obj);
    }

    static {
        HashMap map = new HashMap();
        f27199b = map;
        map.put(Boolean.class, new C14005a());
        map.put(Integer.class, new C14006b());
        map.put(Long.class, new C14007c());
        map.put(Double.class, new C14008d());
        map.put(String.class, new C14009e());
        map.put(String[].class, new C14010f());
        map.put(JSONArray.class, new C14011g());
    }

    /* renamed from: a */
    public static final Bundle m30840a(JSONObject jSONObject) throws JSONException {
        sq8.m48649h(jSONObject, "jsonObject");
        Bundle bundle = new Bundle();
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            Object obj = jSONObject.get(next);
            if (obj != JSONObject.NULL) {
                if (obj instanceof JSONObject) {
                    bundle.putBundle(next, m30840a((JSONObject) obj));
                } else {
                    InterfaceC14012h interfaceC14012h = (InterfaceC14012h) f27199b.get(obj.getClass());
                    if (interfaceC14012h == null) {
                        throw new IllegalArgumentException("Unsupported type: " + obj.getClass());
                    }
                    sq8.m48648g(next, TransferTable.COLUMN_KEY);
                    sq8.m48648g(obj, "value");
                    interfaceC14012h.mo30841a(bundle, next, obj);
                }
            }
        }
        return bundle;
    }
}
