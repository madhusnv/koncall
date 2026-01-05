package p001o;

import android.os.Binder;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import android.util.SparseArray;
import android.view.View;
import com.amplifyframework.storage.s3.transfer.TransferTable;
import com.onesignal.session.internal.outcomes.impl.OutcomeConstants;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p001o.f1f;

/* loaded from: classes2.dex */
public abstract class cv5 {

    /* renamed from: a */
    public static final Class[] f18706a = {Serializable.class, Parcelable.class, String.class, SparseArray.class, Binder.class, Size.class, SizeF.class};

    /* renamed from: o.cv5$a */
    public static final class C12752a extends kf9 implements uk7 {

        /* renamed from: a */
        public final /* synthetic */ boolean f18707a;

        /* renamed from: b */
        public final /* synthetic */ f1f f18708b;

        /* renamed from: c */
        public final /* synthetic */ String f18709c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C12752a(boolean z, f1f f1fVar, String str) {
            super(0);
            this.f18707a = z;
            this.f18708b = f1fVar;
            this.f18709c = str;
        }

        @Override // p001o.uk7
        public /* bridge */ /* synthetic */ Object invoke() {
            m68987invoke();
            return y3i.f54824a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m68987invoke() {
            if (this.f18707a) {
                this.f18708b.m25948j(this.f18709c);
            }
        }
    }

    /* renamed from: o.cv5$b */
    public static final class C12753b implements f1f.InterfaceC13312c {

        /* renamed from: a */
        public final /* synthetic */ v0f f18710a;

        public C12753b(v0f v0fVar) {
            this.f18710a = v0fVar;
        }

        @Override // p001o.f1f.InterfaceC13312c
        /* renamed from: a */
        public final Bundle mo3785a() {
            return cv5.m21867f(this.f18710a.mo19852a());
        }
    }

    /* renamed from: o.cv5$c */
    public static final class C12754c extends kf9 implements xk7 {

        /* renamed from: a */
        public static final C12754c f18711a = new C12754c();

        public C12754c() {
            super(1);
        }

        @Override // p001o.xk7
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(Object obj) {
            sq8.m48649h(obj, "it");
            return Boolean.valueOf(cv5.m21866e(obj));
        }
    }

    /* renamed from: a */
    public static final bv5 m21862a(View view, h1f h1fVar) {
        sq8.m48649h(view, "view");
        sq8.m48649h(h1fVar, "owner");
        Object parent = view.getParent();
        sq8.m48647f(parent, "null cannot be cast to non-null type android.view.View");
        View view2 = (View) parent;
        Object tag = view2.getTag(s8e.compose_view_saveable_id_tag);
        String strValueOf = tag instanceof String ? (String) tag : null;
        if (strValueOf == null) {
            strValueOf = String.valueOf(view2.getId());
        }
        return m21863b(strValueOf, h1fVar);
    }

    /* renamed from: b */
    public static final bv5 m21863b(String str, h1f h1fVar) {
        boolean z;
        sq8.m48649h(str, OutcomeConstants.OUTCOME_ID);
        sq8.m48649h(h1fVar, "savedStateRegistryOwner");
        String str2 = v0f.class.getSimpleName() + ':' + str;
        f1f savedStateRegistry = h1fVar.getSavedStateRegistry();
        Bundle bundleM25941b = savedStateRegistry.m25941b(str2);
        v0f v0fVarM55525a = x0f.m55525a(bundleM25941b != null ? m21868g(bundleM25941b) : null, C12754c.f18711a);
        try {
            savedStateRegistry.m25946h(str2, new C12753b(v0fVarM55525a));
            z = true;
        } catch (IllegalArgumentException unused) {
            z = false;
        }
        return new bv5(v0fVarM55525a, new C12752a(z, savedStateRegistry, str2));
    }

    /* renamed from: e */
    public static final boolean m21866e(Object obj) {
        if (obj instanceof nxf) {
            nxf nxfVar = (nxf) obj;
            if (nxfVar.mo34661a() != qxf.m45955f() && nxfVar.mo34661a() != qxf.m45957h() && nxfVar.mo34661a() != qxf.m45956g()) {
                return false;
            }
            Object value = nxfVar.getValue();
            if (value == null) {
                return true;
            }
            return m21866e(value);
        }
        if ((obj instanceof tl7) && (obj instanceof Serializable)) {
            return false;
        }
        for (Class cls : f18706a) {
            if (cls.isInstance(obj)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: f */
    public static final Bundle m21867f(Map map) {
        Bundle bundle = new Bundle();
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            List list = (List) entry.getValue();
            bundle.putParcelableArrayList(str, list instanceof ArrayList ? (ArrayList) list : new ArrayList<>(list));
        }
        return bundle;
    }

    /* renamed from: g */
    public static final Map m21868g(Bundle bundle) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Set<String> setKeySet = bundle.keySet();
        sq8.m48648g(setKeySet, "this.keySet()");
        for (String str : setKeySet) {
            ArrayList parcelableArrayList = bundle.getParcelableArrayList(str);
            sq8.m48647f(parcelableArrayList, "null cannot be cast to non-null type java.util.ArrayList<kotlin.Any?>{ kotlin.collections.TypeAliasesKt.ArrayList<kotlin.Any?> }");
            sq8.m48648g(str, TransferTable.COLUMN_KEY);
            linkedHashMap.put(str, parcelableArrayList);
        }
        return linkedHashMap;
    }
}
