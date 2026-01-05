package androidx.navigation;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.net.Uri;
import android.os.Bundle;
import android.util.AttributeSet;
import androidx.navigation.C2335f;
import com.amplifyframework.storage.s3.transfer.TransferTable;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.apache.http.message.TokenParser;
import p001o.d0g;
import p001o.dh3;
import p001o.f0g;
import p001o.f9g;
import p001o.gi9;
import p001o.id5;
import p001o.ief;
import p001o.isa;
import p001o.kf9;
import p001o.kh3;
import p001o.ksa;
import p001o.oef;
import p001o.oo0;
import p001o.si9;
import p001o.sq8;
import p001o.tae;
import p001o.uk7;
import p001o.vrb;
import p001o.wrb;
import p001o.xk7;
import p001o.y3i;
import p001o.yrb;

/* renamed from: androidx.navigation.h */
/* loaded from: classes2.dex */
public abstract class AbstractC2341h {

    /* renamed from: x */
    public static final a f9602x = new a(null);

    /* renamed from: y */
    public static final Map f9603y = new LinkedHashMap();

    /* renamed from: a */
    public final String f9604a;

    /* renamed from: b */
    public C2342i f9605b;

    /* renamed from: c */
    public String f9606c;

    /* renamed from: d */
    public CharSequence f9607d;

    /* renamed from: e */
    public final List f9608e;

    /* renamed from: f */
    public final d0g f9609f;

    /* renamed from: g */
    public Map f9610g;

    /* renamed from: h */
    public int f9611h;

    /* renamed from: q */
    public String f9612q;

    /* renamed from: s */
    public gi9 f9613s;

    /* renamed from: androidx.navigation.h$a */
    public static final class a {

        /* renamed from: androidx.navigation.h$a$a, reason: collision with other inner class name */
        public static final class C19574a extends kf9 implements xk7 {

            /* renamed from: a */
            public static final C19574a f9614a = new C19574a();

            public C19574a() {
                super(1);
            }

            @Override // p001o.xk7
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final AbstractC2341h invoke(AbstractC2341h abstractC2341h) {
                sq8.m48649h(abstractC2341h, "it");
                return abstractC2341h.m8756G();
            }
        }

        public a() {
        }

        public /* synthetic */ a(id5 id5Var) {
            this();
        }

        /* renamed from: a */
        public final String m8774a(String str) {
            if (str == null) {
                return "";
            }
            return "android-app://androidx.navigation/" + str;
        }

        /* renamed from: b */
        public final String m8775b(Context context, int i) throws Resources.NotFoundException {
            String strValueOf;
            sq8.m48649h(context, "context");
            if (i <= 16777215) {
                return String.valueOf(i);
            }
            try {
                strValueOf = context.getResources().getResourceName(i);
            } catch (Resources.NotFoundException unused) {
                strValueOf = String.valueOf(i);
            }
            sq8.m48648g(strValueOf, "try {\n                  …tring()\n                }");
            return strValueOf;
        }

        /* renamed from: c */
        public final ief m8776c(AbstractC2341h abstractC2341h) {
            sq8.m48649h(abstractC2341h, "<this>");
            return oef.m42147f(abstractC2341h, C19574a.f9614a);
        }
    }

    /* renamed from: androidx.navigation.h$b */
    public static final class b implements Comparable {

        /* renamed from: a */
        public final AbstractC2341h f9615a;

        /* renamed from: b */
        public final Bundle f9616b;

        /* renamed from: c */
        public final boolean f9617c;

        /* renamed from: d */
        public final int f9618d;

        /* renamed from: e */
        public final boolean f9619e;

        /* renamed from: f */
        public final int f9620f;

        public b(AbstractC2341h abstractC2341h, Bundle bundle, boolean z, int i, boolean z2, int i2) {
            sq8.m48649h(abstractC2341h, FirebaseAnalytics.Param.DESTINATION);
            this.f9615a = abstractC2341h;
            this.f9616b = bundle;
            this.f9617c = z;
            this.f9618d = i;
            this.f9619e = z2;
            this.f9620f = i2;
        }

