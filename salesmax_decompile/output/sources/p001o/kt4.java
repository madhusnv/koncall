package p001o;

import ai.salesmax.SuperfoneApplication;
import com.amplifyframework.core.model.ModelIdentifier;
import com.amplifyframework.util.GsonFactory;
import com.google.gson.Gson;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public class kt4 {

    /* renamed from: g */
    public static Map f32688g = new HashMap();

    /* renamed from: b */
    public Map f32690b;

    /* renamed from: d */
    public String f32692d;

    /* renamed from: e */
    public String f32693e;

    /* renamed from: a */
    public Gson f32689a = GsonFactory.instance();

    /* renamed from: c */
    public Map f32691c = new HashMap();

    /* renamed from: f */
    public int f32694f = 10;

    /* renamed from: o.kt4$a */
    public enum EnumC14921a {
        CONTACT,
        ENGAGEMENT,
        ACTIVITY
    }

    public kt4(String str, String str2) {
        this.f32690b = new HashMap();
        this.f32690b = (Map) this.f32689a.fromJson(SuperfoneApplication.f225c.m127c().m3260v(str, str2), Map.class);
        this.f32692d = str;
        this.f32693e = str2;
    }

    /* renamed from: c */
    public static synchronized kt4 m36202c(String str, String str2) {
        String str3;
        str3 = str + ModelIdentifier.Helper.PRIMARY_KEY_DELIMITER + str2;
        if (!f32688g.containsKey(str3)) {
            f32688g.put(str3, new kt4(str, str2));
        }
        return (kt4) f32688g.get(str3);
    }

    /* renamed from: a */
    public void m36203a(EnumC14921a enumC14921a, String str) {
        try {
            ArrayList arrayList = new ArrayList(m36205d(enumC14921a));
            arrayList.add(0, str);
            m36204b(arrayList);
            this.f32690b.put(enumC14921a.name(), arrayList);
            SuperfoneApplication.f225c.m127c().V0(this.f32692d, this.f32693e, ja8.f30034b.toJson(this.f32690b));
        } catch (Throwable unused) {
        }
    }

    /* renamed from: b */
    public final void m36204b(List list) {
        for (int size = list.size(); size > this.f32694f; size--) {
            list.remove(size - 1);
        }
    }

    /* renamed from: d */
    public List m36205d(EnumC14921a enumC14921a) {
        return (List) this.f32690b.getOrDefault(enumC14921a.name(), Collections.emptyList());
    }
}
