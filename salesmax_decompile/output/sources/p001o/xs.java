package p001o;

import android.content.Intent;
import android.os.Bundle;
import androidx.activity.result.ActivityResult;
import androidx.lifecycle.AbstractC2139h;
import androidx.lifecycle.InterfaceC2142k;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes2.dex */
public abstract class xs {

    /* renamed from: a */
    public final Map f54194a = new HashMap();

    /* renamed from: b */
    public final Map f54195b = new HashMap();

    /* renamed from: c */
    public final Map f54196c = new HashMap();

    /* renamed from: d */
    public ArrayList f54197d = new ArrayList();

    /* renamed from: e */
    public final transient Map f54198e = new HashMap();

    /* renamed from: f */
    public final Map f54199f = new HashMap();

    /* renamed from: g */
    public final Bundle f54200g = new Bundle();

    /* renamed from: o.xs$a */
    public class C18233a implements InterfaceC2142k {

        /* renamed from: a */
        public final /* synthetic */ String f54201a;

        /* renamed from: b */
        public final /* synthetic */ ns f54202b;

        /* renamed from: c */
        public final /* synthetic */ os f54203c;

        public C18233a(String str, ns nsVar, os osVar) {
            this.f54201a = str;
            this.f54202b = nsVar;
            this.f54203c = osVar;
        }

        @Override // androidx.lifecycle.InterfaceC2142k
        /* renamed from: o */
        public void mo3717o(xca xcaVar, AbstractC2139h.a aVar) {
            if (!AbstractC2139h.a.ON_START.equals(aVar)) {
                if (AbstractC2139h.a.ON_STOP.equals(aVar)) {
                    xs.this.f54198e.remove(this.f54201a);
                    return;
                } else {
                    if (AbstractC2139h.a.ON_DESTROY.equals(aVar)) {
                        xs.this.m56743l(this.f54201a);
                        return;
                    }
                    return;
                }
            }
            xs.this.f54198e.put(this.f54201a, new C18236d(this.f54202b, this.f54203c));
            if (xs.this.f54199f.containsKey(this.f54201a)) {
                Object obj = xs.this.f54199f.get(this.f54201a);
                xs.this.f54199f.remove(this.f54201a);
                this.f54202b.mo6217a(obj);
            }
            ActivityResult activityResult = (ActivityResult) xs.this.f54200g.getParcelable(this.f54201a);
            if (activityResult != null) {
                xs.this.f54200g.remove(this.f54201a);
                this.f54202b.mo6217a(this.f54203c.mo6231c(activityResult.m3726b(), activityResult.m3725a()));
            }
        }
    }

    /* renamed from: o.xs$b */
    public class C18234b extends ws {

        /* renamed from: a */
        public final /* synthetic */ String f54205a;

        /* renamed from: b */
        public final /* synthetic */ os f54206b;

        public C18234b(String str, os osVar) {
            this.f54205a = str;
            this.f54206b = osVar;
        }

        @Override // p001o.ws
        /* renamed from: a */
        public os mo6147a() {
            return this.f54206b;
        }

        @Override // p001o.ws
        /* renamed from: c */
        public void mo6148c(Object obj, ks ksVar) throws Exception {
            Integer num = (Integer) xs.this.f54195b.get(this.f54205a);
            if (num != null) {
                xs.this.f54197d.add(this.f54205a);
                try {
                    xs.this.mo3716f(num.intValue(), this.f54206b, obj, ksVar);
                    return;
                } catch (Exception e) {
                    xs.this.f54197d.remove(this.f54205a);
                    throw e;
                }
            }
            throw new IllegalStateException("Attempting to launch an unregistered ActivityResultLauncher with contract " + this.f54206b + " and input " + obj + ". You must ensure the ActivityResultLauncher is registered before calling launch().");
        }

        @Override // p001o.ws
        /* renamed from: d */
        public void mo6149d() {
            xs.this.m56743l(this.f54205a);
        }
    }

    /* renamed from: o.xs$c */
    public class C18235c extends ws {

        /* renamed from: a */
        public final /* synthetic */ String f54208a;

