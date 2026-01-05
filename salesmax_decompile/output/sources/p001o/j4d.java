package p001o;

import ai.salesmax.SuperfoneApplication;
import ai.salesmax.util.Prefs;
import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.provider.Settings;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.ResolvableApiException;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationServices;
import com.google.android.gms.location.LocationSettingsRequest;
import com.google.android.gms.location.LocationSettingsResponse;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.onesignal.location.internal.common.LocationConstants;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;
import java.util.function.Consumer;
import java.util.function.Function;
import pub.devrel.easypermissions.AbstractC18784a;
import pub.devrel.easypermissions.AppSettingsDialog;
import pub.devrel.easypermissions.C18785b;

/* loaded from: classes.dex */
public interface j4d extends AbstractC18784a.a, AbstractC18784a.b {

    /* renamed from: z */
    public static final List f29783z = h0("android.permission.READ_CALL_LOG");

    /* renamed from: A */
    public static final List f29770A = m33214U();

    /* renamed from: B */
    public static final List f29771B = m33220h();

    /* renamed from: C */
    public static final List f29772C = h0("android.permission.CALL_PHONE");

    /* renamed from: D */
    public static final List f29773D = h0(LocationConstants.ANDROID_FINE_LOCATION_PERMISSION_STRING, LocationConstants.ANDROID_COARSE_LOCATION_PERMISSION_STRING);

    /* renamed from: E */
    public static final List f29774E = h0("android.permission.SYSTEM_ALERT_WINDOW");

    /* renamed from: F */
    public static final List f29775F = h0("android.permission.READ_CONTACTS");

    /* renamed from: G */
    public static final List f29776G = h0("android.permission.READ_CALL_LOG", "android.permission.READ_CONTACTS");

    /* renamed from: I */
    public static final List f29777I = h0("android.permission.READ_CALL_LOG");

    /* renamed from: J */
    public static final List f29778J = t0();

    /* renamed from: K */
    public static final List f29779K = h0("android.permission.POST_NOTIFICATIONS");

    /* renamed from: N */
    public static final List f29780N = h0("android.permission.RECORD_AUDIO");

    /* renamed from: O */
    public static final Map f29781O = new HashMap();

    /* renamed from: P */
    public static final Map f29782P = m33225m();

    /* renamed from: A */
    static void m33195A(Fragment fragment) {
        AbstractC18784a.m60210e(new C18785b.b(fragment, 15433, (String[]) f29773D.toArray(new String[0])).m60222b(fragment.getString(hae.track_locations_permission_rationale_periodic)).m60223c(qae.CustomAlertDialogTheme).m60221a());
    }

    /* renamed from: B */
    static void m33196B(Fragment fragment) {
        AbstractC18784a.m60210e(new C18785b.b(fragment, 15423, (String[]) f29771B.toArray(new String[0])).m60222b(fragment.getString(Build.VERSION.SDK_INT >= 33 ? hae.allow_call_log_access : hae.allow_call_log_access_no_notification)).m60223c(qae.CustomAlertDialogTheme).m60221a());
    }

