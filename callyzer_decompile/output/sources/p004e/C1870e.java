package p004e;

import a9.C0073l;
import android.os.Bundle;
import androidx.navigation.fragment.NavHostFragment;
import g8.InterfaceC2544d;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AbstractC4154l;
import l7.a0;
import pg.n7;
import qw.C6361k;
import rw.AbstractC6674x;
import t2.C7010i;
import wx.m1;
import wx.u0;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: e.e */
/* loaded from: classes.dex */
public final /* synthetic */ class C1870e implements InterfaceC2544d {

    /* renamed from: a */
    public final /* synthetic */ int f8878a;

    /* renamed from: b */
    public final /* synthetic */ Object f8879b;

    public /* synthetic */ C1870e(int i10, Object obj) {
        this.f8878a = i10;
        this.f8879b = obj;
    }

    @Override // g8.InterfaceC2544d
    /* renamed from: a */
    public final Bundle mo1205a() {
        C6361k[] c6361kArr;
        switch (this.f8878a) {
            case 0:
                return AbstractActivityC1878m.m5509d((AbstractActivityC1878m) this.f8879b);
            case 1:
                C0073l c0073l = (C0073l) this.f8879b;
                for (Map.Entry entry : AbstractC6674x.m12785m((LinkedHashMap) c0073l.f267d).entrySet()) {
                    c0073l.m200J(((m1) ((u0) entry.getValue())).getValue(), (String) entry.getKey());
                }
                for (Map.Entry entry2 : AbstractC6674x.m12785m((LinkedHashMap) c0073l.f265b).entrySet()) {
                    c0073l.m200J(((InterfaceC2544d) entry2.getValue()).mo1205a(), (String) entry2.getKey());
                }
                LinkedHashMap linkedHashMap = (LinkedHashMap) c0073l.f264a;
                if (linkedHashMap.isEmpty()) {
                    c6361kArr = new C6361k[0];
                } else {
                    ArrayList arrayList = new ArrayList(linkedHashMap.size());
                    for (Map.Entry entry3 : linkedHashMap.entrySet()) {
                        arrayList.add(new C6361k((String) entry3.getKey(), entry3.getValue()));
                    }
                    c6361kArr = (C6361k[]) arrayList.toArray(new C6361k[0]);
                }
                return n7.m11799a((C6361k[]) Arrays.copyOf(c6361kArr, c6361kArr.length));
            case 2:
                Bundle bundleM9190j = ((a0) this.f8879b).m9190j();
                if (bundleM9190j != null) {
                    return bundleM9190j;
                }
                Bundle EMPTY = Bundle.EMPTY;
                AbstractC4154l.m8922e(EMPTY, "EMPTY");
                return EMPTY;
            case 3:
                int i10 = ((NavHostFragment) this.f8879b).f2773c;
                if (i10 != 0) {
                    return n7.m11799a(new C6361k("android-support-nav:fragment:graphId", Integer.valueOf(i10)));
                }
                Bundle bundle = Bundle.EMPTY;
                AbstractC4154l.m8920c(bundle);
                return bundle;
            default:
                Map mapMo12857c = ((C7010i) this.f8879b).mo12857c();
                Bundle bundle2 = new Bundle();
                for (Map.Entry entry4 : mapMo12857c.entrySet()) {
                    String str = (String) entry4.getKey();
                    List list = (List) entry4.getValue();
                    bundle2.putParcelableArrayList(str, list instanceof ArrayList ? (ArrayList) list : new ArrayList<>(list));
                }
                return bundle2;
        }
    }
}
