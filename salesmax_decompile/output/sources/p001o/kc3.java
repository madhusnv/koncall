package p001o;

import ai.salesmax.model.event.PreferenceChangeEvent;
import ai.salesmax.model.event.PreferenceChangeEventListener;
import ai.salesmax.util.Prefs;
import android.content.Context;
import com.amplifyframework.datastore.generated.model.Account;
import com.amplifyframework.datastore.generated.model.CloudTelephonyAccount;
import com.amplifyframework.datastore.generated.model.CloudTelephonyUser;
import com.amplifyframework.datastore.generated.model.User;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class kc3 implements PreferenceChangeEventListener {

    /* renamed from: e */
    public static final C14777a f31903e = new C14777a(null);

    /* renamed from: f */
    public static final int f31904f = 8;

    /* renamed from: g */
    public static final kc3 f31905g = new kc3();

    /* renamed from: a */
    public final AtomicBoolean f31906a = new AtomicBoolean(false);

    /* renamed from: b */
    public final Map f31907b = new LinkedHashMap();

    /* renamed from: c */
    public final Map f31908c = new LinkedHashMap();

    /* renamed from: d */
    public final Map f31909d = new LinkedHashMap();

    /* renamed from: o.kc3$a */
    public static final class C14777a {
        public C14777a() {
        }

        public /* synthetic */ C14777a(id5 id5Var) {
            this();
        }

        /* renamed from: a */
        public final kc3 m35385a() {
            return kc3.f31905g;
        }
    }

    /* renamed from: o.kc3$b */
    public static final class C14778b implements gu3 {

        /* renamed from: b */
        public final /* synthetic */ String f31911b;

        public C14778b(String str) {
            this.f31911b = str;
        }

        @Override // p001o.gu3
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void accept(uni uniVar) {
            sq8.m48649h(uniVar, "it");
            kc3.this.m35383p(uniVar.SB(), this.f31911b);
        }
    }

    /* renamed from: o.kc3$c */
    public static final class C14779c implements gu3 {
        public C14779c() {
        }

        @Override // p001o.gu3
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void accept(uni uniVar) {
            sq8.m48649h(uniVar, "it");
            kc3.this.m35384q(uniVar.SB());
        }
    }

    /* renamed from: o.kc3$d */
    public static final class C14780d implements gu3 {

        /* renamed from: b */
        public final /* synthetic */ String f31914b;

        public C14780d(String str) {
            this.f31914b = str;
        }

        @Override // p001o.gu3
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void accept(List list) {
            sq8.m48649h(list, "it");
            Map map = kc3.this.f31908c;
            String str = this.f31914b;
            sq8.m48648g(str, "$accountId");
            map.put(str, list);
            String str2 = this.f31914b;
            StringBuilder sb = new StringBuilder();
            sb.append("For account: ");
            sb.append(str2);
            sb.append(" cloud accounts registered: ");
            sb.append(list);
        }
    }

    /* renamed from: o.kc3$e */
    public static final class C14781e implements gu3 {

        /* renamed from: b */
        public final /* synthetic */ String f31916b;

        public C14781e(String str) {
            this.f31916b = str;
        }

        @Override // p001o.gu3
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void accept(List list) {
            sq8.m48649h(list, "it");
            Map map = kc3.this.f31909d;
            String str = this.f31916b;
            sq8.m48648g(str, "$accountId");
            map.put(str, list);
            String str2 = this.f31916b;
            StringBuilder sb = new StringBuilder();
            sb.append("For account: ");
            sb.append(str2);
            sb.append(" cloud users registered: ");
            sb.append(list);
        }
    }

    /* renamed from: f */
    public final boolean m35373f(String str) {
        Account accountM39156f;
        String id;
        sq8.m48649h(str, "number");
        Object objM55729h = uni.LB().m55729h();
        sq8.m48648g(objM55729h, "blockingSingle(...)");
        mii miiVarSB = ((uni) objM55729h).SB();
        if (miiVarSB == null || (accountM39156f = miiVarSB.m39156f()) == null || (id = accountM39156f.getId()) == null) {
            return false;
        }
        sq8.m48646e(id);
        return m35379l(str, (String) this.f31907b.get(id), (List) this.f31908c.get(id), (List) this.f31909d.get(id), miiVarSB);
    }

    /* renamed from: g */
    public final CloudTelephonyAccount m35374g(List list, String str, String str2) {
        Object obj = null;
        if (list == null) {
            return null;
        }
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            CloudTelephonyAccount cloudTelephonyAccount = (CloudTelephonyAccount) next;
            if (sq8.m48644c(cloudTelephonyAccount.getProviderName(), str) && sq8.m48644c(cloudTelephonyAccount.getTelephonyNumber(), str2)) {
                obj = next;
                break;
            }
        }
        return (CloudTelephonyAccount) obj;
    }

    /* renamed from: h */
    public final CloudTelephonyUser m35375h(List list, String str, String str2) {
        Object obj = null;
        if (list == null) {
            return null;
        }
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            CloudTelephonyUser cloudTelephonyUser = (CloudTelephonyUser) next;
            if (sq8.m48644c(cloudTelephonyUser.getProviderName(), str) && sq8.m48644c(cloudTelephonyUser.getUserId(), str2)) {
                obj = next;
                break;
            }
        }
        return (CloudTelephonyUser) obj;
    }

    /* renamed from: i */
    public final CloudTelephonyAccount m35376i(String str, String str2) {
        Object objM55729h = uni.LB().m55729h();
        sq8.m48648g(objM55729h, "blockingSingle(...)");
        mii miiVarSB = ((uni) objM55729h).SB();
        if (miiVarSB != null) {
            Account accountM39156f = miiVarSB.m39156f();
            String id = accountM39156f != null ? accountM39156f.getId() : null;
            if (str != null && str2 != null) {
                return m35374g((List) this.f31908c.get(id), str2, str);
            }
        }
        return null;
    }

    /* renamed from: j */
    public final CloudTelephonyUser m35377j(String str) {
        Object objM55729h = uni.LB().m55729h();
        sq8.m48648g(objM55729h, "blockingSingle(...)");
        mii miiVarSB = ((uni) objM55729h).SB();
        if (miiVarSB != null) {
            Account accountM39156f = miiVarSB.m39156f();
            String id = accountM39156f != null ? accountM39156f.getId() : null;
            User userM39171u = miiVarSB.m39171u();
            String id2 = userM39171u != null ? userM39171u.getId() : null;
            if (str != null) {
                return m35375h((List) this.f31909d.get(id), str, id2);
            }
        }
        return null;
    }

    /* renamed from: k */
    public final void m35378k(Prefs prefs) {
        if (prefs != null) {
            m35380m(prefs.m3257s());
        }
    }

    /* renamed from: l */
    public final boolean m35379l(String str, String str2, List list, List list2, mii miiVar) {
        CloudTelephonyAccount cloudTelephonyAccount;
        Object next;
        Object obj = null;
        if (list != null) {
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                CloudTelephonyAccount cloudTelephonyAccount2 = (CloudTelephonyAccount) next;
                if (sq8.m48644c(cloudTelephonyAccount2.getProviderName(), str2) && sq8.m48644c(cloudTelephonyAccount2.getTelephonyNumber(), str)) {
                    break;
                }
            }
            cloudTelephonyAccount = (CloudTelephonyAccount) next;
        } else {
            cloudTelephonyAccount = null;
        }
        boolean z = cloudTelephonyAccount != null;
        if (list2 != null) {
            Iterator it2 = list2.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Object next2 = it2.next();
                CloudTelephonyUser cloudTelephonyUser = (CloudTelephonyUser) next2;
                if (sq8.m48644c(cloudTelephonyUser.getProviderName(), str2) && sq8.m48644c(miiVar.m39171u().getId(), cloudTelephonyUser.getUserId())) {
                    obj = next2;
                    break;
                }
            }
            obj = (CloudTelephonyUser) obj;
        }
        boolean z2 = obj != null;
        StringBuilder sb = new StringBuilder();
        sb.append("Provider: ");
        sb.append(str2);
        sb.append(", CloudAccount: ");
        sb.append(z);
        sb.append(", CloudUser: ");
        sb.append(z2);
        return str2 != null && z && z2;
    }

    /* renamed from: m */
    public final void m35380m(String str) {
        if (str == null || uni.LB().u0(new C14778b(str)) == null) {
            uni.LB().u0(new C14779c());
        }
    }

    /* renamed from: n */
    public final String m35381n() {
        Account accountM39156f;
        String id;
        Object objM55729h = uni.LB().m55729h();
        sq8.m48648g(objM55729h, "blockingSingle(...)");
        mii miiVarSB = ((uni) objM55729h).SB();
        if (miiVarSB == null || (accountM39156f = miiVarSB.m39156f()) == null || (id = accountM39156f.getId()) == null) {
            return null;
        }
        sq8.m48646e(id);
        return (String) this.f31907b.get(id);
    }

    /* renamed from: o */
    public final String m35382o(String str) {
        Account accountM39156f;
        String id;
        sq8.m48649h(str, "number");
        Object objM55729h = uni.LB().m55729h();
        sq8.m48648g(objM55729h, "blockingSingle(...)");
        mii miiVarSB = ((uni) objM55729h).SB();
        if (miiVarSB == null || (accountM39156f = miiVarSB.m39156f()) == null || (id = accountM39156f.getId()) == null) {
            return null;
        }
        sq8.m48646e(id);
        List list = (List) this.f31908c.get(id);
        List list2 = (List) this.f31909d.get(id);
        String str2 = (String) this.f31907b.get(id);
        if (m35379l(str, str2, list, list2, miiVarSB)) {
            return str2;
        }
        return null;
    }

    @Override // ai.salesmax.model.event.PreferenceChangeEventListener
    public void onPreferenceChangeEvent(PreferenceChangeEvent preferenceChangeEvent) {
    }

    /* renamed from: p */
    public final void m35383p(mii miiVar, String str) {
        l1 l1VarM39161k;
        if (miiVar == null || (l1VarM39161k = miiVar.m39161k()) == null) {
            return;
        }
        sq8.m48646e(l1VarM39161k);
        String id = miiVar.m39156f().getId();
        Map map = this.f31907b;
        sq8.m48646e(id);
        map.put(id, str);
        l1VarM39161k.Mo(id).u0(new C14780d(id));
        l1VarM39161k.Va(id, miiVar.m39171u().getId()).u0(new C14781e(id));
    }

    /* renamed from: q */
    public final void m35384q(mii miiVar) {
        l1 l1VarM39161k;
        if (miiVar == null || (l1VarM39161k = miiVar.m39161k()) == null) {
            return;
        }
        sq8.m48646e(l1VarM39161k);
        String id = miiVar.m39156f().getId();
        this.f31908c.remove(id);
        this.f31909d.remove(id);
        this.f31907b.remove(id);
        StringBuilder sb = new StringBuilder();
        sb.append("For account: ");
        sb.append(id);
        sb.append(" cloud is unregistered");
    }

    @Override // ai.salesmax.model.event.PreferenceChangeEventListener
    public void onPreferenceChangeEvent(Context context, PreferenceChangeEvent preferenceChangeEvent) {
        sq8.m48649h(context, "context");
        if (preferenceChangeEvent == null || preferenceChangeEvent.getEventType() != PreferenceChangeEvent.EventType.PREF_CLOUD_TELEPHONY_PROVIDER_PREF) {
            return;
        }
        m35380m(mri.f35877a.m39585c(preferenceChangeEvent.getPrefValue()));
    }
}
