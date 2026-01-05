package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.IntentSenderRequest;
import androidx.fragment.app.AbstractC2124j;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.AbstractC2139h;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import p001o.bbb;
import p001o.bh7;
import p001o.dbc;
import p001o.ebc;
import p001o.f1f;
import p001o.h1f;
import p001o.hbc;
import p001o.hi7;
import p001o.hu3;
import p001o.i0g;
import p001o.kbc;
import p001o.kcc;
import p001o.kob;
import p001o.kxi;
import p001o.l91;
import p001o.lxi;
import p001o.mja;
import p001o.ns;
import p001o.os;
import p001o.qg7;
import p001o.s7d;
import p001o.ss;
import p001o.tab;
import p001o.us;
import p001o.vbc;
import p001o.wh7;
import p001o.ws;
import p001o.xca;
import p001o.xs;
import p001o.y8e;
import p001o.ys;
import p001o.zbc;

/* loaded from: classes2.dex */
public abstract class FragmentManager {

    /* renamed from: U */
    public static boolean f7393U = false;

    /* renamed from: V */
    public static boolean f7394V = true;

    /* renamed from: A */
    public Fragment f7395A;

    /* renamed from: F */
    public ws f7400F;

    /* renamed from: G */
    public ws f7401G;

    /* renamed from: H */
    public ws f7402H;

    /* renamed from: J */
    public boolean f7404J;

    /* renamed from: K */
    public boolean f7405K;

    /* renamed from: L */
    public boolean f7406L;

    /* renamed from: M */
    public boolean f7407M;

    /* renamed from: N */
    public boolean f7408N;

    /* renamed from: O */
    public ArrayList f7409O;

    /* renamed from: P */
    public ArrayList f7410P;

    /* renamed from: Q */
    public ArrayList f7411Q;

    /* renamed from: R */
    public C2121g f7412R;

    /* renamed from: S */
    public hi7.C13976c f7413S;

    /* renamed from: b */
    public boolean f7416b;

    /* renamed from: e */
    public ArrayList f7419e;

    /* renamed from: g */
    public ebc f7421g;

    /* renamed from: x */
    public bh7 f7438x;

    /* renamed from: y */
    public qg7 f7439y;

    /* renamed from: z */
    public Fragment f7440z;

    /* renamed from: a */
    public final ArrayList f7415a = new ArrayList();

    /* renamed from: c */
    public final C2123i f7417c = new C2123i();

    /* renamed from: d */
    public ArrayList f7418d = new ArrayList();

    /* renamed from: f */
    public final LayoutInflaterFactory2C2119e f7420f = new LayoutInflaterFactory2C2119e(this);

    /* renamed from: h */
    public C2115a f7422h = null;

    /* renamed from: i */
    public boolean f7423i = false;

    /* renamed from: j */
    public final dbc f7424j = new C2095b(false);

    /* renamed from: k */
    public final AtomicInteger f7425k = new AtomicInteger();

    /* renamed from: l */
    public final Map f7426l = Collections.synchronizedMap(new HashMap());

    /* renamed from: m */
    public final Map f7427m = Collections.synchronizedMap(new HashMap());

    /* renamed from: n */
    public final Map f7428n = Collections.synchronizedMap(new HashMap());

    /* renamed from: o */
    public ArrayList f7429o = new ArrayList();

    /* renamed from: p */
    public final C2120f f7430p = new C2120f(this);

    /* renamed from: q */
    public final CopyOnWriteArrayList f7431q = new CopyOnWriteArrayList();

    /* renamed from: r */
    public final hu3 f7432r = new hu3() { // from class: o.ih7
        @Override // p001o.hu3
        public final void accept(Object obj) {
            this.f28664a.Z0((Configuration) obj);
        }
    };

    /* renamed from: s */
    public final hu3 f7433s = new hu3() { // from class: o.jh7
        @Override // p001o.hu3
        public final void accept(Object obj) {
            this.f30430a.a1((Integer) obj);
        }
    };

    /* renamed from: t */
    public final hu3 f7434t = new hu3() { // from class: o.kh7
        @Override // p001o.hu3
        public final void accept(Object obj) {
            this.f32249a.b1((kob) obj);
        }
    };

    /* renamed from: u */
    public final hu3 f7435u = new hu3() { // from class: o.lh7
        @Override // p001o.hu3
        public final void accept(Object obj) {
            this.f33812a.c1((s7d) obj);
        }
    };

    /* renamed from: v */
    public final bbb f7436v = new C2096c();

    /* renamed from: w */
    public int f7437w = -1;

    /* renamed from: B */
    public AbstractC2118d f7396B = null;

    /* renamed from: C */
    public AbstractC2118d f7397C = new C2097d();

    /* renamed from: D */
    public i0g f7398D = null;

    /* renamed from: E */
    public i0g f7399E = new C2098e();

    /* renamed from: I */
    public ArrayDeque f7403I = new ArrayDeque();

    /* renamed from: T */
    public Runnable f7414T = new RunnableC2099f();

    /* renamed from: androidx.fragment.app.FragmentManager$a */
    public class C2094a implements ns {
        public C2094a() {
        }

        @Override // p001o.ns
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void mo6217a(Map map) {
            String[] strArr = (String[]) map.keySet().toArray(new String[0]);
            ArrayList arrayList = new ArrayList(map.values());
            int[] iArr = new int[arrayList.size()];
            for (int i = 0; i < arrayList.size(); i++) {
                iArr[i] = ((Boolean) arrayList.get(i)).booleanValue() ? 0 : -1;
            }
            LaunchedFragmentInfo launchedFragmentInfo = (LaunchedFragmentInfo) FragmentManager.this.f7403I.pollFirst();
            if (launchedFragmentInfo == null) {
                StringBuilder sb = new StringBuilder();
                sb.append("No permissions were requested for ");
                sb.append(this);
                return;
            }
            String str = launchedFragmentInfo.f7441a;
            int i2 = launchedFragmentInfo.f7442b;
            Fragment fragmentM6400i = FragmentManager.this.f7417c.m6400i(str);
            if (fragmentM6400i != null) {
                fragmentM6400i.onRequestPermissionsResult(i2, strArr, iArr);
                return;
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Permission request result delivered for unknown Fragment ");
            sb2.append(str);
        }
    }

    /* renamed from: androidx.fragment.app.FragmentManager$b */
    public class C2095b extends dbc {
        public C2095b(boolean z) {
            super(z);
        }

        @Override // p001o.dbc
        /* renamed from: c */
        public void mo6219c() {
            if (FragmentManager.P0(3)) {
                StringBuilder sb = new StringBuilder();
                sb.append("handleOnBackCancelled. PREDICTIVE_BACK = ");
                sb.append(FragmentManager.f7394V);
                sb.append(" fragment manager ");
                sb.append(FragmentManager.this);
            }
            if (FragmentManager.f7394V) {
                FragmentManager.this.m6206r();
            }
        }

        @Override // p001o.dbc
        /* renamed from: d */
        public void mo940d() {
            if (FragmentManager.P0(3)) {
                StringBuilder sb = new StringBuilder();
                sb.append("handleOnBackPressed. PREDICTIVE_BACK = ");
                sb.append(FragmentManager.f7394V);
                sb.append(" fragment manager ");
                sb.append(FragmentManager.this);
            }
            FragmentManager.this.L0();
        }

        @Override // p001o.dbc
        /* renamed from: e */
        public void mo6220e(l91 l91Var) {
            if (FragmentManager.P0(2)) {
                StringBuilder sb = new StringBuilder();
                sb.append("handleOnBackProgressed. PREDICTIVE_BACK = ");
                sb.append(FragmentManager.f7394V);
                sb.append(" fragment manager ");
                sb.append(FragmentManager.this);
            }
            FragmentManager fragmentManager = FragmentManager.this;
            if (fragmentManager.f7422h != null) {
                Iterator it = fragmentManager.m6212x(new ArrayList(Collections.singletonList(FragmentManager.this.f7422h)), 0, 1).iterator();
                while (it.hasNext()) {
                    ((AbstractC2126l) it.next()).m6443A(l91Var);
                }
                Iterator it2 = FragmentManager.this.f7429o.iterator();
                while (it2.hasNext()) {
                    ((InterfaceC2105l) it2.next()).m6235b(l91Var);
                }
            }
        }

        @Override // p001o.dbc
        /* renamed from: f */
        public void mo6221f(l91 l91Var) {
            if (FragmentManager.P0(3)) {
                StringBuilder sb = new StringBuilder();
                sb.append("handleOnBackStarted. PREDICTIVE_BACK = ");
                sb.append(FragmentManager.f7394V);
                sb.append(" fragment manager ");
                sb.append(FragmentManager.this);
            }
            if (FragmentManager.f7394V) {
                FragmentManager.this.a0();
                FragmentManager.this.s1();
            }
        }
    }

    /* renamed from: androidx.fragment.app.FragmentManager$c */
    public class C2096c implements bbb {
        public C2096c() {
        }

        @Override // p001o.bbb
        /* renamed from: a */
        public void mo6222a(Menu menu) {
            FragmentManager.this.m6184N(menu);
        }

        @Override // p001o.bbb
        /* renamed from: b */
        public void mo6223b(Menu menu) {
            FragmentManager.this.m6188R(menu);
        }

        @Override // p001o.bbb
        /* renamed from: c */
        public boolean mo6224c(MenuItem menuItem) {
            return FragmentManager.this.m6183M(menuItem);
        }

        @Override // p001o.bbb
        /* renamed from: d */
        public void mo6225d(Menu menu, MenuInflater menuInflater) {
            FragmentManager.this.m6176F(menu, menuInflater);
        }
    }

    /* renamed from: androidx.fragment.app.FragmentManager$d */
    public class C2097d extends AbstractC2118d {
        public C2097d() {
        }

        @Override // androidx.fragment.app.AbstractC2118d
        /* renamed from: a */
        public Fragment mo6226a(ClassLoader classLoader, String str) {
            return FragmentManager.this.C0().m45426b(FragmentManager.this.C0().m18966f(), str, null);
        }
    }

    /* renamed from: androidx.fragment.app.FragmentManager$e */
    public class C2098e implements i0g {
        public C2098e() {
        }

        @Override // p001o.i0g
        /* renamed from: a */
        public AbstractC2126l mo6227a(ViewGroup viewGroup) {
            return new C2116b(viewGroup);
        }
    }

    /* renamed from: androidx.fragment.app.FragmentManager$f */
    public class RunnableC2099f implements Runnable {
        public RunnableC2099f() {
        }

        @Override // java.lang.Runnable
        public void run() {
            FragmentManager.this.d0(true);
        }
    }

    /* renamed from: androidx.fragment.app.FragmentManager$g */
    public class C2100g implements wh7 {