        @Override // java.lang.Comparable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compareTo(b bVar) {
            sq8.m48649h(bVar, "other");
            boolean z = this.f9617c;
            if (z && !bVar.f9617c) {
                return 1;
            }
            if (!z && bVar.f9617c) {
                return -1;
            }
            int i = this.f9618d - bVar.f9618d;
            if (i > 0) {
                return 1;
            }
            if (i < 0) {
                return -1;
            }
            Bundle bundle = this.f9616b;
            if (bundle != null && bVar.f9616b == null) {
                return 1;
            }
            if (bundle == null && bVar.f9616b != null) {
                return -1;
            }
            if (bundle != null) {
                int size = bundle.size();
                Bundle bundle2 = bVar.f9616b;
                sq8.m48646e(bundle2);
                int size2 = size - bundle2.size();
                if (size2 > 0) {
                    return 1;
                }
                if (size2 < 0) {
                    return -1;
                }
            }
            boolean z2 = this.f9619e;
            if (z2 && !bVar.f9619e) {
                return 1;
            }
            if (z2 || !bVar.f9619e) {
                return this.f9620f - bVar.f9620f;
            }
            return -1;
        }

        /* renamed from: c */
        public final AbstractC2341h m8779c() {
            return this.f9615a;
        }

        /* renamed from: d */
        public final Bundle m8780d() {
            return this.f9616b;
        }

