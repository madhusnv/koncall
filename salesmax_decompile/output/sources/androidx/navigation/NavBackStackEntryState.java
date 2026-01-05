package androidx.navigation;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.lifecycle.AbstractC2139h;
import com.google.firebase.analytics.FirebaseAnalytics;
import p001o.id5;
import p001o.sq8;

@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes2.dex */
public final class NavBackStackEntryState implements Parcelable {

    /* renamed from: a */
    public final String f9413a;

    /* renamed from: b */
    public final int f9414b;

    /* renamed from: c */
    public final Bundle f9415c;

    /* renamed from: d */
    public final Bundle f9416d;

    /* renamed from: e */
    public static final C2329b f9412e = new C2329b(null);
    public static final Parcelable.Creator<NavBackStackEntryState> CREATOR = new C2328a();

    /* renamed from: androidx.navigation.NavBackStackEntryState$a */
    public static final class C2328a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public NavBackStackEntryState createFromParcel(Parcel parcel) {
            sq8.m48649h(parcel, "inParcel");
            return new NavBackStackEntryState(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public NavBackStackEntryState[] newArray(int i) {
            return new NavBackStackEntryState[i];
        }
    }

    /* renamed from: androidx.navigation.NavBackStackEntryState$b */
    public static final class C2329b {
        public C2329b() {
        }

        public /* synthetic */ C2329b(id5 id5Var) {
            this();
        }
    }

    public NavBackStackEntryState(C2332c c2332c) {
        sq8.m48649h(c2332c, "entry");
        this.f9413a = c2332c.m8554f();
        this.f9414b = c2332c.m8553e().m8753A();
        this.f9415c = c2332c.m8551c();
        Bundle bundle = new Bundle();
        this.f9416d = bundle;
        c2332c.m8558j(bundle);
    }

    /* renamed from: a */
    public final int m8522a() {
        return this.f9414b;
    }

    /* renamed from: b */
    public final String m8523b() {
        return this.f9413a;
    }

    /* renamed from: c */
    public final C2332c m8524c(Context context, AbstractC2341h abstractC2341h, AbstractC2139h.b bVar, C2334e c2334e) {
        sq8.m48649h(context, "context");
        sq8.m48649h(abstractC2341h, FirebaseAnalytics.Param.DESTINATION);
        sq8.m48649h(bVar, "hostLifecycleState");
        Bundle bundle = this.f9415c;
        if (bundle != null) {
            bundle.setClassLoader(context.getClassLoader());
        } else {
            bundle = null;
        }
        return C2332c.f9433M.m8563a(context, abstractC2341h, bundle, bVar, c2334e, this.f9413a, this.f9416d);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        sq8.m48649h(parcel, "parcel");
        parcel.writeString(this.f9413a);
        parcel.writeInt(this.f9414b);
        parcel.writeBundle(this.f9415c);
        parcel.writeBundle(this.f9416d);
    }

    public NavBackStackEntryState(Parcel parcel) {
        sq8.m48649h(parcel, "inParcel");
        String string = parcel.readString();
        sq8.m48646e(string);
        this.f9413a = string;
        this.f9414b = parcel.readInt();
        this.f9415c = parcel.readBundle(NavBackStackEntryState.class.getClassLoader());
        Bundle bundle = parcel.readBundle(NavBackStackEntryState.class.getClassLoader());
        sq8.m48646e(bundle);
        this.f9416d = bundle;
    }
}
