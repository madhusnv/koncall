package p001o;

import android.os.Bundle;
import androidx.lifecycle.AbstractC2139h;
import androidx.lifecycle.InterfaceC2142k;
import com.amplifyframework.auth.cognito.data.AWSCognitoLegacyCredentialStore;
import com.amplifyframework.storage.s3.transfer.TransferTable;
import java.util.Iterator;
import java.util.Map;
import p001o.c0f;
import p001o.lfe;

/* loaded from: classes2.dex */
public final class f1f {

    /* renamed from: g */
    public static final C13311b f22541g = new C13311b(null);

    /* renamed from: b */
    public boolean f22543b;

    /* renamed from: c */
    public Bundle f22544c;

    /* renamed from: d */
    public boolean f22545d;

    /* renamed from: e */
    public lfe.C15068b f22546e;

    /* renamed from: a */
    public final c0f f22542a = new c0f();

    /* renamed from: f */
    public boolean f22547f = true;

    /* renamed from: o.f1f$a */
    public interface InterfaceC13310a {
        /* renamed from: a */
        void mo6520a(h1f h1fVar);
    }

    /* renamed from: o.f1f$b */
    public static final class C13311b {
        public C13311b() {
        }

        public /* synthetic */ C13311b(id5 id5Var) {
            this();
        }
    }

    /* renamed from: o.f1f$c */
    public interface InterfaceC13312c {
        /* renamed from: a */
        Bundle mo3785a();
    }

    /* renamed from: d */
    public static final void m25940d(f1f f1fVar, xca xcaVar, AbstractC2139h.a aVar) {
        sq8.m48649h(f1fVar, "this$0");
        sq8.m48649h(xcaVar, "<anonymous parameter 0>");
        sq8.m48649h(aVar, "event");
        if (aVar == AbstractC2139h.a.ON_START) {
            f1fVar.f22547f = true;
        } else if (aVar == AbstractC2139h.a.ON_STOP) {
            f1fVar.f22547f = false;
        }
    }

    /* renamed from: b */
    public final Bundle m25941b(String str) {
        sq8.m48649h(str, TransferTable.COLUMN_KEY);
        if (!this.f22545d) {
            throw new IllegalStateException("You can consumeRestoredStateForKey only after super.onCreate of corresponding component".toString());
        }
        Bundle bundle = this.f22544c;
        if (bundle == null) {
            return null;
        }
        Bundle bundle2 = bundle != null ? bundle.getBundle(str) : null;
        Bundle bundle3 = this.f22544c;
        if (bundle3 != null) {
            bundle3.remove(str);
        }
        Bundle bundle4 = this.f22544c;
        boolean z = false;
        if (bundle4 != null && !bundle4.isEmpty()) {
            z = true;
        }
        if (!z) {
            this.f22544c = null;
        }
        return bundle2;
    }

    /* renamed from: c */
    public final InterfaceC13312c m25942c(String str) {
        sq8.m48649h(str, TransferTable.COLUMN_KEY);
        Iterator it = this.f22542a.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            sq8.m48648g(entry, "components");
            String str2 = (String) entry.getKey();
            InterfaceC13312c interfaceC13312c = (InterfaceC13312c) entry.getValue();
            if (sq8.m48644c(str2, str)) {
                return interfaceC13312c;
            }
        }
        return null;
    }

    /* renamed from: e */
    public final void m25943e(AbstractC2139h abstractC2139h) {
        sq8.m48649h(abstractC2139h, "lifecycle");
        if (!(!this.f22543b)) {
            throw new IllegalStateException("SavedStateRegistry was already attached.".toString());
        }
        abstractC2139h.mo6521a(new InterfaceC2142k() { // from class: o.e1f
            @Override // androidx.lifecycle.InterfaceC2142k
            /* renamed from: o */
            public final void mo3717o(xca xcaVar, AbstractC2139h.a aVar) {
                f1f.m25940d(this.f20762a, xcaVar, aVar);
            }
        });
        this.f22543b = true;
    }

    /* renamed from: f */
    public final void m25944f(Bundle bundle) {
        if (!this.f22543b) {
            throw new IllegalStateException("You must call performAttach() before calling performRestore(Bundle).".toString());
        }
        if (!(!this.f22545d)) {
            throw new IllegalStateException("SavedStateRegistry was already restored.".toString());
        }
        this.f22544c = bundle != null ? bundle.getBundle("androidx.lifecycle.BundlableSavedStateRegistry.key") : null;
        this.f22545d = true;
    }

    /* renamed from: g */
    public final void m25945g(Bundle bundle) {
        sq8.m48649h(bundle, "outBundle");
        Bundle bundle2 = new Bundle();
        Bundle bundle3 = this.f22544c;
        if (bundle3 != null) {
            bundle2.putAll(bundle3);
        }
        c0f.C12527d c12527dM20018e = this.f22542a.m20018e();
        sq8.m48648g(c12527dM20018e, "this.components.iteratorWithAdditions()");
        while (c12527dM20018e.hasNext()) {
            Map.Entry entry = (Map.Entry) c12527dM20018e.next();
            bundle2.putBundle((String) entry.getKey(), ((InterfaceC13312c) entry.getValue()).mo3785a());
        }
        if (bundle2.isEmpty()) {
            return;
        }
        bundle.putBundle("androidx.lifecycle.BundlableSavedStateRegistry.key", bundle2);
    }

    /* renamed from: h */
    public final void m25946h(String str, InterfaceC13312c interfaceC13312c) {
        sq8.m48649h(str, TransferTable.COLUMN_KEY);
        sq8.m48649h(interfaceC13312c, AWSCognitoLegacyCredentialStore.PROVIDER_KEY);
        if (!(((InterfaceC13312c) this.f22542a.mo19712l(str, interfaceC13312c)) == null)) {
            throw new IllegalArgumentException("SavedStateProvider with the given key is already registered".toString());
        }
    }

    /* renamed from: i */
    public final void m25947i(Class cls) throws NoSuchMethodException, SecurityException {
        sq8.m48649h(cls, "clazz");
        if (!this.f22547f) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState".toString());
        }
        lfe.C15068b c15068b = this.f22546e;
        if (c15068b == null) {
            c15068b = new lfe.C15068b(this);
        }
        this.f22546e = c15068b;
        try {
            cls.getDeclaredConstructor(new Class[0]);
            lfe.C15068b c15068b2 = this.f22546e;
            if (c15068b2 != null) {
                String name = cls.getName();
                sq8.m48648g(name, "clazz.name");
                c15068b2.m37122b(name);
            }
        } catch (NoSuchMethodException e) {
            throw new IllegalArgumentException("Class " + cls.getSimpleName() + " must have default constructor in order to be automatically recreated", e);
        }
    }

    /* renamed from: j */
    public final void m25948j(String str) {
        sq8.m48649h(str, TransferTable.COLUMN_KEY);
        this.f22542a.mo19713m(str);
    }
}
