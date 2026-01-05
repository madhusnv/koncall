package androidx.fragment.app;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AbstractC4154l;
import nf.C5047i;
import p007h.C2749a;
import p007h.C2759k;
import p008i.AbstractC3064a;
import qw.C6361k;
import r5.AbstractC6468c;
import rw.AbstractC6662l;
import rw.AbstractC6664n;
import rw.AbstractC6674x;
import rw.C6669s;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class d1 extends AbstractC3064a {

    /* renamed from: a */
    public final /* synthetic */ int f2490a;

    public /* synthetic */ d1(int i10) {
        this.f2490a = i10;
    }

    @Override // p008i.AbstractC3064a
    /* renamed from: a */
    public final Intent mo1125a(Context context, Object obj) {
        Bundle bundleExtra;
        switch (this.f2490a) {
            case 0:
                C2759k c2759k = (C2759k) obj;
                Intent intent = new Intent("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST");
                Intent intent2 = c2759k.f15316b;
                if (intent2 != null && (bundleExtra = intent2.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) != null) {
                    intent.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundleExtra);
                    intent2.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
                    if (intent2.getBooleanExtra("androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE", false)) {
                        c2759k = new C2759k(c2759k.f15315a, null, c2759k.f15317c, c2759k.f15318d);
                    }
                }
                intent.putExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST", c2759k);
                if (j1.m1152K(2)) {
                    intent.toString();
                }
                return intent;
            case 1:
                String input = (String) obj;
                AbstractC4154l.m8923f(input, "input");
                Intent intentPutExtra = new Intent("android.intent.action.CREATE_DOCUMENT").setType("text/csv").putExtra("android.intent.extra.TITLE", input);
                AbstractC4154l.m8922e(intentPutExtra, "Intent(Intent.ACTION_CRE…ntent.EXTRA_TITLE, input)");
                return intentPutExtra;
            case 2:
                String[] input2 = (String[]) obj;
                AbstractC4154l.m8923f(input2, "input");
                Intent type = new Intent("android.intent.action.OPEN_DOCUMENT").putExtra("android.intent.extra.MIME_TYPES", input2).setType("*/*");
                AbstractC4154l.m8922e(type, "Intent(Intent.ACTION_OPE…          .setType(\"*/*\")");
                return type;
            case 3:
                Uri uri = (Uri) obj;
                Intent intent3 = new Intent("android.intent.action.OPEN_DOCUMENT_TREE");
                if (Build.VERSION.SDK_INT >= 26 && uri != null) {
                    intent3.putExtra("android.provider.extra.INITIAL_URI", uri);
                }
                return intent3;
            case 4:
                String[] input3 = (String[]) obj;
                AbstractC4154l.m8923f(input3, "input");
                Intent intentPutExtra2 = new Intent("androidx.activity.result.contract.action.REQUEST_PERMISSIONS").putExtra("androidx.activity.result.contract.extra.PERMISSIONS", input3);
                AbstractC4154l.m8922e(intentPutExtra2, "Intent(ACTION_REQUEST_PE…EXTRA_PERMISSIONS, input)");
                return intentPutExtra2;
            case 5:
                String input4 = (String) obj;
                AbstractC4154l.m8923f(input4, "input");
                Intent intentPutExtra3 = new Intent("androidx.activity.result.contract.action.REQUEST_PERMISSIONS").putExtra("androidx.activity.result.contract.extra.PERMISSIONS", new String[]{input4});
                AbstractC4154l.m8922e(intentPutExtra3, "Intent(ACTION_REQUEST_PE…EXTRA_PERMISSIONS, input)");
                return intentPutExtra3;
            case 6:
                Intent input5 = (Intent) obj;
                AbstractC4154l.m8923f(input5, "input");
                return input5;
            default:
                C2759k input6 = (C2759k) obj;
                AbstractC4154l.m8923f(input6, "input");
                Intent intentPutExtra4 = new Intent("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST").putExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST", input6);
                AbstractC4154l.m8922e(intentPutExtra4, "Intent(ACTION_INTENT_SEN…NT_SENDER_REQUEST, input)");
                return intentPutExtra4;
        }
    }

    @Override // p008i.AbstractC3064a
    /* renamed from: b */
    public C5047i mo1126b(Context context, Object obj) {
        switch (this.f2490a) {
            case 1:
                String input = (String) obj;
                AbstractC4154l.m8923f(input, "input");
                return null;
            case 2:
                String[] input2 = (String[]) obj;
                AbstractC4154l.m8923f(input2, "input");
                return null;
            case 3:
                return null;
            case 4:
                String[] input3 = (String[]) obj;
                AbstractC4154l.m8923f(input3, "input");
                if (input3.length == 0) {
                    return new C5047i(21, C6669s.f31944a);
                }
                for (String str : input3) {
                    if (AbstractC6468c.m12450a(context, str) != 0) {
                        return null;
                    }
                }
                int iM12776d = AbstractC6674x.m12776d(input3.length);
                if (iM12776d < 16) {
                    iM12776d = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(iM12776d);
                for (String str2 : input3) {
                    linkedHashMap.put(str2, Boolean.TRUE);
                }
                return new C5047i(21, linkedHashMap);
            case 5:
                String input4 = (String) obj;
                AbstractC4154l.m8923f(input4, "input");
                if (AbstractC6468c.m12450a(context, input4) != 0) {
                    return null;
                }
                return new C5047i(21, Boolean.TRUE);
            default:
                return super.mo1126b(context, obj);
        }
    }

    @Override // p008i.AbstractC3064a
    /* renamed from: c */
    public final Object mo1127c(Intent intent, int i10) {
        switch (this.f2490a) {
            case 1:
                if (i10 != -1) {
                    intent = null;
                }
                if (intent != null) {
                    break;
                }
                break;
            case 2:
                if (i10 != -1) {
                    intent = null;
                }
                if (intent != null) {
                    break;
                }
                break;
            case 3:
                if (i10 != -1) {
                    intent = null;
                }
                if (intent != null) {
                    break;
                }
                break;
            case 4:
                if (i10 == -1 && intent != null) {
                    String[] stringArrayExtra = intent.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
                    int[] intArrayExtra = intent.getIntArrayExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS");
                    if (intArrayExtra != null && stringArrayExtra != null) {
                        ArrayList arrayList = new ArrayList(intArrayExtra.length);
                        for (int i11 : intArrayExtra) {
                            arrayList.add(Boolean.valueOf(i11 == 0));
                        }
                        ArrayList arrayListM12729s = AbstractC6662l.m12729s(stringArrayExtra);
                        Iterator it = arrayListM12729s.iterator();
                        Iterator it2 = arrayList.iterator();
                        ArrayList arrayList2 = new ArrayList(Math.min(AbstractC6664n.m12768r(arrayListM12729s, 10), AbstractC6664n.m12768r(arrayList, 10)));
                        while (it.hasNext() && it2.hasNext()) {
                            arrayList2.add(new C6361k(it.next(), it2.next()));
                        }
                        break;
                    }
                }
                break;
            case 5:
                if (intent == null || i10 != -1) {
                    break;
                } else {
                    int[] intArrayExtra2 = intent.getIntArrayExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS");
                    boolean z6 = false;
                    if (intArrayExtra2 != null) {
                        int length = intArrayExtra2.length;
                        int i12 = 0;
                        while (true) {
                            if (i12 < length) {
                                if (intArrayExtra2[i12] == 0) {
                                    z6 = true;
                                } else {
                                    i12++;
                                }
                            }
                        }
                    }
                    break;
                }
                break;
        }
        return new C2749a(intent, i10);
    }
}