        /* renamed from: b */
        public final /* synthetic */ os f54209b;

        public C18235c(String str, os osVar) {
            this.f54208a = str;
            this.f54209b = osVar;
        }

        @Override // p001o.ws
        /* renamed from: a */
        public os mo6147a() {
            return this.f54209b;
        }

        @Override // p001o.ws
        /* renamed from: c */
        public void mo6148c(Object obj, ks ksVar) throws Exception {
            Integer num = (Integer) xs.this.f54195b.get(this.f54208a);
            if (num != null) {
                xs.this.f54197d.add(this.f54208a);
                try {
                    xs.this.mo3716f(num.intValue(), this.f54209b, obj, ksVar);
                    return;
                } catch (Exception e) {
                    xs.this.f54197d.remove(this.f54208a);
                    throw e;
                }
            }
            throw new IllegalStateException("Attempting to launch an unregistered ActivityResultLauncher with contract " + this.f54209b + " and input " + obj + ". You must ensure the ActivityResultLauncher is registered before calling launch().");
        }

        @Override // p001o.ws
        /* renamed from: d */
        public void mo6149d() {
            xs.this.m56743l(this.f54208a);
        }
    }

    /* renamed from: o.xs$d */
    public static class C18236d {

        /* renamed from: a */
        public final ns f54211a;

        /* renamed from: b */
        public final os f54212b;

        public C18236d(ns nsVar, os osVar) {
            this.f54211a = nsVar;
            this.f54212b = osVar;
        }
    }

    /* renamed from: o.xs$e */
    public static class C18237e {

        /* renamed from: a */
        public final AbstractC2139h f54213a;

        /* renamed from: b */
        public final ArrayList f54214b = new ArrayList();

        public C18237e(AbstractC2139h abstractC2139h) {
            this.f54213a = abstractC2139h;
        }

        /* renamed from: a */
        public void m56744a(InterfaceC2142k interfaceC2142k) {
            this.f54213a.mo6521a(interfaceC2142k);
            this.f54214b.add(interfaceC2142k);
        }

        /* renamed from: b */
        public void m56745b() {
            Iterator it = this.f54214b.iterator();
            while (it.hasNext()) {
                this.f54213a.mo6524d((InterfaceC2142k) it.next());
            }
            this.f54214b.clear();
        }
    }

    /* renamed from: a */
    public final void m56733a(int i, String str) {
        this.f54194a.put(Integer.valueOf(i), str);
        this.f54195b.put(str, Integer.valueOf(i));
    }

    /* renamed from: b */
    public final boolean m56734b(int i, int i2, Intent intent) {
        String str = (String) this.f54194a.get(Integer.valueOf(i));
        if (str == null) {
            return false;
        }
        m56736d(str, i2, intent, (C18236d) this.f54198e.get(str));
        return true;
    }

    /* renamed from: c */
    public final boolean m56735c(int i, Object obj) {
        ns nsVar;
        String str = (String) this.f54194a.get(Integer.valueOf(i));
        if (str == null) {
            return false;
        }
        C18236d c18236d = (C18236d) this.f54198e.get(str);
        if (c18236d == null || (nsVar = c18236d.f54211a) == null) {
            this.f54200g.remove(str);
            this.f54199f.put(str, obj);
            return true;
        }
        if (!this.f54197d.remove(str)) {
            return true;
        }
        nsVar.mo6217a(obj);
        return true;
    }

    /* renamed from: d */
    public final void m56736d(String str, int i, Intent intent, C18236d c18236d) {
        if (c18236d == null || c18236d.f54211a == null || !this.f54197d.contains(str)) {
            this.f54199f.remove(str);
            this.f54200g.putParcelable(str, new ActivityResult(i, intent));
        } else {
            c18236d.f54211a.mo6217a(c18236d.f54212b.mo6231c(i, intent));
            this.f54197d.remove(str);
        }
    }

    /* renamed from: e */
    public final int m56737e() {
        int iMo22613g = vbe.f50091a.mo22613g(2147418112);
        while (true) {
            int i = iMo22613g + 65536;
            if (!this.f54194a.containsKey(Integer.valueOf(i))) {
                return i;
            }
            iMo22613g = vbe.f50091a.mo22613g(2147418112);
        }
    }

