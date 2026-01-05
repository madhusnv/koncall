package ai.salesmax.ui.user;

import ai.salesmax.model.LeadsUser;
import ai.salesmax.model.UserLocation;
import ai.salesmax.ui.user.UserLastLocation;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.google.android.gms.maps.CameraUpdate;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;
import com.onesignal.location.internal.common.LocationConstants;
import java.util.ArrayList;
import java.util.Iterator;
import p001o.c64;
import p001o.fj7;
import p001o.hae;
import p001o.id5;
import p001o.jm7;
import p001o.mn;
import p001o.p9e;
import p001o.sq8;
import p001o.z8e;

/* loaded from: classes2.dex */
public final class UserLastLocation extends Fragment implements GoogleMap.InfoWindowAdapter {

    /* renamed from: e */
    public static final C1661a f4867e = new C1661a(null);

    /* renamed from: f */
    public static final int f4868f = 8;

    /* renamed from: a */
    public GoogleMap f4869a;

    /* renamed from: b */
    public fj7 f4870b;

    /* renamed from: c */
    public ArrayList f4871c = new ArrayList();

    /* renamed from: d */
    public final OnMapReadyCallback f4872d = new OnMapReadyCallback() { // from class: o.qei
        @Override // com.google.android.gms.maps.OnMapReadyCallback
        public final void onMapReady(GoogleMap googleMap) {
            UserLastLocation.H0(this.f41811a, googleMap);
        }
    };

    /* renamed from: ai.salesmax.ui.user.UserLastLocation$a */
    public static final class C1661a {
        public C1661a() {
        }

        public /* synthetic */ C1661a(id5 id5Var) {
            this();
        }
    }