    /* renamed from: C */
    static void m33197C(final int i, final boolean z) {
        StringBuilder sb = new StringBuilder();
        sb.append("Request code received: ");
        sb.append(i);
        Optional.ofNullable(SuperfoneApplication.f225c.m127c()).ifPresent(new Consumer() { // from class: o.d4d
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                j4d.m33229q(i, z, (Prefs) obj);
            }
        });
    }

    /* renamed from: D */
    static boolean m33198D(Context context) {
        return ((Boolean) Optional.ofNullable(SuperfoneApplication.f225c.m127c()).map(new Function() { // from class: o.q3d
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return Boolean.valueOf(((Prefs) obj).m3251m());
            }
        }).orElse(Boolean.FALSE)).booleanValue() && m33233v(context);
    }

    /* renamed from: F */
    static boolean m33199F(Fragment fragment, boolean z) {
        boolean zO0 = o0(fragment.getContext());
        m33197C(15428, z);
        if (zO0 || !z || m33207N(fragment.getContext())) {
            return true;
        }
        c0(fragment);
        return false;
    }

    /* renamed from: G */
    static boolean m33200G(Context context) {
        return AbstractC18784a.m60206a(context, (String[]) f29783z.toArray(new String[0]));
    }

    /* renamed from: H */
    static boolean m33201H(Context context) {
        return m33200G(context);
    }

    /* renamed from: I */
    static /* synthetic */ void m33202I(DialogInterface dialogInterface) {
    }

    /* renamed from: J */
    static boolean m33203J(Context context) {
        return AbstractC18784a.m60206a(context, (String[]) f29773D.toArray(new String[0]));
    }

    /* renamed from: K */
    static boolean m33204K(Context context) {
        return ((Boolean) Optional.ofNullable(SuperfoneApplication.f225c.m127c()).map(new Function() { // from class: o.t3d
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return Boolean.valueOf(((Prefs) obj).m3226N());
            }
        }).orElse(Boolean.FALSE)).booleanValue();
    }

    /* renamed from: M */
    static boolean m33206M(Fragment fragment, boolean z) {
        if (!z || m33207N(fragment.getContext())) {
            m33197C(15426, z);
            return true;
        }
        c0(fragment);
        return false;
    }

    /* renamed from: N */
    static boolean m33207N(Context context) {
        return Settings.canDrawOverlays(context);
    }

    /* renamed from: O */
    static boolean m33208O(Context context) {
        return AbstractC18784a.m60206a(context, (String[]) f29775F.toArray(new String[0]));
    }

    /* renamed from: P */
    static Boolean m33209P(Context context) {
        if (Build.VERSION.SDK_INT < 29) {
            return Boolean.FALSE;
        }
        Optional optionalOfNullable = Optional.ofNullable(context);
        final r6d r6dVar = r6d.f43055a;
        Objects.requireNonNull(r6dVar);
        return (Boolean) optionalOfNullable.map(new Function() { // from class: o.z3d
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return Boolean.valueOf(r6dVar.m46259c((Context) obj));
            }
        }).orElse(Boolean.FALSE);
    }

    /* renamed from: Q */
    static boolean m33210Q(Context context) {
        return AbstractC18784a.m60206a(context, (String[]) f29778J.toArray(new String[0]));
    }

    /* renamed from: R */
    static void m33211R(final Activity activity, final Runnable runnable) {
        LocationRequest locationRequestCreate = LocationRequest.create();
        locationRequestCreate.setPriority(100);
        Task<LocationSettingsResponse> taskCheckLocationSettings = LocationServices.getSettingsClient(activity).checkLocationSettings(new LocationSettingsRequest.Builder().addLocationRequest(locationRequestCreate).build());
        taskCheckLocationSettings.addOnSuccessListener(new OnSuccessListener() { // from class: o.u3d
            @Override // com.google.android.gms.tasks.OnSuccessListener
            public final void onSuccess(Object obj) {
                runnable.run();
            }
        });
        taskCheckLocationSettings.addOnFailureListener(new OnFailureListener() { // from class: o.v3d
            @Override // com.google.android.gms.tasks.OnFailureListener
            public final void onFailure(Exception exc) {
                j4d.m33219g(runnable, activity, exc);
            }
        });
    }

    /* renamed from: S */
    static boolean m33212S(Context context) {
        return ((Boolean) Optional.ofNullable(SuperfoneApplication.f225c.m127c()).map(new Function() { // from class: o.a4d
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return Boolean.valueOf(((Prefs) obj).m3236X());
            }
        }).orElse(Boolean.FALSE)).booleanValue() && f0(context);
    }

    /* renamed from: T */
    static boolean m33213T(Context context) {
        return m33210Q(context);
    }

    /* renamed from: U */
    static List m33214U() {
        return Build.VERSION.SDK_INT >= 33 ? h0("android.permission.READ_MEDIA_AUDIO", "android.permission.READ_MEDIA_IMAGES", "android.permission.READ_MEDIA_VIDEO") : h0("android.permission.READ_EXTERNAL_STORAGE");
    }

    static boolean a0(Context context) {
        return ((Boolean) Optional.ofNullable(SuperfoneApplication.f225c.m127c()).map(new p3d()).orElse(Boolean.FALSE)).booleanValue() && m33207N(context);
    }

    static void c0(final Fragment fragment) {
        if (fragment.getActivity() == null || Settings.canDrawOverlays(fragment.requireActivity()) || fragment.getContext() == null) {
            return;
        }
        new nta(fragment.getContext()).mo3873f(fragment.getString(hae.allow_to_draw_over_app)).mo3878k("Allow", new DialogInterface.OnClickListener() { // from class: o.w3d
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                j4d.r0(fragment);
            }
        }).mo3874g("Deny", new DialogInterface.OnClickListener() { // from class: o.x3d
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                j4d.m33206M(fragment, false);
            }
        }).mo3869b(true).mo3876i(new DialogInterface.OnCancelListener() { // from class: o.y3d
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                j4d.m33202I(dialogInterface);
            }
        }).m3880m();
    }

    static boolean d0(Context context) {
        return ((Boolean) Optional.ofNullable(SuperfoneApplication.f225c.m127c()).map(new Function() { // from class: o.s3d
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return Boolean.valueOf(((Prefs) obj).q0());
            }
        }).orElse(Boolean.TRUE)).booleanValue();
    }

    static boolean e0(Fragment fragment, boolean z) {
        m33197C(15435, z);
        return true;
    }

    static boolean f0(Context context) {
        return AbstractC18784a.m60206a(context, (String[]) f29771B.toArray(new String[0]));
    }

    /* renamed from: g */
    static /* synthetic */ void m33219g(Runnable runnable, Activity activity, Exception exc) {
        if ((exc instanceof ApiException) && ((ApiException) exc).getStatusCode() == 6) {
            try {
                f29781O.put(String.valueOf(16421), runnable);
                ((ResolvableApiException) exc).startResolutionForResult(activity, 16421);
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: h */
    static List m33220h() {
        return Build.VERSION.SDK_INT >= 33 ? h0("android.permission.READ_CALL_LOG", "android.permission.READ_PHONE_STATE", "android.permission.POST_NOTIFICATIONS") : h0("android.permission.READ_CALL_LOG", "android.permission.READ_PHONE_STATE");
    }

    static List h0(String... strArr) {
        return Arrays.asList(strArr);
    }

    /* renamed from: i */
    static boolean m33221i() {
        return ((Boolean) Optional.ofNullable(SuperfoneApplication.f225c.m127c()).map(new p3d()).orElse(Boolean.TRUE)).booleanValue();
    }

    static boolean i0(Fragment fragment, boolean z) {
        if (!z || m33203J(fragment.getContext())) {
            m33197C(15425, z);
            return true;
        }
        m33232u(fragment);
        return false;
    }

    static /* synthetic */ void j0(Set set, Prefs prefs) {
        if (prefs.m3233U()) {
            set.addAll(f29776G);
        }
        if (prefs.m3236X()) {
            set.addAll(f29771B);
        }
        if (Build.VERSION.SDK_INT >= 33) {
            set.addAll(f29779K);
        }
    }

    /* renamed from: k */
    static boolean m33223k(Context context) {
        return ((Boolean) Optional.ofNullable(SuperfoneApplication.f225c.m127c()).map(new Function() { // from class: o.r3d
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return Boolean.valueOf(((Prefs) obj).m3243e());
            }
        }).orElse(Boolean.FALSE)).booleanValue() && m33203J(context);
    }

    static boolean k0(Context context) {
        AppCompatActivity appCompatActivity = (AppCompatActivity) context;
        List list = f29775F;
        return AbstractC18784a.m60213h(appCompatActivity, list) && AbstractC18784a.m60212g(appCompatActivity, (String) list.get(0));
    }

    /* renamed from: l */
    static boolean m33224l(Context context) {
        return m33208O(context);
    }

    static boolean l0(Fragment fragment, boolean z) {
        boolean zO0 = o0(fragment.getContext());
        m33197C(15434, z);
        if (zO0 || !z || m33207N(fragment.getContext())) {
            return true;
        }
        c0(fragment);
        return false;
    }

    /* renamed from: m */
    static Map m33225m() {
        HashMap map = new HashMap();
        map.put("android.permission.READ_CALL_LOG", Arrays.asList(15421, 15423, 15424));
        map.put("android.permission.READ_EXTERNAL_STORAGE", Arrays.asList(15422));
        map.put("android.permission.READ_PHONE_STATE", Arrays.asList(15423));
        map.put("android.permission.CALL_PHONE", Arrays.asList(15424, 15423));
        map.put(LocationConstants.ANDROID_FINE_LOCATION_PERMISSION_STRING, Arrays.asList(15425));
        map.put(LocationConstants.ANDROID_COARSE_LOCATION_PERMISSION_STRING, Arrays.asList(15425));
        map.put("android.permission.SYSTEM_ALERT_WINDOW", Arrays.asList(15426));
        map.put("android.permission.READ_CONTACTS", Arrays.asList(15427));
        map.put("android.permission.RECORD_AUDIO", Arrays.asList(16425));
        int i = Build.VERSION.SDK_INT;
        if (i < 30) {
            map.put("android.permission.WRITE_EXTERNAL_STORAGE", Arrays.asList(15429));
        }
        map.put("android.permission.CAMERA", Arrays.asList(15429));
        if (i >= 33) {
            map.put("android.permission.POST_NOTIFICATIONS", Arrays.asList(15431, 15423));
        } else {
            map.put("android.permission.POST_NOTIFICATIONS", Arrays.asList(15431));
        }
        if (i >= 33) {
            map.put("android.permission.READ_MEDIA_IMAGES", Arrays.asList(15422));
            map.put("android.permission.READ_MEDIA_AUDIO", Arrays.asList(15422));
            map.put("android.permission.READ_MEDIA_VIDEO", Arrays.asList(15422));
        } else {
            map.put("android.permission.READ_EXTERNAL_STORAGE", Arrays.asList(15422));
        }
        return map;
    }

    static boolean m0(Fragment fragment, boolean z) {
        if (!z || f0(fragment.getContext())) {
            m33197C(15423, z);
            return true;
        }
        m33196B(fragment);
        return false;
    }

    /* renamed from: n */
    static boolean m33226n(Fragment fragment, boolean z) {
        if (!z || m33203J(fragment.getContext())) {
            m33197C(15433, z);
            return true;
        }
        m33195A(fragment);
        return false;
    }

    static boolean o0(Context context) {
        return ((Boolean) Optional.ofNullable(SuperfoneApplication.f225c.m127c()).map(new Function() { // from class: o.c4d
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return Boolean.valueOf(((Prefs) obj).m3233U());
            }
        }).orElse(Boolean.FALSE)).booleanValue();
    }

    /* renamed from: p */
    static String[] m33228p() {
        final HashSet hashSet = new HashSet();
        if (Build.VERSION.SDK_INT >= 26) {
            hashSet.add("android.permission.READ_PHONE_NUMBERS");
        }
        Optional.ofNullable(SuperfoneApplication.f225c.m127c()).ifPresent(new Consumer() { // from class: o.f4d
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                j4d.j0(hashSet, (Prefs) obj);
            }
        });
        return (String[]) hashSet.toArray(new String[0]);
    }

    static boolean p0(Context context) {
        return o0(context) && !m33207N(context);
    }

    /* renamed from: q */
    static /* synthetic */ void m33229q(int i, boolean z, Prefs prefs) {
        switch (i) {
            case 15421:
                Optional.ofNullable(SuperfoneApplication.f225c.m128d()).ifPresent(new Consumer() { // from class: o.e4d
                    @Override // java.util.function.Consumer
                    public final void accept(Object obj) {
                        ((itf) obj).g0();
                    }
                });
                prefs.x1(z);
                break;
            case 15422:
                prefs.N0(z);
                break;
            case 15423:
                Optional.ofNullable(SuperfoneApplication.f225c.m128d()).ifPresent(new Consumer() { // from class: o.e4d
                    @Override // java.util.function.Consumer
                    public final void accept(Object obj) {
                        ((itf) obj).g0();
                    }
                });
                prefs.A1(z);
                break;
            case 15425:
                prefs.F0(z);
                break;
            case 15426:
                prefs.B1(z);
                break;
            case 15428:
                prefs.x1(z);
                break;
            case 15430:
                prefs.Z0(z);
                break;
            case 15432:
                prefs.i1(z);
                break;
            case 15433:
                prefs.J0(z);
                break;
            case 15434:
                prefs.p1(z);
                break;
            case 15435:
                prefs.T1(z);
                break;
        }
    }

    static boolean q0(Context context) {
        AppCompatActivity appCompatActivity = (AppCompatActivity) context;
        List list = f29772C;
        return AbstractC18784a.m60213h(appCompatActivity, list) && AbstractC18784a.m60212g(appCompatActivity, (String) list.get(0));
    }

    static void r0(Fragment fragment) {
        Intent intent = new Intent("android.settings.action.MANAGE_OVERLAY_PERMISSION", Uri.parse(String.format("package:%s", "ai.salesmax")));
        if (fragment.getActivity() != null) {
            fragment.getActivity().startActivityIfNeeded(intent, 15426);
        }
    }

    static void s0(Fragment fragment) {
        AbstractC18784a.m60210e(new C18785b.b(fragment, 15422, (String[]) f29770A.toArray(new String[0])).m60222b(fragment.getString(hae.read_external_storage_permission_rationale)).m60223c(qae.CustomAlertDialogTheme).m60221a());
    }

    /* renamed from: t */
    static void m33231t(Context context, String[] strArr) {
        final HashSet hashSet = new HashSet();
        for (String str : strArr) {
            if (!AbstractC18784a.m60206a(context, str)) {
                Optional.ofNullable((List) f29782P.getOrDefault(str, Collections.emptyList())).ifPresent(new Consumer() { // from class: o.g4d
                    @Override // java.util.function.Consumer
                    public final void accept(Object obj) {
                        hashSet.addAll((List) obj);
                    }
                });
            }
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            m33197C(((Integer) it.next()).intValue(), false);
        }
    }

    static List t0() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("android.permission.CAMERA");
        int i = Build.VERSION.SDK_INT;
        if (i >= 33) {
            arrayList.add("android.permission.READ_MEDIA_IMAGES");
        } else if (i < 29) {
            arrayList.add("android.permission.WRITE_EXTERNAL_STORAGE");
            arrayList.add("android.permission.READ_EXTERNAL_STORAGE");
        }
        return arrayList;
    }

    /* renamed from: u */
    static void m33232u(Fragment fragment) {
        AbstractC18784a.m60210e(new C18785b.b(fragment, 15425, (String[]) f29773D.toArray(new String[0])).m60222b(fragment.getString(hae.track_locations_permission_rationale)).m60223c(qae.CustomAlertDialogTheme).m60221a());
    }

    /* renamed from: v */
    static boolean m33233v(Context context) {
        return AbstractC18784a.m60206a(context, (String[]) f29770A.toArray(new String[0]));
    }

    static boolean v0(Fragment fragment, boolean z) {
        m33197C(15432, z);
        return true;
    }

    /* renamed from: w */
    static boolean m33234w(Context context) {
        return ((Boolean) Optional.ofNullable(SuperfoneApplication.f225c.m127c()).map(new Function() { // from class: o.h4d
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return Boolean.valueOf(((Prefs) obj).m3247i());
            }
        }).orElse(Boolean.FALSE)).booleanValue() && m33203J(context);
    }

    /* renamed from: x */
    static boolean m33235x(Context context) {
        return ((Boolean) Optional.ofNullable(SuperfoneApplication.f225c.m127c()).map(new Function() { // from class: o.i4d
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return Boolean.valueOf(((Prefs) obj).m3219G());
            }
        }).orElse(Boolean.TRUE)).booleanValue();
    }

    /* renamed from: y */
    static boolean m33236y(Fragment fragment, boolean z) {
        if (!z || m33233v(fragment.getContext())) {
            m33197C(15422, z);
            return true;
        }
        s0(fragment);
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // pub.devrel.easypermissions.AbstractC18784a.a
    /* renamed from: a */
    default void mo33237a(int i, List list) {
        String str;
        String str2;
        m33197C(i, false);
        if (list.contains("android.permission.READ_CALL_LOG")) {
            str2 = "Salesmax needs access to your call logs to automatically track and log your business calls. This helps you manage your client interactions, analyze call data, and maintain accurate records of your communications.";
            str = "Read Call Log Permission";
        } else {
            str = "Permission Required";
            str2 = "Salesmax needs these permissions for some of the features. Please enable them in the app settings if you need those features.";
        }
        if (!(this instanceof Activity) || list.contains("android.permission.CALL_PHONE")) {
            return;
        }
        Activity activity = (Activity) this;
        if (AbstractC18784a.m60213h(activity, list)) {
            new AppSettingsDialog.C18783b(activity).m60205e(str).m60204d(str2).m60203c("Settings").m60202b("Cancel").m60201a().m60196d();
        }
    }

    @Override // pub.devrel.easypermissions.AbstractC18784a.b
    /* renamed from: d */
    default void mo33238d(int i) {
    }

    @Override // pub.devrel.easypermissions.AbstractC18784a.b
    /* renamed from: e */
    default void mo33239e(int i) {
    }

    @Override // pub.devrel.easypermissions.AbstractC18784a.a
    /* renamed from: f */
    default void mo33240f(int i, List list) {
        m33197C(i, true);
    }

    default void n0(int i, String[] strArr, int[] iArr) {
        AbstractC18784a.m60209d(i, strArr, iArr, this);
    }

    default void u0(int i) {
        if (i == 16421) {
            Optional.ofNullable((Runnable) f29781O.remove(String.valueOf(i))).ifPresent(new Consumer() { // from class: o.b4d
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    ((Runnable) obj).run();
                }
            });
        }
    }
}
