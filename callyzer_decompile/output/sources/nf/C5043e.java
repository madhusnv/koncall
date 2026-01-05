package nf;

import android.accounts.Account;
import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.Scope;
import ig.AbstractC3251g;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import mf.C4719b;
import p020v.x0;
import rf.C6511p;
import sf.AbstractC6822h;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: nf.e */
/* loaded from: classes.dex */
public final class C5043e extends AbstractC6822h {

    /* renamed from: D */
    public final GoogleSignInOptions f24816D;

    public C5043e(Context context, Looper looper, x0 x0Var, GoogleSignInOptions googleSignInOptions, C6511p c6511p, C6511p c6511p2) {
        C4719b c4719b;
        super(context, looper, 91, x0Var, c6511p, c6511p2, 0);
        Set<Scope> set = (Set) x0Var.f36755c;
        if (googleSignInOptions != null) {
            c4719b = new C4719b();
            c4719b.f23615d = new HashSet();
            c4719b.f23620i = new HashMap();
            c4719b.f23615d = new HashSet(googleSignInOptions.f5977b);
            c4719b.f23612a = googleSignInOptions.f5980e;
            c4719b.f23613b = googleSignInOptions.f5981f;
            c4719b.f23614c = googleSignInOptions.f5979d;
            c4719b.f23616e = googleSignInOptions.f5982g;
            c4719b.f23619h = googleSignInOptions.f5978c;
            c4719b.f23617f = googleSignInOptions.f5983h;
            c4719b.f23620i = GoogleSignInOptions.m3088c(googleSignInOptions.f5984j);
            c4719b.f23618g = googleSignInOptions.f5985k;
        } else {
            c4719b = new C4719b();
            c4719b.f23615d = new HashSet();
            c4719b.f23620i = new HashMap();
        }
        c4719b.f23618g = AbstractC3251g.m7596a();
        if (!set.isEmpty()) {
            for (Scope scope : set) {
                HashSet hashSet = (HashSet) c4719b.f23615d;
                hashSet.add(scope);
                hashSet.addAll(Arrays.asList(new Scope[0]));
            }
        }
        HashSet hashSet2 = (HashSet) c4719b.f23615d;
        if (hashSet2.contains(GoogleSignInOptions.f5974p)) {
            Scope scope2 = GoogleSignInOptions.f5973n;
            if (hashSet2.contains(scope2)) {
                hashSet2.remove(scope2);
            }
        }
        if (c4719b.f23614c && (((Account) c4719b.f23619h) == null || !hashSet2.isEmpty())) {
            hashSet2.add(GoogleSignInOptions.f5972m);
        }
        this.f24816D = new GoogleSignInOptions(3, new ArrayList(hashSet2), (Account) c4719b.f23619h, c4719b.f23614c, c4719b.f23612a, c4719b.f23613b, (String) c4719b.f23616e, (String) c4719b.f23617f, (HashMap) c4719b.f23620i, (String) c4719b.f23618g);
    }

    @Override // sf.AbstractC6819e, qf.InterfaceC6204c
    /* renamed from: i */
    public final int mo7588i() {
        return 12451000;
    }

    @Override // sf.AbstractC6819e
    /* renamed from: o */
    public final IInterface mo7589o(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.signin.internal.ISignInService");
        return iInterfaceQueryLocalInterface instanceof C5049k ? (C5049k) iInterfaceQueryLocalInterface : new C5049k(iBinder, "com.google.android.gms.auth.api.signin.internal.ISignInService", 1);
    }

    @Override // sf.AbstractC6819e
    /* renamed from: u */
    public final String mo7592u() {
        return "com.google.android.gms.auth.api.signin.internal.ISignInService";
    }

    @Override // sf.AbstractC6819e
    /* renamed from: v */
    public final String mo7593v() {
        return "com.google.android.gms.auth.api.signin.service.START";
    }
}