    public static final void H0(final UserLastLocation userLastLocation, GoogleMap googleMap) {
        sq8.m48649h(userLastLocation, "this$0");
        sq8.m48649h(googleMap, "googleMap");
        userLastLocation.f4869a = googleMap;
        if (userLastLocation.K0()) {
            googleMap.setMyLocationEnabled(true);
        } else {
            mn.m39367g(userLastLocation.requireActivity(), new String[]{LocationConstants.ANDROID_FINE_LOCATION_PERMISSION_STRING}, 1);
        }
        googleMap.setInfoWindowAdapter(userLastLocation);
        new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: o.rei
            @Override // java.lang.Runnable
            public final void run() {
                UserLastLocation.I0(this.f43462a);
            }
        }, 500L);
    }

    public static final void I0(UserLastLocation userLastLocation) {
        sq8.m48649h(userLastLocation, "this$0");
        userLastLocation.L0();
    }

    public final fj7 J0() {
        fj7 fj7Var = this.f4870b;
        sq8.m48646e(fj7Var);
        return fj7Var;
    }

    public final boolean K0() {
        return c64.checkSelfPermission(requireContext(), LocationConstants.ANDROID_FINE_LOCATION_PERMISSION_STRING) == 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void L0() {
        LatLng latLng;
        GoogleMap googleMap;
        Iterator it = this.f4871c.iterator();
        while (true) {
            Marker markerAddMarker = null;
            if (!it.hasNext()) {
                break;
            }
            UserLocation userLocation = (UserLocation) it.next();
            Double latitude = userLocation.getLatitude();
            if (latitude != null) {
                double dDoubleValue = latitude.doubleValue();
                Double longitude = userLocation.getLongitude();
                latLng = longitude != null ? new LatLng(dDoubleValue, longitude.doubleValue()) : null;
            }
            if (latLng != null) {
                MarkerOptions markerOptionsPosition = new MarkerOptions().position(latLng);
                LeadsUser locationUser = userLocation.getLocationUser();
                MarkerOptions markerOptionsTitle = markerOptionsPosition.title(locationUser != null ? locationUser.getName() : null);
                if (markerOptionsTitle != null && (googleMap = this.f4869a) != null) {
                    markerAddMarker = googleMap.addMarker(markerOptionsTitle);
                }
            }
            if (markerAddMarker != null) {
                markerAddMarker.setTag(userLocation);
            }
        }
        LatLngBounds.Builder builder = LatLngBounds.builder();
        sq8.m48648g(builder, "builder(...)");
        Iterator it2 = this.f4871c.iterator();
        boolean z = false;
        while (it2.hasNext()) {
            UserLocation userLocation2 = (UserLocation) it2.next();
            Double latitude2 = userLocation2.getLatitude();
            if (latitude2 != null) {
                double dDoubleValue2 = latitude2.doubleValue();
                Double longitude2 = userLocation2.getLongitude();
                LatLng latLng2 = longitude2 != null ? new LatLng(dDoubleValue2, longitude2.doubleValue()) : null;
                if (latLng2 != null) {
                    builder.include(latLng2);
                    z = true;
                }
            }
        }
        if (z) {
            LatLngBounds latLngBoundsBuild = builder.build();
            sq8.m48648g(latLngBoundsBuild, "build(...)");
            CameraUpdate cameraUpdateNewLatLngBounds = CameraUpdateFactory.newLatLngBounds(latLngBoundsBuild, 100);
            sq8.m48648g(cameraUpdateNewLatLngBounds, "newLatLngBounds(...)");
            GoogleMap googleMap2 = this.f4869a;
            if (googleMap2 != null) {
                googleMap2.animateCamera(cameraUpdateNewLatLngBounds);
            }
        }
    }

    @Override // com.google.android.gms.maps.GoogleMap.InfoWindowAdapter
    public View getInfoContents(Marker marker) {
        LeadsUser locationUser;
        sq8.m48649h(marker, "marker");
        String strM34026L = null;
        View viewInflate = getLayoutInflater().inflate(p9e.info_window_layout, (ViewGroup) null);
        TextView textView = (TextView) viewInflate.findViewById(z8e.titleTextView);
        TextView textView2 = (TextView) viewInflate.findViewById(z8e.snippetTextView);
        Object tag = marker.getTag();
        UserLocation userLocation = tag instanceof UserLocation ? (UserLocation) tag : null;
        textView.setText((userLocation == null || (locationUser = userLocation.getLocationUser()) == null) ? null : locationUser.getName());
        if (userLocation != null) {
            Long createdAt = userLocation.getCreatedAt();
            if (createdAt != null) {
                long jLongValue = createdAt.longValue();
                sq8.m48646e(viewInflate);
                strM34026L = jm7.m34026L(jLongValue, viewInflate);
            }
            textView2.setText("Logged At : " + strM34026L);
        }
        return viewInflate;
    }

    @Override // com.google.android.gms.maps.GoogleMap.InfoWindowAdapter
    public View getInfoWindow(Marker marker) {
        sq8.m48649h(marker, "marker");
        return null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        sq8.m48649h(context, "context");
        super.onAttach(context);
        ArrayList parcelableArrayList = requireArguments().getParcelableArrayList(getString(hae.argumentUserLocations));
        sq8.m48647f(parcelableArrayList, "null cannot be cast to non-null type java.util.ArrayList<ai.salesmax.model.UserLocation>{ kotlin.collections.TypeAliasesKt.ArrayList<ai.salesmax.model.UserLocation> }");
        this.f4871c = parcelableArrayList;
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        sq8.m48649h(layoutInflater, "inflater");
        if (this.f4870b == null) {
            fj7 fj7VarM26904c = fj7.m26904c(layoutInflater, viewGroup, false);
            Fragment fragmentL0 = getChildFragmentManager().l0(z8e.mapFragment);
            sq8.m48647f(fragmentL0, "null cannot be cast to non-null type com.google.android.gms.maps.SupportMapFragment");
            ((SupportMapFragment) fragmentL0).getMapAsync(this.f4872d);
            this.f4870b = fj7VarM26904c;
        }
        FrameLayout frameLayoutM26905b = J0().m26905b();
        sq8.m48648g(frameLayoutM26905b, "getRoot(...)");
        return frameLayoutM26905b;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        GoogleMap googleMap = this.f4869a;
        if (googleMap != null) {
            googleMap.setInfoWindowAdapter(null);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        GoogleMap googleMap = this.f4869a;
        if (googleMap != null) {
            googleMap.clear();
        }
        this.f4869a = null;
        Fragment fragmentL0 = getChildFragmentManager().l0(z8e.mapFragment);
        sq8.m48647f(fragmentL0, "null cannot be cast to non-null type com.google.android.gms.maps.SupportMapFragment");
        getChildFragmentManager().m6205q().mo6266o((SupportMapFragment) fragmentL0).mo6261i();
        this.f4870b = null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        sq8.m48649h(view, "view");
        super.onViewCreated(view, bundle);
    }
}