        /* renamed from: a */
        public final /* synthetic */ Fragment f7449a;

        public C2100g(Fragment fragment) {
            this.f7449a = fragment;
        }

        @Override // p001o.wh7
        /* renamed from: a */
        public void mo6153a(FragmentManager fragmentManager, Fragment fragment) {
            this.f7449a.onAttachFragment(fragment);
        }
    }

    /* renamed from: androidx.fragment.app.FragmentManager$h */
    public class C2101h implements ns {
        public C2101h() {
        }

        @Override // p001o.ns
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void mo6217a(ActivityResult activityResult) {
            LaunchedFragmentInfo launchedFragmentInfo = (LaunchedFragmentInfo) FragmentManager.this.f7403I.pollLast();
            if (launchedFragmentInfo == null) {
                StringBuilder sb = new StringBuilder();
                sb.append("No Activities were started for result for ");
                sb.append(this);
                return;
            }
            String str = launchedFragmentInfo.f7441a;
            int i = launchedFragmentInfo.f7442b;
            Fragment fragmentM6400i = FragmentManager.this.f7417c.m6400i(str);
            if (fragmentM6400i != null) {
                fragmentM6400i.onActivityResult(i, activityResult.m3726b(), activityResult.m3725a());
                return;
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Activity result delivered for unknown Fragment ");
            sb2.append(str);
        }
    }

    /* renamed from: androidx.fragment.app.FragmentManager$i */
    public class C2102i implements ns {
        public C2102i() {
        }

        @Override // p001o.ns
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void mo6217a(ActivityResult activityResult) {
            LaunchedFragmentInfo launchedFragmentInfo = (LaunchedFragmentInfo) FragmentManager.this.f7403I.pollFirst();
            if (launchedFragmentInfo == null) {
                StringBuilder sb = new StringBuilder();
                sb.append("No IntentSenders were started for ");
                sb.append(this);
                return;
            }
            String str = launchedFragmentInfo.f7441a;
            int i = launchedFragmentInfo.f7442b;
            Fragment fragmentM6400i = FragmentManager.this.f7417c.m6400i(str);
            if (fragmentM6400i != null) {
                fragmentM6400i.onActivityResult(i, activityResult.m3726b(), activityResult.m3725a());
                return;
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Intent Sender result delivered for unknown Fragment ");
            sb2.append(str);
        }
    }

    /* renamed from: androidx.fragment.app.FragmentManager$j */
    public static class C2103j extends os {
        @Override // p001o.os
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public Intent mo6230a(Context context, IntentSenderRequest intentSenderRequest) {
            Bundle bundleExtra;
            Intent intent = new Intent("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST");
            Intent intentM3729a = intentSenderRequest.m3729a();
            if (intentM3729a != null && (bundleExtra = intentM3729a.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) != null) {
                intent.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundleExtra);
                intentM3729a.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
                if (intentM3729a.getBooleanExtra("androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE", false)) {
                    intentSenderRequest = new IntentSenderRequest.C1751a(intentSenderRequest.m3732d()).m3734b(null).m3735c(intentSenderRequest.m3731c(), intentSenderRequest.m3730b()).m3733a();
                }
            }
            intent.putExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST", intentSenderRequest);
            if (FragmentManager.P0(2)) {
                StringBuilder sb = new StringBuilder();
                sb.append("CreateIntent created the following intent: ");
                sb.append(intent);
            }
            return intent;
        }

        @Override // p001o.os
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public ActivityResult mo6231c(int i, Intent intent) {
            return new ActivityResult(i, intent);
        }
    }

    /* renamed from: androidx.fragment.app.FragmentManager$k */
    public static abstract class AbstractC2104k {
        @Deprecated
        public void onFragmentActivityCreated(FragmentManager fragmentManager, Fragment fragment, Bundle bundle) {
        }

        public void onFragmentAttached(FragmentManager fragmentManager, Fragment fragment, Context context) {
        }

        public void onFragmentCreated(FragmentManager fragmentManager, Fragment fragment, Bundle bundle) {
        }

        public void onFragmentDestroyed(FragmentManager fragmentManager, Fragment fragment) {
        }

        public void onFragmentDetached(FragmentManager fragmentManager, Fragment fragment) {
        }

        public void onFragmentPaused(FragmentManager fragmentManager, Fragment fragment) {
        }

        public void onFragmentPreAttached(FragmentManager fragmentManager, Fragment fragment, Context context) {
        }

        public void onFragmentPreCreated(FragmentManager fragmentManager, Fragment fragment, Bundle bundle) {
        }

        public void onFragmentResumed(FragmentManager fragmentManager, Fragment fragment) {
        }

        public void onFragmentSaveInstanceState(FragmentManager fragmentManager, Fragment fragment, Bundle bundle) {
        }

        public void onFragmentStarted(FragmentManager fragmentManager, Fragment fragment) {
        }

        public void onFragmentStopped(FragmentManager fragmentManager, Fragment fragment) {
        }

        public void onFragmentViewCreated(FragmentManager fragmentManager, Fragment fragment, View view, Bundle bundle) {
        }

        public void onFragmentViewDestroyed(FragmentManager fragmentManager, Fragment fragment) {
        }
    }

    /* renamed from: androidx.fragment.app.FragmentManager$l */
    public interface InterfaceC2105l {
        /* renamed from: a */
        void mo6234a(Fragment fragment, boolean z);

        /* renamed from: b */
        default void m6235b(l91 l91Var) {
        }

        /* renamed from: c */
        void mo6236c(Fragment fragment, boolean z);

        /* renamed from: d */
        default void m6237d() {
        }

        /* renamed from: e */
        void mo6238e();
    }

    /* renamed from: androidx.fragment.app.FragmentManager$m */
    public interface InterfaceC2106m {
        /* renamed from: a */
        boolean mo6239a(ArrayList arrayList, ArrayList arrayList2);
    }

    /* renamed from: androidx.fragment.app.FragmentManager$n */
    public class C2107n implements InterfaceC2106m {

        /* renamed from: a */
        public final String f7453a;

        /* renamed from: b */
        public final int f7454b;

        /* renamed from: c */
        public final int f7455c;

        public C2107n(String str, int i, int i2) {
            this.f7453a = str;
            this.f7454b = i;
            this.f7455c = i2;
        }

        @Override // androidx.fragment.app.FragmentManager.InterfaceC2106m
        /* renamed from: a */
        public boolean mo6239a(ArrayList arrayList, ArrayList arrayList2) {
            Fragment fragment = FragmentManager.this.f7395A;
            if (fragment == null || this.f7454b >= 0 || this.f7453a != null || !fragment.getChildFragmentManager().n1()) {
                return FragmentManager.this.q1(arrayList, arrayList2, this.f7453a, this.f7454b, this.f7455c);
            }
            return false;
        }
    }

    /* renamed from: androidx.fragment.app.FragmentManager$o */
    public class C2108o implements InterfaceC2106m {
        public C2108o() {
        }

        @Override // androidx.fragment.app.FragmentManager.InterfaceC2106m
        /* renamed from: a */
        public boolean mo6239a(ArrayList arrayList, ArrayList arrayList2) {
            boolean zR1 = FragmentManager.this.r1(arrayList, arrayList2);
            if (!FragmentManager.this.f7429o.isEmpty() && arrayList.size() > 0) {
                boolean zBooleanValue = ((Boolean) arrayList2.get(arrayList.size() - 1)).booleanValue();
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    linkedHashSet.addAll(FragmentManager.this.r0((C2115a) it.next()));
                }
                Iterator it2 = FragmentManager.this.f7429o.iterator();
                while (it2.hasNext()) {
                    InterfaceC2105l interfaceC2105l = (InterfaceC2105l) it2.next();
                    Iterator it3 = linkedHashSet.iterator();
                    while (it3.hasNext()) {
                        interfaceC2105l.mo6236c((Fragment) it3.next(), zBooleanValue);
                    }
                }
            }
            return zR1;
        }
    }

    /* renamed from: androidx.fragment.app.FragmentManager$p */
    public class C2109p implements InterfaceC2106m {

        /* renamed from: a */
        public final String f7458a;

        public C2109p(String str) {
            this.f7458a = str;
        }

        @Override // androidx.fragment.app.FragmentManager.InterfaceC2106m
        /* renamed from: a */
        public boolean mo6239a(ArrayList arrayList, ArrayList arrayList2) {
            return FragmentManager.this.A1(arrayList, arrayList2, this.f7458a);
        }
    }

    /* renamed from: androidx.fragment.app.FragmentManager$q */
    public class C2110q implements InterfaceC2106m {

        /* renamed from: a */
        public final String f7460a;

        public C2110q(String str) {
            this.f7460a = str;
        }

        @Override // androidx.fragment.app.FragmentManager.InterfaceC2106m
        /* renamed from: a */
        public boolean mo6239a(ArrayList arrayList, ArrayList arrayList2) {
            return FragmentManager.this.F1(arrayList, arrayList2, this.f7460a);
        }
    }

    public static int C1(int i) {
        int i2 = 4097;
        if (i == 4097) {
            return 8194;
        }
        if (i != 8194) {
            i2 = 8197;
            if (i == 8197) {
                return 4100;
            }
            if (i == 4099) {
                return 4099;
            }
            if (i != 4100) {
                return 0;
            }
        }
        return i2;
    }

    public static Fragment J0(View view) {
        Object tag = view.getTag(y8e.fragment_container_view_tag);
        if (tag instanceof Fragment) {
            return (Fragment) tag;
        }
        return null;
    }

