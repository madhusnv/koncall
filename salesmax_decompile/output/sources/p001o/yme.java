package p001o;

import org.json.JSONObject;

/* loaded from: classes2.dex */
public abstract class yme {

    /* renamed from: a */
    public static final C18433a f55707a = new C18433a(null);

    /* renamed from: o.yme$a */
    public static final class C18433a {
        public C18433a() {
        }

        public /* synthetic */ C18433a(id5 id5Var) {
            this();
        }

        /* renamed from: a */
        public final boolean m58001a(String str) {
            sq8.m48649h(str, "jsonString");
            if (str.length() == 0) {
                return false;
            }
            try {
                new JSONObject(str);
                return true;
            } catch (Exception unused) {
                return false;
            }
        }
    }
}