    /* renamed from: f */
    public abstract void mo3716f(int i, os osVar, Object obj, ks ksVar);

    /* renamed from: g */
    public final void m56738g(Bundle bundle) {
        if (bundle == null) {
            return;
        }
        ArrayList<Integer> integerArrayList = bundle.getIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS");
        ArrayList<String> stringArrayList = bundle.getStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS");
        if (stringArrayList == null || integerArrayList == null) {
            return;
        }
        this.f54197d = bundle.getStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS");
        this.f54200g.putAll(bundle.getBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT"));
        for (int i = 0; i < stringArrayList.size(); i++) {
            String str = stringArrayList.get(i);
            if (this.f54195b.containsKey(str)) {
                Integer num = (Integer) this.f54195b.remove(str);
                if (!this.f54200g.containsKey(str)) {
                    this.f54194a.remove(num);
                }
            }
            m56733a(integerArrayList.get(i).intValue(), stringArrayList.get(i));
        }
    }

    /* renamed from: h */
    public final void m56739h(Bundle bundle) {
        bundle.putIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS", new ArrayList<>(this.f54195b.values()));
        bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS", new ArrayList<>(this.f54195b.keySet()));
        bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS", new ArrayList<>(this.f54197d));
        bundle.putBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT", (Bundle) this.f54200g.clone());
    }

    /* renamed from: i */
    public final ws m56740i(String str, os osVar, ns nsVar) {
        m56742k(str);
        this.f54198e.put(str, new C18236d(nsVar, osVar));
        if (this.f54199f.containsKey(str)) {
            Object obj = this.f54199f.get(str);
            this.f54199f.remove(str);
            nsVar.mo6217a(obj);
        }
        ActivityResult activityResult = (ActivityResult) this.f54200g.getParcelable(str);
        if (activityResult != null) {
            this.f54200g.remove(str);
            nsVar.mo6217a(osVar.mo6231c(activityResult.m3726b(), activityResult.m3725a()));
        }
        return new C18235c(str, osVar);
    }

    /* renamed from: j */
    public final ws m56741j(String str, xca xcaVar, os osVar, ns nsVar) {
        AbstractC2139h lifecycle = xcaVar.getLifecycle();
        if (lifecycle.mo6522b().isAtLeast(AbstractC2139h.b.STARTED)) {
            throw new IllegalStateException("LifecycleOwner " + xcaVar + " is attempting to register while current state is " + lifecycle.mo6522b() + ". LifecycleOwners must call register before they are STARTED.");
        }
        m56742k(str);
        C18237e c18237e = (C18237e) this.f54196c.get(str);
        if (c18237e == null) {
            c18237e = new C18237e(lifecycle);
        }
        c18237e.m56744a(new C18233a(str, nsVar, osVar));
        this.f54196c.put(str, c18237e);
        return new C18234b(str, osVar);
    }

    /* renamed from: k */
    public final void m56742k(String str) {
        if (((Integer) this.f54195b.get(str)) != null) {
            return;
        }
        m56733a(m56737e(), str);
    }

    /* renamed from: l */
    public final void m56743l(String str) {
        Integer num;
        if (!this.f54197d.contains(str) && (num = (Integer) this.f54195b.remove(str)) != null) {
            this.f54194a.remove(num);
        }
        this.f54198e.remove(str);
        if (this.f54199f.containsKey(str)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Dropping pending result for request ");
            sb.append(str);
            sb.append(": ");
            sb.append(this.f54199f.get(str));
            this.f54199f.remove(str);
        }
        if (this.f54200g.containsKey(str)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Dropping pending result for request ");
            sb2.append(str);
            sb2.append(": ");
            sb2.append(this.f54200g.getParcelable(str));
            this.f54200g.remove(str);
        }
        C18237e c18237e = (C18237e) this.f54196c.get(str);
        if (c18237e != null) {
            c18237e.m56745b();
            this.f54196c.remove(str);
        }
    }
}
