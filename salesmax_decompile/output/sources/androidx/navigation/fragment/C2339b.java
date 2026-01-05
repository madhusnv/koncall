package androidx.navigation.fragment;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.Log;
import androidx.fragment.app.AbstractC2124j;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.AbstractC2139h;
import androidx.lifecycle.InterfaceC2142k;
import androidx.lifecycle.b0;
import androidx.navigation.AbstractC2341h;
import androidx.navigation.AbstractC2348o;
import androidx.navigation.C2332c;
import androidx.navigation.C2345l;
import androidx.navigation.fragment.C2339b;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import p001o.am7;
import p001o.ch3;
import p001o.dxi;
import p001o.hh3;
import p001o.hwc;
import p001o.id5;
import p001o.in1;
import p001o.kf9;
import p001o.kge;
import p001o.kh3;
import p001o.kxi;
import p001o.n9c;
import p001o.qef;
import p001o.ri8;
import p001o.sq8;
import p001o.tl7;
import p001o.uae;
import p001o.uk7;
import p001o.vyh;
import p001o.wca;
import p001o.wh7;
import p001o.xca;
import p001o.xk7;
import p001o.xsb;
import p001o.y3i;
import p001o.ya4;

@AbstractC2348o.b("fragment")
/* renamed from: androidx.navigation.fragment.b */
/* loaded from: classes2.dex */
public class C2339b extends AbstractC2348o {

    /* renamed from: j */
    public static final b f9568j = new b(null);

    /* renamed from: c */
    public final Context f9569c;

    /* renamed from: d */
    public final FragmentManager f9570d;

    /* renamed from: e */
    public final int f9571e;

    /* renamed from: f */
    public final Set f9572f;

    /* renamed from: g */
    public final List f9573g;

    /* renamed from: h */
    public final InterfaceC2142k f9574h;

    /* renamed from: i */
    public final xk7 f9575i;

    /* renamed from: androidx.navigation.fragment.b$a */
    public static final class a extends dxi {

        /* renamed from: b */
        public WeakReference f9576b;

        @Override // p001o.dxi
        /* renamed from: e */
        public void mo6354e() {
            super.mo6354e();
            uk7 uk7Var = (uk7) m8728f().get();
            if (uk7Var != null) {
                uk7Var.invoke();
            }
        }

        /* renamed from: f */
        public final WeakReference m8728f() {
            WeakReference weakReference = this.f9576b;
            if (weakReference != null) {
                return weakReference;
            }
            sq8.m48667z("completeTransition");
            return null;
        }

        /* renamed from: g */
        public final void m8729g(WeakReference weakReference) {
            sq8.m48649h(weakReference, "<set-?>");
            this.f9576b = weakReference;
        }
    }

    /* renamed from: androidx.navigation.fragment.b$b */
    public static final class b {
        public b() {
        }

        public /* synthetic */ b(id5 id5Var) {
            this();
        }
    }

    /* renamed from: androidx.navigation.fragment.b$c */
    public static class c extends AbstractC2341h {

        /* renamed from: H */
        public String f9577H;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(AbstractC2348o abstractC2348o) {
            super(abstractC2348o);
            sq8.m48649h(abstractC2348o, "fragmentNavigator");
        }

        @Override // androidx.navigation.AbstractC2341h
        /* renamed from: O */
        public void mo8532O(Context context, AttributeSet attributeSet) {
            sq8.m48649h(context, "context");
            sq8.m48649h(attributeSet, "attrs");
            super.mo8532O(context, attributeSet);
            TypedArray typedArrayObtainAttributes = context.getResources().obtainAttributes(attributeSet, uae.FragmentNavigator);
            sq8.m48648g(typedArrayObtainAttributes, "context.resources.obtain…leable.FragmentNavigator)");
            String string = typedArrayObtainAttributes.getString(uae.FragmentNavigator_android_name);
            if (string != null) {
                m8731W(string);
            }
            y3i y3iVar = y3i.f54824a;
            typedArrayObtainAttributes.recycle();
        }

        /* renamed from: V */
        public final String m8730V() {
            String str = this.f9577H;
            if (str == null) {
                throw new IllegalStateException("Fragment class was not set".toString());
            }
            sq8.m48647f(str, "null cannot be cast to non-null type kotlin.String");
            return str;
        }

