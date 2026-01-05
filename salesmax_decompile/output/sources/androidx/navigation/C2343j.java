package androidx.navigation;

import android.os.Bundle;
import androidx.navigation.AbstractC2341h;
import androidx.navigation.AbstractC2348o;
import com.amplifyframework.storage.s3.transfer.TransferTable;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import java.util.Iterator;
import java.util.List;
import p001o.bh3;
import p001o.gge;
import p001o.kf9;
import p001o.sq8;
import p001o.wrb;
import p001o.xk7;

@AbstractC2348o.b("navigation")
/* renamed from: androidx.navigation.j */
/* loaded from: classes2.dex */
public class C2343j extends AbstractC2348o {

    /* renamed from: c */
    public final C2349p f9634c;

    /* renamed from: androidx.navigation.j$a */
    public static final class a extends kf9 implements xk7 {

        /* renamed from: a */
        public final /* synthetic */ gge f9635a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(gge ggeVar) {
            super(1);
            this.f9635a = ggeVar;
        }

        @Override // p001o.xk7
        public final Boolean invoke(String str) {
            sq8.m48649h(str, TransferTable.COLUMN_KEY);
            Object obj = this.f9635a.f25106a;
            boolean z = true;
            if (obj != null && ((Bundle) obj).containsKey(str)) {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    public C2343j(C2349p c2349p) {
        sq8.m48649h(c2349p, "navigatorProvider");
        this.f9634c = c2349p;
    }

    @Override // androidx.navigation.AbstractC2348o
    /* renamed from: e */
    public void mo8714e(List list, C2345l c2345l, AbstractC2348o.a aVar) {
        sq8.m48649h(list, RemoteConfigConstants.ResponseFieldKey.ENTRIES);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            m8792m((C2332c) it.next(), c2345l, aVar);
        }
    }

    @Override // androidx.navigation.AbstractC2348o
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public C2342i mo8527a() {
        return new C2342i(this);
    }

    /* renamed from: m */
    public final void m8792m(C2332c c2332c, C2345l c2345l, AbstractC2348o.a aVar) {
        AbstractC2341h abstractC2341hM8553e = c2332c.m8553e();
        sq8.m48647f(abstractC2341hM8553e, "null cannot be cast to non-null type androidx.navigation.NavGraph");
        C2342i c2342i = (C2342i) abstractC2341hM8553e;
        gge ggeVar = new gge();
        ggeVar.f25106a = c2332c.m8551c();
        int iE0 = c2342i.e0();
        String strF0 = c2342i.f0();
        if (!((iE0 == 0 && strF0 == null) ? false : true)) {
            throw new IllegalStateException(("no start destination defined via app:startDestination for " + c2342i.mo8773y()).toString());
        }
        AbstractC2341h abstractC2341hM8786Z = strF0 != null ? c2342i.m8786Z(strF0, false) : (AbstractC2341h) c2342i.c0().m22184f(iE0);
        if (abstractC2341hM8786Z == null) {
            throw new IllegalArgumentException("navigation destination " + c2342i.d0() + " is not a direct child of this NavGraph");
        }
        if (strF0 != null) {
            if (!sq8.m48644c(strF0, abstractC2341hM8786Z.m8757I())) {
                AbstractC2341h.b bVarM8761N = abstractC2341hM8786Z.m8761N(strF0);
                Bundle bundleM8780d = bVarM8761N != null ? bVarM8761N.m8780d() : null;
                if (bundleM8780d != null && !bundleM8780d.isEmpty()) {
                    Bundle bundle = new Bundle();
                    bundle.putAll(bundleM8780d);
                    Object obj = ggeVar.f25106a;
                    if (((Bundle) obj) != null) {
                        bundle.putAll((Bundle) obj);
                    }
                    ggeVar.f25106a = bundle;
                }
            }
            if (!abstractC2341hM8786Z.m8772w().isEmpty()) {
                List listM54932a = wrb.m54932a(abstractC2341hM8786Z.m8772w(), new a(ggeVar));
                if (!listM54932a.isEmpty()) {
                    throw new IllegalArgumentException(("Cannot navigate to startDestination " + abstractC2341hM8786Z + ". Missing required arguments [" + listM54932a + ']').toString());
                }
            }
        }
        this.f9634c.m8956d(abstractC2341hM8786Z.m8755F()).mo8714e(bh3.m18963e(m8949b().mo8620a(abstractC2341hM8786Z, abstractC2341hM8786Z.m8768n((Bundle) ggeVar.f25106a))), c2345l, aVar);
    }
}
