package p004e;

import android.content.Intent;
import android.content.IntentSender;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.amplifyframework.storage.s3.transfer.RunnableC1255b;
import com.sun.mail.util.AbstractC1452a;
import java.util.Arrays;
import java.util.HashSet;
import kotlin.jvm.internal.AbstractC4154l;
import nf.C5047i;
import p007h.AbstractC2757i;
import p007h.C2759k;
import p008i.AbstractC3064a;
import q5.InterfaceC6108a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: e.k */
/* loaded from: classes.dex */
public final class C1876k extends AbstractC2757i {

    /* renamed from: h */
    public final /* synthetic */ AbstractActivityC1878m f8890h;

    public C1876k(AbstractActivityC1878m abstractActivityC1878m) {
        this.f8890h = abstractActivityC1878m;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p007h.AbstractC2757i
    /* renamed from: b */
    public final void mo5506b(int i10, AbstractC3064a contract, Object obj) {
        Bundle bundleExtra;
        int i11;
        AbstractC4154l.m8923f(contract, "contract");
        AbstractActivityC1878m abstractActivityC1878m = this.f8890h;
        C5047i c5047iMo1126b = contract.mo1126b(abstractActivityC1878m, obj);
        if (c5047iMo1126b != null) {
            new Handler(Looper.getMainLooper()).post(new RunnableC1255b(this, i10, c5047iMo1126b, 2));
            return;
        }
        Intent intentMo1125a = contract.mo1125a(abstractActivityC1878m, obj);
        if (intentMo1125a.getExtras() != null) {
            Bundle extras = intentMo1125a.getExtras();
            AbstractC4154l.m8920c(extras);
            if (extras.getClassLoader() == null) {
                intentMo1125a.setExtrasClassLoader(abstractActivityC1878m.getClassLoader());
            }
        }
        if (intentMo1125a.hasExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) {
            bundleExtra = intentMo1125a.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
            intentMo1125a.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
        } else {
            bundleExtra = null;
        }
        Bundle bundle = bundleExtra;
        if ("androidx.activity.result.contract.action.REQUEST_PERMISSIONS".equals(intentMo1125a.getAction())) {
            String[] stringArrayExtra = intentMo1125a.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
            if (stringArrayExtra == null) {
                stringArrayExtra = new String[0];
            }
            HashSet hashSet = new HashSet();
            for (int i12 = 0; i12 < stringArrayExtra.length; i12++) {
                if (TextUtils.isEmpty(stringArrayExtra[i12])) {
                    throw new IllegalArgumentException(AbstractC1452a.m4564k(new StringBuilder("Permission request for permissions "), Arrays.toString(stringArrayExtra), " must not contain null or empty values"));
                }
                if (Build.VERSION.SDK_INT < 33 && TextUtils.equals(stringArrayExtra[i12], "android.permission.POST_NOTIFICATIONS")) {
                    hashSet.add(Integer.valueOf(i12));
                }
            }
            int size = hashSet.size();
            String[] strArr = size > 0 ? new String[stringArrayExtra.length - size] : stringArrayExtra;
            if (size > 0) {
                if (size == stringArrayExtra.length) {
                    return;
                }
                int i13 = 0;
                for (int i14 = 0; i14 < stringArrayExtra.length; i14++) {
                    if (!hashSet.contains(Integer.valueOf(i14))) {
                        strArr[i13] = stringArrayExtra[i14];
                        i13++;
                    }
                }
            }
            if (abstractActivityC1878m instanceof InterfaceC6108a) {
                ((InterfaceC6108a) abstractActivityC1878m).validateRequestPermissionsRequestCode(i10);
            }
            abstractActivityC1878m.requestPermissions(stringArrayExtra, i10);
            return;
        }
        if (!"androidx.activity.result.contract.action.INTENT_SENDER_REQUEST".equals(intentMo1125a.getAction())) {
            abstractActivityC1878m.startActivityForResult(intentMo1125a, i10, bundle);
            return;
        }
        C2759k c2759k = (C2759k) intentMo1125a.getParcelableExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST");
        try {
            AbstractC4154l.m8920c(c2759k);
            i11 = i10;
            try {
                abstractActivityC1878m.startIntentSenderForResult(c2759k.f15315a, i11, c2759k.f15316b, c2759k.f15317c, c2759k.f15318d, 0, bundle);
            } catch (IntentSender.SendIntentException e2) {
                e = e2;
                new Handler(Looper.getMainLooper()).post(new RunnableC1255b(this, i11, e, 3));
            }
        } catch (IntentSender.SendIntentException e10) {
            e = e10;
            i11 = i10;
        }
    }
}