        /* renamed from: W */
        public final c m8731W(String str) {
            sq8.m48649h(str, "className");
            this.f9577H = str;
            return this;
        }

        @Override // androidx.navigation.AbstractC2341h
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !(obj instanceof c)) {
                return false;
            }
            return super.equals(obj) && sq8.m48644c(this.f9577H, ((c) obj).f9577H);
        }

        @Override // androidx.navigation.AbstractC2341h
        public int hashCode() {
            int iHashCode = super.hashCode() * 31;
            String str = this.f9577H;
            return iHashCode + (str != null ? str.hashCode() : 0);
        }

        @Override // androidx.navigation.AbstractC2341h
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(super.toString());
            sb.append(" class=");
            String str = this.f9577H;
            if (str == null) {
                sb.append("null");
            } else {
                sb.append(str);
            }
            String string = sb.toString();
            sq8.m48648g(string, "sb.toString()");
            return string;
        }
    }

    /* renamed from: androidx.navigation.fragment.b$d */
    public static final class d extends kf9 implements xk7 {

        /* renamed from: a */
        public final /* synthetic */ String f9578a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(String str) {
            super(1);
            this.f9578a = str;
        }

        @Override // p001o.xk7
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(hwc hwcVar) {
            sq8.m48649h(hwcVar, "it");
            return Boolean.valueOf(sq8.m48644c(hwcVar.m31229c(), this.f9578a));
        }
    }

    /* renamed from: androidx.navigation.fragment.b$e */
    public static final class e extends kf9 implements uk7 {

        /* renamed from: a */
        public final /* synthetic */ C2332c f9579a;

        /* renamed from: b */
        public final /* synthetic */ xsb f9580b;

        /* renamed from: c */
        public final /* synthetic */ C2339b f9581c;

        /* renamed from: d */
        public final /* synthetic */ Fragment f9582d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(C2332c c2332c, xsb xsbVar, C2339b c2339b, Fragment fragment) {
            super(0);
            this.f9579a = c2332c;
            this.f9580b = xsbVar;
            this.f9581c = c2339b;
            this.f9582d = fragment;
        }

        @Override // p001o.uk7
        public /* bridge */ /* synthetic */ Object invoke() {
            m68703invoke();
            return y3i.f54824a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m68703invoke() {
            xsb xsbVar = this.f9580b;
            C2339b c2339b = this.f9581c;
            Fragment fragment = this.f9582d;
            for (C2332c c2332c : (Iterable) xsbVar.m56784c().getValue()) {
                if (c2339b.m8726y(2)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Marking transition complete for entry ");
                    sb.append(c2332c);
                    sb.append(" due to fragment ");
                    sb.append(fragment);
                    sb.append(" viewmodel being cleared");
                }
                xsbVar.mo8621e(c2332c);
            }
        }
    }

    /* renamed from: androidx.navigation.fragment.b$f */
    public static final class f extends kf9 implements xk7 {

        /* renamed from: a */
        public static final f f9583a = new f();

        public f() {
            super(1);
        }

        @Override // p001o.xk7
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final a invoke(ya4 ya4Var) {
            sq8.m48649h(ya4Var, "$this$initializer");
            return new a();
        }
    }

    /* renamed from: androidx.navigation.fragment.b$g */
    public static final class g extends kf9 implements xk7 {

        /* renamed from: b */
        public final /* synthetic */ Fragment f9585b;

        /* renamed from: c */
        public final /* synthetic */ C2332c f9586c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(Fragment fragment, C2332c c2332c) {
            super(1);
            this.f9585b = fragment;
            this.f9586c = c2332c;
        }

        /* renamed from: a */
        public final void m8734a(xca xcaVar) {
            List listM8725x = C2339b.this.m8725x();
            Fragment fragment = this.f9585b;
            boolean z = false;
            if (!(listM8725x instanceof Collection) || !listM8725x.isEmpty()) {
                Iterator it = listM8725x.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    } else if (sq8.m48644c(((hwc) it.next()).m31229c(), fragment.getTag())) {
                        z = true;
                        break;
                    }
                }
            }
            if (xcaVar == null || z) {
                return;
            }
            AbstractC2139h lifecycle = this.f9585b.getViewLifecycleOwner().getLifecycle();
            if (lifecycle.mo6522b().isAtLeast(AbstractC2139h.b.CREATED)) {
                lifecycle.mo6521a((wca) C2339b.this.f9575i.invoke(this.f9586c));
            }
        }

        @Override // p001o.xk7
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m8734a((xca) obj);
            return y3i.f54824a;
        }
    }

    /* renamed from: androidx.navigation.fragment.b$h */
    public static final class h extends kf9 implements xk7 {
        public h() {
            super(1);
        }

        /* renamed from: c */
        public static final void m8736c(C2339b c2339b, C2332c c2332c, xca xcaVar, AbstractC2139h.a aVar) {
            sq8.m48649h(c2339b, "this$0");
            sq8.m48649h(c2332c, "$entry");
            sq8.m48649h(xcaVar, "owner");
            sq8.m48649h(aVar, "event");
            if (aVar == AbstractC2139h.a.ON_RESUME && ((List) c2339b.m8949b().m56783b().getValue()).contains(c2332c)) {
                if (c2339b.m8726y(2)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Marking transition complete for entry ");
                    sb.append(c2332c);
                    sb.append(" due to fragment ");
                    sb.append(xcaVar);
                    sb.append(" view lifecycle reaching RESUMED");
                }
                c2339b.m8949b().mo8621e(c2332c);
            }
            if (aVar == AbstractC2139h.a.ON_DESTROY) {
                if (c2339b.m8726y(2)) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Marking transition complete for entry ");
                    sb2.append(c2332c);
                    sb2.append(" due to fragment ");
                    sb2.append(xcaVar);
                    sb2.append(" view lifecycle reaching DESTROYED");
                }
                c2339b.m8949b().mo8621e(c2332c);
            }
        }

        @Override // p001o.xk7
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final InterfaceC2142k invoke(final C2332c c2332c) {
            sq8.m48649h(c2332c, "entry");
            final C2339b c2339b = C2339b.this;
            return new InterfaceC2142k() { // from class: o.th7
                @Override // androidx.lifecycle.InterfaceC2142k
                /* renamed from: o */
                public final void mo3717o(xca xcaVar, AbstractC2139h.a aVar) {
                    C2339b.h.m8736c(c2339b, c2332c, xcaVar, aVar);
                }
            };
        }
    }

    /* renamed from: androidx.navigation.fragment.b$i */
    public static final class i implements FragmentManager.InterfaceC2105l {

        /* renamed from: a */
        public final /* synthetic */ xsb f9588a;

        /* renamed from: b */
        public final /* synthetic */ C2339b f9589b;

        public i(xsb xsbVar, C2339b c2339b) {
            this.f9588a = xsbVar;
            this.f9589b = c2339b;
        }

        @Override // androidx.fragment.app.FragmentManager.InterfaceC2105l
        /* renamed from: a */
        public void mo6234a(Fragment fragment, boolean z) {
            Object obj;
            Object objPrevious;
            sq8.m48649h(fragment, "fragment");
            List listX0 = kh3.x0((Collection) this.f9588a.m56783b().getValue(), (Iterable) this.f9588a.m56784c().getValue());
            ListIterator listIterator = listX0.listIterator(listX0.size());
            while (true) {
                obj = null;
                if (!listIterator.hasPrevious()) {
                    objPrevious = null;
                    break;
                } else {
                    objPrevious = listIterator.previous();
                    if (sq8.m48644c(((C2332c) objPrevious).m8554f(), fragment.getTag())) {
                        break;
                    }
                }
            }
            C2332c c2332c = (C2332c) objPrevious;
            boolean z2 = z && this.f9589b.m8725x().isEmpty() && fragment.isRemoving();
            Iterator it = this.f9589b.m8725x().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if (sq8.m48644c(((hwc) next).m31229c(), fragment.getTag())) {
                    obj = next;
                    break;
                }
            }
            hwc hwcVar = (hwc) obj;
            if (hwcVar != null) {
                this.f9589b.m8725x().remove(hwcVar);
            }
            if (!z2 && this.f9589b.m8726y(2)) {
                StringBuilder sb = new StringBuilder();
                sb.append("OnBackStackChangedCommitted for fragment ");
                sb.append(fragment);
                sb.append(" associated with entry ");
                sb.append(c2332c);
            }
            boolean z3 = hwcVar != null && ((Boolean) hwcVar.m31230d()).booleanValue();
            if (!z && !z3 && c2332c == null) {
                throw new IllegalArgumentException(("The fragment " + fragment + " is unknown to the FragmentNavigator. Please use the navigate() function to add fragments to the FragmentNavigator managed FragmentManager.").toString());
            }
            if (c2332c != null) {
                this.f9589b.m8721s(fragment, c2332c, this.f9588a);
                if (z2) {
                    if (this.f9589b.m8726y(2)) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("OnBackStackChangedCommitted for fragment ");
                        sb2.append(fragment);
                        sb2.append(" popping associated entry ");
                        sb2.append(c2332c);
                        sb2.append(" via system back");
                    }
                    this.f9588a.mo8623i(c2332c, false);
                }
            }
        }

        @Override // androidx.fragment.app.FragmentManager.InterfaceC2105l
        /* renamed from: c */
        public void mo6236c(Fragment fragment, boolean z) {
            Object objPrevious;
            sq8.m48649h(fragment, "fragment");
            if (z) {
                List list = (List) this.f9588a.m56783b().getValue();
                ListIterator listIterator = list.listIterator(list.size());
                while (true) {
                    if (!listIterator.hasPrevious()) {
                        objPrevious = null;
                        break;
                    } else {
                        objPrevious = listIterator.previous();
                        if (sq8.m48644c(((C2332c) objPrevious).m8554f(), fragment.getTag())) {
                            break;
                        }
                    }
                }
                C2332c c2332c = (C2332c) objPrevious;
                if (this.f9589b.m8726y(2)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("OnBackStackChangedStarted for fragment ");
                    sb.append(fragment);
                    sb.append(" associated with entry ");
                    sb.append(c2332c);
                }
                if (c2332c != null) {
                    this.f9588a.mo8624j(c2332c);
                }
            }
        }

        @Override // androidx.fragment.app.FragmentManager.InterfaceC2105l
        /* renamed from: e */
        public void mo6238e() {
        }
    }

    /* renamed from: androidx.navigation.fragment.b$j */
    public static final class j extends kf9 implements xk7 {

        /* renamed from: a */
        public static final j f9590a = new j();

        public j() {
            super(1);
        }

        @Override // p001o.xk7
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke(hwc hwcVar) {
            sq8.m48649h(hwcVar, "it");
            return (String) hwcVar.m31229c();
        }
    }

    /* renamed from: androidx.navigation.fragment.b$k */
    public static final class k implements n9c, am7 {

        /* renamed from: a */
        public final /* synthetic */ xk7 f9591a;

        public k(xk7 xk7Var) {
            sq8.m48649h(xk7Var, "function");
            this.f9591a = xk7Var;
        }

        @Override // p001o.am7
        /* renamed from: a */
        public final tl7 mo37a() {
            return this.f9591a;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof n9c) && (obj instanceof am7)) {
                return sq8.m48644c(mo37a(), ((am7) obj).mo37a());
            }
            return false;
        }

        public final int hashCode() {
            return mo37a().hashCode();
        }

        @Override // p001o.n9c
        public final /* synthetic */ void onChanged(Object obj) {
            this.f9591a.invoke(obj);
        }
    }

    public C2339b(Context context, FragmentManager fragmentManager, int i2) {
        sq8.m48649h(context, "context");
        sq8.m48649h(fragmentManager, "fragmentManager");
        this.f9569c = context;
        this.f9570d = fragmentManager;
        this.f9571e = i2;
        this.f9572f = new LinkedHashSet();
        this.f9573g = new ArrayList();
        this.f9574h = new InterfaceC2142k() { // from class: o.rh7
            @Override // androidx.lifecycle.InterfaceC2142k
            /* renamed from: o */
            public final void mo3717o(xca xcaVar, AbstractC2139h.a aVar) {
                C2339b.m8713w(this.f43634a, xcaVar, aVar);
            }
        };
        this.f9575i = new h();
    }

    /* renamed from: A */
    public static final void m8706A(xsb xsbVar, C2339b c2339b, FragmentManager fragmentManager, Fragment fragment) {
        Object objPrevious;
        sq8.m48649h(xsbVar, "$state");
        sq8.m48649h(c2339b, "this$0");
        sq8.m48649h(fragmentManager, "<anonymous parameter 0>");
        sq8.m48649h(fragment, "fragment");
        List list = (List) xsbVar.m56783b().getValue();
        ListIterator listIterator = list.listIterator(list.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                objPrevious = null;
                break;
            } else {
                objPrevious = listIterator.previous();
                if (sq8.m48644c(((C2332c) objPrevious).m8554f(), fragment.getTag())) {
                    break;
                }
            }
        }
        C2332c c2332c = (C2332c) objPrevious;
        if (c2339b.m8726y(2)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Attaching fragment ");
            sb.append(fragment);
            sb.append(" associated with entry ");
            sb.append(c2332c);
            sb.append(" to FragmentManager ");
            sb.append(c2339b.f9570d);
        }
        if (c2332c != null) {
            c2339b.m8722t(c2332c, fragment);
            c2339b.m8721s(fragment, c2332c, xsbVar);
        }
    }

    /* renamed from: r */
    public static /* synthetic */ void m8712r(C2339b c2339b, String str, boolean z, boolean z2, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addPendingOps");
        }
        if ((i2 & 2) != 0) {
            z = false;
        }
        if ((i2 & 4) != 0) {
            z2 = true;
        }
        c2339b.m8720q(str, z, z2);
    }

    /* renamed from: w */
    public static final void m8713w(C2339b c2339b, xca xcaVar, AbstractC2139h.a aVar) {
        sq8.m48649h(c2339b, "this$0");
        sq8.m48649h(xcaVar, "source");
        sq8.m48649h(aVar, "event");
        if (aVar == AbstractC2139h.a.ON_DESTROY) {
            Fragment fragment = (Fragment) xcaVar;
            Object obj = null;
            for (Object obj2 : (Iterable) c2339b.m8949b().m56784c().getValue()) {
                if (sq8.m48644c(((C2332c) obj2).m8554f(), fragment.getTag())) {
                    obj = obj2;
                }
            }
            C2332c c2332c = (C2332c) obj;
            if (c2332c != null) {
                if (c2339b.m8726y(2)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Marking transition complete for entry ");
                    sb.append(c2332c);
                    sb.append(" due to fragment ");
                    sb.append(xcaVar);
                    sb.append(" lifecycle reaching DESTROYED");
                }
                c2339b.m8949b().mo8621e(c2332c);
            }
        }
    }

    @Override // androidx.navigation.AbstractC2348o
    /* renamed from: e */
    public void mo8714e(List list, C2345l c2345l, AbstractC2348o.a aVar) {
        sq8.m48649h(list, RemoteConfigConstants.ResponseFieldKey.ENTRIES);
        if (this.f9570d.W0()) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            m8727z((C2332c) it.next(), c2345l, aVar);
        }
    }

    @Override // androidx.navigation.AbstractC2348o
    /* renamed from: f */
    public void mo8715f(final xsb xsbVar) {
        sq8.m48649h(xsbVar, "state");
        super.mo8715f(xsbVar);
        m8726y(2);
        this.f9570d.m6199k(new wh7() { // from class: o.sh7
            @Override // p001o.wh7
            /* renamed from: a */
            public final void mo6153a(FragmentManager fragmentManager, Fragment fragment) {
                C2339b.m8706A(xsbVar, this, fragmentManager, fragment);
            }
        });
        this.f9570d.m6200l(new i(xsbVar, this));
    }

    @Override // androidx.navigation.AbstractC2348o
    /* renamed from: g */
    public void mo8716g(C2332c c2332c) {
        sq8.m48649h(c2332c, "backStackEntry");
        if (this.f9570d.W0()) {
            return;
        }
        AbstractC2124j abstractC2124jM8724v = m8724v(c2332c, null);
        List list = (List) m8949b().m56783b().getValue();
        if (list.size() > 1) {
            C2332c c2332c2 = (C2332c) kh3.i0(list, ch3.m21248m(list) - 1);
            if (c2332c2 != null) {
                m8712r(this, c2332c2.m8554f(), false, false, 6, null);
            }
            m8712r(this, c2332c.m8554f(), true, false, 4, null);
            this.f9570d.m1(c2332c.m8554f(), 1);
            m8712r(this, c2332c.m8554f(), false, false, 2, null);
            abstractC2124jM8724v.m6423g(c2332c.m8554f());
        }
        abstractC2124jM8724v.mo6260h();
        m8949b().m56786f(c2332c);
    }

    @Override // androidx.navigation.AbstractC2348o
    /* renamed from: h */
    public void mo8717h(Bundle bundle) {
        sq8.m48649h(bundle, "savedState");
        ArrayList<String> stringArrayList = bundle.getStringArrayList("androidx-nav-fragment:navigator:savedIds");
        if (stringArrayList != null) {
            this.f9572f.clear();
            hh3.m30441A(this.f9572f, stringArrayList);
        }
    }

    @Override // androidx.navigation.AbstractC2348o
    /* renamed from: i */
    public Bundle mo8718i() {
        if (this.f9572f.isEmpty()) {
            return null;
        }
        return in1.m32435b(vyh.m53620a("androidx-nav-fragment:navigator:savedIds", new ArrayList(this.f9572f)));
    }

    @Override // androidx.navigation.AbstractC2348o
    /* renamed from: j */
    public void mo8719j(C2332c c2332c, boolean z) {
        sq8.m48649h(c2332c, "popUpTo");
        if (this.f9570d.W0()) {
            return;
        }
        List list = (List) m8949b().m56783b().getValue();
        int iIndexOf = list.indexOf(c2332c);
        List listSubList = list.subList(iIndexOf, list.size());
        C2332c c2332c2 = (C2332c) kh3.f0(list);
        C2332c c2332c3 = (C2332c) kh3.i0(list, iIndexOf - 1);
        if (c2332c3 != null) {
            m8712r(this, c2332c3.m8554f(), false, false, 6, null);
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : listSubList) {
            C2332c c2332c4 = (C2332c) obj;
            if (qef.m45308k(qef.m45319v(kh3.m35706V(this.f9573g), j.f9590a), c2332c4.m8554f()) || !sq8.m48644c(c2332c4.m8554f(), c2332c2.m8554f())) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            m8712r(this, ((C2332c) it.next()).m8554f(), true, false, 4, null);
        }
        if (z) {
            for (C2332c c2332c5 : kh3.B0(listSubList)) {
                if (sq8.m48644c(c2332c5, c2332c2)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("FragmentManager cannot save the state of the initial destination ");
                    sb.append(c2332c5);
                } else {
                    this.f9570d.E1(c2332c5.m8554f());
                    this.f9572f.add(c2332c5.m8554f());
                }
            }
        } else {
            this.f9570d.m1(c2332c.m8554f(), 1);
        }
        if (m8726y(2)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Calling popWithTransition via popBackStack() on entry ");
            sb2.append(c2332c);
            sb2.append(" with savedState ");
            sb2.append(z);
        }
        m8949b().mo8623i(c2332c, z);
    }

    /* renamed from: q */
    public final void m8720q(String str, boolean z, boolean z2) {
        if (z2) {
            hh3.m30447G(this.f9573g, new d(str));
        }
        this.f9573g.add(vyh.m53620a(str, Boolean.valueOf(z)));
    }

    /* renamed from: s */
    public final void m8721s(Fragment fragment, C2332c c2332c, xsb xsbVar) {
        sq8.m48649h(fragment, "fragment");
        sq8.m48649h(c2332c, "entry");
        sq8.m48649h(xsbVar, "state");
        kxi viewModelStore = fragment.getViewModelStore();
        sq8.m48648g(viewModelStore, "fragment.viewModelStore");
        ri8 ri8Var = new ri8();
        ri8Var.m46815a(kge.m35689b(a.class), f.f9583a);
        ((a) new b0(viewModelStore, ri8Var.m46816b(), ya4.C18361a.f55136b).m6505a(a.class)).m8729g(new WeakReference(new e(c2332c, xsbVar, this, fragment)));
    }

    /* renamed from: t */
    public final void m8722t(C2332c c2332c, Fragment fragment) {
        fragment.getViewLifecycleOwnerLiveData().observe(fragment, new k(new g(fragment, c2332c)));
        fragment.getLifecycle().mo6521a(this.f9574h);
    }

    @Override // androidx.navigation.AbstractC2348o
    /* renamed from: u, reason: merged with bridge method [inline-methods] */
    public c mo8527a() {
        return new c(this);
    }

    /* renamed from: v */
    public final AbstractC2124j m8724v(C2332c c2332c, C2345l c2345l) {
        AbstractC2341h abstractC2341hM8553e = c2332c.m8553e();
        sq8.m48647f(abstractC2341hM8553e, "null cannot be cast to non-null type androidx.navigation.fragment.FragmentNavigator.Destination");
        Bundle bundleM8551c = c2332c.m8551c();
        String strM8730V = ((c) abstractC2341hM8553e).m8730V();
        if (strM8730V.charAt(0) == '.') {
            strM8730V = this.f9569c.getPackageName() + strM8730V;
        }
        Fragment fragmentMo6226a = this.f9570d.z0().mo6226a(this.f9569c.getClassLoader(), strM8730V);
        sq8.m48648g(fragmentMo6226a, "fragmentManager.fragment…t.classLoader, className)");
        fragmentMo6226a.setArguments(bundleM8551c);
        AbstractC2124j abstractC2124jM6205q = this.f9570d.m6205q();
        sq8.m48648g(abstractC2124jM6205q, "fragmentManager.beginTransaction()");
        int iM8801a = c2345l != null ? c2345l.m8801a() : -1;
        int iM8802b = c2345l != null ? c2345l.m8802b() : -1;
        int iM8803c = c2345l != null ? c2345l.m8803c() : -1;
        int iM8804d = c2345l != null ? c2345l.m8804d() : -1;
        if (iM8801a != -1 || iM8802b != -1 || iM8803c != -1 || iM8804d != -1) {
            if (iM8801a == -1) {
                iM8801a = 0;
            }
            if (iM8802b == -1) {
                iM8802b = 0;
            }
            if (iM8803c == -1) {
                iM8803c = 0;
            }
            abstractC2124jM6205q.m6428s(iM8801a, iM8802b, iM8803c, iM8804d != -1 ? iM8804d : 0);
        }
        abstractC2124jM6205q.m6426q(this.f9571e, fragmentMo6226a, c2332c.m8554f());
        abstractC2124jM6205q.mo6268u(fragmentMo6226a);
        abstractC2124jM6205q.m6429v(true);
        return abstractC2124jM6205q;
    }

    /* renamed from: x */
    public final List m8725x() {
        return this.f9573g;
    }

    /* renamed from: y */
    public final boolean m8726y(int i2) {
        return Log.isLoggable("FragmentManager", i2) || Log.isLoggable("FragmentNavigator", i2);
    }

    /* renamed from: z */
    public final void m8727z(C2332c c2332c, C2345l c2345l, AbstractC2348o.a aVar) {
        boolean zIsEmpty = ((List) m8949b().m56783b().getValue()).isEmpty();
        if (c2345l != null && !zIsEmpty && c2345l.m8812l() && this.f9572f.remove(c2332c.m8554f())) {
            this.f9570d.z1(c2332c.m8554f());
            m8949b().m56788l(c2332c);
            return;
        }
        AbstractC2124j abstractC2124jM8724v = m8724v(c2332c, c2345l);
        if (!zIsEmpty) {
            C2332c c2332c2 = (C2332c) kh3.s0((List) m8949b().m56783b().getValue());
            if (c2332c2 != null) {
                m8712r(this, c2332c2.m8554f(), false, false, 6, null);
            }
            m8712r(this, c2332c.m8554f(), false, false, 6, null);
            abstractC2124jM8724v.m6423g(c2332c.m8554f());
        }
        abstractC2124jM8724v.mo6260h();
        if (m8726y(2)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Calling pushWithTransition via navigate() on entry ");
            sb.append(c2332c);
        }
        m8949b().m56788l(c2332c);
    }
}
