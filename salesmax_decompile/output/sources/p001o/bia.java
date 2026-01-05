package p001o;

import android.location.Location;
import android.location.LocationListener;
import android.os.Bundle;
import com.amplifyframework.auth.cognito.data.AWSCognitoLegacyCredentialStore;
import com.amplifyframework.datastore.generated.model.ActivityLocation;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import java.util.Optional;
import java.util.UUID;
import java.util.function.Function;
import p001o.bia;

/* loaded from: classes.dex */
public final class bia implements LocationListener, com.google.android.gms.location.LocationListener {

    /* renamed from: a */
    public final String f16382a = "location-listener";

    /* renamed from: o.bia$a */
    public static final class C12429a implements rl7 {

        /* renamed from: a */
        public static final C12429a f16383a = new C12429a();

        /* renamed from: o.bia$a$a */
        public static final class a extends kf9 implements xk7 {

            /* renamed from: a */
            public static final a f16384a = new a();

            public a() {
                super(1);
            }

            @Override // p001o.xk7
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final mii invoke(uni uniVar) {
                return uniVar.SB();
            }
        }

        /* renamed from: o.bia$a$b */
        public static final class b extends kf9 implements xk7 {

            /* renamed from: a */
            public static final b f16385a = new b();

            public b() {
                super(1);
            }

            @Override // p001o.xk7
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final l1 invoke(mii miiVar) {
                return miiVar.m39161k();
            }
        }

        /* renamed from: d */
        public static final mii m19180d(xk7 xk7Var, Object obj) {
            sq8.m48649h(xk7Var, "$tmp0");
            return (mii) xk7Var.invoke(obj);
        }

        /* renamed from: e */
        public static final l1 m19181e(xk7 xk7Var, Object obj) {
            sq8.m48649h(xk7Var, "$tmp0");
            return (l1) xk7Var.invoke(obj);
        }

        @Override // p001o.rl7
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Optional apply(uni uniVar) {
            sq8.m48649h(uniVar, "it");
            Optional optionalOf = Optional.of(uniVar);
            final a aVar = a.f16384a;
            Optional map = optionalOf.map(new Function() { // from class: o.zha
                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return bia.C12429a.m19180d(aVar, obj);
                }
            });
            final b bVar = b.f16385a;
            return map.map(new Function() { // from class: o.aia
                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return bia.C12429a.m19181e(bVar, obj);
                }
            });
        }
    }

    /* renamed from: o.bia$b */
    public static final class C12430b implements ggd {

        /* renamed from: a */
        public static final C12430b f16386a = new C12430b();

        @Override // p001o.ggd
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final boolean test(Optional optional) {
            return optional.isPresent();
        }
    }

    /* renamed from: o.bia$c */
    public static final class C12431c implements rl7 {

        /* renamed from: a */
        public static final C12431c f16387a = new C12431c();

        @Override // p001o.rl7
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final l1 apply(Optional optional) {
            return (l1) optional.get();
        }
    }

    /* renamed from: o.bia$d */
    public static final class C12432d implements rl7 {

        /* renamed from: a */
        public final /* synthetic */ vha f16388a;

        public C12432d(vha vhaVar) {
            this.f16388a = vhaVar;
        }

        @Override // p001o.rl7
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final l1 apply(l1 l1Var) {
            sq8.m48649h(l1Var, "it");
            ke1 ke1VarM35525a = ke1.f32003i.m35525a();
            if (ke1VarM35525a != null) {
                ke1VarM35525a.m35498B(this.f16388a);
            }
            return l1Var;
        }
    }

    /* renamed from: o.bia$e */
    public static final class C12433e implements rl7 {

        /* renamed from: a */
        public final /* synthetic */ vha f16389a;

        public C12433e(vha vhaVar) {
            this.f16389a = vhaVar;
        }

        @Override // p001o.rl7
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final x8c apply(l1 l1Var) {
            sq8.m48649h(l1Var, "it");
            return l1Var.b9(this.f16389a);
        }
    }

    /* renamed from: o.bia$f */
    public static final class C12434f implements gu3 {

        /* renamed from: a */
        public final /* synthetic */ vha f16390a;

        /* renamed from: b */
        public final /* synthetic */ bia f16391b;

        public C12434f(vha vhaVar, bia biaVar) {
            this.f16390a = vhaVar;
            this.f16391b = biaVar;
        }

        @Override // p001o.gu3
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void accept(ActivityLocation activityLocation) {
            sq8.m48649h(activityLocation, "it");
            vha vhaVar = this.f16390a;
            vha vhaVarM52771a = vhaVar.m52771a((31 & 1) != 0 ? vhaVar.f50335a : null, (31 & 2) != 0 ? vhaVar.f50336b : FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE, (31 & 4) != 0 ? vhaVar.f50337c : FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE, (31 & 8) != 0 ? vhaVar.f50338d : null, (31 & 16) != 0 ? vhaVar.f50339e : 0L, (31 & 32) != 0 ? vhaVar.f50340f : true, (31 & 64) != 0 ? vhaVar.f50341g : activityLocation.getId());
            ke1 ke1VarM35525a = ke1.f32003i.m35525a();
            if (ke1VarM35525a != null) {
                ke1VarM35525a.m35505I(vhaVarM52771a);
            }
            uia.m51627b(uia.f48971a, this.f16391b.f16382a, "Periodic Location logging completed", null, null, 12, null);
        }
    }

    /* renamed from: o.bia$g */
    public static final class C12435g implements gu3 {
        public C12435g() {
        }

        @Override // p001o.gu3
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void accept(Throwable th) {
            sq8.m48649h(th, "it");
            uia.m51627b(uia.f48971a, bia.this.f16382a, "Exception in persisting periodic location logging.", th, null, 8, null);
        }
    }

    @Override // android.location.LocationListener, com.google.android.gms.location.LocationListener
    public void onLocationChanged(Location location) {
        sq8.m48649h(location, "location");
        String string = UUID.randomUUID().toString();
        sq8.m48648g(string, "toString(...)");
        vha vhaVar = new vha(string, location.getLongitude(), location.getLatitude(), location.getProvider(), bmh.f16539a.m19392a().mo19391a(), false, null, 64, null);
        double dM52775f = vhaVar.m52775f();
        double dM52776g = vhaVar.m52776g();
        uia.m51627b(uia.f48971a, this.f16382a, "Location Updated: Latitude: " + dM52775f + ", Longitude: " + dM52776g, null, null, 12, null);
        sq8.m48648g(uni.LB().h0(i5f.m31599c()).y0(i5f.m31599c()).d0(C12429a.f16383a).m55714J(C12430b.f16386a).d0(C12431c.f16387a).d0(new C12432d(vhaVar)).m55717M(new C12433e(vhaVar)).v0(new C12434f(vhaVar, this), new C12435g()), "subscribe(...)");
    }

    @Override // android.location.LocationListener
    public void onProviderDisabled(String str) {
        sq8.m48649h(str, AWSCognitoLegacyCredentialStore.PROVIDER_KEY);
        uia.m51627b(uia.f48971a, this.f16382a, "Provider: " + str + " is disabled", null, null, 12, null);
    }

    @Override // android.location.LocationListener
    public void onProviderEnabled(String str) {
        sq8.m48649h(str, AWSCognitoLegacyCredentialStore.PROVIDER_KEY);
        uia.m51627b(uia.f48971a, this.f16382a, "Provider: " + str + " is enabled", null, null, 12, null);
    }

    @Override // android.location.LocationListener
    public void onStatusChanged(String str, int i, Bundle bundle) {
    }
}