    public static boolean P0(int i) {
        return f7393U || Log.isLoggable("FragmentManager", i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void Y0() {
        Iterator it = this.f7429o.iterator();
        while (it.hasNext()) {
            ((InterfaceC2105l) it.next()).m6237d();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void Z0(Configuration configuration) {
        if (R0()) {
            m6173C(configuration, false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a1(Integer num) {
        if (R0() && num.intValue() == 80) {
            m6179I(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b1(kob kobVar) {
        if (R0()) {
            m6180J(kobVar.m35984a(), false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c1(s7d s7dVar) {
        if (R0()) {
            m6187Q(s7dVar.m47950a(), false);
        }
    }

    public static void f0(ArrayList arrayList, ArrayList arrayList2, int i, int i2) {
        while (i < i2) {
            C2115a c2115a = (C2115a) arrayList.get(i);
            if (((Boolean) arrayList2.get(i)).booleanValue()) {
                c2115a.m6269x(-1);
                c2115a.m6255D();
            } else {
                c2115a.m6269x(1);
                c2115a.m6254C();
            }
            i++;
        }
    }

    public static Fragment k0(View view) {
        Fragment fragmentP0 = p0(view);
        if (fragmentP0 != null) {
            return fragmentP0;
        }
        throw new IllegalStateException("View " + view + " does not have a Fragment set");
    }

    public static FragmentManager o0(View view) {
        FragmentActivity fragmentActivity;
        Fragment fragmentP0 = p0(view);
        if (fragmentP0 != null) {
            if (fragmentP0.isAdded()) {
                return fragmentP0.getChildFragmentManager();
            }
            throw new IllegalStateException("The Fragment " + fragmentP0 + " that owns View " + view + " has already been destroyed. Nested fragments should always use the child FragmentManager.");
        }
        Context context = view.getContext();
        while (true) {
            if (!(context instanceof ContextWrapper)) {
                fragmentActivity = null;
                break;
            }
            if (context instanceof FragmentActivity) {
                fragmentActivity = (FragmentActivity) context;
                break;
            }
            context = ((ContextWrapper) context).getBaseContext();
        }
        if (fragmentActivity != null) {
            return fragmentActivity.getSupportFragmentManager();
        }
        throw new IllegalStateException("View " + view + " is not within a subclass of FragmentActivity.");
    }

    public static Fragment p0(View view) {
        while (view != null) {
            Fragment fragmentJ0 = J0(view);
            if (fragmentJ0 != null) {
                return fragmentJ0;
            }
            Object parent = view.getParent();
            view = parent instanceof View ? (View) parent : null;
        }
        return null;
    }

    /* renamed from: A */
    public void m6171A() {
        this.f7405K = false;
        this.f7406L = false;
        this.f7412R.m6365q(false);
        m6192V(4);
    }

    public C2123i A0() {
        return this.f7417c;
    }

    public boolean A1(ArrayList arrayList, ArrayList arrayList2, String str) {
        BackStackState backStackState = (BackStackState) this.f7426l.remove(str);
        if (backStackState == null) {
            return false;
        }
        HashMap map = new HashMap();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C2115a c2115a = (C2115a) it.next();
            if (c2115a.f7496w) {
                Iterator it2 = c2115a.f7581c.iterator();
                while (it2.hasNext()) {
                    Fragment fragment = ((AbstractC2124j.a) it2.next()).f7599b;
                    if (fragment != null) {
                        map.put(fragment.mWho, fragment);
                    }
                }
            }
        }
        Iterator it3 = backStackState.m6138a(this, map).iterator();
        while (true) {
            boolean z = false;
            while (it3.hasNext()) {
                if (((C2115a) it3.next()).mo6239a(arrayList, arrayList2) || z) {
                    z = true;
                }
            }
            return z;
        }
    }

    /* renamed from: B */
    public void m6172B() {
        this.f7405K = false;
        this.f7406L = false;
        this.f7412R.m6365q(false);
        m6192V(0);
    }

    public List B0() {
        return this.f7417c.m6406o();
    }

    public void B1(Parcelable parcelable) {
        C2122h c2122h;
        Bundle bundle;
        Bundle bundle2;
        if (parcelable == null) {
            return;
        }
        Bundle bundle3 = (Bundle) parcelable;
        for (String str : bundle3.keySet()) {
            if (str.startsWith("result_") && (bundle2 = bundle3.getBundle(str)) != null) {
                bundle2.setClassLoader(this.f7438x.m18966f().getClassLoader());
                this.f7427m.put(str.substring(7), bundle2);
            }
        }
        HashMap map = new HashMap();
        for (String str2 : bundle3.keySet()) {
            if (str2.startsWith("fragment_") && (bundle = bundle3.getBundle(str2)) != null) {
                bundle.setClassLoader(this.f7438x.m18966f().getClassLoader());
                map.put(str2.substring(9), bundle);
            }
        }
        this.f7417c.m6415x(map);
        FragmentManagerState fragmentManagerState = (FragmentManagerState) bundle3.getParcelable("state");
        if (fragmentManagerState == null) {
            return;
        }
        this.f7417c.m6413v();
        Iterator it = fragmentManagerState.f7462a.iterator();
        while (it.hasNext()) {
            Bundle bundleM6391B = this.f7417c.m6391B((String) it.next(), null);
            if (bundleM6391B != null) {
                Fragment fragmentM6359j = this.f7412R.m6359j(((FragmentState) bundleM6391B.getParcelable("state")).f7474b);
                if (fragmentM6359j != null) {
                    if (P0(2)) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("restoreSaveState: re-attaching retained ");
                        sb.append(fragmentM6359j);
                    }
                    c2122h = new C2122h(this.f7430p, this.f7417c, fragmentM6359j, bundleM6391B);
                } else {
                    c2122h = new C2122h(this.f7430p, this.f7417c, this.f7438x.m18966f().getClassLoader(), z0(), bundleM6391B);
                }
                Fragment fragmentM6378k = c2122h.m6378k();
                fragmentM6378k.mSavedFragmentState = bundleM6391B;
                fragmentM6378k.mFragmentManager = this;
                if (P0(2)) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("restoreSaveState: active (");
                    sb2.append(fragmentM6378k.mWho);
                    sb2.append("): ");
                    sb2.append(fragmentM6378k);
                }
                c2122h.m6382o(this.f7438x.m18966f().getClassLoader());
                this.f7417c.m6409r(c2122h);
                c2122h.m6387t(this.f7437w);
            }
        }
        for (Fragment fragment : this.f7412R.m6361m()) {
            if (!this.f7417c.m6394c(fragment.mWho)) {
                if (P0(2)) {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("Discarding retained Fragment ");
                    sb3.append(fragment);
                    sb3.append(" that was not found in the set of active Fragments ");
                    sb3.append(fragmentManagerState.f7462a);
                }
                this.f7412R.m6364p(fragment);
                fragment.mFragmentManager = this;
                C2122h c2122h2 = new C2122h(this.f7430p, this.f7417c, fragment);
                c2122h2.m6387t(1);
                c2122h2.m6380m();
                fragment.mRemoving = true;
                c2122h2.m6380m();
            }
        }
        this.f7417c.m6414w(fragmentManagerState.f7463b);
        if (fragmentManagerState.f7464c != null) {
            this.f7418d = new ArrayList(fragmentManagerState.f7464c.length);
            int i = 0;
            while (true) {
                BackStackRecordState[] backStackRecordStateArr = fragmentManagerState.f7464c;
                if (i >= backStackRecordStateArr.length) {
                    break;
                }
                C2115a c2115aM6134b = backStackRecordStateArr[i].m6134b(this);
                if (P0(2)) {
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append("restoreAllState: back stack #");
                    sb4.append(i);
                    sb4.append(" (index ");
                    sb4.append(c2115aM6134b.f7495v);
                    sb4.append("): ");
                    sb4.append(c2115aM6134b);
                    PrintWriter printWriter = new PrintWriter(new mja("FragmentManager"));
                    c2115aM6134b.m6253B("  ", printWriter, false);
                    printWriter.close();
                }
                this.f7418d.add(c2115aM6134b);
                i++;
            }
        } else {
            this.f7418d = new ArrayList();
        }
        this.f7425k.set(fragmentManagerState.f7465d);
        String str3 = fragmentManagerState.f7466e;
        if (str3 != null) {
            Fragment fragmentI0 = i0(str3);
            this.f7395A = fragmentI0;
            m6185O(fragmentI0);
        }
        ArrayList arrayList = fragmentManagerState.f7467f;
        if (arrayList != null) {
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                this.f7426l.put((String) arrayList.get(i2), (BackStackState) fragmentManagerState.f7468g.get(i2));
            }
        }
        this.f7403I = new ArrayDeque(fragmentManagerState.f7469h);
    }

    /* renamed from: C */
    public void m6173C(Configuration configuration, boolean z) {
        if (z && (this.f7438x instanceof kbc)) {
            O1(new IllegalStateException("Do not call dispatchConfigurationChanged() on host. Host implements OnConfigurationChangedProvider and automatically dispatches configuration changes to fragments."));
        }
        for (Fragment fragment : this.f7417c.m6406o()) {
            if (fragment != null) {
                fragment.performConfigurationChanged(configuration);
                if (z) {
                    fragment.mChildFragmentManager.m6173C(configuration, true);
                }
            }
        }
    }

    public bh7 C0() {
        return this.f7438x;
    }

    /* renamed from: D */
    public boolean m6174D(MenuItem menuItem) {
        if (this.f7437w < 1) {
            return false;
        }
        for (Fragment fragment : this.f7417c.m6406o()) {
            if (fragment != null && fragment.performContextItemSelected(menuItem)) {
                return true;
            }
        }
        return false;
    }

    public LayoutInflater.Factory2 D0() {
        return this.f7420f;
    }

    /* renamed from: D1, reason: merged with bridge method [inline-methods] */
    public Bundle X0() {
        BackStackRecordState[] backStackRecordStateArr;
        Bundle bundle = new Bundle();
        q0();
        a0();
        d0(true);
        this.f7405K = true;
        this.f7412R.m6365q(true);
        ArrayList arrayListM6416y = this.f7417c.m6416y();
        HashMap mapM6404m = this.f7417c.m6404m();
        if (mapM6404m.isEmpty()) {
            P0(2);
        } else {
            ArrayList arrayListM6417z = this.f7417c.m6417z();
            int size = this.f7418d.size();
            if (size > 0) {
                backStackRecordStateArr = new BackStackRecordState[size];
                for (int i = 0; i < size; i++) {
                    backStackRecordStateArr[i] = new BackStackRecordState((C2115a) this.f7418d.get(i));
                    if (P0(2)) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("saveAllState: adding back stack #");
                        sb.append(i);
                        sb.append(": ");
                        sb.append(this.f7418d.get(i));
                    }
                }
            } else {
                backStackRecordStateArr = null;
            }
            FragmentManagerState fragmentManagerState = new FragmentManagerState();
            fragmentManagerState.f7462a = arrayListM6416y;
            fragmentManagerState.f7463b = arrayListM6417z;
            fragmentManagerState.f7464c = backStackRecordStateArr;
            fragmentManagerState.f7465d = this.f7425k.get();
            Fragment fragment = this.f7395A;
            if (fragment != null) {
                fragmentManagerState.f7466e = fragment.mWho;
            }
            fragmentManagerState.f7467f.addAll(this.f7426l.keySet());
            fragmentManagerState.f7468g.addAll(this.f7426l.values());
            fragmentManagerState.f7469h = new ArrayList(this.f7403I);
            bundle.putParcelable("state", fragmentManagerState);
            for (String str : this.f7427m.keySet()) {
                bundle.putBundle("result_" + str, (Bundle) this.f7427m.get(str));
            }
            for (String str2 : mapM6404m.keySet()) {
                bundle.putBundle("fragment_" + str2, (Bundle) mapM6404m.get(str2));
            }
        }
        return bundle;
    }

    /* renamed from: E */
    public void m6175E() {
        this.f7405K = false;
        this.f7406L = false;
        this.f7412R.m6365q(false);
        m6192V(1);
    }

    public C2120f E0() {
        return this.f7430p;
    }

    public void E1(String str) {
        b0(new C2110q(str), false);
    }

    /* renamed from: F */
    public boolean m6176F(Menu menu, MenuInflater menuInflater) {
        if (this.f7437w < 1) {
            return false;
        }
        ArrayList arrayList = null;
        boolean z = false;
        for (Fragment fragment : this.f7417c.m6406o()) {
            if (fragment != null && T0(fragment) && fragment.performCreateOptionsMenu(menu, menuInflater)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(fragment);
                z = true;
            }
        }
        if (this.f7419e != null) {
            for (int i = 0; i < this.f7419e.size(); i++) {
                Fragment fragment2 = (Fragment) this.f7419e.get(i);
                if (arrayList == null || !arrayList.contains(fragment2)) {
                    fragment2.onDestroyOptionsMenu();
                }
            }
        }
        this.f7419e = arrayList;
        return z;
    }

    public Fragment F0() {
        return this.f7440z;
    }

    public boolean F1(ArrayList arrayList, ArrayList arrayList2, String str) {
        int i;
        int iJ0 = j0(str, -1, true);
        if (iJ0 < 0) {
            return false;
        }
        for (int i2 = iJ0; i2 < this.f7418d.size(); i2++) {
            C2115a c2115a = (C2115a) this.f7418d.get(i2);
            if (!c2115a.f7596r) {
                O1(new IllegalArgumentException("saveBackStack(\"" + str + "\") included FragmentTransactions must use setReorderingAllowed(true) to ensure that the back stack can be restored as an atomic operation. Found " + c2115a + " that did not use setReorderingAllowed(true)."));
            }
        }
        HashSet hashSet = new HashSet();
        for (int i3 = iJ0; i3 < this.f7418d.size(); i3++) {
            C2115a c2115a2 = (C2115a) this.f7418d.get(i3);
            HashSet hashSet2 = new HashSet();
            HashSet hashSet3 = new HashSet();
            Iterator it = c2115a2.f7581c.iterator();
            while (it.hasNext()) {
                AbstractC2124j.a aVar = (AbstractC2124j.a) it.next();
                Fragment fragment = aVar.f7599b;
                if (fragment != null) {
                    if (!aVar.f7600c || (i = aVar.f7598a) == 1 || i == 2 || i == 8) {
                        hashSet.add(fragment);
                        hashSet2.add(fragment);
                    }
                    int i4 = aVar.f7598a;
                    if (i4 == 1 || i4 == 2) {
                        hashSet3.add(fragment);
                    }
                }
            }
            hashSet2.removeAll(hashSet3);
            if (!hashSet2.isEmpty()) {
                StringBuilder sb = new StringBuilder();
                sb.append("saveBackStack(\"");
                sb.append(str);
                sb.append("\") must be self contained and not reference fragments from non-saved FragmentTransactions. Found reference to fragment");
                sb.append(hashSet2.size() == 1 ? " " + hashSet2.iterator().next() : "s " + hashSet2);
                sb.append(" in ");
                sb.append(c2115a2);
                sb.append(" that were previously added to the FragmentManager through a separate FragmentTransaction.");
                O1(new IllegalArgumentException(sb.toString()));
            }
        }
        ArrayDeque arrayDeque = new ArrayDeque(hashSet);
        while (!arrayDeque.isEmpty()) {
            Fragment fragment2 = (Fragment) arrayDeque.removeFirst();
            if (fragment2.mRetainInstance) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("saveBackStack(\"");
                sb2.append(str);
                sb2.append("\") must not contain retained fragments. Found ");
                sb2.append(hashSet.contains(fragment2) ? "direct reference to retained " : "retained child ");
                sb2.append("fragment ");
                sb2.append(fragment2);
                O1(new IllegalArgumentException(sb2.toString()));
            }
            for (Fragment fragment3 : fragment2.mChildFragmentManager.t0()) {
                if (fragment3 != null) {
                    arrayDeque.addLast(fragment3);
                }
            }
        }
        ArrayList arrayList3 = new ArrayList();
        Iterator it2 = hashSet.iterator();
        while (it2.hasNext()) {
            arrayList3.add(((Fragment) it2.next()).mWho);
        }
        ArrayList arrayList4 = new ArrayList(this.f7418d.size() - iJ0);
        for (int i5 = iJ0; i5 < this.f7418d.size(); i5++) {
            arrayList4.add(null);
        }
        BackStackState backStackState = new BackStackState(arrayList3, arrayList4);
        for (int size = this.f7418d.size() - 1; size >= iJ0; size--) {
            C2115a c2115a3 = (C2115a) this.f7418d.remove(size);
            C2115a c2115a4 = new C2115a(c2115a3);
            c2115a4.m6270y();
            arrayList4.set(size - iJ0, new BackStackRecordState(c2115a4));
            c2115a3.f7496w = true;
            arrayList.add(c2115a3);
            arrayList2.add(Boolean.TRUE);
        }
        this.f7426l.put(str, backStackState);
        return true;
    }

    /* renamed from: G */
    public void m6177G() {
        this.f7407M = true;
        d0(true);
        a0();
        m6210v();
        m6192V(-1);
        Object obj = this.f7438x;
        if (obj instanceof kcc) {
            ((kcc) obj).removeOnTrimMemoryListener(this.f7433s);
        }
        Object obj2 = this.f7438x;
        if (obj2 instanceof kbc) {
            ((kbc) obj2).removeOnConfigurationChangedListener(this.f7432r);
        }
        Object obj3 = this.f7438x;
        if (obj3 instanceof vbc) {
            ((vbc) obj3).removeOnMultiWindowModeChangedListener(this.f7434t);
        }
        Object obj4 = this.f7438x;
        if (obj4 instanceof zbc) {
            ((zbc) obj4).removeOnPictureInPictureModeChangedListener(this.f7435u);
        }
        Object obj5 = this.f7438x;
        if ((obj5 instanceof tab) && this.f7440z == null) {
            ((tab) obj5).removeMenuProvider(this.f7436v);
        }
        this.f7438x = null;
        this.f7439y = null;
        this.f7440z = null;
        if (this.f7421g != null) {
            this.f7424j.m22747h();
            this.f7421g = null;
        }
        ws wsVar = this.f7400F;
        if (wsVar != null) {
            wsVar.mo6149d();
            this.f7401G.mo6149d();
            this.f7402H.mo6149d();
        }
    }

    public Fragment G0() {
        return this.f7395A;
    }

    public Fragment.SavedState G1(Fragment fragment) {
        C2122h c2122hM6405n = this.f7417c.m6405n(fragment.mWho);
        if (c2122hM6405n == null || !c2122hM6405n.m6378k().equals(fragment)) {
            O1(new IllegalStateException("Fragment " + fragment + " is not currently in the FragmentManager"));
        }
        return c2122hM6405n.m6384q();
    }

    /* renamed from: H */
    public void m6178H() {
        m6192V(1);
    }

    public i0g H0() {
        i0g i0gVar = this.f7398D;
        if (i0gVar != null) {
            return i0gVar;
        }
        Fragment fragment = this.f7440z;
        return fragment != null ? fragment.mFragmentManager.H0() : this.f7399E;
    }

    public void H1() {
        synchronized (this.f7415a) {
            boolean z = true;
            if (this.f7415a.size() != 1) {
                z = false;
            }
            if (z) {
                this.f7438x.m18968h().removeCallbacks(this.f7414T);
                this.f7438x.m18968h().post(this.f7414T);
                Q1();
            }
        }
    }

    /* renamed from: I */
    public void m6179I(boolean z) {
        if (z && (this.f7438x instanceof kcc)) {
            O1(new IllegalStateException("Do not call dispatchLowMemory() on host. Host implements OnTrimMemoryProvider and automatically dispatches low memory callbacks to fragments."));
        }
        for (Fragment fragment : this.f7417c.m6406o()) {
            if (fragment != null) {
                fragment.performLowMemory();
                if (z) {
                    fragment.mChildFragmentManager.m6179I(true);
                }
            }
        }
    }

    public hi7.C13976c I0() {
        return this.f7413S;
    }

    public void I1(Fragment fragment, boolean z) {
        ViewGroup viewGroupY0 = y0(fragment);
        if (viewGroupY0 == null || !(viewGroupY0 instanceof FragmentContainerView)) {
            return;
        }
        ((FragmentContainerView) viewGroupY0).setDrawDisappearingViewsLast(!z);
    }

    /* renamed from: J */
    public void m6180J(boolean z, boolean z2) {
        if (z2 && (this.f7438x instanceof vbc)) {
            O1(new IllegalStateException("Do not call dispatchMultiWindowModeChanged() on host. Host implements OnMultiWindowModeChangedProvider and automatically dispatches multi-window mode changes to fragments."));
        }
        for (Fragment fragment : this.f7417c.m6406o()) {
            if (fragment != null) {
                fragment.performMultiWindowModeChanged(z);
                if (z2) {
                    fragment.mChildFragmentManager.m6180J(z, true);
                }
            }
        }
    }

    public void J1(Fragment fragment, AbstractC2139h.b bVar) {
        if (fragment.equals(i0(fragment.mWho)) && (fragment.mHost == null || fragment.mFragmentManager == this)) {
            fragment.mMaxState = bVar;
            return;
        }
        throw new IllegalArgumentException("Fragment " + fragment + " is not an active fragment of FragmentManager " + this);
    }

    /* renamed from: K */
    public void m6181K(Fragment fragment) {
        Iterator it = this.f7431q.iterator();
        while (it.hasNext()) {
            ((wh7) it.next()).mo6153a(this, fragment);
        }
    }

    public kxi K0(Fragment fragment) {
        return this.f7412R.m6362n(fragment);
    }

    public void K1(Fragment fragment) {
        if (fragment == null || (fragment.equals(i0(fragment.mWho)) && (fragment.mHost == null || fragment.mFragmentManager == this))) {
            Fragment fragment2 = this.f7395A;
            this.f7395A = fragment;
            m6185O(fragment2);
            m6185O(this.f7395A);
            return;
        }
        throw new IllegalArgumentException("Fragment " + fragment + " is not an active fragment of FragmentManager " + this);
    }

    /* renamed from: L */
    public void m6182L() {
        for (Fragment fragment : this.f7417c.m6403l()) {
            if (fragment != null) {
                fragment.onHiddenChanged(fragment.isHidden());
                fragment.mChildFragmentManager.m6182L();
            }
        }
    }

    public void L0() {
        this.f7423i = true;
        d0(true);
        this.f7423i = false;
        if (!f7394V || this.f7422h == null) {
            if (this.f7424j.m22746g()) {
                P0(3);
                n1();
                return;
            } else {
                P0(3);
                this.f7421g.m24715l();
                return;
            }
        }
        if (!this.f7429o.isEmpty()) {
            LinkedHashSet linkedHashSet = new LinkedHashSet(r0(this.f7422h));
            Iterator it = this.f7429o.iterator();
            while (it.hasNext()) {
                InterfaceC2105l interfaceC2105l = (InterfaceC2105l) it.next();
                Iterator it2 = linkedHashSet.iterator();
                while (it2.hasNext()) {
                    interfaceC2105l.mo6234a((Fragment) it2.next(), true);
                }
            }
        }
        Iterator it3 = this.f7422h.f7581c.iterator();
        while (it3.hasNext()) {
            Fragment fragment = ((AbstractC2124j.a) it3.next()).f7599b;
            if (fragment != null) {
                fragment.mTransitioning = false;
            }
        }
        Iterator it4 = m6212x(new ArrayList(Collections.singletonList(this.f7422h)), 0, 1).iterator();
        while (it4.hasNext()) {
            ((AbstractC2126l) it4.next()).m6449f();
        }
        Iterator it5 = this.f7422h.f7581c.iterator();
        while (it5.hasNext()) {
            Fragment fragment2 = ((AbstractC2124j.a) it5.next()).f7599b;
            if (fragment2 != null && fragment2.mContainer == null) {
                m6213y(fragment2).m6380m();
            }
        }
        this.f7422h = null;
        Q1();
        if (P0(3)) {
            StringBuilder sb = new StringBuilder();
            sb.append("OnBackPressedCallback enabled=");
            sb.append(this.f7424j.m22746g());
            sb.append(" for  FragmentManager ");
            sb.append(this);
        }
    }

    public final void L1(Fragment fragment) {
        ViewGroup viewGroupY0 = y0(fragment);
        if (viewGroupY0 == null || fragment.getEnterAnim() + fragment.getExitAnim() + fragment.getPopEnterAnim() + fragment.getPopExitAnim() <= 0) {
            return;
        }
        if (viewGroupY0.getTag(y8e.visible_removing_fragment_view_tag) == null) {
            viewGroupY0.setTag(y8e.visible_removing_fragment_view_tag, fragment);
        }
        ((Fragment) viewGroupY0.getTag(y8e.visible_removing_fragment_view_tag)).setPopDirection(fragment.getPopDirection());
    }

    /* renamed from: M */
    public boolean m6183M(MenuItem menuItem) {
        if (this.f7437w < 1) {
            return false;
        }
        for (Fragment fragment : this.f7417c.m6406o()) {
            if (fragment != null && fragment.performOptionsItemSelected(menuItem)) {
                return true;
            }
        }
        return false;
    }

    public void M0(Fragment fragment) {
        if (P0(2)) {
            StringBuilder sb = new StringBuilder();
            sb.append("hide: ");
            sb.append(fragment);
        }
        if (fragment.mHidden) {
            return;
        }
        fragment.mHidden = true;
        fragment.mHiddenChanged = true ^ fragment.mHiddenChanged;
        L1(fragment);
    }

    public void M1(Fragment fragment) {
        if (P0(2)) {
            StringBuilder sb = new StringBuilder();
            sb.append("show: ");
            sb.append(fragment);
        }
        if (fragment.mHidden) {
            fragment.mHidden = false;
            fragment.mHiddenChanged = !fragment.mHiddenChanged;
        }
    }

    /* renamed from: N */
    public void m6184N(Menu menu) {
        if (this.f7437w < 1) {
            return;
        }
        for (Fragment fragment : this.f7417c.m6406o()) {
            if (fragment != null) {
                fragment.performOptionsMenuClosed(menu);
            }
        }
    }

    public void N0(Fragment fragment) {
        if (fragment.mAdded && Q0(fragment)) {
            this.f7404J = true;
        }
    }

    public final void N1() {
        Iterator it = this.f7417c.m6402k().iterator();
        while (it.hasNext()) {
            j1((C2122h) it.next());
        }
    }

    /* renamed from: O */
    public final void m6185O(Fragment fragment) {
        if (fragment == null || !fragment.equals(i0(fragment.mWho))) {
            return;
        }
        fragment.performPrimaryNavigationFragmentChanged();
    }

    public boolean O0() {
        return this.f7407M;
    }

    public final void O1(RuntimeException runtimeException) {
        runtimeException.getMessage();
        PrintWriter printWriter = new PrintWriter(new mja("FragmentManager"));
        bh7 bh7Var = this.f7438x;
        try {
            if (bh7Var != null) {
                bh7Var.mo6154i("  ", null, printWriter, new String[0]);
            } else {
                m6196Z("  ", null, printWriter, new String[0]);
            }
            throw runtimeException;
        } catch (Exception unused) {
            throw runtimeException;
        }
    }

    /* renamed from: P */
    public void m6186P() {
        m6192V(5);
    }

    public void P1(AbstractC2104k abstractC2104k) {
        this.f7430p.m6350p(abstractC2104k);
    }

    /* renamed from: Q */
    public void m6187Q(boolean z, boolean z2) {
        if (z2 && (this.f7438x instanceof zbc)) {
            O1(new IllegalStateException("Do not call dispatchPictureInPictureModeChanged() on host. Host implements OnPictureInPictureModeChangedProvider and automatically dispatches picture-in-picture mode changes to fragments."));
        }
        for (Fragment fragment : this.f7417c.m6406o()) {
            if (fragment != null) {
                fragment.performPictureInPictureModeChanged(z);
                if (z2) {
                    fragment.mChildFragmentManager.m6187Q(z, true);
                }
            }
        }
    }

    public final boolean Q0(Fragment fragment) {
        return (fragment.mHasMenu && fragment.mMenuVisible) || fragment.mChildFragmentManager.m6207s();
    }

    public final void Q1() {
        synchronized (this.f7415a) {
            if (!this.f7415a.isEmpty()) {
                this.f7424j.m22749j(true);
                if (P0(3)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("FragmentManager ");
                    sb.append(this);
                    sb.append(" enabling OnBackPressedCallback, caused by non-empty pending actions");
                }
                return;
            }
            boolean z = u0() > 0 && U0(this.f7440z);
            if (P0(3)) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("OnBackPressedCallback for FragmentManager ");
                sb2.append(this);
                sb2.append(" enabled state is ");
                sb2.append(z);
            }
            this.f7424j.m22749j(z);
        }
    }

    /* renamed from: R */
    public boolean m6188R(Menu menu) {
        boolean z = false;
        if (this.f7437w < 1) {
            return false;
        }
        for (Fragment fragment : this.f7417c.m6406o()) {
            if (fragment != null && T0(fragment) && fragment.performPrepareOptionsMenu(menu)) {
                z = true;
            }
        }
        return z;
    }

    public final boolean R0() {
        Fragment fragment = this.f7440z;
        if (fragment == null) {
            return true;
        }
        return fragment.isAdded() && this.f7440z.getParentFragmentManager().R0();
    }

    /* renamed from: S */
    public void m6189S() {
        Q1();
        m6185O(this.f7395A);
    }

    public boolean S0(Fragment fragment) {
        if (fragment == null) {
            return false;
        }
        return fragment.isHidden();
    }

    /* renamed from: T */
    public void m6190T() {
        this.f7405K = false;
        this.f7406L = false;
        this.f7412R.m6365q(false);
        m6192V(7);
    }

    public boolean T0(Fragment fragment) {
        if (fragment == null) {
            return true;
        }
        return fragment.isMenuVisible();
    }

    /* renamed from: U */
    public void m6191U() {
        this.f7405K = false;
        this.f7406L = false;
        this.f7412R.m6365q(false);
        m6192V(5);
    }

    public boolean U0(Fragment fragment) {
        if (fragment == null) {
            return true;
        }
        FragmentManager fragmentManager = fragment.mFragmentManager;
        return fragment.equals(fragmentManager.G0()) && U0(fragmentManager.f7440z);
    }

    /* renamed from: V */
    public final void m6192V(int i) {
        try {
            this.f7416b = true;
            this.f7417c.m6395d(i);
            g1(i, false);
            Iterator it = m6211w().iterator();
            while (it.hasNext()) {
                ((AbstractC2126l) it.next()).m6458q();
            }
            this.f7416b = false;
            d0(true);
        } catch (Throwable th) {
            this.f7416b = false;
            throw th;
        }
    }

    public boolean V0(int i) {
        return this.f7437w >= i;
    }

    /* renamed from: W */
    public void m6193W() {
        this.f7406L = true;
        this.f7412R.m6365q(true);
        m6192V(4);
    }

    public boolean W0() {
        return this.f7405K || this.f7406L;
    }

    /* renamed from: X */
    public void m6194X() {
        m6192V(2);
    }

    /* renamed from: Y */
    public final void m6195Y() {
        if (this.f7408N) {
            this.f7408N = false;
            N1();
        }
    }

    /* renamed from: Z */
    public void m6196Z(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int size;
        String str2 = str + "    ";
        this.f7417c.m6396e(str, fileDescriptor, printWriter, strArr);
        ArrayList arrayList = this.f7419e;
        if (arrayList != null && (size = arrayList.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Fragments Created Menus:");
            for (int i = 0; i < size; i++) {
                Fragment fragment = (Fragment) this.f7419e.get(i);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i);
                printWriter.print(": ");
                printWriter.println(fragment.toString());
            }
        }
        int size2 = this.f7418d.size();
        if (size2 > 0) {
            printWriter.print(str);
            printWriter.println("Back Stack:");
            for (int i2 = 0; i2 < size2; i2++) {
                C2115a c2115a = (C2115a) this.f7418d.get(i2);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i2);
                printWriter.print(": ");
                printWriter.println(c2115a.toString());
                c2115a.m6252A(str2, printWriter);
            }
        }
        printWriter.print(str);
        printWriter.println("Back Stack Index: " + this.f7425k.get());
        synchronized (this.f7415a) {
            int size3 = this.f7415a.size();
            if (size3 > 0) {
                printWriter.print(str);
                printWriter.println("Pending Actions:");
                for (int i3 = 0; i3 < size3; i3++) {
                    InterfaceC2106m interfaceC2106m = (InterfaceC2106m) this.f7415a.get(i3);
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(i3);
                    printWriter.print(": ");
                    printWriter.println(interfaceC2106m);
                }
            }
        }
        printWriter.print(str);
        printWriter.println("FragmentManager misc state:");
        printWriter.print(str);
        printWriter.print("  mHost=");
        printWriter.println(this.f7438x);
        printWriter.print(str);
        printWriter.print("  mContainer=");
        printWriter.println(this.f7439y);
        if (this.f7440z != null) {
            printWriter.print(str);
            printWriter.print("  mParent=");
            printWriter.println(this.f7440z);
        }
        printWriter.print(str);
        printWriter.print("  mCurState=");
        printWriter.print(this.f7437w);
        printWriter.print(" mStateSaved=");
        printWriter.print(this.f7405K);
        printWriter.print(" mStopped=");
        printWriter.print(this.f7406L);
        printWriter.print(" mDestroyed=");
        printWriter.println(this.f7407M);
        if (this.f7404J) {
            printWriter.print(str);
            printWriter.print("  mNeedMenuInvalidate=");
            printWriter.println(this.f7404J);
        }
    }

    public final void a0() {
        Iterator it = m6211w().iterator();
        while (it.hasNext()) {
            ((AbstractC2126l) it.next()).m6458q();
        }
    }

    public void b0(InterfaceC2106m interfaceC2106m, boolean z) {
        if (!z) {
            if (this.f7438x == null) {
                if (!this.f7407M) {
                    throw new IllegalStateException("FragmentManager has not been attached to a host.");
                }
                throw new IllegalStateException("FragmentManager has been destroyed");
            }
            m6208t();
        }
        synchronized (this.f7415a) {
            if (this.f7438x == null) {
                if (!z) {
                    throw new IllegalStateException("Activity has been destroyed");
                }
            } else {
                this.f7415a.add(interfaceC2106m);
                H1();
            }
        }
    }

    public final void c0(boolean z) {
        if (this.f7416b) {
            throw new IllegalStateException("FragmentManager is already executing transactions");
        }
        if (this.f7438x == null) {
            if (!this.f7407M) {
                throw new IllegalStateException("FragmentManager has not been attached to a host.");
            }
            throw new IllegalStateException("FragmentManager has been destroyed");
        }
        if (Looper.myLooper() != this.f7438x.m18968h().getLooper()) {
            throw new IllegalStateException("Must be called from main thread of fragment host");
        }
        if (!z) {
            m6208t();
        }
        if (this.f7409O == null) {
            this.f7409O = new ArrayList();
            this.f7410P = new ArrayList();
        }
    }

    public boolean d0(boolean z) {
        C2115a c2115a;
        c0(z);
        boolean z2 = false;
        if (!this.f7423i && (c2115a = this.f7422h) != null) {
            c2115a.f7494u = false;
            c2115a.m6270y();
            if (P0(3)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Reversing mTransitioningOp ");
                sb.append(this.f7422h);
                sb.append(" as part of execPendingActions for actions ");
                sb.append(this.f7415a);
            }
            this.f7422h.m6271z(false, false);
            this.f7415a.add(0, this.f7422h);
            Iterator it = this.f7422h.f7581c.iterator();
            while (it.hasNext()) {
                Fragment fragment = ((AbstractC2124j.a) it.next()).f7599b;
                if (fragment != null) {
                    fragment.mTransitioning = false;
                }
            }
            this.f7422h = null;
        }
        while (s0(this.f7409O, this.f7410P)) {
            z2 = true;
            this.f7416b = true;
            try {
                w1(this.f7409O, this.f7410P);
            } finally {
                m6209u();
            }
        }
        Q1();
        m6195Y();
        this.f7417c.m6393b();
        return z2;
    }

    public void d1(Fragment fragment, String[] strArr, int i) {
        if (this.f7402H == null) {
            this.f7438x.m18969l(fragment, strArr, i);
            return;
        }
        this.f7403I.addLast(new LaunchedFragmentInfo(fragment.mWho, i));
        this.f7402H.m54945b(strArr);
    }

    public void e0(InterfaceC2106m interfaceC2106m, boolean z) {
        if (z && (this.f7438x == null || this.f7407M)) {
            return;
        }
        c0(z);
        C2115a c2115a = this.f7422h;
        boolean z2 = false;
        if (c2115a != null) {
            c2115a.f7494u = false;
            c2115a.m6270y();
            if (P0(3)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Reversing mTransitioningOp ");
                sb.append(this.f7422h);
                sb.append(" as part of execSingleAction for action ");
                sb.append(interfaceC2106m);
            }
            this.f7422h.m6271z(false, false);
            boolean zMo6239a = this.f7422h.mo6239a(this.f7409O, this.f7410P);
            Iterator it = this.f7422h.f7581c.iterator();
            while (it.hasNext()) {
                Fragment fragment = ((AbstractC2124j.a) it.next()).f7599b;
                if (fragment != null) {
                    fragment.mTransitioning = false;
                }
            }
            this.f7422h = null;
            z2 = zMo6239a;
        }
        boolean zMo6239a2 = interfaceC2106m.mo6239a(this.f7409O, this.f7410P);
        if (z2 || zMo6239a2) {
            this.f7416b = true;
            try {
                w1(this.f7409O, this.f7410P);
            } finally {
                m6209u();
            }
        }
        Q1();
        m6195Y();
        this.f7417c.m6393b();
    }

    public void e1(Fragment fragment, Intent intent, int i, Bundle bundle) {
        if (this.f7400F == null) {
            this.f7438x.m18970n(fragment, intent, i, bundle);
            return;
        }
        this.f7403I.addLast(new LaunchedFragmentInfo(fragment.mWho, i));
        if (bundle != null) {
            intent.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundle);
        }
        this.f7400F.m54945b(intent);
    }

    public void f1(Fragment fragment, IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) {
        Intent intent2;
        if (this.f7401G == null) {
            this.f7438x.m18971o(fragment, intentSender, i, intent, i2, i3, i4, bundle);
            return;
        }
        if (bundle != null) {
            if (intent == null) {
                intent2 = new Intent();
                intent2.putExtra("androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE", true);
            } else {
                intent2 = intent;
            }
            if (P0(2)) {
                StringBuilder sb = new StringBuilder();
                sb.append("ActivityOptions ");
                sb.append(bundle);
                sb.append(" were added to fillInIntent ");
                sb.append(intent2);
                sb.append(" for fragment ");
                sb.append(fragment);
            }
            intent2.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundle);
        } else {
            intent2 = intent;
        }
        IntentSenderRequest intentSenderRequestM3733a = new IntentSenderRequest.C1751a(intentSender).m3734b(intent2).m3735c(i3, i2).m3733a();
        this.f7403I.addLast(new LaunchedFragmentInfo(fragment.mWho, i));
        if (P0(2)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Fragment ");
            sb2.append(fragment);
            sb2.append("is launching an IntentSender for result ");
        }
        this.f7401G.m54945b(intentSenderRequestM3733a);
    }

    public final void g0(ArrayList arrayList, ArrayList arrayList2, int i, int i2) {
        boolean z = ((C2115a) arrayList.get(i)).f7596r;
        ArrayList arrayList3 = this.f7411Q;
        if (arrayList3 == null) {
            this.f7411Q = new ArrayList();
        } else {
            arrayList3.clear();
        }
        this.f7411Q.addAll(this.f7417c.m6406o());
        Fragment fragmentG0 = G0();
        boolean z2 = false;
        for (int i3 = i; i3 < i2; i3++) {
            C2115a c2115a = (C2115a) arrayList.get(i3);
            fragmentG0 = !((Boolean) arrayList2.get(i3)).booleanValue() ? c2115a.m6256E(this.f7411Q, fragmentG0) : c2115a.m6259H(this.f7411Q, fragmentG0);
            z2 = z2 || c2115a.f7587i;
        }
        this.f7411Q.clear();
        if (!z && this.f7437w >= 1) {
            for (int i4 = i; i4 < i2; i4++) {
                Iterator it = ((C2115a) arrayList.get(i4)).f7581c.iterator();
                while (it.hasNext()) {
                    Fragment fragment = ((AbstractC2124j.a) it.next()).f7599b;
                    if (fragment != null && fragment.mFragmentManager != null) {
                        this.f7417c.m6409r(m6213y(fragment));
                    }
                }
            }
        }
        f0(arrayList, arrayList2, i, i2);
        boolean zBooleanValue = ((Boolean) arrayList2.get(i2 - 1)).booleanValue();
        if (z2 && !this.f7429o.isEmpty()) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                linkedHashSet.addAll(r0((C2115a) it2.next()));
            }
            if (this.f7422h == null) {
                Iterator it3 = this.f7429o.iterator();
                while (it3.hasNext()) {
                    InterfaceC2105l interfaceC2105l = (InterfaceC2105l) it3.next();
                    Iterator it4 = linkedHashSet.iterator();
                    while (it4.hasNext()) {
                        interfaceC2105l.mo6236c((Fragment) it4.next(), zBooleanValue);
                    }
                }
                Iterator it5 = this.f7429o.iterator();
                while (it5.hasNext()) {
                    InterfaceC2105l interfaceC2105l2 = (InterfaceC2105l) it5.next();
                    Iterator it6 = linkedHashSet.iterator();
                    while (it6.hasNext()) {
                        interfaceC2105l2.mo6234a((Fragment) it6.next(), zBooleanValue);
                    }
                }
            }
        }
        for (int i5 = i; i5 < i2; i5++) {
            C2115a c2115a2 = (C2115a) arrayList.get(i5);
            if (zBooleanValue) {
                for (int size = c2115a2.f7581c.size() - 1; size >= 0; size--) {
                    Fragment fragment2 = ((AbstractC2124j.a) c2115a2.f7581c.get(size)).f7599b;
                    if (fragment2 != null) {
                        m6213y(fragment2).m6380m();
                    }
                }
            } else {
                Iterator it7 = c2115a2.f7581c.iterator();
                while (it7.hasNext()) {
                    Fragment fragment3 = ((AbstractC2124j.a) it7.next()).f7599b;
                    if (fragment3 != null) {
                        m6213y(fragment3).m6380m();
                    }
                }
            }
        }
        g1(this.f7437w, true);
        for (AbstractC2126l abstractC2126l : m6212x(arrayList, i, i2)) {
            abstractC2126l.m6446D(zBooleanValue);
            abstractC2126l.m6465z();
            abstractC2126l.m6455n();
        }
        while (i < i2) {
            C2115a c2115a3 = (C2115a) arrayList.get(i);
            if (((Boolean) arrayList2.get(i)).booleanValue() && c2115a3.f7495v >= 0) {
                c2115a3.f7495v = -1;
            }
            c2115a3.m6258G();
            i++;
        }
        if (z2) {
            y1();
        }
    }

    public void g1(int i, boolean z) {
        bh7 bh7Var;
        if (this.f7438x == null && i != -1) {
            throw new IllegalStateException("No activity");
        }
        if (z || i != this.f7437w) {
            this.f7437w = i;
            this.f7417c.m6411t();
            N1();
            if (this.f7404J && (bh7Var = this.f7438x) != null && this.f7437w == 7) {
                bh7Var.mo6158p();
                this.f7404J = false;
            }
        }
    }

    public boolean h0() {
        boolean zD0 = d0(true);
        q0();
        return zD0;
    }

    public void h1() {
        if (this.f7438x == null) {
            return;
        }
        this.f7405K = false;
        this.f7406L = false;
        this.f7412R.m6365q(false);
        for (Fragment fragment : this.f7417c.m6406o()) {
            if (fragment != null) {
                fragment.noteStateNotSaved();
            }
        }
    }

    /* renamed from: i */
    public void m6197i(C2115a c2115a) {
        this.f7418d.add(c2115a);
    }

    public Fragment i0(String str) {
        return this.f7417c.m6397f(str);
    }

    public final void i1(FragmentContainerView fragmentContainerView) {
        View view;
        for (C2122h c2122h : this.f7417c.m6402k()) {
            Fragment fragmentM6378k = c2122h.m6378k();
            if (fragmentM6378k.mContainerId == fragmentContainerView.getId() && (view = fragmentM6378k.mView) != null && view.getParent() == null) {
                fragmentM6378k.mContainer = fragmentContainerView;
                c2122h.m6369b();
                c2122h.m6380m();
            }
        }
    }

    /* renamed from: j */
    public C2122h m6198j(Fragment fragment) {
        String str = fragment.mPreviousWho;
        if (str != null) {
            hi7.m30612f(fragment, str);
        }
        if (P0(2)) {
            StringBuilder sb = new StringBuilder();
            sb.append("add: ");
            sb.append(fragment);
        }
        C2122h c2122hM6213y = m6213y(fragment);
        fragment.mFragmentManager = this;
        this.f7417c.m6409r(c2122hM6213y);
        if (!fragment.mDetached) {
            this.f7417c.m6392a(fragment);
            fragment.mRemoving = false;
            if (fragment.mView == null) {
                fragment.mHiddenChanged = false;
            }
            if (Q0(fragment)) {
                this.f7404J = true;
            }
        }
        return c2122hM6213y;
    }

    public final int j0(String str, int i, boolean z) {
        if (this.f7418d.isEmpty()) {
            return -1;
        }
        if (str == null && i < 0) {
            if (z) {
                return 0;
            }
            return this.f7418d.size() - 1;
        }
        int size = this.f7418d.size() - 1;
        while (size >= 0) {
            C2115a c2115a = (C2115a) this.f7418d.get(size);
            if ((str != null && str.equals(c2115a.m6257F())) || (i >= 0 && i == c2115a.f7495v)) {
                break;
            }
            size--;
        }
        if (size < 0) {
            return size;
        }
        if (!z) {
            if (size == this.f7418d.size() - 1) {
                return -1;
            }
            return size + 1;
        }
        while (size > 0) {
            C2115a c2115a2 = (C2115a) this.f7418d.get(size - 1);
            if ((str == null || !str.equals(c2115a2.m6257F())) && (i < 0 || i != c2115a2.f7495v)) {
                return size;
            }
            size--;
        }
        return size;
    }

    public void j1(C2122h c2122h) {
        Fragment fragmentM6378k = c2122h.m6378k();
        if (fragmentM6378k.mDeferStart) {
            if (this.f7416b) {
                this.f7408N = true;
            } else {
                fragmentM6378k.mDeferStart = false;
                c2122h.m6380m();
            }
        }
    }

    /* renamed from: k */
    public void m6199k(wh7 wh7Var) {
        this.f7431q.add(wh7Var);
    }

    public void k1() {
        b0(new C2107n(null, -1, 0), false);
    }

    /* renamed from: l */
    public void m6200l(InterfaceC2105l interfaceC2105l) {
        this.f7429o.add(interfaceC2105l);
    }

    public Fragment l0(int i) {
        return this.f7417c.m6398g(i);
    }

    public void l1(int i, int i2, boolean z) {
        if (i >= 0) {
            b0(new C2107n(null, i, i2), z);
            return;
        }
        throw new IllegalArgumentException("Bad id: " + i);
    }

    /* renamed from: m */
    public void m6201m(Fragment fragment) {
        this.f7412R.m6355f(fragment);
    }

    public Fragment m0(String str) {
        return this.f7417c.m6399h(str);
    }

    public void m1(String str, int i) {
        b0(new C2107n(str, -1, i), false);
    }

    /* renamed from: n */
    public int m6202n() {
        return this.f7425k.getAndIncrement();
    }

    public Fragment n0(String str) {
        return this.f7417c.m6400i(str);
    }

    public boolean n1() {
        return p1(null, -1, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: o */
    public void m6203o(bh7 bh7Var, qg7 qg7Var, Fragment fragment) {
        String str;
        if (this.f7438x != null) {
            throw new IllegalStateException("Already attached");
        }
        this.f7438x = bh7Var;
        this.f7439y = qg7Var;
        this.f7440z = fragment;
        if (fragment != null) {
            m6199k(new C2100g(fragment));
        } else if (bh7Var instanceof wh7) {
            m6199k((wh7) bh7Var);
        }
        if (this.f7440z != null) {
            Q1();
        }
        if (bh7Var instanceof hbc) {
            hbc hbcVar = (hbc) bh7Var;
            ebc onBackPressedDispatcher = hbcVar.getOnBackPressedDispatcher();
            this.f7421g = onBackPressedDispatcher;
            xca xcaVar = hbcVar;
            if (fragment != null) {
                xcaVar = fragment;
            }
            onBackPressedDispatcher.m24711h(xcaVar, this.f7424j);
        }
        if (fragment != null) {
            this.f7412R = fragment.mFragmentManager.v0(fragment);
        } else if (bh7Var instanceof lxi) {
            this.f7412R = C2121g.m6353l(((lxi) bh7Var).getViewModelStore());
        } else {
            this.f7412R = new C2121g(false);
        }
        this.f7412R.m6365q(W0());
        this.f7417c.m6390A(this.f7412R);
        Object obj = this.f7438x;
        if ((obj instanceof h1f) && fragment == null) {
            f1f savedStateRegistry = ((h1f) obj).getSavedStateRegistry();
            savedStateRegistry.m25946h("android:support:fragments", new f1f.InterfaceC13312c() { // from class: o.mh7
                @Override // p001o.f1f.InterfaceC13312c
                /* renamed from: a */
                public final Bundle mo3785a() {
                    return this.f35481a.X0();
                }
            });
            Bundle bundleM25941b = savedStateRegistry.m25941b("android:support:fragments");
            if (bundleM25941b != null) {
                B1(bundleM25941b);
            }
        }
        Object obj2 = this.f7438x;
        if (obj2 instanceof ys) {
            xs activityResultRegistry = ((ys) obj2).getActivityResultRegistry();
            if (fragment != null) {
                str = fragment.mWho + ":";
            } else {
                str = "";
            }
            String str2 = "FragmentManager:" + str;
            this.f7400F = activityResultRegistry.m56740i(str2 + "StartActivityForResult", new us(), new C2101h());
            this.f7401G = activityResultRegistry.m56740i(str2 + "StartIntentSenderForResult", new C2103j(), new C2102i());
            this.f7402H = activityResultRegistry.m56740i(str2 + "RequestPermissions", new ss(), new C2094a());
        }
        Object obj3 = this.f7438x;
        if (obj3 instanceof kbc) {
            ((kbc) obj3).addOnConfigurationChangedListener(this.f7432r);
        }
        Object obj4 = this.f7438x;
        if (obj4 instanceof kcc) {
            ((kcc) obj4).addOnTrimMemoryListener(this.f7433s);
        }
        Object obj5 = this.f7438x;
        if (obj5 instanceof vbc) {
            ((vbc) obj5).addOnMultiWindowModeChangedListener(this.f7434t);
        }
        Object obj6 = this.f7438x;
        if (obj6 instanceof zbc) {
            ((zbc) obj6).addOnPictureInPictureModeChangedListener(this.f7435u);
        }
        Object obj7 = this.f7438x;
        if ((obj7 instanceof tab) && fragment == null) {
            ((tab) obj7).addMenuProvider(this.f7436v);
        }
    }

    public boolean o1(int i, int i2) {
        if (i >= 0) {
            return p1(null, i, i2);
        }
        throw new IllegalArgumentException("Bad id: " + i);
    }

    /* renamed from: p */
    public void m6204p(Fragment fragment) {
        if (P0(2)) {
            StringBuilder sb = new StringBuilder();
            sb.append("attach: ");
            sb.append(fragment);
        }
        if (fragment.mDetached) {
            fragment.mDetached = false;
            if (fragment.mAdded) {
                return;
            }
            this.f7417c.m6392a(fragment);
            if (P0(2)) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("add from attach: ");
                sb2.append(fragment);
            }
            if (Q0(fragment)) {
                this.f7404J = true;
            }
        }
    }

    public final boolean p1(String str, int i, int i2) {
        d0(false);
        c0(true);
        Fragment fragment = this.f7395A;
        if (fragment != null && i < 0 && str == null && fragment.getChildFragmentManager().n1()) {
            return true;
        }
        boolean zQ1 = q1(this.f7409O, this.f7410P, str, i, i2);
        if (zQ1) {
            this.f7416b = true;
            try {
                w1(this.f7409O, this.f7410P);
            } finally {
                m6209u();
            }
        }
        Q1();
        m6195Y();
        this.f7417c.m6393b();
        return zQ1;
    }

    /* renamed from: q */
    public AbstractC2124j m6205q() {
        return new C2115a(this);
    }

    public final void q0() {
        Iterator it = m6211w().iterator();
        while (it.hasNext()) {
            ((AbstractC2126l) it.next()).m6459r();
        }
    }

    public boolean q1(ArrayList arrayList, ArrayList arrayList2, String str, int i, int i2) {
        int iJ0 = j0(str, i, (i2 & 1) != 0);
        if (iJ0 < 0) {
            return false;
        }
        for (int size = this.f7418d.size() - 1; size >= iJ0; size--) {
            arrayList.add((C2115a) this.f7418d.remove(size));
            arrayList2.add(Boolean.TRUE);
        }
        return true;
    }

    /* renamed from: r */
    public void m6206r() {
        if (P0(3)) {
            StringBuilder sb = new StringBuilder();
            sb.append("cancelBackStackTransition for transition ");
            sb.append(this.f7422h);
        }
        C2115a c2115a = this.f7422h;
        if (c2115a != null) {
            c2115a.f7494u = false;
            c2115a.m6270y();
            this.f7422h.m6427r(true, new Runnable() { // from class: o.nh7
                @Override // java.lang.Runnable
                public final void run() {
                    this.f36864a.Y0();
                }
            });
            this.f7422h.mo6260h();
            this.f7423i = true;
            h0();
            this.f7423i = false;
            this.f7422h = null;
        }
    }

    public Set r0(C2115a c2115a) {
        HashSet hashSet = new HashSet();
        for (int i = 0; i < c2115a.f7581c.size(); i++) {
            Fragment fragment = ((AbstractC2124j.a) c2115a.f7581c.get(i)).f7599b;
            if (fragment != null && c2115a.f7587i) {
                hashSet.add(fragment);
            }
        }
        return hashSet;
    }

    public boolean r1(ArrayList arrayList, ArrayList arrayList2) {
        if (P0(2)) {
            StringBuilder sb = new StringBuilder();
            sb.append("FragmentManager has the following pending actions inside of prepareBackStackState: ");
            sb.append(this.f7415a);
        }
        if (this.f7418d.isEmpty()) {
            return false;
        }
        ArrayList arrayList3 = this.f7418d;
        C2115a c2115a = (C2115a) arrayList3.get(arrayList3.size() - 1);
        this.f7422h = c2115a;
        Iterator it = c2115a.f7581c.iterator();
        while (it.hasNext()) {
            Fragment fragment = ((AbstractC2124j.a) it.next()).f7599b;
            if (fragment != null) {
                fragment.mTransitioning = true;
            }
        }
        return q1(arrayList, arrayList2, null, -1, 0);
    }

    /* renamed from: s */
    public boolean m6207s() {
        boolean zQ0 = false;
        for (Fragment fragment : this.f7417c.m6403l()) {
            if (fragment != null) {
                zQ0 = Q0(fragment);
            }
            if (zQ0) {
                return true;
            }
        }
        return false;
    }

    public final boolean s0(ArrayList arrayList, ArrayList arrayList2) {
        synchronized (this.f7415a) {
            if (this.f7415a.isEmpty()) {
                return false;
            }
            try {
                int size = this.f7415a.size();
                boolean zMo6239a = false;
                for (int i = 0; i < size; i++) {
                    zMo6239a |= ((InterfaceC2106m) this.f7415a.get(i)).mo6239a(arrayList, arrayList2);
                }
                return zMo6239a;
            } finally {
                this.f7415a.clear();
                this.f7438x.m18968h().removeCallbacks(this.f7414T);
            }
        }
    }

    public void s1() {
        b0(new C2108o(), false);
    }

    /* renamed from: t */
    public final void m6208t() {
        if (W0()) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
    }

    public List t0() {
        return this.f7417c.m6403l();
    }

    public void t1(Bundle bundle, String str, Fragment fragment) {
        if (fragment.mFragmentManager != this) {
            O1(new IllegalStateException("Fragment " + fragment + " is not currently in the FragmentManager"));
        }
        bundle.putString(str, fragment.mWho);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        Fragment fragment = this.f7440z;
        if (fragment != null) {
            sb.append(fragment.getClass().getSimpleName());
            sb.append("{");
            sb.append(Integer.toHexString(System.identityHashCode(this.f7440z)));
            sb.append("}");
        } else {
            bh7 bh7Var = this.f7438x;
            if (bh7Var != null) {
                sb.append(bh7Var.getClass().getSimpleName());
                sb.append("{");
                sb.append(Integer.toHexString(System.identityHashCode(this.f7438x)));
                sb.append("}");
            } else {
                sb.append("null");
            }
        }
        sb.append("}}");
        return sb.toString();
    }

    /* renamed from: u */
    public final void m6209u() {
        this.f7416b = false;
        this.f7410P.clear();
        this.f7409O.clear();
    }

    public int u0() {
        return this.f7418d.size() + (this.f7422h != null ? 1 : 0);
    }

    public void u1(AbstractC2104k abstractC2104k, boolean z) {
        this.f7430p.m6349o(abstractC2104k, z);
    }

    /* renamed from: v */
    public final void m6210v() {
        bh7 bh7Var = this.f7438x;
        if (bh7Var instanceof lxi ? this.f7417c.m6407p().m6363o() : bh7Var.m18966f() instanceof Activity ? !((Activity) this.f7438x.m18966f()).isChangingConfigurations() : true) {
            Iterator it = this.f7426l.values().iterator();
            while (it.hasNext()) {
                Iterator it2 = ((BackStackState) it.next()).f7340a.iterator();
                while (it2.hasNext()) {
                    this.f7417c.m6407p().m6357h((String) it2.next(), false);
                }
            }
        }
    }

    public final C2121g v0(Fragment fragment) {
        return this.f7412R.m6360k(fragment);
    }

    public void v1(Fragment fragment) {
        if (P0(2)) {
            StringBuilder sb = new StringBuilder();
            sb.append("remove: ");
            sb.append(fragment);
            sb.append(" nesting=");
            sb.append(fragment.mBackStackNesting);
        }
        boolean z = !fragment.isInBackStack();
        if (!fragment.mDetached || z) {
            this.f7417c.m6412u(fragment);
            if (Q0(fragment)) {
                this.f7404J = true;
            }
            fragment.mRemoving = true;
            L1(fragment);
        }
    }

    /* renamed from: w */
    public final Set m6211w() {
        HashSet hashSet = new HashSet();
        Iterator it = this.f7417c.m6402k().iterator();
        while (it.hasNext()) {
            ViewGroup viewGroup = ((C2122h) it.next()).m6378k().mContainer;
            if (viewGroup != null) {
                hashSet.add(AbstractC2126l.m6442v(viewGroup, H0()));
            }
        }
        return hashSet;
    }

    public qg7 w0() {
        return this.f7439y;
    }

    public final void w1(ArrayList arrayList, ArrayList arrayList2) {
        if (arrayList.isEmpty()) {
            return;
        }
        if (arrayList.size() != arrayList2.size()) {
            throw new IllegalStateException("Internal error with the back stack records");
        }
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        while (i < size) {
            if (!((C2115a) arrayList.get(i)).f7596r) {
                if (i2 != i) {
                    g0(arrayList, arrayList2, i2, i);
                }
                i2 = i + 1;
                if (((Boolean) arrayList2.get(i)).booleanValue()) {
                    while (i2 < size && ((Boolean) arrayList2.get(i2)).booleanValue() && !((C2115a) arrayList.get(i2)).f7596r) {
                        i2++;
                    }
                }
                g0(arrayList, arrayList2, i, i2);
                i = i2 - 1;
            }
            i++;
        }
        if (i2 != size) {
            g0(arrayList, arrayList2, i2, size);
        }
    }

    /* renamed from: x */
    public Set m6212x(ArrayList arrayList, int i, int i2) {
        ViewGroup viewGroup;
        HashSet hashSet = new HashSet();
        while (i < i2) {
            Iterator it = ((C2115a) arrayList.get(i)).f7581c.iterator();
            while (it.hasNext()) {
                Fragment fragment = ((AbstractC2124j.a) it.next()).f7599b;
                if (fragment != null && (viewGroup = fragment.mContainer) != null) {
                    hashSet.add(AbstractC2126l.m6441u(viewGroup, this));
                }
            }
            i++;
        }
        return hashSet;
    }

    public Fragment x0(Bundle bundle, String str) {
        String string = bundle.getString(str);
        if (string == null) {
            return null;
        }
        Fragment fragmentI0 = i0(string);
        if (fragmentI0 == null) {
            O1(new IllegalStateException("Fragment no longer exists for key " + str + ": unique id " + string));
        }
        return fragmentI0;
    }

    public void x1(Fragment fragment) {
        this.f7412R.m6364p(fragment);
    }

    /* renamed from: y */
    public C2122h m6213y(Fragment fragment) {
        C2122h c2122hM6405n = this.f7417c.m6405n(fragment.mWho);
        if (c2122hM6405n != null) {
            return c2122hM6405n;
        }
        C2122h c2122h = new C2122h(this.f7430p, this.f7417c, fragment);
        c2122h.m6382o(this.f7438x.m18966f().getClassLoader());
        c2122h.m6387t(this.f7437w);
        return c2122h;
    }

    public final ViewGroup y0(Fragment fragment) {
        ViewGroup viewGroup = fragment.mContainer;
        if (viewGroup != null) {
            return viewGroup;
        }
        if (fragment.mContainerId > 0 && this.f7439y.mo6143d()) {
            View viewMo6142c = this.f7439y.mo6142c(fragment.mContainerId);
            if (viewMo6142c instanceof ViewGroup) {
                return (ViewGroup) viewMo6142c;
            }
        }
        return null;
    }

    public final void y1() {
        for (int i = 0; i < this.f7429o.size(); i++) {
            ((InterfaceC2105l) this.f7429o.get(i)).mo6238e();
        }
    }

    /* renamed from: z */
    public void m6214z(Fragment fragment) {
        if (P0(2)) {
            StringBuilder sb = new StringBuilder();
            sb.append("detach: ");
            sb.append(fragment);
        }
        if (fragment.mDetached) {
            return;
        }
        fragment.mDetached = true;
        if (fragment.mAdded) {
            if (P0(2)) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("remove from detach: ");
                sb2.append(fragment);
            }
            this.f7417c.m6412u(fragment);
            if (Q0(fragment)) {
                this.f7404J = true;
            }
            L1(fragment);
        }
    }

    public AbstractC2118d z0() {
        AbstractC2118d abstractC2118d = this.f7396B;
        if (abstractC2118d != null) {
            return abstractC2118d;
        }
        Fragment fragment = this.f7440z;
        return fragment != null ? fragment.mFragmentManager.z0() : this.f7397C;
    }

    public void z1(String str) {
        b0(new C2109p(str), false);
    }

    @SuppressLint({"BanParcelableUsage"})
    public static class LaunchedFragmentInfo implements Parcelable {
        public static final Parcelable.Creator<LaunchedFragmentInfo> CREATOR = new C2093a();

        /* renamed from: a */
        public String f7441a;

        /* renamed from: b */
        public int f7442b;

        /* renamed from: androidx.fragment.app.FragmentManager$LaunchedFragmentInfo$a */
        public class C2093a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public LaunchedFragmentInfo createFromParcel(Parcel parcel) {
                return new LaunchedFragmentInfo(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public LaunchedFragmentInfo[] newArray(int i) {
                return new LaunchedFragmentInfo[i];
            }
        }

        public LaunchedFragmentInfo(String str, int i) {
            this.f7441a = str;
            this.f7442b = i;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.f7441a);
            parcel.writeInt(this.f7442b);
        }

        public LaunchedFragmentInfo(Parcel parcel) {
            this.f7441a = parcel.readString();
            this.f7442b = parcel.readInt();
        }
    }
}
