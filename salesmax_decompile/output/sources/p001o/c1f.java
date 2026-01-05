package p001o;

import android.os.Bundle;
import androidx.lifecycle.AbstractC2154w;
import androidx.lifecycle.C2151t;
import com.amplifyframework.storage.s3.transfer.TransferTable;
import java.util.Map;
import p001o.f1f;

/* loaded from: classes2.dex */
public final class c1f implements f1f.InterfaceC13312c {

    /* renamed from: a */
    public final f1f f17125a;

    /* renamed from: b */
    public boolean f17126b;

    /* renamed from: c */
    public Bundle f17127c;

    /* renamed from: d */
    public final gi9 f17128d;

    /* renamed from: o.c1f$a */
    public static final class C12534a extends kf9 implements uk7 {

        /* renamed from: a */
        public final /* synthetic */ lxi f17129a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C12534a(lxi lxiVar) {
            super(0);
            this.f17129a = lxiVar;
        }

        @Override // p001o.uk7
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final d1f invoke() {
            return AbstractC2154w.m6600e(this.f17129a);
        }
    }

    public c1f(f1f f1fVar, lxi lxiVar) {
        sq8.m48649h(f1fVar, "savedStateRegistry");
        sq8.m48649h(lxiVar, "viewModelStoreOwner");
        this.f17125a = f1fVar;
        this.f17128d = si9.m48360a(new C12534a(lxiVar));
    }

    @Override // p001o.f1f.InterfaceC13312c
    /* renamed from: a */
    public Bundle mo3785a() {
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.f17127c;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        for (Map.Entry entry : m20070c().m22237f().entrySet()) {
            String str = (String) entry.getKey();
            Bundle bundleMo3785a = ((C2151t) entry.getValue()).m6588h().mo3785a();
            if (!sq8.m48644c(bundleMo3785a, Bundle.EMPTY)) {
                bundle.putBundle(str, bundleMo3785a);
            }
        }
        this.f17126b = false;
        return bundle;
    }

    /* renamed from: b */
    public final Bundle m20069b(String str) {
        sq8.m48649h(str, TransferTable.COLUMN_KEY);
        m20071d();
        Bundle bundle = this.f17127c;
        Bundle bundle2 = bundle != null ? bundle.getBundle(str) : null;
        Bundle bundle3 = this.f17127c;
        if (bundle3 != null) {
            bundle3.remove(str);
        }
        Bundle bundle4 = this.f17127c;
        boolean z = false;
        if (bundle4 != null && bundle4.isEmpty()) {
            z = true;
        }
        if (z) {
            this.f17127c = null;
        }
        return bundle2;
    }

    /* renamed from: c */
    public final d1f m20070c() {
        return (d1f) this.f17128d.getValue();
    }

    /* renamed from: d */
    public final void m20071d() {
        if (this.f17126b) {
            return;
        }
        Bundle bundleM25941b = this.f17125a.m25941b("androidx.lifecycle.internal.SavedStateHandlesProvider");
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.f17127c;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        if (bundleM25941b != null) {
            bundle.putAll(bundleM25941b);
        }
        this.f17127c = bundle;
        this.f17126b = true;
        m20070c();
    }
}
