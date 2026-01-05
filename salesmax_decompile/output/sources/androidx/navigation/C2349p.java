package androidx.navigation;

import androidx.navigation.AbstractC2348o;
import java.util.LinkedHashMap;
import java.util.Map;
import p001o.id5;
import p001o.isa;
import p001o.sq8;

/* renamed from: androidx.navigation.p */
/* loaded from: classes2.dex */
public class C2349p {

    /* renamed from: b */
    public static final a f9702b = new a(null);

    /* renamed from: c */
    public static final Map f9703c = new LinkedHashMap();

    /* renamed from: a */
    public final Map f9704a = new LinkedHashMap();

    /* renamed from: androidx.navigation.p$a */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(id5 id5Var) {
            this();
        }

        /* renamed from: a */
        public final String m8958a(Class cls) {
            sq8.m48649h(cls, "navigatorClass");
            String strValue = (String) C2349p.f9703c.get(cls);
            if (strValue == null) {
                AbstractC2348o.b bVar = (AbstractC2348o.b) cls.getAnnotation(AbstractC2348o.b.class);
                strValue = bVar != null ? bVar.value() : null;
                if (!m8959b(strValue)) {
                    throw new IllegalArgumentException(("No @Navigator.Name annotation found for " + cls.getSimpleName()).toString());
                }
                C2349p.f9703c.put(cls, strValue);
            }
            sq8.m48646e(strValue);
            return strValue;
        }

        /* renamed from: b */
        public final boolean m8959b(String str) {
            if (str != null) {
                return str.length() > 0;
            }
            return false;
        }
    }

    /* renamed from: b */
    public final AbstractC2348o m8954b(AbstractC2348o abstractC2348o) {
        sq8.m48649h(abstractC2348o, "navigator");
        return m8955c(f9702b.m8958a(abstractC2348o.getClass()), abstractC2348o);
    }

    /* renamed from: c */
    public AbstractC2348o m8955c(String str, AbstractC2348o abstractC2348o) {
        sq8.m48649h(str, "name");
        sq8.m48649h(abstractC2348o, "navigator");
        if (!f9702b.m8959b(str)) {
            throw new IllegalArgumentException("navigator name cannot be an empty string".toString());
        }
        AbstractC2348o abstractC2348o2 = (AbstractC2348o) this.f9704a.get(str);
        if (sq8.m48644c(abstractC2348o2, abstractC2348o)) {
            return abstractC2348o;
        }
        boolean z = false;
        if (abstractC2348o2 != null && abstractC2348o2.m8950c()) {
            z = true;
        }
        if (!(!z)) {
            throw new IllegalStateException(("Navigator " + abstractC2348o + " is replacing an already attached " + abstractC2348o2).toString());
        }
        if (!abstractC2348o.m8950c()) {
            return (AbstractC2348o) this.f9704a.put(str, abstractC2348o);
        }
        throw new IllegalStateException(("Navigator " + abstractC2348o + " is already attached to another NavController").toString());
    }

    /* renamed from: d */
    public AbstractC2348o m8956d(String str) {
        sq8.m48649h(str, "name");
        if (!f9702b.m8959b(str)) {
            throw new IllegalArgumentException("navigator name cannot be an empty string".toString());
        }
        AbstractC2348o abstractC2348o = (AbstractC2348o) this.f9704a.get(str);
        if (abstractC2348o != null) {
            return abstractC2348o;
        }
        throw new IllegalStateException("Could not find Navigator with name \"" + str + "\". You must call NavController.addNavigator() for each navigation type.");
    }

    /* renamed from: e */
    public final Map m8957e() {
        return isa.m32693t(this.f9704a);
    }
}