        /* renamed from: e */
        public final boolean m8781e(Bundle bundle) {
            Bundle bundle2;
            boolean z;
            Object objMo8832a;
            if (bundle == null || (bundle2 = this.f9616b) == null) {
                return false;
            }
            Set<String> setKeySet = bundle2.keySet();
            sq8.m48648g(setKeySet, "matchingArgs.keySet()");
            Iterator<T> it = setKeySet.iterator();
            do {
                z = true;
                if (!it.hasNext()) {
                    return true;
                }
                String str = (String) it.next();
                if (!bundle.containsKey(str)) {
                    return false;
                }
                C2331b c2331b = (C2331b) this.f9615a.f9610g.get(str);
                Object objMo8832a2 = null;
                AbstractC2347n abstractC2347nM8539a = c2331b != null ? c2331b.m8539a() : null;
                if (abstractC2347nM8539a != null) {
                    Bundle bundle3 = this.f9616b;
                    sq8.m48648g(str, TransferTable.COLUMN_KEY);
                    objMo8832a = abstractC2347nM8539a.mo8832a(bundle3, str);
                } else {
                    objMo8832a = null;
                }
                if (abstractC2347nM8539a != null) {
                    sq8.m48648g(str, TransferTable.COLUMN_KEY);
                    objMo8832a2 = abstractC2347nM8539a.mo8832a(bundle, str);
                }
                if (abstractC2347nM8539a == null || abstractC2347nM8539a.mo8841j(objMo8832a, objMo8832a2)) {
                    z = false;
                }
            } while (!z);
            return false;
        }
    }

    /* renamed from: androidx.navigation.h$c */
    public static final class c extends kf9 implements xk7 {

        /* renamed from: a */
        public final /* synthetic */ C2335f f9621a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(C2335f c2335f) {
            super(1);
            this.f9621a = c2335f;
        }

        @Override // p001o.xk7
        public final Boolean invoke(String str) {
            sq8.m48649h(str, TransferTable.COLUMN_KEY);
            return Boolean.valueOf(!this.f9621a.m8666j().contains(str));
        }
    }

    /* renamed from: androidx.navigation.h$d */
    public static final class d extends kf9 implements xk7 {

        /* renamed from: a */
        public final /* synthetic */ Bundle f9622a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Bundle bundle) {
            super(1);
            this.f9622a = bundle;
        }

        @Override // p001o.xk7
        public final Boolean invoke(String str) {
            sq8.m48649h(str, TransferTable.COLUMN_KEY);
            return Boolean.valueOf(!this.f9622a.containsKey(str));
        }
    }

    /* renamed from: androidx.navigation.h$e */
    public static final class e extends kf9 implements uk7 {

        /* renamed from: a */
        public final /* synthetic */ String f9623a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(String str) {
            super(0);
            this.f9623a = str;
        }

        @Override // p001o.uk7
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C2335f invoke() {
            return new C2335f.a().m8686d(this.f9623a).m8683a();
        }
    }

    /* renamed from: androidx.navigation.h$f */
    public static final class f extends kf9 implements xk7 {

        /* renamed from: a */
        public final /* synthetic */ C2335f f9624a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(C2335f c2335f) {
            super(1);
            this.f9624a = c2335f;
        }

        @Override // p001o.xk7
        public final Boolean invoke(String str) {
            sq8.m48649h(str, TransferTable.COLUMN_KEY);
            return Boolean.valueOf(!this.f9624a.m8666j().contains(str));
        }
    }

    public AbstractC2341h(String str) {
        sq8.m48649h(str, "navigatorName");
        this.f9604a = str;
        this.f9608e = new ArrayList();
        this.f9609f = new d0g(0, 1, null);
        this.f9610g = new LinkedHashMap();
    }

    /* renamed from: p */
    public static /* synthetic */ int[] m8752p(AbstractC2341h abstractC2341h, AbstractC2341h abstractC2341h2, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: buildDeepLinkIds");
        }
        if ((i & 1) != 0) {
            abstractC2341h2 = null;
        }
        return abstractC2341h.m8769o(abstractC2341h2);
    }

    /* renamed from: A */
    public final int m8753A() {
        return this.f9611h;
    }

    /* renamed from: B */
    public final CharSequence m8754B() {
        return this.f9607d;
    }

    /* renamed from: F */
    public final String m8755F() {
        return this.f9604a;
    }

    /* renamed from: G */
    public final C2342i m8756G() {
        return this.f9605b;
    }

    /* renamed from: I */
    public final String m8757I() {
        return this.f9612q;
    }

    /* renamed from: J */
    public final boolean m8758J(C2335f c2335f, Uri uri, Map map) {
        return wrb.m54932a(map, new d(c2335f.m8672p(uri, map))).isEmpty();
    }

    /* renamed from: L */
    public final boolean m8759L(String str, Bundle bundle) {
        sq8.m48649h(str, "route");
        if (sq8.m48644c(this.f9612q, str)) {
            return true;
        }
        b bVarM8761N = m8761N(str);
        if (sq8.m48644c(this, bVarM8761N != null ? bVarM8761N.m8779c() : null)) {
            return bVarM8761N.m8781e(bundle);
        }
        return false;
    }

    /* renamed from: M */
    public b mo8760M(yrb yrbVar) {
        sq8.m48649h(yrbVar, "navDeepLinkRequest");
        if (this.f9608e.isEmpty()) {
            return null;
        }
        b bVar = null;
        for (C2335f c2335f : this.f9608e) {
            Uri uriM58140c = yrbVar.m58140c();
            if (c2335f.m8655E(yrbVar)) {
                Bundle bundleM8671o = uriM58140c != null ? c2335f.m8671o(uriM58140c, this.f9610g) : null;
                int iM8664h = c2335f.m8664h(uriM58140c);
                String strM58138a = yrbVar.m58138a();
                boolean z = strM58138a != null && sq8.m48644c(strM58138a, c2335f.m8665i());
                String strM58139b = yrbVar.m58139b();
                int iM8677u = strM58139b != null ? c2335f.m8677u(strM58139b) : -1;
                if (bundleM8671o == null) {
                    if (z || iM8677u > -1) {
                        if (m8758J(c2335f, uriM58140c, this.f9610g)) {
                        }
                    }
                }
                b bVar2 = new b(this, bundleM8671o, c2335f.m8682z(), iM8664h, z, iM8677u);
                if (bVar == null || bVar2.compareTo(bVar) > 0) {
                    bVar = bVar2;
                }
            }
        }
        return bVar;
    }

    /* renamed from: N */
    public final b m8761N(String str) {
        C2335f c2335f;
        sq8.m48649h(str, "route");
        gi9 gi9Var = this.f9613s;
        if (gi9Var == null || (c2335f = (C2335f) gi9Var.getValue()) == null) {
            return null;
        }
        Uri uri = Uri.parse(f9602x.m8774a(str));
        sq8.m48645d(uri, "Uri.parse(this)");
        Bundle bundleM8671o = c2335f.m8671o(uri, this.f9610g);
        if (bundleM8671o == null) {
            return null;
        }
        return new b(this, bundleM8671o, c2335f.m8682z(), c2335f.m8664h(uri), false, -1);
    }

    /* renamed from: O */
    public void mo8532O(Context context, AttributeSet attributeSet) {
        sq8.m48649h(context, "context");
        sq8.m48649h(attributeSet, "attrs");
        TypedArray typedArrayObtainAttributes = context.getResources().obtainAttributes(attributeSet, tae.Navigator);
        sq8.m48648g(typedArrayObtainAttributes, "context.resources.obtain…s, R.styleable.Navigator)");
        m8765T(typedArrayObtainAttributes.getString(tae.Navigator_route));
        if (typedArrayObtainAttributes.hasValue(tae.Navigator_android_id)) {
            m8763R(typedArrayObtainAttributes.getResourceId(tae.Navigator_android_id, 0));
            this.f9606c = f9602x.m8775b(context, this.f9611h);
        }
        this.f9607d = typedArrayObtainAttributes.getText(tae.Navigator_android_label);
        y3i y3iVar = y3i.f54824a;
        typedArrayObtainAttributes.recycle();
    }

    /* renamed from: P */
    public final void m8762P(int i, vrb vrbVar) {
        sq8.m48649h(vrbVar, "action");
        if (mo8533U()) {
            if (!(i != 0)) {
                throw new IllegalArgumentException("Cannot have an action with actionId 0".toString());
            }
            this.f9609f.m22190l(i, vrbVar);
        } else {
            throw new UnsupportedOperationException("Cannot add action " + i + " to " + this + " as it does not support actions, indicating that it is a terminal destination in your navigation graph and will never trigger actions.");
        }
    }

    /* renamed from: R */
    public final void m8763R(int i) {
        this.f9611h = i;
        this.f9606c = null;
    }

    /* renamed from: S */
    public final void m8764S(C2342i c2342i) {
        this.f9605b = c2342i;
    }

    /* renamed from: T */
    public final void m8765T(String str) {
        if (str == null) {
            m8763R(0);
        } else {
            if (!(!f9g.d0(str))) {
                throw new IllegalArgumentException("Cannot have an empty route".toString());
            }
            String strM8774a = f9602x.m8774a(str);
            List listM54932a = wrb.m54932a(this.f9610g, new f(new C2335f.a().m8686d(strM8774a).m8683a()));
            if (!listM54932a.isEmpty()) {
                throw new IllegalArgumentException(("Cannot set route \"" + str + "\" for destination " + this + ". Following required arguments are missing: " + listM54932a).toString());
            }
            this.f9613s = si9.m48360a(new e(strM8774a));
            m8763R(strM8774a.hashCode());
        }
        this.f9612q = str;
    }

    /* renamed from: U */
    public boolean mo8533U() {
        return true;
    }

    /* renamed from: e */
    public final void m8766e(String str, C2331b c2331b) {
        sq8.m48649h(str, "argumentName");
        sq8.m48649h(c2331b, "argument");
        this.f9610g.put(str, c2331b);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00ad  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean equals(Object obj) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof AbstractC2341h)) {
            return false;
        }
        AbstractC2341h abstractC2341h = (AbstractC2341h) obj;
        boolean zM48644c = sq8.m48644c(this.f9608e, abstractC2341h.f9608e);
        if (this.f9609f.m22193p() == abstractC2341h.f9609f.m22193p()) {
            Iterator it = oef.m42144c(f0g.m25921a(this.f9609f)).iterator();
            while (true) {
                if (!it.hasNext()) {
                    z4 = true;
                    break;
                }
                int iIntValue = ((Number) it.next()).intValue();
                if (!sq8.m48644c(this.f9609f.m22184f(iIntValue), abstractC2341h.f9609f.m22184f(iIntValue))) {
                    z4 = false;
                    break;
                }
            }
            z = z4;
        }
        if (this.f9610g.size() == abstractC2341h.f9610g.size()) {
            Iterator it2 = ksa.m36187x(this.f9610g).iterator();
            while (true) {
                if (!it2.hasNext()) {
                    z3 = true;
                    break;
                }
                Map.Entry entry = (Map.Entry) it2.next();
                if (!(abstractC2341h.f9610g.containsKey(entry.getKey()) && sq8.m48644c(abstractC2341h.f9610g.get(entry.getKey()), entry.getValue()))) {
                    z3 = false;
                    break;
                }
            }
            z2 = z3;
        }
        return this.f9611h == abstractC2341h.f9611h && sq8.m48644c(this.f9612q, abstractC2341h.f9612q) && zM48644c && z && z2;
    }

    public int hashCode() {
        Set<String> setKeySet;
        int i = this.f9611h * 31;
        String str = this.f9612q;
        int iHashCode = i + (str != null ? str.hashCode() : 0);
        for (C2335f c2335f : this.f9608e) {
            int i2 = iHashCode * 31;
            String strM8681y = c2335f.m8681y();
            int iHashCode2 = (i2 + (strM8681y != null ? strM8681y.hashCode() : 0)) * 31;
            String strM8665i = c2335f.m8665i();
            int iHashCode3 = (iHashCode2 + (strM8665i != null ? strM8665i.hashCode() : 0)) * 31;
            String strM8676t = c2335f.m8676t();
            iHashCode = iHashCode3 + (strM8676t != null ? strM8676t.hashCode() : 0);
        }
        Iterator itM25922b = f0g.m25922b(this.f9609f);
        while (itM25922b.hasNext()) {
            vrb vrbVar = (vrb) itM25922b.next();
            int iM53346b = ((iHashCode * 31) + vrbVar.m53346b()) * 31;
            C2345l c2345lM53347c = vrbVar.m53347c();
            iHashCode = iM53346b + (c2345lM53347c != null ? c2345lM53347c.hashCode() : 0);
            Bundle bundleM53345a = vrbVar.m53345a();
            if (bundleM53345a != null && (setKeySet = bundleM53345a.keySet()) != null) {
                sq8.m48648g(setKeySet, "keySet()");
                for (String str2 : setKeySet) {
                    int i3 = iHashCode * 31;
                    Bundle bundleM53345a2 = vrbVar.m53345a();
                    sq8.m48646e(bundleM53345a2);
                    Object obj = bundleM53345a2.get(str2);
                    iHashCode = i3 + (obj != null ? obj.hashCode() : 0);
                }
            }
        }
        for (String str3 : this.f9610g.keySet()) {
            int iHashCode4 = ((iHashCode * 31) + str3.hashCode()) * 31;
            Object obj2 = this.f9610g.get(str3);
            iHashCode = iHashCode4 + (obj2 != null ? obj2.hashCode() : 0);
        }
        return iHashCode;
    }

    /* renamed from: j */
    public final void m8767j(C2335f c2335f) {
        sq8.m48649h(c2335f, "navDeepLink");
        List listM54932a = wrb.m54932a(this.f9610g, new c(c2335f));
        if (listM54932a.isEmpty()) {
            this.f9608e.add(c2335f);
            return;
        }
        throw new IllegalArgumentException(("Deep link " + c2335f.m8681y() + " can't be used to open destination " + this + ".\nFollowing required arguments are missing: " + listM54932a).toString());
    }

    /* renamed from: n */
    public final Bundle m8768n(Bundle bundle) {
        if (bundle == null && this.f9610g.isEmpty()) {
            return null;
        }
        Bundle bundle2 = new Bundle();
        for (Map.Entry entry : this.f9610g.entrySet()) {
            ((C2331b) entry.getValue()).m8543e((String) entry.getKey(), bundle2);
        }
        if (bundle != null) {
            bundle2.putAll(bundle);
            for (Map.Entry entry2 : this.f9610g.entrySet()) {
                String str = (String) entry2.getKey();
                C2331b c2331b = (C2331b) entry2.getValue();
                if (!c2331b.m8541c() && !c2331b.m8544f(str, bundle2)) {
                    throw new IllegalArgumentException(("Wrong argument type for '" + str + "' in argument bundle. " + c2331b.m8539a().mo8833b() + " expected.").toString());
                }
            }
        }
        return bundle2;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0024  */
    /* renamed from: o */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int[] m8769o(AbstractC2341h abstractC2341h) {
        oo0 oo0Var = new oo0();
        AbstractC2341h abstractC2341h2 = this;
        while (true) {
            sq8.m48646e(abstractC2341h2);
            C2342i c2342i = abstractC2341h2.f9605b;
            if ((abstractC2341h != null ? abstractC2341h.f9605b : null) != null) {
                C2342i c2342i2 = abstractC2341h.f9605b;
                sq8.m48646e(c2342i2);
                if (c2342i2.m8784W(abstractC2341h2.f9611h) != abstractC2341h2) {
                    if (c2342i == null || c2342i.e0() != abstractC2341h2.f9611h) {
                        oo0Var.m42480j(abstractC2341h2);
                    }
                    if (sq8.m48644c(c2342i, abstractC2341h) || c2342i == null) {
                        break;
                    }
                    abstractC2341h2 = c2342i;
                } else {
                    oo0Var.m42480j(abstractC2341h2);
                    break;
                }
            }
        }
        List listQ0 = kh3.Q0(oo0Var);
        ArrayList arrayList = new ArrayList(dh3.m23088v(listQ0, 10));
        Iterator it = listQ0.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(((AbstractC2341h) it.next()).f9611h));
        }
        return kh3.P0(arrayList);
    }

    /* renamed from: r */
    public final String m8770r(Context context, Bundle bundle) {
        C2331b c2331b;
        sq8.m48649h(context, "context");
        CharSequence charSequence = this.f9607d;
        if (charSequence == null) {
            return null;
        }
        Matcher matcher = Pattern.compile("\\{(.+?)\\}").matcher(charSequence);
        StringBuffer stringBuffer = new StringBuffer();
        while (matcher.find()) {
            String strGroup = matcher.group(1);
            if (bundle == null || !bundle.containsKey(strGroup)) {
                throw new IllegalArgumentException("Could not find \"" + strGroup + "\" in " + bundle + " to fill label \"" + ((Object) charSequence) + TokenParser.DQUOTE);
            }
            matcher.appendReplacement(stringBuffer, "");
            AbstractC2347n abstractC2347nM8539a = (strGroup == null || (c2331b = (C2331b) this.f9610g.get(strGroup)) == null) ? null : c2331b.m8539a();
            AbstractC2347n abstractC2347n = AbstractC2347n.f9675e;
            if (sq8.m48644c(abstractC2347nM8539a, abstractC2347n)) {
                sq8.m48648g(strGroup, "argName");
                Object objMo8832a = abstractC2347n.mo8832a(bundle, strGroup);
                sq8.m48647f(objMo8832a, "null cannot be cast to non-null type kotlin.Int");
                String string = context.getString(((Integer) objMo8832a).intValue());
                sq8.m48648g(string, "context.getString(\n     …                        )");
                stringBuffer.append(string);
            } else {
                sq8.m48646e(abstractC2347nM8539a);
                sq8.m48648g(strGroup, "argName");
                stringBuffer.append(String.valueOf(abstractC2347nM8539a.mo8832a(bundle, strGroup)));
            }
        }
        matcher.appendTail(stringBuffer);
        return stringBuffer.toString();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append("(");
        String str = this.f9606c;
        if (str == null) {
            sb.append("0x");
            sb.append(Integer.toHexString(this.f9611h));
        } else {
            sb.append(str);
        }
        sb.append(")");
        String str2 = this.f9612q;
        if (!(str2 == null || f9g.d0(str2))) {
            sb.append(" route=");
            sb.append(this.f9612q);
        }
        if (this.f9607d != null) {
            sb.append(" label=");
            sb.append(this.f9607d);
        }
        String string = sb.toString();
        sq8.m48648g(string, "sb.toString()");
        return string;
    }

    /* renamed from: v */
    public final vrb m8771v(int i) {
        vrb vrbVar = this.f9609f.m22185g() ? null : (vrb) this.f9609f.m22184f(i);
        if (vrbVar != null) {
            return vrbVar;
        }
        C2342i c2342i = this.f9605b;
        if (c2342i != null) {
            return c2342i.m8771v(i);
        }
        return null;
    }

    /* renamed from: w */
    public final Map m8772w() {
        return isa.m32693t(this.f9610g);
    }

    /* renamed from: y */
    public String mo8773y() {
        String str = this.f9606c;
        return str == null ? String.valueOf(this.f9611h) : str;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AbstractC2341h(AbstractC2348o abstractC2348o) {
        this(C2349p.f9702b.m8958a(abstractC2348o.getClass()));
        sq8.m48649h(abstractC2348o, "navigator");
    }
}
